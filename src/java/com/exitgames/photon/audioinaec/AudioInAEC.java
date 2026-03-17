package com.exitgames.photon.audioinaec;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.exitgames.photon.audioinaec.AppRTCAudioManager;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class AudioInAEC {
    public static final int format = 2;
    private Activity activity;
    private AcousticEchoCanceler aec;
    private AutomaticGainControl agc;
    private AppRTCAudioManager appRTCAudioManager;
    private AudioChangeReceiver audioChangeReceiver;
    private AudioManager audioManager;
    private AudioRecord audioRecord;
    volatile short[] buf;
    private volatile boolean exit;
    private NoiseSuppressor ns;
    private final String TAG = "[PV] [AI]";
    private int[] audioDvicePriority = {0, 14, 16, 17, 18, 20, 21, 25, 19, 5, 6, 9, 10, 1, 15, 24, 2, 13, 3, 4, 11, 12, 22, 23, 7, 8, 26, 27};

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    interface DataCallback {
        void OnData();

        void OnStop();
    }

    public void Reset() {
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    private class AudioChangeReceiver extends BroadcastReceiver {
        private AudioChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Log.i("[PV] [AI]", "updateAudioDevice: AudioChangeReceiver action: " + intent.getAction());
            new Timer().schedule(new TimerTask() { // from class: com.exitgames.photon.audioinaec.AudioInAEC.AudioChangeReceiver.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    AudioInAEC.this.updateAudioDevice();
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAudioDevice() {
        List<AudioDeviceInfo> availableCommunicationDevices = this.audioManager.getAvailableCommunicationDevices();
        Log.i("[PV] [AI]", "updateAudioDevice: devices:");
        AudioDeviceInfo audioDeviceInfo = null;
        int i = -1;
        for (AudioDeviceInfo audioDeviceInfo2 : availableCommunicationDevices) {
            Log.i("[PV] [AI]", "updateAudioDevice:     " + ((Object) audioDeviceInfo2.getProductName()) + ", addr: " + audioDeviceInfo2.getAddress() + ", type: " + audioDeviceInfo2.getType());
            int i2 = 0;
            while (true) {
                if (i2 >= this.audioDvicePriority.length) {
                    break;
                }
                if (audioDeviceInfo2.getType() == this.audioDvicePriority[i2] && i < i2) {
                    audioDeviceInfo = audioDeviceInfo2;
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        if (audioDeviceInfo != null) {
            Log.i("[PV] [AI]", "updateAudioDevice: setting audio device to " + ((Object) audioDeviceInfo.getProductName()) + ", addr: " + audioDeviceInfo.getAddress() + ", type: " + audioDeviceInfo.getType());
            try {
                this.audioManager.setCommunicationDevice(audioDeviceInfo);
            } catch (IllegalArgumentException e) {
                Log.e("[PV] [AI]", "updateAudioDevice: invalid device: " + e);
            }
        }
    }

    public synchronized boolean SetBuffer(short[] sArr) {
        Log.i("[PV] [AI]", "AudioRecord buffer set, size: " + sArr.length);
        this.buf = sArr;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAudioManagerDevicesChanged(AppRTCAudioManager.AudioDevice audioDevice, Set<AppRTCAudioManager.AudioDevice> set) {
        Log.d("[PV] [AI]", "onAudioManagerDevicesChanged: " + set + ", selected: " + audioDevice);
    }

    public boolean Start(Activity activity, final DataCallback dataCallback, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.activity = activity;
        this.audioManager = (AudioManager) activity.getSystemService("audio");
        if (Build.VERSION.SDK_INT >= 31) {
            Log.d("[PV] [AI]", "Start: SDK >= 31, using BroadcastReceiver");
            this.audioChangeReceiver = new AudioChangeReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            activity.getApplicationContext().registerReceiver(this.audioChangeReceiver, intentFilter);
            this.audioManager.setMode(3);
            updateAudioDevice();
        } else {
            Log.d("[PV] [AI]", "Start: SDK < 31, using AudioManager");
            this.appRTCAudioManager = AppRTCAudioManager.create(activity.getApplicationContext());
            Log.d("[PV] [AI]", "Starting the audio manager...");
            this.appRTCAudioManager.start(new AppRTCAudioManager.AudioManagerEvents() { // from class: com.exitgames.photon.audioinaec.AudioInAEC.1
                @Override // com.exitgames.photon.audioinaec.AppRTCAudioManager.AudioManagerEvents
                public void onAudioDeviceChanged(AppRTCAudioManager.AudioDevice audioDevice, Set<AppRTCAudioManager.AudioDevice> set) {
                    AudioInAEC.this.onAudioManagerDevicesChanged(audioDevice, set);
                }
            });
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(i2 == 1 ? 16 : 12);
        if (i != 0) {
            channelMask.setSampleRate(i);
        }
        this.audioRecord = new AudioRecord.Builder().setAudioSource(7).setAudioFormat(channelMask.build()).setBufferSizeInBytes(i3).build();
        Log.i("[PV] [AI]", "AudioRecord created: " + this.audioRecord + ": samplingRate: " + this.audioRecord.getSampleRate() + "/" + i + ", channels: " + i2 + ", recordBufSizeBytes: " + i3 + ", enableAEC: " + z + "/" + AcousticEchoCanceler.isAvailable() + ", enableAGC: " + z2 + "/" + AutomaticGainControl.isAvailable() + ", enableNS: " + z3 + "/" + NoiseSuppressor.isAvailable());
        if (!AcousticEchoCanceler.isAvailable()) {
            Log.i("[PV] [AI]", "AcousticEchoCanceler is not available");
        } else if (z) {
            AcousticEchoCanceler acousticEchoCancelerCreate = AcousticEchoCanceler.create(this.audioRecord.getAudioSessionId());
            this.aec = acousticEchoCancelerCreate;
            Log.i("[PV] [AI]", "AcousticEchoCanceler created: " + this.aec + ", setEnabled res: " + this.aec.setEnabled(z) + ": " + acousticEchoCancelerCreate.getEnabled() + " -> " + this.aec.getEnabled());
        } else {
            Log.i("[PV] [AI]", "AcousticEchoCanceler is available but not created");
        }
        if (!AutomaticGainControl.isAvailable()) {
            Log.i("[PV] [AI]", "AutomaticGainControl is not available");
        } else if (z2) {
            AutomaticGainControl automaticGainControlCreate = AutomaticGainControl.create(this.audioRecord.getAudioSessionId());
            this.agc = automaticGainControlCreate;
            Log.i("[PV] [AI]", "AutomaticGainControl created: " + this.agc + ", setEnabled res: " + this.agc.setEnabled(z2) + ": " + automaticGainControlCreate.getEnabled() + " -> " + this.agc.getEnabled());
        } else {
            Log.i("[PV] [AI]", "AutomaticGainControl is available but not created");
        }
        if (!NoiseSuppressor.isAvailable()) {
            Log.i("[PV] [AI]", "NoiseSuppressor is not available");
        } else if (z3) {
            NoiseSuppressor noiseSuppressorCreate = NoiseSuppressor.create(this.audioRecord.getAudioSessionId());
            this.ns = noiseSuppressorCreate;
            Log.i("[PV] [AI]", "NoiseSuppressor created: " + this.ns + ", setEnabled res: " + this.ns.setEnabled(z3) + ": " + noiseSuppressorCreate.getEnabled() + " -> " + this.ns.getEnabled());
        } else {
            Log.i("[PV] [AI]", "NoiseSuppressor is available but not created");
        }
        this.audioRecord.startRecording();
        new Thread(new Runnable() { // from class: com.exitgames.photon.audioinaec.AudioInAEC.2
            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(-19);
                Log.i("[PV] [AI]", "thread start");
                while (!AudioInAEC.this.exit) {
                    synchronized (this) {
                        if (AudioInAEC.this.buf != null) {
                            AudioInAEC.this.audioRecord.read(AudioInAEC.this.buf, 0, AudioInAEC.this.buf.length);
                            dataCallback.OnData();
                        }
                    }
                }
                AudioInAEC.this.audioRecord.stop();
                if (AudioInAEC.this.aec != null) {
                    AudioInAEC.this.aec.release();
                    AudioInAEC.this.aec = null;
                }
                if (AudioInAEC.this.agc != null) {
                    AudioInAEC.this.agc.release();
                    AudioInAEC.this.agc = null;
                }
                if (AudioInAEC.this.ns != null) {
                    AudioInAEC.this.ns.release();
                    AudioInAEC.this.ns = null;
                }
                AudioInAEC.this.audioRecord.release();
                AudioInAEC.this.audioRecord = null;
                dataCallback.OnStop();
                Log.i("[PV] [AI]", "thread stop");
            }
        }).start();
        return true;
    }

    public boolean Stop() throws InterruptedException {
        this.exit = true;
        while (this.audioRecord != null) {
            Thread.sleep(1L);
        }
        if (this.audioChangeReceiver != null) {
            this.activity.getApplicationContext().unregisterReceiver(this.audioChangeReceiver);
        }
        AppRTCAudioManager appRTCAudioManager = this.appRTCAudioManager;
        if (appRTCAudioManager != null) {
            appRTCAudioManager.stop();
        }
        return true;
    }

    public boolean AECIsAvailable() {
        return AcousticEchoCanceler.isAvailable();
    }

    public boolean AGCIsAvailable() {
        return AutomaticGainControl.isAvailable();
    }

    public boolean NSIsAvailable() {
        return NoiseSuppressor.isAvailable();
    }

    public int GetMinBufferSize(int i, int i2) {
        return AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, 2);
    }

    public int GetSampleRate() {
        return this.audioRecord.getSampleRate();
    }
}

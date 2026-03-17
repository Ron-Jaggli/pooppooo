package com.exitgames.photon.audioinaec;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.preference.PreferenceManager;
import android.util.Log;
import com.exitgames.photon.audioinaec.AppRTCBluetoothManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class AppRTCAudioManager {
    private static final String SPEAKERPHONE_AUTO = "auto";
    private static final String SPEAKERPHONE_FALSE = "false";
    private static final String SPEAKERPHONE_TRUE = "true";
    private static final String TAG = "[PV] [AI] AppRTCAudioManager";
    private AudioManagerState amState;
    private final Context apprtcContext;
    private AudioManager.OnAudioFocusChangeListener audioFocusChangeListener;
    private AudioManager audioManager;
    private AudioManagerEvents audioManagerEvents;
    private final AppRTCBluetoothManager bluetoothManager;
    private AudioDevice defaultAudioDevice;
    private boolean hasWiredHeadset;
    private AppRTCProximitySensor proximitySensor;
    private boolean savedIsMicrophoneMute;
    private boolean savedIsSpeakerPhoneOn;
    private AudioDevice selectedAudioDevice;
    private final String useSpeakerphone;
    private AudioDevice userSelectedAudioDevice;
    private BroadcastReceiver wiredHeadsetReceiver;
    private int savedAudioMode = -2;
    private Set<AudioDevice> audioDevices = new HashSet();

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    public enum AudioDevice {
        SPEAKER_PHONE,
        WIRED_HEADSET,
        EARPIECE,
        BLUETOOTH,
        NONE
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    public interface AudioManagerEvents {
        void onAudioDeviceChanged(AudioDevice audioDevice, Set<AudioDevice> set);
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    public enum AudioManagerState {
        UNINITIALIZED,
        PREINITIALIZED,
        RUNNING
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProximitySensorChangedState() {
        if (this.useSpeakerphone.equals(SPEAKERPHONE_AUTO) && this.audioDevices.size() == 2 && this.audioDevices.contains(AudioDevice.EARPIECE) && this.audioDevices.contains(AudioDevice.SPEAKER_PHONE)) {
            if (this.proximitySensor.sensorReportsNearState()) {
                setAudioDeviceInternal(AudioDevice.EARPIECE);
            } else {
                setAudioDeviceInternal(AudioDevice.SPEAKER_PHONE);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    private class WiredHeadsetReceiver extends BroadcastReceiver {
        private static final int HAS_MIC = 1;
        private static final int HAS_NO_MIC = 0;
        private static final int STATE_PLUGGED = 1;
        private static final int STATE_UNPLUGGED = 0;

        private WiredHeadsetReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("state", 0);
            Log.d(AppRTCAudioManager.TAG, "WiredHeadsetReceiver.onReceive" + AppRTCUtils.getThreadInfo() + ": a=" + intent.getAction() + ", s=" + (intExtra == 0 ? "unplugged" : "plugged") + ", m=" + (intent.getIntExtra("microphone", 0) == 1 ? "mic" : "no mic") + ", n=" + intent.getStringExtra("name") + ", sb=" + isInitialStickyBroadcast());
            AppRTCAudioManager.this.hasWiredHeadset = intExtra == 1;
            AppRTCAudioManager.this.updateAudioDeviceState();
        }
    }

    static AppRTCAudioManager create(Context context) {
        return new AppRTCAudioManager(context);
    }

    private AppRTCAudioManager(Context context) {
        Log.d(TAG, "ctor");
        ThreadUtils.checkIsOnMainThread();
        this.apprtcContext = context;
        this.audioManager = (AudioManager) context.getSystemService("audio");
        this.bluetoothManager = AppRTCBluetoothManager.create(context, this);
        this.wiredHeadsetReceiver = new WiredHeadsetReceiver();
        this.amState = AudioManagerState.UNINITIALIZED;
        PreferenceManager.getDefaultSharedPreferences(context);
        this.useSpeakerphone = SPEAKERPHONE_AUTO;
        Log.d(TAG, "useSpeakerphone: " + SPEAKERPHONE_AUTO);
        if (SPEAKERPHONE_AUTO.equals(SPEAKERPHONE_FALSE)) {
            this.defaultAudioDevice = AudioDevice.EARPIECE;
        } else {
            this.defaultAudioDevice = AudioDevice.SPEAKER_PHONE;
        }
        this.proximitySensor = AppRTCProximitySensor.create(context, new Runnable() { // from class: com.exitgames.photon.audioinaec.AppRTCAudioManager.1
            @Override // java.lang.Runnable
            public void run() {
                AppRTCAudioManager.this.onProximitySensorChangedState();
            }
        });
        Log.d(TAG, "defaultAudioDevice: " + this.defaultAudioDevice);
        AppRTCUtils.logDeviceInfo(TAG);
    }

    public void start(AudioManagerEvents audioManagerEvents) {
        Log.d(TAG, "start");
        ThreadUtils.checkIsOnMainThread();
        if (this.amState == AudioManagerState.RUNNING) {
            Log.e(TAG, "AudioManager is already active");
            return;
        }
        Log.d(TAG, "AudioManager starts...");
        this.audioManagerEvents = audioManagerEvents;
        this.amState = AudioManagerState.RUNNING;
        this.savedAudioMode = this.audioManager.getMode();
        this.savedIsSpeakerPhoneOn = this.audioManager.isSpeakerphoneOn();
        this.savedIsMicrophoneMute = this.audioManager.isMicrophoneMute();
        this.hasWiredHeadset = hasWiredHeadset();
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: com.exitgames.photon.audioinaec.AppRTCAudioManager.2
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public void onAudioFocusChange(int i) {
                String str;
                if (i == -3) {
                    str = "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
                } else if (i == -2) {
                    str = "AUDIOFOCUS_LOSS_TRANSIENT";
                } else if (i == -1) {
                    str = "AUDIOFOCUS_LOSS";
                } else if (i == 1) {
                    str = "AUDIOFOCUS_GAIN";
                } else if (i == 2) {
                    str = "AUDIOFOCUS_GAIN_TRANSIENT";
                } else if (i == 3) {
                    str = "AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK";
                } else if (i == 4) {
                    str = "AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE";
                } else {
                    str = "AUDIOFOCUS_INVALID";
                }
                Log.d(AppRTCAudioManager.TAG, "onAudioFocusChange: ".concat(str));
            }
        };
        this.audioFocusChangeListener = onAudioFocusChangeListener;
        if (this.audioManager.requestAudioFocus(onAudioFocusChangeListener, 0, 2) == 1) {
            Log.d(TAG, "Audio focus request granted for VOICE_CALL streams");
        } else {
            Log.e(TAG, "Audio focus request failed");
        }
        setMicrophoneMute(false);
        this.userSelectedAudioDevice = AudioDevice.NONE;
        this.selectedAudioDevice = AudioDevice.NONE;
        this.audioDevices.clear();
        this.bluetoothManager.start();
        updateAudioDeviceState();
        registerReceiver(this.wiredHeadsetReceiver, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        Log.d(TAG, "AudioManager started");
    }

    public void stop() {
        Log.d(TAG, "stop");
        ThreadUtils.checkIsOnMainThread();
        if (this.amState != AudioManagerState.RUNNING) {
            Log.e(TAG, "Trying to stop AudioManager in incorrect state: " + this.amState);
            return;
        }
        this.amState = AudioManagerState.UNINITIALIZED;
        unregisterReceiver(this.wiredHeadsetReceiver);
        this.bluetoothManager.stop();
        setSpeakerphoneOn(this.savedIsSpeakerPhoneOn);
        setMicrophoneMute(this.savedIsMicrophoneMute);
        this.audioManager.setMode(this.savedAudioMode);
        this.audioManager.abandonAudioFocus(this.audioFocusChangeListener);
        this.audioFocusChangeListener = null;
        Log.d(TAG, "Abandoned audio focus for VOICE_CALL streams");
        AppRTCProximitySensor appRTCProximitySensor = this.proximitySensor;
        if (appRTCProximitySensor != null) {
            appRTCProximitySensor.stop();
            this.proximitySensor = null;
        }
        this.audioManagerEvents = null;
        Log.d(TAG, "AudioManager stopped");
    }

    private void setAudioDeviceInternal(AudioDevice audioDevice) {
        Log.d(TAG, "setAudioDeviceInternal(device=" + audioDevice + ")");
        AppRTCUtils.assertIsTrue(this.audioDevices.contains(audioDevice));
        int i = AnonymousClass3.$SwitchMap$com$exitgames$photon$audioinaec$AppRTCAudioManager$AudioDevice[audioDevice.ordinal()];
        if (i == 1) {
            this.audioManager.setMode(3);
            setSpeakerphoneOn(true);
        } else if (i == 2) {
            this.audioManager.setMode(3);
            setSpeakerphoneOn(false);
        } else if (i == 3) {
            this.audioManager.setMode(0);
            setSpeakerphoneOn(false);
        } else if (i == 4) {
            this.audioManager.setMode(3);
            setSpeakerphoneOn(false);
        } else {
            Log.e(TAG, "Invalid audio device selection");
        }
        this.selectedAudioDevice = audioDevice;
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    /* JADX INFO: renamed from: com.exitgames.photon.audioinaec.AppRTCAudioManager$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$exitgames$photon$audioinaec$AppRTCAudioManager$AudioDevice;

        static {
            int[] iArr = new int[AudioDevice.values().length];
            $SwitchMap$com$exitgames$photon$audioinaec$AppRTCAudioManager$AudioDevice = iArr;
            try {
                iArr[AudioDevice.SPEAKER_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$exitgames$photon$audioinaec$AppRTCAudioManager$AudioDevice[AudioDevice.EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$exitgames$photon$audioinaec$AppRTCAudioManager$AudioDevice[AudioDevice.WIRED_HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$exitgames$photon$audioinaec$AppRTCAudioManager$AudioDevice[AudioDevice.BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public void setDefaultAudioDevice(AudioDevice audioDevice) {
        ThreadUtils.checkIsOnMainThread();
        int i = AnonymousClass3.$SwitchMap$com$exitgames$photon$audioinaec$AppRTCAudioManager$AudioDevice[audioDevice.ordinal()];
        if (i == 1) {
            this.defaultAudioDevice = audioDevice;
        } else if (i == 2) {
            if (hasEarpiece()) {
                this.defaultAudioDevice = audioDevice;
            } else {
                this.defaultAudioDevice = AudioDevice.SPEAKER_PHONE;
            }
        } else {
            Log.e(TAG, "Invalid default audio device selection");
        }
        Log.d(TAG, "setDefaultAudioDevice(device=" + this.defaultAudioDevice + ")");
        updateAudioDeviceState();
    }

    public void selectAudioDevice(AudioDevice audioDevice) {
        ThreadUtils.checkIsOnMainThread();
        if (!this.audioDevices.contains(audioDevice)) {
            Log.e(TAG, "Can not select " + audioDevice + " from available " + this.audioDevices);
        }
        this.userSelectedAudioDevice = audioDevice;
        updateAudioDeviceState();
    }

    public Set<AudioDevice> getAudioDevices() {
        ThreadUtils.checkIsOnMainThread();
        return Collections.unmodifiableSet(new HashSet(this.audioDevices));
    }

    public AudioDevice getSelectedAudioDevice() {
        ThreadUtils.checkIsOnMainThread();
        return this.selectedAudioDevice;
    }

    private void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.apprtcContext.registerReceiver(broadcastReceiver, intentFilter);
    }

    private void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        this.apprtcContext.unregisterReceiver(broadcastReceiver);
    }

    private void setSpeakerphoneOn(boolean z) {
        if (this.audioManager.isSpeakerphoneOn() == z) {
            return;
        }
        this.audioManager.setSpeakerphoneOn(z);
    }

    private void setMicrophoneMute(boolean z) {
        if (this.audioManager.isMicrophoneMute() == z) {
            return;
        }
        this.audioManager.setMicrophoneMute(z);
    }

    private boolean hasEarpiece() {
        return this.apprtcContext.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    @Deprecated
    private boolean hasWiredHeadset() {
        for (AudioDeviceInfo audioDeviceInfo : this.audioManager.getDevices(3)) {
            int type = audioDeviceInfo.getType();
            if (type == 3) {
                Log.d(TAG, "hasWiredHeadset: found wired headset");
                return true;
            }
            if (type == 11) {
                Log.d(TAG, "hasWiredHeadset: found USB audio device");
                return true;
            }
        }
        return false;
    }

    public void updateAudioDeviceState() {
        AudioDevice audioDevice;
        ThreadUtils.checkIsOnMainThread();
        Log.d(TAG, "--- updateAudioDeviceState: wired headset=" + this.hasWiredHeadset + ", BT state=" + this.bluetoothManager.getState());
        Log.d(TAG, "Device status: available=" + this.audioDevices + ", selected=" + this.selectedAudioDevice + ", user selected=" + this.userSelectedAudioDevice);
        if (this.bluetoothManager.getState() == AppRTCBluetoothManager.State.HEADSET_AVAILABLE || this.bluetoothManager.getState() == AppRTCBluetoothManager.State.HEADSET_UNAVAILABLE || this.bluetoothManager.getState() == AppRTCBluetoothManager.State.SCO_DISCONNECTING) {
            this.bluetoothManager.updateDevice();
        }
        HashSet hashSet = new HashSet();
        if (this.bluetoothManager.getState() == AppRTCBluetoothManager.State.SCO_CONNECTED || this.bluetoothManager.getState() == AppRTCBluetoothManager.State.SCO_CONNECTING || this.bluetoothManager.getState() == AppRTCBluetoothManager.State.HEADSET_AVAILABLE) {
            hashSet.add(AudioDevice.BLUETOOTH);
        }
        if (this.hasWiredHeadset) {
            hashSet.add(AudioDevice.WIRED_HEADSET);
        } else {
            hashSet.add(AudioDevice.SPEAKER_PHONE);
            if (hasEarpiece()) {
                hashSet.add(AudioDevice.EARPIECE);
            }
        }
        boolean z = true;
        boolean z2 = !this.audioDevices.equals(hashSet);
        this.audioDevices = hashSet;
        if (this.bluetoothManager.getState() == AppRTCBluetoothManager.State.HEADSET_UNAVAILABLE && this.userSelectedAudioDevice == AudioDevice.BLUETOOTH) {
            this.userSelectedAudioDevice = AudioDevice.NONE;
        }
        if (this.hasWiredHeadset && this.userSelectedAudioDevice == AudioDevice.SPEAKER_PHONE) {
            this.userSelectedAudioDevice = AudioDevice.WIRED_HEADSET;
        }
        if (!this.hasWiredHeadset && this.userSelectedAudioDevice == AudioDevice.WIRED_HEADSET) {
            this.userSelectedAudioDevice = AudioDevice.SPEAKER_PHONE;
        }
        boolean z3 = false;
        boolean z4 = this.bluetoothManager.getState() == AppRTCBluetoothManager.State.HEADSET_AVAILABLE && (this.userSelectedAudioDevice == AudioDevice.NONE || this.userSelectedAudioDevice == AudioDevice.BLUETOOTH);
        if ((this.bluetoothManager.getState() == AppRTCBluetoothManager.State.SCO_CONNECTED || this.bluetoothManager.getState() == AppRTCBluetoothManager.State.SCO_CONNECTING) && this.userSelectedAudioDevice != AudioDevice.NONE && this.userSelectedAudioDevice != AudioDevice.BLUETOOTH) {
            z3 = true;
        }
        if (this.bluetoothManager.getState() == AppRTCBluetoothManager.State.HEADSET_AVAILABLE || this.bluetoothManager.getState() == AppRTCBluetoothManager.State.SCO_CONNECTING || this.bluetoothManager.getState() == AppRTCBluetoothManager.State.SCO_CONNECTED) {
            Log.d(TAG, "Need BT audio: start=" + z4 + ", stop=" + z3 + ", BT state=" + this.bluetoothManager.getState());
        }
        if (z3) {
            this.bluetoothManager.stopScoAudio();
            this.bluetoothManager.updateDevice();
        }
        if (!z4 || z3 || this.bluetoothManager.startScoAudio()) {
            z = z2;
        } else {
            this.audioDevices.remove(AudioDevice.BLUETOOTH);
        }
        if (this.bluetoothManager.getState() == AppRTCBluetoothManager.State.SCO_CONNECTED) {
            audioDevice = AudioDevice.BLUETOOTH;
        } else if (this.hasWiredHeadset) {
            audioDevice = AudioDevice.WIRED_HEADSET;
        } else {
            audioDevice = this.defaultAudioDevice;
        }
        if (audioDevice != this.selectedAudioDevice || z) {
            setAudioDeviceInternal(audioDevice);
            Log.d(TAG, "New device status: available=" + this.audioDevices + ", selected=" + audioDevice);
            AudioManagerEvents audioManagerEvents = this.audioManagerEvents;
            if (audioManagerEvents != null) {
                audioManagerEvents.onAudioDeviceChanged(this.selectedAudioDevice, this.audioDevices);
            }
        }
        Log.d(TAG, "--- updateAudioDeviceState done");
    }
}

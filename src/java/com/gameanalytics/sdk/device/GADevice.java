package com.gameanalytics.sdk.device;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.WindowManager;
import androidx.core.content.ContextCompat;
import com.gameanalytics.sdk.GAPlatform;
import com.gameanalytics.sdk.GooglePlayServicesClient;
import com.gameanalytics.sdk.android.BuildConfig;
import com.gameanalytics.sdk.events.GAEvents;
import com.gameanalytics.sdk.logging.GALogger;
import com.gameanalytics.sdk.utilities.GAUtilities;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class GADevice {
    private static final String _buildPlatform = "android";
    private static String _gameEngineVersion = "";
    private static boolean _isHacked = false;
    private static boolean _isLimitedAdTracking = false;
    private static String _sdkGameEngineVersion = "";
    private static final String _sdkWrapperVersion = "android 6.6.0";
    private static final String _osVersion = fixOSVersion(Build.VERSION.RELEASE);
    private static final String _deviceModel = fixDeviceModel(Build.MODEL);
    private static final String _deviceManufacturer = Build.MANUFACTURER;
    private static String _gaid = "";
    private static String _oaid = "";
    private static boolean _lazySetGAID = true;
    private static boolean _lazySetOAID = true;
    private static String _writablepath = "";
    private static String _connectionType = "";
    private static String _bundleIdentifier = "";
    private static String _appVersion = "";
    private static int _appBuild = 0;
    private static String _appSignature = "";
    private static String _channelId = "";
    private static String _adIdSource = "";
    private static String _appSetId = "";
    private static boolean _lazySetAppSetId = true;
    public static boolean doTrackGAID = true;

    public static void reloadAdId() {
        _lazySetGAID = true;
        _gaid = "";
        _lazySetOAID = true;
        _oaid = "";
    }

    public static void setSdkGameEngineVersion(final String version) {
        _sdkGameEngineVersion = version;
    }

    public static void setGameEngineVersion(final String version) {
        _gameEngineVersion = version;
    }

    public static void setIsHacked(boolean hacked) {
        _isHacked = hacked;
    }

    public static void setWritableFilePath(final String path) {
        GALogger.d("Writable path set to: " + path);
        _writablepath = path;
    }

    public static void setIsLimitedAdTracking(boolean limitedAdTracking) {
        _isLimitedAdTracking = limitedAdTracking;
    }

    public static void setConnectionType(final String networkConnectionType) {
        _connectionType = networkConnectionType;
    }

    public static void setBundleId(final String bundleId) {
        _bundleIdentifier = bundleId;
    }

    public static void setAppVersion(final String appVersion) {
        _appVersion = appVersion;
    }

    public static void setAppBuild(final int appBuild) {
        _appBuild = appBuild;
    }

    public static void setAppSignature(final String appSignature) {
        _appSignature = appSignature;
    }

    public static void setChannelId(final String channelId) {
        GALogger.d("Setting channel id: " + channelId);
        _channelId = channelId;
    }

    public static void setAdIdSource(String adIdSource) {
        _adIdSource = adIdSource;
    }

    public static String getGameEngineVersion() {
        return _gameEngineVersion;
    }

    public static String getRelevantSdkVersion() {
        if (_sdkGameEngineVersion.length() != 0) {
            return _sdkGameEngineVersion;
        }
        return _sdkWrapperVersion;
    }

    public static String getBuildPlatform() {
        return _buildPlatform;
    }

    public static String getOSVersion() {
        return _osVersion;
    }

    public static String getDeviceModel() {
        return _deviceModel;
    }

    public static String getDeviceManufacturer() {
        return _deviceManufacturer;
    }

    public static boolean getIsHacked() {
        return _isHacked;
    }

    public static String getGAID() {
        Boolean boolIsLimitAdTrackingEnabled;
        String gpsAdid;
        if (!doTrackGAID) {
            return "00000000-0000-0000-0000-000000000000";
        }
        if (TextUtils.isEmpty(_gaid) && _lazySetGAID) {
            UUID uuidFromString = UUID.fromString("00000000-0000-0000-0000-000000000000");
            int i = 0;
            while (true) {
                if (i >= 3) {
                    break;
                }
                try {
                    gpsAdid = GooglePlayServicesClient.getGooglePlayServicesInfo(GAPlatform.getApplicationContext()).getGpsAdid();
                    _gaid = gpsAdid;
                } catch (Exception unused) {
                }
                if (gpsAdid != null && !UUID.fromString(gpsAdid).equals(uuidFromString)) {
                    setAdIdSource("service");
                    break;
                }
                String gaid = GAUtilities.getGAID(GAPlatform.getApplicationContext());
                _gaid = gaid;
                if (gaid != null && !UUID.fromString(gaid).equals(uuidFromString)) {
                    setAdIdSource(BuildConfig.FLAVOR);
                    break;
                }
                i++;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= 3) {
                    break;
                }
                try {
                    GooglePlayServicesClient.GooglePlayServicesInfo googlePlayServicesInfo = GooglePlayServicesClient.getGooglePlayServicesInfo(GAPlatform.getApplicationContext());
                    boolIsLimitAdTrackingEnabled = googlePlayServicesInfo.isLimitAdTrackingEnabled();
                    setIsLimitedAdTracking(googlePlayServicesInfo.isLimitAdTrackingEnabled().booleanValue());
                } catch (Exception unused2) {
                }
                if (boolIsLimitAdTrackingEnabled != null) {
                    break;
                }
                Boolean boolIsLimitAdTrackingEnabled2 = GAUtilities.isLimitAdTrackingEnabled(GAUtilities.GAID_PACKAGE_NAME, GAPlatform.getApplicationContext());
                if (boolIsLimitAdTrackingEnabled2 != null) {
                    setIsLimitedAdTracking(boolIsLimitAdTrackingEnabled2.booleanValue());
                    break;
                }
                i2++;
            }
            _lazySetGAID = false;
        }
        return _gaid;
    }

    public static String getOAID() {
        if (TextUtils.isEmpty(_oaid) && _lazySetOAID) {
            UUID uuidFromString = UUID.fromString("00000000-0000-0000-0000-000000000000");
            if (Looper.myLooper() == Looper.getMainLooper()) {
                _oaid = "00000000-0000-0000-0000-000000000000";
            } else {
                for (int i = 0; i < 3; i++) {
                    String oaid = GAUtilities.getOAID(GAPlatform.getApplicationContext());
                    _oaid = oaid;
                    if (oaid != null && !UUID.fromString(oaid).equals(uuidFromString)) {
                        break;
                    }
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= 3) {
                        break;
                    }
                    Boolean boolIsLimitAdTrackingEnabled = GAUtilities.isLimitAdTrackingEnabled(GAUtilities.OAID_PACKAGE_NAME, GAPlatform.getApplicationContext());
                    if (boolIsLimitAdTrackingEnabled != null) {
                        setIsLimitedAdTracking(boolIsLimitAdTrackingEnabled.booleanValue());
                        break;
                    }
                    i2++;
                }
            }
            _lazySetOAID = false;
        }
        return _oaid;
    }

    public static String getAppSetId() {
        if (TextUtils.isEmpty(_appSetId) && _lazySetAppSetId) {
            try {
                _appSetId = ((AppSetIdInfo) Tasks.await(AppSet.getClient(GAPlatform.getApplicationContext()).getAppSetIdInfo())).getId();
            } catch (InterruptedException e) {
                GALogger.w(e + "");
                e.printStackTrace();
            } catch (NoClassDefFoundError e2) {
                GALogger.w(e2 + "");
                e2.printStackTrace();
            } catch (ExecutionException e3) {
                GALogger.w(e3 + "");
                e3.printStackTrace();
            }
            _lazySetAppSetId = false;
        }
        return _appSetId;
    }

    public static String getAppSignature() {
        return _appSignature;
    }

    public static String getWritableFilePath() {
        return _writablepath;
    }

    public static boolean getIsLimitedAdTracking() {
        return _isLimitedAdTracking;
    }

    public static String getConnectionType() {
        return _connectionType;
    }

    public static String getBundleIdentifier() {
        return _bundleIdentifier;
    }

    public static String getAppVersion() {
        return _appVersion;
    }

    public static int getAppBuild() {
        return _appBuild;
    }

    public static String getChannelId() {
        return _channelId;
    }

    public static String getAdIdSource() {
        return _adIdSource;
    }

    private static String fixOSVersion(String version) {
        int i = 0;
        while (true) {
            if (i >= version.length()) {
                break;
            }
            char cCharAt = version.charAt(i);
            if (!Character.isDigit(cCharAt) && cCharAt != '.') {
                version = version.substring(0, i);
                break;
            }
            i++;
        }
        return !Pattern.matches("^(\\d){0,5}(\\.(\\d){0,5}){0,2}$", version) ? "0.0.0" : version;
    }

    private static String fixDeviceModel(String model) {
        return model.length() > 32 ? model.substring(0, 32) : model;
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
     */
    public static class DeviceInfo {
        private static final long INVALID_BOOT_TIME_VALUE = -1;
        private static long appUptime = -1;
        private static final String cpuFreq = "/sys/devices/system/cpu/cpu%d/cpufreq/scaling_cur_freq";
        private static final String cpuinfo = "/proc/cpuinfo";
        public static boolean enableExternalStorageTracking = false;
        public static boolean enableFPSTracking = false;
        public static boolean enableGpuTracking = false;
        public static boolean enableHardwareTracking = false;
        public static boolean enableMemoryHistograms = false;
        public static boolean enableMemoryTracking = false;
        public static boolean enableStorageTracking = false;
        private static final String maliGpu = "/sys/class/misc/mali0/device/utilization";
        private static double maxAppMemoryReading = 0.0d;
        private static double maxSysMemoryReading = 0.0d;
        private static final String meminfo = "/proc/meminfo";
        private static final String qualcommClock = "/sys/class/kgsl/kgsl-3d0/max_gpuclk";
        private static final String qualcommGpu = "/sys/class/kgsl/kgsl-3d0/gpu_busy_percentage";
        private static final String qualcommGpuModel = "/sys/class/kgsl/kgsl-3d0/gpu_model";
        private static final String stat = "/proc/stat";
        private static final int percentTableSize = 101;
        private static int[] appMemoryReadings = new int[percentTableSize];
        private static int[] sysMemoryReadings = new int[percentTableSize];
        private static ActivityManager.MemoryInfo memInfo = new ActivityManager.MemoryInfo();
        private static DeviceInfo memorySampler = new DeviceInfo();
        public String cpuName = null;
        public String hardware = null;
        public String gpuModel = null;
        public int numCores = 0;
        public long cpuLoad = 0;
        public long gpuLoad = 0;
        public long gpuClockMhz = 0;
        public long appCpuUsage = 0;
        private double memFree = 0.0d;
        public double memTotal = 0.0d;
        public double memAvailable = 0.0d;
        public boolean isLowMemory = false;
        public double appMemoryUsage = 0.0d;
        public double systemMemoryUsage = 0.0d;
        public double totalDeviceStorage = 0.0d;
        public double availableDeviceStorage = 0.0d;
        public double totalExternalStorage = 0.0d;
        public double availableExternalStorage = 0.0d;
        public int screenWidth = 0;
        public int screenHeight = 0;

        public static boolean IsHealthEventEnabled() {
            return enableMemoryHistograms | enableFPSTracking;
        }

        public static Pair<Double, Double> SampleMemoryUsage() {
            if (!enableMemoryTracking) {
                return null;
            }
            double dGetAppMemoryUsage = memorySampler.GetAppMemoryUsage();
            double dGetSystemMemoryUsage = memorySampler.GetSystemMemoryUsage();
            maxAppMemoryReading = Math.max(dGetAppMemoryUsage, maxAppMemoryReading);
            maxSysMemoryReading = Math.max(dGetSystemMemoryUsage, maxSysMemoryReading);
            if (enableMemoryHistograms) {
                double dConvertBytesToMB = ConvertBytesToMB(memInfo.totalMem);
                int i = (int) ((dGetAppMemoryUsage / dConvertBytesToMB) * 100.0d);
                int i2 = (int) ((dGetSystemMemoryUsage / dConvertBytesToMB) * 100.0d);
                if (i >= 0 && i <= 100) {
                    int[] iArr = appMemoryReadings;
                    iArr[i] = iArr[i] + 1;
                }
                if (i2 >= 0 && i2 <= 100) {
                    int[] iArr2 = sysMemoryReadings;
                    iArr2[i2] = iArr2[i2] + 1;
                }
            }
            return new Pair<>(Double.valueOf(dGetAppMemoryUsage), Double.valueOf(dGetSystemMemoryUsage));
        }

        public double UsedSysMemory() {
            return this.memTotal - this.memAvailable;
        }

        public boolean ReadInfo() {
            try {
                if (enableHardwareTracking) {
                    ReadHardwareInfo();
                }
                if (enableMemoryTracking) {
                    this.appMemoryUsage = GetAppMemoryUsage();
                    this.systemMemoryUsage = GetSystemMemoryUsage();
                    if (enableMemoryHistograms) {
                        SampleMemoryUsage();
                    }
                }
                if (enableStorageTracking) {
                    GetTotalDeviceStorage();
                }
                GetDeviceResolution();
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }

        public static double ConvertKbToGB(double value) {
            return Math.round(value / Math.pow(1024.0d, 2.0d));
        }

        public static double ConvertBytesToGB(double value) {
            return Math.round(value / Math.pow(1024.0d, 3.0d));
        }

        public static double ConvertBytesToMB(double value) {
            return Math.round(value / Math.pow(1024.0d, 2.0d));
        }

        public static double ConvertBytesToKB(double value) {
            return Math.round(value / 1024.0d);
        }

        public static long GetAppUptime() {
            if (GAEvents.isSdkInitEventEnabled && appUptime == INVALID_BOOT_TIME_VALUE) {
                appUptime = Process.getElapsedCpuTime();
            }
            return appUptime;
        }

        public static int[] GetAppMemoryPercentage() {
            return appMemoryReadings;
        }

        public static int[] GetSysMemoryPercentage() {
            return sysMemoryReadings;
        }

        private void GetDeviceResolution() {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) GAPlatform.getApplicationContext().getSystemService("window");
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                this.screenWidth = displayMetrics.widthPixels;
                this.screenHeight = displayMetrics.heightPixels;
            }
        }

        private static boolean IsSdcardPresent() {
            File[] externalFilesDirs = ContextCompat.getExternalFilesDirs(GAPlatform.getApplicationContext(), (String) null);
            return (externalFilesDirs.length <= 1 || externalFilesDirs[0] == null || externalFilesDirs[1] == null) ? false : true;
        }

        private void GetTotalDeviceStorage() {
            try {
                File dataDirectory = Environment.getDataDirectory();
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                Environment.getRootDirectory();
                StatFs statFs = new StatFs(dataDirectory.getAbsolutePath());
                StatFs statFs2 = new StatFs(externalStorageDirectory.getAbsolutePath());
                if (IsSdcardPresent()) {
                    long totalBytes = statFs2.getTotalBytes();
                    long availableBytes = statFs2.getAvailableBytes();
                    this.totalExternalStorage = (long) ConvertBytesToGB(totalBytes);
                    this.availableExternalStorage = (long) ConvertBytesToGB(availableBytes);
                }
                long totalBytes2 = statFs.getTotalBytes();
                long availableBytes2 = statFs.getAvailableBytes();
                this.totalDeviceStorage = (long) ConvertBytesToGB(totalBytes2);
                this.availableDeviceStorage = (long) ConvertBytesToGB(availableBytes2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public double GetAppMemoryUsage() {
            try {
                Runtime runtime = Runtime.getRuntime();
                return ConvertBytesToMB(runtime.totalMemory() - runtime.freeMemory());
            } catch (Throwable unused) {
                return 0.0d;
            }
        }

        public double GetSystemMemoryUsage() {
            ((ActivityManager) GAPlatform.getApplicationContext().getSystemService("activity")).getMemoryInfo(memInfo);
            this.memTotal = ConvertBytesToMB(memInfo.totalMem);
            this.memAvailable = ConvertBytesToMB(memInfo.availMem);
            this.isLowMemory = memInfo.lowMemory;
            return this.memTotal - this.memAvailable;
        }

        private void ReadSystemMemoryFromMemInfo() {
            try {
                if (this.memTotal != 0.0d && this.memAvailable != 0.0d) {
                    return;
                }
                BufferedReader bufferedReader = new BufferedReader(new FileReader(meminfo));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        return;
                    }
                    if (line.startsWith("MemTotal")) {
                        this.memTotal = Long.parseLong(line.split("\\s+")[1]);
                    }
                    if (line.startsWith("MemFree")) {
                        this.memFree = Long.parseLong(line.split("\\s+")[1]);
                    }
                    if (line.startsWith("MemAvailable")) {
                        this.memAvailable = Long.parseLong(line.split("\\s+")[1]);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:65|2|(2:3|(2:5|(3:68|10|(4:71|15|(3:73|17|76)(1:75)|74)(4:72|14|77|74))(4:69|9|78|74))(1:66))|18|19|(10:62|20|(1:22)(1:79)|64|29|b5|33|(2:34|(2:36|(2:81|38)(1:82))(1:80))|48|(2:50|83)(2:51|(2:53|86)(1:84)))|23|(1:25)|64|29|b5) */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0102, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
        
            r0.printStackTrace();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0107, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0108, code lost:
        
            r0.printStackTrace();
         */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void ReadHardwareInfo() {
            /*
                Method dump skipped, instruction units count: 397
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gameanalytics.sdk.device.GADevice.DeviceInfo.ReadHardwareInfo():void");
        }
    }

    public static DeviceInfo ReadDeviceInfo() {
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.ReadInfo();
        return deviceInfo;
    }
}

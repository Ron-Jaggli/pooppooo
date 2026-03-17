package com.gameanalytics.sdk;

import android.app.Activity;
import com.gameanalytics.sdk.GAPlatform;
import com.gameanalytics.sdk.device.GADevice;
import com.gameanalytics.sdk.events.EGASdkErrorAction;
import com.gameanalytics.sdk.events.EGASdkErrorArea;
import com.gameanalytics.sdk.events.EGASdkErrorCategory;
import com.gameanalytics.sdk.events.GAEvents;
import com.gameanalytics.sdk.http.GAHTTPApi;
import com.gameanalytics.sdk.logging.GALogger;
import com.gameanalytics.sdk.state.GAState;
import com.gameanalytics.sdk.store.GAStore;
import com.gameanalytics.sdk.threading.GAThreading;
import com.gameanalytics.sdk.threading.IBlock;
import com.gameanalytics.sdk.utilities.Stopwatch;
import com.gameanalytics.sdk.validators.GAValidator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class GameAnalytics {
    public static final String BANNER = "BANNER";
    public static final String INTERSTITIAL = "INTERSTITIAL";
    private static final int MAX_RETRIES = 500;
    public static final String NATIVE = "NATIVE";
    public static final String REWARDED_INTERSTITIAL = "REWARDED_INTERSTITIAL";
    public static final String REWARDED_VIDEO = "REWARDED_VIDEO";
    private static int currentRetries;

    static /* synthetic */ int access$304() {
        int i = currentRetries + 1;
        currentRetries = i;
        return i;
    }

    public static void setBaseUrl(final String url) {
        GAHTTPApi.getInstance().setBaseUrl(url);
    }

    public static void configureAvailableCustomDimensions01(final String... customDimensions) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.1
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                if (GameAnalytics.isSdkReady(true, false)) {
                    GALogger.w("Available custom dimensions must be set before SDK is initialized");
                } else {
                    GAState.setAvailableCustomDimensions01(customDimensions);
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "configureAvailableCustomDimensions01";
            }
        });
    }

    public static void configureAvailableCustomDimensions02(final String... customDimensions) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.2
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                if (GameAnalytics.isSdkReady(true, false)) {
                    GALogger.w("Available custom dimensions must be set before SDK is initialized");
                } else {
                    GAState.setAvailableCustomDimensions02(customDimensions);
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "configureAvailableCustomDimensions02";
            }
        });
    }

    public static void configureAvailableCustomDimensions03(final String... customDimensions) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.3
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                if (GameAnalytics.isSdkReady(true, false)) {
                    GALogger.w("Available custom dimensions must be set before SDK is initialized");
                } else {
                    GAState.setAvailableCustomDimensions03(customDimensions);
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "configureAvailableCustomDimensions03";
            }
        });
    }

    public static void configureAvailableResourceCurrencies(final String... resourceCurrencies) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.4
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                if (GameAnalytics.isSdkReady(true, false)) {
                    GALogger.w("Available resource currencies must be set before SDK is initialized");
                } else {
                    GAState.setAvailableResourceCurrencies(resourceCurrencies);
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "configureAvailableResourceCurrencies";
            }
        });
    }

    public static void configureAvailableResourceItemTypes(final String... resourceItemTypes) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.5
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                if (GameAnalytics.isSdkReady(true, false)) {
                    GALogger.w("Available resource item types must be set before SDK is initialized");
                } else {
                    GAState.setAvailableResourceItemTypes(resourceItemTypes);
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "configureAvailableResourceItemTypes";
            }
        });
    }

    public static void configureBuild(final String build) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.6
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                if (GameAnalytics.isSdkReady(true, false)) {
                    GALogger.w("Build version must be set before SDK is initialized.");
                } else if (!GAValidator.validateBuild(build)) {
                    GALogger.i("Validation fail - configure build: Cannot be null, empty or above 32 length. String: " + build);
                } else {
                    GAState.setBuild(build);
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "configureBuild";
            }
        });
    }

    public static void configureSdkGameEngineVersion(final String sdkGameEngineVersion) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.7
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                if (GameAnalytics.isSdkReady(true, false)) {
                    return;
                }
                if (!GAValidator.validateSdkWrapperVersion(sdkGameEngineVersion)) {
                    GALogger.i("Validation fail - configure sdk version: Sdk version not supported. String: " + sdkGameEngineVersion);
                } else {
                    GADevice.setSdkGameEngineVersion(sdkGameEngineVersion);
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "configureSdkGameEngineVersion";
            }
        });
    }

    public static void configureGameEngineVersion(final String gameEngineVersion) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.8
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                if (GameAnalytics.isSdkReady(true, false)) {
                    return;
                }
                if (!GAValidator.validateEngineVersion(gameEngineVersion)) {
                    GALogger.i("Validation fail - configure sdk version: Sdk version not supported. String: " + gameEngineVersion);
                } else {
                    GADevice.setGameEngineVersion(gameEngineVersion);
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "configureGameEngineVersion";
            }
        });
    }

    public static void configureAutoDetectAppVersion(final boolean flag) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.9
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                if (GameAnalytics.isSdkReady(true, false)) {
                    return;
                }
                GAState.setAutoDetectAppVersion(flag);
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "configureAutoDetectAppVersion";
            }
        });
    }

    public static void configureUserId(final String uId) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.10
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                if (GameAnalytics.isSdkReady(true, false)) {
                    GALogger.w("A custom user id must be set before SDK is initialized.");
                } else if (!GAValidator.validateUserId(uId)) {
                    GALogger.i("Validation fail - configure user_id: Cannot be null, empty or above 64 length. Will use default user_id method. Used string: " + uId);
                } else {
                    GAState.setUserId(uId);
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "configureUserId";
            }
        });
    }

    public static void configureExternalUserId(final String uId) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.11
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                GAState.setExternalUserId(uId);
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "configureExternalUserId";
            }
        });
    }

    public static String getUserId() {
        return GAState.getUserId();
    }

    public static String getExternalUserId() {
        return GAState.getExternalUserId();
    }

    static void configureIsHacked(final boolean isHacked) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.12
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                if (GameAnalytics.isSdkReady(false)) {
                    GADevice.setIsHacked(isHacked);
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "configureIsHacked";
            }
        });
    }

    static void configureWritableFilePath(final String path) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.13
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                GADevice.setWritableFilePath(path);
                if (GAStore.ensureDatabase(false)) {
                    return;
                }
                GALogger.w("Could not ensure/validate local event database: " + path);
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "configureWritableFilePath";
            }
        });
    }

    static void configureIsLimitedAdTracking(final boolean isLimitedAdTracking) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.14
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                if (GameAnalytics.isSdkReady(false)) {
                    GADevice.setIsLimitedAdTracking(isLimitedAdTracking);
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "configureIsLimitedAdTracking";
            }
        });
    }

    public static void initialize(Activity activity, String gameKey, String secretKey) {
        GADevice.DeviceInfo.GetAppUptime();
        GAPlatform.initialize(activity);
        initialize(gameKey, secretKey);
    }

    public static void initialize(final String gameKey, final String gameSecret) {
        if (GAPlatform.isInitialized()) {
            GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.15
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (GameAnalytics.isSdkReady(true, false)) {
                        GALogger.w("SDK already initialized. Can only be called once.");
                    } else if (!GAValidator.validateKeys(gameKey, gameSecret)) {
                        GALogger.w("SDK failed initialize. Game key or secret key is invalid. Can only contain characters A-z 0-9, gameKey is 32 length, gameSecret is 40 length. Failed keys - gameKey: " + gameKey + ", secretKey: " + gameSecret);
                    } else {
                        GAState.setKeys(gameKey, gameSecret);
                        GAState.internalInitialize();
                    }
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "initialize";
                }
            });
        } else {
            GALogger.w("Initialize error: You must call GAPlatform.initialize before GameAnalytics.initialize. Or add the activity to GameAnalytics.initialize.");
        }
    }

    public static void addBusinessEvent(final String currency, int amount, final String itemType, final String itemId, final String cartType) {
        addBusinessEvent(currency, amount, itemType, itemId, cartType, "", "", "");
    }

    public static void addBusinessEvent(final String currency, int amount, final String itemType, final String itemId, final String cartType, final Map<String, Object> customFields) {
        addBusinessEvent(currency, amount, itemType, itemId, cartType, "", "", "", customFields, false);
    }

    public static void addBusinessEvent(final String currency, int amount, final String itemType, final String itemId, final String cartType, final Map<String, Object> customFields, boolean mergeFields) {
        addBusinessEvent(currency, amount, itemType, itemId, cartType, "", "", "", customFields, mergeFields);
    }

    public static void addBusinessEvent(final String currency, int amount, final String itemType, final String itemId, final String cartType, final String customFields) {
        addBusinessEvent(currency, amount, itemType, itemId, cartType, "", "", "", jsonStringToMap(customFields), false);
    }

    public static void addBusinessEvent(final String currency, int amount, final String itemType, final String itemId, final String cartType, final String customFields, final boolean mergeFields) {
        addBusinessEvent(currency, amount, itemType, itemId, cartType, "", "", "", jsonStringToMap(customFields), mergeFields);
    }

    public static void addBusinessEvent(final String currency, final int amount, final String itemType, final String itemId, final String cartType, final String receipt, final String store, final String signature) {
        addBusinessEvent(currency, amount, itemType, itemId, cartType, receipt, store, signature, (Map<String, Object>) null);
    }

    public static void addBusinessEvent(final String currency, final int amount, final String itemType, final String itemId, final String cartType, final String receipt, final String store, final String signature, final String customFields) {
        addBusinessEvent(currency, amount, itemType, itemId, cartType, receipt, store, signature, jsonStringToMap(customFields), false);
    }

    public static void addBusinessEvent(final String currency, final int amount, final String itemType, final String itemId, final String cartType, final String receipt, final String store, final String signature, final String customFields, final boolean mergeFields) {
        addBusinessEvent(currency, amount, itemType, itemId, cartType, receipt, store, signature, jsonStringToMap(customFields), mergeFields);
    }

    public static void addBusinessEvent(final String currency, final int amount, final String itemType, final String itemId, final String cartType, final String receipt, final String store, final String signature, final Map<String, Object> customFields) {
        addBusinessEvent(currency, amount, itemType, itemId, cartType, receipt, store, signature, customFields, false);
    }

    public static void addBusinessEvent(final String currency, final int amount, final String itemType, final String itemId, final String cartType, final String receipt, final String store, final String signature, final Map<String, Object> customFields, final boolean mergeFields) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.16
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (GameAnalytics.isSdkReady(true, true, "Could not add business event")) {
                        GAEvents.addBusinessEvent(currency, amount, itemType, itemId, cartType, receipt, store, signature, customFields, mergeFields);
                    }
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addBusinessEvent";
                }
            });
        } else {
            GAThreading.performTaskDelayed(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.17
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (!GameAnalytics.isSdkReady(true, GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES, "Could not add business event")) {
                        if (GAState.isInitialized() || GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES) {
                            return;
                        }
                        GameAnalytics.addBusinessEvent(currency, amount, itemType, itemId, cartType, receipt, store, signature, (Map<String, Object>) customFields, mergeFields);
                        GameAnalytics.access$304();
                        return;
                    }
                    GAEvents.addBusinessEvent(currency, amount, itemType, itemId, cartType, receipt, store, signature, customFields, mergeFields);
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addBusinessEvent";
                }
            }, 1L);
        }
    }

    public static void addResourceEvent(final int flowType, final String currency, final float amount, final String itemType, final String itemId) {
        addResourceEvent(GAResourceFlowType.valueOf(flowType), currency, amount, itemType, itemId);
    }

    public static void addResourceEvent(final int flowType, final String currency, final float amount, final String itemType, final String itemId, final String customFields) {
        addResourceEvent(GAResourceFlowType.valueOf(flowType), currency, amount, itemType, itemId, jsonStringToMap(customFields), false);
    }

    public static void addResourceEvent(final int flowType, final String currency, final float amount, final String itemType, final String itemId, final String customFields, boolean mergeFields) {
        addResourceEvent(GAResourceFlowType.valueOf(flowType), currency, amount, itemType, itemId, jsonStringToMap(customFields), mergeFields);
    }

    public static void addResourceEvent(final GAResourceFlowType flowType, final String currency, final float amount, final String itemType, final String itemId) {
        addResourceEvent(flowType, currency, amount, itemType, itemId, (Map<String, Object>) null);
    }

    public static void addResourceEvent(final GAResourceFlowType flowType, final String currency, final float amount, final String itemType, final String itemId, final Map<String, Object> customFields) {
        addResourceEvent(flowType, currency, amount, itemType, itemId, customFields, false);
    }

    public static void addResourceEvent(final GAResourceFlowType flowType, final String currency, final float amount, final String itemType, final String itemId, final Map<String, Object> customFields, final boolean mergeFields) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.18
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (GameAnalytics.isSdkReady(true, true, "Could not add resource event")) {
                        GAEvents.addResourceEvent(flowType, currency, amount, itemType, itemId, customFields, mergeFields);
                    }
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addResourceEvent";
                }
            });
        } else {
            GAThreading.performTaskDelayed(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.19
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (!GameAnalytics.isSdkReady(true, GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES, "Could not add resource event")) {
                        if (GAState.isInitialized() || GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES) {
                            return;
                        }
                        GameAnalytics.addResourceEvent(flowType, currency, amount, itemType, itemId, (Map<String, Object>) customFields, mergeFields);
                        GameAnalytics.access$304();
                        return;
                    }
                    GAEvents.addResourceEvent(flowType, currency, amount, itemType, itemId, customFields, mergeFields);
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addResourceEvent";
                }
            }, 1L);
        }
    }

    public static void addProgressionEvent(final GAProgressionStatus progressionStatus, final String progression01) {
        addProgressionEvent(progressionStatus, progression01, "", "");
    }

    public static void addProgressionEvent(final GAProgressionStatus progressionStatus, final String progression01, final Map<String, Object> customFields, boolean mergeFields) {
        addProgressionEvent(progressionStatus, progression01, "", "", customFields, mergeFields);
    }

    public static void addProgressionEvent(final GAProgressionStatus progressionStatus, final String progression01, final Map<String, Object> customFields) {
        addProgressionEvent(progressionStatus, progression01, "", "", customFields, false);
    }

    public static void addProgressionEvent(final GAProgressionStatus progressionStatus, final String progression01, final double score) {
        addProgressionEvent(progressionStatus, progression01, "", "", score);
    }

    public static void addProgressionEvent(final GAProgressionStatus progressionStatus, final String progression01, final double score, final Map<String, Object> customFields, boolean mergeFields) {
        addProgressionEvent(progressionStatus, progression01, "", "", score, customFields, mergeFields);
    }

    public static void addProgressionEvent(final GAProgressionStatus progressionStatus, final String progression01, final double score, final Map<String, Object> customFields) {
        addProgressionEvent(progressionStatus, progression01, "", "", score, customFields, false);
    }

    public static void addProgressionEvent(final GAProgressionStatus progressionStatus, final String progression01, final String progression02) {
        addProgressionEvent(progressionStatus, progression01, progression02, "");
    }

    public static void addProgressionEvent(final GAProgressionStatus progressionStatus, final String progression01, final String progression02, final Map<String, Object> customFields, boolean mergeFields) {
        addProgressionEvent(progressionStatus, progression01, progression02, "", customFields, mergeFields);
    }

    public static void addProgressionEvent(final GAProgressionStatus progressionStatus, final String progression01, final String progression02, final Map<String, Object> customFields) {
        addProgressionEvent(progressionStatus, progression01, progression02, "", customFields, false);
    }

    public static void addProgressionEvent(final GAProgressionStatus progressionStatus, final String progression01, final String progression02, final double score) {
        addProgressionEvent(progressionStatus, progression01, progression02, "", score);
    }

    public static void addProgressionEvent(final GAProgressionStatus progressionStatus, final String progression01, final String progression02, final double score, final Map<String, Object> customFields, boolean mergeFields) {
        addProgressionEvent(progressionStatus, progression01, progression02, "", score, customFields, mergeFields);
    }

    public static void addProgressionEvent(final GAProgressionStatus progressionStatus, final String progression01, final String progression02, final double score, final Map<String, Object> customFields) {
        addProgressionEvent(progressionStatus, progression01, progression02, "", score, customFields, false);
    }

    public static void addProgressionEvent(final int progressionStatus, final String progression01, final String progression02, final String progression03) {
        addProgressionEvent(GAProgressionStatus.valueOf(progressionStatus), progression01, progression02, progression03);
    }

    public static void addProgressionEvent(final int progressionStatus, final String progression01, final String progression02, final String progression03, final String customFields, boolean mergeFields) {
        addProgressionEvent(GAProgressionStatus.valueOf(progressionStatus), progression01, progression02, progression03, jsonStringToMap(customFields), mergeFields);
    }

    public static void addProgressionEvent(final int progressionStatus, final String progression01, final String progression02, final String progression03, final String customFields) {
        addProgressionEvent(GAProgressionStatus.valueOf(progressionStatus), progression01, progression02, progression03, jsonStringToMap(customFields), false);
    }

    public static void addProgressionEvent(final GAProgressionStatus progressionStatus, final String progression01, final String progression02, final String progression03) {
        addProgressionEvent(progressionStatus, progression01, progression02, progression03, (Map<String, Object>) null);
    }

    public static void addProgressionEvent(final GAProgressionStatus progressionStatus, final String progression01, final String progression02, final String progression03, final Map<String, Object> customFields) {
        addProgressionEvent(progressionStatus, progression01, progression02, progression03, customFields, false);
    }

    public static void addProgressionEvent(final GAProgressionStatus progressionStatus, final String progression01, final String progression02, final String progression03, final Map<String, Object> customFields, final boolean mergeFields) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.20
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (GameAnalytics.isSdkReady(true, true, "Could not add progression event")) {
                        GAEvents.addProgressionEvent(progressionStatus, progression01, progression02, progression03, 0, false, customFields, mergeFields);
                    }
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addProgressionEvent";
                }
            });
        } else {
            GAThreading.performTaskDelayed(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.21
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (!GameAnalytics.isSdkReady(true, GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES, "Could not add progression event")) {
                        if (GAState.isInitialized() || GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES) {
                            return;
                        }
                        GameAnalytics.addProgressionEvent(progressionStatus, progression01, progression02, progression03, (Map<String, Object>) customFields, mergeFields);
                        GameAnalytics.access$304();
                        return;
                    }
                    GAEvents.addProgressionEvent(progressionStatus, progression01, progression02, progression03, 0, false, customFields, mergeFields);
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addProgressionEvent";
                }
            }, 1L);
        }
    }

    public static void addProgressionEvent(final int progressionStatus, final String progression01, final String progression02, final String progression03, final double score) {
        addProgressionEvent(GAProgressionStatus.valueOf(progressionStatus), progression01, progression02, progression03, score);
    }

    public static void addProgressionEvent(final int progressionStatus, final String progression01, final String progression02, final String progression03, final double score, final String customFields) {
        addProgressionEvent(GAProgressionStatus.valueOf(progressionStatus), progression01, progression02, progression03, score, jsonStringToMap(customFields), false);
    }

    public static void addProgressionEvent(final int progressionStatus, final String progression01, final String progression02, final String progression03, final double score, final String customFields, boolean mergeFields) {
        addProgressionEvent(GAProgressionStatus.valueOf(progressionStatus), progression01, progression02, progression03, score, jsonStringToMap(customFields), mergeFields);
    }

    public static void addProgressionEvent(final GAProgressionStatus progressionStatus, final String progression01, final String progression02, final String progression03, final double score) {
        addProgressionEvent(progressionStatus, progression01, progression02, progression03, score, (Map<String, Object>) null);
    }

    public static void addProgressionEvent(final GAProgressionStatus progressionStatus, final String progression01, final String progression02, final String progression03, final double score, final Map<String, Object> customFields) {
        addProgressionEvent(progressionStatus, progression01, progression02, progression03, score, customFields, false);
    }

    public static void addProgressionEvent(final GAProgressionStatus progressionStatus, final String progression01, final String progression02, final String progression03, final double score, final Map<String, Object> customFields, final boolean mergeFields) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.22
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (GameAnalytics.isSdkReady(true, true, "Could not add progression event")) {
                        GAEvents.addProgressionEvent(progressionStatus, progression01, progression02, progression03, (int) score, true, customFields, mergeFields);
                    }
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addProgressionEvent";
                }
            });
        } else {
            GAThreading.performTaskDelayed(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.23
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (!GameAnalytics.isSdkReady(true, GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES, "Could not add progression event")) {
                        if (GAState.isInitialized() || GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES) {
                            return;
                        }
                        GameAnalytics.addProgressionEvent(progressionStatus, progression01, progression02, progression03, score, (Map<String, Object>) customFields, mergeFields);
                        GameAnalytics.access$304();
                        return;
                    }
                    GAEvents.addProgressionEvent(progressionStatus, progression01, progression02, progression03, (int) score, true, customFields, mergeFields);
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addProgressionEvent";
                }
            }, 1L);
        }
    }

    public static void addDesignEvent(final String eventId) {
        addDesignEvent(eventId, (Map<String, Object>) null);
    }

    public static void addDesignEvent(final String eventId, final String customFields) {
        addDesignEvent(eventId, jsonStringToMap(customFields), false);
    }

    public static void addDesignEvent(final String eventId, final String customFields, boolean mergeFields) {
        addDesignEvent(eventId, jsonStringToMap(customFields), mergeFields);
    }

    public static void addDesignEvent(final String eventId, final Map<String, Object> customFields) {
        addDesignEvent(eventId, customFields, false);
    }

    public static void addDesignEvent(final String eventId, final Map<String, Object> customFields, final boolean mergeFields) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.24
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (GameAnalytics.isSdkReady(true, true, "Could not add design event")) {
                        GAEvents.addDesignEvent(eventId, 0.0d, false, customFields, mergeFields);
                    }
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addDesignEvent";
                }
            });
        } else {
            GAThreading.performTaskDelayed(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.25
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (!GameAnalytics.isSdkReady(true, GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES, "Could not add design event")) {
                        if (GAState.isInitialized() || GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES) {
                            return;
                        }
                        GameAnalytics.addDesignEvent(eventId, (Map<String, Object>) customFields, mergeFields);
                        GameAnalytics.access$304();
                        return;
                    }
                    GAEvents.addDesignEvent(eventId, 0.0d, false, customFields, mergeFields);
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addDesignEvent";
                }
            }, 1L);
        }
    }

    public static void addDesignEvent(final String eventId, final double value) {
        addDesignEvent(eventId, value, (Map<String, Object>) null);
    }

    public static void addDesignEvent(final String eventId, final double value, final String customFields) {
        addDesignEvent(eventId, value, jsonStringToMap(customFields), false);
    }

    public static void addDesignEvent(final String eventId, final double value, final String customFields, boolean mergeFields) {
        addDesignEvent(eventId, value, jsonStringToMap(customFields), mergeFields);
    }

    public static void addDesignEvent(final String eventId, final double value, final Map<String, Object> customFields) {
        addDesignEvent(eventId, value, customFields, false);
    }

    public static void addDesignEvent(final String eventId, final double value, final Map<String, Object> customFields, final boolean mergeFields) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.26
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (GameAnalytics.isSdkReady(true, true, "Could not add design event")) {
                        GAEvents.addDesignEvent(eventId, value, true, customFields, mergeFields);
                    }
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addDesignEvent";
                }
            });
        } else {
            GAThreading.performTaskDelayed(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.27
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (!GameAnalytics.isSdkReady(true, GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES, "Could not add design event")) {
                        if (GAState.isInitialized() || GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES) {
                            return;
                        }
                        GameAnalytics.addDesignEvent(eventId, value, (Map<String, Object>) customFields, mergeFields);
                        GameAnalytics.access$304();
                        return;
                    }
                    GAEvents.addDesignEvent(eventId, value, true, customFields, mergeFields);
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addDesignEvent";
                }
            }, 1L);
        }
    }

    public static void addErrorEvent(final int severity, final String message) {
        addErrorEvent(GAErrorSeverity.valueOf(severity), message);
    }

    public static void addErrorEvent(final int severity, final String message, final String customFields) {
        addErrorEvent(GAErrorSeverity.valueOf(severity), message, jsonStringToMap(customFields), false);
    }

    public static void addErrorEvent(final int severity, final String message, final String customFields, boolean mergeFields) {
        addErrorEvent(GAErrorSeverity.valueOf(severity), message, jsonStringToMap(customFields), mergeFields);
    }

    public static void addErrorEvent(final GAErrorSeverity severity, final String message) {
        addErrorEvent(severity, message, (Map<String, Object>) null);
    }

    public static void addErrorEvent(final GAErrorSeverity severity, final String message, final Map<String, Object> customFields) {
        addErrorEvent(severity, message, customFields, false);
    }

    public static void addErrorEvent(final GAErrorSeverity severity, final String message, final Map<String, Object> customFields, final boolean mergeFields) {
        final GAPlatform.FunctionInfo functionInfo = new GAPlatform.FunctionInfo();
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.28
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (GameAnalytics.isSdkReady(true, true, "Could not add error event")) {
                        GAEvents.addErrorEvent(severity, message, customFields, mergeFields, functionInfo.method, functionInfo.line, functionInfo.module);
                    }
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addErrorEvent";
                }
            });
        } else {
            GAThreading.performTaskDelayed(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.29
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (!GameAnalytics.isSdkReady(true, GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES, "Could not add error event")) {
                        if (GAState.isInitialized() || GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES) {
                            return;
                        }
                        GameAnalytics.addErrorEvent(severity, message, (Map<String, Object>) customFields, mergeFields);
                        GameAnalytics.access$304();
                        return;
                    }
                    GAEvents.addErrorEvent(severity, message, customFields, mergeFields, functionInfo.method, functionInfo.line, functionInfo.module);
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addErrorEvent";
                }
            }, 1L);
        }
    }

    public static void addAdEvent(final int adAction, final int adType, final String adSdkName, final String adPlacement, final long duration) {
        addAdEvent(GAAdAction.valueOf(adAction), GAAdType.valueOf(adType), adSdkName, adPlacement, duration, (Map<String, Object>) null);
    }

    public static void addAdEvent(final int adAction, final int adType, final String adSdkName, final String adPlacement, final long duration, final String customFields, boolean mergeFields) {
        addAdEvent(GAAdAction.valueOf(adAction), GAAdType.valueOf(adType), adSdkName, adPlacement, duration, jsonStringToMap(customFields), mergeFields);
    }

    public static void addAdEvent(final int adAction, final int adType, final String adSdkName, final String adPlacement, final long duration, final String customFields) {
        addAdEvent(GAAdAction.valueOf(adAction), GAAdType.valueOf(adType), adSdkName, adPlacement, duration, jsonStringToMap(customFields), false);
    }

    public static void addAdEvent(final GAAdAction adAction, final GAAdType adType, final String adSdkName, final String adPlacement, final long duration) {
        addAdEvent(adAction, adType, adSdkName, adPlacement, duration, (Map<String, Object>) null);
    }

    public static void addAdEvent(final GAAdAction adAction, final GAAdType adType, final String adSdkName, final String adPlacement, final long duration, final Map<String, Object> customFields) {
        addAdEvent(adAction, adType, adSdkName, adPlacement, duration, customFields, false);
    }

    public static void addAdEvent(final GAAdAction adAction, final GAAdType adType, final String adSdkName, final String adPlacement, final long duration, final Map<String, Object> customFields, final boolean mergeFields) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.30
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (GameAnalytics.isSdkReady(true, true, "Could not add ad event")) {
                        GAEvents.addAdEvent(adAction, adType, adSdkName, adPlacement, GAAdError.Undefined, duration, true, customFields, mergeFields);
                    }
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addAdEvent";
                }
            });
        } else {
            GAThreading.performTaskDelayed(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.31
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (!GameAnalytics.isSdkReady(true, GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES, "Could not ad error event")) {
                        if (GAState.isInitialized() || GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES) {
                            return;
                        }
                        GameAnalytics.addAdEvent(adAction, adType, adSdkName, adPlacement, duration, (Map<String, Object>) customFields, mergeFields);
                        GameAnalytics.access$304();
                        return;
                    }
                    GAEvents.addAdEvent(adAction, adType, adSdkName, adPlacement, GAAdError.Undefined, duration, true, customFields, mergeFields);
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addAdEvent";
                }
            }, 1L);
        }
    }

    public static void addAdEvent(final int adAction, final int adType, final String adSdkName, final String adPlacement, final int noAdReason) {
        addAdEvent(GAAdAction.valueOf(adAction), GAAdType.valueOf(adType), adSdkName, adPlacement, GAAdError.valueOf(noAdReason), (Map<String, Object>) null);
    }

    public static void addAdEvent(final int adAction, final int adType, final String adSdkName, final String adPlacement, final int noAdReason, final String customFields, boolean mergeFields) {
        addAdEvent(GAAdAction.valueOf(adAction), GAAdType.valueOf(adType), adSdkName, adPlacement, GAAdError.valueOf(noAdReason), jsonStringToMap(customFields), mergeFields);
    }

    public static void addAdEvent(final int adAction, final int adType, final String adSdkName, final String adPlacement, final int noAdReason, final String customFields) {
        addAdEvent(GAAdAction.valueOf(adAction), GAAdType.valueOf(adType), adSdkName, adPlacement, GAAdError.valueOf(noAdReason), jsonStringToMap(customFields), false);
    }

    public static void addAdEvent(final GAAdAction adAction, final GAAdType adType, final String adSdkName, final String adPlacement, final GAAdError noAdReason) {
        addAdEvent(adAction, adType, adSdkName, adPlacement, noAdReason, (Map<String, Object>) null);
    }

    public static void addAdEvent(final GAAdAction adAction, final GAAdType adType, final String adSdkName, final String adPlacement, final GAAdError noAdReason, final Map<String, Object> customFields) {
        addAdEvent(adAction, adType, adSdkName, adPlacement, noAdReason, customFields, false);
    }

    public static void addAdEvent(final GAAdAction adAction, final GAAdType adType, final String adSdkName, final String adPlacement, final GAAdError noAdReason, final Map<String, Object> customFields, final boolean mergeFields) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.32
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (GameAnalytics.isSdkReady(true, true, "Could not add ad event")) {
                        GAEvents.addAdEvent(adAction, adType, adSdkName, adPlacement, noAdReason, 0L, false, customFields, mergeFields);
                    }
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addAdEvent";
                }
            });
        } else {
            GAThreading.performTaskDelayed(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.33
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (!GameAnalytics.isSdkReady(true, GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES, "Could not ad error event")) {
                        if (GAState.isInitialized() || GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES) {
                            return;
                        }
                        GameAnalytics.addAdEvent(adAction, adType, adSdkName, adPlacement, noAdReason, (Map<String, Object>) customFields, mergeFields);
                        GameAnalytics.access$304();
                        return;
                    }
                    GAEvents.addAdEvent(adAction, adType, adSdkName, adPlacement, noAdReason, 0L, false, customFields, mergeFields);
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addAdEvent";
                }
            }, 1L);
        }
    }

    public static void addAdEvent(final int adAction, final int adType, final String adSdkName, final String adPlacement) {
        addAdEvent(GAAdAction.valueOf(adAction), GAAdType.valueOf(adType), adSdkName, adPlacement, (Map<String, Object>) null);
    }

    public static void addAdEvent(final int adAction, final int adType, final String adSdkName, final String adPlacement, final String customFields, boolean mergeFields) {
        addAdEvent(GAAdAction.valueOf(adAction), GAAdType.valueOf(adType), adSdkName, adPlacement, jsonStringToMap(customFields), mergeFields);
    }

    public static void addAdEvent(final int adAction, final int adType, final String adSdkName, final String adPlacement, final String customFields) {
        addAdEvent(GAAdAction.valueOf(adAction), GAAdType.valueOf(adType), adSdkName, adPlacement, jsonStringToMap(customFields), false);
    }

    public static void addAdEvent(final GAAdAction adAction, final GAAdType adType, final String adSdkName, final String adPlacement) {
        addAdEvent(adAction, adType, adSdkName, adPlacement, (Map<String, Object>) null);
    }

    public static void addAdEvent(final GAAdAction adAction, final GAAdType adType, final String adSdkName, final String adPlacement, final Map<String, Object> customFields) {
        addAdEvent(adAction, adType, adSdkName, adPlacement, customFields, false);
    }

    public static void addAdEvent(final GAAdAction adAction, final GAAdType adType, final String adSdkName, final String adPlacement, final Map<String, Object> customFields, final boolean mergeFields) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.34
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (GameAnalytics.isSdkReady(true, true, "Could not add ad event")) {
                        GAEvents.addAdEvent(adAction, adType, adSdkName, adPlacement, GAAdError.Undefined, 0L, false, customFields, mergeFields);
                    }
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addAdEvent";
                }
            });
        } else {
            GAThreading.performTaskDelayed(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.35
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (!GameAnalytics.isSdkReady(true, GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES, "Could not ad event")) {
                        if (GAState.isInitialized() || GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES) {
                            return;
                        }
                        GameAnalytics.addAdEvent(adAction, adType, adSdkName, adPlacement, (Map<String, Object>) customFields, mergeFields);
                        GameAnalytics.access$304();
                        return;
                    }
                    GAEvents.addAdEvent(adAction, adType, adSdkName, adPlacement, GAAdError.Undefined, 0L, false, customFields, mergeFields);
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addAdEvent";
                }
            }, 1L);
        }
    }

    public static void addImpressionMoPubEvent(String adNetworkVersion, String impressionData) {
        try {
            addImpressionMoPubEvent(adNetworkVersion, new JSONObject(impressionData));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void addImpressionMoPubEvent(String adNetworkVersion, String impressionData, String customFields) {
        try {
            addImpressionMoPubEvent(adNetworkVersion, new JSONObject(impressionData), jsonStringToMap(customFields));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void addImpressionMoPubEvent(String adNetworkVersion, JSONObject impressionData) {
        addImpressionEvent("mopub", adNetworkVersion, impressionData);
    }

    public static void addImpressionMoPubEvent(String adNetworkVersion, JSONObject impressionData, Map<String, Object> customFields) {
        addImpressionEvent("mopub", adNetworkVersion, impressionData, customFields);
    }

    public static void addImpressionFyberEvent(String adNetworkVersion, String impressionData) {
        try {
            addImpressionFyberEvent(adNetworkVersion, new JSONObject(impressionData));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void addImpressionFyberEvent(String adNetworkVersion, String impressionData, String customFields) {
        try {
            addImpressionFyberEvent(adNetworkVersion, new JSONObject(impressionData), jsonStringToMap(customFields));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void addImpressionFyberEvent(String adNetworkVersion, JSONObject impressionData) {
        addImpressionEvent("fyber", adNetworkVersion, impressionData);
    }

    public static void addImpressionFyberEvent(String adNetworkVersion, JSONObject impressionData, Map<String, Object> customFields) {
        addImpressionEvent("fyber", adNetworkVersion, impressionData, customFields);
    }

    public static void addImpressionIronSourceEvent(String adNetworkVersion, String impressionData) {
        try {
            addImpressionIronSourceEvent(adNetworkVersion, new JSONObject(impressionData));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void addImpressionIronSourceEvent(String adNetworkVersion, String impressionData, String customFields) {
        try {
            addImpressionIronSourceEvent(adNetworkVersion, new JSONObject(impressionData), jsonStringToMap(customFields));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void addImpressionIronSourceEvent(String adNetworkVersion, JSONObject impressionData) {
        addImpressionEvent("ironsource", adNetworkVersion, impressionData);
    }

    public static void addImpressionIronSourceEvent(String adNetworkVersion, JSONObject impressionData, Map<String, Object> customFields) {
        addImpressionEvent("ironsource", adNetworkVersion, impressionData, customFields);
    }

    public static void addImpressionTopOnEvent(String adNetworkVersion, String impressionData) {
        try {
            addImpressionTopOnEvent(adNetworkVersion, new JSONObject(impressionData));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void addImpressionTopOnEvent(String adNetworkVersion, String impressionData, String customFields) {
        try {
            addImpressionTopOnEvent(adNetworkVersion, new JSONObject(impressionData), jsonStringToMap(customFields));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void addImpressionTopOnEvent(String adNetworkVersion, JSONObject impressionData) {
        addImpressionEvent("topon", adNetworkVersion, impressionData);
    }

    public static void addImpressionTopOnEvent(String adNetworkVersion, JSONObject impressionData, Map<String, Object> customFields) {
        addImpressionEvent("topon", adNetworkVersion, impressionData, customFields);
    }

    public static void addImpressionHyperBidEvent(String adNetworkVersion, String impressionData) {
        try {
            addImpressionHyperBidEvent(adNetworkVersion, new JSONObject(impressionData));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void addImpressionHyperBidEvent(String adNetworkVersion, String impressionData, String customFields) {
        try {
            addImpressionHyperBidEvent(adNetworkVersion, new JSONObject(impressionData), jsonStringToMap(customFields));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void addImpressionHyperBidEvent(String adNetworkVersion, JSONObject impressionData) {
        addImpressionEvent("hyperbid", adNetworkVersion, impressionData);
    }

    public static void addImpressionHyperBidEvent(String adNetworkVersion, JSONObject impressionData, Map<String, Object> customFields) {
        addImpressionEvent("hyperbid", adNetworkVersion, impressionData, customFields);
    }

    public static void addImpressionMaxEvent(String adNetworkVersion, String impressionData) {
        try {
            addImpressionMaxEvent(adNetworkVersion, new JSONObject(impressionData));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void addImpressionMaxEvent(String adNetworkVersion, String impressionData, String customFields) {
        try {
            addImpressionMaxEvent(adNetworkVersion, new JSONObject(impressionData), jsonStringToMap(customFields));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void addImpressionMaxEvent(String adNetworkVersion, JSONObject impressionData) {
        addImpressionEvent("max", adNetworkVersion, impressionData);
    }

    public static void addImpressionMaxEvent(String adNetworkVersion, JSONObject impressionData, Map<String, Object> customFields) {
        addImpressionEvent("max", adNetworkVersion, impressionData, customFields);
    }

    public static void addImpressionAequusEvent(String adNetworkVersion, String impressionData) {
        try {
            addImpressionAequusEvent(adNetworkVersion, new JSONObject(impressionData));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void addImpressionAequusEvent(String adNetworkVersion, String impressionData, String customFields) {
        try {
            addImpressionAequusEvent(adNetworkVersion, new JSONObject(impressionData), jsonStringToMap(customFields));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void addImpressionAequusEvent(String adNetworkVersion, JSONObject impressionData) {
        addImpressionEvent("aequus", adNetworkVersion, impressionData);
    }

    public static void addImpressionAequusEvent(String adNetworkVersion, JSONObject impressionData, Map<String, Object> customFields) {
        addImpressionEvent("aequus", adNetworkVersion, impressionData, customFields);
    }

    public static void addImpressionAdMobEvent(String adNetworkVersion, String impressionData) {
        try {
            addImpressionAdMobEvent(adNetworkVersion, new JSONObject(impressionData));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void addImpressionAdMobEvent(String adNetworkVersion, String impressionData, String customFields) {
        try {
            addImpressionAdMobEvent(adNetworkVersion, new JSONObject(impressionData), jsonStringToMap(customFields));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void addImpressionAdMobEvent(String adNetworkVersion, JSONObject impressionData) {
        addImpressionEvent("admob", adNetworkVersion, impressionData);
    }

    public static void addImpressionAdMobEvent(String adNetworkVersion, JSONObject impressionData, Map<String, Object> customFields) {
        addImpressionEvent("admob", adNetworkVersion, impressionData, customFields);
    }

    public static void addImpressionEvent(final String adNetworkName, final String adNetworkVersion, final JSONObject impressionData) {
        addImpressionEvent(adNetworkName, adNetworkVersion, impressionData, (Map<String, Object>) null);
    }

    public static void addImpressionEvent(final String adNetworkName, final String adNetworkVersion, final String impressionData, final String customFields) {
        try {
            addImpressionEvent(adNetworkName, adNetworkVersion, new JSONObject(impressionData), jsonStringToMap(customFields));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void addImpressionEvent(final String adNetworkName, final String adNetworkVersion, final String impressionData, final String customFields, boolean mergeFields) {
        try {
            addImpressionEvent(adNetworkName, adNetworkVersion, new JSONObject(impressionData), jsonStringToMap(customFields), mergeFields);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void addImpressionEvent(final String adNetworkName, final String adNetworkVersion, final JSONObject impressionData, final Map<String, Object> customFields) {
        addImpressionEvent(adNetworkName, adNetworkVersion, impressionData, customFields, false);
    }

    public static void addImpressionEvent(final String adNetworkName, final String adNetworkVersion, final JSONObject impressionData, final Map<String, Object> customFields, final boolean mergeFields) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.36
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (GameAnalytics.isSdkReady(true, true, "Could not add impression event")) {
                        GAEvents.addImpressionEvent(adNetworkName, adNetworkVersion, impressionData, customFields, mergeFields);
                    }
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addImpressionEvent";
                }
            });
        } else {
            GAThreading.performTaskDelayed(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.37
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    if (!GameAnalytics.isSdkReady(true, GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES, "Could not add impression event")) {
                        if (GAState.isInitialized() || GameAnalytics.currentRetries >= GameAnalytics.MAX_RETRIES) {
                            return;
                        }
                        GameAnalytics.addImpressionEvent(adNetworkName, adNetworkVersion, impressionData, (Map<String, Object>) customFields, mergeFields);
                        GameAnalytics.access$304();
                        return;
                    }
                    GAEvents.addImpressionEvent(adNetworkName, adNetworkVersion, impressionData, customFields, mergeFields);
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addImpressionEvent";
                }
            }, 1L);
        }
    }

    public static void setEnabledInfoLog(final boolean flag) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.38
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                boolean z = flag;
                if (z) {
                    GALogger.setInfoLog(z);
                    GALogger.i("Info logging enabled");
                } else {
                    GALogger.i("Info logging disabled");
                    GALogger.setInfoLog(flag);
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "setEnabledInfoLog";
            }
        });
    }

    public static void setEnabledVerboseLog(final boolean flag) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.39
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                boolean z = flag;
                if (z) {
                    GALogger.setAdvancedInfoLog(z);
                    GALogger.i("Verbose logging enabled");
                } else {
                    GALogger.i("Verbose logging disabled");
                    GALogger.setAdvancedInfoLog(flag);
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "setEnabledVerboseLog";
            }
        });
    }

    public static void setEnabledManualSessionHandling(final boolean flag) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.40
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                GAState.setManualSessionHandling(flag);
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "setEnabledManualSessionHandling";
            }
        });
    }

    public static void setGAIDTracking(final boolean flag) {
        GADevice.doTrackGAID = flag;
    }

    public static void setEnabledErrorReporting(final boolean flag) {
        GAState.setEnableErrorReporting(flag);
    }

    public static void setEnabledEventSubmission(final boolean flag) {
        setEnabledEventSubmission(flag, false);
    }

    public static void setEnabledEventSubmission(final boolean flag, final boolean doSubmitEventsLocally) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.41
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                boolean z = flag;
                if (z) {
                    GAState.setEnableEventSubmission(z, doSubmitEventsLocally);
                    GALogger.i("Event submission enabled");
                } else {
                    GALogger.i("Event submission disabled");
                    GAState.setEnableEventSubmission(flag, doSubmitEventsLocally);
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "setEnabledEventSubmission";
            }
        });
    }

    public static void setCustomDimension01(final String dimension) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.42
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                if (!GAValidator.validateDimension01(dimension)) {
                    GALogger.w("Could not set custom01 dimension value to '" + dimension + "'. Value not found in available custom01 dimension values");
                } else {
                    GAState.setCustomDimension01(dimension);
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "setCustomDimension01";
            }
        });
    }

    public static void setCustomDimension02(final String dimension) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.43
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                if (!GAValidator.validateDimension02(dimension)) {
                    GALogger.w("Could not set custom02 dimension value to '" + dimension + "'. Value not found in available custom02 dimension values");
                } else {
                    GAState.setCustomDimension02(dimension);
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "setCustomDimension02";
            }
        });
    }

    public static void setCustomDimension03(final String dimension) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.44
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                if (!GAValidator.validateDimension03(dimension)) {
                    GALogger.w("Could not set custom03 dimension value to '" + dimension + "'. Value not found in available custom03 dimension values");
                } else {
                    GAState.setCustomDimension03(dimension);
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "setCustomDimension03";
            }
        });
    }

    public static void setGlobalCustomEventFields(final String customFields) {
        setGlobalCustomEventFields(jsonStringToMap(customFields));
    }

    public static void setGlobalCustomEventFields(final Map<String, Object> customFields) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.45
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                GAState.setGlobalCustomEventFields(customFields);
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "setGlobalCustomEventFields";
            }
        });
    }

    public static void startTimer(final String key) {
        Stopwatch.startTimer(key);
    }

    public static void pauseTimer(final String key) {
        Stopwatch.pauseTimer(key);
    }

    public static void resumeTimer(final String key) {
        Stopwatch.resumeTimer(key);
    }

    public static long stopTimer(final String key) {
        return Stopwatch.stopTimer(key);
    }

    static void setConnectionType(final String networkConnectionType) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.46
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                if (GameAnalytics.isSdkReady(false)) {
                    GADevice.setConnectionType(networkConnectionType);
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "setConnectionType";
            }
        });
    }

    static void setBundleIdentifier(final String bundleIdentifier) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.47
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                GADevice.setBundleId(bundleIdentifier);
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "setBundleIdentifier";
            }
        });
    }

    static void setAppVersion(final String appVersion) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.48
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                GADevice.setAppVersion(appVersion);
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "setAppVersion";
            }
        });
    }

    static void setAppBuild(final int appBuild) {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.49
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                GADevice.setAppBuild(appBuild);
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "setAppBuild";
            }
        });
    }

    public static String getRemoteConfigsValueAsString(String key) {
        return getRemoteConfigsValueAsString(key, null);
    }

    public static String getRemoteConfigsValueAsString(String key, String defaultValue) {
        return GAState.getRemoteConfigsStringValue(key, defaultValue);
    }

    public static boolean isRemoteConfigsReady() {
        return GAState.isRemoteConfigsReady();
    }

    public static void addRemoteConfigsListener(IRemoteConfigsListener listener) {
        GAState.addRemoteConfigsListener(listener);
    }

    public static void removeRemoteConfigsListener(IRemoteConfigsListener listener) {
        GAState.removeRemoteConfigsListener(listener);
    }

    public static String getRemoteConfigsContentAsString() {
        return GAState.getRemoteConfigsContentAsString();
    }

    public static String getABTestingId() {
        return GAState.getABTestingId();
    }

    public static String getABTestingVariantId() {
        return GAState.getABTestingVariantId();
    }

    public static void startSession() {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.50
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                if (GAState.useManualSessionHandling() && GAState.isInitialized()) {
                    if (GAState.isEnabled() && GAState.sessionIsStarted()) {
                        GAState.endSessionAndStopQueue();
                    }
                    GAState.resumeSessionAndStartQueue();
                }
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "startSession";
            }
        });
    }

    public static void endSession() {
        if (GAState.useManualSessionHandling()) {
            onStop();
        }
    }

    static void onResume() {
        GAThreading.start();
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.51
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                GAState.resumeSessionAndStartQueue();
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "onResume";
            }
        });
    }

    static void onStop() {
        GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.GameAnalytics.52
            @Override // com.gameanalytics.sdk.threading.IBlock
            public void execute() {
                GAState.endSessionAndStopQueue();
            }

            @Override // com.gameanalytics.sdk.threading.IBlock
            public String getName() {
                return "onStop";
            }
        });
    }

    private static Map<String, Object> jsonStringToMap(String s) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(s);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.get(next));
            }
        } catch (JSONException e) {
            GALogger.d("jsonStringToMap: failed to decode jsonString=" + s);
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.JsonStringToMap, EGASdkErrorAction.JsonError, e.toString(), GAState.getGameKey(), GAState.getSecretKey());
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isSdkReady(boolean needsInitialized) {
        return isSdkReady(needsInitialized, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isSdkReady(boolean needsInitialized, boolean warn) {
        return isSdkReady(needsInitialized, warn, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isSdkReady(boolean needsInitialized, boolean warn, String message) {
        if (message.length() != 0) {
            message = message + ": ";
        }
        if (!GAStore.getTableReady()) {
            if (warn) {
                GALogger.w(message + "Datastore not initialized");
            }
            return false;
        }
        if (needsInitialized && !GAState.isInitialized()) {
            if (warn) {
                GALogger.w(message + "SDK is not initialized");
            }
            return false;
        }
        if (needsInitialized && !GAState.isEnabled()) {
            if (warn) {
                GALogger.w(message + "SDK is disabled");
            }
            return false;
        }
        if (!needsInitialized || GAState.sessionIsStarted()) {
            return true;
        }
        if (warn) {
            GALogger.w(message + "Session has not started yet");
        }
        return false;
    }

    public static void enableSDKInitEvent(boolean value) {
        GAEvents.isSdkInitEventEnabled = value;
    }

    public static void enableFpsHistogram(boolean value) {
        GAState.enableFpsSampling(value);
    }

    public static void enableMemoryHistogram(boolean value) {
        GAState.enableMemorySampling(value);
    }

    public static void enableHealthHardwareInfo(boolean value) {
        GADevice.DeviceInfo.enableHardwareTracking = value;
        GADevice.DeviceInfo.enableMemoryTracking = value;
    }
}

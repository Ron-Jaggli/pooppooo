package com.gameanalytics.sdk.validators;

import android.text.TextUtils;
import android.util.Log;
import com.gameanalytics.sdk.Consts;
import com.gameanalytics.sdk.GAAdAction;
import com.gameanalytics.sdk.GAAdType;
import com.gameanalytics.sdk.GAErrorSeverity;
import com.gameanalytics.sdk.GAProgressionStatus;
import com.gameanalytics.sdk.GAResourceFlowType;
import com.gameanalytics.sdk.events.EGASdkErrorAction;
import com.gameanalytics.sdk.events.EGASdkErrorArea;
import com.gameanalytics.sdk.events.EGASdkErrorCategory;
import com.gameanalytics.sdk.events.EGASdkErrorParameter;
import com.gameanalytics.sdk.logging.GALogger;
import com.gameanalytics.sdk.state.GAState;
import com.gameanalytics.sdk.utilities.GAUtilities;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class GAValidator {
    public static boolean validateClientTs(long clientTs) {
        return clientTs >= 0 && clientTs <= 99999999999L;
    }

    public static ValidationResult validateBusinessEvent(final String currency, long amount, final String cartType, final String itemType, final String itemId, final String receipt, final String store, final String signature) {
        if (!validateCurrency(currency)) {
            GALogger.w("Validation fail - business event - currency: Cannot be (null) and need to be A-Z, 3 characters and in the standard at openexchangerates.org. Failed currency: " + currency);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.BusinessEvent, EGASdkErrorAction.InvalidCurrency, EGASdkErrorParameter.Currency, currency);
        }
        if (amount < 0) {
            GALogger.w("Validation fail - business event - amount: Cannot be less then 0. Failed amount: " + amount);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.BusinessEvent, EGASdkErrorAction.InvalidAmount, EGASdkErrorParameter.Amount, amount + "");
        }
        if (!validateShortString(cartType, true)) {
            GALogger.w("Validation fail - business event - cartType. Cannot be above 32 length. String: " + cartType);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.BusinessEvent, EGASdkErrorAction.InvalidShortString, EGASdkErrorParameter.CartType, cartType);
        }
        if (!validateEventPartLength(itemType, false)) {
            GALogger.w("Validation fail - business event - itemType: Cannot be (null), empty or above 64 characters. String: " + itemType);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.BusinessEvent, EGASdkErrorAction.InvalidEventPartLength, EGASdkErrorParameter.ItemType, itemType);
        }
        if (!validateEventPartCharacters(itemType)) {
            GALogger.w("Validation fail - business event - itemType: Cannot contain other characters than A-z, 0-9, -_., ()!?. String: " + itemType);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.BusinessEvent, EGASdkErrorAction.InvalidEventPartCharacters, EGASdkErrorParameter.ItemType, itemType);
        }
        if (!validateEventPartLength(itemId, false)) {
            GALogger.w("Validation fail - business event - itemId. Cannot be (null), empty or above 64 characters. String: " + itemId);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.BusinessEvent, EGASdkErrorAction.InvalidEventPartLength, EGASdkErrorParameter.ItemId, itemId);
        }
        if (!validateEventPartCharacters(itemId)) {
            GALogger.w("Validation fail - business event - itemId: Cannot contain other characters than A-z, 0-9, -_., ()!?. String: " + itemId);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.BusinessEvent, EGASdkErrorAction.InvalidEventPartCharacters, EGASdkErrorParameter.ItemId, itemId);
        }
        if (TextUtils.isEmpty(receipt) || validateStore(store)) {
            return null;
        }
        GALogger.w("Validation fail - business event - store: Is not one of the allowed values. String: " + store);
        return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.BusinessEvent, EGASdkErrorAction.InvalidStore, EGASdkErrorParameter.Store, store);
    }

    public static ValidationResult validateResourceEvent(GAResourceFlowType flowType, final String currency, long amount, final String itemType, final String itemId) {
        if (flowType.toString().length() == 0) {
            GALogger.w("Validation fail - resource event - flowType: Invalid flow type.");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.InvalidFlowType, EGASdkErrorParameter.FlowType, "");
        }
        if (TextUtils.isEmpty(currency)) {
            GALogger.w("Validation fail - resource event - currency: Cannot be (null)");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.StringEmptyOrNull, EGASdkErrorParameter.Currency, "");
        }
        if (!GAState.hasAvailableResourceCurrency(currency)) {
            GALogger.w("Validation fail - resource event - currency: Not found in list of pre-defined available resource currencies. String: " + currency);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.NotFoundInAvailableCurrencies, EGASdkErrorParameter.Currency, currency);
        }
        if (amount <= 0) {
            GALogger.w("Validation fail - resource event - amount: Float amount cannot be 0 or negative. Value: " + amount);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.InvalidAmount, EGASdkErrorParameter.Amount, amount + "");
        }
        if (TextUtils.isEmpty(itemType)) {
            GALogger.w("Validation fail - resource event - itemType: Cannot be (null)");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.StringEmptyOrNull, EGASdkErrorParameter.ItemType, "");
        }
        if (!validateEventPartLength(itemType, false)) {
            GALogger.w("Validation fail - resource event - itemType: Cannot be (null), empty or above 64 characters. String: " + itemType);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.InvalidEventPartLength, EGASdkErrorParameter.ItemType, itemType);
        }
        if (!validateEventPartCharacters(itemType)) {
            GALogger.w("Validation fail - resource event - itemType: Cannot contain other characters than A-z, 0-9, -_., ()!?. String: " + itemType);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.InvalidEventPartCharacters, EGASdkErrorParameter.ItemType, itemType);
        }
        if (!GAState.hasAvailableResourceItemType(itemType)) {
            GALogger.w("Validation fail - resource event - itemType: Not found in list of pre-defined available resource itemTypes. String: " + itemType);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.NotFoundInAvailableItemTypes, EGASdkErrorParameter.ItemType, itemType);
        }
        if (!validateEventPartLength(itemId, false)) {
            GALogger.w("Validation fail - resource event - itemId: Cannot be (null), empty or above 64 characters. String: " + itemId);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.InvalidEventPartLength, EGASdkErrorParameter.ItemId, itemId);
        }
        if (validateEventPartCharacters(itemId)) {
            return null;
        }
        GALogger.w("Validation fail - resource event - itemId: Cannot contain other characters than A-z, 0-9, -_., ()!?. String: " + itemId);
        return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.InvalidEventPartCharacters, EGASdkErrorParameter.ItemId, itemId);
    }

    public static ValidationResult validateProgressionEvent(GAProgressionStatus progressionStatus, final String progression01, final String progression02, final String progression03) {
        if (progressionStatus.toString().length() == 0) {
            GALogger.w("Validation fail - progression event: Invalid progression status.");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.InvalidProgressionStatus, EGASdkErrorParameter.ProgressionStatus, "");
        }
        if (!TextUtils.isEmpty(progression03) && TextUtils.isEmpty(progression02) && !TextUtils.isEmpty(progression01)) {
            GALogger.w("Validation fail - progression event: 03 found but 01+02 are invalid. Progression must be set as either 01, 01+02 or 01+02+03.");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.WrongProgressionOrder, EGASdkErrorParameter.Undefined, progression01 + ":" + progression02 + ":" + progression03);
        }
        if (!TextUtils.isEmpty(progression02) && TextUtils.isEmpty(progression01)) {
            GALogger.w("Validation fail - progression event: 02 found but not 01. Progression must be set as either 01, 01+02 or 01+02+03");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.WrongProgressionOrder, EGASdkErrorParameter.Undefined, progression01 + ":" + progression02 + ":" + progression03);
        }
        if (TextUtils.isEmpty(progression01)) {
            GALogger.w("Validation fail - progression event: progression01 not valid. Progressions must be set as either 01, 01+02 or 01+02+03");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.WrongProgressionOrder, EGASdkErrorParameter.Undefined, progression01 + ":" + progression02 + ":" + progression03);
        }
        if (!validateEventPartLength(progression01, false)) {
            GALogger.w("Validation fail - progression event - progression01: Cannot be (null), empty or above 64 characters. String: " + progression01);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.InvalidEventPartLength, EGASdkErrorParameter.Progression01, progression01);
        }
        if (!validateEventPartCharacters(progression01)) {
            GALogger.w("Validation fail - progression event - progression01: Cannot contain other characters than A-z, 0-9, -_., ()!?. String: " + progression01);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.InvalidEventPartCharacters, EGASdkErrorParameter.Progression01, progression01);
        }
        if (!TextUtils.isEmpty(progression02)) {
            if (!validateEventPartLength(progression02, true)) {
                GALogger.w("Validation fail - progression event - progression02: Cannot be empty or above 64 characters. String: " + progression02);
                return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.InvalidEventPartLength, EGASdkErrorParameter.Progression02, progression02);
            }
            if (!validateEventPartCharacters(progression02)) {
                GALogger.w("Validation fail - progression event - progression02: Cannot contain other characters than A-z, 0-9, -_., ()!?. String: " + progression02);
                return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.InvalidEventPartCharacters, EGASdkErrorParameter.Progression02, progression02);
            }
        }
        if (TextUtils.isEmpty(progression03)) {
            return null;
        }
        if (!validateEventPartLength(progression03, true)) {
            GALogger.w("Validation fail - progression event - progression03: Cannot be empty or above 64 characters. String: " + progression03);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.InvalidEventPartLength, EGASdkErrorParameter.Progression03, progression03);
        }
        if (validateEventPartCharacters(progression03)) {
            return null;
        }
        GALogger.w("Validation fail - progression event - progression03: Cannot contain other characters than A-z, 0-9, -_., ()!?. String: " + progression03);
        return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.InvalidEventPartCharacters, EGASdkErrorParameter.Progression03, progression03);
    }

    public static ValidationResult validateDesignEvent(final String eventId) {
        if (!validateEventIdLength(eventId)) {
            GALogger.w("Validation fail - design event - eventId: Cannot be (null) or empty. Only 5 event parts allowed separated by :. Each part need to be 64 characters or less. String: " + eventId);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.DesignEvent, EGASdkErrorAction.InvalidEventIdLength, EGASdkErrorParameter.EventId, eventId);
        }
        if (validateEventIdCharacters(eventId)) {
            return null;
        }
        GALogger.w("Validation fail - design event - eventId: Non valid characters. Only allowed A-z, 0-9, -_., ()!?. String: " + eventId);
        return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.DesignEvent, EGASdkErrorAction.InvalidEventIdCharacters, EGASdkErrorParameter.EventId, eventId);
    }

    public static ValidationResult validateErrorEvent(GAErrorSeverity severity, final String message) {
        if (severity.toString().length() == 0) {
            GALogger.w("Validation fail - error event - severity: Severity was unsupported value.");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ErrorEvent, EGASdkErrorAction.InvalidSeverity, EGASdkErrorParameter.Severity, "");
        }
        if (validateLongString(message, true)) {
            return null;
        }
        GALogger.w("Validation fail - error event - message: Message cannot be above 8192 characters.");
        return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ErrorEvent, EGASdkErrorAction.InvalidLongString, EGASdkErrorParameter.Message, message);
    }

    public static ValidationResult validateAdEvent(GAAdAction adAction, GAAdType adType, String adSdkName, String adPlacement) {
        if (adAction.toString().length() == 0) {
            GALogger.w("Validation fail - ad event - adAction: Ad action was unsupported value.");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.AdEvent, EGASdkErrorAction.InvalidAdAction, EGASdkErrorParameter.AdAction, "");
        }
        if (adType.toString().length() == 0) {
            GALogger.w("Validation fail - ad event - adType: Ad type was unsupported value.");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.AdEvent, EGASdkErrorAction.InvalidAdType, EGASdkErrorParameter.AdType, "");
        }
        if (!validateShortString(adSdkName, false)) {
            GALogger.w("Validation fail - ad event - message: Ad SDK name cannot be above 32 characters.");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.AdEvent, EGASdkErrorAction.InvalidShortString, EGASdkErrorParameter.AdSdkName, adSdkName);
        }
        if (validateString(adPlacement, false)) {
            return null;
        }
        GALogger.w("Validation fail - ad event - message: Ad placement cannot be above 64 characters.");
        return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.AdEvent, EGASdkErrorAction.InvalidString, EGASdkErrorParameter.AdPlacement, adPlacement);
    }

    public static ValidationResult validateImpressionEvent(String adNetworkName, String adNetworkVersion, JSONObject data) {
        if (!validateAdNetworkName(adNetworkName)) {
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ImpressionEvent, EGASdkErrorAction.InvalidAdNetworkName, EGASdkErrorParameter.AdNetwork, adNetworkName);
        }
        if (!validateAdNetworkVersion(adNetworkVersion)) {
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ImpressionEvent, EGASdkErrorAction.InvalidAdNetworkVersion, EGASdkErrorParameter.AdNetworkVersion, adNetworkVersion);
        }
        if (data == null || data.length() == 0) {
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ImpressionEvent, EGASdkErrorAction.ImpressionDataIsNull, EGASdkErrorParameter.ImpressionData, "");
        }
        Iterator<String> itKeys = data.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                if (data.isNull(next)) {
                    String str = "Impression event field: " + next + " is empty.";
                    GALogger.e(str);
                    return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ImpressionEvent, EGASdkErrorAction.ImpressionDataIsNull, EGASdkErrorParameter.ImpressionData, str);
                }
            } catch (Exception e) {
                GALogger.e("An exception occurred while validating an impression event.");
                e.printStackTrace();
                return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ImpressionEvent, EGASdkErrorAction.ImpressionDataIsNull, EGASdkErrorParameter.ImpressionData, e.getMessage());
            }
        }
        return null;
    }

    public static boolean validateSdkErrorEvent(final String gameKey, final String gameSecret, EGASdkErrorCategory category, EGASdkErrorArea area, EGASdkErrorAction action) {
        if (!validateKeys(gameKey, gameSecret)) {
            GALogger.w("validateSdkErrorEvent failed. Game key or secret key is invalid. Can only contain characters A-z 0-9, gameKey is 32 length, gameSecret is 40 length. Failed keys - gameKey: " + gameKey + ", secretKey: " + gameSecret);
            return false;
        }
        if (category.toString().length() == 0) {
            GALogger.w("Validation fail - sdk error event - category: Category was unsupported value.");
            return false;
        }
        if (area.toString().length() == 0) {
            GALogger.w("Validation fail - sdk error event - area: Area was unsupported value.");
            return false;
        }
        if (action.toString().length() != 0) {
            return true;
        }
        GALogger.w("Validation fail - sdk error event - action: Action was unsupported value.");
        return false;
    }

    public static boolean validateKeys(final String gameKey, final String gameSecret) {
        return GAUtilities.stringMatch(gameKey, "^[A-z0-9]{32}$") && GAUtilities.stringMatch(gameSecret, "^[A-z0-9]{40}$");
    }

    public static boolean validateCurrency(final String currency) {
        return !TextUtils.isEmpty(currency) && GAUtilities.stringMatch(currency, "^[A-Z]{3}$");
    }

    public static boolean validateEventPartLength(final String eventPart, boolean allowNull) {
        return validateString(eventPart, allowNull);
    }

    public static boolean validateEventPartCharacters(final String eventPart) {
        return GAUtilities.stringMatch(eventPart, "^[A-Za-z0-9\\s\\-_\\.\\(\\)\\!\\?]{1,64}$");
    }

    public static boolean validateEventIdLength(final String eventId) {
        return !TextUtils.isEmpty(eventId) && GAUtilities.stringMatch(eventId, "^[^:]{1,64}(?::[^:]{1,64}){0,4}$");
    }

    public static boolean validateEventIdCharacters(final String eventId) {
        return !TextUtils.isEmpty(eventId) && GAUtilities.stringMatch(eventId, "^[A-Za-z0-9\\s\\-_\\.\\(\\)\\!\\?]{1,64}(:[A-Za-z0-9\\s\\-_\\.\\(\\)\\!\\?]{1,64}){0,4}$");
    }

    public static boolean validateShortString(final String shortString, boolean canBeEmpty) {
        if (canBeEmpty && TextUtils.isEmpty(shortString)) {
            return true;
        }
        return !TextUtils.isEmpty(shortString) && shortString.length() <= 32;
    }

    public static boolean validateString(final String string, boolean canBeEmpty) {
        if (canBeEmpty && TextUtils.isEmpty(string)) {
            return true;
        }
        return !TextUtils.isEmpty(string) && string.length() <= 64;
    }

    public static boolean validateMediumString(final String string, boolean canBeEmpty) {
        if (canBeEmpty && TextUtils.isEmpty(string)) {
            return true;
        }
        return !TextUtils.isEmpty(string) && string.length() <= 256;
    }

    private static boolean validateLongString(final String longString, boolean canBeEmpty) {
        if (canBeEmpty && TextUtils.isEmpty(longString)) {
            return true;
        }
        return !TextUtils.isEmpty(longString) && longString.length() <= 8192;
    }

    public static boolean validateSdkWrapperVersion(final String wrapperVersion) {
        return GAUtilities.stringMatch(wrapperVersion, "^(unity|unreal|corona|marmalade|cocos2d|xamarin|lumberyard|air|gamemaker|defold|nativescript|cordova|construct|stencyl|godot|flutter) [0-9]{0,5}(\\.[0-9]{0,5}){0,2}(([a,b]{0,1})|(\\-alpha|\\-beta))$");
    }

    public static boolean validateBuild(final String build) {
        return validateShortString(build, false);
    }

    public static boolean validateEngineVersion(final String engineVersion) {
        return engineVersion != null && GAUtilities.stringMatch(engineVersion, "^(unity|unreal|corona|marmalade|cocos2d|xamarin|lumberyard|gamemaker|defold|nativescript|cordova|construct|stencyl|godot) [0-9]{0,5}(\\.[0-9]{0,5}){0,2}$");
    }

    private static boolean validateStore(final String store) {
        return GAUtilities.stringMatch(store, "^(apple|google_play)$");
    }

    private static boolean validateAdNetworkName(final String network) {
        return GAUtilities.stringMatch(network, "^(mopub|fyber|ironsource|topon|hyperbid|max|aequus|admob)$");
    }

    private static boolean validateAdNetworkVersion(final String version) {
        return version != null && GAUtilities.stringMatch(version, "^[0-9]{0,5}(\\.[0-9]{0,5}){0,3}$");
    }

    public static boolean validateConnectionType(final String connectionType) {
        return GAUtilities.stringMatch(connectionType, "^(wwan|wifi|lan|offline)$");
    }

    public static boolean validateBundleID(final String bundleIdentifier) {
        if (validateMediumString(bundleIdentifier, false)) {
            return true;
        }
        Log.w(Consts.GA_SHARED_PREFERENCES_NAME, bundleIdentifier + " is not a valid application ID. Check your Gradle file.");
        return false;
    }

    public static boolean validateAppVersion(final String appVersion) {
        if (validateString(appVersion, false)) {
            return true;
        }
        Log.w(Consts.GA_SHARED_PREFERENCES_NAME, appVersion + " is not a valid version name. Check your Gradle file.");
        return false;
    }

    public static boolean validateAppBuild(final Integer appBuild) {
        if (appBuild.intValue() > 0) {
            return true;
        }
        Log.w(Consts.GA_SHARED_PREFERENCES_NAME, String.valueOf(appBuild) + " is not a valid version code. Check your Gradle file.");
        return false;
    }

    public static boolean validateAppSignature(final String appSignature) {
        if (validateString(appSignature, false)) {
            return true;
        }
        Log.w(Consts.GA_SHARED_PREFERENCES_NAME, appSignature + " is not a valid app signature.");
        return false;
    }

    public static boolean validateChannelId(final String channelId) {
        return validateMediumString(channelId, false);
    }

    public static boolean validateCustomDimensions(String... customDimensions) {
        return validateArrayOfStrings(20L, 32L, false, "custom dimensions", customDimensions);
    }

    public static boolean validateResourceCurrencies(String... resourceCurrencies) {
        if (!validateArrayOfStrings(50L, 64L, false, "resource currencies", resourceCurrencies)) {
            return false;
        }
        for (String str : resourceCurrencies) {
            if (!GAUtilities.stringMatch(str, "^[A-Za-z]+$")) {
                GALogger.w("resource currencies validation failed: a resource currency can only be A-Z, a-z. String was: " + str);
                return false;
            }
        }
        return true;
    }

    public static boolean validateResourceItemTypes(String... resourceItemTypes) {
        if (!validateArrayOfStrings(20L, 32L, false, "resource item types", resourceItemTypes)) {
            return false;
        }
        for (String str : resourceItemTypes) {
            if (!validateEventPartCharacters(str)) {
                GALogger.w("resource item types validation failed: a resource item type cannot contain other characters than A-z, 0-9, -_., ()!?. String was: " + str);
                return false;
            }
        }
        return true;
    }

    public static boolean validateDimension01(final String dimension01) {
        return TextUtils.isEmpty(dimension01) || GAState.hasAvailableCustomDimensions01(dimension01);
    }

    public static boolean validateDimension02(final String dimension02) {
        return TextUtils.isEmpty(dimension02) || GAState.hasAvailableCustomDimensions02(dimension02);
    }

    public static boolean validateDimension03(final String dimension03) {
        return TextUtils.isEmpty(dimension03) || GAState.hasAvailableCustomDimensions03(dimension03);
    }

    public static boolean validateArrayOfStrings(long maxCount, long maxStringLength, boolean allowNoValues, final String logTag, String... arrayOfStrings) {
        if (TextUtils.isEmpty(logTag)) {
            logTag = "Array";
        }
        if (arrayOfStrings == null) {
            GALogger.w(logTag + " validation failed: array cannot be null. ");
            return false;
        }
        if (!allowNoValues && arrayOfStrings.length == 0) {
            GALogger.w(logTag + " validation failed: array cannot be empty. ");
            return false;
        }
        if (maxCount > 0 && arrayOfStrings.length > maxCount) {
            GALogger.w(logTag + " validation failed: array cannot exceed " + maxCount + " values. It has " + arrayOfStrings.length + " values.");
            return false;
        }
        int length = arrayOfStrings.length;
        for (int i = 0; i < length; i++) {
            String str = arrayOfStrings[i];
            int length2 = str == null ? 0 : str.length();
            if (length2 == 0) {
                GALogger.w(logTag + " validation failed: contained an empty string.");
                return false;
            }
            if (maxStringLength > 0 && length2 > maxStringLength) {
                GALogger.w(logTag + " validation failed: a string exceeded max allowed length (which is: " + maxStringLength + "). String was: " + str);
                return false;
            }
        }
        return true;
    }

    public static boolean validateUserId(final String uId) {
        if (validateString(uId, false)) {
            return true;
        }
        GALogger.w("Validation fail - user id: id cannot be (null), empty or above 64 characters.");
        return false;
    }
}

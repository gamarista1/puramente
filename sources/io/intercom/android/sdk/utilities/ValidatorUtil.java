package io.intercom.android.sdk.utilities;

import android.app.Application;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.api.ApiFactory;
import io.intercom.android.sdk.logger.LumberMill;

public class ValidatorUtil {
    private static final String API_PREFIX = "android_sdk-";
    private static final Twig twig = LumberMill.getLogger();

    static boolean apiKeyIsMissingPrefix(String str) {
        if (str == null || !str.startsWith(API_PREFIX)) {
            return true;
        }
        return false;
    }

    static boolean apiKeyIsTooShort(String str) {
        if (str == null || str.length() < 52) {
            return true;
        }
        return false;
    }

    private static boolean appIdIsInvalid(String str) {
        if (str == null || ApiFactory.removeInvalidCharacters(str).isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isValidConstructorParams(Application application, String str, String str2) {
        boolean z10;
        if (application == null) {
            twig.e("The Application passed in was null.We need an Application to enable Intercom in your app", new Object[0]);
            z10 = false;
        } else {
            z10 = true;
        }
        if (appIdIsInvalid(str2)) {
            twig.e("The app ID (" + str2 + ") you provided is either null or empty. We need a valid app ID to enable Intercom in your app", new Object[0]);
            z10 = false;
        }
        if (apiKeyIsTooShort(str)) {
            twig.e("The API key provided (" + str + ") is too short.\nPlease check that you are using an Intercom Android SDK key and have not passed the appId into the apiKey field\n", new Object[0]);
            z10 = false;
        }
        if (!apiKeyIsMissingPrefix(str)) {
            return z10;
        }
        twig.e("The API key provided (" + str + ") does not begin with 'android_sdk-'.\nPlease check that you are using an Intercom Android SDK key and have not passed the appId into the apiKey field\n", new Object[0]);
        return false;
    }
}

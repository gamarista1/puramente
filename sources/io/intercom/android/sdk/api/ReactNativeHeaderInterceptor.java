package io.intercom.android.sdk.api;

import android.content.Context;
import android.util.Log;

public class ReactNativeHeaderInterceptor {
    public static void setReactNativeVersion(Context context, String str) {
        HeaderInterceptor.setReactNativeVersion(context, str);
        Log.d("ReactNativeHeader", "Registered RN Header");
        Log.d("ReactNativeHeader", str);
    }
}

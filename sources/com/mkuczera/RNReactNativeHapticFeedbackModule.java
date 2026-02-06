package com.mkuczera;

import android.os.Vibrator;
import android.provider.Settings;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

public class RNReactNativeHapticFeedbackModule extends ReactContextBaseJavaModule {
    ReactApplicationContext reactContext;

    public RNReactNativeHapticFeedbackModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    public String getName() {
        return "RNReactNativeHapticFeedback";
    }

    @ReactMethod
    public void trigger(String str, ReadableMap readableMap) {
        boolean z10 = readableMap.getBoolean("ignoreAndroidSystemSettings");
        int i10 = Settings.System.getInt(this.reactContext.getContentResolver(), "haptic_feedback_enabled", 0);
        if (z10 || i10 != 0) {
            Vibrator vibrator = (Vibrator) this.reactContext.getSystemService("vibrator");
            b a10 = c.a(str);
            if (vibrator != null && a10 != null) {
                a10.a(vibrator);
            }
        }
    }
}

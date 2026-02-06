package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public abstract class NativeI18nManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "I18nManager";

    public NativeI18nManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void allowRTL(boolean z10);

    @a
    @ReactMethod
    public abstract void forceRTL(boolean z10);

    @a
    public final Map<String, Object> getConstants() {
        Map<String, Object> typedExportedConstants = getTypedExportedConstants();
        if (E7.a.f30669b || E7.a.f30670c) {
            HashSet hashSet = new HashSet(Arrays.asList(new String[]{"doLeftAndRightSwapInRTL", "isRTL"}));
            HashSet hashSet2 = new HashSet(Arrays.asList(new String[]{"localeIdentifier"}));
            HashSet hashSet3 = new HashSet(typedExportedConstants.keySet());
            hashSet3.removeAll(hashSet);
            hashSet3.removeAll(hashSet2);
            if (hashSet3.isEmpty()) {
                hashSet.removeAll(typedExportedConstants.keySet());
                if (!hashSet.isEmpty()) {
                    throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", new Object[]{hashSet}));
                }
            } else {
                throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", new Object[]{hashSet3}));
            }
        }
        return typedExportedConstants;
    }

    public String getName() {
        return "I18nManager";
    }

    /* access modifiers changed from: protected */
    public abstract Map<String, Object> getTypedExportedConstants();

    @a
    @ReactMethod
    public abstract void swapLeftAndRightInRTL(boolean z10);
}

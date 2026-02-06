package com.th3rdwave.safeareacontext;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public abstract class NativeSafeAreaContextSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCSafeAreaContext";

    public NativeSafeAreaContextSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    public final Map<String, Object> getConstants() {
        Map<String, Object> typedExportedConstants = getTypedExportedConstants();
        if (E7.a.f30669b || E7.a.f30670c) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet(Arrays.asList(new String[]{"initialWindowMetrics"}));
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
        return "RNCSafeAreaContext";
    }

    /* access modifiers changed from: protected */
    public abstract Map<String, Object> getTypedExportedConstants();
}

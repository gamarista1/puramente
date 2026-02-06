package com.zoontek.rnpermissions;

import B7.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public abstract class NativeRNPermissionsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNPermissions";

    public NativeRNPermissionsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void check(String str, Promise promise);

    @a
    @ReactMethod
    public abstract void checkLocationAccuracy(Promise promise);

    @a
    @ReactMethod
    public abstract void checkMultiple(ReadableArray readableArray, Promise promise);

    @a
    @ReactMethod
    public abstract void checkNotifications(Promise promise);

    @a
    public final Map<String, Object> getConstants() {
        Map<String, Object> typedExportedConstants = getTypedExportedConstants();
        if (E7.a.f30669b || E7.a.f30670c) {
            HashSet hashSet = new HashSet(Arrays.asList(new String[]{"available"}));
            HashSet hashSet2 = new HashSet();
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
        return NAME;
    }

    /* access modifiers changed from: protected */
    public abstract Map<String, Object> getTypedExportedConstants();

    @a
    @ReactMethod
    public abstract void openPhotoPicker(Promise promise);

    @a
    @ReactMethod
    public abstract void openSettings(Promise promise);

    @a
    @ReactMethod
    public abstract void request(String str, Promise promise);

    @a
    @ReactMethod
    public abstract void requestLocationAccuracy(String str, Promise promise);

    @a
    @ReactMethod
    public abstract void requestMultiple(ReadableArray readableArray, Promise promise);

    @a
    @ReactMethod
    public abstract void requestNotifications(ReadableArray readableArray, Promise promise);

    @a
    @ReactMethod
    public abstract void shouldShowRequestRationale(String str, Promise promise);
}

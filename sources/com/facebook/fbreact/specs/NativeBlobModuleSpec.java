package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public abstract class NativeBlobModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "BlobModule";

    public NativeBlobModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void addNetworkingHandler();

    @a
    @ReactMethod
    public abstract void addWebSocketHandler(double d10);

    @a
    @ReactMethod
    public abstract void createFromParts(ReadableArray readableArray, String str);

    @a
    public final Map<String, Object> getConstants() {
        Map<String, Object> typedExportedConstants = getTypedExportedConstants();
        if (E7.a.f30669b || E7.a.f30670c) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet(Arrays.asList(new String[]{"BLOB_URI_HOST", "BLOB_URI_SCHEME"}));
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
    public abstract void release(String str);

    @a
    @ReactMethod
    public abstract void removeWebSocketHandler(double d10);

    @a
    @ReactMethod
    public abstract void sendOverSocket(ReadableMap readableMap, double d10);
}

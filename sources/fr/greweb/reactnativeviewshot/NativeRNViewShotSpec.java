package fr.greweb.reactnativeviewshot;

import B7.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeRNViewShotSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNViewShot";

    public NativeRNViewShotSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void captureRef(Double d10, ReadableMap readableMap, Promise promise);

    @a
    @ReactMethod
    public abstract void captureScreen(ReadableMap readableMap, Promise promise);

    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void releaseCapture(String str);
}

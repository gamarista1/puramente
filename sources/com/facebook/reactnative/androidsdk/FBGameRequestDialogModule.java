package com.facebook.reactnative.androidsdk;

import J6.a;
import com.amazon.a.a.o.b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import v8.C4113c;

@Q7.a(name = "FBGameRequestDialog")
public class FBGameRequestDialogModule extends FBSDKCallbackManagerBaseJavaModule {
    public static final String NAME = "FBGameRequestDialog";

    private class a extends e {
        public a(Promise promise) {
            super(promise);
        }

        /* renamed from: b */
        public void onSuccess(a.f fVar) {
            if (this.f42385a != null) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString(b.f37444B, fVar.a());
                createMap.putArray("to", f.l(fVar.b()));
                this.f42385a.resolve(createMap);
                this.f42385a = null;
            }
        }
    }

    public FBGameRequestDialogModule(ReactApplicationContext reactApplicationContext, a aVar) {
        super(reactApplicationContext, aVar);
    }

    @ReactMethod
    public void canShow(Promise promise) {
        promise.resolve(Boolean.valueOf(J6.a.r()));
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void show(ReadableMap readableMap, Promise promise) {
        if (getCurrentActivity() != null) {
            J6.a aVar = new J6.a(getCurrentActivity());
            C4113c d10 = f.d(readableMap);
            aVar.j(getCallbackManager(), new a(promise));
            aVar.m(d10);
            return;
        }
        promise.reject("No current activity.");
    }
}

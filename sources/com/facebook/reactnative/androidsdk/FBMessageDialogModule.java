package com.facebook.reactnative.androidsdk;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import t8.C4051b;
import v8.e;

@Q7.a(name = "FBMessageDialog")
public class FBMessageDialogModule extends FBSDKCallbackManagerBaseJavaModule {
    public static final String NAME = "FBMessageDialog";
    private boolean mShouldFailOnDataError;

    private class a extends e {
        public a(Promise promise) {
            super(promise);
        }

        /* renamed from: b */
        public void onSuccess(C4051b bVar) {
            if (this.f42385a != null) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("postId", bVar.a());
                this.f42385a.resolve(createMap);
                this.f42385a = null;
            }
        }
    }

    public FBMessageDialogModule(ReactApplicationContext reactApplicationContext, a aVar) {
        super(reactApplicationContext, aVar);
    }

    @ReactMethod
    public void canShow(ReadableMap readableMap, Promise promise) {
        if (getCurrentActivity() != null) {
            promise.resolve(Boolean.valueOf(new com.facebook.share.widget.a(getCurrentActivity()).b(f.e(readableMap))));
            return;
        }
        promise.reject("No current activity.");
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void setShouldFailOnDataError(boolean z10) {
        this.mShouldFailOnDataError = z10;
    }

    @ReactMethod
    public void show(ReadableMap readableMap, Promise promise) {
        if (getCurrentActivity() != null) {
            e e10 = f.e(readableMap);
            com.facebook.share.widget.a aVar = new com.facebook.share.widget.a(getCurrentActivity());
            aVar.t(this.mShouldFailOnDataError);
            aVar.j(getCallbackManager(), new a(promise));
            aVar.m(e10);
            return;
        }
        promise.reject("No current activity.");
    }
}

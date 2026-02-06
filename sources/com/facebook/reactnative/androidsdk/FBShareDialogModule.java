package com.facebook.reactnative.androidsdk;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.share.widget.e;
import java.util.Locale;
import t8.C4051b;

@Q7.a(name = "FBShareDialog")
public class FBShareDialogModule extends FBSDKCallbackManagerBaseJavaModule {
    public static final String NAME = "FBShareDialog";
    private e.d mShareDialogMode;
    private boolean mShouldFailOnError;

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

    public FBShareDialogModule(ReactApplicationContext reactApplicationContext, a aVar) {
        super(reactApplicationContext, aVar);
    }

    @ReactMethod
    public void canShow(ReadableMap readableMap, Promise promise) {
        boolean z10;
        if (getCurrentActivity() != null) {
            e eVar = new e(getCurrentActivity());
            if (this.mShareDialogMode == null) {
                z10 = eVar.b(f.e(readableMap));
            } else {
                z10 = eVar.q(f.e(readableMap), this.mShareDialogMode);
            }
            promise.resolve(Boolean.valueOf(z10));
            return;
        }
        promise.reject("No current activity.");
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void setMode(String str) {
        this.mShareDialogMode = e.d.valueOf(str.toUpperCase(Locale.ROOT));
    }

    @ReactMethod
    public void setShouldFailOnError(boolean z10) {
        this.mShouldFailOnError = z10;
    }

    @ReactMethod
    public void show(ReadableMap readableMap, Promise promise) {
        if (getCurrentActivity() != null) {
            e eVar = new e(getCurrentActivity());
            eVar.j(getCallbackManager(), new a(promise));
            eVar.t(this.mShouldFailOnError);
            if (this.mShareDialogMode != null) {
                eVar.u(f.e(readableMap), this.mShareDialogMode);
            } else {
                eVar.m(f.e(readableMap));
            }
        } else {
            promise.reject("No current activity.");
        }
    }
}

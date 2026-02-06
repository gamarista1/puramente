package com.facebook.reactnative.androidsdk;

import com.facebook.C3286a;
import com.facebook.C3294i;
import com.facebook.C3459v;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

@Q7.a(name = "FBAccessToken")
public class FBAccessTokenModule extends ReactContextBaseJavaModule {
    public static final String CHANGE_EVENT_NAME = "fbsdk.accessTokenDidChange";
    public static final String NAME = "FBAccessToken";
    private C3294i accessTokenTracker;
    /* access modifiers changed from: private */
    public final ReactApplicationContext mReactContext;

    class a extends C3294i {
        a() {
        }

        /* access modifiers changed from: protected */
        public void d(C3286a aVar, C3286a aVar2) {
            WritableMap writableMap;
            try {
                DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) FBAccessTokenModule.this.mReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
                if (aVar2 == null) {
                    writableMap = null;
                } else {
                    writableMap = f.a(aVar2);
                }
                rCTDeviceEventEmitter.emit(FBAccessTokenModule.CHANGE_EVENT_NAME, writableMap);
            } catch (RuntimeException unused) {
            }
        }
    }

    class b implements C3286a.C0623a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f42358a;

        b(Promise promise) {
            this.f42358a = promise;
        }

        public void a(C3459v vVar) {
            this.f42358a.reject((Throwable) vVar);
        }

        public void b(C3286a aVar) {
            this.f42358a.resolve(f.a(aVar));
        }
    }

    public FBAccessTokenModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mReactContext = reactApplicationContext;
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void getCurrentAccessToken(Callback callback) {
        WritableMap writableMap;
        if (C3286a.d() == null) {
            writableMap = null;
        } else {
            writableMap = f.a(C3286a.d());
        }
        callback.invoke(writableMap);
    }

    public String getName() {
        return NAME;
    }

    public void initialize() {
        super.initialize();
        this.accessTokenTracker = new a();
    }

    public void invalidate() {
        super.invalidate();
        C3294i iVar = this.accessTokenTracker;
        if (iVar != null) {
            iVar.f();
        }
    }

    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        C3294i iVar = this.accessTokenTracker;
        if (iVar != null) {
            iVar.f();
        }
    }

    @ReactMethod
    public void refreshCurrentAccessTokenAsync(Promise promise) {
        C3286a.q(new b(promise));
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void setCurrentAccessToken(ReadableMap readableMap) {
        C3286a.s(f.c(readableMap));
    }
}

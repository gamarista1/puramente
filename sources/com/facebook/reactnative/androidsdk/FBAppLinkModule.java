package com.facebook.reactnative.androidsdk;

import K5.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import o7.W;

@Q7.a(name = "FBAppLink")
public class FBAppLinkModule extends ReactContextBaseJavaModule {
    public static final String NAME = "FBAppLink";
    private final ReactApplicationContext mReactContext;

    class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f42360a;

        a(Promise promise) {
            this.f42360a = promise;
        }

        public void a(K5.a aVar) {
            if (aVar == null) {
                this.f42360a.resolve((Object) null);
            } else {
                this.f42360a.resolve(aVar.g().toString());
            }
        }
    }

    public FBAppLinkModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mReactContext = reactApplicationContext;
    }

    private a.b createCompletionHandler(Promise promise) {
        return new a(promise);
    }

    @ReactMethod
    public void fetchDeferredAppLink(Promise promise) {
        try {
            K5.a.c(this.mReactContext.getApplicationContext(), createCompletionHandler(promise));
        } catch (Exception e10) {
            promise.resolve((Object) null);
            W.m0(getName(), "Received error while fetching deferred app link", e10);
        }
    }

    public String getName() {
        return NAME;
    }
}

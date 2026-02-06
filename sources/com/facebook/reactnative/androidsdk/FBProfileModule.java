package com.facebook.reactnative.androidsdk;

import com.facebook.W;
import com.facebook.Z;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Timer;
import java.util.TimerTask;

@Q7.a(name = "FBProfile")
public class FBProfileModule extends ReactContextBaseJavaModule {
    public static final String NAME = "FBProfile";
    /* access modifiers changed from: private */
    public Z mProfileTracker;

    class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Timer f42371a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Callback f42372b;

        a(Timer timer, Callback callback) {
            this.f42371a = timer;
            this.f42372b = callback;
        }

        public void run() {
            this.f42371a.cancel();
            this.f42372b.invoke(new Object[0]);
        }
    }

    class b extends Z {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Timer f42374d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Callback f42375e;

        b(Timer timer, Callback callback) {
            this.f42374d = timer;
            this.f42375e = callback;
        }

        /* access modifiers changed from: protected */
        public void b(W w10, W w11) {
            this.f42374d.cancel();
            FBProfileModule.this.mProfileTracker.d();
            this.f42375e.invoke(f.m(w11));
        }
    }

    public FBProfileModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void getCurrentProfile(Callback callback) {
        if (W.b() == null) {
            Timer timer = new Timer();
            synchronized (timer) {
                timer.schedule(new a(timer, callback), 30000);
                this.mProfileTracker = new b(timer, callback);
            }
            return;
        }
        callback.invoke(f.m(W.b()));
    }

    public String getName() {
        return NAME;
    }
}

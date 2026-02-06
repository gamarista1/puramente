package com.ocetnik.timer;

import android.os.Handler;
import android.os.PowerManager;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class BackgroundTimerModule extends ReactContextBaseJavaModule {
    private Handler handler;
    private final LifecycleEventListener listener;
    private PowerManager powerManager;
    /* access modifiers changed from: private */
    public ReactContext reactContext;
    private Runnable runnable;
    /* access modifiers changed from: private */
    public PowerManager.WakeLock wakeLock;

    class a implements LifecycleEventListener {
        a() {
        }

        public void onHostDestroy() {
            if (BackgroundTimerModule.this.wakeLock.isHeld()) {
                BackgroundTimerModule.this.wakeLock.release();
            }
        }

        public void onHostPause() {
        }

        public void onHostResume() {
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            BackgroundTimerModule backgroundTimerModule = BackgroundTimerModule.this;
            backgroundTimerModule.sendEvent(backgroundTimerModule.reactContext, "backgroundTimer");
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f59177a;

        c(int i10) {
            this.f59177a = i10;
        }

        public void run() {
            if (BackgroundTimerModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) BackgroundTimerModule.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("backgroundTimer.timeout", Integer.valueOf(this.f59177a));
            }
        }
    }

    public BackgroundTimerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        a aVar = new a();
        this.listener = aVar;
        this.reactContext = reactApplicationContext;
        PowerManager powerManager2 = (PowerManager) getReactApplicationContext().getSystemService("power");
        this.powerManager = powerManager2;
        this.wakeLock = powerManager2.newWakeLock(1, "rohit_bg_wakelock");
        reactApplicationContext.addLifecycleEventListener(aVar);
    }

    /* access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext2, String str) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext2.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, (Object) null);
    }

    public String getName() {
        return "RNBackgroundTimer";
    }

    @ReactMethod
    public void setTimeout(int i10, double d10) {
        new Handler().postDelayed(new c(i10), (long) d10);
    }

    @ReactMethod
    public void start(int i10) {
        if (!this.wakeLock.isHeld()) {
            this.wakeLock.acquire();
        }
        this.handler = new Handler();
        b bVar = new b();
        this.runnable = bVar;
        this.handler.post(bVar);
    }

    @ReactMethod
    public void stop() {
        if (this.wakeLock.isHeld()) {
            this.wakeLock.release();
        }
        Handler handler2 = this.handler;
        if (handler2 != null) {
            handler2.removeCallbacks(this.runnable);
        }
    }
}

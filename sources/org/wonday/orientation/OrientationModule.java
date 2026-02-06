package org.wonday.orientation;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.provider.Settings;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.HashMap;
import java.util.Map;

public class OrientationModule extends ReactContextBaseJavaModule implements b {
    final ReactApplicationContext ctx;
    private boolean isConfigurationChangeReceiverRegistered = false;
    private boolean isLocked = false;
    /* access modifiers changed from: private */
    public String lastDeviceOrientationValue = "";
    /* access modifiers changed from: private */
    public String lastOrientationValue = "";
    final OrientationEventListener mOrientationListener;
    final BroadcastReceiver mReceiver;

    class a extends OrientationEventListener {
        a(Context context, int i10) {
            super(context, i10);
        }

        public void onOrientationChanged(int i10) {
            U5.a.b("ReactNative", "DeviceOrientation changed to " + i10);
            String a10 = OrientationModule.this.lastDeviceOrientationValue;
            if (i10 == -1) {
                a10 = "UNKNOWN";
            } else if (i10 > 355 || i10 < 5) {
                a10 = "PORTRAIT";
            } else if (i10 > 85 && i10 < 95) {
                a10 = "LANDSCAPE-RIGHT";
            } else if (i10 > 175 && i10 < 185) {
                a10 = "PORTRAIT-UPSIDEDOWN";
            } else if (i10 > 265 && i10 < 275) {
                a10 = "LANDSCAPE-LEFT";
            }
            Class cls = DeviceEventManagerModule.RCTDeviceEventEmitter.class;
            if (!OrientationModule.this.lastDeviceOrientationValue.equals(a10)) {
                OrientationModule.this.lastDeviceOrientationValue = a10;
                WritableMap createMap = Arguments.createMap();
                createMap.putString("deviceOrientation", a10);
                if (OrientationModule.this.ctx.hasActiveCatalystInstance()) {
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) OrientationModule.this.ctx.getJSModule(cls)).emit("deviceOrientationDidChange", createMap);
                }
            }
            String e10 = OrientationModule.this.getCurrentOrientation();
            if (!OrientationModule.this.lastOrientationValue.equals(e10)) {
                OrientationModule.this.lastOrientationValue = e10;
                U5.a.b("ReactNative", "Orientation changed to " + e10);
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putString("orientation", e10);
                if (OrientationModule.this.ctx.hasActiveCatalystInstance()) {
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) OrientationModule.this.ctx.getJSModule(cls)).emit("orientationDidChange", createMap2);
                }
            }
        }
    }

    class b extends BroadcastReceiver {
        b() {
        }

        public void onReceive(Context context, Intent intent) {
            String e10 = OrientationModule.this.getCurrentOrientation();
            OrientationModule.this.lastOrientationValue = e10;
            U5.a.b("ReactNative", "Orientation changed to " + e10);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("orientation", e10);
            if (OrientationModule.this.ctx.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) OrientationModule.this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
            }
        }
    }

    public OrientationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.ctx = reactApplicationContext;
        a aVar = new a(reactApplicationContext, 2);
        this.mOrientationListener = aVar;
        if (aVar.canDetectOrientation()) {
            U5.a.b("ReactNative", "orientation detect enabled.");
            aVar.enable();
        } else {
            U5.a.b("ReactNative", "orientation detect disabled.");
            aVar.disable();
        }
        this.mReceiver = new b();
        a.a().b(this);
    }

    private void compatRegisterReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z10) {
        int i10;
        if (Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
            context.registerReceiver(broadcastReceiver, intentFilter);
            return;
        }
        if (z10) {
            i10 = 2;
        } else {
            i10 = 4;
        }
        Intent unused = context.registerReceiver(broadcastReceiver, intentFilter, i10);
    }

    /* access modifiers changed from: private */
    public String getCurrentOrientation() {
        int rotation = ((WindowManager) getReactApplicationContext().getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return "PORTRAIT";
        }
        if (rotation == 1) {
            return "LANDSCAPE-LEFT";
        }
        if (rotation == 2) {
            return "PORTRAIT-UPSIDEDOWN";
        }
        if (rotation != 3) {
            return "UNKNOWN";
        }
        return "LANDSCAPE-RIGHT";
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void getAutoRotateState(Callback callback) {
        boolean z10 = false;
        if (Settings.System.getInt(this.ctx.getContentResolver(), "accelerometer_rotation", 0) == 1) {
            z10 = true;
        }
        callback.invoke(Boolean.valueOf(z10));
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("initialOrientation", getCurrentOrientation());
        return hashMap;
    }

    @ReactMethod
    public void getDeviceOrientation(Callback callback) {
        callback.invoke(this.lastDeviceOrientationValue);
    }

    public String getName() {
        return "Orientation";
    }

    @ReactMethod
    public void getOrientation(Callback callback) {
        callback.invoke(getCurrentOrientation());
    }

    @ReactMethod
    public void lockToLandscape() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.setRequestedOrientation(6);
            this.isLocked = true;
            this.lastOrientationValue = "LANDSCAPE-LEFT";
            WritableMap createMap = Arguments.createMap();
            createMap.putString("orientation", this.lastOrientationValue);
            Class cls = DeviceEventManagerModule.RCTDeviceEventEmitter.class;
            if (this.ctx.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(cls)).emit("orientationDidChange", createMap);
            }
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("orientation", this.lastOrientationValue);
            if (this.ctx.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(cls)).emit("lockDidChange", createMap2);
            }
        }
    }

    @ReactMethod
    public void lockToLandscapeLeft() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.setRequestedOrientation(0);
            this.isLocked = true;
            this.lastOrientationValue = "LANDSCAPE-LEFT";
            WritableMap createMap = Arguments.createMap();
            createMap.putString("orientation", this.lastOrientationValue);
            Class cls = DeviceEventManagerModule.RCTDeviceEventEmitter.class;
            if (this.ctx.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(cls)).emit("orientationDidChange", createMap);
            }
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("orientation", this.lastOrientationValue);
            if (this.ctx.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(cls)).emit("lockDidChange", createMap2);
            }
        }
    }

    @ReactMethod
    public void lockToLandscapeRight() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.setRequestedOrientation(8);
            this.isLocked = true;
            this.lastOrientationValue = "LANDSCAPE-RIGHT";
            WritableMap createMap = Arguments.createMap();
            createMap.putString("orientation", this.lastOrientationValue);
            Class cls = DeviceEventManagerModule.RCTDeviceEventEmitter.class;
            if (this.ctx.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(cls)).emit("orientationDidChange", createMap);
            }
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("orientation", this.lastOrientationValue);
            if (this.ctx.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(cls)).emit("lockDidChange", createMap2);
            }
        }
    }

    @ReactMethod
    public void lockToPortrait() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.setRequestedOrientation(1);
            this.isLocked = true;
            this.lastOrientationValue = "PORTRAIT";
            WritableMap createMap = Arguments.createMap();
            createMap.putString("orientation", this.lastOrientationValue);
            Class cls = DeviceEventManagerModule.RCTDeviceEventEmitter.class;
            if (this.ctx.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(cls)).emit("orientationDidChange", createMap);
            }
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("orientation", this.lastOrientationValue);
            if (this.ctx.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(cls)).emit("lockDidChange", createMap2);
            }
        }
    }

    @ReactMethod
    public void lockToPortraitUpsideDown() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.setRequestedOrientation(9);
            this.isLocked = true;
            this.lastOrientationValue = "PORTRAIT-UPSIDEDOWN";
            WritableMap createMap = Arguments.createMap();
            createMap.putString("orientation", this.lastOrientationValue);
            Class cls = DeviceEventManagerModule.RCTDeviceEventEmitter.class;
            if (this.ctx.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(cls)).emit("orientationDidChange", createMap);
            }
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("orientation", this.lastOrientationValue);
            if (this.ctx.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(cls)).emit("lockDidChange", createMap2);
            }
        }
    }

    public void release() {
        U5.a.b("ReactNative", "orientation detect disabled.");
        this.mOrientationListener.disable();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            try {
                if (this.isConfigurationChangeReceiverRegistered) {
                    currentActivity.unregisterReceiver(this.mReceiver);
                    this.isConfigurationChangeReceiverRegistered = false;
                }
            } catch (Exception e10) {
                U5.a.J("ReactNative", "Receiver already unregistered", e10);
            }
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    public void start() {
        U5.a.s("ReactNative", "orientation detect enabled.");
        this.mOrientationListener.enable();
        compatRegisterReceiver(this.ctx, this.mReceiver, new IntentFilter("onConfigurationChanged"), false);
        this.isConfigurationChangeReceiverRegistered = true;
    }

    public void stop() {
        U5.a.b("ReactNative", "orientation detect disabled.");
        this.mOrientationListener.disable();
        try {
            if (this.isConfigurationChangeReceiverRegistered) {
                this.ctx.unregisterReceiver(this.mReceiver);
                this.isConfigurationChangeReceiverRegistered = false;
            }
        } catch (Exception e10) {
            U5.a.J("ReactNative", "Receiver already unregistered", e10);
        }
    }

    @ReactMethod
    public void unlockAllOrientations() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.setRequestedOrientation(4);
            this.isLocked = false;
            this.lastOrientationValue = getCurrentOrientation();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("orientation", this.lastOrientationValue);
            Class cls = DeviceEventManagerModule.RCTDeviceEventEmitter.class;
            if (this.ctx.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(cls)).emit("orientationDidChange", createMap);
            }
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("orientation", "UNKNOWN");
            if (this.ctx.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(cls)).emit("lockDidChange", createMap2);
            }
        }
    }
}

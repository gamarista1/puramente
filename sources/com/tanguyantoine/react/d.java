package com.tanguyantoine.react;

import android.content.Intent;
import android.os.Build;
import androidx.core.app.r;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.tanguyantoine.react.MusicControlNotification;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f59993a;

    /* renamed from: b  reason: collision with root package name */
    private int f59994b;

    d(ReactApplicationContext reactApplicationContext, int i10) {
        this.f59993a = reactApplicationContext;
        this.f59994b = i10;
    }

    private static void l(ReactApplicationContext reactApplicationContext, String str, Object obj) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("name", str);
        if (obj != null) {
            if ((obj instanceof Double) || (obj instanceof Float)) {
                createMap.putDouble("value", ((Double) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                createMap.putBoolean("value", ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                createMap.putInt("value", ((Integer) obj).intValue());
            }
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNMusicControlEvent", createMap);
    }

    private void m() {
        r.f(this.f59993a).b(this.f59994b);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f59993a.stopService(new Intent(this.f59993a, MusicControlNotification.NotificationService.class));
        }
    }

    public void a() {
        l(this.f59993a, "skipForward", (Object) null);
    }

    public void b() {
        l(this.f59993a, "pause", (Object) null);
    }

    public void c() {
        l(this.f59993a, "play", (Object) null);
    }

    public void d() {
        l(this.f59993a, "skipBackward", (Object) null);
    }

    public void e(long j10) {
        l(this.f59993a, "seek", Double.valueOf(((double) j10) / 1000.0d));
    }

    public void f(float f10) {
        l(this.f59993a, "setRating", Float.valueOf(f10));
    }

    public void g(boolean z10) {
        l(this.f59993a, "setRating", Boolean.valueOf(z10));
    }

    public void h() {
        l(this.f59993a, "nextTrack", (Object) null);
    }

    public void i() {
        l(this.f59993a, "previousTrack", (Object) null);
    }

    public void j() {
        m();
        l(this.f59993a, "stop", (Object) null);
    }

    public void k(int i10) {
        l(this.f59993a, "volume", Integer.valueOf(i10));
    }
}

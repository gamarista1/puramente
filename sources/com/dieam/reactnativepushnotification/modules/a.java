package com.dieam.reactnativepushnotification.modules;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private ReactContext f39230a;

    public a(ReactContext reactContext) {
        this.f39230a = reactContext;
    }

    private JSONObject b(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj instanceof Bundle) {
                jSONObject.put(next, b((Bundle) obj));
            } else {
                jSONObject.put(next, JSONObject.wrap(obj));
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    public String a(Bundle bundle) {
        try {
            return b(bundle).toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Bundle bundle) {
        String a10 = a(bundle);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("dataJSON", a10);
        e("remoteNotificationReceived", createMap);
    }

    /* access modifiers changed from: package-private */
    public void d(Bundle bundle) {
        String a10 = a(bundle);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("dataJSON", a10);
        e("notificationActionReceived", createMap);
    }

    /* access modifiers changed from: package-private */
    public void e(String str, Object obj) {
        if (this.f39230a.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f39230a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
        }
    }
}

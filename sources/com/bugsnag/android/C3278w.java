package com.bugsnag.android;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.HashMap;
import java.util.Map;
import lf.C6514M;
import yf.C6798l;

/* renamed from: com.bugsnag.android.w  reason: case insensitive filesystem */
class C3278w {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f38944a;

    /* renamed from: b  reason: collision with root package name */
    private DeviceEventManagerModule.RCTDeviceEventEmitter f38945b;

    /* renamed from: c  reason: collision with root package name */
    private BugsnagReactNativePlugin f38946c;

    /* renamed from: d  reason: collision with root package name */
    private S0 f38947d;

    /* renamed from: com.bugsnag.android.w$a */
    class a implements C6798l {
        a() {
        }

        /* renamed from: a */
        public C6514M invoke(X0 x02) {
            C3278w.this.k(x02);
            return C6514M.f71813a;
        }
    }

    public C3278w(ReactApplicationContext reactApplicationContext) {
        this.f38944a = reactApplicationContext;
    }

    private void o(String str, Throwable th2) {
        S0 s02 = this.f38947d;
        s02.c("Failed to call " + str + " on bugsnag-plugin-react-native, continuing", th2);
    }

    private String s(ReadableMap readableMap, String str) {
        if (readableMap.hasKey(str)) {
            return readableMap.getString(str);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2) {
        try {
            this.f38946c.addFeatureFlag(str, str2);
        } catch (Throwable th2) {
            o("addFeatureFlag", th2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(ReadableArray readableArray) {
        try {
            int size = readableArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = readableArray.getMap(i10);
                String s10 = s(map, "name");
                if (s10 != null) {
                    this.f38946c.addFeatureFlag(s10, s(map, "variant"));
                }
            }
        } catch (Throwable th2) {
            o("addFeatureFlags", th2);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(String str, ReadableMap readableMap) {
        HashMap<String, Object> hashMap;
        try {
            BugsnagReactNativePlugin bugsnagReactNativePlugin = this.f38946c;
            if (readableMap != null) {
                hashMap = readableMap.toHashMap();
            } else {
                hashMap = null;
            }
            bugsnagReactNativePlugin.addMetadata(str, hashMap);
        } catch (Throwable th2) {
            o("addMetadata", th2);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(String str) {
        try {
            this.f38946c.clearFeatureFlag(str);
        } catch (Throwable th2) {
            o("clearFeatureFlag", th2);
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        try {
            this.f38946c.clearFeatureFlags();
        } catch (Throwable th2) {
            o("clearFeatureFlags", th2);
        }
    }

    /* access modifiers changed from: package-private */
    public void f(String str, String str2) {
        try {
            this.f38946c.clearMetadata(str, str2);
        } catch (Throwable th2) {
            o("clearMetadata", th2);
        }
    }

    public WritableMap g(ReadableMap readableMap) {
        try {
            A a10 = C3270s.a();
            try {
                this.f38945b = (DeviceEventManagerModule.RCTDeviceEventEmitter) this.f38944a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
                this.f38947d = a10.t();
                BugsnagReactNativePlugin bugsnagReactNativePlugin = (BugsnagReactNativePlugin) a10.x(BugsnagReactNativePlugin.class);
                this.f38946c = bugsnagReactNativePlugin;
                bugsnagReactNativePlugin.registerForMessageEvents(new a());
                return C3251k1.b(this.f38946c.configure(readableMap.toHashMap()));
            } catch (Throwable th2) {
                o("configure", th2);
                return new WritableNativeMap();
            }
        } catch (IllegalStateException unused) {
            throw new IllegalStateException("Failed to initialise the native Bugsnag Android client, please check you have added Bugsnag.start() in the onCreate() method of your Application subclass");
        }
    }

    public void h(ReadableMap readableMap, Promise promise) {
        promise.resolve(g(readableMap));
    }

    /* access modifiers changed from: package-private */
    public boolean i(ReadableMap readableMap) {
        try {
            this.f38946c.dispatch(readableMap.toHashMap());
            return true;
        } catch (Throwable th2) {
            o("dispatch", th2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void j(ReadableMap readableMap, Promise promise) {
        promise.resolve(Boolean.valueOf(i(readableMap)));
    }

    /* access modifiers changed from: package-private */
    public void k(X0 x02) {
        WritableNativeMap writableNativeMap;
        S0 s02 = this.f38947d;
        s02.g("Received MessageEvent: " + x02.b());
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", x02.b());
        String b10 = x02.b();
        b10.hashCode();
        char c10 = 65535;
        switch (b10.hashCode()) {
            case -758218687:
                if (b10.equals("AddFeatureFlag")) {
                    c10 = 0;
                    break;
                }
                break;
            case -656234348:
                if (b10.equals("UserUpdate")) {
                    c10 = 1;
                    break;
                }
                break;
            case 669693717:
                if (b10.equals("ClearFeatureFlag")) {
                    c10 = 2;
                    break;
                }
                break;
            case 773999416:
                if (b10.equals("ContextUpdate")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1070992632:
                if (b10.equals("MetadataUpdate")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 4:
                if (x02.a() != null) {
                    writableNativeMap = Arguments.makeNativeMap((Map<String, Object>) (Map) x02.a());
                } else {
                    writableNativeMap = null;
                }
                createMap.putMap("data", writableNativeMap);
                break;
            case 3:
                createMap.putString("data", (String) x02.a());
                break;
            default:
                S0 s03 = this.f38947d;
                s03.e("Received unknown message event " + x02.b() + ", ignoring");
                break;
        }
        this.f38945b.emit("bugsnag::sync", createMap);
    }

    /* access modifiers changed from: package-private */
    public WritableMap l(ReadableMap readableMap) {
        try {
            return C3251k1.b(this.f38946c.getPayloadInfo(readableMap.getBoolean("unhandled")));
        } catch (Throwable th2) {
            o("dispatch", th2);
            return new WritableNativeMap();
        }
    }

    /* access modifiers changed from: package-private */
    public void m(ReadableMap readableMap, Promise promise) {
        promise.resolve(l(readableMap));
    }

    /* access modifiers changed from: package-private */
    public void n(ReadableMap readableMap) {
        try {
            this.f38946c.leaveBreadcrumb(readableMap.toHashMap());
        } catch (Throwable th2) {
            o("leaveBreadcrumb", th2);
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        try {
            this.f38946c.pauseSession();
        } catch (Throwable th2) {
            o("pauseSession", th2);
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
        try {
            this.f38946c.resumeSession();
        } catch (Throwable th2) {
            o("resumeSession", th2);
        }
    }

    /* access modifiers changed from: package-private */
    public void r() {
        try {
            if (Boolean.TRUE.equals(Boolean.valueOf(C3270s.a().f38379o.k()))) {
                this.f38946c.resumeSession();
            }
        } catch (Throwable th2) {
            o("resumeSessionOnStartup", th2);
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        try {
            this.f38946c.startSession();
        } catch (Throwable th2) {
            o("startSession", th2);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(String str) {
        try {
            this.f38946c.updateCodeBundleId(str);
        } catch (Throwable th2) {
            o("updateCodeBundleId", th2);
        }
    }

    /* access modifiers changed from: package-private */
    public void v(String str) {
        try {
            this.f38946c.updateContext(str);
        } catch (Throwable th2) {
            o("updateContext", th2);
        }
    }

    /* access modifiers changed from: package-private */
    public void w(String str, String str2, String str3) {
        try {
            this.f38946c.updateUser(str, str2, str3);
        } catch (Throwable th2) {
            o("updateUser", th2);
        }
    }
}

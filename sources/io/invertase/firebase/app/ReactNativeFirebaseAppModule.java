package io.invertase.firebase.app;

import Ue.C5546a;
import Ue.C5547b;
import Ue.g;
import Ue.i;
import Ue.j;
import Ue.k;
import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ub.C5230g;

public class ReactNativeFirebaseAppModule extends ReactNativeFirebaseModule {
    private static final String TAG = "App";
    public static Map<String, String> authDomains = new HashMap();

    ReactNativeFirebaseAppModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    public static void configureAuthDomain(String str, String str2) {
        if (str2 != null) {
            Log.d(TAG, str + " custom authDomain " + str2);
            authDomains.put(str, str2);
            return;
        }
        authDomains.remove(str);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void deleteApp(String str, Promise promise) {
        C5230g p10 = C5230g.p(str);
        if (p10 != null) {
            p10.j();
        }
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void eventsAddListener(String str) {
        g.i().e(str);
    }

    @ReactMethod
    public void eventsGetListeners(Promise promise) {
        promise.resolve(g.i().h());
    }

    @ReactMethod
    public void eventsNotifyReady(Boolean bool) {
        g.i().m(bool);
    }

    @ReactMethod
    public void eventsPing(String str, ReadableMap readableMap, Promise promise) {
        g.i().o(new C5547b(str, C5546a.e(readableMap)));
        promise.resolve(C5546a.e(readableMap));
    }

    @ReactMethod
    public void eventsRemoveListener(String str, Boolean bool) {
        g.i().n(str, bool);
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (C5230g a10 : C5230g.n(getReactApplicationContext())) {
            arrayList.add(C5546a.a(a10));
        }
        hashMap.put("NATIVE_FIREBASE_APPS", arrayList);
        hashMap.put("FIREBASE_RAW_JSON", i.g().f());
        return hashMap;
    }

    public void initialize() {
        super.initialize();
        g.i().f(getContext());
    }

    @ReactMethod
    public void initializeApp(ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        C5230g d10 = C5546a.d(readableMap, readableMap2, getContext());
        configureAuthDomain(readableMap2.getString("name"), readableMap.getString("authDomain"));
        promise.resolve(C5546a.b(d10));
    }

    @ReactMethod
    public void jsonGetAll(Promise promise) {
        promise.resolve(i.g().b());
    }

    @ReactMethod
    public void metaGetAll(Promise promise) {
        promise.resolve(j.c().a());
    }

    @ReactMethod
    public void preferencesClearAll(Promise promise) {
        k.d().a();
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void preferencesGetAll(Promise promise) {
        promise.resolve(k.d().b());
    }

    @ReactMethod
    public void preferencesSetBool(String str, boolean z10, Promise promise) {
        k.d().e(str, z10);
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void preferencesSetString(String str, String str2, Promise promise) {
        k.d().f(str, str2);
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void setAutomaticDataCollectionEnabled(String str, Boolean bool) {
        C5230g.p(str).F(bool);
    }
}

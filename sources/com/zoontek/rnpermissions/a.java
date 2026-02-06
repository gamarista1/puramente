package com.zoontek.rnpermissions;

import U7.g;
import U7.h;
import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import androidx.core.app.r;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static int f60045a;

    /* renamed from: com.zoontek.rnpermissions.a$a  reason: collision with other inner class name */
    class C0880a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f60046a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f60047b;

        C0880a(Promise promise, String str) {
            this.f60046a = promise;
            this.f60047b = str;
        }

        public void invoke(Object... objArr) {
            int[] iArr = objArr[0];
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f60046a.resolve("granted");
            } else if (objArr[1].shouldShowRequestPermissionRationale(this.f60047b)) {
                this.f60046a.resolve("denied");
            } else {
                this.f60046a.resolve("blocked");
            }
        }
    }

    class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f60048a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WritableMap f60049b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f60050c;

        b(ArrayList arrayList, WritableMap writableMap, Promise promise) {
            this.f60048a = arrayList;
            this.f60049b = writableMap;
            this.f60050c = promise;
        }

        public void invoke(Object... objArr) {
            int[] iArr = objArr[0];
            g gVar = objArr[1];
            for (int i10 = 0; i10 < this.f60048a.size(); i10++) {
                String str = (String) this.f60048a.get(i10);
                if (iArr.length > 0 && iArr[i10] == 0) {
                    this.f60049b.putString(str, "granted");
                } else if (gVar.shouldShowRequestPermissionRationale(str)) {
                    this.f60049b.putString(str, "denied");
                } else {
                    this.f60049b.putString(str, "blocked");
                }
            }
            this.f60050c.resolve(this.f60049b);
        }
    }

    public static void a(ReactApplicationContext reactApplicationContext, String str, Promise promise) {
        if (str == null || h(str)) {
            promise.resolve("unavailable");
        } else if (reactApplicationContext.getBaseContext().checkSelfPermission(str) == 0) {
            promise.resolve("granted");
        } else {
            promise.resolve("denied");
        }
    }

    public static void b(Promise promise) {
        promise.reject("Permissions:checkLocationAccuracy", "checkLocationAccuracy is not supported on Android");
    }

    public static void c(ReactApplicationContext reactApplicationContext, ReadableArray readableArray, Promise promise) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Context baseContext = reactApplicationContext.getBaseContext();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            String string = readableArray.getString(i10);
            if (h(string)) {
                writableNativeMap.putString(string, "unavailable");
            } else if (baseContext.checkSelfPermission(string) == 0) {
                writableNativeMap.putString(string, "granted");
            } else {
                writableNativeMap.putString(string, "denied");
            }
        }
        promise.resolve(writableNativeMap);
    }

    public static void d(ReactApplicationContext reactApplicationContext, Promise promise) {
        promise.resolve(f(reactApplicationContext, "denied"));
    }

    public static Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put("available", Arguments.createArray());
        return hashMap;
    }

    private static WritableMap f(ReactApplicationContext reactApplicationContext, String str) {
        boolean a10 = r.f(reactApplicationContext).a();
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        if (a10) {
            str = "granted";
        }
        createMap.putString("status", str);
        createMap.putMap("settings", createMap2);
        return createMap;
    }

    private static g g(ReactApplicationContext reactApplicationContext) {
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        } else if (currentActivity instanceof g) {
            return (g) currentActivity;
        } else {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
    }

    private static boolean h(String str) {
        try {
            Manifest.permission.class.getField(str.replace("android.permission.", "").replace("com.android.voicemail.permission.", ""));
            return false;
        } catch (NoSuchFieldException unused) {
            return true;
        }
    }

    public static boolean i(ReactApplicationContext reactApplicationContext, SparseArray sparseArray, int i10, int[] iArr) {
        try {
            ((Callback) sparseArray.get(i10)).invoke(iArr, g(reactApplicationContext));
            sparseArray.remove(i10);
            if (sparseArray.size() == 0) {
                return true;
            }
            return false;
        } catch (Exception e10) {
            U5.a.p("PermissionsModule", e10, "Unexpected invocation of `onRequestPermissionsResult`", new Object[0]);
            return false;
        }
    }

    public static void j(Promise promise) {
        promise.reject("Permissions:openPhotoPicker", "openPhotoPicker is not supported on Android");
    }

    public static void k(ReactApplicationContext reactApplicationContext, Promise promise) {
        try {
            Intent intent = new Intent();
            String packageName = reactApplicationContext.getPackageName();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addFlags(268435456);
            intent.setData(Uri.fromParts("package", packageName, (String) null));
            reactApplicationContext.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("E_INVALID_ACTIVITY", (Throwable) e10);
        }
    }

    public static void l(ReactApplicationContext reactApplicationContext, h hVar, SparseArray sparseArray, String str, Promise promise) {
        if (str == null || h(str)) {
            promise.resolve("unavailable");
        } else if (reactApplicationContext.getBaseContext().checkSelfPermission(str) == 0) {
            promise.resolve("granted");
        } else {
            try {
                g g10 = g(reactApplicationContext);
                sparseArray.put(f60045a, new C0880a(promise, str));
                g10.b(new String[]{str}, f60045a, hVar);
                f60045a++;
            } catch (IllegalStateException e10) {
                promise.reject("E_INVALID_ACTIVITY", (Throwable) e10);
            }
        }
    }

    public static void m(Promise promise) {
        promise.reject("Permissions:requestLocationAccuracy", "requestLocationAccuracy is not supported on Android");
    }

    public static void n(ReactApplicationContext reactApplicationContext, h hVar, SparseArray sparseArray, ReadableArray readableArray, Promise promise) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = reactApplicationContext.getBaseContext();
        int i10 = 0;
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            String string = readableArray.getString(i11);
            if (h(string)) {
                writableNativeMap.putString(string, "unavailable");
            } else if (baseContext.checkSelfPermission(string) == 0) {
                writableNativeMap.putString(string, "granted");
            } else {
                arrayList.add(string);
            }
            i10++;
        }
        if (readableArray.size() == i10) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            g g10 = g(reactApplicationContext);
            sparseArray.put(f60045a, new b(arrayList, writableNativeMap, promise));
            g10.b((String[]) arrayList.toArray(new String[0]), f60045a, hVar);
            f60045a++;
        } catch (IllegalStateException e10) {
            promise.reject("E_INVALID_ACTIVITY", (Throwable) e10);
        }
    }

    public static void o(ReactApplicationContext reactApplicationContext, Promise promise) {
        promise.resolve(f(reactApplicationContext, "blocked"));
    }

    public static void p(ReactApplicationContext reactApplicationContext, String str, Promise promise) {
        if (str != null) {
            try {
                promise.resolve(Boolean.valueOf(g(reactApplicationContext).shouldShowRequestPermissionRationale(str)));
            } catch (IllegalStateException e10) {
                promise.reject("E_INVALID_ACTIVITY", (Throwable) e10);
            }
        } else {
            promise.resolve(Boolean.FALSE);
        }
    }
}

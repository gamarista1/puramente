package io.invertase.firebase.database;

import Ue.m;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.google.firebase.database.a;
import com.google.firebase.database.f;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.HashMap;

/* renamed from: io.invertase.firebase.database.a  reason: case insensitive filesystem */
public abstract class C6402a {
    private static WritableArray a(a aVar) {
        WritableArray createArray = Arguments.createArray();
        long j10 = 0;
        for (a aVar2 : aVar.c()) {
            long parseLong = Long.parseLong(aVar2.e());
            if (parseLong > j10) {
                while (j10 < parseLong) {
                    createArray.pushNull();
                    j10++;
                }
                j10 = parseLong;
            }
            Object e10 = e(aVar2);
            String name = e10.getClass().getName();
            if (name.equals("com.facebook.react.bridge.WritableNativeMap")) {
                createArray.pushMap((WritableMap) e10);
            } else if (name.equals("com.facebook.react.bridge.WritableNativeArray")) {
                createArray.pushArray((WritableArray) e10);
            } else if (name.equals("java.lang.Boolean")) {
                createArray.pushBoolean(((Boolean) e10).booleanValue());
            } else if (name.equals("java.lang.Long")) {
                createArray.pushDouble((double) ((Long) e10).longValue());
            } else if (name.equals("java.lang.Double")) {
                createArray.pushDouble(((Double) e10).doubleValue());
            } else if (!name.equals("java.lang.String")) {
                Log.w("DatabaseCommon", "Invalid type: " + e10.getClass().getName());
            } else {
                createArray.pushString((String) e10);
            }
            j10++;
        }
        return createArray;
    }

    private static WritableArray b(f fVar) {
        WritableArray createArray = Arguments.createArray();
        long j10 = 0;
        for (f fVar2 : fVar.c()) {
            long parseLong = Long.parseLong(fVar2.e());
            if (parseLong > j10) {
                while (j10 < parseLong) {
                    createArray.pushNull();
                    j10++;
                }
                j10 = parseLong;
            }
            Object f10 = f(fVar2);
            String name = f10.getClass().getName();
            if (name.equals("com.facebook.react.bridge.WritableNativeMap")) {
                createArray.pushMap((WritableMap) f10);
            } else if (name.equals("com.facebook.react.bridge.WritableNativeArray")) {
                createArray.pushArray((WritableArray) f10);
            } else if (name.equals("java.lang.Boolean")) {
                createArray.pushBoolean(((Boolean) f10).booleanValue());
            } else if (name.equals("java.lang.Long")) {
                createArray.pushDouble((double) ((Long) f10).longValue());
            } else if (name.equals("java.lang.Double")) {
                createArray.pushDouble(((Double) f10).doubleValue());
            } else if (!name.equals("java.lang.String")) {
                Log.w("DatabaseCommon", "Invalid type: " + f10.getClass().getName());
            } else {
                createArray.pushString((String) f10);
            }
            j10++;
        }
        return createArray;
    }

    private static WritableMap c(a aVar) {
        WritableMap createMap = Arguments.createMap();
        for (a aVar2 : aVar.c()) {
            Object e10 = e(aVar2);
            String name = e10.getClass().getName();
            if (name.equals("com.facebook.react.bridge.WritableNativeMap")) {
                createMap.putMap(aVar2.e(), (WritableMap) e10);
            } else if (name.equals("com.facebook.react.bridge.WritableNativeArray")) {
                createMap.putArray(aVar2.e(), (WritableArray) e10);
            } else if (name.equals("java.lang.Boolean")) {
                createMap.putBoolean(aVar2.e(), ((Boolean) e10).booleanValue());
            } else if (name.equals("java.lang.Long")) {
                createMap.putDouble(aVar2.e(), (double) ((Long) e10).longValue());
            } else if (name.equals("java.lang.Double")) {
                createMap.putDouble(aVar2.e(), ((Double) e10).doubleValue());
            } else if (!name.equals("java.lang.String")) {
                Log.w("DatabaseCommon", "Invalid type: " + e10.getClass().getName());
            } else {
                createMap.putString(aVar2.e(), (String) e10);
            }
        }
        return createMap;
    }

    private static WritableMap d(f fVar) {
        WritableMap createMap = Arguments.createMap();
        for (f fVar2 : fVar.c()) {
            Object f10 = f(fVar2);
            String name = f10.getClass().getName();
            if (name.equals("com.facebook.react.bridge.WritableNativeMap")) {
                createMap.putMap(fVar2.e(), (WritableMap) f10);
            } else if (name.equals("com.facebook.react.bridge.WritableNativeArray")) {
                createMap.putArray(fVar2.e(), (WritableArray) f10);
            } else if (name.equals("java.lang.Boolean")) {
                createMap.putBoolean(fVar2.e(), ((Boolean) f10).booleanValue());
            } else if (name.equals("java.lang.Long")) {
                createMap.putDouble(fVar2.e(), (double) ((Long) f10).longValue());
            } else if (name.equals("java.lang.Double")) {
                createMap.putDouble(fVar2.e(), ((Double) f10).doubleValue());
            } else if (!name.equals("java.lang.String")) {
                Log.w("DatabaseCommon", "Invalid type: " + f10.getClass().getName());
            } else {
                createMap.putString(fVar2.e(), (String) f10);
            }
        }
        return createMap;
    }

    public static Object e(a aVar) {
        if (aVar.j()) {
            if (h(aVar)) {
                return a(aVar);
            }
            return c(aVar);
        } else if (aVar.h() == null) {
            return null;
        } else {
            String name = aVar.h().getClass().getName();
            if (name.equals("java.lang.Boolean") || name.equals("java.lang.Long") || name.equals("java.lang.Double") || name.equals("java.lang.String")) {
                return aVar.h();
            }
            Log.w("DatabaseCommon", "Invalid type: " + name);
            return null;
        }
    }

    public static Object f(f fVar) {
        if (fVar.h()) {
            if (i(fVar)) {
                return b(fVar);
            }
            return d(fVar);
        } else if (fVar.g() == null) {
            return null;
        } else {
            String name = fVar.g().getClass().getName();
            if (name.equals("java.lang.Boolean") || name.equals("java.lang.Long") || name.equals("java.lang.Double") || name.equals("java.lang.String")) {
                return fVar.g();
            }
            Log.w("DatabaseCommon", "Invalid type: " + name);
            return null;
        }
    }

    public static HashMap g(a aVar) {
        WritableArray createArray = Arguments.createArray();
        WritableMap createMap = Arguments.createMap();
        HashMap hashMap = new HashMap();
        if (aVar.j()) {
            for (a aVar2 : aVar.c()) {
                createArray.pushString(aVar2.e());
                Object f10 = aVar2.f();
                if (f10 instanceof String) {
                    createMap.putString(aVar2.e(), (String) f10);
                } else if (f10 instanceof Double) {
                    createMap.putDouble(aVar2.e(), ((Double) f10).doubleValue());
                } else if (f10 == null) {
                    createMap.putNull(aVar2.e());
                }
            }
        }
        hashMap.put("childKeys", createArray);
        hashMap.put("childPriorities", createMap);
        return hashMap;
    }

    private static boolean h(a aVar) {
        long d10 = (aVar.d() * 2) - 1;
        long j10 = -1;
        for (a e10 : aVar.c()) {
            try {
                long parseLong = Long.parseLong(e10.e());
                if (parseLong > j10 && parseLong <= d10) {
                    j10 = parseLong;
                }
            } catch (NumberFormatException unused) {
            }
            return false;
        }
        return true;
    }

    private static boolean i(f fVar) {
        long d10 = (fVar.d() * 2) - 1;
        long j10 = -1;
        for (f e10 : fVar.c()) {
            try {
                long parseLong = Long.parseLong(e10.e());
                if (parseLong > j10 && parseLong <= d10) {
                    j10++;
                }
            } catch (NumberFormatException unused) {
            }
            return false;
        }
        return true;
    }

    public static void j(Promise promise, Exception exc) {
        N n10 = (N) exc;
        ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, n10.a(), n10.getMessage());
    }

    public static WritableMap k(a aVar) {
        WritableMap createMap = Arguments.createMap();
        HashMap g10 = g(aVar);
        createMap.putString(SubscriberAttributeKt.JSON_NAME_KEY, aVar.e());
        createMap.putBoolean("exists", aVar.b());
        createMap.putBoolean("hasChildren", aVar.j());
        createMap.putDouble("childrenCount", (double) aVar.d());
        createMap.putArray("childKeys", (ReadableArray) g10.get("childKeys"));
        createMap.putMap("childPriorities", (WritableMap) g10.get("childPriorities"));
        m.h("priority", aVar.f(), createMap);
        if (!aVar.j()) {
            m.h("value", aVar.h(), createMap);
        } else {
            Object e10 = e(aVar);
            if (e10 instanceof WritableNativeArray) {
                createMap.putArray("value", (WritableArray) e10);
            } else {
                createMap.putMap("value", (WritableMap) e10);
            }
        }
        return createMap;
    }

    public static WritableMap l(a aVar, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putMap("snapshot", k(aVar));
        createMap.putString("previousChildName", str);
        return createMap;
    }
}

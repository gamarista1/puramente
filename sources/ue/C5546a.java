package Ue;

import android.content.Context;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import io.invertase.firebase.app.ReactNativeFirebaseAppModule;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ub.C5230g;
import ub.p;

/* renamed from: Ue.a  reason: case insensitive filesystem */
public abstract class C5546a {

    /* renamed from: a  reason: collision with root package name */
    private static String f65186a = "RCTConvertFirebase";

    public static Map a(C5230g gVar) {
        String q10 = gVar.q();
        p r10 = gVar.r();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("name", q10);
        hashMap3.put("automaticDataCollectionEnabled", Boolean.valueOf(gVar.x()));
        hashMap2.put("apiKey", r10.b());
        hashMap2.put("appId", r10.c());
        hashMap2.put("projectId", r10.g());
        hashMap2.put("databaseURL", r10.d());
        hashMap2.put("gaTrackingId", r10.e());
        hashMap2.put("messagingSenderId", r10.f());
        hashMap2.put("storageBucket", r10.h());
        if (ReactNativeFirebaseAppModule.authDomains.get(q10) != null) {
            hashMap2.put("authDomain", ReactNativeFirebaseAppModule.authDomains.get(q10));
        }
        hashMap.put("options", hashMap2);
        hashMap.put("appConfig", hashMap3);
        return hashMap;
    }

    public static WritableMap b(C5230g gVar) {
        return Arguments.makeNativeMap((Map<String, Object>) a(gVar));
    }

    public static WritableMap c(String str, Object obj, WritableMap writableMap) {
        if (obj == null) {
            writableMap.putNull(str);
            return writableMap;
        }
        String name = obj.getClass().getName();
        if (name.equals("java.lang.Integer")) {
            writableMap.putInt(str, ((Integer) obj).intValue());
        } else if (name.equals("java.lang.Float")) {
            writableMap.putDouble(str, (double) ((Float) obj).floatValue());
        } else if (name.equals("java.lang.Boolean")) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (name.equals("java.lang.Long")) {
            writableMap.putDouble(str, (double) ((Long) obj).longValue());
        } else if (name.equals("java.lang.Double")) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
        } else if (name.equals("java.lang.String")) {
            writableMap.putString(str, (String) obj);
        } else if (!name.equals("org.json.JSONObject$1")) {
            if (List.class.isAssignableFrom(obj.getClass())) {
                writableMap.putArray(str, Arguments.makeNativeArray((List) obj));
            } else {
                if (Map.class.isAssignableFrom(obj.getClass())) {
                    WritableMap createMap = Arguments.createMap();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        c((String) entry.getKey(), entry.getValue(), createMap);
                    }
                    writableMap.putMap(str, createMap);
                } else {
                    String str2 = f65186a;
                    Log.d(str2, "utils:mapPutValue:unknownType:" + name);
                    writableMap.putNull(str);
                }
            }
        } else {
            writableMap.putString(str, obj.toString());
        }
        return writableMap;
    }

    public static C5230g d(ReadableMap readableMap, ReadableMap readableMap2, Context context) {
        C5230g gVar;
        p.b bVar = new p.b();
        String string = readableMap2.getString("name");
        bVar.b(readableMap.getString("apiKey"));
        bVar.c(readableMap.getString("appId"));
        bVar.g(readableMap.getString("projectId"));
        bVar.d(readableMap.getString("databaseURL"));
        if (readableMap.hasKey("gaTrackingId")) {
            bVar.e(readableMap.getString("gaTrackingId"));
        }
        bVar.h(readableMap.getString("storageBucket"));
        bVar.f(readableMap.getString("messagingSenderId"));
        if (string.equals("[DEFAULT]")) {
            gVar = C5230g.v(context, bVar.a());
        } else {
            gVar = C5230g.w(context, bVar.a(), string);
        }
        if (readableMap2.hasKey("automaticDataCollectionEnabled")) {
            gVar.G(readableMap2.getBoolean("automaticDataCollectionEnabled"));
        }
        if (readableMap2.hasKey("automaticResourceManagement")) {
            gVar.E(readableMap2.getBoolean("automaticResourceManagement"));
        }
        return gVar;
    }

    public static WritableMap e(ReadableMap readableMap) {
        WritableMap createMap = Arguments.createMap();
        createMap.merge(readableMap);
        return createMap;
    }

    public static List f(ReadableArray readableArray) {
        return readableArray.toArrayList();
    }

    public static Map g(ReadableMap readableMap) {
        return readableMap.toHashMap();
    }
}

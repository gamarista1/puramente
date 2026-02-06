package com.reactnativeactionsshortcuts;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import org.json.JSONArray;
import org.json.JSONObject;

final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f59232a = new a();

    /* renamed from: com.reactnativeactionsshortcuts.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0873a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f59233a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Null     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f59233a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reactnativeactionsshortcuts.a.C0873a.<clinit>():void");
        }
    }

    private a() {
    }

    public final JSONArray a(ReadableArray readableArray) {
        C6496s.h(readableArray, "array");
        JSONArray jSONArray = new JSONArray();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            switch (C0873a.f59233a[readableArray.getType(i10).ordinal()]) {
                case 1:
                    jSONArray.put(i10, (Object) null);
                    break;
                case 2:
                    jSONArray.put(i10, readableArray.getBoolean(i10));
                    break;
                case 3:
                    jSONArray.put(i10, readableArray.getDouble(i10));
                    break;
                case 4:
                    jSONArray.put(i10, readableArray.getString(i10));
                    break;
                case 5:
                    ReadableMap map = readableArray.getMap(i10);
                    C6496s.e(map);
                    jSONArray.put(i10, b(map));
                    break;
                case 6:
                    ReadableArray array = readableArray.getArray(i10);
                    C6496s.e(array);
                    jSONArray.put(i10, a(array));
                    break;
                default:
                    throw new C6535s();
            }
        }
        return jSONArray;
    }

    public final JSONObject b(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (C0873a.f59233a[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    jSONObject.put(nextKey, (Object) null);
                    break;
                case 2:
                    jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    jSONObject.put(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 4:
                    jSONObject.put(nextKey, readableMap.getString(nextKey));
                    break;
                case 5:
                    ReadableMap map = readableMap.getMap(nextKey);
                    C6496s.e(map);
                    jSONObject.put(nextKey, b(map));
                    break;
                case 6:
                    ReadableArray array = readableMap.getArray(nextKey);
                    C6496s.e(array);
                    jSONObject.put(nextKey, a(array));
                    break;
                default:
                    throw new C6535s();
            }
        }
        return jSONObject;
    }

    public final WritableArray c(JSONArray jSONArray) {
        C6496s.h(jSONArray, "jsonArray");
        WritableArray createArray = Arguments.createArray();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONObject) {
                createArray.pushMap(d((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                createArray.pushArray(c((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                createArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                createArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                createArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                createArray.pushString((String) obj);
            } else {
                createArray.pushString(obj.toString());
            }
        }
        C6496s.e(createArray);
        return createArray;
    }

    public final WritableMap d(JSONObject jSONObject) {
        C6496s.h(jSONObject, "jsonObject");
        WritableMap createMap = Arguments.createMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                C6496s.e(next);
                createMap.putMap(next, d((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                C6496s.e(next);
                createMap.putArray(next, c((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                C6496s.e(next);
                createMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                C6496s.e(next);
                createMap.putInt(next, ((Number) obj).intValue());
            } else if (obj instanceof Double) {
                C6496s.e(next);
                createMap.putDouble(next, ((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                C6496s.e(next);
                createMap.putString(next, (String) obj);
            } else {
                C6496s.e(next);
                createMap.putString(next, obj.toString());
            }
        }
        C6496s.e(createMap);
        return createMap;
    }
}

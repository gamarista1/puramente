package com.google.firebase.functions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class z {

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f57277a;

    z() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        this.f57277a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public Object a(Object obj) {
        if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean)) {
            return obj;
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.has("@type")) {
                String optString = jSONObject.optString("@type");
                String optString2 = jSONObject.optString("value");
                if (optString.equals("type.googleapis.com/google.protobuf.Int64Value")) {
                    try {
                        return Long.valueOf(Long.parseLong(optString2));
                    } catch (NumberFormatException unused) {
                        throw new IllegalArgumentException("Invalid Long format:" + optString2);
                    }
                } else if (optString.equals("type.googleapis.com/google.protobuf.UInt64Value")) {
                    try {
                        return Long.valueOf(Long.parseLong(optString2));
                    } catch (NumberFormatException unused2) {
                        throw new IllegalArgumentException("Invalid Long format:" + optString2);
                    }
                }
            }
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, a(jSONObject.opt(next)));
            }
            return hashMap;
        } else if (obj instanceof JSONArray) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                JSONArray jSONArray = (JSONArray) obj;
                if (i10 >= jSONArray.length()) {
                    return arrayList;
                }
                arrayList.add(a(jSONArray.opt(i10)));
                i10++;
            }
        } else if (obj == JSONObject.NULL) {
            return null;
        } else {
            throw new IllegalArgumentException("Object cannot be decoded from JSON: " + obj);
        }
    }

    public Object b(Object obj) {
        boolean z10;
        boolean z11;
        if (obj == null || obj == JSONObject.NULL) {
            return JSONObject.NULL;
        }
        if (obj instanceof Long) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("@type", "type.googleapis.com/google.protobuf.Int64Value");
                jSONObject.put("value", obj.toString());
                return jSONObject;
            } catch (JSONException e10) {
                throw new RuntimeException("Error encoding Long.", e10);
            }
        } else if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean) || ((z10 = obj instanceof JSONObject)) || ((z11 = obj instanceof JSONArray))) {
            return obj;
        } else {
            if (obj instanceof Map) {
                JSONObject jSONObject2 = new JSONObject();
                Map map = (Map) obj;
                for (Object next : map.keySet()) {
                    if (next instanceof String) {
                        try {
                            jSONObject2.put((String) next, b(map.get(next)));
                        } catch (JSONException e11) {
                            throw new RuntimeException(e11);
                        }
                    } else {
                        throw new IllegalArgumentException("Object keys must be strings.");
                    }
                }
                return jSONObject2;
            } else if (obj instanceof List) {
                JSONArray jSONArray = new JSONArray();
                for (Object b10 : (List) obj) {
                    jSONArray.put(b(b10));
                }
                return jSONArray;
            } else if (z10) {
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = (JSONObject) obj;
                Iterator<String> keys = jSONObject4.keys();
                while (keys.hasNext()) {
                    String next2 = keys.next();
                    if (next2 != null) {
                        try {
                            jSONObject3.put(next2, b(jSONObject4.opt(next2)));
                        } catch (JSONException e12) {
                            throw new RuntimeException(e12);
                        }
                    } else {
                        throw new IllegalArgumentException("Object keys cannot be null.");
                    }
                }
                return jSONObject3;
            } else if (z11) {
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = (JSONArray) obj;
                for (int i10 = 0; i10 < jSONArray3.length(); i10++) {
                    jSONArray2.put(b(jSONArray3.opt(i10)));
                }
                return jSONArray2;
            } else {
                throw new IllegalArgumentException("Object cannot be encoded in JSON: " + obj);
            }
        }
    }
}

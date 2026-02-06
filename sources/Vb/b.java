package Vb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;

public abstract class b {
    public static Map a(String str) {
        try {
            return h(new JSONObject(str));
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    public static Object b(String str) {
        try {
            return f(new JSONTokener(str).nextValue());
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    public static String c(Map map) {
        return d(map);
    }

    public static String d(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        if (obj instanceof Number) {
            try {
                return JSONObject.numberToString((Number) obj);
            } catch (JSONException e10) {
                throw new IOException("Could not serialize number", e10);
            }
        } else if (!(obj instanceof Boolean)) {
            try {
                JSONStringer jSONStringer = new JSONStringer();
                e(obj, jSONStringer);
                return jSONStringer.toString();
            } catch (JSONException e11) {
                throw new IOException("Failed to serialize JSON", e11);
            }
        } else if (((Boolean) obj).booleanValue()) {
            return com.amazon.a.a.o.b.f37475af;
        } else {
            return com.amazon.a.a.o.b.f37476ag;
        }
    }

    private static void e(Object obj, JSONStringer jSONStringer) {
        if (obj instanceof Map) {
            jSONStringer.object();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONStringer.key((String) entry.getKey());
                e(entry.getValue(), jSONStringer);
            }
            jSONStringer.endObject();
        } else if (obj instanceof Collection) {
            jSONStringer.array();
            for (Object e10 : (Collection) obj) {
                e(e10, jSONStringer);
            }
            jSONStringer.endArray();
        } else {
            jSONStringer.value(obj);
        }
    }

    private static Object f(Object obj) {
        if (obj instanceof JSONObject) {
            return h((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return g((JSONArray) obj);
        }
        if (obj.equals(JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    private static List g(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(f(jSONArray.get(i10)));
        }
        return arrayList;
    }

    private static Map h(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, f(jSONObject.get(next)));
        }
        return hashMap;
    }
}

package Fe;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Fe.p  reason: case insensitive filesystem */
public class C3027p {

    /* renamed from: a  reason: collision with root package name */
    private final U f31139a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f31140b;

    /* renamed from: c  reason: collision with root package name */
    public ConcurrentHashMap f31141c = new ConcurrentHashMap();

    /* renamed from: Fe.p$a */
    private class a extends U {
        public a() {
        }
    }

    C3027p(Context context) {
        this.f31140b = context;
        this.f31139a = new a();
    }

    public static boolean b(Object obj, Object obj2) {
        return d(obj).equals(d(obj2));
    }

    private static Object d(Object obj) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, d(jSONObject.get(next)));
            }
            return hashMap;
        } else if (!(obj instanceof JSONArray)) {
            return obj;
        } else {
            JSONArray jSONArray = (JSONArray) obj;
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                hashSet.add(d(jSONArray.get(i10)));
            }
            return hashSet;
        }
    }

    public static C3027p e() {
        C3016e X10 = C3016e.X();
        if (X10 == null) {
            return null;
        }
        return X10.O();
    }

    public void a(JSONObject jSONObject, byte[] bArr) {
        this.f31141c.clear();
        try {
            jSONObject.getJSONObject("data").remove(y.CreationTimestamp.b());
            this.f31141c.put(jSONObject, bArr);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public byte[] c(JSONObject jSONObject) {
        if (this.f31141c.isEmpty()) {
            return null;
        }
        try {
            jSONObject.getJSONObject("data").remove(y.CreationTimestamp.b());
            JSONObject jSONObject2 = (JSONObject) this.f31141c.keySet().iterator().next();
            if (b(jSONObject, jSONObject2)) {
                return (byte[]) this.f31141c.get(jSONObject2);
            }
            return null;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}

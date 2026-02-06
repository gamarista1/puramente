package Db;

import Ba.C4246a;
import Ea.c;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C1587a;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzxy;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

abstract class H {

    /* renamed from: a  reason: collision with root package name */
    private static final C4246a f50454a = new C4246a("JSONParser", new String[0]);

    private static List a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map b(String str) {
        C4536s.f(str);
        List<String> zza = zzac.zza('.').zza((CharSequence) str);
        if (zza.size() < 2) {
            C4246a aVar = f50454a;
            aVar.c("Invalid idToken " + str, new Object[0]);
            return new HashMap();
        }
        try {
            Map d10 = d(new String(c.b(zza.get(1)), Constants.ENCODING));
            if (d10 == null) {
                return new HashMap();
            }
            return d10;
        } catch (UnsupportedEncodingException e10) {
            f50454a.b("Unable to decode token", e10, new Object[0]);
            return new HashMap();
        }
    }

    private static Map c(JSONObject jSONObject) {
        C1587a aVar = new C1587a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            }
            aVar.put(next, obj);
        }
        return aVar;
    }

    public static Map d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return c(jSONObject);
            }
            return null;
        } catch (Exception e10) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzxy(e10);
        }
    }
}

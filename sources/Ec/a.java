package Ec;

import Dc.o;
import Gc.d;
import Gc.e;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    f f50751a;

    /* renamed from: b  reason: collision with root package name */
    f f50752b;

    a(f fVar, f fVar2) {
        this.f50751a = fVar;
        this.f50752b = fVar2;
    }

    public static a a(f fVar, f fVar2) {
        return new a(fVar, fVar2);
    }

    private String c(String str) {
        String d10 = d(this.f50751a, str);
        if (d10 != null) {
            return d10;
        }
        String d11 = d(this.f50752b, str);
        if (d11 != null) {
            return d11;
        }
        return "";
    }

    private static String d(f fVar, String str) {
        g f10 = fVar.f();
        if (f10 == null) {
            return null;
        }
        try {
            return f10.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public e b(g gVar) {
        JSONArray j10 = gVar.j();
        long k10 = gVar.k();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (i10 < j10.length()) {
            try {
                JSONObject jSONObject = j10.getJSONObject(i10);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", new Object[]{string, jSONArray}));
                }
                String optString = jSONArray.optString(0, "");
                hashSet.add(d.a().d(string).f(jSONObject.getString("variantId")).b(optString).c(c(optString)).e(k10).a());
                i10++;
            } catch (JSONException e10) {
                throw new o("Exception parsing rollouts metadata to create RolloutsState.", (Throwable) e10);
            }
        }
        return e.a(hashSet);
    }
}

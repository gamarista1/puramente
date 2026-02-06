package Db;

import Ba.C4246a;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.android.gms.internal.p002firebaseauthapi.zzaft;
import com.google.android.gms.internal.p002firebaseauthapi.zzxy;
import com.google.firebase.auth.A;
import com.google.firebase.auth.J;
import com.google.firebase.auth.U;
import com.google.firebase.auth.Y;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ub.C5230g;

public final class X {

    /* renamed from: a  reason: collision with root package name */
    private Context f50480a;

    /* renamed from: b  reason: collision with root package name */
    private String f50481b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f50482c = this.f50480a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", new Object[]{this.f50481b}), 0);

    /* renamed from: d  reason: collision with root package name */
    private C4246a f50483d = new C4246a("StorageHelpers", new String[0]);

    public X(Context context, String str) {
        C4536s.l(context);
        this.f50481b = C4536s.f(str);
        this.f50480a = context.getApplicationContext();
    }

    private final C4258f a(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        Object obj;
        C4260h a10;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z10 = jSONObject.getBoolean("anonymous");
            String str = "2";
            String string3 = jSONObject.getString(DiagnosticsEntry.VERSION_KEY);
            if (string3 != null) {
                str = string3;
            }
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(A0.o0(jSONArray3.getString(i10)));
            }
            C4258f fVar = new C4258f(C5230g.p(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                fVar.L0(zzafm.zzb(string));
            }
            if (!z10) {
                fVar.M0();
            }
            fVar.R0(str);
            if (jSONObject.has("userMetadata") && (a10 = C4260h.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                fVar.S0(a10);
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i11));
                    String optString = jSONObject2.optString("factorIdKey");
                    if (AttributeType.PHONE.equals(optString)) {
                        obj = U.r0(jSONObject2);
                    } else if (Objects.equals(optString, "totp")) {
                        obj = Y.r0(jSONObject2);
                    } else {
                        obj = null;
                    }
                    arrayList2.add(obj);
                }
                fVar.P0(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    arrayList3.add(zzaft.zza(new JSONObject(jSONArray.getString(i12))));
                }
                fVar.N0(arrayList3);
            }
            return fVar;
        } catch (JSONException e10) {
            e = e10;
            this.f50483d.j(e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            this.f50483d.j(e);
            return null;
        } catch (IllegalArgumentException e12) {
            e = e12;
            this.f50483d.j(e);
            return null;
        } catch (zzxy e13) {
            e = e13;
            this.f50483d.j(e);
            return null;
        }
    }

    private final String g(A a10) {
        boolean z10;
        JSONObject jSONObject = new JSONObject();
        if (!C4258f.class.isAssignableFrom(a10.getClass())) {
            return null;
        }
        C4258f fVar = (C4258f) a10;
        try {
            jSONObject.put("cachedTokenState", fVar.zze());
            jSONObject.put("applicationName", fVar.K0().q());
            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (fVar.X0() != null) {
                JSONArray jSONArray = new JSONArray();
                List<A0> X02 = fVar.X0();
                int size = X02.size();
                if (X02.size() > 30) {
                    this.f50483d.h("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(X02.size()));
                    size = 30;
                }
                int i10 = 0;
                boolean z11 = false;
                while (true) {
                    z10 = true;
                    if (i10 >= size) {
                        break;
                    }
                    A0 a02 = (A0) X02.get(i10);
                    if (a02.r().equals("firebase")) {
                        z11 = true;
                    }
                    if (i10 == size - 1 && !z11) {
                        break;
                    }
                    jSONArray.put(a02.p0());
                    i10++;
                }
                if (!z11) {
                    int i11 = size - 1;
                    while (true) {
                        if (i11 >= X02.size() || i11 < 0) {
                            z10 = z11;
                        } else {
                            A0 a03 = (A0) X02.get(i11);
                            if (a03.r().equals("firebase")) {
                                jSONArray.put(a03.p0());
                                break;
                            }
                            if (i11 == X02.size() - 1) {
                                jSONArray.put(a03.p0());
                            }
                            i11++;
                        }
                    }
                    z10 = z11;
                    if (!z10) {
                        this.f50483d.h("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(X02.size()), Integer.valueOf(size));
                        if (X02.size() < 5) {
                            StringBuilder sb2 = new StringBuilder("Provider user info list:\n");
                            for (A0 r10 : X02) {
                                sb2.append(String.format("Provider - %s\n", new Object[]{r10.r()}));
                            }
                            this.f50483d.h(sb2.toString(), new Object[0]);
                        }
                    }
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", fVar.u0());
            jSONObject.put(DiagnosticsEntry.VERSION_KEY, "2");
            if (fVar.q0() != null) {
                jSONObject.put("userMetadata", ((C4260h) fVar.q0()).b());
            }
            List b10 = ((C4262j) fVar.r0()).b();
            if (b10 != null && !b10.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i12 = 0; i12 < b10.size(); i12++) {
                    jSONArray2.put(((J) b10.get(i12)).q0());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            List Q02 = fVar.Q0();
            if (Q02 != null && !Q02.isEmpty()) {
                JSONArray jSONArray3 = new JSONArray();
                for (int i13 = 0; i13 < Q02.size(); i13++) {
                    jSONArray3.put(zzaft.zza((zzaft) Q02.get(i13)));
                }
                jSONObject.put("passkeyInfo", jSONArray3);
            }
            return jSONObject.toString();
        } catch (Exception e10) {
            this.f50483d.i("Failed to turn object into JSON", e10, new Object[0]);
            throw new zzxy(e10);
        }
    }

    public final zzafm b(A a10) {
        C4536s.l(a10);
        String string = this.f50482c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{a10.a()}), (String) null);
        if (string != null) {
            return zzafm.zzb(string);
        }
        return null;
    }

    public final A c() {
        String string = this.f50482c.getString("com.google.firebase.auth.FIREBASE_USER", (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return a(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final void d(A a10, zzafm zzafm) {
        C4536s.l(a10);
        C4536s.l(zzafm);
        this.f50482c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{a10.a()}), zzafm.zzf()).apply();
    }

    public final void e(String str) {
        this.f50482c.edit().remove(str).apply();
    }

    public final void f(A a10) {
        C4536s.l(a10);
        String g10 = g(a10);
        if (!TextUtils.isEmpty(g10)) {
            this.f50482c.edit().putString("com.google.firebase.auth.FIREBASE_USER", g10).apply();
        }
    }
}

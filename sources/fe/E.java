package Fe;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.amazon.a.a.o.b.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class E {

    /* renamed from: g  reason: collision with root package name */
    private static E f30843g = null;

    /* renamed from: h  reason: collision with root package name */
    private static String f30844h = null;

    /* renamed from: i  reason: collision with root package name */
    private static String f30845i = null;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f30846j = false;

    /* renamed from: k  reason: collision with root package name */
    public static String f30847k;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f30848a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences.Editor f30849b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f30850c = new JSONObject();

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f30851d = new JSONObject();

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f30852e = new JSONObject();

    /* renamed from: f  reason: collision with root package name */
    final C3024m f30853f = new C3024m();

    private E(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("branch_referral_shared_pref", 0);
        this.f30848a = sharedPreferences;
        this.f30849b = sharedPreferences.edit();
    }

    public static E G(Context context) {
        if (f30843g == null) {
            f30843g = new E(context);
        }
        return f30843g;
    }

    private void c() {
        String J10 = J();
        String K10 = K();
        String m10 = m();
        String O10 = O();
        this.f30849b.clear();
        Q0(J10);
        R0(K10);
        w0(m10);
        T0(O10);
        this.f30849b.apply();
    }

    private ArrayList e(String str) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, str.split(f.f37529a));
        return arrayList;
    }

    private ArrayList h() {
        String a02 = a0("bnc_actions");
        if (a02.equals("bnc_no_value")) {
            return new ArrayList();
        }
        return e(a02);
    }

    static void m0(JSONObject jSONObject, C3024m mVar) {
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : mVar.d().entrySet()) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry entry2 : ((ConcurrentHashMap) entry.getValue()).entrySet()) {
                    jSONObject3.put((String) entry2.getKey(), entry2.getValue());
                }
                jSONObject2.put((String) entry.getKey(), jSONObject3);
            }
            jSONObject.put(y.PartnerData.b(), jSONObject2);
        }
    }

    private String o0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        String str = "";
        while (it.hasNext()) {
            str = str + ((String) it.next()) + f.f37529a;
        }
        return str.substring(0, str.length() - 1);
    }

    static void p0(String str) {
        f30844h = str;
    }

    private void s0(ArrayList arrayList) {
        if (arrayList.size() == 0) {
            b1("bnc_actions", "bnc_no_value");
        } else {
            b1("bnc_actions", o0(arrayList));
        }
    }

    static String t() {
        if (!TextUtils.isEmpty(f30845i)) {
            return f30845i;
        }
        return "https://cdn.branch.io/";
    }

    public String A() {
        return a0("bnc_google_search_install_identifier");
    }

    public void A0(String str, Boolean bool) {
        this.f30849b.putBoolean(str, bool.booleanValue()).apply();
    }

    public String B() {
        return a0("bnc_identity");
    }

    public boolean B0(String str) {
        if (a0("bnc_branch_key").equals(str)) {
            return false;
        }
        c();
        b1("bnc_branch_key", str);
        if (C3016e.X() == null) {
            return true;
        }
        C3016e.X().f31063j.clear();
        C3016e.X().f31062i.e();
        return true;
    }

    public String C() {
        String a02 = a0("bnc_initial_referrer");
        C3023l.l("getInitialReferrer " + a02);
        return a02;
    }

    public void C0(String str) {
        b1("bnc_branch_key_source", str);
    }

    /* access modifiers changed from: package-private */
    public String D(String str) {
        if (str == null) {
            return null;
        }
        try {
            return this.f30851d.get(str).toString();
        } catch (JSONException e10) {
            C3023l.a(e10.getMessage());
            return null;
        }
    }

    public void D0(C3032v vVar) {
        b1("bnc_consumer_protection_attribution_level", vVar.toString());
    }

    public JSONObject E() {
        return this.f30851d;
    }

    public void E0(boolean z10) {
        A0("bnc_delayed_session_init_used", Boolean.valueOf(z10));
    }

    public String F() {
        return a0("bnc_install_params");
    }

    /* access modifiers changed from: package-private */
    public void F0(boolean z10) {
        A0("bnc_dma_eea", Boolean.valueOf(z10));
    }

    public void G0(String str) {
        b1("bnc_external_intent_extra", str);
    }

    public int H(String str, int i10) {
        return this.f30848a.getInt(str, i10);
    }

    public void H0(String str) {
        b1("bnc_external_intent_uri", str);
    }

    public boolean I() {
        return q("bnc_is_meta_clickthrough");
    }

    public void I0(String str) {
        b1("bnc_google_search_install_identifier", str);
    }

    public String J() {
        return a0("bnc_link_click_id");
    }

    public void J0(String str) {
        b1("bnc_identity", str);
    }

    public String K() {
        return a0("bnc_link_click_identifier");
    }

    public void K0(String str) {
        C3023l.l("setInitialReferrer " + str);
        b1("bnc_initial_referrer", str);
    }

    public long L(String str) {
        return M(str, 0);
    }

    public void L0(String str) {
        b1("bnc_install_params", str);
    }

    public long M(String str, long j10) {
        return this.f30848a.getLong(str, j10);
    }

    public void M0(String str) {
        b1("bnc_install_referrer", str);
    }

    public int N() {
        return H("bnc_no_connection_retry_max", 3);
    }

    public void N0(String str, int i10) {
        this.f30849b.putInt(str, i10).apply();
    }

    public String O() {
        return a0("bnc_push_identifier");
    }

    public void O0(boolean z10) {
        A0("bnc_is_full_app_conversion", Boolean.valueOf(z10));
    }

    public String P() {
        String a02 = a0("bnc_randomized_bundle_token");
        if (TextUtils.isEmpty(a02) || a02.equals("bnc_no_value")) {
            return a0("bnc_identity_id");
        }
        return a02;
    }

    public void P0(boolean z10) {
        A0("bnc_is_meta_clickthrough", Boolean.valueOf(z10));
    }

    public String Q() {
        String a02 = a0("bnc_randomized_device_token");
        if (TextUtils.isEmpty(a02) || a02.equals("bnc_no_value")) {
            return a0("bnc_device_fingerprint_id");
        }
        return a02;
    }

    public void Q0(String str) {
        b1("bnc_link_click_id", str);
    }

    public String R() {
        return a0("bnc_randomly_generated_uuid");
    }

    public void R0(String str) {
        b1("bnc_link_click_identifier", str);
    }

    public String S() {
        String a02 = a0("bnc_gclid_json_object");
        if (a02.equals("bnc_no_value")) {
            return "bnc_no_value";
        }
        try {
            JSONObject jSONObject = new JSONObject(a02);
            if (((Long) jSONObject.get("bnc_gclid_expiration_date")).longValue() - System.currentTimeMillis() > 0) {
                return jSONObject.getString("bnc_gclid_value");
            }
            n0("bnc_gclid_json_object");
            return null;
        } catch (JSONException e10) {
            n0("bnc_gclid_json_object");
            e10.printStackTrace();
            return null;
        }
    }

    public void S0(String str, long j10) {
        this.f30849b.putLong(str, j10).apply();
    }

    public long T() {
        return M("bnc_gclid_expiration_window", 2592000000L);
    }

    public void T0(String str) {
        b1("bnc_push_identifier", str);
    }

    public JSONObject U() {
        String a02 = a0("bnc_referringUrlQueryParameters");
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(a02) || "bnc_no_value".equals(a02)) {
            return jSONObject;
        }
        try {
            return new JSONObject(a02);
        } catch (JSONException e10) {
            C3023l.m("Unable to get URL query parameters as string: " + e10);
            return jSONObject;
        }
    }

    public void U0(String str) {
        b1("bnc_randomized_bundle_token", str);
    }

    public JSONObject V() {
        return this.f30850c;
    }

    public void V0(String str) {
        b1("bnc_randomized_device_token", str);
    }

    public int W() {
        return H("bnc_retry_count", 3);
    }

    public void W0(String str) {
        b1("bnc_randomly_generated_uuid", str);
    }

    public int X() {
        return H("bnc_retry_interval", 1000);
    }

    public void X0(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            b1("bnc_referringUrlQueryParameters", "bnc_no_value");
        } else {
            b1("bnc_referringUrlQueryParameters", jSONObject.toString());
        }
    }

    public String Y() {
        return a0("bnc_session_id");
    }

    public void Y0(String str, String str2) {
        if (str != null) {
            if (this.f30850c.has(str) && str2 == null) {
                this.f30850c.remove(str);
            }
            try {
                this.f30850c.put(str, str2);
            } catch (JSONException unused) {
            }
        }
    }

    public String Z() {
        return a0("bnc_session_params");
    }

    public void Z0(String str) {
        b1("bnc_session_id", str);
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2) {
        if (str != null) {
            try {
                this.f30851d.putOpt(str, str2);
            } catch (JSONException e10) {
                C3023l.a(e10.getMessage());
            }
        }
    }

    public String a0(String str) {
        return this.f30848a.getString(str, "bnc_no_value");
    }

    public void a1(String str) {
        b1("bnc_session_params", str);
    }

    public void b() {
        n0("bnc_gclid_json_object");
    }

    public int b0() {
        return H("bnc_timeout", 5500) + H("bnc_connect_timeout", 10000);
    }

    public void b1(String str, String str2) {
        this.f30849b.putString(str, str2).apply();
    }

    public int c0() {
        return H("bnc_timeout", 5500);
    }

    public void c1(String str) {
        b1("bnc_user_url", str);
    }

    public void d() {
        Iterator it = h().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            q0(str, 0);
            r0(str, 0);
        }
        s0(new ArrayList());
    }

    public String d0() {
        return a0("bnc_user_url");
    }

    public void d1(long j10) {
        S0("bnc_url_load_ms", j10);
    }

    public long e0() {
        return L("bnc_url_load_ms");
    }

    public void e1(String str) {
        b1("bnc_enhanced_web_link_ux_used", str);
    }

    public String f() {
        if (URLUtil.isHttpsUrl(f30844h)) {
            return f30844h;
        }
        if (f30846j) {
            return "https://api3-eu.branch.io/";
        }
        return "https://api2.branch.io/";
    }

    public String f0() {
        return a0("bnc_enhanced_web_link_ux_used");
    }

    public String g(boolean z10) {
        if (z10 && URLUtil.isHttpsUrl(f30844h)) {
            return f30844h;
        }
        if (f30846j) {
            return "https://api3-eu.branch.io/";
        }
        return "https://api2.branch.io/";
    }

    public boolean g0(String str) {
        return this.f30848a.contains(str);
    }

    /* access modifiers changed from: package-private */
    public boolean h0() {
        return q("bnc_limit_facebook_tracking");
    }

    public boolean i() {
        return q("bnc_ad_network_callouts_disabled");
    }

    /* access modifiers changed from: package-private */
    public boolean i0() {
        return g0("bnc_consumer_protection_attribution_level");
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return q("bnc_dma_ad_personalization");
    }

    /* access modifiers changed from: package-private */
    public boolean j0() {
        if (g0("bnc_dma_eea")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return q("bnc_dma_ad_user_data");
    }

    public boolean k0() {
        return q("bnc_is_full_app_conversion");
    }

    public String l() {
        return a0("bnc_anon_id");
    }

    public void l0(JSONObject jSONObject) {
        m0(jSONObject, this.f30853f);
    }

    public String m() {
        return a0("bnc_app_link");
    }

    public String n() {
        return a0("bnc_google_play_install_referrer_extras");
    }

    public void n0(String str) {
        this.f30849b.remove(str).apply();
    }

    public String o() {
        return a0("bnc_app_store_source");
    }

    public String p() {
        return a0("bnc_app_version");
    }

    public boolean q(String str) {
        return this.f30848a.getBoolean(str, false);
    }

    public void q0(String str, int i10) {
        ArrayList h10 = h();
        if (!h10.contains(str)) {
            h10.add(str);
            s0(h10);
        }
        N0("bnc_total_base_" + str, i10);
    }

    public String r() {
        return a0("bnc_branch_key");
    }

    public void r0(String str, int i10) {
        N0("bnc_balance_base_" + str, i10);
    }

    public String s() {
        return a0("bnc_branch_key_source");
    }

    /* access modifiers changed from: package-private */
    public void t0(boolean z10) {
        A0("bnc_dma_ad_personalization", Boolean.valueOf(z10));
    }

    public int u() {
        return H("bnc_connect_timeout", 10000);
    }

    /* access modifiers changed from: package-private */
    public void u0(boolean z10) {
        A0("bnc_dma_ad_user_data", Boolean.valueOf(z10));
    }

    public C3032v v() {
        String a02 = a0("bnc_consumer_protection_attribution_level");
        if (a02.equals("bnc_no_value")) {
            return C3032v.FULL;
        }
        return C3032v.valueOf(a02);
    }

    public void v0(String str) {
        b1("bnc_anon_id", str);
    }

    public boolean w() {
        return q("bnc_delayed_session_init_used");
    }

    public void w0(String str) {
        b1("bnc_app_link", str);
    }

    /* access modifiers changed from: package-private */
    public boolean x() {
        return q("bnc_dma_eea");
    }

    public void x0(String str) {
        b1("bnc_google_play_install_referrer_extras", str);
    }

    public String y() {
        return a0("bnc_external_intent_extra");
    }

    public void y0(String str) {
        if (!TextUtils.isEmpty(str)) {
            b1("bnc_app_store_source", str);
        }
    }

    public String z() {
        return a0("bnc_external_intent_uri");
    }

    public void z0(String str) {
        b1("bnc_app_version", str);
    }
}

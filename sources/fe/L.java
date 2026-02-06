package Fe;

import Fe.C3016e;
import Je.g;
import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

abstract class L extends I {

    /* renamed from: l  reason: collision with root package name */
    private final Context f30921l;

    /* renamed from: m  reason: collision with root package name */
    C3016e.g f30922m;

    /* renamed from: n  reason: collision with root package name */
    boolean f30923n;

    L(Context context, B b10, boolean z10) {
        super(context, b10);
        this.f30921l = context;
        this.f30923n = !z10;
    }

    private void R(JSONObject jSONObject) {
        String a10 = C.d().a();
        long b10 = C.d().b();
        long e10 = C.d().e();
        int i10 = 2;
        if ("bnc_no_value".equals(this.f30898e.p())) {
            if (e10 - b10 < 86400000) {
                i10 = 0;
            }
        } else if (this.f30898e.p().equals(a10)) {
            i10 = 1;
        }
        jSONObject.put(y.Update.b(), i10);
        jSONObject.put(y.FirstInstallTime.b(), b10);
        jSONObject.put(y.LastUpdateTime.b(), e10);
        long L10 = this.f30898e.L("bnc_original_install_time");
        if (L10 == 0) {
            this.f30898e.S0("bnc_original_install_time", b10);
        } else {
            b10 = L10;
        }
        jSONObject.put(y.OriginalInstallTime.b(), b10);
        long L11 = this.f30898e.L("bnc_last_known_update_time");
        if (L11 < e10) {
            this.f30898e.S0("bnc_previous_update_time", L11);
            this.f30898e.S0("bnc_last_known_update_time", e10);
        }
        jSONObject.put(y.PreviousUpdateTime.b(), this.f30898e.L("bnc_previous_update_time"));
    }

    /* access modifiers changed from: protected */
    public void F(JSONObject jSONObject) {
        super.F(jSONObject);
        this.f30898e.l0(jSONObject);
        String a10 = C.d().a();
        if (!C.g(a10)) {
            jSONObject.put(y.AppVersion.b(), a10);
        }
        R(jSONObject);
        M(this.f30921l, jSONObject);
        String str = C3016e.f31046J;
        if (!TextUtils.isEmpty(str) && !str.equals("bnc_no_value")) {
            jSONObject.put(y.Identity.b(), str);
        }
    }

    /* access modifiers changed from: protected */
    public boolean G() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean I() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void Q(Q q10, C3016e eVar) {
        g.g(eVar.f31069p);
        eVar.Z0();
        C3023l.l("onInitSessionCompleted on thread " + Thread.currentThread().getName());
    }

    /* access modifiers changed from: package-private */
    public void S() {
        String K10 = this.f30898e.K();
        if (!K10.equals("bnc_no_value")) {
            try {
                l().put(y.LinkIdentifier.b(), K10);
            } catch (JSONException e10) {
                C3023l.m("Caught JSONException " + e10.getMessage());
            }
        }
        String A10 = this.f30898e.A();
        if (!A10.equals("bnc_no_value")) {
            try {
                l().put(y.GoogleSearchInstallReferrer.b(), A10);
            } catch (JSONException e11) {
                C3023l.m("Caught JSONException " + e11.getMessage());
            }
        }
        String n10 = this.f30898e.n();
        if (!n10.equals("bnc_no_value")) {
            try {
                l().put(y.GooglePlayInstallReferrer.b(), n10);
            } catch (JSONException e12) {
                C3023l.m("Caught JSONException " + e12.getMessage());
            }
        }
        String o10 = this.f30898e.o();
        if (!"bnc_no_value".equals(o10)) {
            try {
                if (o10.equals(y.Meta_Install_Referrer.b())) {
                    l().put(y.App_Store.b(), y.Google_Play_Store.b());
                    l().put(y.Is_Meta_Click_Through.b(), this.f30898e.I());
                } else {
                    l().put(y.App_Store.b(), o10);
                }
            } catch (JSONException e13) {
                C3023l.m("Caught JSONException " + e13.getMessage());
            }
        }
        if (this.f30898e.k0()) {
            try {
                l().put(y.AndroidAppLinkURL.b(), this.f30898e.m());
                l().put(y.IsFullAppConv.b(), true);
            } catch (JSONException e14) {
                C3023l.m("Caught JSONException " + e14.getMessage());
            }
        }
    }

    public void v() {
        super.v();
        JSONObject l10 = l();
        try {
            String m10 = this.f30898e.m();
            if (!m10.equals("bnc_no_value")) {
                l10.put(y.AndroidAppLinkURL.b(), m10);
            }
            String O10 = this.f30898e.O();
            if (!O10.equals("bnc_no_value")) {
                l10.put(y.AndroidPushIdentifier.b(), O10);
            }
            String z10 = this.f30898e.z();
            if (!z10.equals("bnc_no_value")) {
                l10.put(y.External_Intent_URI.b(), z10);
            }
            String y10 = this.f30898e.y();
            if (!y10.equals("bnc_no_value")) {
                l10.put(y.External_Intent_Extra.b(), y10);
            }
            String C10 = this.f30898e.C();
            if (!TextUtils.isEmpty(C10) && !C10.equals("bnc_no_value")) {
                l10.put(y.InitialReferrer.b(), C10);
            }
            String f02 = this.f30898e.f0();
            long e02 = this.f30898e.e0();
            if (!TextUtils.isEmpty(f02) && !"bnc_no_value".equals(f02)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(y.UX_Type.b(), f02);
                jSONObject.put(y.URL_Load_MS.b(), e02);
                l10.put(y.Web_Link_Context.b(), jSONObject);
                this.f30898e.e1((String) null);
                this.f30898e.d1(0);
            }
        } catch (JSONException e10) {
            C3023l.m("Caught JSONException " + e10.getMessage());
        }
        C3016e.D(false);
    }

    public void x(Q q10, C3016e eVar) {
        C3016e.X().Y0();
    }

    /* access modifiers changed from: protected */
    public boolean z() {
        JSONObject l10 = l();
        if (!l10.has(y.AndroidAppLinkURL.b()) && !l10.has(y.AndroidPushIdentifier.b()) && !l10.has(y.LinkIdentifier.b())) {
            return super.z();
        }
        l10.remove(y.RandomizedDeviceToken.b());
        l10.remove(y.RandomizedBundleToken.b());
        l10.remove(y.External_Intent_Extra.b());
        l10.remove(y.External_Intent_URI.b());
        l10.remove(y.FirstInstallTime.b());
        l10.remove(y.LastUpdateTime.b());
        l10.remove(y.OriginalInstallTime.b());
        l10.remove(y.PreviousUpdateTime.b());
        l10.remove(y.InstallBeginTimeStamp.b());
        l10.remove(y.ClickedReferrerTimeStamp.b());
        l10.remove(y.HardwareID.b());
        l10.remove(y.IsHardwareIDReal.b());
        l10.remove(y.LocalIP.b());
        l10.remove(y.ReferrerGclid.b());
        l10.remove(y.Identity.b());
        l10.remove(y.AnonID.b());
        try {
            l10.put(y.TrackingDisabled.b(), true);
        } catch (JSONException e10) {
            C3023l.m("Caught JSONException " + e10.getMessage());
        }
        return true;
    }
}

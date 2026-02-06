package Fe;

import Fe.C3016e;
import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

class O extends L {
    O(Context context, C3016e.g gVar, boolean z10) {
        super(context, B.RegisterInstall, z10);
        this.f30922m = gVar;
        try {
            F(new JSONObject());
        } catch (JSONException e10) {
            C3023l.m("Caught JSONException " + e10.getMessage());
            this.f30902i = true;
        }
    }

    public boolean H() {
        return false;
    }

    public void e() {
        C3023l.l(this + " clearCallbacks");
        this.f30922m = null;
    }

    public void q(int i10, String str) {
        if (this.f30922m != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
            } catch (JSONException e10) {
                C3023l.m("Caught JSONException " + e10.getMessage());
            }
            C3016e.g gVar = this.f30922m;
            gVar.a(jSONObject, new C3020i("Trouble initializing Branch. " + this + " failed. " + str, i10));
        }
    }

    public boolean s() {
        return false;
    }

    public void v() {
        super.v();
        long L10 = this.f30898e.L("bnc_referrer_click_ts");
        long L11 = this.f30898e.L("bnc_install_begin_ts");
        long L12 = this.f30898e.L("bnc_referrer_click_server_ts");
        long L13 = this.f30898e.L("bnc_install_begin_server_ts");
        if (L10 > 0) {
            try {
                l().put(y.ClickedReferrerTimeStamp.b(), L10);
            } catch (JSONException e10) {
                C3023l.m("Caught JSONException " + e10.getMessage());
                return;
            }
        }
        if (L11 > 0) {
            l().put(y.InstallBeginTimeStamp.b(), L11);
        }
        if (!C3014c.a().equals("bnc_no_value")) {
            l().put(y.LinkClickID.b(), C3014c.a());
        }
        if (L12 > 0) {
            l().put(y.ClickedReferrerServerTimeStamp.b(), L12);
        }
        if (L13 > 0) {
            l().put(y.InstallBeginServerTimeStamp.b(), L13);
        }
        if (C3016e.X() != null) {
            l().put(y.OperationalMetrics.b(), C3016e.X().Q().g());
        }
    }

    public void x(Q q10, C3016e eVar) {
        super.x(q10, eVar);
        try {
            this.f30898e.c1(q10.c().getString(y.Link.b()));
            JSONObject c10 = q10.c();
            y yVar = y.Data;
            if (c10.has(yVar.b())) {
                JSONObject jSONObject = new JSONObject(q10.c().getString(yVar.b()));
                y yVar2 = y.Clicked_Branch_Link;
                if (jSONObject.has(yVar2.b()) && jSONObject.getBoolean(yVar2.b()) && this.f30898e.F().equals("bnc_no_value")) {
                    this.f30898e.L0(q10.c().getString(yVar.b()));
                }
            }
            JSONObject c11 = q10.c();
            y yVar3 = y.LinkClickID;
            if (c11.has(yVar3.b())) {
                this.f30898e.Q0(q10.c().getString(yVar3.b()));
            } else {
                this.f30898e.Q0("bnc_no_value");
            }
            JSONObject c12 = q10.c();
            y yVar4 = y.Invoke_Features;
            if (!c12.has(yVar4.b()) || !q10.c().getJSONObject(yVar4.b()).has("enhanced_web_link_ux")) {
                if (q10.c().has(yVar.b())) {
                    this.f30898e.a1(q10.c().getString(yVar.b()));
                } else {
                    this.f30898e.a1("bnc_no_value");
                }
                C3016e.g gVar = this.f30922m;
                if (gVar != null) {
                    gVar.a(eVar.Z(), (C3020i) null);
                }
            } else {
                JSONObject jSONObject2 = q10.c().getJSONObject(yVar4.b());
                C3023l.l("Opening browser from install request.");
                eVar.A0(jSONObject2);
            }
            this.f30898e.z0(C.d().a());
        } catch (Exception e10) {
            C3023l.m("Caught Exception ServerRequestRegisterInstall onRequestSucceeded: " + e10.getMessage());
        }
        Q(q10, eVar);
    }
}

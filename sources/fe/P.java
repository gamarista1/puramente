package Fe;

import Fe.C3016e;
import android.content.Context;
import com.amazon.a.a.o.b;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import org.json.JSONException;
import org.json.JSONObject;

class P extends L {
    P(Context context, C3016e.g gVar, boolean z10) {
        super(context, B.RegisterOpen, z10);
        this.f30922m = gVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(y.RandomizedDeviceToken.b(), this.f30898e.Q());
            jSONObject.put(y.RandomizedBundleToken.b(), this.f30898e.P());
            F(jSONObject);
        } catch (JSONException e10) {
            C3023l.m("Caught JSONException " + e10.getMessage());
            this.f30902i = true;
        }
    }

    public boolean H() {
        return false;
    }

    public void e() {
        C3023l.l(this + " clearCallbacks " + this.f30922m);
        this.f30922m = null;
    }

    public void q(int i10, String str) {
        if (this.f30922m != null && !C3016e.X().m0()) {
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
        if (C3016e.X().n0()) {
            C3016e.g gVar = this.f30922m;
            if (gVar != null) {
                gVar.a(C3016e.X().Z(), (C3020i) null);
            }
            C3016e.X().f31062i.b(y.InstantDeepLinkSession.b(), b.f37475af);
            C3016e.X().R0(false);
        }
    }

    public void x(Q q10, C3016e eVar) {
        super.x(q10, eVar);
        C3023l.l("onRequestSucceeded " + this + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + q10 + " on callback " + this.f30922m);
        try {
            JSONObject c10 = q10.c();
            y yVar = y.LinkClickID;
            if (c10.has(yVar.b())) {
                this.f30898e.Q0(q10.c().getString(yVar.b()));
            } else {
                this.f30898e.Q0("bnc_no_value");
            }
            JSONObject c11 = q10.c();
            y yVar2 = y.Invoke_Features;
            if (!c11.has(yVar2.b()) || !q10.c().getJSONObject(yVar2.b()).has("enhanced_web_link_ux")) {
                JSONObject c12 = q10.c();
                y yVar3 = y.Data;
                if (c12.has(yVar3.b())) {
                    this.f30898e.a1(q10.c().getString(yVar3.b()));
                } else {
                    this.f30898e.a1("bnc_no_value");
                }
                if (this.f30922m != null && !C3016e.X().m0()) {
                    this.f30922m.a(eVar.Z(), (C3020i) null);
                }
            } else {
                JSONObject jSONObject = q10.c().getJSONObject(yVar2.b());
                C3023l.l("Opening browser from open request.");
                eVar.A0(jSONObject);
            }
            this.f30898e.z0(C.d().a());
        } catch (Exception e10) {
            C3023l.m("Caught Exception ServerRequestRegisterOpen onRequestSucceeded: " + e10.getMessage());
        }
        Q(q10, eVar);
    }
}

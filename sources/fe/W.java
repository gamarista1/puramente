package Fe;

import Fe.C3016e;
import android.content.Context;
import org.json.JSONObject;

public class W {

    /* renamed from: a  reason: collision with root package name */
    private boolean f31009a = true;

    W(Context context) {
        h(context);
    }

    public static boolean d(Context context) {
        return E.G(context).q("bnc_tracking_state");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e(C3016e.o oVar, JSONObject jSONObject, C3020i iVar) {
        if (oVar != null) {
            oVar.a(false, jSONObject, iVar);
        }
    }

    private void f(Context context) {
        C3016e.X().t();
        E G10 = E.G(context);
        G10.Z0("bnc_no_value");
        G10.Q0("bnc_no_value");
        G10.R0("bnc_no_value");
        G10.w0("bnc_no_value");
        G10.M0("bnc_no_value");
        G10.x0("bnc_no_value");
        G10.y0("bnc_no_value");
        G10.I0("bnc_no_value");
        G10.K0("bnc_no_value");
        G10.H0("bnc_no_value");
        G10.G0("bnc_no_value");
        G10.a1("bnc_no_value");
        G10.v0("bnc_no_value");
        G10.X0(new JSONObject());
        C3016e.X().s();
    }

    private void g(C3016e.g gVar) {
        C3023l.l("onTrackingEnabled callback: " + gVar);
        C3016e X10 = C3016e.X();
        if (X10 != null) {
            X10.D0(X10.W(gVar, true), false);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Context context, boolean z10, C3016e.o oVar) {
        C3023l.l("disableTracking context: " + context + " disableTracking: " + z10 + " callback: " + oVar);
        if (this.f31009a != z10) {
            this.f31009a = z10;
            E.G(context).A0("bnc_tracking_state", Boolean.valueOf(z10));
            if (z10) {
                C3023l.l("Tracking disabled. Clearing all pending requests");
                f(context);
                if (oVar != null) {
                    oVar.a(true, (JSONObject) null, (C3020i) null);
                    return;
                }
                return;
            }
            C3023l.l("Tracking enabled. Registering app init");
            g(new V(oVar));
        } else if (oVar != null) {
            C3023l.l("Tracking state is already set to " + z10 + ". Returning the same to the callback");
            oVar.a(this.f31009a, C3016e.X().U(), (C3020i) null);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f31009a;
    }

    /* access modifiers changed from: package-private */
    public void h(Context context) {
        this.f31009a = E.G(context).q("bnc_tracking_state");
    }
}

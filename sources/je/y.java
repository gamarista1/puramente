package Je;

import Fe.B;
import Fe.C3016e;
import Fe.I;
import Fe.Q;
import android.content.Context;
import org.json.JSONObject;

class y extends I {

    /* renamed from: l  reason: collision with root package name */
    private final a f32324l;

    public interface a {
        void a(JSONObject jSONObject);
    }

    public y(Context context, a aVar) {
        super(context, B.GetApp);
        this.f32324l = aVar;
    }

    public String o() {
        return this.f30898e.g(false) + n() + "/" + this.f30898e.r();
    }

    public void q(int i10, String str) {
        a aVar = this.f32324l;
        if (aVar != null) {
            aVar.a((JSONObject) null);
        }
    }

    public boolean s() {
        return true;
    }

    public void x(Q q10, C3016e eVar) {
        a aVar = this.f32324l;
        if (aVar != null) {
            aVar.a(q10.c());
        }
    }

    public void e() {
    }
}

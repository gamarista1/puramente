package Fe;

import Fe.I;
import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

public class K extends I {

    /* renamed from: l  reason: collision with root package name */
    private a f30919l;

    /* renamed from: m  reason: collision with root package name */
    private int f30920m;

    public interface a {
        void a(JSONObject jSONObject, C3020i iVar);
    }

    K(Context context, B b10, a aVar, int i10) {
        super(context, b10);
        this.f30919l = aVar;
        this.f30920m = i10;
        JSONObject jSONObject = new JSONObject();
        try {
            F(jSONObject);
        } catch (JSONException e10) {
            C3023l.m("Caught JSONException " + e10.getMessage());
        }
        M(context, jSONObject);
    }

    /* access modifiers changed from: protected */
    public boolean I() {
        return true;
    }

    /* access modifiers changed from: protected */
    public int Q() {
        return this.f30920m;
    }

    public void e() {
        this.f30919l = null;
    }

    public I.a j() {
        return I.a.V1_LATD;
    }

    public void q(int i10, String str) {
        a aVar = this.f30919l;
        if (aVar != null) {
            aVar.a((JSONObject) null, new C3020i("Failed to get last attributed touch data", i10));
        }
    }

    public boolean s() {
        return false;
    }

    public void x(Q q10, C3016e eVar) {
        a aVar = this.f30919l;
        if (aVar != null) {
            if (q10 != null) {
                aVar.a(q10.c(), (C3020i) null);
            } else {
                q(-116, "Failed to get last attributed touch data");
            }
        }
    }
}

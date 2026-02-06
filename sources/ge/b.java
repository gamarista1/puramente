package Ge;

import Fe.B;
import Fe.C3016e;
import Fe.I;
import Fe.Q;
import Ge.a;
import android.content.Context;
import org.json.JSONObject;

public class b extends I {

    /* renamed from: l  reason: collision with root package name */
    private JSONObject f31650l;

    /* renamed from: m  reason: collision with root package name */
    final B f31651m;

    /* renamed from: n  reason: collision with root package name */
    private long f31652n = 0;

    /* renamed from: o  reason: collision with root package name */
    private final Context f31653o;

    /* renamed from: p  reason: collision with root package name */
    private a.d f31654p;

    protected b(B b10, JSONObject jSONObject, Context context, a.d dVar) {
        super(B.QRCode, jSONObject, context);
        this.f31653o = context;
        this.f31651m = b10;
        this.f31650l = jSONObject;
        this.f31654p = dVar;
    }

    public void e() {
        this.f31654p = null;
    }

    public void q(int i10, String str) {
        this.f31654p.onFailure(new Exception("Failed server request: " + i10 + str));
    }

    public boolean s() {
        return false;
    }

    public void w() {
        this.f31652n = System.currentTimeMillis();
    }

    public void x(Q q10, C3016e eVar) {
        this.f31654p.a(q10);
    }

    /* access modifiers changed from: protected */
    public boolean z() {
        return true;
    }
}

package X4;

import T4.f;
import V4.v;
import X4.h;
import o5.h;

public class g extends h implements h {

    /* renamed from: e  reason: collision with root package name */
    private h.a f35008e;

    public g(long j10) {
        super(j10);
    }

    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            m(h() / 2);
        }
    }

    public /* bridge */ /* synthetic */ v c(f fVar, v vVar) {
        return (v) super.k(fVar, vVar);
    }

    public /* bridge */ /* synthetic */ v d(f fVar) {
        return (v) super.l(fVar);
    }

    public void e(h.a aVar) {
        this.f35008e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int i(v vVar) {
        if (vVar == null) {
            return super.i((Object) null);
        }
        return vVar.getSize();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void j(f fVar, v vVar) {
        h.a aVar = this.f35008e;
        if (aVar != null && vVar != null) {
            aVar.c(vVar);
        }
    }
}

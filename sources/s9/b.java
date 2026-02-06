package S9;

import A9.C2985b;
import A9.C2988e;
import A9.C2991h;
import A9.H;
import ja.C3645a;
import ja.I;
import k9.C3717q0;
import q9.k;
import q9.l;
import q9.m;
import q9.y;
import x9.C4184f;
import y9.g;

public final class b implements j {

    /* renamed from: d  reason: collision with root package name */
    private static final y f33963d = new y();

    /* renamed from: a  reason: collision with root package name */
    final k f33964a;

    /* renamed from: b  reason: collision with root package name */
    private final C3717q0 f33965b;

    /* renamed from: c  reason: collision with root package name */
    private final I f33966c;

    public b(k kVar, C3717q0 q0Var, I i10) {
        this.f33964a = kVar;
        this.f33965b = q0Var;
        this.f33966c = i10;
    }

    public boolean a(l lVar) {
        if (this.f33964a.i(lVar, f33963d) == 0) {
            return true;
        }
        return false;
    }

    public void f(m mVar) {
        this.f33964a.f(mVar);
    }

    public void g() {
        this.f33964a.a(0, 0);
    }

    public boolean h() {
        k kVar = this.f33964a;
        if ((kVar instanceof H) || (kVar instanceof g)) {
            return true;
        }
        return false;
    }

    public boolean i() {
        k kVar = this.f33964a;
        if ((kVar instanceof C2991h) || (kVar instanceof C2985b) || (kVar instanceof C2988e) || (kVar instanceof C4184f)) {
            return true;
        }
        return false;
    }

    public j j() {
        k kVar;
        C3645a.f(!h());
        k kVar2 = this.f33964a;
        if (kVar2 instanceof t) {
            kVar = new t(this.f33965b.f45761c, this.f33966c);
        } else if (kVar2 instanceof C2991h) {
            kVar = new C2991h();
        } else if (kVar2 instanceof C2985b) {
            kVar = new C2985b();
        } else if (kVar2 instanceof C2988e) {
            kVar = new C2988e();
        } else if (kVar2 instanceof C4184f) {
            kVar = new C4184f();
        } else {
            throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f33964a.getClass().getSimpleName());
        }
        return new b(kVar, this.f33965b, this.f33966c);
    }
}

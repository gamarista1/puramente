package i0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6527k;
import yf.C6798l;

/* renamed from: i0.e  reason: case insensitive filesystem */
public final class C2051e extends C2057k {

    /* renamed from: g  reason: collision with root package name */
    private final C6798l f21721g;

    /* renamed from: h  reason: collision with root package name */
    private final C2057k f21722h;

    public C2051e(int i10, n nVar, C6798l lVar, C2057k kVar) {
        super(i10, nVar, (DefaultConstructorMarker) null);
        this.f21721g = lVar;
        this.f21722h = kVar;
        kVar.m(this);
    }

    /* renamed from: A */
    public C6798l h() {
        return this.f21721g;
    }

    /* renamed from: B */
    public Void m(C2057k kVar) {
        t.a();
        throw new C6527k();
    }

    /* renamed from: C */
    public Void n(C2057k kVar) {
        t.a();
        throw new C6527k();
    }

    /* renamed from: D */
    public Void p(x xVar) {
        Void unused = p.Z();
        throw new C6527k();
    }

    /* renamed from: E */
    public C2051e x(C6798l lVar) {
        return new C2051e(f(), g(), p.L(lVar, h(), false, 4, (Object) null), this.f21722h);
    }

    public void d() {
        if (!e()) {
            if (f() != this.f21722h.f()) {
                b();
            }
            this.f21722h.n(this);
            super.d();
        }
    }

    public boolean i() {
        return true;
    }

    public C6798l k() {
        return null;
    }

    public void o() {
    }
}

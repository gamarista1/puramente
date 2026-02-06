package i0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6527k;
import yf.C6798l;

/* renamed from: i0.h  reason: case insensitive filesystem */
public final class C2054h extends C2057k {

    /* renamed from: g  reason: collision with root package name */
    private final C6798l f21724g;

    /* renamed from: h  reason: collision with root package name */
    private int f21725h = 1;

    public C2054h(int i10, n nVar, C6798l lVar) {
        super(i10, nVar, (DefaultConstructorMarker) null);
        this.f21724g = lVar;
    }

    /* renamed from: A */
    public C6798l h() {
        return this.f21724g;
    }

    public void d() {
        if (!e()) {
            n(this);
            super.d();
        }
    }

    public boolean i() {
        return true;
    }

    public C6798l k() {
        return null;
    }

    public void m(C2057k kVar) {
        this.f21725h++;
    }

    public void n(C2057k kVar) {
        int i10 = this.f21725h - 1;
        this.f21725h = i10;
        if (i10 == 0) {
            b();
        }
    }

    public void p(x xVar) {
        Void unused = p.Z();
        throw new C6527k();
    }

    public C2057k x(C6798l lVar) {
        p.g0(this);
        return new C2051e(f(), g(), p.L(lVar, h(), false, 4, (Object) null), this);
    }

    public void o() {
    }
}

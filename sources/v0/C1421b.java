package V0;

import Ef.m;

/* renamed from: V0.b  reason: case insensitive filesystem */
public final class C1421b implements w {

    /* renamed from: b  reason: collision with root package name */
    private final int f8171b;

    public C1421b(int i10) {
        this.f8171b = i10;
    }

    public p b(p pVar) {
        int i10 = this.f8171b;
        if (i10 == 0 || i10 == Integer.MAX_VALUE) {
            return pVar;
        }
        return new p(m.l(pVar.m() + this.f8171b, 1, 1000));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1421b) && this.f8171b == ((C1421b) obj).f8171b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.f8171b);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f8171b + ')';
    }
}

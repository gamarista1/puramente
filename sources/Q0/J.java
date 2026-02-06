package Q0;

import U0.b;

public final class J {

    /* renamed from: a  reason: collision with root package name */
    private final b f5260a;

    public J(int i10) {
        this.f5260a = new b(i10);
    }

    public final L a(K k10) {
        L l10 = (L) this.f5260a.d(new C1324g(k10));
        if (l10 != null && !l10.w().j().c()) {
            return l10;
        }
        return null;
    }

    public final L b(K k10, L l10) {
        return (L) this.f5260a.e(new C1324g(k10), l10);
    }
}

package Y;

import yf.C6798l;

final class K implements T0 {

    /* renamed from: a  reason: collision with root package name */
    private final C6798l f9793a;

    /* renamed from: b  reason: collision with root package name */
    private L f9794b;

    public K(C6798l lVar) {
        this.f9793a = lVar;
    }

    public void b() {
        this.f9794b = (L) this.f9793a.invoke(P.f9890a);
    }

    public void d() {
        L l10 = this.f9794b;
        if (l10 != null) {
            l10.dispose();
        }
        this.f9794b = null;
    }

    public void c() {
    }
}

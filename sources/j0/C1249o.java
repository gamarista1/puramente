package J0;

/* renamed from: J0.o  reason: case insensitive filesystem */
public final class C1249o {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C1248n f3902a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C1248n f3903b;

    public C1249o(boolean z10) {
        this.f3902a = new C1248n(z10);
        this.f3903b = new C1248n(z10);
    }

    public final void c(G g10, boolean z10) {
        if (z10) {
            this.f3902a.a(g10);
            this.f3903b.a(g10);
        } else if (!this.f3902a.b(g10)) {
            this.f3903b.a(g10);
        }
    }

    public final boolean d(G g10) {
        if (this.f3902a.b(g10) || this.f3903b.b(g10)) {
            return true;
        }
        return false;
    }

    public final boolean e(G g10, boolean z10) {
        boolean b10 = this.f3902a.b(g10);
        if (z10) {
            return b10;
        }
        if (b10 || this.f3903b.b(g10)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (!this.f3903b.d() || !this.f3902a.d()) {
            return false;
        }
        return true;
    }

    public final boolean g(boolean z10) {
        C1248n nVar;
        if (z10) {
            nVar = this.f3902a;
        } else {
            nVar = this.f3903b;
        }
        return nVar.d();
    }

    public final boolean h() {
        return !f();
    }

    public final boolean i(G g10) {
        boolean f10 = this.f3902a.f(g10);
        if (this.f3903b.f(g10) || f10) {
            return true;
        }
        return false;
    }
}

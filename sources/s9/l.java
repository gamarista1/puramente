package S9;

import N9.M;
import ja.C3645a;
import k9.C3718r0;
import n9.C3871g;

final class l implements M {

    /* renamed from: a  reason: collision with root package name */
    private final int f34058a;

    /* renamed from: b  reason: collision with root package name */
    private final p f34059b;

    /* renamed from: c  reason: collision with root package name */
    private int f34060c = -1;

    public l(p pVar, int i10) {
        this.f34059b = pVar;
        this.f34058a = i10;
    }

    private boolean b() {
        int i10 = this.f34060c;
        if (i10 == -1 || i10 == -3 || i10 == -2) {
            return false;
        }
        return true;
    }

    public void a() {
        boolean z10;
        if (this.f34060c == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        this.f34060c = this.f34059b.y(this.f34058a);
    }

    public void c() {
        if (this.f34060c != -1) {
            this.f34059b.p0(this.f34058a);
            this.f34060c = -1;
        }
    }

    public boolean d() {
        if (this.f34060c == -3 || (b() && this.f34059b.Q(this.f34060c))) {
            return true;
        }
        return false;
    }

    public void e() {
        int i10 = this.f34060c;
        if (i10 == -2) {
            throw new r(this.f34059b.n().b(this.f34058a).b(0).f45770l);
        } else if (i10 == -1) {
            this.f34059b.U();
        } else if (i10 != -3) {
            this.f34059b.V(i10);
        }
    }

    public int k(long j10) {
        if (b()) {
            return this.f34059b.o0(this.f34060c, j10);
        }
        return 0;
    }

    public int q(C3718r0 r0Var, C3871g gVar, int i10) {
        if (this.f34060c == -3) {
            gVar.f(4);
            return -4;
        } else if (b()) {
            return this.f34059b.e0(this.f34060c, r0Var, gVar, i10);
        } else {
            return -3;
        }
    }
}

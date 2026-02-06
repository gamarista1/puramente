package H0;

import c1.b;

/* renamed from: H0.j  reason: case insensitive filesystem */
public final class C1189j implements E {

    /* renamed from: a  reason: collision with root package name */
    private final C1193n f2618a;

    /* renamed from: b  reason: collision with root package name */
    private final C1195p f2619b;

    /* renamed from: c  reason: collision with root package name */
    private final C1196q f2620c;

    public C1189j(C1193n nVar, C1195p pVar, C1196q qVar) {
        this.f2618a = nVar;
        this.f2619b = pVar;
        this.f2620c = qVar;
    }

    public Object a() {
        return this.f2618a.a();
    }

    public int e0(int i10) {
        return this.f2618a.e0(i10);
    }

    public int s(int i10) {
        return this.f2618a.s(i10);
    }

    public int s0(int i10) {
        return this.f2618a.s0(i10);
    }

    public int t0(int i10) {
        return this.f2618a.t0(i10);
    }

    public U v0(long j10) {
        int i10;
        int i11;
        int i12 = 32767;
        if (this.f2620c == C1196q.Width) {
            if (this.f2619b == C1195p.Max) {
                i11 = this.f2618a.t0(b.k(j10));
            } else {
                i11 = this.f2618a.s0(b.k(j10));
            }
            if (b.g(j10)) {
                i12 = b.k(j10);
            }
            return new C1191l(i11, i12);
        }
        if (this.f2619b == C1195p.Max) {
            i10 = this.f2618a.s(b.l(j10));
        } else {
            i10 = this.f2618a.e0(b.l(j10));
        }
        if (b.h(j10)) {
            i12 = b.l(j10);
        }
        return new C1191l(i12, i10);
    }
}

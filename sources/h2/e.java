package H2;

import z2.C2956A;
import z2.J;
import z2.K;
import z2.O;
import z2.r;

public final class e implements r {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final long f2656a;

    /* renamed from: b  reason: collision with root package name */
    private final r f2657b;

    class a extends C2956A {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ J f2658b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(J j10, J j11) {
            super(j10);
            this.f2658b = j11;
        }

        public J.a c(long j10) {
            J.a c10 = this.f2658b.c(j10);
            K k10 = c10.f29107a;
            K k11 = new K(k10.f29112a, k10.f29113b + e.this.f2656a);
            K k12 = c10.f29108b;
            return new J.a(k11, new K(k12.f29112a, k12.f29113b + e.this.f2656a));
        }
    }

    public e(long j10, r rVar) {
        this.f2656a = j10;
        this.f2657b = rVar;
    }

    public O d(int i10, int i11) {
        return this.f2657b.d(i10, i11);
    }

    public void k() {
        this.f2657b.k();
    }

    public void u(J j10) {
        this.f2657b.u(new a(j10, j10));
    }
}

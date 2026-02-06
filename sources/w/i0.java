package w;

import kotlin.jvm.internal.C6496s;

final class i0 implements u0 {

    /* renamed from: a  reason: collision with root package name */
    private final u0 f27432a;

    /* renamed from: b  reason: collision with root package name */
    private final long f27433b;

    public i0(u0 u0Var, long j10) {
        this.f27432a = u0Var;
        this.f27433b = j10;
    }

    public boolean a() {
        return this.f27432a.a();
    }

    public long b(C2805q qVar, C2805q qVar2, C2805q qVar3) {
        return this.f27432a.b(qVar, qVar2, qVar3) + this.f27433b;
    }

    public C2805q c(long j10, C2805q qVar, C2805q qVar2, C2805q qVar3) {
        long j11 = this.f27433b;
        if (j10 < j11) {
            return qVar;
        }
        return this.f27432a.c(j10 - j11, qVar, qVar2, qVar3);
    }

    public C2805q d(long j10, C2805q qVar, C2805q qVar2, C2805q qVar3) {
        long j11 = this.f27433b;
        if (j10 < j11) {
            return qVar3;
        }
        return this.f27432a.d(j10 - j11, qVar, qVar2, qVar3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (i0Var.f27433b != this.f27433b || !C6496s.c(i0Var.f27432a, this.f27432a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f27432a.hashCode() * 31) + Long.hashCode(this.f27433b);
    }
}

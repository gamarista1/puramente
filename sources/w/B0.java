package w;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class B0 implements u0 {

    /* renamed from: a  reason: collision with root package name */
    private final x0 f27153a;

    /* renamed from: b  reason: collision with root package name */
    private final C2785b0 f27154b;

    /* renamed from: c  reason: collision with root package name */
    private final long f27155c;

    /* renamed from: d  reason: collision with root package name */
    private final long f27156d;

    public /* synthetic */ B0(x0 x0Var, C2785b0 b0Var, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(x0Var, b0Var, j10);
    }

    private final long h(long j10) {
        long j11 = this.f27156d;
        if (j10 + j11 <= 0) {
            return 0;
        }
        long j12 = j10 + j11;
        long j13 = this.f27155c;
        long j14 = j12 / j13;
        if (this.f27154b == C2785b0.Restart || j14 % ((long) 2) == 0) {
            return j12 - (j14 * j13);
        }
        return ((j14 + 1) * j13) - j12;
    }

    private final C2805q i(long j10, C2805q qVar, C2805q qVar2, C2805q qVar3) {
        long j11 = this.f27156d;
        long j12 = this.f27155c;
        if (j10 + j11 > j12) {
            return this.f27153a.d(j12 - j11, qVar, qVar3, qVar2);
        }
        return qVar2;
    }

    public boolean a() {
        return true;
    }

    public long b(C2805q qVar, C2805q qVar2, C2805q qVar3) {
        return Long.MAX_VALUE;
    }

    public C2805q c(long j10, C2805q qVar, C2805q qVar2, C2805q qVar3) {
        return this.f27153a.c(h(j10), qVar, qVar2, i(j10, qVar, qVar3, qVar2));
    }

    public C2805q d(long j10, C2805q qVar, C2805q qVar2, C2805q qVar3) {
        return this.f27153a.d(h(j10), qVar, qVar2, i(j10, qVar, qVar3, qVar2));
    }

    private B0(x0 x0Var, C2785b0 b0Var, long j10) {
        this.f27153a = x0Var;
        this.f27154b = b0Var;
        this.f27155c = ((long) (x0Var.e() + x0Var.f())) * 1000000;
        this.f27156d = j10 * 1000000;
    }
}

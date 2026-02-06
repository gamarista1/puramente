package J;

import H0.C1197s;
import Q0.L;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2421g;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final L f3015a;

    /* renamed from: b  reason: collision with root package name */
    private C1197s f3016b;

    /* renamed from: c  reason: collision with root package name */
    private C1197s f3017c;

    public a0(L l10, C1197s sVar, C1197s sVar2) {
        this.f3015a = l10;
        this.f3016b = sVar;
        this.f3017c = sVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r2 == null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long a(long r6) {
        /*
            r5 = this;
            H0.s r0 = r5.f3016b
            if (r0 == 0) goto L_0x001e
            boolean r1 = r0.G()
            if (r1 == 0) goto L_0x0016
            H0.s r1 = r5.f3017c
            r2 = 0
            if (r1 == 0) goto L_0x001c
            r3 = 0
            r4 = 2
            q0.i r2 = H0.C1197s.C0(r1, r0, r3, r4, r2)
            goto L_0x001c
        L_0x0016:
            q0.i$a r0 = q0.C2423i.f25325e
            q0.i r2 = r0.a()
        L_0x001c:
            if (r2 != 0) goto L_0x0024
        L_0x001e:
            q0.i$a r0 = q0.C2423i.f25325e
            q0.i r2 = r0.a()
        L_0x0024:
            long r6 = J.b0.b(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: J.a0.a(long):long");
    }

    public static /* synthetic */ int e(a0 a0Var, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a0Var.d(j10, z10);
    }

    public final C1197s b() {
        return this.f3017c;
    }

    public final C1197s c() {
        return this.f3016b;
    }

    public final int d(long j10, boolean z10) {
        if (z10) {
            j10 = a(j10);
        }
        return this.f3015a.x(j(j10));
    }

    public final L f() {
        return this.f3015a;
    }

    public final boolean g(long j10) {
        long j11 = j(a(j10));
        int r10 = this.f3015a.r(C2421g.n(j11));
        if (C2421g.m(j11) < this.f3015a.s(r10) || C2421g.m(j11) > this.f3015a.t(r10)) {
            return false;
        }
        return true;
    }

    public final void h(C1197s sVar) {
        this.f3017c = sVar;
    }

    public final void i(C1197s sVar) {
        this.f3016b = sVar;
    }

    public final long j(long j10) {
        C1197s sVar;
        C1197s sVar2 = this.f3016b;
        if (sVar2 == null) {
            return j10;
        }
        C1197s sVar3 = null;
        if (!sVar2.G()) {
            sVar2 = null;
        }
        if (sVar2 == null || (sVar = this.f3017c) == null) {
            return j10;
        }
        if (sVar.G()) {
            sVar3 = sVar;
        }
        if (sVar3 == null) {
            return j10;
        }
        return sVar2.W(sVar3, j10);
    }

    public final long k(long j10) {
        C1197s sVar;
        C1197s sVar2 = this.f3016b;
        if (sVar2 == null) {
            return j10;
        }
        C1197s sVar3 = null;
        if (!sVar2.G()) {
            sVar2 = null;
        }
        if (sVar2 == null || (sVar = this.f3017c) == null) {
            return j10;
        }
        if (sVar.G()) {
            sVar3 = sVar;
        }
        if (sVar3 == null) {
            return j10;
        }
        return sVar3.W(sVar2, j10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(L l10, C1197s sVar, C1197s sVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(l10, (i10 & 2) != 0 ? null : sVar, (i10 & 4) != 0 ? null : sVar2);
    }
}

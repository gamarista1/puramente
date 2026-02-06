package P;

import J.a0;
import W0.C1433a;
import W0.C1441i;
import W0.P;
import W0.Q;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import yf.C6798l;

public final class F extends C1286b {

    /* renamed from: j  reason: collision with root package name */
    private final Q f4770j;

    /* renamed from: k  reason: collision with root package name */
    private final a0 f4771k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public F(W0.Q r9, W0.I r10, J.a0 r11, P.J r12) {
        /*
            r8 = this;
            Q0.d r1 = r9.e()
            long r2 = r9.g()
            if (r11 == 0) goto L_0x0010
            Q0.L r0 = r11.f()
        L_0x000e:
            r4 = r0
            goto L_0x0012
        L_0x0010:
            r0 = 0
            goto L_0x000e
        L_0x0012:
            r7 = 0
            r0 = r8
            r5 = r10
            r6 = r12
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r8.f4770j = r9
            r8.f4771k = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.F.<init>(W0.Q, W0.I, J.a0, P.J):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r2 == null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a0(J.a0 r6, int r7) {
        /*
            r5 = this;
            H0.s r0 = r6.c()
            if (r0 == 0) goto L_0x0015
            H0.s r1 = r6.b()
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r3 = 0
            r4 = 2
            q0.i r2 = H0.C1197s.C0(r1, r0, r3, r4, r2)
        L_0x0013:
            if (r2 != 0) goto L_0x001b
        L_0x0015:
            q0.i$a r0 = q0.C2423i.f25325e
            q0.i r2 = r0.a()
        L_0x001b:
            W0.I r0 = r5.p()
            W0.Q r1 = r5.f4770j
            long r3 = r1.g()
            int r1 = Q0.Q.i(r3)
            int r0 = r0.b(r1)
            Q0.L r1 = r6.f()
            q0.i r0 = r1.e(r0)
            float r1 = r0.i()
            float r0 = r0.l()
            long r2 = r2.k()
            float r2 = q0.C2427m.i(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r0 = r0 + r2
            W0.I r7 = r5.p()
            Q0.L r6 = r6.f()
            long r0 = q0.C2422h.a(r1, r0)
            int r6 = r6.x(r0)
            int r6 = r7.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: P.F.a0(J.a0, int):int");
    }

    public final List Y(C6798l lVar) {
        if (Q0.Q.h(u())) {
            C1441i iVar = (C1441i) lVar.invoke(this);
            if (iVar != null) {
                return C6565s.e(iVar);
            }
            return null;
        }
        return C6565s.q(new C1433a("", 0), new P(Q0.Q.l(u()), Q0.Q.l(u())));
    }

    public final Q Z() {
        return Q.c(this.f4770j, e(), u(), (Q0.Q) null, 4, (Object) null);
    }

    public final F b0() {
        a0 a0Var;
        if (w().length() > 0 && (a0Var = this.f4771k) != null) {
            T(a0(a0Var, 1));
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final F c0() {
        a0 a0Var;
        if (w().length() > 0 && (a0Var = this.f4771k) != null) {
            T(a0(a0Var, -1));
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }
}

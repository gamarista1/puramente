package M;

import H0.C1197s;
import J.C1228y;
import J.a0;
import Q0.C1328k;
import Q0.E;
import Q0.I;
import Q0.L;
import Q0.Q;
import Q0.S;
import W0.C1441i;
import W0.C1444l;
import android.graphics.PointF;
import androidx.compose.ui.platform.v1;
import q0.C2421g;
import q0.C2422h;
import q0.C2423i;

public abstract class j0 {

    public static final class a implements C1441i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1441i[] f4215a;

        a(C1441i[] iVarArr) {
            this.f4215a = iVarArr;
        }

        public void a(C1444l lVar) {
            for (C1441i a10 : this.f4215a) {
                a10.a(lVar);
            }
        }
    }

    private static final boolean A(int i10) {
        int type = Character.getType(i10);
        if (type == 14 || type == 13 || i10 == 10) {
            return true;
        }
        return false;
    }

    private static final boolean B(int i10) {
        int type = Character.getType(i10);
        if (type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21) {
            return true;
        }
        return false;
    }

    private static final boolean C(int i10) {
        if (Character.isWhitespace(i10) || i10 == 160) {
            return true;
        }
        return false;
    }

    private static final boolean D(int i10) {
        if (!C(i10) || A(i10)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final long E(CharSequence charSequence, int i10) {
        int i11 = i10;
        while (i11 > 0) {
            int c10 = C1265f.c(charSequence, i11);
            if (!C(c10)) {
                break;
            }
            i11 -= Character.charCount(c10);
        }
        while (i10 < charSequence.length()) {
            int b10 = C1265f.b(charSequence, i10);
            if (!C(b10)) {
                break;
            }
            i10 += C1265f.a(b10);
        }
        return S.b(i11, i10);
    }

    /* access modifiers changed from: private */
    public static final long F(PointF pointF) {
        return C2422h.a(pointF.x, pointF.y);
    }

    /* access modifiers changed from: private */
    public static final long m(long j10, CharSequence charSequence) {
        int i10;
        int n10 = Q.n(j10);
        int i11 = Q.i(j10);
        int i12 = 10;
        if (n10 > 0) {
            i10 = Character.codePointBefore(charSequence, n10);
        } else {
            i10 = 10;
        }
        if (i11 < charSequence.length()) {
            i12 = Character.codePointAt(charSequence, i11);
        }
        if (D(i10) && (C(i12) || B(i12))) {
            do {
                n10 -= Character.charCount(i10);
                if (n10 == 0) {
                    break;
                }
                i10 = Character.codePointBefore(charSequence, n10);
            } while (D(i10));
            return S.b(n10, i11);
        } else if (!D(i12)) {
            return j10;
        } else {
            if (!C(i10) && !B(i10)) {
                return j10;
            }
            do {
                i11 += Character.charCount(i12);
                if (i11 == charSequence.length()) {
                    break;
                }
                i12 = Character.codePointAt(charSequence, i11);
            } while (D(i12));
            return S.b(n10, i11);
        }
    }

    /* access modifiers changed from: private */
    public static final C1441i n(C1441i... iVarArr) {
        return new a(iVarArr);
    }

    private static final long o(long j10, long j11) {
        return S.b(Math.min(Q.n(j10), Q.n(j10)), Math.max(Q.i(j11), Q.i(j11)));
    }

    private static final int p(C1328k kVar, long j10, v1 v1Var) {
        float f10;
        if (v1Var != null) {
            f10 = v1Var.h();
        } else {
            f10 = 0.0f;
        }
        int p10 = kVar.p(C2421g.n(j10));
        if (C2421g.n(j10) < kVar.t(p10) - f10 || C2421g.n(j10) > kVar.l(p10) + f10 || C2421g.m(j10) < (-f10) || C2421g.m(j10) > kVar.A() + f10) {
            return -1;
        }
        return p10;
    }

    /* access modifiers changed from: private */
    public static final int q(C1228y yVar, long j10, v1 v1Var) {
        L f10;
        C1328k w10;
        a0 j11 = yVar.j();
        if (j11 == null || (f10 = j11.f()) == null || (w10 = f10.w()) == null) {
            return -1;
        }
        return s(w10, j10, yVar.i(), v1Var);
    }

    /* access modifiers changed from: private */
    public static final int r(w0 w0Var, long j10, v1 v1Var) {
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r10.o(r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final int s(Q0.C1328k r7, long r8, H0.C1197s r10, androidx.compose.ui.platform.v1 r11) {
        /*
            r0 = -1
            if (r10 == 0) goto L_0x0027
            long r1 = r10.o(r8)
            int r8 = p(r7, r1, r11)
            if (r8 != r0) goto L_0x000e
            return r0
        L_0x000e:
            float r9 = r7.t(r8)
            float r8 = r7.l(r8)
            float r9 = r9 + r8
            r8 = 1073741824(0x40000000, float:2.0)
            float r4 = r9 / r8
            r5 = 1
            r6 = 0
            r3 = 0
            long r8 = q0.C2421g.g(r1, r3, r4, r5, r6)
            int r7 = r7.u(r8)
            return r7
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M.j0.s(Q0.k, long, H0.s, androidx.compose.ui.platform.v1):int");
    }

    /* access modifiers changed from: private */
    public static final long t(L l10, long j10, long j11, C1197s sVar, v1 v1Var) {
        if (l10 == null || sVar == null) {
            return Q.f5291b.a();
        }
        long o10 = sVar.o(j10);
        long o11 = sVar.o(j11);
        int p10 = p(l10.w(), o10, v1Var);
        int p11 = p(l10.w(), o11, v1Var);
        if (p10 != -1) {
            if (p11 != -1) {
                p10 = Math.min(p10, p11);
            }
            p11 = p10;
        } else if (p11 == -1) {
            return Q.f5291b.a();
        }
        float v10 = (l10.v(p11) + l10.m(p11)) / ((float) 2);
        return l10.w().z(new C2423i(Math.min(C2421g.m(o10), C2421g.m(o11)), v10 - 0.1f, Math.max(C2421g.m(o10), C2421g.m(o11)), v10 + 0.1f), E.f5252a.a(), I.f5255a.g());
    }

    private static final long u(C1328k kVar, C2423i iVar, C1197s sVar, int i10, I i11) {
        if (kVar == null || sVar == null) {
            return Q.f5291b.a();
        }
        return kVar.z(iVar.t(sVar.o(C2421g.f25320b.c())), i10, i11);
    }

    /* access modifiers changed from: private */
    public static final long v(C1228y yVar, C2423i iVar, int i10, I i11) {
        C1328k kVar;
        L f10;
        a0 j10 = yVar.j();
        if (j10 == null || (f10 = j10.f()) == null) {
            kVar = null;
        } else {
            kVar = f10.w();
        }
        return u(kVar, iVar, yVar.i(), i10, i11);
    }

    /* access modifiers changed from: private */
    public static final long w(w0 w0Var, C2423i iVar, int i10, I i11) {
        throw null;
    }

    /* access modifiers changed from: private */
    public static final long x(C1228y yVar, C2423i iVar, C2423i iVar2, int i10, I i11) {
        long v10 = v(yVar, iVar, i10, i11);
        if (Q.h(v10)) {
            return Q.f5291b.a();
        }
        long v11 = v(yVar, iVar2, i10, i11);
        if (Q.h(v11)) {
            return Q.f5291b.a();
        }
        return o(v10, v11);
    }

    /* access modifiers changed from: private */
    public static final long y(w0 w0Var, C2423i iVar, C2423i iVar2, int i10, I i11) {
        long w10 = w(w0Var, iVar, i10, i11);
        if (Q.h(w10)) {
            return Q.f5291b.a();
        }
        long w11 = w(w0Var, iVar2, i10, i11);
        if (Q.h(w11)) {
            return Q.f5291b.a();
        }
        return o(w10, w11);
    }

    /* access modifiers changed from: private */
    public static final boolean z(L l10, int i10) {
        int q10 = l10.q(i10);
        if (i10 == l10.u(q10) || i10 == L.p(l10, q10, false, 2, (Object) null)) {
            if (l10.y(i10) != l10.c(i10)) {
                return true;
            }
            return false;
        } else if (l10.c(i10) != l10.c(i10 - 1)) {
            return true;
        } else {
            return false;
        }
    }
}

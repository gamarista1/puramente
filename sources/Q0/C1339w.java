package Q0;

import b1.C1873e;
import b1.C1874f;
import b1.C1876h;
import b1.j;
import b1.l;
import b1.q;
import b1.r;
import b1.s;
import c1.t;
import c1.v;
import c1.w;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Q0.w  reason: case insensitive filesystem */
public abstract class C1339w {

    /* renamed from: a  reason: collision with root package name */
    private static final long f5392a = v.f19242b.a();

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        if (c1.v.e(r12, r24.e()) != false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Q0.C1338v a(Q0.C1338v r24, int r25, int r26, long r27, b1.q r29, Q0.y r30, b1.C1876h r31, int r32, int r33, b1.s r34) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            b1.j$a r9 = b1.j.f19110b
            int r10 = r9.g()
            boolean r10 = b1.j.k(r1, r10)
            if (r10 != 0) goto L_0x002d
            int r10 = r24.h()
            boolean r10 = b1.j.k(r1, r10)
            if (r10 == 0) goto L_0x0029
            goto L_0x002d
        L_0x0029:
            r12 = r27
            goto L_0x00b4
        L_0x002d:
            boolean r10 = c1.w.g(r27)
            if (r10 != 0) goto L_0x0040
            long r10 = r24.e()
            r12 = r27
            boolean r10 = c1.v.e(r12, r10)
            if (r10 == 0) goto L_0x00b4
            goto L_0x0042
        L_0x0040:
            r12 = r27
        L_0x0042:
            if (r3 == 0) goto L_0x004e
            b1.q r10 = r24.j()
            boolean r10 = kotlin.jvm.internal.C6496s.c(r3, r10)
            if (r10 == 0) goto L_0x00b4
        L_0x004e:
            b1.l$a r10 = b1.l.f19124b
            int r10 = r10.f()
            boolean r10 = b1.l.j(r2, r10)
            if (r10 != 0) goto L_0x0064
            int r10 = r24.i()
            boolean r10 = b1.l.j(r2, r10)
            if (r10 == 0) goto L_0x00b4
        L_0x0064:
            if (r4 == 0) goto L_0x0070
            Q0.y r10 = r24.g()
            boolean r10 = kotlin.jvm.internal.C6496s.c(r4, r10)
            if (r10 == 0) goto L_0x00b4
        L_0x0070:
            if (r5 == 0) goto L_0x007c
            b1.h r10 = r24.f()
            boolean r10 = kotlin.jvm.internal.C6496s.c(r5, r10)
            if (r10 == 0) goto L_0x00b4
        L_0x007c:
            b1.f$a r10 = b1.C1874f.f19072b
            int r10 = r10.b()
            boolean r10 = b1.C1874f.f(r6, r10)
            if (r10 != 0) goto L_0x0092
            int r10 = r24.d()
            boolean r10 = b1.C1874f.f(r6, r10)
            if (r10 == 0) goto L_0x00b4
        L_0x0092:
            b1.e$a r10 = b1.C1873e.f19067b
            int r10 = r10.c()
            boolean r10 = b1.C1873e.g(r7, r10)
            if (r10 != 0) goto L_0x00a8
            int r10 = r24.c()
            boolean r10 = b1.C1873e.g(r7, r10)
            if (r10 == 0) goto L_0x00b4
        L_0x00a8:
            if (r8 == 0) goto L_0x0139
            b1.s r10 = r24.k()
            boolean r10 = kotlin.jvm.internal.C6496s.c(r8, r10)
            if (r10 != 0) goto L_0x0139
        L_0x00b4:
            boolean r10 = c1.w.g(r27)
            if (r10 == 0) goto L_0x00c0
            long r10 = r24.e()
            r15 = r10
            goto L_0x00c1
        L_0x00c0:
            r15 = r12
        L_0x00c1:
            if (r3 != 0) goto L_0x00c7
            b1.q r3 = r24.j()
        L_0x00c7:
            r17 = r3
            int r3 = r9.g()
            boolean r3 = b1.j.k(r1, r3)
            if (r3 != 0) goto L_0x00d5
        L_0x00d3:
            r13 = r1
            goto L_0x00da
        L_0x00d5:
            int r1 = r24.h()
            goto L_0x00d3
        L_0x00da:
            b1.l$a r1 = b1.l.f19124b
            int r1 = r1.f()
            boolean r1 = b1.l.j(r2, r1)
            if (r1 != 0) goto L_0x00e8
            r14 = r2
            goto L_0x00ed
        L_0x00e8:
            int r1 = r24.i()
            r14 = r1
        L_0x00ed:
            Q0.y r18 = d(r0, r4)
            if (r5 != 0) goto L_0x00fa
            b1.h r1 = r24.f()
            r19 = r1
            goto L_0x00fc
        L_0x00fa:
            r19 = r5
        L_0x00fc:
            b1.f$a r1 = b1.C1874f.f19072b
            int r1 = r1.b()
            boolean r1 = b1.C1874f.f(r6, r1)
            if (r1 != 0) goto L_0x010b
            r20 = r6
            goto L_0x0111
        L_0x010b:
            int r1 = r24.d()
            r20 = r1
        L_0x0111:
            b1.e$a r1 = b1.C1873e.f19067b
            int r1 = r1.c()
            boolean r1 = b1.C1873e.g(r7, r1)
            if (r1 != 0) goto L_0x0120
            r21 = r7
            goto L_0x0126
        L_0x0120:
            int r1 = r24.c()
            r21 = r1
        L_0x0126:
            if (r8 != 0) goto L_0x012f
            b1.s r0 = r24.k()
            r22 = r0
            goto L_0x0131
        L_0x012f:
            r22 = r8
        L_0x0131:
            Q0.v r0 = new Q0.v
            r23 = 0
            r12 = r0
            r12.<init>(r13, r14, r15, r17, r18, r19, r20, r21, r22, r23)
        L_0x0139:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C1339w.a(Q0.v, int, int, long, b1.q, Q0.y, b1.h, int, int, b1.s):Q0.v");
    }

    public static final C1338v b(C1338v vVar, C1338v vVar2, float f10) {
        int n10 = ((j) D.d(j.h(vVar.h()), j.h(vVar2.h()), f10)).n();
        int m10 = ((l) D.d(l.g(vVar.i()), l.g(vVar2.i()), f10)).m();
        long f11 = D.f(vVar.e(), vVar2.e(), f10);
        q j10 = vVar.j();
        if (j10 == null) {
            j10 = q.f19141c.a();
        }
        q j11 = vVar2.j();
        if (j11 == null) {
            j11 = q.f19141c.a();
        }
        return new C1338v(n10, m10, f11, r.a(j10, j11, f10), c(vVar.g(), vVar2.g(), f10), (C1876h) D.d(vVar.f(), vVar2.f(), f10), ((C1874f) D.d(C1874f.c(vVar.d()), C1874f.c(vVar2.d()), f10)).l(), ((C1873e) D.d(C1873e.d(vVar.c()), C1873e.d(vVar2.c()), f10)).j(), (s) D.d(vVar.k(), vVar2.k(), f10), (DefaultConstructorMarker) null);
    }

    private static final y c(y yVar, y yVar2, float f10) {
        if (yVar == null && yVar2 == null) {
            return null;
        }
        if (yVar == null) {
            yVar = y.f5393c.a();
        }
        if (yVar2 == null) {
            yVar2 = y.f5393c.a();
        }
        return C1320c.b(yVar, yVar2, f10);
    }

    private static final y d(C1338v vVar, y yVar) {
        if (vVar.g() == null) {
            return yVar;
        }
        if (yVar == null) {
            return vVar.g();
        }
        return vVar.g().d(yVar);
    }

    public static final C1338v e(C1338v vVar, t tVar) {
        int h10;
        long j10;
        int d10;
        int c10;
        int h11 = vVar.h();
        j.a aVar = j.f19110b;
        if (j.k(h11, aVar.g())) {
            h10 = aVar.f();
        } else {
            h10 = vVar.h();
        }
        int i10 = h10;
        int e10 = U.e(tVar, vVar.i());
        if (w.g(vVar.e())) {
            j10 = f5392a;
        } else {
            j10 = vVar.e();
        }
        q j11 = vVar.j();
        if (j11 == null) {
            j11 = q.f19141c.a();
        }
        q qVar = j11;
        y g10 = vVar.g();
        C1876h f10 = vVar.f();
        int d11 = vVar.d();
        C1874f.a aVar2 = C1874f.f19072b;
        if (C1874f.f(d11, aVar2.b())) {
            d10 = aVar2.a();
        } else {
            d10 = vVar.d();
        }
        int i11 = d10;
        int c11 = vVar.c();
        C1873e.a aVar3 = C1873e.f19067b;
        if (C1873e.g(c11, aVar3.c())) {
            c10 = aVar3.b();
        } else {
            c10 = vVar.c();
        }
        int i12 = c10;
        s k10 = vVar.k();
        if (k10 == null) {
            k10 = s.f19145c.a();
        }
        return new C1338v(i10, e10, j10, qVar, g10, f10, i11, i12, k10, (DefaultConstructorMarker) null);
    }
}

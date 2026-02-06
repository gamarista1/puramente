package J0;

import a0.C1538b;
import com.amazon.a.a.o.b.f;
import k0.i;
import kotlin.jvm.internal.C6496s;

/* renamed from: J0.a0  reason: case insensitive filesystem */
public final class C1231a0 {

    /* renamed from: a  reason: collision with root package name */
    private final G f3761a;

    /* renamed from: b  reason: collision with root package name */
    private final C1256w f3762b;

    /* renamed from: c  reason: collision with root package name */
    private C1235c0 f3763c;

    /* renamed from: d  reason: collision with root package name */
    private final i.c f3764d;

    /* renamed from: e  reason: collision with root package name */
    private i.c f3765e;

    /* renamed from: f  reason: collision with root package name */
    private C1538b f3766f;

    /* renamed from: g  reason: collision with root package name */
    private C1538b f3767g;

    /* renamed from: h  reason: collision with root package name */
    private a f3768h;

    /* renamed from: J0.a0$a */
    private final class a implements C1250p {

        /* renamed from: a  reason: collision with root package name */
        private i.c f3769a;

        /* renamed from: b  reason: collision with root package name */
        private int f3770b;

        /* renamed from: c  reason: collision with root package name */
        private C1538b f3771c;

        /* renamed from: d  reason: collision with root package name */
        private C1538b f3772d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f3773e;

        public a(i.c cVar, int i10, C1538b bVar, C1538b bVar2, boolean z10) {
            this.f3769a = cVar;
            this.f3770b = i10;
            this.f3771c = bVar;
            this.f3772d = bVar2;
            this.f3773e = z10;
        }

        public void a(int i10, int i11) {
            i.c J12 = this.f3769a.J1();
            C6496s.e(J12);
            b unused = C1231a0.this.getClass();
            if ((C1239e0.a(2) & J12.N1()) != 0) {
                C1235c0 K12 = J12.K1();
                C6496s.e(K12);
                C1235c0 F22 = K12.F2();
                C1235c0 E22 = K12.E2();
                C6496s.e(E22);
                if (F22 != null) {
                    F22.i3(E22);
                }
                E22.j3(F22);
                C1231a0.this.v(this.f3769a, E22);
            }
            this.f3769a = C1231a0.this.h(J12);
        }

        public boolean b(int i10, int i11) {
            C1538b bVar = this.f3771c;
            int i12 = this.f3770b + i10;
            C1538b bVar2 = this.f3772d;
            if (C1233b0.d((i.b) bVar.p()[i12], (i.b) bVar2.p()[this.f3770b + i11]) != 0) {
                return true;
            }
            return false;
        }

        public void c(int i10) {
            int i11 = this.f3770b + i10;
            this.f3769a = C1231a0.this.g((i.b) this.f3772d.p()[i11], this.f3769a);
            b unused = C1231a0.this.getClass();
            if (this.f3773e) {
                i.c J12 = this.f3769a.J1();
                C6496s.e(J12);
                C1235c0 K12 = J12.K1();
                C6496s.e(K12);
                B d10 = C1245k.d(this.f3769a);
                if (d10 != null) {
                    C c10 = new C(C1231a0.this.m(), d10);
                    this.f3769a.k2(c10);
                    C1231a0.this.v(this.f3769a, c10);
                    c10.j3(K12.F2());
                    c10.i3(K12);
                    K12.j3(c10);
                } else {
                    this.f3769a.k2(K12);
                }
                this.f3769a.T1();
                this.f3769a.Z1();
                f0.a(this.f3769a);
                return;
            }
            this.f3769a.e2(true);
        }

        public void d(int i10, int i11) {
            i.c J12 = this.f3769a.J1();
            C6496s.e(J12);
            this.f3769a = J12;
            C1538b bVar = this.f3771c;
            i.b bVar2 = (i.b) bVar.p()[this.f3770b + i10];
            C1538b bVar3 = this.f3772d;
            i.b bVar4 = (i.b) bVar3.p()[this.f3770b + i11];
            if (!C6496s.c(bVar2, bVar4)) {
                C1231a0.this.F(bVar2, bVar4, this.f3769a);
                b unused = C1231a0.this.getClass();
                return;
            }
            b unused2 = C1231a0.this.getClass();
        }

        public final void e(C1538b bVar) {
            this.f3772d = bVar;
        }

        public final void f(C1538b bVar) {
            this.f3771c = bVar;
        }

        public final void g(i.c cVar) {
            this.f3769a = cVar;
        }

        public final void h(int i10) {
            this.f3770b = i10;
        }

        public final void i(boolean z10) {
            this.f3773e = z10;
        }
    }

    /* renamed from: J0.a0$b */
    public interface b {
    }

    public C1231a0(G g10) {
        this.f3761a = g10;
        C1256w wVar = new C1256w(g10);
        this.f3762b = wVar;
        this.f3763c = wVar;
        z0 x32 = wVar.D2();
        this.f3764d = x32;
        this.f3765e = x32;
    }

    private final void A(int i10, C1538b bVar, C1538b bVar2, i.c cVar, boolean z10) {
        Y.e(bVar.q() - i10, bVar2.q() - i10, j(cVar, i10, bVar, bVar2, z10));
        B();
    }

    private final void B() {
        i.c P12 = this.f3764d.P1();
        int i10 = 0;
        while (P12 != null && P12 != C1233b0.f3775a) {
            i10 |= P12.N1();
            P12.b2(i10);
            P12 = P12.P1();
        }
    }

    private final i.c D(i.c cVar) {
        boolean z10;
        boolean z11 = false;
        if (cVar == C1233b0.f3775a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            G0.a.b("trimChain called on already trimmed chain");
        }
        i.c J12 = C1233b0.f3775a.J1();
        if (J12 == null) {
            J12 = this.f3764d;
        }
        J12.h2((i.c) null);
        C1233b0.f3775a.d2((i.c) null);
        C1233b0.f3775a.b2(-1);
        C1233b0.f3775a.k2((C1235c0) null);
        if (J12 != C1233b0.f3775a) {
            z11 = true;
        }
        if (!z11) {
            G0.a.b("trimChain did not update the head");
        }
        return J12;
    }

    /* access modifiers changed from: private */
    public final void F(i.b bVar, i.b bVar2, i.c cVar) {
        if ((bVar instanceof V) && (bVar2 instanceof V)) {
            C1233b0.f((V) bVar2, cVar);
            if (cVar.S1()) {
                f0.e(cVar);
            } else {
                cVar.i2(true);
            }
        } else if (cVar instanceof C1234c) {
            ((C1234c) cVar).p2(bVar2);
            if (cVar.S1()) {
                f0.e(cVar);
            } else {
                cVar.i2(true);
            }
        } else {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
    }

    /* access modifiers changed from: private */
    public final i.c g(i.b bVar, i.c cVar) {
        i.c cVar2;
        if (bVar instanceof V) {
            cVar2 = ((V) bVar).a();
            cVar2.f2(f0.h(cVar2));
        } else {
            cVar2 = new C1234c(bVar);
        }
        if (cVar2.S1()) {
            G0.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        cVar2.e2(true);
        return r(cVar2, cVar);
    }

    /* access modifiers changed from: private */
    public final i.c h(i.c cVar) {
        if (cVar.S1()) {
            f0.d(cVar);
            cVar.a2();
            cVar.U1();
        }
        return w(cVar);
    }

    /* access modifiers changed from: private */
    public final int i() {
        return this.f3765e.I1();
    }

    private final a j(i.c cVar, int i10, C1538b bVar, C1538b bVar2, boolean z10) {
        a aVar = this.f3768h;
        if (aVar == null) {
            a aVar2 = new a(cVar, i10, bVar, bVar2, z10);
            this.f3768h = aVar2;
            return aVar2;
        }
        aVar.g(cVar);
        aVar.h(i10);
        aVar.f(bVar);
        aVar.e(bVar2);
        aVar.i(z10);
        return aVar;
    }

    private final i.c r(i.c cVar, i.c cVar2) {
        i.c J12 = cVar2.J1();
        if (J12 != null) {
            J12.h2(cVar);
            cVar.d2(J12);
        }
        cVar2.d2(cVar);
        cVar.h2(cVar2);
        return cVar;
    }

    private final i.c u() {
        boolean z10;
        if (this.f3765e != C1233b0.f3775a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            G0.a.b("padChain called on already padded chain");
        }
        i.c cVar = this.f3765e;
        cVar.h2(C1233b0.f3775a);
        C1233b0.f3775a.d2(cVar);
        return C1233b0.f3775a;
    }

    /* access modifiers changed from: private */
    public final void v(i.c cVar, C1235c0 c0Var) {
        C1235c0 c0Var2;
        i.c P12 = cVar.P1();
        while (P12 != null) {
            if (P12 == C1233b0.f3775a) {
                G n02 = this.f3761a.n0();
                if (n02 != null) {
                    c0Var2 = n02.P();
                } else {
                    c0Var2 = null;
                }
                c0Var.j3(c0Var2);
                this.f3763c = c0Var;
                return;
            } else if ((C1239e0.a(2) & P12.N1()) == 0) {
                P12.k2(c0Var);
                P12 = P12.P1();
            } else {
                return;
            }
        }
    }

    private final i.c w(i.c cVar) {
        i.c J12 = cVar.J1();
        i.c P12 = cVar.P1();
        if (J12 != null) {
            J12.h2(P12);
            cVar.d2((i.c) null);
        }
        if (P12 != null) {
            P12.d2(J12);
            cVar.h2((i.c) null);
        }
        C6496s.e(P12);
        return P12;
    }

    public final void C() {
        C1235c0 c0Var;
        C c10;
        C1235c0 c0Var2 = this.f3762b;
        for (i.c P12 = this.f3764d.P1(); P12 != null; P12 = P12.P1()) {
            B d10 = C1245k.d(P12);
            if (d10 != null) {
                if (P12.K1() != null) {
                    C1235c0 K12 = P12.K1();
                    C6496s.f(K12, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    C c11 = (C) K12;
                    B y32 = c11.y3();
                    c11.B3(d10);
                    c10 = c11;
                    if (y32 != P12) {
                        c11.T2();
                        c10 = c11;
                    }
                } else {
                    C c12 = new C(this.f3761a, d10);
                    P12.k2(c12);
                    c10 = c12;
                }
                c0Var2.j3(c10);
                c10.i3(c0Var2);
                c0Var2 = c10;
            } else {
                P12.k2(c0Var2);
            }
        }
        G n02 = this.f3761a.n0();
        if (n02 != null) {
            c0Var = n02.P();
        } else {
            c0Var = null;
        }
        c0Var2.j3(c0Var);
        this.f3763c = c0Var2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(k0.i r13) {
        /*
            r12 = this;
            k0.i$c r6 = r12.u()
            a0.b r7 = r12.f3766f
            r0 = 0
            if (r7 == 0) goto L_0x000e
            int r1 = r7.q()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            a0.b r2 = r12.f3767g
            r3 = 16
            if (r2 != 0) goto L_0x001c
            a0.b r2 = new a0.b
            k0.i$b[] r4 = new k0.i.b[r3]
            r2.<init>(r4, r0)
        L_0x001c:
            a0.b r13 = J0.C1233b0.e(r13, r2)
            int r2 = r13.q()
            r8 = 0
            java.lang.String r4 = "expected prior modifier list to be non-empty"
            r9 = 1
            if (r2 != r1) goto L_0x0096
            k0.i$c r2 = r6.J1()
            r3 = r2
            r2 = r0
        L_0x0030:
            if (r3 == 0) goto L_0x005d
            if (r2 >= r1) goto L_0x005d
            if (r7 == 0) goto L_0x005f
            java.lang.Object[] r5 = r7.p()
            r5 = r5[r2]
            k0.i$b r5 = (k0.i.b) r5
            java.lang.Object[] r10 = r13.p()
            r10 = r10[r2]
            k0.i$b r10 = (k0.i.b) r10
            int r11 = J0.C1233b0.d(r5, r10)
            if (r11 == 0) goto L_0x0059
            if (r11 == r9) goto L_0x004f
            goto L_0x0052
        L_0x004f:
            r12.F(r5, r10, r3)
        L_0x0052:
            k0.i$c r3 = r3.J1()
            int r2 = r2 + 1
            goto L_0x0030
        L_0x0059:
            k0.i$c r3 = r3.P1()
        L_0x005d:
            r5 = r3
            goto L_0x0068
        L_0x005f:
            G0.a.c(r4)
            lf.k r13 = new lf.k
            r13.<init>()
            throw r13
        L_0x0068:
            if (r2 >= r1) goto L_0x0116
            if (r7 == 0) goto L_0x008d
            if (r5 == 0) goto L_0x0082
            J0.G r0 = r12.f3761a
            boolean r0 = r0.D()
            r10 = r0 ^ 1
            r0 = r12
            r1 = r2
            r2 = r7
            r3 = r13
            r4 = r5
            r5 = r10
            r0.A(r1, r2, r3, r4, r5)
        L_0x007f:
            r0 = r9
            goto L_0x0116
        L_0x0082:
            java.lang.String r13 = "structuralUpdate requires a non-null tail"
            G0.a.c(r13)
            lf.k r13 = new lf.k
            r13.<init>()
            throw r13
        L_0x008d:
            G0.a.c(r4)
            lf.k r13 = new lf.k
            r13.<init>()
            throw r13
        L_0x0096:
            J0.G r2 = r12.f3761a
            boolean r2 = r2.D()
            if (r2 == 0) goto L_0x00ba
            if (r1 != 0) goto L_0x00ba
            r1 = r6
        L_0x00a1:
            int r2 = r13.q()
            if (r0 >= r2) goto L_0x00b6
            java.lang.Object[] r2 = r13.p()
            r2 = r2[r0]
            k0.i$b r2 = (k0.i.b) r2
            k0.i$c r1 = r12.g(r2, r1)
            int r0 = r0 + 1
            goto L_0x00a1
        L_0x00b6:
            r12.B()
            goto L_0x007f
        L_0x00ba:
            int r1 = r13.q()
            if (r1 != 0) goto L_0x00fb
            if (r7 == 0) goto L_0x00f2
            k0.i$c r1 = r6.J1()
            r2 = r0
        L_0x00c7:
            if (r1 == 0) goto L_0x00da
            int r3 = r7.q()
            if (r2 >= r3) goto L_0x00da
            k0.i$c r1 = r12.h(r1)
            k0.i$c r1 = r1.J1()
            int r2 = r2 + 1
            goto L_0x00c7
        L_0x00da:
            J0.w r1 = r12.f3762b
            J0.G r2 = r12.f3761a
            J0.G r2 = r2.n0()
            if (r2 == 0) goto L_0x00e9
            J0.c0 r2 = r2.P()
            goto L_0x00ea
        L_0x00e9:
            r2 = r8
        L_0x00ea:
            r1.j3(r2)
            J0.w r1 = r12.f3762b
            r12.f3763c = r1
            goto L_0x0116
        L_0x00f2:
            G0.a.c(r4)
            lf.k r13 = new lf.k
            r13.<init>()
            throw r13
        L_0x00fb:
            if (r7 != 0) goto L_0x0104
            a0.b r7 = new a0.b
            k0.i$b[] r1 = new k0.i.b[r3]
            r7.<init>(r1, r0)
        L_0x0104:
            J0.G r0 = r12.f3761a
            boolean r0 = r0.D()
            r5 = r0 ^ 1
            r1 = 0
            r0 = r12
            r2 = r7
            r3 = r13
            r4 = r6
            r0.A(r1, r2, r3, r4, r5)
            goto L_0x007f
        L_0x0116:
            r12.f3766f = r13
            if (r7 == 0) goto L_0x011e
            r7.i()
            r8 = r7
        L_0x011e:
            r12.f3767g = r8
            k0.i$c r13 = r12.D(r6)
            r12.f3765e = r13
            if (r0 == 0) goto L_0x012b
            r12.C()
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.C1231a0.E(k0.i):void");
    }

    public final i.c k() {
        return this.f3765e;
    }

    public final C1256w l() {
        return this.f3762b;
    }

    public final G m() {
        return this.f3761a;
    }

    public final C1235c0 n() {
        return this.f3763c;
    }

    public final i.c o() {
        return this.f3764d;
    }

    public final boolean p(int i10) {
        if ((i10 & i()) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q(int i10) {
        if ((i10 & i()) != 0) {
            return true;
        }
        return false;
    }

    public final void s() {
        for (i.c k10 = k(); k10 != null; k10 = k10.J1()) {
            k10.T1();
        }
    }

    public final void t() {
        for (i.c o10 = o(); o10 != null; o10 = o10.P1()) {
            if (o10.S1()) {
                o10.U1();
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        if (this.f3765e != this.f3764d) {
            i.c k10 = k();
            while (true) {
                if (k10 == null || k10 == o()) {
                    break;
                }
                sb2.append(String.valueOf(k10));
                if (k10.J1() == this.f3764d) {
                    sb2.append("]");
                    break;
                }
                sb2.append(f.f37529a);
                k10 = k10.J1();
            }
        } else {
            sb2.append("]");
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final void x() {
        for (i.c o10 = o(); o10 != null; o10 = o10.P1()) {
            if (o10.S1()) {
                o10.Y1();
            }
        }
        z();
        t();
    }

    public final void y() {
        for (i.c k10 = k(); k10 != null; k10 = k10.J1()) {
            k10.Z1();
            if (k10.M1()) {
                f0.a(k10);
            }
            if (k10.R1()) {
                f0.e(k10);
            }
            k10.e2(false);
            k10.i2(false);
        }
    }

    public final void z() {
        for (i.c o10 = o(); o10 != null; o10 = o10.P1()) {
            if (o10.S1()) {
                o10.a2();
            }
        }
    }
}

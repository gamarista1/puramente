package V;

import C.Y;
import H0.C1181b;
import H0.C1197s;
import H0.C1198t;
import H0.E;
import H0.F;
import H0.G;
import H0.H;
import H0.U;
import X.C1458a;
import Y.C1500m;
import Y.C1503n0;
import Y.C1506p;
import Y.M0;
import c1.h;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import java.util.NoSuchElementException;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6502A;
import lf.C6514M;
import mf.O;
import q0.C2423i;
import yf.C6798l;
import yf.p;
import yf.q;

/* renamed from: V.h  reason: case insensitive filesystem */
public abstract class C1383h {

    /* renamed from: a  reason: collision with root package name */
    private static final float f7488a = h.j((float) 4);

    /* renamed from: b  reason: collision with root package name */
    private static final float f7489b = h.j((float) 12);

    /* renamed from: c  reason: collision with root package name */
    private static final float f7490c = h.j((float) 14);

    /* renamed from: d  reason: collision with root package name */
    private static final float f7491d = h.j((float) 6);

    /* renamed from: V.h$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f7492a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Y f7493b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(q qVar, Y y10) {
            super(2);
            this.f7492a = qVar;
            this.f7493b = y10;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(719214594, i10, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous> (Badge.kt:212)");
                }
                this.f7492a.invoke(this.f7493b, mVar, 0);
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.h$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f7494a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f7495b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f7496c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f7497d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f7498e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f7499f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, long j10, long j11, q qVar, int i10, int i11) {
            super(2);
            this.f7494a = iVar;
            this.f7495b = j10;
            this.f7496c = j11;
            this.f7497d = qVar;
            this.f7498e = i10;
            this.f7499f = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C1383h.a(this.f7494a, this.f7495b, this.f7496c, this.f7497d, mVar, M0.a(this.f7498e | 1), this.f7499f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.h$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1503n0 f7500a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1503n0 f7501b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1503n0 f7502c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1503n0 f7503d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C1503n0 n0Var, C1503n0 n0Var2, C1503n0 n0Var3, C1503n0 n0Var4) {
            super(1);
            this.f7500a = n0Var;
            this.f7501b = n0Var2;
            this.f7502c = n0Var3;
            this.f7503d = n0Var4;
        }

        public final void a(C1197s sVar) {
            C1197s sVar2;
            C1197s x02;
            C2423i c10 = C1198t.c(sVar);
            C1383h.f(this.f7500a, c10.i());
            C1383h.h(this.f7501b, c10.l());
            C1197s x03 = sVar.x0();
            if (x03 == null || (x02 = x03.x0()) == null) {
                sVar2 = null;
            } else {
                sVar2 = x02.B();
            }
            if (sVar2 != null) {
                C1503n0 n0Var = this.f7502c;
                C1503n0 n0Var2 = this.f7503d;
                C2423i c11 = C1198t.c(sVar2);
                C1383h.j(n0Var, c11.j());
                C1383h.e(n0Var2, c11.l());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1197s) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.h$d */
    static final class d implements F {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1503n0 f7504a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1503n0 f7505b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1503n0 f7506c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1503n0 f7507d;

        /* renamed from: V.h$d$a */
        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ U f7508a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ H f7509b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ U f7510c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C1503n0 f7511d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C1503n0 f7512e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C1503n0 f7513f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C1503n0 f7514g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(U u10, H h10, U u11, C1503n0 n0Var, C1503n0 n0Var2, C1503n0 n0Var3, C1503n0 n0Var4) {
                super(1);
                this.f7508a = u10;
                this.f7509b = h10;
                this.f7510c = u11;
                this.f7511d = n0Var;
                this.f7512e = n0Var2;
                this.f7513f = n0Var3;
                this.f7514g = n0Var4;
            }

            public final void a(U.a aVar) {
                boolean z10;
                float f10;
                float f11;
                if (this.f7508a.X0() > this.f7509b.E0(C1458a.f8885a.f())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    f10 = C1383h.t();
                } else {
                    f10 = C1383h.s();
                }
                if (z10) {
                    f11 = C1383h.u();
                } else {
                    f11 = C1383h.s();
                }
                U.a.l(aVar, this.f7510c, 0, 0, 0.0f, 4, (Object) null);
                int X02 = this.f7510c.X0() - this.f7509b.E0(f10);
                int E02 = (-this.f7508a.R0()) + this.f7509b.E0(f11);
                float o10 = C1383h.g(this.f7511d) + ((float) E02);
                float q10 = C1383h.i(this.f7513f) - ((C1383h.c(this.f7512e) + ((float) X02)) + ((float) this.f7508a.X0()));
                float l10 = o10 - C1383h.d(this.f7514g);
                if (q10 < 0.0f) {
                    X02 += Af.a.d(q10);
                }
                int i10 = X02;
                if (l10 < 0.0f) {
                    E02 -= Af.a.d(l10);
                }
                U.a aVar2 = aVar;
                U.a.l(aVar2, this.f7508a, i10, E02, 0.0f, 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((U.a) obj);
                return C6514M.f71813a;
            }
        }

        d(C1503n0 n0Var, C1503n0 n0Var2, C1503n0 n0Var3, C1503n0 n0Var4) {
            this.f7504a = n0Var;
            this.f7505b = n0Var2;
            this.f7506c = n0Var3;
            this.f7507d = n0Var4;
        }

        public final G j(H h10, List list, long j10) {
            List list2 = list;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                E e10 = (E) list2.get(i10);
                if (C6496s.c(androidx.compose.ui.layout.a.a(e10), MetricTracker.Object.BADGE)) {
                    U v02 = e10.v0(c1.b.d(j10, 0, 0, 0, 0, 11, (Object) null));
                    int size2 = list.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        E e11 = (E) list2.get(i11);
                        if (C6496s.c(androidx.compose.ui.layout.a.a(e11), "anchor")) {
                            U v03 = e11.v0(j10);
                            return h10.d1(v03.X0(), v03.R0(), O.l(C6502A.a(C1181b.a(), Integer.valueOf(v03.k0(C1181b.a()))), C6502A.a(C1181b.b(), Integer.valueOf(v03.k0(C1181b.b())))), new a(v02, h10, v03, this.f7504a, this.f7505b, this.f7506c, this.f7507d));
                        }
                        H h11 = h10;
                        long j11 = j10;
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                H h12 = h10;
                long j12 = j10;
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* renamed from: V.h$e */
    static final class e extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f7515a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f7516b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f7517c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f7518d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f7519e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(q qVar, i iVar, q qVar2, int i10, int i11) {
            super(2);
            this.f7515a = qVar;
            this.f7516b = iVar;
            this.f7517c = qVar2;
            this.f7518d = i10;
            this.f7519e = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C1383h.b(this.f7515a, this.f7516b, this.f7517c, mVar, M0.a(this.f7518d | 1), this.f7519e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(k0.i r17, long r18, long r20, yf.q r22, Y.C1500m r23, int r24, int r25) {
        /*
            r7 = r24
            r0 = 1298144073(0x4d601b49, float:2.34992784E8)
            r1 = r23
            Y.m r1 = r1.h(r0)
            r2 = r25 & 1
            r3 = 2
            if (r2 == 0) goto L_0x0016
            r4 = r7 | 6
            r5 = r4
            r4 = r17
            goto L_0x002a
        L_0x0016:
            r4 = r7 & 6
            if (r4 != 0) goto L_0x0027
            r4 = r17
            boolean r5 = r1.S(r4)
            if (r5 == 0) goto L_0x0024
            r5 = 4
            goto L_0x0025
        L_0x0024:
            r5 = r3
        L_0x0025:
            r5 = r5 | r7
            goto L_0x002a
        L_0x0027:
            r4 = r17
            r5 = r7
        L_0x002a:
            r6 = r7 & 48
            if (r6 != 0) goto L_0x0041
            r6 = r25 & 2
            r8 = r18
            if (r6 != 0) goto L_0x003d
            boolean r6 = r1.e(r8)
            if (r6 == 0) goto L_0x003d
            r6 = 32
            goto L_0x003f
        L_0x003d:
            r6 = 16
        L_0x003f:
            r5 = r5 | r6
            goto L_0x0043
        L_0x0041:
            r8 = r18
        L_0x0043:
            r6 = r7 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005a
            r6 = r25 & 4
            r10 = r20
            if (r6 != 0) goto L_0x0056
            boolean r6 = r1.e(r10)
            if (r6 == 0) goto L_0x0056
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r5 = r5 | r6
            goto L_0x005c
        L_0x005a:
            r10 = r20
        L_0x005c:
            r6 = r25 & 8
            if (r6 == 0) goto L_0x0065
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r12 = r22
            goto L_0x0077
        L_0x0065:
            r12 = r7 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0062
            r12 = r22
            boolean r13 = r1.C(r12)
            if (r13 == 0) goto L_0x0074
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r5 = r5 | r13
        L_0x0077:
            r13 = r5 & 1171(0x493, float:1.641E-42)
            r14 = 1170(0x492, float:1.64E-42)
            if (r13 != r14) goto L_0x008c
            boolean r13 = r1.i()
            if (r13 != 0) goto L_0x0084
            goto L_0x008c
        L_0x0084:
            r1.I()
            r2 = r4
        L_0x0088:
            r4 = r10
            r6 = r12
            goto L_0x01f5
        L_0x008c:
            r1.D()
            r13 = r7 & 1
            r14 = 0
            r15 = 6
            if (r13 == 0) goto L_0x00ad
            boolean r13 = r1.L()
            if (r13 == 0) goto L_0x009c
            goto L_0x00ad
        L_0x009c:
            r1.I()
            r2 = r25 & 2
            if (r2 == 0) goto L_0x00a5
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00a5:
            r2 = r25 & 4
            if (r2 == 0) goto L_0x00ab
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ab:
            r2 = r4
            goto L_0x00d1
        L_0x00ad:
            if (r2 == 0) goto L_0x00b2
            k0.i$a r2 = k0.i.f23074a
            goto L_0x00b3
        L_0x00b2:
            r2 = r4
        L_0x00b3:
            r4 = r25 & 2
            if (r4 == 0) goto L_0x00bf
            V.g r4 = V.C1381g.f7464a
            long r8 = r4.a(r1, r15)
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00bf:
            r4 = r25 & 4
            if (r4 == 0) goto L_0x00ce
            int r4 = r5 >> 3
            r4 = r4 & 14
            long r10 = V.C1404s.c(r8, r1, r4)
            r4 = r5 & -897(0xfffffffffffffc7f, float:NaN)
            r5 = r4
        L_0x00ce:
            if (r6 == 0) goto L_0x00d1
            r12 = r14
        L_0x00d1:
            r1.v()
            boolean r4 = Y.C1506p.H()
            if (r4 == 0) goto L_0x00e0
            r4 = -1
            java.lang.String r6 = "androidx.compose.material3.Badge (Badge.kt:183)"
            Y.C1506p.Q(r0, r5, r4, r6)
        L_0x00e0:
            X.a r0 = X.C1458a.f8885a
            if (r12 == 0) goto L_0x00e9
            float r0 = r0.d()
            goto L_0x00ed
        L_0x00e9:
            float r0 = r0.f()
        L_0x00ed:
            if (r12 == 0) goto L_0x0103
            r4 = -1271801170(0xffffffffb431daae, float:-1.6563965E-7)
            r1.T(r4)
            X.a r4 = X.C1458a.f8885a
            X.x r4 = r4.c()
            r0.g2 r4 = V.C0.d(r4, r1, r15)
            r1.M()
            goto L_0x0116
        L_0x0103:
            r4 = -1271743789(0xffffffffb432bad3, float:-1.6645508E-7)
            r1.T(r4)
            X.a r4 = X.C1458a.f8885a
            X.x r4 = r4.e()
            r0.g2 r4 = V.C0.d(r4, r1, r15)
            r1.M()
        L_0x0116:
            k0.i r0 = androidx.compose.foundation.layout.q.a(r2, r0, r0)
            k0.i r0 = androidx.compose.foundation.b.c(r0, r8, r4)
            if (r12 == 0) goto L_0x012a
            k0.i$a r4 = k0.i.f23074a
            float r6 = f7488a
            r13 = 0
            k0.i r3 = androidx.compose.foundation.layout.n.k(r4, r6, r13, r3, r14)
            goto L_0x012c
        L_0x012a:
            k0.i$a r3 = k0.i.f23074a
        L_0x012c:
            k0.i r0 = r0.h(r3)
            k0.c$a r3 = k0.c.f23044a
            k0.c$c r3 = r3.i()
            C.c r4 = C.C1085c.f882a
            C.c$f r4 = r4.b()
            r6 = 54
            H0.F r3 = C.W.b(r4, r3, r1, r6)
            r4 = 0
            int r4 = Y.C1494j.a(r1, r4)
            Y.y r13 = r1.p()
            k0.i r0 = k0.h.e(r1, r0)
            J0.g$a r14 = J0.C1241g.f3853J
            yf.a r6 = r14.a()
            Y.f r16 = r1.j()
            if (r16 != 0) goto L_0x015e
            Y.C1494j.c()
        L_0x015e:
            r1.F()
            boolean r16 = r1.f()
            if (r16 == 0) goto L_0x016b
            r1.U(r6)
            goto L_0x016e
        L_0x016b:
            r1.q()
        L_0x016e:
            Y.m r6 = Y.F1.a(r1)
            yf.p r15 = r14.c()
            Y.F1.b(r6, r3, r15)
            yf.p r3 = r14.e()
            Y.F1.b(r6, r13, r3)
            yf.p r3 = r14.b()
            boolean r13 = r6.f()
            if (r13 != 0) goto L_0x0198
            java.lang.Object r13 = r6.A()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)
            boolean r13 = kotlin.jvm.internal.C6496s.c(r13, r15)
            if (r13 != 0) goto L_0x01a6
        L_0x0198:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)
            r6.r(r13)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.V(r4, r3)
        L_0x01a6:
            yf.p r3 = r14.d()
            Y.F1.b(r6, r0, r3)
            C.Z r0 = C.Z.f873a
            r3 = -1705294841(0xffffffff9a5b4407, float:-4.534309E-23)
            r1.T(r3)
            if (r12 == 0) goto L_0x01e4
            X.a r3 = X.C1458a.f8885a
            X.H r3 = r3.b()
            r4 = 6
            Q0.T r3 = V.Z0.c(r3, r1, r4)
            V.h$a r6 = new V.h$a
            r6.<init>(r12, r0)
            r0 = 719214594(0x2ade5802, float:3.949619E-13)
            r13 = 1
            r14 = 54
            g0.a r0 = g0.c.e(r0, r13, r6, r1, r14)
            int r4 = r5 >> 6
            r4 = r4 & 14
            r4 = r4 | 384(0x180, float:5.38E-43)
            r17 = r10
            r19 = r3
            r20 = r0
            r21 = r1
            r22 = r4
            W.u.a(r17, r19, r20, r21, r22)
        L_0x01e4:
            r1.M()
            r1.u()
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0088
            Y.C1506p.P()
            goto L_0x0088
        L_0x01f5:
            Y.Y0 r10 = r1.k()
            if (r10 == 0) goto L_0x020a
            V.h$b r11 = new V.h$b
            r0 = r11
            r1 = r2
            r2 = r8
            r7 = r24
            r8 = r25
            r0.<init>(r1, r2, r4, r6, r7, r8)
            r10.a(r11)
        L_0x020a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.C1383h.a(k0.i, long, long, yf.q, Y.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(yf.q r17, k0.i r18, yf.q r19, Y.C1500m r20, int r21, int r22) {
        /*
            r1 = r17
            r3 = r19
            r4 = r21
            r0 = 1404022535(0x53afaf07, float:1.5091115E12)
            r2 = r20
            Y.m r2 = r2.h(r0)
            r5 = r22 & 1
            if (r5 == 0) goto L_0x0016
            r5 = r4 | 6
            goto L_0x0026
        L_0x0016:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0025
            boolean r5 = r2.C(r1)
            if (r5 == 0) goto L_0x0022
            r5 = 4
            goto L_0x0023
        L_0x0022:
            r5 = 2
        L_0x0023:
            r5 = r5 | r4
            goto L_0x0026
        L_0x0025:
            r5 = r4
        L_0x0026:
            r6 = r22 & 2
            if (r6 == 0) goto L_0x002f
            r5 = r5 | 48
        L_0x002c:
            r7 = r18
            goto L_0x0041
        L_0x002f:
            r7 = r4 & 48
            if (r7 != 0) goto L_0x002c
            r7 = r18
            boolean r8 = r2.S(r7)
            if (r8 == 0) goto L_0x003e
            r8 = 32
            goto L_0x0040
        L_0x003e:
            r8 = 16
        L_0x0040:
            r5 = r5 | r8
        L_0x0041:
            r8 = r22 & 4
            if (r8 == 0) goto L_0x0048
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0058
        L_0x0048:
            r8 = r4 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0058
            boolean r8 = r2.C(r3)
            if (r8 == 0) goto L_0x0055
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r5 = r5 | r8
        L_0x0058:
            r8 = r5 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x006b
            boolean r8 = r2.i()
            if (r8 != 0) goto L_0x0065
            goto L_0x006b
        L_0x0065:
            r2.I()
            r6 = r7
            goto L_0x0292
        L_0x006b:
            if (r6 == 0) goto L_0x0070
            k0.i$a r6 = k0.i.f23074a
            goto L_0x0071
        L_0x0070:
            r6 = r7
        L_0x0071:
            boolean r7 = Y.C1506p.H()
            if (r7 == 0) goto L_0x007d
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.BadgedBox (Badge.kt:72)"
            Y.C1506p.Q(r0, r5, r7, r8)
        L_0x007d:
            java.lang.Object r0 = r2.A()
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r8 = r7.a()
            r9 = 0
            if (r0 != r8) goto L_0x0091
            Y.n0 r0 = Y.D0.a(r9)
            r2.r(r0)
        L_0x0091:
            Y.n0 r0 = (Y.C1503n0) r0
            java.lang.Object r8 = r2.A()
            java.lang.Object r10 = r7.a()
            if (r8 != r10) goto L_0x00a4
            Y.n0 r8 = Y.D0.a(r9)
            r2.r(r8)
        L_0x00a4:
            Y.n0 r8 = (Y.C1503n0) r8
            java.lang.Object r9 = r2.A()
            java.lang.Object r10 = r7.a()
            if (r9 != r10) goto L_0x00b9
            r9 = 2139095040(0x7f800000, float:Infinity)
            Y.n0 r9 = Y.D0.a(r9)
            r2.r(r9)
        L_0x00b9:
            Y.n0 r9 = (Y.C1503n0) r9
            java.lang.Object r10 = r2.A()
            java.lang.Object r11 = r7.a()
            if (r10 != r11) goto L_0x00ce
            r10 = -8388608(0xffffffffff800000, float:-Infinity)
            Y.n0 r10 = Y.D0.a(r10)
            r2.r(r10)
        L_0x00ce:
            Y.n0 r10 = (Y.C1503n0) r10
            java.lang.Object r11 = r2.A()
            java.lang.Object r12 = r7.a()
            if (r11 != r12) goto L_0x00e2
            V.h$c r11 = new V.h$c
            r11.<init>(r0, r8, r9, r10)
            r2.r(r11)
        L_0x00e2:
            yf.l r11 = (yf.C6798l) r11
            k0.i r11 = androidx.compose.ui.layout.c.a(r6, r11)
            java.lang.Object r12 = r2.A()
            java.lang.Object r7 = r7.a()
            if (r12 != r7) goto L_0x00fa
            V.h$d r12 = new V.h$d
            r12.<init>(r8, r0, r9, r10)
            r2.r(r12)
        L_0x00fa:
            H0.F r12 = (H0.F) r12
            r0 = 0
            int r7 = Y.C1494j.a(r2, r0)
            Y.y r8 = r2.p()
            k0.i r9 = k0.h.e(r2, r11)
            J0.g$a r10 = J0.C1241g.f3853J
            yf.a r11 = r10.a()
            Y.f r13 = r2.j()
            if (r13 != 0) goto L_0x0118
            Y.C1494j.c()
        L_0x0118:
            r2.F()
            boolean r13 = r2.f()
            if (r13 == 0) goto L_0x0125
            r2.U(r11)
            goto L_0x0128
        L_0x0125:
            r2.q()
        L_0x0128:
            Y.m r11 = Y.F1.a(r2)
            yf.p r13 = r10.c()
            Y.F1.b(r11, r12, r13)
            yf.p r12 = r10.e()
            Y.F1.b(r11, r8, r12)
            yf.p r8 = r10.b()
            boolean r12 = r11.f()
            if (r12 != 0) goto L_0x0152
            java.lang.Object r12 = r11.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r13)
            if (r12 != 0) goto L_0x0160
        L_0x0152:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r11.r(r12)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11.V(r7, r8)
        L_0x0160:
            yf.p r7 = r10.d()
            Y.F1.b(r11, r9, r7)
            k0.i$a r7 = k0.i.f23074a
            java.lang.String r8 = "anchor"
            k0.i r8 = androidx.compose.ui.layout.a.b(r7, r8)
            k0.c$a r9 = k0.c.f23044a
            k0.c r11 = r9.e()
            int r12 = r5 << 3
            r12 = r12 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | 54
            H0.F r11 = androidx.compose.foundation.layout.d.h(r11, r0)
            int r13 = Y.C1494j.a(r2, r0)
            Y.y r14 = r2.p()
            k0.i r8 = k0.h.e(r2, r8)
            yf.a r15 = r10.a()
            Y.f r16 = r2.j()
            if (r16 != 0) goto L_0x0198
            Y.C1494j.c()
        L_0x0198:
            r2.F()
            boolean r16 = r2.f()
            if (r16 == 0) goto L_0x01a5
            r2.U(r15)
            goto L_0x01a8
        L_0x01a5:
            r2.q()
        L_0x01a8:
            Y.m r15 = Y.F1.a(r2)
            yf.p r0 = r10.c()
            Y.F1.b(r15, r11, r0)
            yf.p r0 = r10.e()
            Y.F1.b(r15, r14, r0)
            yf.p r0 = r10.b()
            boolean r11 = r15.f()
            if (r11 != 0) goto L_0x01d2
            java.lang.Object r11 = r15.A()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            boolean r11 = kotlin.jvm.internal.C6496s.c(r11, r14)
            if (r11 != 0) goto L_0x01e0
        L_0x01d2:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r15.r(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r15.V(r11, r0)
        L_0x01e0:
            yf.p r0 = r10.d()
            Y.F1.b(r15, r8, r0)
            androidx.compose.foundation.layout.f r0 = androidx.compose.foundation.layout.f.f12848a
            int r8 = r12 >> 6
            r8 = r8 & 112(0x70, float:1.57E-43)
            r8 = r8 | 6
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3.invoke(r0, r2, r8)
            r2.u()
            java.lang.String r8 = "badge"
            k0.i r7 = androidx.compose.ui.layout.a.b(r7, r8)
            int r5 = r5 << 9
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | 6
            k0.c r8 = r9.o()
            r9 = 0
            H0.F r8 = androidx.compose.foundation.layout.d.h(r8, r9)
            int r9 = Y.C1494j.a(r2, r9)
            Y.y r11 = r2.p()
            k0.i r7 = k0.h.e(r2, r7)
            yf.a r12 = r10.a()
            Y.f r13 = r2.j()
            if (r13 != 0) goto L_0x0227
            Y.C1494j.c()
        L_0x0227:
            r2.F()
            boolean r13 = r2.f()
            if (r13 == 0) goto L_0x0234
            r2.U(r12)
            goto L_0x0237
        L_0x0234:
            r2.q()
        L_0x0237:
            Y.m r12 = Y.F1.a(r2)
            yf.p r13 = r10.c()
            Y.F1.b(r12, r8, r13)
            yf.p r8 = r10.e()
            Y.F1.b(r12, r11, r8)
            yf.p r8 = r10.b()
            boolean r11 = r12.f()
            if (r11 != 0) goto L_0x0261
            java.lang.Object r11 = r12.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            boolean r11 = kotlin.jvm.internal.C6496s.c(r11, r13)
            if (r11 != 0) goto L_0x026f
        L_0x0261:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r12.r(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.V(r9, r8)
        L_0x026f:
            yf.p r8 = r10.d()
            Y.F1.b(r12, r7, r8)
            int r5 = r5 >> 6
            r5 = r5 & 112(0x70, float:1.57E-43)
            r5 = r5 | 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.invoke(r0, r2, r5)
            r2.u()
            r2.u()
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0292
            Y.C1506p.P()
        L_0x0292:
            Y.Y0 r7 = r2.k()
            if (r7 == 0) goto L_0x02aa
            V.h$e r8 = new V.h$e
            r0 = r8
            r1 = r17
            r2 = r6
            r3 = r19
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a(r8)
        L_0x02aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.C1383h.b(yf.q, k0.i, yf.q, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final float c(C1503n0 n0Var) {
        return n0Var.c();
    }

    /* access modifiers changed from: private */
    public static final float d(C1503n0 n0Var) {
        return n0Var.c();
    }

    /* access modifiers changed from: private */
    public static final void e(C1503n0 n0Var, float f10) {
        n0Var.l(f10);
    }

    /* access modifiers changed from: private */
    public static final void f(C1503n0 n0Var, float f10) {
        n0Var.l(f10);
    }

    /* access modifiers changed from: private */
    public static final float g(C1503n0 n0Var) {
        return n0Var.c();
    }

    /* access modifiers changed from: private */
    public static final void h(C1503n0 n0Var, float f10) {
        n0Var.l(f10);
    }

    /* access modifiers changed from: private */
    public static final float i(C1503n0 n0Var) {
        return n0Var.c();
    }

    /* access modifiers changed from: private */
    public static final void j(C1503n0 n0Var, float f10) {
        n0Var.l(f10);
    }

    public static final float s() {
        return f7491d;
    }

    public static final float t() {
        return f7489b;
    }

    public static final float u() {
        return f7490c;
    }
}

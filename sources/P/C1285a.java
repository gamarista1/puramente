package P;

import C.C1085c;
import C.W;
import C.Z;
import C.a0;
import H0.F;
import J.C1216l;
import J0.C1241g;
import O0.u;
import O0.v;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1521x;
import Y.C1523y;
import Y.F1;
import Y.J0;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.C1644k0;
import androidx.compose.ui.platform.v1;
import c1.k;
import c1.t;
import k0.h;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import o0.C2341d;
import o0.C2345h;
import q0.C2421g;
import q0.C2422h;
import q0.C2427m;
import q0.C2428n;
import r0.C2490f0;
import r0.C2520p0;
import r0.C2526r0;
import r0.C2544x0;
import r0.C2547y0;
import r0.C2550z0;
import r0.H1;
import r0.I1;
import r0.J1;
import s0.C2581c;
import t0.C2600a;
import t0.C2602c;
import t0.C2603d;
import t0.C2605f;
import t0.C2606g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: P.a  reason: case insensitive filesystem */
public abstract class C1285a {

    /* renamed from: P.a$a  reason: collision with other inner class name */
    static final class C0122a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1293i f4839a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.c f4840b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f4841c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f4842d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0122a(C1293i iVar, k0.c cVar, p pVar, int i10) {
            super(2);
            this.f4839a = iVar;
            this.f4840b = cVar;
            this.f4841c = pVar;
            this.f4842d = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C1285a.a(this.f4839a, this.f4840b, this.f4841c, mVar, M0.a(this.f4842d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: P.a$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v1 f4843a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f4844b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f4845c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f4846d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C1293i f4847e;

        /* renamed from: P.a$b$a  reason: collision with other inner class name */
        static final class C0123a extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f4848a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f4849b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ i f4850c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C1293i f4851d;

            /* renamed from: P.a$b$a$a  reason: collision with other inner class name */
            static final class C0124a extends C6498u implements C6787a {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C1293i f4852a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0124a(C1293i iVar) {
                    super(0);
                    this.f4852a = iVar;
                }

                /* renamed from: a */
                public final Boolean invoke() {
                    return Boolean.valueOf(C2422h.c(this.f4852a.a()));
                }
            }

            /* renamed from: P.a$b$a$b  reason: collision with other inner class name */
            static final class C0125b extends C6498u implements C6787a {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C1293i f4853a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0125b(C1293i iVar) {
                    super(0);
                    this.f4853a = iVar;
                }

                /* renamed from: a */
                public final Boolean invoke() {
                    return Boolean.valueOf(C2422h.c(this.f4853a.a()));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0123a(long j10, boolean z10, i iVar, C1293i iVar2) {
                super(2);
                this.f4848a = j10;
                this.f4849b = z10;
                this.f4850c = iVar;
                this.f4851d = iVar2;
            }

            public final void a(C1500m mVar, int i10) {
                C1085c.e eVar;
                if ((i10 & 3) != 2 || !mVar.i()) {
                    if (C1506p.H()) {
                        C1506p.Q(-1426434671, i10, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:83)");
                    }
                    if (this.f4848a != 9205357640488583168L) {
                        mVar.T(-837727128);
                        if (this.f4849b) {
                            eVar = C1085c.a.f891a.c();
                        } else {
                            eVar = C1085c.a.f891a.b();
                        }
                        i m10 = q.m(this.f4850c, k.h(this.f4848a), k.g(this.f4848a), 0.0f, 0.0f, 12, (Object) null);
                        C1293i iVar = this.f4851d;
                        boolean z10 = this.f4849b;
                        F b10 = W.b(eVar, k0.c.f23044a.l(), mVar, 0);
                        int a10 = C1494j.a(mVar, 0);
                        C1523y p10 = mVar.p();
                        i e10 = h.e(mVar, m10);
                        C1241g.a aVar = C1241g.f3853J;
                        C6787a a11 = aVar.a();
                        if (mVar.j() == null) {
                            C1494j.c();
                        }
                        mVar.F();
                        if (mVar.f()) {
                            mVar.U(a11);
                        } else {
                            mVar.q();
                        }
                        C1500m a12 = F1.a(mVar);
                        F1.b(a12, b10, aVar.c());
                        F1.b(a12, p10, aVar.e());
                        p b11 = aVar.b();
                        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                            a12.r(Integer.valueOf(a10));
                            a12.V(Integer.valueOf(a10), b11);
                        }
                        F1.b(a12, e10, aVar.d());
                        Z z11 = Z.f873a;
                        i.a aVar2 = i.f23074a;
                        boolean C10 = mVar.C(iVar);
                        Object A10 = mVar.A();
                        if (C10 || A10 == C1500m.f10026a.a()) {
                            A10 = new C0124a(iVar);
                            mVar.r(A10);
                        }
                        C1285a.c(aVar2, (C6787a) A10, z10, mVar, 6);
                        mVar.u();
                        mVar.M();
                    } else {
                        mVar.T(-836867312);
                        i iVar2 = this.f4850c;
                        boolean C11 = mVar.C(this.f4851d);
                        C1293i iVar3 = this.f4851d;
                        Object A11 = mVar.A();
                        if (C11 || A11 == C1500m.f10026a.a()) {
                            A11 = new C0125b(iVar3);
                            mVar.r(A11);
                        }
                        C1285a.c(iVar2, (C6787a) A11, this.f4849b, mVar, 0);
                        mVar.M();
                    }
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(v1 v1Var, long j10, boolean z10, i iVar, C1293i iVar2) {
            super(2);
            this.f4843a = v1Var;
            this.f4844b = j10;
            this.f4845c = z10;
            this.f4846d = iVar;
            this.f4847e = iVar2;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(280174801, i10, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:82)");
                }
                C1521x.a(C1644k0.r().d(this.f4843a), g0.c.e(-1426434671, true, new C0123a(this.f4844b, this.f4845c, this.f4846d, this.f4847e), mVar, 54), mVar, J0.f9784i | 48);
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

    /* renamed from: P.a$c */
    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1293i f4854a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f4855b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b1.i f4856c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f4857d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f4858e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f4859f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f4860g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f4861h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C1293i iVar, boolean z10, b1.i iVar2, boolean z11, long j10, i iVar3, int i10, int i11) {
            super(2);
            this.f4854a = iVar;
            this.f4855b = z10;
            this.f4856c = iVar2;
            this.f4857d = z11;
            this.f4858e = j10;
            this.f4859f = iVar3;
            this.f4860g = i10;
            this.f4861h = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C1285a.b(this.f4854a, this.f4855b, this.f4856c, this.f4857d, this.f4858e, this.f4859f, mVar, M0.a(this.f4860g | 1), this.f4861h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: P.a$d */
    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1293i f4862a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f4863b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f4864c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C1293i iVar, boolean z10, boolean z11) {
            super(1);
            this.f4862a = iVar;
            this.f4863b = z10;
            this.f4864c = z11;
        }

        public final void a(v vVar) {
            C1216l lVar;
            u uVar;
            long a10 = this.f4862a.a();
            u d10 = w.d();
            if (this.f4863b) {
                lVar = C1216l.SelectionStart;
            } else {
                lVar = C1216l.SelectionEnd;
            }
            C1216l lVar2 = lVar;
            if (this.f4864c) {
                uVar = u.Left;
            } else {
                uVar = u.Right;
            }
            vVar.a(d10, new v(lVar2, a10, uVar, C2422h.c(a10), (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: P.a$e */
    static final class e extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f4865a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f4866b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f4867c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f4868d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar, C6787a aVar, boolean z10, int i10) {
            super(2);
            this.f4865a = iVar;
            this.f4866b = aVar;
            this.f4867c = z10;
            this.f4868d = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C1285a.c(this.f4865a, this.f4866b, this.f4867c, mVar, M0.a(this.f4868d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: P.a$f */
    static final class f extends C6498u implements yf.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f4869a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f4870b;

        /* renamed from: P.a$f$a  reason: collision with other inner class name */
        static final class C0126a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f4871a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C6787a f4872b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f4873c;

            /* renamed from: P.a$f$a$a  reason: collision with other inner class name */
            static final class C0127a extends C6498u implements C6798l {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C6787a f4874a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ boolean f4875b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ H1 f4876c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C2547y0 f4877d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0127a(C6787a aVar, boolean z10, H1 h12, C2547y0 y0Var) {
                    super(1);
                    this.f4874a = aVar;
                    this.f4875b = z10;
                    this.f4876c = h12;
                    this.f4877d = y0Var;
                }

                public final void a(C2602c cVar) {
                    cVar.H1();
                    if (((Boolean) this.f4874a.invoke()).booleanValue()) {
                        if (this.f4875b) {
                            H1 h12 = this.f4876c;
                            C2547y0 y0Var = this.f4877d;
                            long y12 = cVar.y1();
                            C2603d w12 = cVar.w1();
                            long d10 = w12.d();
                            w12.f().q();
                            try {
                                w12.e().e(-1.0f, 1.0f, y12);
                                C2605f.a1(cVar, h12, 0, 0.0f, (C2606g) null, y0Var, 0, 46, (Object) null);
                            } finally {
                                w12.f().h();
                                w12.h(d10);
                            }
                        } else {
                            C2605f.a1(cVar, this.f4876c, 0, 0.0f, (C2606g) null, this.f4877d, 0, 46, (Object) null);
                        }
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((C2602c) obj);
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0126a(long j10, C6787a aVar, boolean z10) {
                super(1);
                this.f4871a = j10;
                this.f4872b = aVar;
                this.f4873c = z10;
            }

            /* renamed from: a */
            public final C2345h invoke(C2341d dVar) {
                return dVar.o(new C0127a(this.f4872b, this.f4873c, C1285a.d(dVar, C2427m.k(dVar.d()) / 2.0f), C2547y0.a.c(C2547y0.f25576b, this.f4871a, 0, 2, (Object) null)));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C6787a aVar, boolean z10) {
            super(3);
            this.f4869a = aVar;
            this.f4870b = z10;
        }

        public final i a(i iVar, C1500m mVar, int i10) {
            mVar.T(-196777734);
            if (C1506p.H()) {
                C1506p.Q(-196777734, i10, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:134)");
            }
            long b10 = ((K) mVar.m(L.b())).b();
            boolean e10 = mVar.e(b10) | mVar.S(this.f4869a) | mVar.b(this.f4870b);
            C6787a aVar = this.f4869a;
            boolean z10 = this.f4870b;
            Object A10 = mVar.A();
            if (e10 || A10 == C1500m.f10026a.a()) {
                A10 = new C0126a(b10, aVar, z10);
                mVar.r(A10);
            }
            i c10 = androidx.compose.ui.draw.b.c(iVar, (C6798l) A10);
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.M();
            return c10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((i) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: P.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(P.C1293i r21, k0.c r22, yf.p r23, Y.C1500m r24, int r25) {
        /*
            r0 = r21
            r1 = r22
            r9 = r23
            r10 = r25
            r2 = 476043083(0x1c5fd74b, float:7.406277E-22)
            r3 = r24
            Y.m r11 = r3.h(r2)
            r3 = r10 & 6
            r4 = 4
            if (r3 != 0) goto L_0x002a
            r3 = r10 & 8
            if (r3 != 0) goto L_0x001f
            boolean r3 = r11.S(r0)
            goto L_0x0023
        L_0x001f:
            boolean r3 = r11.C(r0)
        L_0x0023:
            if (r3 == 0) goto L_0x0027
            r3 = r4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r10
            goto L_0x002b
        L_0x002a:
            r3 = r10
        L_0x002b:
            r5 = r10 & 48
            r6 = 32
            if (r5 != 0) goto L_0x003c
            boolean r5 = r11.S(r1)
            if (r5 == 0) goto L_0x0039
            r5 = r6
            goto L_0x003b
        L_0x0039:
            r5 = 16
        L_0x003b:
            r3 = r3 | r5
        L_0x003c:
            r5 = r10 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x004c
            boolean r5 = r11.C(r9)
            if (r5 == 0) goto L_0x0049
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x004b
        L_0x0049:
            r5 = 128(0x80, float:1.794E-43)
        L_0x004b:
            r3 = r3 | r5
        L_0x004c:
            r5 = r3 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r5 != r7) goto L_0x005e
            boolean r5 = r11.i()
            if (r5 != 0) goto L_0x0059
            goto L_0x005e
        L_0x0059:
            r11.I()
            goto L_0x00c6
        L_0x005e:
            boolean r5 = Y.C1506p.H()
            if (r5 == 0) goto L_0x006a
            r5 = -1
            java.lang.String r7 = "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:247)"
            Y.C1506p.Q(r2, r3, r5, r7)
        L_0x006a:
            r2 = r3 & 112(0x70, float:1.57E-43)
            r5 = 0
            r7 = 1
            if (r2 != r6) goto L_0x0072
            r2 = r7
            goto L_0x0073
        L_0x0072:
            r2 = r5
        L_0x0073:
            r6 = r3 & 14
            if (r6 == r4) goto L_0x0081
            r4 = r3 & 8
            if (r4 == 0) goto L_0x0082
            boolean r4 = r11.S(r0)
            if (r4 == 0) goto L_0x0082
        L_0x0081:
            r5 = r7
        L_0x0082:
            r2 = r2 | r5
            java.lang.Object r4 = r11.A()
            if (r2 != 0) goto L_0x0091
            Y.m$a r2 = Y.C1500m.f10026a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x0099
        L_0x0091:
            P.g r4 = new P.g
            r4.<init>(r1, r0)
            r11.r(r4)
        L_0x0099:
            r2 = r4
            P.g r2 = (P.C1291g) r2
            androidx.compose.ui.window.s r4 = new androidx.compose.ui.window.s
            r19 = 15
            r20 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
            r12 = r4
            r12.<init>((boolean) r13, (boolean) r14, (boolean) r15, (androidx.compose.ui.window.t) r16, (boolean) r17, (boolean) r18, (int) r19, (kotlin.jvm.internal.DefaultConstructorMarker) r20)
            int r3 = r3 << 3
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r7 = r3 | 384(0x180, float:5.38E-43)
            r8 = 2
            r3 = 0
            r5 = r23
            r6 = r11
            androidx.compose.ui.window.b.a(r2, r3, r4, r5, r6, r7, r8)
            boolean r2 = Y.C1506p.H()
            if (r2 == 0) goto L_0x00c6
            Y.C1506p.P()
        L_0x00c6:
            Y.Y0 r2 = r11.k()
            if (r2 == 0) goto L_0x00d4
            P.a$a r3 = new P.a$a
            r3.<init>(r0, r1, r9, r10)
            r2.a(r3)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C1285a.a(P.i, k0.c, yf.p, Y.m, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00dc, code lost:
        if ((r27 & 16) != 0) goto L_0x00de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(P.C1293i r18, boolean r19, b1.i r20, boolean r21, long r22, k0.i r24, Y.C1500m r25, int r26, int r27) {
        /*
            r7 = r18
            r8 = r19
            r9 = r24
            r10 = r26
            r0 = -843755800(0xffffffffcdb54ee8, float:-3.80230912E8)
            r1 = r25
            Y.m r11 = r1.h(r0)
            r1 = r27 & 1
            r2 = 4
            if (r1 == 0) goto L_0x0019
            r1 = r10 | 6
            goto L_0x0032
        L_0x0019:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x0031
            r1 = r10 & 8
            if (r1 != 0) goto L_0x0026
            boolean r1 = r11.S(r7)
            goto L_0x002a
        L_0x0026:
            boolean r1 = r11.C(r7)
        L_0x002a:
            if (r1 == 0) goto L_0x002e
            r1 = r2
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r10
            goto L_0x0032
        L_0x0031:
            r1 = r10
        L_0x0032:
            r3 = r27 & 2
            r4 = 32
            if (r3 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004a
        L_0x003b:
            r3 = r10 & 48
            if (r3 != 0) goto L_0x004a
            boolean r3 = r11.b(r8)
            if (r3 == 0) goto L_0x0047
            r3 = r4
            goto L_0x0049
        L_0x0047:
            r3 = 16
        L_0x0049:
            r1 = r1 | r3
        L_0x004a:
            r3 = r27 & 4
            if (r3 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            r12 = r20
            goto L_0x0065
        L_0x0053:
            r3 = r10 & 384(0x180, float:5.38E-43)
            r12 = r20
            if (r3 != 0) goto L_0x0065
            boolean r3 = r11.S(r12)
            if (r3 == 0) goto L_0x0062
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r3
        L_0x0065:
            r3 = r27 & 8
            if (r3 == 0) goto L_0x006e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r13 = r21
            goto L_0x0080
        L_0x006e:
            r3 = r10 & 3072(0xc00, float:4.305E-42)
            r13 = r21
            if (r3 != 0) goto L_0x0080
            boolean r3 = r11.b(r13)
            if (r3 == 0) goto L_0x007d
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r1 = r1 | r3
        L_0x0080:
            r3 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0097
            r3 = r27 & 16
            r5 = r22
            if (r3 != 0) goto L_0x0093
            boolean r3 = r11.e(r5)
            if (r3 == 0) goto L_0x0093
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0093:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r1 = r1 | r3
            goto L_0x0099
        L_0x0097:
            r5 = r22
        L_0x0099:
            r3 = r27 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x00a1
            r1 = r1 | r14
            goto L_0x00b1
        L_0x00a1:
            r3 = r10 & r14
            if (r3 != 0) goto L_0x00b1
            boolean r3 = r11.S(r9)
            if (r3 == 0) goto L_0x00ae
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r1 = r1 | r3
        L_0x00b1:
            r3 = 74899(0x12493, float:1.04956E-40)
            r3 = r3 & r1
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r14) goto L_0x00c6
            boolean r3 = r11.i()
            if (r3 != 0) goto L_0x00c1
            goto L_0x00c6
        L_0x00c1:
            r11.I()
            goto L_0x0182
        L_0x00c6:
            r11.D()
            r3 = r10 & 1
            r14 = -57345(0xffffffffffff1fff, float:NaN)
            if (r3 == 0) goto L_0x00e1
            boolean r3 = r11.L()
            if (r3 == 0) goto L_0x00d7
            goto L_0x00e1
        L_0x00d7:
            r11.I()
            r3 = r27 & 16
            if (r3 == 0) goto L_0x00df
        L_0x00de:
            r1 = r1 & r14
        L_0x00df:
            r14 = r5
            goto L_0x00ec
        L_0x00e1:
            r3 = r27 & 16
            if (r3 == 0) goto L_0x00df
            c1.k$a r3 = c1.k.f19222b
            long r5 = r3.a()
            goto L_0x00de
        L_0x00ec:
            r11.v()
            boolean r3 = Y.C1506p.H()
            if (r3 == 0) goto L_0x00fb
            r3 = -1
            java.lang.String r5 = "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:64)"
            Y.C1506p.Q(r0, r1, r3, r5)
        L_0x00fb:
            boolean r5 = P.w.f(r19, r20, r21)
            k0.a r0 = k0.C2139a.f23035a
            if (r5 == 0) goto L_0x0109
            k0.c r0 = r0.d()
        L_0x0107:
            r6 = r0
            goto L_0x010e
        L_0x0109:
            k0.c r0 = r0.c()
            goto L_0x0107
        L_0x010e:
            r3 = r1 & 14
            r0 = 1
            if (r3 == r2) goto L_0x0120
            r2 = r1 & 8
            if (r2 == 0) goto L_0x011e
            boolean r2 = r11.C(r7)
            if (r2 == 0) goto L_0x011e
            goto L_0x0120
        L_0x011e:
            r2 = 0
            goto L_0x0121
        L_0x0120:
            r2 = r0
        L_0x0121:
            r1 = r1 & 112(0x70, float:1.57E-43)
            if (r1 != r4) goto L_0x0127
            r1 = r0
            goto L_0x0128
        L_0x0127:
            r1 = 0
        L_0x0128:
            r1 = r1 | r2
            boolean r2 = r11.b(r5)
            r1 = r1 | r2
            java.lang.Object r2 = r11.A()
            if (r1 != 0) goto L_0x013c
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0144
        L_0x013c:
            P.a$d r2 = new P.a$d
            r2.<init>(r7, r8, r5)
            r11.r(r2)
        L_0x0144:
            yf.l r2 = (yf.C6798l) r2
            r1 = 0
            r4 = 0
            k0.i r16 = O0.m.d(r9, r4, r2, r0, r1)
            Y.I0 r1 = androidx.compose.ui.platform.C1644k0.r()
            java.lang.Object r1 = r11.m(r1)
            androidx.compose.ui.platform.v1 r1 = (androidx.compose.ui.platform.v1) r1
            P.a$b r4 = new P.a$b
            r2 = r0
            r0 = r4
            r9 = r2
            r8 = r3
            r2 = r14
            r10 = r4
            r4 = r5
            r5 = r16
            r17 = r6
            r6 = r18
            r0.<init>(r1, r2, r4, r5, r6)
            r0 = 54
            r1 = 280174801(0x10b320d1, float:7.065361E-29)
            g0.a r0 = g0.c.e(r1, r9, r10, r11, r0)
            r1 = r8 | 384(0x180, float:5.38E-43)
            r2 = r17
            a(r7, r2, r0, r11, r1)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0181
            Y.C1506p.P()
        L_0x0181:
            r5 = r14
        L_0x0182:
            Y.Y0 r10 = r11.k()
            if (r10 == 0) goto L_0x019f
            P.a$c r11 = new P.a$c
            r0 = r11
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r7 = r24
            r8 = r26
            r9 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            r10.a(r11)
        L_0x019f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C1285a.b(P.i, boolean, b1.i, boolean, long, k0.i, Y.m, int, int):void");
    }

    public static final void c(i iVar, C6787a aVar, boolean z10, C1500m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        C1500m h10 = mVar.h(2111672474);
        if ((i10 & 6) == 0) {
            if (h10.S(iVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (h10.C(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (h10.b(z10)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(2111672474, i11, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:122)");
            }
            a0.a(e(q.o(iVar, w.c(), w.b()), aVar, z10), h10, 0);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new e(iVar, aVar, z10, i10));
        }
    }

    public static final H1 d(C2341d dVar, float f10) {
        float f11 = f10;
        int ceil = ((int) ((float) Math.ceil((double) f11))) * 2;
        C1290f fVar = C1290f.f4894a;
        H1 c10 = fVar.c();
        C2520p0 a10 = fVar.a();
        C2600a b10 = fVar.b();
        if (c10 == null || a10 == null || ceil > c10.e() || ceil > c10.d()) {
            c10 = J1.b(ceil, ceil, I1.f25425b.a(), false, (C2581c) null, 24, (Object) null);
            fVar.f(c10);
            a10 = C2526r0.a(c10);
            fVar.d(a10);
        }
        H1 h12 = c10;
        C2520p0 p0Var = a10;
        if (b10 == null) {
            b10 = new C2600a();
            fVar.e(b10);
        }
        C2600a aVar = b10;
        t layoutDirection = dVar.getLayoutDirection();
        long a11 = C2428n.a((float) h12.e(), (float) h12.d());
        C2600a.C0435a D10 = aVar.D();
        c1.d a12 = D10.a();
        t b11 = D10.b();
        C2520p0 c11 = D10.c();
        long d10 = D10.d();
        C2600a.C0435a D11 = aVar.D();
        D11.j(dVar);
        D11.k(layoutDirection);
        D11.i(p0Var);
        D11.l(a11);
        p0Var.q();
        C2600a aVar2 = aVar;
        C2605f.c0(aVar2, C2544x0.f25560b.a(), 0, aVar.d(), 0.0f, (C2606g) null, (C2547y0) null, C2490f0.f25500a.a(), 58, (Object) null);
        C2605f.c0(aVar2, C2550z0.d(4278190080L), C2421g.f25320b.c(), C2428n.a(f11, f11), 0.0f, (C2606g) null, (C2547y0) null, 0, 120, (Object) null);
        C2605f.n0(aVar, C2550z0.d(4278190080L), f10, C2422h.a(f11, f11), 0.0f, (C2606g) null, (C2547y0) null, 0, 120, (Object) null);
        p0Var.h();
        C2600a.C0435a D12 = aVar.D();
        D12.j(a12);
        D12.k(b11);
        D12.i(c11);
        D12.l(d10);
        return h12;
    }

    public static final i e(i iVar, C6787a aVar, boolean z10) {
        return h.c(iVar, (C6798l) null, new f(aVar, z10), 1, (Object) null);
    }
}

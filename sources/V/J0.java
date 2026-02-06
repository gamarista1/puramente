package V;

import O0.t;
import O0.v;
import Ug.K;
import Ug.V;
import Y.A1;
import Y.C1500m;
import Y.C1506p;
import Y.K0;
import Y.M0;
import Y.P;
import Y.Y0;
import androidx.compose.ui.platform.C1637i;
import androidx.compose.ui.platform.C1644k0;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6535s;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import w.C2782a;
import w.C2784b;
import w.C2797i;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

public abstract class J0 {

    static final class a extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G0 f6623a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ G0 f6624b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f6625c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ M f6626d;

        /* renamed from: V.J0$a$a  reason: collision with other inner class name */
        static final class C0154a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ G0 f6627a;

            /* renamed from: V.J0$a$a$a  reason: collision with other inner class name */
            static final class C0155a extends C6498u implements C6787a {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ G0 f6628a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0155a(G0 g02) {
                    super(0);
                    this.f6628a = g02;
                }

                /* renamed from: a */
                public final Boolean invoke() {
                    this.f6628a.dismiss();
                    return Boolean.TRUE;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0154a(G0 g02) {
                super(1);
                this.f6627a = g02;
            }

            public final void a(v vVar) {
                t.d0(vVar, O0.e.f4530b.b());
                t.m(vVar, (String) null, new C0155a(this.f6627a), 1, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((v) obj);
                return C6514M.f71813a;
            }
        }

        static final class b extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ G0 f6629a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ M f6630b;

            /* renamed from: V.J0$a$b$a  reason: collision with other inner class name */
            static final class C0156a extends C6498u implements C6798l {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ G0 f6631a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0156a(G0 g02) {
                    super(1);
                    this.f6631a = g02;
                }

                /* renamed from: a */
                public final Boolean invoke(L l10) {
                    return Boolean.valueOf(C6496s.c(l10.c(), this.f6631a));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(G0 g02, M m10) {
                super(0);
                this.f6629a = g02;
                this.f6630b = m10;
            }

            public final void invoke() {
                if (!C6496s.c(this.f6629a, this.f6630b.a())) {
                    C6565s.K(this.f6630b.b(), new C0156a(this.f6629a));
                    K0 c10 = this.f6630b.c();
                    if (c10 != null) {
                        c10.invalidate();
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(G0 g02, G0 g03, List list, M m10) {
            super(3);
            this.f6623a = g02;
            this.f6624b = g03;
            this.f6625c = list;
            this.f6626d = m10;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: yf.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(yf.p r38, Y.C1500m r39, int r40) {
            /*
                r37 = this;
                r0 = r37
                r1 = r38
                r8 = r39
                r2 = r40 & 6
                if (r2 != 0) goto L_0x0017
                boolean r2 = r8.C(r1)
                if (r2 == 0) goto L_0x0012
                r2 = 4
                goto L_0x0013
            L_0x0012:
                r2 = 2
            L_0x0013:
                r2 = r40 | r2
                r9 = r2
                goto L_0x0019
            L_0x0017:
                r9 = r40
            L_0x0019:
                r2 = r9 & 19
                r3 = 18
                if (r2 != r3) goto L_0x002b
                boolean r2 = r39.i()
                if (r2 != 0) goto L_0x0026
                goto L_0x002b
            L_0x0026:
                r39.I()
                goto L_0x019a
            L_0x002b:
                boolean r2 = Y.C1506p.H()
                if (r2 == 0) goto L_0x003a
                r2 = -1
                java.lang.String r3 = "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:338)"
                r4 = -1654683077(0xffffffff9d5f8a3b, float:-2.9585268E-21)
                Y.C1506p.Q(r4, r9, r2, r3)
            L_0x003a:
                V.G0 r2 = r0.f6623a
                V.G0 r3 = r0.f6624b
                boolean r10 = kotlin.jvm.internal.C6496s.c(r2, r3)
                r2 = 75
                if (r10 == 0) goto L_0x004a
                r3 = 150(0x96, float:2.1E-43)
                r11 = r3
                goto L_0x004b
            L_0x004a:
                r11 = r2
            L_0x004b:
                r12 = 1
                r13 = 0
                if (r10 == 0) goto L_0x005d
                java.util.List r3 = r0.f6625c
                java.util.List r3 = e1.C1942a.b(r3)
                int r3 = r3.size()
                if (r3 == r12) goto L_0x005d
                r14 = r2
                goto L_0x005e
            L_0x005d:
                r14 = r13
            L_0x005e:
                w.D r2 = w.C2762F.e()
                w.q0 r2 = w.C2798j.i(r11, r14, r2)
                V.G0 r3 = r0.f6623a
                boolean r3 = r8.S(r3)
                V.M r4 = r0.f6626d
                boolean r4 = r8.C(r4)
                r3 = r3 | r4
                V.G0 r4 = r0.f6623a
                V.M r5 = r0.f6626d
                java.lang.Object r6 = r39.A()
                if (r3 != 0) goto L_0x0085
                Y.m$a r3 = Y.C1500m.f10026a
                java.lang.Object r3 = r3.a()
                if (r6 != r3) goto L_0x008d
            L_0x0085:
                V.J0$a$b r6 = new V.J0$a$b
                r6.<init>(r4, r5)
                r8.r(r6)
            L_0x008d:
                r4 = r6
                yf.a r4 = (yf.C6787a) r4
                r6 = 0
                r7 = 0
                r3 = r10
                r5 = r39
                Y.A1 r2 = V.J0.f(r2, r3, r4, r5, r6, r7)
                w.D r3 = w.C2762F.d()
                w.q0 r3 = w.C2798j.i(r11, r14, r3)
                Y.A1 r3 = V.J0.g(r3, r10, r8, r13)
                k0.i$a r14 = k0.i.f23074a
                java.lang.Object r4 = r3.getValue()
                java.lang.Number r4 = (java.lang.Number) r4
                float r15 = r4.floatValue()
                java.lang.Object r3 = r3.getValue()
                java.lang.Number r3 = (java.lang.Number) r3
                float r16 = r3.floatValue()
                java.lang.Object r2 = r2.getValue()
                java.lang.Number r2 = (java.lang.Number) r2
                float r17 = r2.floatValue()
                r35 = 131064(0x1fff8, float:1.8366E-40)
                r36 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r30 = 0
                r32 = 0
                r34 = 0
                k0.i r2 = androidx.compose.ui.graphics.b.c(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30, r32, r34, r35, r36)
                V.G0 r3 = r0.f6623a
                boolean r3 = r8.S(r3)
                V.G0 r4 = r0.f6623a
                java.lang.Object r5 = r39.A()
                if (r3 != 0) goto L_0x0100
                Y.m$a r3 = Y.C1500m.f10026a
                java.lang.Object r3 = r3.a()
                if (r5 != r3) goto L_0x0108
            L_0x0100:
                V.J0$a$a r5 = new V.J0$a$a
                r5.<init>(r4)
                r8.r(r5)
            L_0x0108:
                yf.l r5 = (yf.C6798l) r5
                r3 = 0
                k0.i r2 = O0.m.d(r2, r13, r5, r12, r3)
                k0.c$a r3 = k0.c.f23044a
                k0.c r3 = r3.o()
                H0.F r3 = androidx.compose.foundation.layout.d.h(r3, r13)
                int r4 = Y.C1494j.a(r8, r13)
                Y.y r5 = r39.p()
                k0.i r2 = k0.h.e(r8, r2)
                J0.g$a r6 = J0.C1241g.f3853J
                yf.a r7 = r6.a()
                Y.f r10 = r39.j()
                if (r10 != 0) goto L_0x0134
                Y.C1494j.c()
            L_0x0134:
                r39.F()
                boolean r10 = r39.f()
                if (r10 == 0) goto L_0x0141
                r8.U(r7)
                goto L_0x0144
            L_0x0141:
                r39.q()
            L_0x0144:
                Y.m r7 = Y.F1.a(r39)
                yf.p r10 = r6.c()
                Y.F1.b(r7, r3, r10)
                yf.p r3 = r6.e()
                Y.F1.b(r7, r5, r3)
                yf.p r3 = r6.b()
                boolean r5 = r7.f()
                if (r5 != 0) goto L_0x016e
                java.lang.Object r5 = r7.A()
                java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
                boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r10)
                if (r5 != 0) goto L_0x017c
            L_0x016e:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r7.r(r5)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r7.V(r4, r3)
            L_0x017c:
                yf.p r3 = r6.d()
                Y.F1.b(r7, r2, r3)
                androidx.compose.foundation.layout.f r2 = androidx.compose.foundation.layout.f.f12848a
                r2 = r9 & 14
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.invoke(r8, r2)
                r39.u()
                boolean r1 = Y.C1506p.H()
                if (r1 == 0) goto L_0x019a
                Y.C1506p.P()
            L_0x019a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: V.J0.a.a(yf.p, Y.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((p) obj, (C1500m) obj2, ((Number) obj3).intValue());
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f6632a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ G0 f6633b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q qVar, G0 g02) {
            super(2);
            this.f6632a = qVar;
            this.f6633b = g02;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-1135367807, i10, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:395)");
                }
                q qVar = this.f6632a;
                G0 g02 = this.f6633b;
                C6496s.e(g02);
                qVar.invoke(g02, mVar, 0);
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

    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G0 f6634a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.i f6635b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f6636c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f6637d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f6638e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(G0 g02, k0.i iVar, q qVar, int i10, int i11) {
            super(2);
            this.f6634a = g02;
            this.f6635b = iVar;
            this.f6636c = qVar;
            this.f6637d = i10;
            this.f6638e = i11;
        }

        public final void a(C1500m mVar, int i10) {
            J0.a(this.f6634a, this.f6635b, this.f6636c, mVar, M0.a(this.f6637d | 1), this.f6638e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class d extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f6639a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ G0 f6640b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1637i f6641c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(G0 g02, C1637i iVar, C6658d dVar) {
            super(2, dVar);
            this.f6640b = g02;
            this.f6641c = iVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new d(this.f6640b, this.f6641c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((d) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object f10 = C6680b.f();
            int i10 = this.f6639a;
            if (i10 == 0) {
                w.b(obj);
                G0 g02 = this.f6640b;
                if (g02 != null) {
                    I0 duration = g02.a().getDuration();
                    if (this.f6640b.a().a() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long h10 = J0.h(duration, z10, this.f6641c);
                    this.f6639a = 1;
                    if (V.a(h10, this) == f10) {
                        return f10;
                    }
                }
                return C6514M.f71813a;
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f6640b.dismiss();
            return C6514M.f71813a;
        }
    }

    static final class e extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K0 f6642a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.i f6643b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f6644c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f6645d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f6646e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(K0 k02, k0.i iVar, q qVar, int i10, int i11) {
            super(2);
            this.f6642a = k02;
            this.f6643b = iVar;
            this.f6644c = qVar;
            this.f6645d = i10;
            this.f6646e = i11;
        }

        public final void a(C1500m mVar, int i10) {
            J0.b(this.f6642a, this.f6643b, this.f6644c, mVar, M0.a(this.f6645d | 1), this.f6646e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6647a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                V.I0[] r0 = V.I0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                V.I0 r1 = V.I0.Indefinite     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                V.I0 r1 = V.I0.Long     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                V.I0 r1 = V.I0.Short     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f6647a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: V.J0.f.<clinit>():void");
        }
    }

    static final class g extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final g f6648a = new g();

        g() {
            super(0);
        }

        public final void invoke() {
        }
    }

    static final class h extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f6649a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2782a f6650b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f6651c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2797i f6652d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6787a f6653e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C2782a aVar, boolean z10, C2797i iVar, C6787a aVar2, C6658d dVar) {
            super(2, dVar);
            this.f6650b = aVar;
            this.f6651c = z10;
            this.f6652d = iVar;
            this.f6653e = aVar2;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new h(this.f6650b, this.f6651c, this.f6652d, this.f6653e, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((h) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            float f10;
            Object f11 = C6680b.f();
            int i10 = this.f6649a;
            if (i10 == 0) {
                w.b(obj);
                C2782a aVar = this.f6650b;
                if (this.f6651c) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                Float b10 = kotlin.coroutines.jvm.internal.b.b(f10);
                C2797i iVar = this.f6652d;
                this.f6649a = 1;
                if (C2782a.f(aVar, b10, iVar, (Object) null, (C6798l) null, this, 12, (Object) null) == f11) {
                    return f11;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f6653e.invoke();
            return C6514M.f71813a;
        }
    }

    static final class i extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f6654a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2782a f6655b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f6656c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2797i f6657d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C2782a aVar, boolean z10, C2797i iVar, C6658d dVar) {
            super(2, dVar);
            this.f6655b = aVar;
            this.f6656c = z10;
            this.f6657d = iVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new i(this.f6655b, this.f6656c, this.f6657d, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((i) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            float f10;
            Object f11 = C6680b.f();
            int i10 = this.f6654a;
            if (i10 == 0) {
                w.b(obj);
                C2782a aVar = this.f6655b;
                if (this.f6656c) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.8f;
                }
                Float b10 = kotlin.coroutines.jvm.internal.b.b(f10);
                C2797i iVar = this.f6657d;
                this.f6654a = 1;
                if (C2782a.f(aVar, b10, iVar, (Object) null, (C6798l) null, this, 12, (Object) null) == f11) {
                    return f11;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(V.G0 r16, k0.i r17, yf.q r18, Y.C1500m r19, int r20, int r21) {
        /*
            r1 = r16
            r3 = r18
            r4 = r20
            r0 = 2
            r2 = 4
            r5 = 6
            r6 = -1316639904(0xffffffffb185ab60, float:-3.8902925E-9)
            r7 = r19
            Y.m r7 = r7.h(r6)
            r8 = 1
            r9 = r21 & 1
            if (r9 == 0) goto L_0x001a
            r9 = r4 | 6
            goto L_0x002a
        L_0x001a:
            r9 = r4 & 6
            if (r9 != 0) goto L_0x0029
            boolean r9 = r7.S(r1)
            if (r9 == 0) goto L_0x0026
            r9 = r2
            goto L_0x0027
        L_0x0026:
            r9 = r0
        L_0x0027:
            r9 = r9 | r4
            goto L_0x002a
        L_0x0029:
            r9 = r4
        L_0x002a:
            r0 = r21 & 2
            if (r0 == 0) goto L_0x0033
            r9 = r9 | 48
        L_0x0030:
            r10 = r17
            goto L_0x0045
        L_0x0033:
            r10 = r4 & 48
            if (r10 != 0) goto L_0x0030
            r10 = r17
            boolean r11 = r7.S(r10)
            if (r11 == 0) goto L_0x0042
            r11 = 32
            goto L_0x0044
        L_0x0042:
            r11 = 16
        L_0x0044:
            r9 = r9 | r11
        L_0x0045:
            r2 = r21 & 4
            if (r2 == 0) goto L_0x004c
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x004c:
            r2 = r4 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x005c
            boolean r2 = r7.C(r3)
            if (r2 == 0) goto L_0x0059
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r2 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r9 = r9 | r2
        L_0x005c:
            r2 = r9 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r2 != r11) goto L_0x006f
            boolean r2 = r7.i()
            if (r2 != 0) goto L_0x0069
            goto L_0x006f
        L_0x0069:
            r7.I()
        L_0x006c:
            r2 = r10
            goto L_0x01e9
        L_0x006f:
            if (r0 == 0) goto L_0x0074
            k0.i$a r0 = k0.i.f23074a
            r10 = r0
        L_0x0074:
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0080
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:327)"
            Y.C1506p.Q(r6, r9, r0, r2)
        L_0x0080:
            java.lang.Object r0 = r7.A()
            Y.m$a r2 = Y.C1500m.f10026a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x0094
            V.M r0 = new V.M
            r0.<init>()
            r7.r(r0)
        L_0x0094:
            V.M r0 = (V.M) r0
            r2 = -1256811491(0xffffffffb516941d, float:-5.609489E-7)
            r7.T(r2)
            java.lang.Object r2 = r0.a()
            boolean r2 = kotlin.jvm.internal.C6496s.c(r1, r2)
            r6 = 54
            if (r2 != 0) goto L_0x0116
            r0.d(r1)
            java.util.List r2 = r0.b()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r2.size()
            r11.<init>(r12)
            int r12 = r2.size()
            r13 = 0
        L_0x00bd:
            if (r13 >= r12) goto L_0x00d0
            java.lang.Object r14 = r2.get(r13)
            V.L r14 = (V.L) r14
            java.lang.Object r14 = r14.c()
            V.G0 r14 = (V.G0) r14
            r11.add(r14)
            int r13 = r13 + r8
            goto L_0x00bd
        L_0x00d0:
            java.util.List r2 = mf.C6565s.h1(r11)
            boolean r11 = r2.contains(r1)
            if (r11 != 0) goto L_0x00dd
            r2.add(r1)
        L_0x00dd:
            java.util.List r11 = r0.b()
            r11.clear()
            java.util.List r11 = e1.C1942a.b(r2)
            java.util.List r12 = r0.b()
            java.util.Collection r12 = (java.util.Collection) r12
            int r13 = r11.size()
            r14 = 0
        L_0x00f3:
            if (r14 >= r13) goto L_0x0114
            java.lang.Object r15 = r11.get(r14)
            V.G0 r15 = (V.G0) r15
            V.L r5 = new V.L
            V.J0$a r9 = new V.J0$a
            r9.<init>(r15, r1, r2, r0)
            r1 = -1654683077(0xffffffff9d5f8a3b, float:-2.9585268E-21)
            g0.a r1 = g0.c.e(r1, r8, r9, r7, r6)
            r5.<init>(r15, r1)
            r12.add(r5)
            int r14 = r14 + r8
            r5 = 6
            r1 = r16
            goto L_0x00f3
        L_0x0114:
            java.util.List r12 = (java.util.List) r12
        L_0x0116:
            r7.M()
            k0.c$a r1 = k0.c.f23044a
            k0.c r1 = r1.o()
            r2 = 0
            H0.F r1 = androidx.compose.foundation.layout.d.h(r1, r2)
            int r5 = Y.C1494j.a(r7, r2)
            Y.y r2 = r7.p()
            k0.i r9 = k0.h.e(r7, r10)
            J0.g$a r11 = J0.C1241g.f3853J
            yf.a r12 = r11.a()
            Y.f r13 = r7.j()
            if (r13 != 0) goto L_0x013f
            Y.C1494j.c()
        L_0x013f:
            r7.F()
            boolean r13 = r7.f()
            if (r13 == 0) goto L_0x014c
            r7.U(r12)
            goto L_0x014f
        L_0x014c:
            r7.q()
        L_0x014f:
            Y.m r12 = Y.F1.a(r7)
            yf.p r13 = r11.c()
            Y.F1.b(r12, r1, r13)
            yf.p r1 = r11.e()
            Y.F1.b(r12, r2, r1)
            yf.p r1 = r11.b()
            boolean r2 = r12.f()
            if (r2 != 0) goto L_0x0179
            java.lang.Object r2 = r12.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            boolean r2 = kotlin.jvm.internal.C6496s.c(r2, r13)
            if (r2 != 0) goto L_0x0187
        L_0x0179:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r12.r(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r12.V(r2, r1)
        L_0x0187:
            yf.p r1 = r11.d()
            Y.F1.b(r12, r9, r1)
            androidx.compose.foundation.layout.f r1 = androidx.compose.foundation.layout.f.f12848a
            r1 = 0
            Y.K0 r2 = Y.C1494j.b(r7, r1)
            r0.e(r2)
            r2 = 1748085441(0x6831aac1, float:3.356035E24)
            r7.T(r2)
            java.util.List r0 = r0.b()
            int r2 = r0.size()
            r9 = r1
        L_0x01a7:
            if (r9 >= r2) goto L_0x01d8
            java.lang.Object r1 = r0.get(r9)
            V.L r1 = (V.L) r1
            java.lang.Object r5 = r1.a()
            V.G0 r5 = (V.G0) r5
            yf.q r1 = r1.b()
            r11 = 1201076541(0x4796f93d, float:77298.48)
            r7.E(r11, r5)
            V.J0$b r11 = new V.J0$b
            r11.<init>(r3, r5)
            r5 = -1135367807(0xffffffffbc53a981, float:-0.012918831)
            g0.a r5 = g0.c.e(r5, r8, r11, r7, r6)
            r11 = 6
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r1.invoke(r5, r7, r12)
            r7.Q()
            int r9 = r9 + r8
            goto L_0x01a7
        L_0x01d8:
            r7.M()
            r7.u()
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x006c
            Y.C1506p.P()
            goto L_0x006c
        L_0x01e9:
            Y.Y0 r6 = r7.k()
            if (r6 == 0) goto L_0x0200
            V.J0$c r7 = new V.J0$c
            r0 = r7
            r1 = r16
            r3 = r18
            r4 = r20
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0200:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.J0.a(V.G0, k0.i, yf.q, Y.m, int, int):void");
    }

    public static final void b(K0 k02, k0.i iVar, q qVar, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        C1500m h10 = mVar.h(464178177);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (h10.S(k02)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (h10.S(iVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (h10.C(qVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 147) != 146 || !h10.i()) {
            if (i16 != 0) {
                iVar = k0.i.f23074a;
            }
            if (i17 != 0) {
                qVar = C1416y.f8146a.a();
            }
            if (C1506p.H()) {
                C1506p.Q(464178177, i12, -1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:221)");
            }
            G0 b10 = k02.b();
            C1637i iVar2 = (C1637i) h10.m(C1644k0.c());
            boolean S10 = h10.S(b10) | h10.C(iVar2);
            Object A10 = h10.A();
            if (S10 || A10 == C1500m.f10026a.a()) {
                A10 = new d(b10, iVar2, (C6658d) null);
                h10.r(A10);
            }
            P.g(b10, (p) A10, h10, 0);
            a(k02.b(), iVar, qVar, h10, i12 & 1008, 0);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        k0.i iVar3 = iVar;
        q qVar2 = qVar;
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new e(k02, iVar3, qVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final A1 f(C2797i iVar, boolean z10, C6787a aVar, C1500m mVar, int i10, int i11) {
        boolean z11;
        float f10;
        if ((i11 & 4) != 0) {
            aVar = g.f6648a;
        }
        C6787a aVar2 = aVar;
        if (C1506p.H()) {
            C1506p.Q(1431889134, i10, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:418)");
        }
        Object A10 = mVar.A();
        C1500m.a aVar3 = C1500m.f10026a;
        if (A10 == aVar3.a()) {
            if (!z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            A10 = C2784b.b(f10, 0.0f, 2, (Object) null);
            mVar.r(A10);
        }
        C2782a aVar4 = (C2782a) A10;
        Boolean valueOf = Boolean.valueOf(z10);
        boolean C10 = mVar.C(aVar4);
        boolean z12 = false;
        if ((((i10 & 112) ^ 48) <= 32 || !mVar.b(z10)) && (i10 & 48) != 32) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean C11 = C10 | z11 | mVar.C(iVar);
        if ((((i10 & 896) ^ 384) > 256 && mVar.S(aVar2)) || (i10 & 384) == 256) {
            z12 = true;
        }
        boolean z13 = C11 | z12;
        Object A11 = mVar.A();
        if (z13 || A11 == aVar3.a()) {
            h hVar = new h(aVar4, z10, iVar, aVar2, (C6658d) null);
            mVar.r(hVar);
            A11 = hVar;
        }
        P.g(valueOf, (p) A11, mVar, (i10 >> 3) & 14);
        A1 g10 = aVar4.g();
        if (C1506p.H()) {
            C1506p.P();
        }
        return g10;
    }

    /* access modifiers changed from: private */
    public static final A1 g(C2797i iVar, boolean z10, C1500m mVar, int i10) {
        boolean z11;
        float f10;
        if (C1506p.H()) {
            C1506p.Q(1966809761, i10, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:428)");
        }
        Object A10 = mVar.A();
        C1500m.a aVar = C1500m.f10026a;
        if (A10 == aVar.a()) {
            if (!z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            A10 = C2784b.b(f10, 0.0f, 2, (Object) null);
            mVar.r(A10);
        }
        C2782a aVar2 = (C2782a) A10;
        Boolean valueOf = Boolean.valueOf(z10);
        boolean C10 = mVar.C(aVar2);
        if ((((i10 & 112) ^ 48) <= 32 || !mVar.b(z10)) && (i10 & 48) != 32) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean C11 = C10 | z11 | mVar.C(iVar);
        Object A11 = mVar.A();
        if (C11 || A11 == aVar.a()) {
            A11 = new i(aVar2, z10, iVar, (C6658d) null);
            mVar.r(A11);
        }
        P.g(valueOf, (p) A11, mVar, (i10 >> 3) & 14);
        A1 g10 = aVar2.g();
        if (C1506p.H()) {
            C1506p.P();
        }
        return g10;
    }

    public static final long h(I0 i02, boolean z10, C1637i iVar) {
        long j10;
        int i10 = f.f6647a[i02.ordinal()];
        if (i10 == 1) {
            j10 = Long.MAX_VALUE;
        } else if (i10 == 2) {
            j10 = 10000;
        } else if (i10 == 3) {
            j10 = 4000;
        } else {
            throw new C6535s();
        }
        long j11 = j10;
        if (iVar == null) {
            return j11;
        }
        return iVar.a(j11, true, true, z10);
    }
}

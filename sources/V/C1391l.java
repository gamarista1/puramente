package V;

import B.d;
import B.e;
import B.g;
import B.h;
import B.i;
import B.j;
import B.n;
import Ug.K;
import Xg.C5694f;
import Xg.C5695g;
import Y.A1;
import Y.C1500m;
import Y.C1506p;
import i0.r;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import qf.C6658d;
import rf.C6680b;
import w.C2782a;
import yf.p;

/* renamed from: V.l  reason: case insensitive filesystem */
public final class C1391l {

    /* renamed from: a  reason: collision with root package name */
    private final float f7710a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final float f7711b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final float f7712c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final float f7713d;

    /* renamed from: e  reason: collision with root package name */
    private final float f7714e;

    /* renamed from: V.l$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f7715a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f7716b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f7717c;

        /* renamed from: V.l$a$a  reason: collision with other inner class name */
        static final class C0171a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r f7718a;

            C0171a(r rVar) {
                this.f7718a = rVar;
            }

            /* renamed from: a */
            public final Object emit(i iVar, C6658d dVar) {
                if (iVar instanceof g) {
                    this.f7718a.add(iVar);
                } else if (iVar instanceof h) {
                    this.f7718a.remove((Object) ((h) iVar).a());
                } else if (iVar instanceof d) {
                    this.f7718a.add(iVar);
                } else if (iVar instanceof e) {
                    this.f7718a.remove((Object) ((e) iVar).a());
                } else if (iVar instanceof n.b) {
                    this.f7718a.add(iVar);
                } else if (iVar instanceof n.c) {
                    this.f7718a.remove((Object) ((n.c) iVar).a());
                } else if (iVar instanceof n.a) {
                    this.f7718a.remove((Object) ((n.a) iVar).a());
                }
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar, r rVar, C6658d dVar) {
            super(2, dVar);
            this.f7716b = jVar;
            this.f7717c = rVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f7716b, this.f7717c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f7715a;
            if (i10 == 0) {
                w.b(obj);
                C5694f c10 = this.f7716b.c();
                C0171a aVar = new C0171a(this.f7717c);
                this.f7715a = 1;
                if (c10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.l$b */
    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f7719a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2782a f7720b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f7721c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f7722d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C1391l f7723e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f7724f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2782a aVar, float f10, boolean z10, C1391l lVar, i iVar, C6658d dVar) {
            super(2, dVar);
            this.f7720b = aVar;
            this.f7721c = f10;
            this.f7722d = z10;
            this.f7723e = lVar;
            this.f7724f = iVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f7720b, this.f7721c, this.f7722d, this.f7723e, this.f7724f, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f7719a;
            if (i10 == 0) {
                w.b(obj);
                if (!c1.h.m(((c1.h) this.f7720b.k()).r(), this.f7721c)) {
                    if (!this.f7722d) {
                        C2782a aVar = this.f7720b;
                        c1.h e10 = c1.h.e(this.f7721c);
                        this.f7719a = 1;
                        if (aVar.t(e10, this) == f10) {
                            return f10;
                        }
                    } else {
                        float r10 = ((c1.h) this.f7720b.k()).r();
                        i iVar = null;
                        if (c1.h.m(r10, this.f7723e.f7711b)) {
                            iVar = new n.b(C2421g.f25320b.c(), (DefaultConstructorMarker) null);
                        } else if (c1.h.m(r10, this.f7723e.f7713d)) {
                            iVar = new g();
                        } else if (c1.h.m(r10, this.f7723e.f7712c)) {
                            iVar = new d();
                        }
                        C2782a aVar2 = this.f7720b;
                        float f11 = this.f7721c;
                        i iVar2 = this.f7724f;
                        this.f7719a = 2;
                        if (W.l.d(aVar2, f11, iVar, iVar2, this) == f10) {
                            return f10;
                        }
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ C1391l(float f10, float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: w.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: w.a} */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final Y.A1 d(boolean r19, B.j r20, Y.C1500m r21, int r22) {
        /*
            r18 = this;
            r7 = r18
            r3 = r19
            r0 = r20
            r8 = r21
            r1 = r22
            boolean r2 = Y.C1506p.H()
            if (r2 == 0) goto L_0x0019
            r2 = -1
            java.lang.String r4 = "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:938)"
            r5 = -1312510462(0xffffffffb1c4ae02, float:-5.724133E-9)
            Y.C1506p.Q(r5, r1, r2, r4)
        L_0x0019:
            java.lang.Object r2 = r21.A()
            Y.m$a r4 = Y.C1500m.f10026a
            java.lang.Object r5 = r4.a()
            if (r2 != r5) goto L_0x002c
            i0.r r2 = Y.p1.f()
            r8.r(r2)
        L_0x002c:
            i0.r r2 = (i0.r) r2
            r5 = r1 & 112(0x70, float:1.57E-43)
            r5 = r5 ^ 48
            r6 = 32
            r9 = 1
            r10 = 0
            if (r5 <= r6) goto L_0x003e
            boolean r5 = r8.S(r0)
            if (r5 != 0) goto L_0x0042
        L_0x003e:
            r5 = r1 & 48
            if (r5 != r6) goto L_0x0044
        L_0x0042:
            r5 = r9
            goto L_0x0045
        L_0x0044:
            r5 = r10
        L_0x0045:
            java.lang.Object r6 = r21.A()
            if (r5 != 0) goto L_0x0051
            java.lang.Object r5 = r4.a()
            if (r6 != r5) goto L_0x005a
        L_0x0051:
            V.l$a r6 = new V.l$a
            r5 = 0
            r6.<init>(r0, r2, r5)
            r8.r(r6)
        L_0x005a:
            yf.p r6 = (yf.p) r6
            int r5 = r1 >> 3
            r5 = r5 & 14
            Y.P.g(r0, r6, r8, r5)
            java.lang.Object r0 = mf.C6565s.B0(r2)
            r5 = r0
            B.i r5 = (B.i) r5
            if (r3 != 0) goto L_0x0070
            float r0 = r7.f7714e
        L_0x006e:
            r2 = r0
            goto L_0x0088
        L_0x0070:
            boolean r0 = r5 instanceof B.n.b
            if (r0 == 0) goto L_0x0077
            float r0 = r7.f7711b
            goto L_0x006e
        L_0x0077:
            boolean r0 = r5 instanceof B.g
            if (r0 == 0) goto L_0x007e
            float r0 = r7.f7713d
            goto L_0x006e
        L_0x007e:
            boolean r0 = r5 instanceof B.d
            if (r0 == 0) goto L_0x0085
            float r0 = r7.f7712c
            goto L_0x006e
        L_0x0085:
            float r0 = r7.f7710a
            goto L_0x006e
        L_0x0088:
            java.lang.Object r0 = r21.A()
            java.lang.Object r6 = r4.a()
            if (r0 != r6) goto L_0x00ab
            w.a r0 = new w.a
            c1.h r12 = c1.h.e(r2)
            c1.h$a r6 = c1.h.f19213b
            w.r0 r13 = w.t0.b(r6)
            r16 = 12
            r17 = 0
            r14 = 0
            r15 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r8.r(r0)
        L_0x00ab:
            r11 = r0
            w.a r11 = (w.C2782a) r11
            c1.h r12 = c1.h.e(r2)
            boolean r0 = r8.C(r11)
            boolean r6 = r8.c(r2)
            r0 = r0 | r6
            r6 = r1 & 14
            r6 = r6 ^ 6
            r13 = 4
            if (r6 <= r13) goto L_0x00c8
            boolean r6 = r8.b(r3)
            if (r6 != 0) goto L_0x00cc
        L_0x00c8:
            r6 = r1 & 6
            if (r6 != r13) goto L_0x00ce
        L_0x00cc:
            r6 = r9
            goto L_0x00cf
        L_0x00ce:
            r6 = r10
        L_0x00cf:
            r0 = r0 | r6
            r6 = r1 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            r13 = 256(0x100, float:3.59E-43)
            if (r6 <= r13) goto L_0x00de
            boolean r6 = r8.S(r7)
            if (r6 != 0) goto L_0x00e4
        L_0x00de:
            r1 = r1 & 384(0x180, float:5.38E-43)
            if (r1 != r13) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r9 = r10
        L_0x00e4:
            r0 = r0 | r9
            boolean r1 = r8.C(r5)
            r0 = r0 | r1
            java.lang.Object r1 = r21.A()
            if (r0 != 0) goto L_0x00f6
            java.lang.Object r0 = r4.a()
            if (r1 != r0) goto L_0x0106
        L_0x00f6:
            V.l$b r9 = new V.l$b
            r6 = 0
            r0 = r9
            r1 = r11
            r3 = r19
            r4 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.r(r9)
            r1 = r9
        L_0x0106:
            yf.p r1 = (yf.p) r1
            Y.P.g(r12, r1, r8, r10)
            Y.A1 r0 = r11.g()
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x0118
            Y.C1506p.P()
        L_0x0118:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V.C1391l.d(boolean, B.j, Y.m, int):Y.A1");
    }

    public final A1 e(boolean z10, j jVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-2045116089, i10, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:930)");
        }
        A1 d10 = d(z10, jVar, mVar, i10 & 1022);
        if (C1506p.H()) {
            C1506p.P();
        }
        return d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1391l)) {
            return false;
        }
        C1391l lVar = (C1391l) obj;
        if (c1.h.m(this.f7710a, lVar.f7710a) && c1.h.m(this.f7711b, lVar.f7711b) && c1.h.m(this.f7712c, lVar.f7712c) && c1.h.m(this.f7713d, lVar.f7713d) && c1.h.m(this.f7714e, lVar.f7714e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((c1.h.o(this.f7710a) * 31) + c1.h.o(this.f7711b)) * 31) + c1.h.o(this.f7712c)) * 31) + c1.h.o(this.f7713d)) * 31) + c1.h.o(this.f7714e);
    }

    private C1391l(float f10, float f11, float f12, float f13, float f14) {
        this.f7710a = f10;
        this.f7711b = f11;
        this.f7712c = f12;
        this.f7713d = f13;
        this.f7714e = f14;
    }
}

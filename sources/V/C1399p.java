package V;

import B.c;
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
import Y.C1510r0;
import Y.o1;
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

/* renamed from: V.p  reason: case insensitive filesystem */
public final class C1399p {

    /* renamed from: a  reason: collision with root package name */
    private final float f7865a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final float f7866b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final float f7867c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final float f7868d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final float f7869e;

    /* renamed from: f  reason: collision with root package name */
    private final float f7870f;

    /* renamed from: V.p$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f7871a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f7872b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f7873c;

        /* renamed from: V.p$a$a  reason: collision with other inner class name */
        static final class C0172a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r f7874a;

            C0172a(r rVar) {
                this.f7874a = rVar;
            }

            /* renamed from: a */
            public final Object emit(i iVar, C6658d dVar) {
                if (iVar instanceof g) {
                    this.f7874a.add(iVar);
                } else if (iVar instanceof h) {
                    this.f7874a.remove((Object) ((h) iVar).a());
                } else if (iVar instanceof d) {
                    this.f7874a.add(iVar);
                } else if (iVar instanceof e) {
                    this.f7874a.remove((Object) ((e) iVar).a());
                } else if (iVar instanceof n.b) {
                    this.f7874a.add(iVar);
                } else if (iVar instanceof n.c) {
                    this.f7874a.remove((Object) ((n.c) iVar).a());
                } else if (iVar instanceof n.a) {
                    this.f7874a.remove((Object) ((n.a) iVar).a());
                } else if (iVar instanceof B.b) {
                    this.f7874a.add(iVar);
                } else if (iVar instanceof c) {
                    this.f7874a.remove((Object) ((c) iVar).a());
                } else if (iVar instanceof B.a) {
                    this.f7874a.remove((Object) ((B.a) iVar).a());
                }
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar, r rVar, C6658d dVar) {
            super(2, dVar);
            this.f7872b = jVar;
            this.f7873c = rVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f7872b, this.f7873c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f7871a;
            if (i10 == 0) {
                w.b(obj);
                C5694f c10 = this.f7872b.c();
                C0172a aVar = new C0172a(this.f7873c);
                this.f7871a = 1;
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

    /* renamed from: V.p$b */
    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f7875a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2782a f7876b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f7877c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f7878d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C1399p f7879e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f7880f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2782a aVar, float f10, boolean z10, C1399p pVar, i iVar, C6658d dVar) {
            super(2, dVar);
            this.f7876b = aVar;
            this.f7877c = f10;
            this.f7878d = z10;
            this.f7879e = pVar;
            this.f7880f = iVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f7876b, this.f7877c, this.f7878d, this.f7879e, this.f7880f, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f7875a;
            if (i10 == 0) {
                w.b(obj);
                if (!c1.h.m(((c1.h) this.f7876b.k()).r(), this.f7877c)) {
                    if (!this.f7878d) {
                        C2782a aVar = this.f7876b;
                        c1.h e10 = c1.h.e(this.f7877c);
                        this.f7875a = 1;
                        if (aVar.t(e10, this) == f10) {
                            return f10;
                        }
                    } else {
                        float r10 = ((c1.h) this.f7876b.k()).r();
                        i iVar = null;
                        if (c1.h.m(r10, this.f7879e.f7866b)) {
                            iVar = new n.b(C2421g.f25320b.c(), (DefaultConstructorMarker) null);
                        } else if (c1.h.m(r10, this.f7879e.f7868d)) {
                            iVar = new g();
                        } else if (c1.h.m(r10, this.f7879e.f7867c)) {
                            iVar = new d();
                        } else if (c1.h.m(r10, this.f7879e.f7869e)) {
                            iVar = new B.b();
                        }
                        C2782a aVar2 = this.f7876b;
                        float f11 = this.f7877c;
                        i iVar2 = this.f7880f;
                        this.f7875a = 2;
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

    public /* synthetic */ C1399p(float f10, float f11, float f12, float f13, float f14, float f15, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: w.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: w.a} */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final Y.A1 e(boolean r19, B.j r20, Y.C1500m r21, int r22) {
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
            java.lang.String r4 = "androidx.compose.material3.CardElevation.animateElevation (Card.kt:670)"
            r5 = -1421890746(0xffffffffab3fab46, float:-6.809452E-13)
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
            V.p$a r6 = new V.p$a
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
            float r0 = r7.f7870f
        L_0x006e:
            r2 = r0
            goto L_0x008f
        L_0x0070:
            boolean r0 = r5 instanceof B.n.b
            if (r0 == 0) goto L_0x0077
            float r0 = r7.f7866b
            goto L_0x006e
        L_0x0077:
            boolean r0 = r5 instanceof B.g
            if (r0 == 0) goto L_0x007e
            float r0 = r7.f7868d
            goto L_0x006e
        L_0x007e:
            boolean r0 = r5 instanceof B.d
            if (r0 == 0) goto L_0x0085
            float r0 = r7.f7867c
            goto L_0x006e
        L_0x0085:
            boolean r0 = r5 instanceof B.b
            if (r0 == 0) goto L_0x008c
            float r0 = r7.f7869e
            goto L_0x006e
        L_0x008c:
            float r0 = r7.f7865a
            goto L_0x006e
        L_0x008f:
            java.lang.Object r0 = r21.A()
            java.lang.Object r6 = r4.a()
            if (r0 != r6) goto L_0x00b2
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
        L_0x00b2:
            r11 = r0
            w.a r11 = (w.C2782a) r11
            c1.h r12 = c1.h.e(r2)
            boolean r0 = r8.C(r11)
            boolean r6 = r8.c(r2)
            r0 = r0 | r6
            r6 = r1 & 14
            r6 = r6 ^ 6
            r13 = 4
            if (r6 <= r13) goto L_0x00cf
            boolean r6 = r8.b(r3)
            if (r6 != 0) goto L_0x00d3
        L_0x00cf:
            r6 = r1 & 6
            if (r6 != r13) goto L_0x00d5
        L_0x00d3:
            r6 = r9
            goto L_0x00d6
        L_0x00d5:
            r6 = r10
        L_0x00d6:
            r0 = r0 | r6
            r6 = r1 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            r13 = 256(0x100, float:3.59E-43)
            if (r6 <= r13) goto L_0x00e5
            boolean r6 = r8.S(r7)
            if (r6 != 0) goto L_0x00eb
        L_0x00e5:
            r1 = r1 & 384(0x180, float:5.38E-43)
            if (r1 != r13) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            r9 = r10
        L_0x00eb:
            r0 = r0 | r9
            boolean r1 = r8.C(r5)
            r0 = r0 | r1
            java.lang.Object r1 = r21.A()
            if (r0 != 0) goto L_0x00fd
            java.lang.Object r0 = r4.a()
            if (r1 != r0) goto L_0x010d
        L_0x00fd:
            V.p$b r9 = new V.p$b
            r6 = 0
            r0 = r9
            r1 = r11
            r3 = r19
            r4 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.r(r9)
            r1 = r9
        L_0x010d:
            yf.p r1 = (yf.p) r1
            Y.P.g(r12, r1, r8, r10)
            Y.A1 r0 = r11.g()
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x011f
            Y.C1506p.P()
        L_0x011f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V.C1399p.e(boolean, B.j, Y.m, int):Y.A1");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1399p)) {
            return false;
        }
        C1399p pVar = (C1399p) obj;
        if (c1.h.m(this.f7865a, pVar.f7865a) && c1.h.m(this.f7866b, pVar.f7866b) && c1.h.m(this.f7867c, pVar.f7867c) && c1.h.m(this.f7868d, pVar.f7868d) && c1.h.m(this.f7870f, pVar.f7870f)) {
            return true;
        }
        return false;
    }

    public final A1 f(boolean z10, j jVar, C1500m mVar, int i10) {
        mVar.T(-1763481333);
        if (C1506p.H()) {
            C1506p.Q(-1763481333, i10, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:659)");
        }
        mVar.T(-734838460);
        if (jVar == null) {
            Object A10 = mVar.A();
            if (A10 == C1500m.f10026a.a()) {
                A10 = u1.d(c1.h.e(this.f7865a), (o1) null, 2, (Object) null);
                mVar.r(A10);
            }
            C1510r0 r0Var = (C1510r0) A10;
            mVar.M();
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.M();
            return r0Var;
        }
        mVar.M();
        A1 e10 = e(z10, jVar, mVar, i10 & 1022);
        if (C1506p.H()) {
            C1506p.P();
        }
        mVar.M();
        return e10;
    }

    public int hashCode() {
        return (((((((c1.h.o(this.f7865a) * 31) + c1.h.o(this.f7866b)) * 31) + c1.h.o(this.f7867c)) * 31) + c1.h.o(this.f7868d)) * 31) + c1.h.o(this.f7870f);
    }

    private C1399p(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f7865a = f10;
        this.f7866b = f11;
        this.f7867c = f12;
        this.f7868d = f13;
        this.f7869e = f14;
        this.f7870f = f15;
    }
}

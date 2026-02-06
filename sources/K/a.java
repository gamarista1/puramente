package K;

import D0.C1111b;
import D0.C1124o;
import D0.C1126q;
import D0.J;
import D0.T;
import D0.V;
import J0.C1247m;
import J0.s0;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import p0.b;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.p;
import z.o;

public abstract class a extends C1247m implements s0, b {

    /* renamed from: p  reason: collision with root package name */
    private C6787a f3966p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f3967q;

    /* renamed from: r  reason: collision with root package name */
    private final V f3968r = ((V) l2(T.a(new C0089a(this, (C6658d) null))));

    /* renamed from: K.a$a  reason: collision with other inner class name */
    static final class C0089a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f3969a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f3970b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f3971c;

        /* renamed from: K.a$a$a  reason: collision with other inner class name */
        static final class C0090a extends k implements p {

            /* renamed from: b  reason: collision with root package name */
            Object f3972b;

            /* renamed from: c  reason: collision with root package name */
            Object f3973c;

            /* renamed from: d  reason: collision with root package name */
            int f3974d;

            /* renamed from: e  reason: collision with root package name */
            private /* synthetic */ Object f3975e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ a f3976f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0090a(a aVar, C6658d dVar) {
                super(2, dVar);
                this.f3976f = aVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                C0090a aVar = new C0090a(this.f3976f, dVar);
                aVar.f3975e = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C1111b bVar, C6658d dVar) {
                return ((C0090a) create(bVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:36:0x00e9 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x00f7  */
            /* JADX WARNING: Removed duplicated region for block: B:51:0x0138  */
            /* JADX WARNING: Removed duplicated region for block: B:52:0x013a  */
            /* JADX WARNING: Removed duplicated region for block: B:57:0x016b  */
            /* JADX WARNING: Removed duplicated region for block: B:60:0x0180 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:63:0x018e  */
            /* JADX WARNING: Removed duplicated region for block: B:73:0x01b8  */
            /* JADX WARNING: Removed duplicated region for block: B:75:0x01bb  */
            /* JADX WARNING: Removed duplicated region for block: B:76:0x01bf  */
            /* JADX WARNING: Removed duplicated region for block: B:78:0x01c2  */
            /* JADX WARNING: Removed duplicated region for block: B:79:0x011d A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:84:0x01b3 A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    r17 = this;
                    r0 = r17
                    java.lang.Object r1 = rf.C6680b.f()
                    int r2 = r0.f3974d
                    r3 = 3
                    r4 = 2
                    r6 = 1
                    r7 = 0
                    if (r2 == 0) goto L_0x0048
                    if (r2 == r6) goto L_0x003e
                    if (r2 == r4) goto L_0x002b
                    if (r2 != r3) goto L_0x0023
                    java.lang.Object r2 = r0.f3972b
                    D0.A r2 = (D0.A) r2
                    java.lang.Object r4 = r0.f3975e
                    D0.b r4 = (D0.C1111b) r4
                    lf.w.b(r18)
                    r5 = r18
                    goto L_0x0181
                L_0x0023:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x002b:
                    java.lang.Object r2 = r0.f3973c
                    D0.q r2 = (D0.C1126q) r2
                    java.lang.Object r6 = r0.f3972b
                    D0.A r6 = (D0.A) r6
                    java.lang.Object r8 = r0.f3975e
                    D0.b r8 = (D0.C1111b) r8
                    lf.w.b(r18)
                    r9 = r18
                    goto L_0x00ea
                L_0x003e:
                    java.lang.Object r2 = r0.f3975e
                    D0.b r2 = (D0.C1111b) r2
                    lf.w.b(r18)
                    r8 = r18
                    goto L_0x005c
                L_0x0048:
                    lf.w.b(r18)
                    java.lang.Object r2 = r0.f3975e
                    D0.b r2 = (D0.C1111b) r2
                    D0.q r8 = D0.C1126q.Initial
                    r0.f3975e = r2
                    r0.f3974d = r6
                    java.lang.Object r8 = z.C2938B.d(r2, r6, r8, r0)
                    if (r8 != r1) goto L_0x005c
                    return r1
                L_0x005c:
                    D0.A r8 = (D0.A) r8
                    int r9 = r8.n()
                    D0.O$a r10 = D0.O.f1413a
                    int r11 = r10.c()
                    boolean r9 = D0.O.g(r9, r11)
                    if (r9 != 0) goto L_0x0080
                    int r9 = r8.n()
                    int r10 = r10.a()
                    boolean r9 = D0.O.g(r9, r10)
                    if (r9 == 0) goto L_0x007d
                    goto L_0x0080
                L_0x007d:
                    lf.M r1 = lf.C6514M.f71813a
                    return r1
                L_0x0080:
                    long r9 = r8.h()
                    float r9 = q0.C2421g.m(r9)
                    r10 = 0
                    int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                    if (r9 < 0) goto L_0x00c4
                    long r11 = r8.h()
                    float r9 = q0.C2421g.m(r11)
                    long r11 = r2.b()
                    int r11 = c1.r.g(r11)
                    float r11 = (float) r11
                    int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                    if (r9 >= 0) goto L_0x00c4
                    long r11 = r8.h()
                    float r9 = q0.C2421g.n(r11)
                    int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                    if (r9 < 0) goto L_0x00c4
                    long r9 = r8.h()
                    float r9 = q0.C2421g.n(r9)
                    long r10 = r2.b()
                    int r10 = c1.r.f(r10)
                    float r10 = (float) r10
                    int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                    if (r9 >= 0) goto L_0x00c4
                    goto L_0x00c5
                L_0x00c4:
                    r6 = 0
                L_0x00c5:
                    K.a r9 = r0.f3976f
                    boolean r9 = r9.f3967q
                    if (r9 != 0) goto L_0x00d3
                    if (r6 == 0) goto L_0x00d0
                    goto L_0x00d3
                L_0x00d0:
                    D0.q r6 = D0.C1126q.Main
                    goto L_0x00d5
                L_0x00d3:
                    D0.q r6 = D0.C1126q.Initial
                L_0x00d5:
                    r16 = r8
                    r8 = r2
                    r2 = r6
                    r6 = r16
                L_0x00db:
                    r0.f3975e = r8
                    r0.f3972b = r6
                    r0.f3973c = r2
                    r0.f3974d = r4
                    java.lang.Object r9 = r8.Z0(r2, r0)
                    if (r9 != r1) goto L_0x00ea
                    return r1
                L_0x00ea:
                    D0.o r9 = (D0.C1124o) r9
                    java.util.List r9 = r9.c()
                    int r10 = r9.size()
                    r11 = 0
                L_0x00f5:
                    if (r11 >= r10) goto L_0x011d
                    java.lang.Object r12 = r9.get(r11)
                    r13 = r12
                    D0.A r13 = (D0.A) r13
                    boolean r14 = r13.p()
                    if (r14 != 0) goto L_0x0119
                    long r14 = r13.f()
                    long r4 = r6.f()
                    boolean r4 = D0.z.d(r14, r4)
                    if (r4 == 0) goto L_0x0119
                    boolean r4 = r13.i()
                    if (r4 == 0) goto L_0x0119
                    goto L_0x011e
                L_0x0119:
                    int r11 = r11 + 1
                    r4 = 2
                    goto L_0x00f5
                L_0x011d:
                    r12 = r7
                L_0x011e:
                    D0.A r12 = (D0.A) r12
                    if (r12 != 0) goto L_0x0123
                    goto L_0x0138
                L_0x0123:
                    long r4 = r12.o()
                    long r9 = r6.o()
                    long r4 = r4 - r9
                    androidx.compose.ui.platform.v1 r9 = r8.getViewConfiguration()
                    long r9 = r9.c()
                    int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                    if (r4 < 0) goto L_0x013a
                L_0x0138:
                    r12 = r7
                    goto L_0x0156
                L_0x013a:
                    long r4 = r12.h()
                    long r9 = r6.h()
                    long r4 = q0.C2421g.q(r4, r9)
                    float r4 = q0.C2421g.k(r4)
                    androidx.compose.ui.platform.v1 r5 = r8.getViewConfiguration()
                    float r5 = r5.d()
                    int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                    if (r4 <= 0) goto L_0x01c2
                L_0x0156:
                    if (r12 == 0) goto L_0x01bf
                    K.a r2 = r0.f3976f
                    yf.a r2 = r2.s2()
                    java.lang.Object r2 = r2.invoke()
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L_0x016b
                    goto L_0x01bf
                L_0x016b:
                    r12.a()
                    r2 = r6
                    r4 = r8
                L_0x0170:
                    D0.q r5 = D0.C1126q.Initial
                    r0.f3975e = r4
                    r0.f3972b = r2
                    r0.f3973c = r7
                    r0.f3974d = r3
                    java.lang.Object r5 = r4.Z0(r5, r0)
                    if (r5 != r1) goto L_0x0181
                    return r1
                L_0x0181:
                    D0.o r5 = (D0.C1124o) r5
                    java.util.List r5 = r5.c()
                    int r6 = r5.size()
                    r8 = 0
                L_0x018c:
                    if (r8 >= r6) goto L_0x01b3
                    java.lang.Object r9 = r5.get(r8)
                    r10 = r9
                    D0.A r10 = (D0.A) r10
                    boolean r11 = r10.p()
                    if (r11 != 0) goto L_0x01b0
                    long r11 = r10.f()
                    long r13 = r2.f()
                    boolean r11 = D0.z.d(r11, r13)
                    if (r11 == 0) goto L_0x01b0
                    boolean r10 = r10.i()
                    if (r10 == 0) goto L_0x01b0
                    goto L_0x01b4
                L_0x01b0:
                    int r8 = r8 + 1
                    goto L_0x018c
                L_0x01b3:
                    r9 = r7
                L_0x01b4:
                    D0.A r9 = (D0.A) r9
                    if (r9 != 0) goto L_0x01bb
                    lf.M r1 = lf.C6514M.f71813a
                    return r1
                L_0x01bb:
                    r9.a()
                    goto L_0x0170
                L_0x01bf:
                    lf.M r1 = lf.C6514M.f71813a
                    return r1
                L_0x01c2:
                    r4 = 2
                    goto L_0x00db
                */
                throw new UnsupportedOperationException("Method not decompiled: K.a.C0089a.C0090a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0089a(a aVar, C6658d dVar) {
            super(2, dVar);
            this.f3971c = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            C0089a aVar = new C0089a(this.f3971c, dVar);
            aVar.f3970b = obj;
            return aVar;
        }

        public final Object invoke(J j10, C6658d dVar) {
            return ((C0089a) create(j10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f3969a;
            if (i10 == 0) {
                w.b(obj);
                C0090a aVar = new C0090a(this.f3971c, (C6658d) null);
                this.f3969a = 1;
                if (o.c((J) this.f3970b, aVar, this) == f10) {
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

    public a(C6787a aVar) {
        this.f3966p = aVar;
    }

    public void C0(C1124o oVar, C1126q qVar, long j10) {
        this.f3968r.C0(oVar, qVar, j10);
    }

    public void i1() {
        this.f3968r.i1();
    }

    public void m0(p0.l lVar) {
        this.f3967q = lVar.a();
    }

    public final C6787a s2() {
        return this.f3966p;
    }

    public final void t2(C6787a aVar) {
        this.f3966p = aVar;
    }
}

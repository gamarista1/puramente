package Yg;

import Ug.K;
import Wg.d;
import Wg.u;
import Xg.C5694f;
import Xg.C5695g;
import java.util.concurrent.atomic.AtomicInteger;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.p;
import yf.q;

public abstract class l {

    static final class a extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f66820a;

        /* renamed from: b  reason: collision with root package name */
        Object f66821b;

        /* renamed from: c  reason: collision with root package name */
        int f66822c;

        /* renamed from: d  reason: collision with root package name */
        int f66823d;

        /* renamed from: e  reason: collision with root package name */
        int f66824e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f66825f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5694f[] f66826g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C6787a f66827h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ q f66828i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C5695g f66829j;

        /* renamed from: Yg.l$a$a  reason: collision with other inner class name */
        static final class C0982a extends kotlin.coroutines.jvm.internal.l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f66830a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C5694f[] f66831b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f66832c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ AtomicInteger f66833d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ d f66834e;

            /* renamed from: Yg.l$a$a$a  reason: collision with other inner class name */
            static final class C0983a implements C5695g {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f66835a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f66836b;

                /* renamed from: Yg.l$a$a$a$a  reason: collision with other inner class name */
                static final class C0984a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f66837a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ C0983a f66838b;

                    /* renamed from: c  reason: collision with root package name */
                    int f66839c;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0984a(C0983a aVar, C6658d dVar) {
                        super(dVar);
                        this.f66838b = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f66837a = obj;
                        this.f66839c |= Integer.MIN_VALUE;
                        return this.f66838b.emit((Object) null, this);
                    }
                }

                C0983a(d dVar, int i10) {
                    this.f66835a = dVar;
                    this.f66836b = i10;
                }

                /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r7, qf.C6658d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof Yg.l.a.C0982a.C0983a.C0984a
                        if (r0 == 0) goto L_0x0013
                        r0 = r8
                        Yg.l$a$a$a$a r0 = (Yg.l.a.C0982a.C0983a.C0984a) r0
                        int r1 = r0.f66839c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f66839c = r1
                        goto L_0x0018
                    L_0x0013:
                        Yg.l$a$a$a$a r0 = new Yg.l$a$a$a$a
                        r0.<init>(r6, r8)
                    L_0x0018:
                        java.lang.Object r8 = r0.f66837a
                        java.lang.Object r1 = rf.C6680b.f()
                        int r2 = r0.f66839c
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L_0x0038
                        if (r2 == r4) goto L_0x0034
                        if (r2 != r3) goto L_0x002c
                        lf.w.b(r8)
                        goto L_0x0056
                    L_0x002c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L_0x0034:
                        lf.w.b(r8)
                        goto L_0x004d
                    L_0x0038:
                        lf.w.b(r8)
                        Wg.d r8 = r6.f66835a
                        mf.I r2 = new mf.I
                        int r5 = r6.f66836b
                        r2.<init>(r5, r7)
                        r0.f66839c = r4
                        java.lang.Object r7 = r8.k(r2, r0)
                        if (r7 != r1) goto L_0x004d
                        return r1
                    L_0x004d:
                        r0.f66839c = r3
                        java.lang.Object r7 = Ug.k1.a(r0)
                        if (r7 != r1) goto L_0x0056
                        return r1
                    L_0x0056:
                        lf.M r7 = lf.C6514M.f71813a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Yg.l.a.C0982a.C0983a.emit(java.lang.Object, qf.d):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0982a(C5694f[] fVarArr, int i10, AtomicInteger atomicInteger, d dVar, C6658d dVar2) {
                super(2, dVar2);
                this.f66831b = fVarArr;
                this.f66832c = i10;
                this.f66833d = atomicInteger;
                this.f66834e = dVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new C0982a(this.f66831b, this.f66832c, this.f66833d, this.f66834e, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0982a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f66830a;
                if (i10 == 0) {
                    w.b(obj);
                    C5694f[] fVarArr = this.f66831b;
                    int i11 = this.f66832c;
                    C5694f fVar = fVarArr[i11];
                    C0983a aVar = new C0983a(this.f66834e, i11);
                    this.f66830a = 1;
                    if (fVar.collect(aVar, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    try {
                        w.b(obj);
                    } catch (Throwable th2) {
                        if (this.f66833d.decrementAndGet() == 0) {
                            u.a.a(this.f66834e, (Throwable) null, 1, (Object) null);
                        }
                        throw th2;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (this.f66833d.decrementAndGet() == 0) {
                    u.a.a(this.f66834e, (Throwable) null, 1, (Object) null);
                }
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5694f[] fVarArr, C6787a aVar, q qVar, C5695g gVar, C6658d dVar) {
            super(2, dVar);
            this.f66826g = fVarArr;
            this.f66827h = aVar;
            this.f66828i = qVar;
            this.f66829j = gVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f66826g, this.f66827h, this.f66828i, this.f66829j, dVar);
            aVar.f66825f = obj;
            return aVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00ca A[LOOP:1: B:25:0x00ca->B:31:0x00ed, LOOP_START, PHI: r6 r10 
          PHI: (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:22:0x00c5, B:31:0x00ed] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r10v3 mf.I) = (r10v2 mf.I), (r10v16 mf.I) binds: [B:22:0x00c5, B:31:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                r23 = this;
                r0 = r23
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f66824e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0058
                if (r2 == r5) goto L_0x0035
                if (r2 == r4) goto L_0x001c
                if (r2 != r3) goto L_0x0014
                goto L_0x001c
            L_0x0014:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x001c:
                int r2 = r0.f66823d
                int r6 = r0.f66822c
                java.lang.Object r7 = r0.f66821b
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.f66820a
                Wg.d r8 = (Wg.d) r8
                java.lang.Object r9 = r0.f66825f
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                lf.w.b(r24)
                r21 = r2
                r2 = r7
                r7 = r8
                goto L_0x0137
            L_0x0035:
                int r2 = r0.f66823d
                int r6 = r0.f66822c
                java.lang.Object r7 = r0.f66821b
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.f66820a
                Wg.d r8 = (Wg.d) r8
                java.lang.Object r9 = r0.f66825f
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                lf.w.b(r24)
                r10 = r24
                Wg.h r10 = (Wg.h) r10
                java.lang.Object r10 = r10.k()
                r22 = r8
                r8 = r2
                r2 = r7
                r7 = r22
                goto L_0x00bf
            L_0x0058:
                lf.w.b(r24)
                java.lang.Object r2 = r0.f66825f
                Ug.K r2 = (Ug.K) r2
                Xg.f[] r6 = r0.f66826g
                int r12 = r6.length
                if (r12 != 0) goto L_0x0067
                lf.M r1 = lf.C6514M.f71813a
                return r1
            L_0x0067:
                java.lang.Object[] r13 = new java.lang.Object[r12]
                Zg.G r7 = Yg.t.f66851b
                r10 = 6
                r11 = 0
                r8 = 0
                r9 = 0
                r6 = r13
                mf.C6559l.A(r6, r7, r8, r9, r10, r11)
                r6 = 6
                r7 = 0
                Wg.d r20 = Wg.g.b(r12, r7, r7, r6, r7)
                java.util.concurrent.atomic.AtomicInteger r11 = new java.util.concurrent.atomic.AtomicInteger
                r11.<init>(r12)
                r21 = 0
                r10 = r21
            L_0x0082:
                if (r10 >= r12) goto L_0x00a3
                Yg.l$a$a r9 = new Yg.l$a$a
                Xg.f[] r15 = r0.f66826g
                r19 = 0
                r14 = r9
                r16 = r10
                r17 = r11
                r18 = r20
                r14.<init>(r15, r16, r17, r18, r19)
                r14 = 3
                r15 = 0
                r7 = 0
                r8 = 0
                r6 = r2
                r10 = r14
                r14 = r11
                r11 = r15
                Ug.C5600w0 unused = Ug.C5576k.d(r6, r7, r8, r9, r10, r11)
                int r10 = r16 + 1
                r11 = r14
                goto L_0x0082
            L_0x00a3:
                byte[] r2 = new byte[r12]
                r6 = r12
                r7 = r20
            L_0x00a8:
                int r8 = r21 + 1
                byte r8 = (byte) r8
                r0.f66825f = r13
                r0.f66820a = r7
                r0.f66821b = r2
                r0.f66822c = r6
                r0.f66823d = r8
                r0.f66824e = r5
                java.lang.Object r10 = r7.d(r0)
                if (r10 != r1) goto L_0x00be
                return r1
            L_0x00be:
                r9 = r13
            L_0x00bf:
                java.lang.Object r10 = Wg.h.f(r10)
                mf.I r10 = (mf.I) r10
                if (r10 != 0) goto L_0x00ca
                lf.M r1 = lf.C6514M.f71813a
                return r1
            L_0x00ca:
                int r11 = r10.c()
                r12 = r9[r11]
                java.lang.Object r10 = r10.d()
                r9[r11] = r10
                Zg.G r10 = Yg.t.f66851b
                if (r12 != r10) goto L_0x00dc
                int r6 = r6 + -1
            L_0x00dc:
                byte r10 = r2[r11]
                if (r10 == r8) goto L_0x00ef
                byte r10 = (byte) r8
                r2[r11] = r10
                java.lang.Object r10 = r7.i()
                java.lang.Object r10 = Wg.h.f(r10)
                mf.I r10 = (mf.I) r10
                if (r10 != 0) goto L_0x00ca
            L_0x00ef:
                if (r6 != 0) goto L_0x0135
                yf.a r10 = r0.f66827h
                java.lang.Object r10 = r10.invoke()
                java.lang.Object[] r10 = (java.lang.Object[]) r10
                if (r10 != 0) goto L_0x0112
                yf.q r10 = r0.f66828i
                Xg.g r11 = r0.f66829j
                r0.f66825f = r9
                r0.f66820a = r7
                r0.f66821b = r2
                r0.f66822c = r6
                r0.f66823d = r8
                r0.f66824e = r4
                java.lang.Object r10 = r10.invoke(r11, r9, r0)
                if (r10 != r1) goto L_0x0135
                return r1
            L_0x0112:
                r16 = 14
                r17 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r11 = r9
                r12 = r10
                mf.C6559l.q(r11, r12, r13, r14, r15, r16, r17)
                yf.q r11 = r0.f66828i
                Xg.g r12 = r0.f66829j
                r0.f66825f = r9
                r0.f66820a = r7
                r0.f66821b = r2
                r0.f66822c = r6
                r0.f66823d = r8
                r0.f66824e = r3
                java.lang.Object r10 = r11.invoke(r12, r10, r0)
                if (r10 != r1) goto L_0x0135
                return r1
            L_0x0135:
                r21 = r8
            L_0x0137:
                r13 = r9
                goto L_0x00a8
            */
            throw new UnsupportedOperationException("Method not decompiled: Yg.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object a(C5695g gVar, C5694f[] fVarArr, C6787a aVar, q qVar, C6658d dVar) {
        Object a10 = o.a(new a(fVarArr, aVar, qVar, gVar, (C6658d) null), dVar);
        if (a10 == C6680b.f()) {
            return a10;
        }
        return C6514M.f71813a;
    }
}

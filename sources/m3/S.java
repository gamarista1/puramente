package m3;

import Ug.K;
import Ug.L;
import Wg.d;
import Wg.u;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

public abstract class S {

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f23868a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f23869b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f23870c;

        /* renamed from: m3.S$a$a  reason: collision with other inner class name */
        static final class C0386a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            Object f23871a;

            /* renamed from: b  reason: collision with root package name */
            int f23872b;

            /* renamed from: c  reason: collision with root package name */
            private /* synthetic */ Object f23873c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C5695g f23874d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ p f23875e;

            /* renamed from: m3.S$a$a$a  reason: collision with other inner class name */
            static final class C0387a extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f23876a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ d f23877b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ p f23878c;

                /* renamed from: m3.S$a$a$a$a  reason: collision with other inner class name */
                static final class C0388a extends l implements p {

                    /* renamed from: a  reason: collision with root package name */
                    int f23879a;

                    /* renamed from: b  reason: collision with root package name */
                    private /* synthetic */ Object f23880b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ d f23881c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ p f23882d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0388a(d dVar, p pVar, C6658d dVar2) {
                        super(2, dVar2);
                        this.f23881c = dVar;
                        this.f23882d = pVar;
                    }

                    public final C6658d create(Object obj, C6658d dVar) {
                        C0388a aVar = new C0388a(this.f23881c, this.f23882d, dVar);
                        aVar.f23880b = obj;
                        return aVar;
                    }

                    public final Object invoke(K k10, C6658d dVar) {
                        return ((C0388a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object f10 = C6680b.f();
                        int i10 = this.f23879a;
                        if (i10 == 0) {
                            w.b(obj);
                            U u10 = new U((K) this.f23880b, this.f23881c);
                            p pVar = this.f23882d;
                            this.f23879a = 1;
                            if (pVar.invoke(u10, this) == f10) {
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

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0387a(d dVar, p pVar, C6658d dVar2) {
                    super(2, dVar2);
                    this.f23877b = dVar;
                    this.f23878c = pVar;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new C0387a(this.f23877b, this.f23878c, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((C0387a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f23876a;
                    if (i10 == 0) {
                        w.b(obj);
                        C0388a aVar = new C0388a(this.f23877b, this.f23878c, (C6658d) null);
                        this.f23876a = 1;
                        if (L.e(aVar, this) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        try {
                            w.b(obj);
                        } catch (Throwable th2) {
                            this.f23877b.j(th2);
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.a.a(this.f23877b, (Throwable) null, 1, (Object) null);
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0386a(C5695g gVar, p pVar, C6658d dVar) {
                super(2, dVar);
                this.f23874d = gVar;
                this.f23875e = pVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                C0386a aVar = new C0386a(this.f23874d, this.f23875e, dVar);
                aVar.f23873c = obj;
                return aVar;
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0386a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = rf.C6680b.f()
                    int r1 = r12.f23872b
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L_0x0031
                    if (r1 == r3) goto L_0x0025
                    if (r1 != r2) goto L_0x001d
                    java.lang.Object r1 = r12.f23871a
                    Wg.f r1 = (Wg.f) r1
                    java.lang.Object r5 = r12.f23873c
                    Ug.w0 r5 = (Ug.C5600w0) r5
                    lf.w.b(r13)
                L_0x001a:
                    r13 = r1
                    r1 = r5
                    goto L_0x0052
                L_0x001d:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L_0x0025:
                    java.lang.Object r1 = r12.f23871a
                    Wg.f r1 = (Wg.f) r1
                    java.lang.Object r5 = r12.f23873c
                    Ug.w0 r5 = (Ug.C5600w0) r5
                    lf.w.b(r13)
                    goto L_0x0063
                L_0x0031:
                    lf.w.b(r13)
                    java.lang.Object r13 = r12.f23873c
                    r5 = r13
                    Ug.K r5 = (Ug.K) r5
                    r13 = 0
                    r1 = 6
                    Wg.d r13 = Wg.g.b(r13, r4, r4, r1, r4)
                    m3.S$a$a$a r8 = new m3.S$a$a$a
                    yf.p r1 = r12.f23875e
                    r8.<init>(r13, r1, r4)
                    r9 = 3
                    r10 = 0
                    r6 = 0
                    r7 = 0
                    Ug.w0 r1 = Ug.C5576k.d(r5, r6, r7, r8, r9, r10)
                    Wg.f r13 = r13.iterator()
                L_0x0052:
                    r12.f23873c = r1
                    r12.f23871a = r13
                    r12.f23872b = r3
                    java.lang.Object r5 = r13.a(r12)
                    if (r5 != r0) goto L_0x005f
                    return r0
                L_0x005f:
                    r11 = r1
                    r1 = r13
                    r13 = r5
                    r5 = r11
                L_0x0063:
                    java.lang.Boolean r13 = (java.lang.Boolean) r13
                    boolean r13 = r13.booleanValue()
                    if (r13 == 0) goto L_0x007e
                    java.lang.Object r13 = r1.next()
                    Xg.g r6 = r12.f23874d
                    r12.f23873c = r5
                    r12.f23871a = r1
                    r12.f23872b = r2
                    java.lang.Object r13 = r6.emit(r13, r12)
                    if (r13 != r0) goto L_0x001a
                    return r0
                L_0x007e:
                    Ug.C5600w0.a.a(r5, r4, r3, r4)
                    lf.M r13 = lf.C6514M.f71813a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: m3.S.a.C0386a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar, C6658d dVar) {
            super(2, dVar);
            this.f23870c = pVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f23870c, dVar);
            aVar.f23869b = obj;
            return aVar;
        }

        public final Object invoke(C5695g gVar, C6658d dVar) {
            return ((a) create(gVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f23868a;
            if (i10 == 0) {
                w.b(obj);
                C0386a aVar = new C0386a((C5695g) this.f23869b, this.f23870c, (C6658d) null);
                this.f23868a = 1;
                if (L.e(aVar, this) == f10) {
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

    public static final C5694f a(p pVar) {
        C6496s.h(pVar, "block");
        return C5700l.b(C5696h.y(new a(pVar, (C6658d) null)), -2, (Wg.a) null, 2, (Object) null);
    }
}

package z;

import D0.A;
import D0.C1111b;
import D0.C1126q;
import D0.J;
import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.M;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;
import yf.q;

/* renamed from: z.B  reason: case insensitive filesystem */
public abstract class C2938B {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final q f28776a = new a((C6658d) null);

    /* renamed from: z.B$a */
    static final class a extends l implements q {

        /* renamed from: a  reason: collision with root package name */
        int f28777a;

        a(C6658d dVar) {
            super(3, dVar);
        }

        public final Object i(r rVar, long j10, C6658d dVar) {
            return new a(dVar).invokeSuspend(C6514M.f71813a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((r) obj, ((C2421g) obj2).v(), (C6658d) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f28777a == 0) {
                w.b(obj);
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: z.B$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f28778a;

        /* renamed from: b  reason: collision with root package name */
        Object f28779b;

        /* renamed from: c  reason: collision with root package name */
        boolean f28780c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f28781d;

        /* renamed from: e  reason: collision with root package name */
        int f28782e;

        b(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f28781d = obj;
            this.f28782e |= Integer.MIN_VALUE;
            return C2938B.d((C1111b) null, false, (C1126q) null, this);
        }
    }

    /* renamed from: z.B$c */
    static final class c extends k implements p {

        /* renamed from: b  reason: collision with root package name */
        long f28783b;

        /* renamed from: c  reason: collision with root package name */
        int f28784c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f28785d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A f28786e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(A a10, C6658d dVar) {
            super(2, dVar);
            this.f28786e = a10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            c cVar = new c(this.f28786e, dVar);
            cVar.f28785d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(C1111b bVar, C6658d dVar) {
            return ((c) create(bVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0051 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0046 A[RETURN] */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r11.f28784c
                r2 = 1
                if (r1 == 0) goto L_0x001d
                if (r1 != r2) goto L_0x0015
                long r3 = r11.f28783b
                java.lang.Object r1 = r11.f28785d
                D0.b r1 = (D0.C1111b) r1
                lf.w.b(r12)
                goto L_0x0047
            L_0x0015:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001d:
                lf.w.b(r12)
                java.lang.Object r12 = r11.f28785d
                D0.b r12 = (D0.C1111b) r12
                D0.A r1 = r11.f28786e
                long r3 = r1.o()
                androidx.compose.ui.platform.v1 r1 = r12.getViewConfiguration()
                long r5 = r1.b()
                long r3 = r3 + r5
                r1 = r12
            L_0x0034:
                r11.f28785d = r1
                r11.f28783b = r3
                r11.f28784c = r2
                r6 = 0
                r7 = 0
                r9 = 3
                r10 = 0
                r5 = r1
                r8 = r11
                java.lang.Object r12 = z.C2938B.e(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L_0x0047
                return r0
            L_0x0047:
                D0.A r12 = (D0.A) r12
                long r5 = r12.o()
                int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r5 < 0) goto L_0x0034
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: z.C2938B.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: z.B$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f28787a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f28788b;

        /* renamed from: c  reason: collision with root package name */
        int f28789c;

        d(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f28788b = obj;
            this.f28789c |= Integer.MIN_VALUE;
            return C2938B.g((C1111b) null, this);
        }
    }

    /* renamed from: z.B$e */
    static final class e extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f28790a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f28791b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ J f28792c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f28793d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6798l f28794e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ s f28795f;

        /* renamed from: z.B$e$a */
        static final class a extends k implements p {

            /* renamed from: b  reason: collision with root package name */
            int f28796b;

            /* renamed from: c  reason: collision with root package name */
            private /* synthetic */ Object f28797c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ K f28798d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ q f28799e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C6798l f28800f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ s f28801g;

            /* renamed from: z.B$e$a$a  reason: collision with other inner class name */
            static final class C0480a extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f28802a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ s f28803b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0480a(s sVar, C6658d dVar) {
                    super(2, dVar);
                    this.f28803b = sVar;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new C0480a(this.f28803b, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((C0480a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f28802a;
                    if (i10 == 0) {
                        w.b(obj);
                        s sVar = this.f28803b;
                        this.f28802a = 1;
                        if (sVar.o(this) == f10) {
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

            /* renamed from: z.B$e$a$b */
            static final class b extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f28804a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ q f28805b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ s f28806c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ A f28807d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(q qVar, s sVar, A a10, C6658d dVar) {
                    super(2, dVar);
                    this.f28805b = qVar;
                    this.f28806c = sVar;
                    this.f28807d = a10;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new b(this.f28805b, this.f28806c, this.f28807d, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f28804a;
                    if (i10 == 0) {
                        w.b(obj);
                        q qVar = this.f28805b;
                        s sVar = this.f28806c;
                        C2421g d10 = C2421g.d(this.f28807d.h());
                        this.f28804a = 1;
                        if (qVar.invoke(sVar, d10, this) == f10) {
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

            /* renamed from: z.B$e$a$c */
            static final class c extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f28808a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ s f28809b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(s sVar, C6658d dVar) {
                    super(2, dVar);
                    this.f28809b = sVar;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new c(this.f28809b, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    C6680b.f();
                    if (this.f28808a == 0) {
                        w.b(obj);
                        this.f28809b.a();
                        return C6514M.f71813a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* renamed from: z.B$e$a$d */
            static final class d extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f28810a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ s f28811b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                d(s sVar, C6658d dVar) {
                    super(2, dVar);
                    this.f28811b = sVar;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new d(this.f28811b, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((d) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    C6680b.f();
                    if (this.f28810a == 0) {
                        w.b(obj);
                        this.f28811b.e();
                        return C6514M.f71813a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(K k10, q qVar, C6798l lVar, s sVar, C6658d dVar) {
                super(2, dVar);
                this.f28798d = k10;
                this.f28799e = qVar;
                this.f28800f = lVar;
                this.f28801g = sVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f28798d, this.f28799e, this.f28800f, this.f28801g, dVar);
                aVar.f28797c = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C1111b bVar, C6658d dVar) {
                return ((a) create(bVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: D0.b} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0093  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r24) {
                /*
                    r23 = this;
                    r6 = r23
                    java.lang.Object r7 = rf.C6680b.f()
                    int r0 = r6.f28796b
                    r8 = 2
                    r9 = 1
                    r10 = 0
                    if (r0 == 0) goto L_0x002a
                    if (r0 == r9) goto L_0x001f
                    if (r0 != r8) goto L_0x0017
                    lf.w.b(r24)
                    r0 = r24
                    goto L_0x007d
                L_0x0017:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L_0x001f:
                    java.lang.Object r0 = r6.f28797c
                    D0.b r0 = (D0.C1111b) r0
                    lf.w.b(r24)
                    r11 = r0
                    r0 = r24
                    goto L_0x0051
                L_0x002a:
                    lf.w.b(r24)
                    java.lang.Object r0 = r6.f28797c
                    r11 = r0
                    D0.b r11 = (D0.C1111b) r11
                    Ug.K r0 = r6.f28798d
                    z.B$e$a$a r3 = new z.B$e$a$a
                    z.s r1 = r6.f28801g
                    r3.<init>(r1, r10)
                    r4 = 3
                    r5 = 0
                    r1 = 0
                    r2 = 0
                    Ug.C5600w0 unused = Ug.C5576k.d(r0, r1, r2, r3, r4, r5)
                    r6.f28797c = r11
                    r6.f28796b = r9
                    r1 = 0
                    r0 = r11
                    r3 = r23
                    java.lang.Object r0 = z.C2938B.e(r0, r1, r2, r3, r4, r5)
                    if (r0 != r7) goto L_0x0051
                    return r7
                L_0x0051:
                    D0.A r0 = (D0.A) r0
                    r0.a()
                    yf.q r1 = r6.f28799e
                    yf.q r2 = z.C2938B.f28776a
                    if (r1 == r2) goto L_0x0072
                    Ug.K r12 = r6.f28798d
                    z.B$e$a$b r15 = new z.B$e$a$b
                    yf.q r1 = r6.f28799e
                    z.s r2 = r6.f28801g
                    r15.<init>(r1, r2, r0, r10)
                    r16 = 3
                    r17 = 0
                    r13 = 0
                    r14 = 0
                    Ug.C5600w0 unused = Ug.C5576k.d(r12, r13, r14, r15, r16, r17)
                L_0x0072:
                    r6.f28797c = r10
                    r6.f28796b = r8
                    java.lang.Object r0 = z.C2938B.l(r11, r10, r6, r9, r10)
                    if (r0 != r7) goto L_0x007d
                    return r7
                L_0x007d:
                    D0.A r0 = (D0.A) r0
                    if (r0 != 0) goto L_0x0093
                    Ug.K r11 = r6.f28798d
                    z.B$e$a$c r14 = new z.B$e$a$c
                    z.s r0 = r6.f28801g
                    r14.<init>(r0, r10)
                    r15 = 3
                    r16 = 0
                    r12 = 0
                    r13 = 0
                    Ug.C5600w0 unused = Ug.C5576k.d(r11, r12, r13, r14, r15, r16)
                    goto L_0x00bd
                L_0x0093:
                    r0.a()
                    Ug.K r1 = r6.f28798d
                    z.B$e$a$d r2 = new z.B$e$a$d
                    z.s r3 = r6.f28801g
                    r2.<init>(r3, r10)
                    r21 = 3
                    r22 = 0
                    r18 = 0
                    r19 = 0
                    r17 = r1
                    r20 = r2
                    Ug.C5600w0 unused = Ug.C5576k.d(r17, r18, r19, r20, r21, r22)
                    yf.l r1 = r6.f28800f
                    if (r1 == 0) goto L_0x00bd
                    long r2 = r0.h()
                    q0.g r0 = q0.C2421g.d(r2)
                    r1.invoke(r0)
                L_0x00bd:
                    lf.M r0 = lf.C6514M.f71813a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: z.C2938B.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(J j10, q qVar, C6798l lVar, s sVar, C6658d dVar) {
            super(2, dVar);
            this.f28792c = j10;
            this.f28793d = qVar;
            this.f28794e = lVar;
            this.f28795f = sVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            e eVar = new e(this.f28792c, this.f28793d, this.f28794e, this.f28795f, dVar);
            eVar.f28791b = obj;
            return eVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((e) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f28790a;
            if (i10 == 0) {
                w.b(obj);
                J j10 = this.f28792c;
                a aVar = new a((K) this.f28791b, this.f28793d, this.f28794e, this.f28795f, (C6658d) null);
                this.f28790a = 1;
                if (o.c(j10, aVar, this) == f10) {
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

    /* renamed from: z.B$f */
    static final class f extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f28812a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f28813b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ J f28814c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f28815d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6798l f28816e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6798l f28817f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C6798l f28818g;

        /* renamed from: z.B$f$a */
        static final class a extends k implements p {

            /* renamed from: b  reason: collision with root package name */
            Object f28819b;

            /* renamed from: c  reason: collision with root package name */
            Object f28820c;

            /* renamed from: d  reason: collision with root package name */
            Object f28821d;

            /* renamed from: e  reason: collision with root package name */
            long f28822e;

            /* renamed from: f  reason: collision with root package name */
            int f28823f;

            /* renamed from: g  reason: collision with root package name */
            private /* synthetic */ Object f28824g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ K f28825h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ q f28826i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ C6798l f28827j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ C6798l f28828k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ C6798l f28829l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ s f28830m;

            /* renamed from: z.B$f$a$a  reason: collision with other inner class name */
            static final class C0481a extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f28831a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ s f28832b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0481a(s sVar, C6658d dVar) {
                    super(2, dVar);
                    this.f28832b = sVar;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new C0481a(this.f28832b, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((C0481a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    C6680b.f();
                    if (this.f28831a == 0) {
                        w.b(obj);
                        this.f28832b.e();
                        return C6514M.f71813a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* renamed from: z.B$f$a$b */
            static final class b extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f28833a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ s f28834b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(s sVar, C6658d dVar) {
                    super(2, dVar);
                    this.f28834b = sVar;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new b(this.f28834b, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f28833a;
                    if (i10 == 0) {
                        w.b(obj);
                        s sVar = this.f28834b;
                        this.f28833a = 1;
                        if (sVar.o(this) == f10) {
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

            /* renamed from: z.B$f$a$c */
            static final class c extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f28835a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ q f28836b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ s f28837c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ A f28838d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(q qVar, s sVar, A a10, C6658d dVar) {
                    super(2, dVar);
                    this.f28836b = qVar;
                    this.f28837c = sVar;
                    this.f28838d = a10;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new c(this.f28836b, this.f28837c, this.f28838d, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f28835a;
                    if (i10 == 0) {
                        w.b(obj);
                        q qVar = this.f28836b;
                        s sVar = this.f28837c;
                        C2421g d10 = C2421g.d(this.f28838d.h());
                        this.f28835a = 1;
                        if (qVar.invoke(sVar, d10, this) == f10) {
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

            /* renamed from: z.B$f$a$d */
            static final class d extends k implements p {

                /* renamed from: b  reason: collision with root package name */
                int f28839b;

                /* renamed from: c  reason: collision with root package name */
                private /* synthetic */ Object f28840c;

                d(C6658d dVar) {
                    super(2, dVar);
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    d dVar2 = new d(dVar);
                    dVar2.f28840c = obj;
                    return dVar2;
                }

                /* renamed from: i */
                public final Object invoke(C1111b bVar, C6658d dVar) {
                    return ((d) create(bVar, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f28839b;
                    if (i10 == 0) {
                        w.b(obj);
                        this.f28839b = 1;
                        obj = C2938B.l((C1111b) this.f28840c, (C1126q) null, this, 1, (Object) null);
                        if (obj == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        w.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return obj;
                }
            }

            /* renamed from: z.B$f$a$e */
            static final class e extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f28841a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ s f28842b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                e(s sVar, C6658d dVar) {
                    super(2, dVar);
                    this.f28842b = sVar;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new e(this.f28842b, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((e) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    C6680b.f();
                    if (this.f28841a == 0) {
                        w.b(obj);
                        this.f28842b.a();
                        return C6514M.f71813a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* renamed from: z.B$f$a$f  reason: collision with other inner class name */
            static final class C0482f extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f28843a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ s f28844b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0482f(s sVar, C6658d dVar) {
                    super(2, dVar);
                    this.f28844b = sVar;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new C0482f(this.f28844b, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((C0482f) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    C6680b.f();
                    if (this.f28843a == 0) {
                        w.b(obj);
                        this.f28844b.e();
                        return C6514M.f71813a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* renamed from: z.B$f$a$g */
            static final class g extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f28845a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ s f28846b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                g(s sVar, C6658d dVar) {
                    super(2, dVar);
                    this.f28846b = sVar;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new g(this.f28846b, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((g) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    C6680b.f();
                    if (this.f28845a == 0) {
                        w.b(obj);
                        this.f28846b.e();
                        return C6514M.f71813a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* renamed from: z.B$f$a$h */
            static final class h extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f28847a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ s f28848b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                h(s sVar, C6658d dVar) {
                    super(2, dVar);
                    this.f28848b = sVar;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new h(this.f28848b, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((h) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f28847a;
                    if (i10 == 0) {
                        w.b(obj);
                        s sVar = this.f28848b;
                        this.f28847a = 1;
                        if (sVar.o(this) == f10) {
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

            /* renamed from: z.B$f$a$i */
            static final class i extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f28849a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ q f28850b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ s f28851c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ A f28852d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                i(q qVar, s sVar, A a10, C6658d dVar) {
                    super(2, dVar);
                    this.f28850b = qVar;
                    this.f28851c = sVar;
                    this.f28852d = a10;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new i(this.f28850b, this.f28851c, this.f28852d, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((i) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f28849a;
                    if (i10 == 0) {
                        w.b(obj);
                        q qVar = this.f28850b;
                        s sVar = this.f28851c;
                        C2421g d10 = C2421g.d(this.f28852d.h());
                        this.f28849a = 1;
                        if (qVar.invoke(sVar, d10, this) == f10) {
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

            /* renamed from: z.B$f$a$j */
            static final class j extends k implements p {

                /* renamed from: b  reason: collision with root package name */
                int f28853b;

                /* renamed from: c  reason: collision with root package name */
                private /* synthetic */ Object f28854c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ K f28855d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C6798l f28856e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C6798l f28857f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ N f28858g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ s f28859h;

                /* renamed from: z.B$f$a$j$a  reason: collision with other inner class name */
                static final class C0483a extends l implements p {

                    /* renamed from: a  reason: collision with root package name */
                    int f28860a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ s f28861b;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0483a(s sVar, C6658d dVar) {
                        super(2, dVar);
                        this.f28861b = sVar;
                    }

                    public final C6658d create(Object obj, C6658d dVar) {
                        return new C0483a(this.f28861b, dVar);
                    }

                    public final Object invoke(K k10, C6658d dVar) {
                        return ((C0483a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        C6680b.f();
                        if (this.f28860a == 0) {
                            w.b(obj);
                            this.f28861b.e();
                            return C6514M.f71813a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* renamed from: z.B$f$a$j$b */
                static final class b extends l implements p {

                    /* renamed from: a  reason: collision with root package name */
                    int f28862a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ s f28863b;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    b(s sVar, C6658d dVar) {
                        super(2, dVar);
                        this.f28863b = sVar;
                    }

                    public final C6658d create(Object obj, C6658d dVar) {
                        return new b(this.f28863b, dVar);
                    }

                    public final Object invoke(K k10, C6658d dVar) {
                        return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        C6680b.f();
                        if (this.f28862a == 0) {
                            w.b(obj);
                            this.f28863b.a();
                            return C6514M.f71813a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                j(K k10, C6798l lVar, C6798l lVar2, N n10, s sVar, C6658d dVar) {
                    super(2, dVar);
                    this.f28855d = k10;
                    this.f28856e = lVar;
                    this.f28857f = lVar2;
                    this.f28858g = n10;
                    this.f28859h = sVar;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    j jVar = new j(this.f28855d, this.f28856e, this.f28857f, this.f28858g, this.f28859h, dVar);
                    jVar.f28854c = obj;
                    return jVar;
                }

                /* renamed from: i */
                public final Object invoke(C1111b bVar, C6658d dVar) {
                    return ((j) create(bVar, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f28853b;
                    if (i10 == 0) {
                        w.b(obj);
                        this.f28853b = 1;
                        obj = C2938B.l((C1111b) this.f28854c, (C1126q) null, this, 1, (Object) null);
                        if (obj == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        w.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    A a10 = (A) obj;
                    if (a10 != null) {
                        a10.a();
                        C5600w0 unused = C5576k.d(this.f28855d, (qf.g) null, (M) null, new C0483a(this.f28859h, (C6658d) null), 3, (Object) null);
                        this.f28856e.invoke(C2421g.d(a10.h()));
                        return C6514M.f71813a;
                    }
                    C5600w0 unused2 = C5576k.d(this.f28855d, (qf.g) null, (M) null, new b(this.f28859h, (C6658d) null), 3, (Object) null);
                    C6798l lVar = this.f28857f;
                    if (lVar == null) {
                        return null;
                    }
                    lVar.invoke(C2421g.d(((A) this.f28858g.f71759a).h()));
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(K k10, q qVar, C6798l lVar, C6798l lVar2, C6798l lVar3, s sVar, C6658d dVar) {
                super(2, dVar);
                this.f28825h = k10;
                this.f28826i = qVar;
                this.f28827j = lVar;
                this.f28828k = lVar2;
                this.f28829l = lVar3;
                this.f28830m = sVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f28825h, this.f28826i, this.f28827j, this.f28828k, this.f28829l, this.f28830m, dVar);
                aVar.f28824g = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C1111b bVar, C6658d dVar) {
                return ((a) create(bVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: D0.b} */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
                r4 = (D0.A) r0;
                r4.a();
                Ug.C5600w0 unused = Ug.C5576k.d(r6.f28825h, (qf.g) null, (Ug.M) null, new z.C2938B.f.a.b(r6.f28830m, (qf.C6658d) null), 3, (java.lang.Object) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ae, code lost:
                if (r6.f28826i == z.C2938B.c()) goto L_0x00c2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b0, code lost:
                Ug.C5600w0 unused = Ug.C5576k.d(r6.f28825h, (qf.g) null, (Ug.M) null, new z.C2938B.f.a.c(r6.f28826i, r6.f28830m, r4, (qf.C6658d) null), 3, (java.lang.Object) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c4, code lost:
                if (r6.f28827j == null) goto L_0x00cf;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c6, code lost:
                r0 = r5.getViewConfiguration().c();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cf, code lost:
                r0 = 4611686018427387903L;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d4, code lost:
                r2 = new kotlin.jvm.internal.N();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
                r3 = new z.C2938B.f.a.d((qf.C6658d) null);
                r6.f28824g = r5;
                r6.f28819b = r4;
                r6.f28820c = r2;
                r6.f28821d = r2;
                r6.f28822e = r0;
                r6.f28823f = 2;
                r3 = r5.a0(r0, r3, r6);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ef, code lost:
                if (r3 != r7) goto L_0x00f2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f1, code lost:
                return r7;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f2, code lost:
                r9 = r5;
                r5 = r4;
                r4 = r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
                r2.f71759a = r3;
                r2 = r4.f71759a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f9, code lost:
                if (r2 != null) goto L_0x0110;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fb, code lost:
                Ug.C5600w0 unused = Ug.C5576k.d(r6.f28825h, (qf.g) null, (Ug.M) null, new z.C2938B.f.a.e(r6.f28830m, (qf.C6658d) null), 3, (java.lang.Object) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x010c, code lost:
                r2 = r4;
                r4 = r5;
                r3 = r9;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:0x0110, code lost:
                ((D0.A) r2).a();
                Ug.C5600w0 unused = Ug.C5576k.d(r6.f28825h, (qf.g) null, (Ug.M) null, new z.C2938B.f.a.C0482f(r6.f28830m, (qf.C6658d) null), 3, (java.lang.Object) null);
             */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x012a  */
            /* JADX WARNING: Removed duplicated region for block: B:48:0x0148 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:52:0x015f  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    r16 = this;
                    r6 = r16
                    java.lang.Object r7 = rf.C6680b.f()
                    int r0 = r6.f28823f
                    r8 = 0
                    switch(r0) {
                        case 0: goto L_0x0076;
                        case 1: goto L_0x006b;
                        case 2: goto L_0x004b;
                        case 3: goto L_0x003c;
                        case 4: goto L_0x002a;
                        case 5: goto L_0x0019;
                        case 6: goto L_0x0014;
                        default: goto L_0x000c;
                    }
                L_0x000c:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L_0x0014:
                    lf.w.b(r17)
                    goto L_0x0225
                L_0x0019:
                    java.lang.Object r0 = r6.f28820c
                    D0.A r0 = (D0.A) r0
                    java.lang.Object r1 = r6.f28819b
                    kotlin.jvm.internal.N r1 = (kotlin.jvm.internal.N) r1
                    java.lang.Object r2 = r6.f28824g
                    D0.b r2 = (D0.C1111b) r2
                    lf.w.b(r17)     // Catch:{ r -> 0x01f3 }
                    goto L_0x0235
                L_0x002a:
                    long r0 = r6.f28822e
                    java.lang.Object r2 = r6.f28819b
                    kotlin.jvm.internal.N r2 = (kotlin.jvm.internal.N) r2
                    java.lang.Object r3 = r6.f28824g
                    D0.b r3 = (D0.C1111b) r3
                    lf.w.b(r17)
                    r4 = r2
                    r2 = r17
                    goto L_0x018d
                L_0x003c:
                    long r0 = r6.f28822e
                    java.lang.Object r2 = r6.f28819b
                    kotlin.jvm.internal.N r2 = (kotlin.jvm.internal.N) r2
                    java.lang.Object r3 = r6.f28824g
                    D0.b r3 = (D0.C1111b) r3
                    lf.w.b(r17)
                    goto L_0x0149
                L_0x004b:
                    long r0 = r6.f28822e
                    java.lang.Object r2 = r6.f28821d
                    kotlin.jvm.internal.N r2 = (kotlin.jvm.internal.N) r2
                    java.lang.Object r3 = r6.f28820c
                    kotlin.jvm.internal.N r3 = (kotlin.jvm.internal.N) r3
                    java.lang.Object r4 = r6.f28819b
                    D0.A r4 = (D0.A) r4
                    java.lang.Object r5 = r6.f28824g
                    D0.b r5 = (D0.C1111b) r5
                    lf.w.b(r17)     // Catch:{ r -> 0x0067 }
                    r9 = r5
                    r5 = r4
                    r4 = r3
                    r3 = r17
                    goto L_0x00f5
                L_0x0067:
                    r2 = r3
                L_0x0068:
                    r3 = r5
                    goto L_0x0126
                L_0x006b:
                    java.lang.Object r0 = r6.f28824g
                    D0.b r0 = (D0.C1111b) r0
                    lf.w.b(r17)
                    r5 = r0
                    r0 = r17
                    goto L_0x0092
                L_0x0076:
                    lf.w.b(r17)
                    java.lang.Object r0 = r6.f28824g
                    r9 = r0
                    D0.b r9 = (D0.C1111b) r9
                    r6.f28824g = r9
                    r0 = 1
                    r6.f28823f = r0
                    r1 = 0
                    r2 = 0
                    r4 = 3
                    r5 = 0
                    r0 = r9
                    r3 = r16
                    java.lang.Object r0 = z.C2938B.e(r0, r1, r2, r3, r4, r5)
                    if (r0 != r7) goto L_0x0091
                    return r7
                L_0x0091:
                    r5 = r9
                L_0x0092:
                    r4 = r0
                    D0.A r4 = (D0.A) r4
                    r4.a()
                    Ug.K r9 = r6.f28825h
                    z.B$f$a$b r12 = new z.B$f$a$b
                    z.s r0 = r6.f28830m
                    r12.<init>(r0, r8)
                    r13 = 3
                    r14 = 0
                    r10 = 0
                    r11 = 0
                    Ug.C5600w0 unused = Ug.C5576k.d(r9, r10, r11, r12, r13, r14)
                    yf.q r0 = r6.f28826i
                    yf.q r1 = z.C2938B.f28776a
                    if (r0 == r1) goto L_0x00c2
                    Ug.K r9 = r6.f28825h
                    z.B$f$a$c r12 = new z.B$f$a$c
                    yf.q r0 = r6.f28826i
                    z.s r1 = r6.f28830m
                    r12.<init>(r0, r1, r4, r8)
                    r13 = 3
                    r14 = 0
                    r10 = 0
                    r11 = 0
                    Ug.C5600w0 unused = Ug.C5576k.d(r9, r10, r11, r12, r13, r14)
                L_0x00c2:
                    yf.l r0 = r6.f28827j
                    if (r0 == 0) goto L_0x00cf
                    androidx.compose.ui.platform.v1 r0 = r5.getViewConfiguration()
                    long r0 = r0.c()
                    goto L_0x00d4
                L_0x00cf:
                    r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
                L_0x00d4:
                    kotlin.jvm.internal.N r2 = new kotlin.jvm.internal.N
                    r2.<init>()
                    z.B$f$a$d r3 = new z.B$f$a$d     // Catch:{ r -> 0x0068 }
                    r3.<init>(r8)     // Catch:{ r -> 0x0068 }
                    r6.f28824g = r5     // Catch:{ r -> 0x0068 }
                    r6.f28819b = r4     // Catch:{ r -> 0x0068 }
                    r6.f28820c = r2     // Catch:{ r -> 0x0068 }
                    r6.f28821d = r2     // Catch:{ r -> 0x0068 }
                    r6.f28822e = r0     // Catch:{ r -> 0x0068 }
                    r9 = 2
                    r6.f28823f = r9     // Catch:{ r -> 0x0068 }
                    java.lang.Object r3 = r5.a0(r0, r3, r6)     // Catch:{ r -> 0x0068 }
                    if (r3 != r7) goto L_0x00f2
                    return r7
                L_0x00f2:
                    r9 = r5
                    r5 = r4
                    r4 = r2
                L_0x00f5:
                    r2.f71759a = r3     // Catch:{ r -> 0x010c }
                    java.lang.Object r2 = r4.f71759a     // Catch:{ r -> 0x010c }
                    if (r2 != 0) goto L_0x0110
                    Ug.K r10 = r6.f28825h     // Catch:{ r -> 0x010c }
                    z.B$f$a$e r13 = new z.B$f$a$e     // Catch:{ r -> 0x010c }
                    z.s r2 = r6.f28830m     // Catch:{ r -> 0x010c }
                    r13.<init>(r2, r8)     // Catch:{ r -> 0x010c }
                    r14 = 3
                    r15 = 0
                    r11 = 0
                    r12 = 0
                    Ug.C5600w0 unused = Ug.C5576k.d(r10, r11, r12, r13, r14, r15)     // Catch:{ r -> 0x010c }
                    goto L_0x015b
                L_0x010c:
                    r2 = r4
                    r4 = r5
                    r3 = r9
                    goto L_0x0126
                L_0x0110:
                    D0.A r2 = (D0.A) r2     // Catch:{ r -> 0x010c }
                    r2.a()     // Catch:{ r -> 0x010c }
                    Ug.K r10 = r6.f28825h     // Catch:{ r -> 0x010c }
                    z.B$f$a$f r13 = new z.B$f$a$f     // Catch:{ r -> 0x010c }
                    z.s r2 = r6.f28830m     // Catch:{ r -> 0x010c }
                    r13.<init>(r2, r8)     // Catch:{ r -> 0x010c }
                    r14 = 3
                    r15 = 0
                    r11 = 0
                    r12 = 0
                    Ug.C5600w0 unused = Ug.C5576k.d(r10, r11, r12, r13, r14, r15)     // Catch:{ r -> 0x010c }
                    goto L_0x015b
                L_0x0126:
                    yf.l r5 = r6.f28827j
                    if (r5 == 0) goto L_0x0135
                    long r9 = r4.h()
                    q0.g r4 = q0.C2421g.d(r9)
                    r5.invoke(r4)
                L_0x0135:
                    r6.f28824g = r3
                    r6.f28819b = r2
                    r6.f28820c = r8
                    r6.f28821d = r8
                    r6.f28822e = r0
                    r4 = 3
                    r6.f28823f = r4
                    java.lang.Object r4 = z.C2938B.g(r3, r6)
                    if (r4 != r7) goto L_0x0149
                    return r7
                L_0x0149:
                    Ug.K r9 = r6.f28825h
                    z.B$f$a$g r12 = new z.B$f$a$g
                    z.s r4 = r6.f28830m
                    r12.<init>(r4, r8)
                    r13 = 3
                    r14 = 0
                    r10 = 0
                    r11 = 0
                    Ug.C5600w0 unused = Ug.C5576k.d(r9, r10, r11, r12, r13, r14)
                    r4 = r2
                    r9 = r3
                L_0x015b:
                    java.lang.Object r2 = r4.f71759a
                    if (r2 == 0) goto L_0x0235
                    yf.l r3 = r6.f28828k
                    if (r3 != 0) goto L_0x0176
                    yf.l r0 = r6.f28829l
                    if (r0 == 0) goto L_0x0235
                    D0.A r2 = (D0.A) r2
                    long r1 = r2.h()
                    q0.g r1 = q0.C2421g.d(r1)
                    r0.invoke(r1)
                    goto L_0x0235
                L_0x0176:
                    D0.A r2 = (D0.A) r2
                    r6.f28824g = r9
                    r6.f28819b = r4
                    r6.f28820c = r8
                    r6.f28821d = r8
                    r6.f28822e = r0
                    r3 = 4
                    r6.f28823f = r3
                    java.lang.Object r2 = z.C2938B.f(r9, r2, r6)
                    if (r2 != r7) goto L_0x018c
                    return r7
                L_0x018c:
                    r3 = r9
                L_0x018d:
                    D0.A r2 = (D0.A) r2
                    if (r2 != 0) goto L_0x01a6
                    yf.l r0 = r6.f28829l
                    if (r0 == 0) goto L_0x0235
                    java.lang.Object r1 = r4.f71759a
                    D0.A r1 = (D0.A) r1
                    long r1 = r1.h()
                    q0.g r1 = q0.C2421g.d(r1)
                    r0.invoke(r1)
                    goto L_0x0235
                L_0x01a6:
                    Ug.K r9 = r6.f28825h
                    z.B$f$a$h r12 = new z.B$f$a$h
                    z.s r5 = r6.f28830m
                    r12.<init>(r5, r8)
                    r13 = 3
                    r14 = 0
                    r10 = 0
                    r11 = 0
                    Ug.C5600w0 unused = Ug.C5576k.d(r9, r10, r11, r12, r13, r14)
                    yf.q r5 = r6.f28826i
                    yf.q r9 = z.C2938B.f28776a
                    if (r5 == r9) goto L_0x01d0
                    Ug.K r10 = r6.f28825h
                    z.B$f$a$i r13 = new z.B$f$a$i
                    yf.q r5 = r6.f28826i
                    z.s r9 = r6.f28830m
                    r13.<init>(r5, r9, r2, r8)
                    r14 = 3
                    r15 = 0
                    r11 = 0
                    r12 = 0
                    Ug.C5600w0 unused = Ug.C5576k.d(r10, r11, r12, r13, r14, r15)
                L_0x01d0:
                    z.B$f$a$j r5 = new z.B$f$a$j     // Catch:{ r -> 0x01f0 }
                    Ug.K r10 = r6.f28825h     // Catch:{ r -> 0x01f0 }
                    yf.l r11 = r6.f28828k     // Catch:{ r -> 0x01f0 }
                    yf.l r12 = r6.f28829l     // Catch:{ r -> 0x01f0 }
                    z.s r14 = r6.f28830m     // Catch:{ r -> 0x01f0 }
                    r15 = 0
                    r9 = r5
                    r13 = r4
                    r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ r -> 0x01f0 }
                    r6.f28824g = r3     // Catch:{ r -> 0x01f0 }
                    r6.f28819b = r4     // Catch:{ r -> 0x01f0 }
                    r6.f28820c = r2     // Catch:{ r -> 0x01f0 }
                    r9 = 5
                    r6.f28823f = r9     // Catch:{ r -> 0x01f0 }
                    java.lang.Object r0 = r3.a0(r0, r5, r6)     // Catch:{ r -> 0x01f0 }
                    if (r0 != r7) goto L_0x0235
                    return r7
                L_0x01f0:
                    r0 = r2
                    r2 = r3
                    r1 = r4
                L_0x01f3:
                    yf.l r3 = r6.f28829l
                    if (r3 == 0) goto L_0x0206
                    java.lang.Object r1 = r1.f71759a
                    D0.A r1 = (D0.A) r1
                    long r4 = r1.h()
                    q0.g r1 = q0.C2421g.d(r4)
                    r3.invoke(r1)
                L_0x0206:
                    yf.l r1 = r6.f28827j
                    if (r1 == 0) goto L_0x0215
                    long r3 = r0.h()
                    q0.g r0 = q0.C2421g.d(r3)
                    r1.invoke(r0)
                L_0x0215:
                    r6.f28824g = r8
                    r6.f28819b = r8
                    r6.f28820c = r8
                    r0 = 6
                    r6.f28823f = r0
                    java.lang.Object r0 = z.C2938B.g(r2, r6)
                    if (r0 != r7) goto L_0x0225
                    return r7
                L_0x0225:
                    Ug.K r9 = r6.f28825h
                    z.B$f$a$a r12 = new z.B$f$a$a
                    z.s r0 = r6.f28830m
                    r12.<init>(r0, r8)
                    r13 = 3
                    r14 = 0
                    r10 = 0
                    r11 = 0
                    Ug.C5600w0 unused = Ug.C5576k.d(r9, r10, r11, r12, r13, r14)
                L_0x0235:
                    lf.M r0 = lf.C6514M.f71813a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: z.C2938B.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(J j10, q qVar, C6798l lVar, C6798l lVar2, C6798l lVar3, C6658d dVar) {
            super(2, dVar);
            this.f28814c = j10;
            this.f28815d = qVar;
            this.f28816e = lVar;
            this.f28817f = lVar2;
            this.f28818g = lVar3;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            f fVar = new f(this.f28814c, this.f28815d, this.f28816e, this.f28817f, this.f28818g, dVar);
            fVar.f28813b = obj;
            return fVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((f) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f28812a;
            if (i10 == 0) {
                w.b(obj);
                s sVar = new s(this.f28814c);
                J j10 = this.f28814c;
                a aVar = new a((K) this.f28813b, this.f28815d, this.f28816e, this.f28817f, this.f28818g, sVar, (C6658d) null);
                this.f28812a = 1;
                if (o.c(j10, aVar, this) == f10) {
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

    /* renamed from: z.B$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f28864a;

        /* renamed from: b  reason: collision with root package name */
        Object f28865b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f28866c;

        /* renamed from: d  reason: collision with root package name */
        int f28867d;

        g(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f28866c = obj;
            this.f28867d |= Integer.MIN_VALUE;
            return C2938B.k((C1111b) null, (C1126q) null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0077 A[SYNTHETIC] */
    public static final java.lang.Object d(D0.C1111b r9, boolean r10, D0.C1126q r11, qf.C6658d r12) {
        /*
            boolean r0 = r12 instanceof z.C2938B.b
            if (r0 == 0) goto L_0x0013
            r0 = r12
            z.B$b r0 = (z.C2938B.b) r0
            int r1 = r0.f28782e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f28782e = r1
            goto L_0x0018
        L_0x0013:
            z.B$b r0 = new z.B$b
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.f28781d
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f28782e
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            boolean r9 = r0.f28780c
            java.lang.Object r10 = r0.f28779b
            D0.q r10 = (D0.C1126q) r10
            java.lang.Object r11 = r0.f28778a
            D0.b r11 = (D0.C1111b) r11
            lf.w.b(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L_0x0051
        L_0x0037:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003f:
            lf.w.b(r12)
        L_0x0042:
            r0.f28778a = r9
            r0.f28779b = r11
            r0.f28780c = r10
            r0.f28782e = r3
            java.lang.Object r12 = r9.Z0(r11, r0)
            if (r12 != r1) goto L_0x0051
            return r1
        L_0x0051:
            D0.o r12 = (D0.C1124o) r12
            java.util.List r2 = r12.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L_0x005d:
            if (r6 >= r4) goto L_0x0077
            java.lang.Object r7 = r2.get(r6)
            D0.A r7 = (D0.A) r7
            if (r10 == 0) goto L_0x006c
            boolean r7 = D0.C1125p.a(r7)
            goto L_0x0070
        L_0x006c:
            boolean r7 = D0.C1125p.b(r7)
        L_0x0070:
            if (r7 != 0) goto L_0x0074
            r2 = r5
            goto L_0x0078
        L_0x0074:
            int r6 = r6 + 1
            goto L_0x005d
        L_0x0077:
            r2 = r3
        L_0x0078:
            if (r2 == 0) goto L_0x0042
            java.util.List r9 = r12.c()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C2938B.d(D0.b, boolean, D0.q, qf.d):java.lang.Object");
    }

    public static /* synthetic */ Object e(C1111b bVar, boolean z10, C1126q qVar, C6658d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            qVar = C1126q.Main;
        }
        return d(bVar, z10, qVar, dVar);
    }

    /* access modifiers changed from: private */
    public static final Object f(C1111b bVar, A a10, C6658d dVar) {
        return bVar.y0(bVar.getViewConfiguration().a(), new c(a10, (C6658d) null), dVar);
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052 A[LOOP:0: B:17:0x0050->B:18:0x0052, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0078 A[SYNTHETIC] */
    public static final java.lang.Object g(D0.C1111b r8, qf.C6658d r9) {
        /*
            boolean r0 = r9 instanceof z.C2938B.d
            if (r0 == 0) goto L_0x0013
            r0 = r9
            z.B$d r0 = (z.C2938B.d) r0
            int r1 = r0.f28789c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f28789c = r1
            goto L_0x0018
        L_0x0013:
            z.B$d r0 = new z.B$d
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f28788b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f28789c
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r8 = r0.f28787a
            D0.b r8 = (D0.C1111b) r8
            lf.w.b(r9)
            goto L_0x0044
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            lf.w.b(r9)
        L_0x0038:
            r0.f28787a = r8
            r0.f28789c = r3
            r9 = 0
            java.lang.Object r9 = D0.C1111b.u0(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L_0x0044
            return r1
        L_0x0044:
            D0.o r9 = (D0.C1124o) r9
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L_0x0050:
            if (r6 >= r4) goto L_0x005e
            java.lang.Object r7 = r2.get(r6)
            D0.A r7 = (D0.A) r7
            r7.a()
            int r6 = r6 + 1
            goto L_0x0050
        L_0x005e:
            java.util.List r9 = r9.c()
            int r2 = r9.size()
        L_0x0066:
            if (r5 >= r2) goto L_0x0078
            java.lang.Object r4 = r9.get(r5)
            D0.A r4 = (D0.A) r4
            boolean r4 = r4.i()
            if (r4 == 0) goto L_0x0075
            goto L_0x0038
        L_0x0075:
            int r5 = r5 + 1
            goto L_0x0066
        L_0x0078:
            lf.M r8 = lf.C6514M.f71813a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C2938B.g(D0.b, qf.d):java.lang.Object");
    }

    public static final Object h(J j10, q qVar, C6798l lVar, C6658d dVar) {
        Object e10 = L.e(new e(j10, qVar, lVar, new s(j10), (C6658d) null), dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    public static final Object i(J j10, C6798l lVar, C6798l lVar2, q qVar, C6798l lVar3, C6658d dVar) {
        Object e10 = L.e(new f(j10, qVar, lVar2, lVar, lVar3, (C6658d) null), dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    public static /* synthetic */ Object j(J j10, C6798l lVar, C6798l lVar2, q qVar, C6798l lVar3, C6658d dVar, int i10, Object obj) {
        C6798l lVar4;
        C6798l lVar5;
        C6798l lVar6;
        if ((i10 & 1) != 0) {
            lVar4 = null;
        } else {
            lVar4 = lVar;
        }
        if ((i10 & 2) != 0) {
            lVar5 = null;
        } else {
            lVar5 = lVar2;
        }
        if ((i10 & 4) != 0) {
            qVar = f28776a;
        }
        q qVar2 = qVar;
        if ((i10 & 8) != 0) {
            lVar6 = null;
        } else {
            lVar6 = lVar3;
        }
        return i(j10, lVar4, lVar5, qVar2, lVar6, dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
        r0 = r0.c();
        r9 = r0.size();
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r10 >= r9) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        r11 = (D0.A) r0.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        if (r11.p() != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        if (D0.C1125p.f(r11, r8.b(), r8.w0()) == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        r0 = D0.C1126q.Final;
        r1.f28864a = r8;
        r1.f28865b = r3;
        r1.f28867d = 2;
        r0 = r8.Z0(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c0, code lost:
        if (r0 != r2) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c2, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dd A[LOOP:2: B:36:0x00ce->B:40:0x00dd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00dc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object k(D0.C1111b r18, D0.C1126q r19, qf.C6658d r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof z.C2938B.g
            if (r1 == 0) goto L_0x0015
            r1 = r0
            z.B$g r1 = (z.C2938B.g) r1
            int r2 = r1.f28867d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f28867d = r2
            goto L_0x001a
        L_0x0015:
            z.B$g r1 = new z.B$g
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.f28866c
            java.lang.Object r2 = rf.C6680b.f()
            int r3 = r1.f28867d
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x0052
            if (r3 == r7) goto L_0x0046
            if (r3 != r5) goto L_0x003e
            java.lang.Object r3 = r1.f28865b
            D0.q r3 = (D0.C1126q) r3
            java.lang.Object r8 = r1.f28864a
            D0.b r8 = (D0.C1111b) r8
            lf.w.b(r0)
        L_0x0037:
            r16 = r3
            r3 = r1
            r1 = r16
            goto L_0x00c3
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            java.lang.Object r3 = r1.f28865b
            D0.q r3 = (D0.C1126q) r3
            java.lang.Object r8 = r1.f28864a
            D0.b r8 = (D0.C1111b) r8
            lf.w.b(r0)
            goto L_0x0071
        L_0x0052:
            lf.w.b(r0)
            r0 = r18
            r3 = r1
            r1 = r19
        L_0x005a:
            r3.f28864a = r0
            r3.f28865b = r1
            r3.f28867d = r7
            java.lang.Object r8 = r0.Z0(r1, r3)
            if (r8 != r2) goto L_0x0067
            return r2
        L_0x0067:
            r16 = r8
            r8 = r0
            r0 = r16
            r17 = r3
            r3 = r1
            r1 = r17
        L_0x0071:
            D0.o r0 = (D0.C1124o) r0
            java.util.List r9 = r0.c()
            int r10 = r9.size()
            r11 = r6
        L_0x007c:
            if (r11 >= r10) goto L_0x00e6
            java.lang.Object r12 = r9.get(r11)
            D0.A r12 = (D0.A) r12
            boolean r12 = D0.C1125p.c(r12)
            if (r12 != 0) goto L_0x00e3
            java.util.List r0 = r0.c()
            int r9 = r0.size()
            r10 = r6
        L_0x0093:
            if (r10 >= r9) goto L_0x00b4
            java.lang.Object r11 = r0.get(r10)
            D0.A r11 = (D0.A) r11
            boolean r12 = r11.p()
            if (r12 != 0) goto L_0x00b3
            long r12 = r8.b()
            long r14 = r8.w0()
            boolean r11 = D0.C1125p.f(r11, r12, r14)
            if (r11 == 0) goto L_0x00b0
            goto L_0x00b3
        L_0x00b0:
            int r10 = r10 + 1
            goto L_0x0093
        L_0x00b3:
            return r4
        L_0x00b4:
            D0.q r0 = D0.C1126q.Final
            r1.f28864a = r8
            r1.f28865b = r3
            r1.f28867d = r5
            java.lang.Object r0 = r8.Z0(r0, r1)
            if (r0 != r2) goto L_0x0037
            return r2
        L_0x00c3:
            D0.o r0 = (D0.C1124o) r0
            java.util.List r0 = r0.c()
            int r9 = r0.size()
            r10 = r6
        L_0x00ce:
            if (r10 >= r9) goto L_0x00e0
            java.lang.Object r11 = r0.get(r10)
            D0.A r11 = (D0.A) r11
            boolean r11 = r11.p()
            if (r11 == 0) goto L_0x00dd
            return r4
        L_0x00dd:
            int r10 = r10 + 1
            goto L_0x00ce
        L_0x00e0:
            r0 = r8
            goto L_0x005a
        L_0x00e3:
            int r11 = r11 + 1
            goto L_0x007c
        L_0x00e6:
            java.util.List r0 = r0.c()
            java.lang.Object r0 = r0.get(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C2938B.k(D0.b, D0.q, qf.d):java.lang.Object");
    }

    public static /* synthetic */ Object l(C1111b bVar, C1126q qVar, C6658d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qVar = C1126q.Main;
        }
        return k(bVar, qVar, dVar);
    }
}

package androidx.lifecycle;

import Ug.C5572i;
import Ug.C5582n;
import Ug.C5600w0;
import Ug.I0;
import Ug.K;
import Ug.M;
import Ug.Z;
import androidx.lifecycle.C1790m;
import dh.C5817a;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lf.v;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

public abstract class L {

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f17121a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f17122b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1790m f17123c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1790m.b f17124d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f17125e;

        /* renamed from: androidx.lifecycle.L$a$a  reason: collision with other inner class name */
        static final class C0298a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            Object f17126a;

            /* renamed from: b  reason: collision with root package name */
            Object f17127b;

            /* renamed from: c  reason: collision with root package name */
            Object f17128c;

            /* renamed from: d  reason: collision with root package name */
            Object f17129d;

            /* renamed from: e  reason: collision with root package name */
            Object f17130e;

            /* renamed from: f  reason: collision with root package name */
            Object f17131f;

            /* renamed from: g  reason: collision with root package name */
            int f17132g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C1790m f17133h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ C1790m.b f17134i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ K f17135j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ p f17136k;

            /* renamed from: androidx.lifecycle.L$a$a$a  reason: collision with other inner class name */
            static final class C0299a implements C1795s {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C1790m.a f17137a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ N f17138b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ K f17139c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C1790m.a f17140d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C5582n f17141e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C5817a f17142f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ p f17143g;

                /* renamed from: androidx.lifecycle.L$a$a$a$a  reason: collision with other inner class name */
                static final class C0300a extends l implements p {

                    /* renamed from: a  reason: collision with root package name */
                    Object f17144a;

                    /* renamed from: b  reason: collision with root package name */
                    Object f17145b;

                    /* renamed from: c  reason: collision with root package name */
                    int f17146c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ C5817a f17147d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ p f17148e;

                    /* renamed from: androidx.lifecycle.L$a$a$a$a$a  reason: collision with other inner class name */
                    static final class C0301a extends l implements p {

                        /* renamed from: a  reason: collision with root package name */
                        int f17149a;

                        /* renamed from: b  reason: collision with root package name */
                        private /* synthetic */ Object f17150b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ p f17151c;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C0301a(p pVar, C6658d dVar) {
                            super(2, dVar);
                            this.f17151c = pVar;
                        }

                        public final C6658d create(Object obj, C6658d dVar) {
                            C0301a aVar = new C0301a(this.f17151c, dVar);
                            aVar.f17150b = obj;
                            return aVar;
                        }

                        public final Object invoke(K k10, C6658d dVar) {
                            return ((C0301a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object f10 = C6680b.f();
                            int i10 = this.f17149a;
                            if (i10 == 0) {
                                w.b(obj);
                                p pVar = this.f17151c;
                                this.f17149a = 1;
                                if (pVar.invoke((K) this.f17150b, this) == f10) {
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
                    C0300a(C5817a aVar, p pVar, C6658d dVar) {
                        super(2, dVar);
                        this.f17147d = aVar;
                        this.f17148e = pVar;
                    }

                    public final C6658d create(Object obj, C6658d dVar) {
                        return new C0300a(this.f17147d, this.f17148e, dVar);
                    }

                    public final Object invoke(K k10, C6658d dVar) {
                        return ((C0300a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Throwable th2;
                        C5817a aVar;
                        C5817a aVar2;
                        p pVar;
                        Object f10 = C6680b.f();
                        int i10 = this.f17146c;
                        if (i10 == 0) {
                            w.b(obj);
                            aVar2 = this.f17147d;
                            pVar = this.f17148e;
                            this.f17144a = aVar2;
                            this.f17145b = pVar;
                            this.f17146c = 1;
                            if (aVar2.a((Object) null, this) == f10) {
                                return f10;
                            }
                        } else if (i10 == 1) {
                            pVar = (p) this.f17145b;
                            w.b(obj);
                            aVar2 = (C5817a) this.f17144a;
                        } else if (i10 == 2) {
                            aVar = (C5817a) this.f17144a;
                            try {
                                w.b(obj);
                                C6514M m10 = C6514M.f71813a;
                                aVar.e((Object) null);
                                return C6514M.f71813a;
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            C0301a aVar3 = new C0301a(pVar, (C6658d) null);
                            this.f17144a = aVar2;
                            this.f17145b = null;
                            this.f17146c = 2;
                            if (Ug.L.e(aVar3, this) == f10) {
                                return f10;
                            }
                            aVar = aVar2;
                            C6514M m102 = C6514M.f71813a;
                            aVar.e((Object) null);
                            return C6514M.f71813a;
                        } catch (Throwable th4) {
                            Throwable th5 = th4;
                            aVar = aVar2;
                            th2 = th5;
                            aVar.e((Object) null);
                            throw th2;
                        }
                    }
                }

                C0299a(C1790m.a aVar, N n10, K k10, C1790m.a aVar2, C5582n nVar, C5817a aVar3, p pVar) {
                    this.f17137a = aVar;
                    this.f17138b = n10;
                    this.f17139c = k10;
                    this.f17140d = aVar2;
                    this.f17141e = nVar;
                    this.f17142f = aVar3;
                    this.f17143g = pVar;
                }

                public final void f(C1798v vVar, C1790m.a aVar) {
                    C6496s.h(vVar, "<anonymous parameter 0>");
                    C6496s.h(aVar, "event");
                    if (aVar == this.f17137a) {
                        this.f17138b.f71759a = C5576k.d(this.f17139c, (g) null, (M) null, new C0300a(this.f17142f, this.f17143g, (C6658d) null), 3, (Object) null);
                        return;
                    }
                    if (aVar == this.f17140d) {
                        C5600w0 w0Var = (C5600w0) this.f17138b.f71759a;
                        if (w0Var != null) {
                            C5600w0.a.a(w0Var, (CancellationException) null, 1, (Object) null);
                        }
                        this.f17138b.f71759a = null;
                    }
                    if (aVar == C1790m.a.ON_DESTROY) {
                        C5582n nVar = this.f17141e;
                        v.a aVar2 = v.f71841b;
                        nVar.resumeWith(v.b(C6514M.f71813a));
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0298a(C1790m mVar, C1790m.b bVar, K k10, p pVar, C6658d dVar) {
                super(2, dVar);
                this.f17133h = mVar;
                this.f17134i = bVar;
                this.f17135j = k10;
                this.f17136k = pVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new C0298a(this.f17133h, this.f17134i, this.f17135j, this.f17136k, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0298a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlin.jvm.internal.N} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: kotlin.jvm.internal.N} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    r16 = this;
                    r1 = r16
                    java.lang.Object r0 = rf.C6680b.f()
                    int r2 = r1.f17132g
                    r3 = 0
                    r4 = 1
                    if (r2 == 0) goto L_0x0038
                    if (r2 != r4) goto L_0x0030
                    java.lang.Object r0 = r1.f17131f
                    yf.p r0 = (yf.p) r0
                    java.lang.Object r0 = r1.f17130e
                    Ug.K r0 = (Ug.K) r0
                    java.lang.Object r0 = r1.f17129d
                    androidx.lifecycle.m r0 = (androidx.lifecycle.C1790m) r0
                    java.lang.Object r0 = r1.f17128c
                    androidx.lifecycle.m$b r0 = (androidx.lifecycle.C1790m.b) r0
                    java.lang.Object r0 = r1.f17127b
                    r2 = r0
                    kotlin.jvm.internal.N r2 = (kotlin.jvm.internal.N) r2
                    java.lang.Object r0 = r1.f17126a
                    r5 = r0
                    kotlin.jvm.internal.N r5 = (kotlin.jvm.internal.N) r5
                    lf.w.b(r17)     // Catch:{ all -> 0x002d }
                    goto L_0x00b1
                L_0x002d:
                    r0 = move-exception
                    goto L_0x00c9
                L_0x0030:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r2)
                    throw r0
                L_0x0038:
                    lf.w.b(r17)
                    androidx.lifecycle.m r2 = r1.f17133h
                    androidx.lifecycle.m$b r2 = r2.b()
                    androidx.lifecycle.m$b r5 = androidx.lifecycle.C1790m.b.DESTROYED
                    if (r2 != r5) goto L_0x0048
                    lf.M r0 = lf.C6514M.f71813a
                    return r0
                L_0x0048:
                    kotlin.jvm.internal.N r2 = new kotlin.jvm.internal.N
                    r2.<init>()
                    kotlin.jvm.internal.N r13 = new kotlin.jvm.internal.N
                    r13.<init>()
                    androidx.lifecycle.m$b r5 = r1.f17134i     // Catch:{ all -> 0x00a8 }
                    androidx.lifecycle.m r14 = r1.f17133h     // Catch:{ all -> 0x00a8 }
                    Ug.K r8 = r1.f17135j     // Catch:{ all -> 0x00a8 }
                    yf.p r12 = r1.f17136k     // Catch:{ all -> 0x00a8 }
                    r1.f17126a = r2     // Catch:{ all -> 0x00a8 }
                    r1.f17127b = r13     // Catch:{ all -> 0x00a8 }
                    r1.f17128c = r5     // Catch:{ all -> 0x00a8 }
                    r1.f17129d = r14     // Catch:{ all -> 0x00a8 }
                    r1.f17130e = r8     // Catch:{ all -> 0x00a8 }
                    r1.f17131f = r12     // Catch:{ all -> 0x00a8 }
                    r1.f17132g = r4     // Catch:{ all -> 0x00a8 }
                    Ug.o r15 = new Ug.o     // Catch:{ all -> 0x00a8 }
                    qf.d r6 = rf.C6680b.c(r16)     // Catch:{ all -> 0x00a8 }
                    r15.<init>(r6, r4)     // Catch:{ all -> 0x00a8 }
                    r15.E()     // Catch:{ all -> 0x00a8 }
                    androidx.lifecycle.m$a$a r6 = androidx.lifecycle.C1790m.a.Companion     // Catch:{ all -> 0x00a8 }
                    androidx.lifecycle.m$a r7 = r6.c(r5)     // Catch:{ all -> 0x00a8 }
                    androidx.lifecycle.m$a r9 = r6.a(r5)     // Catch:{ all -> 0x00a8 }
                    r5 = 0
                    dh.a r11 = dh.c.b(r5, r4, r3)     // Catch:{ all -> 0x00a8 }
                    androidx.lifecycle.L$a$a$a r10 = new androidx.lifecycle.L$a$a$a     // Catch:{ all -> 0x00a8 }
                    r5 = r10
                    r6 = r7
                    r7 = r2
                    r3 = r10
                    r10 = r15
                    r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00a8 }
                    r13.f71759a = r3     // Catch:{ all -> 0x00a8 }
                    java.lang.String r5 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver"
                    kotlin.jvm.internal.C6496s.f(r3, r5)     // Catch:{ all -> 0x00a8 }
                    r10 = r3
                    androidx.lifecycle.s r10 = (androidx.lifecycle.C1795s) r10     // Catch:{ all -> 0x00a8 }
                    r14.a(r10)     // Catch:{ all -> 0x00a8 }
                    java.lang.Object r3 = r15.v()     // Catch:{ all -> 0x00a8 }
                    java.lang.Object r5 = rf.C6680b.f()     // Catch:{ all -> 0x00a8 }
                    if (r3 != r5) goto L_0x00ac
                    kotlin.coroutines.jvm.internal.h.c(r16)     // Catch:{ all -> 0x00a8 }
                    goto L_0x00ac
                L_0x00a8:
                    r0 = move-exception
                    r5 = r2
                    r2 = r13
                    goto L_0x00c9
                L_0x00ac:
                    if (r3 != r0) goto L_0x00af
                    return r0
                L_0x00af:
                    r5 = r2
                    r2 = r13
                L_0x00b1:
                    java.lang.Object r0 = r5.f71759a
                    Ug.w0 r0 = (Ug.C5600w0) r0
                    if (r0 == 0) goto L_0x00bb
                    r3 = 0
                    Ug.C5600w0.a.a(r0, r3, r4, r3)
                L_0x00bb:
                    java.lang.Object r0 = r2.f71759a
                    androidx.lifecycle.s r0 = (androidx.lifecycle.C1795s) r0
                    if (r0 == 0) goto L_0x00c6
                    androidx.lifecycle.m r2 = r1.f17133h
                    r2.d(r0)
                L_0x00c6:
                    lf.M r0 = lf.C6514M.f71813a
                    return r0
                L_0x00c9:
                    java.lang.Object r3 = r5.f71759a
                    Ug.w0 r3 = (Ug.C5600w0) r3
                    if (r3 == 0) goto L_0x00d3
                    r5 = 0
                    Ug.C5600w0.a.a(r3, r5, r4, r5)
                L_0x00d3:
                    java.lang.Object r2 = r2.f71759a
                    androidx.lifecycle.s r2 = (androidx.lifecycle.C1795s) r2
                    if (r2 == 0) goto L_0x00de
                    androidx.lifecycle.m r3 = r1.f17133h
                    r3.d(r2)
                L_0x00de:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.L.a.C0298a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1790m mVar, C1790m.b bVar, p pVar, C6658d dVar) {
            super(2, dVar);
            this.f17123c = mVar;
            this.f17124d = bVar;
            this.f17125e = pVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f17123c, this.f17124d, this.f17125e, dVar);
            aVar.f17122b = obj;
            return aVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f17121a;
            if (i10 == 0) {
                w.b(obj);
                I0 D12 = Z.c().D1();
                C0298a aVar = new C0298a(this.f17123c, this.f17124d, (K) this.f17122b, this.f17125e, (C6658d) null);
                this.f17121a = 1;
                if (C5572i.g(D12, aVar, this) == f10) {
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

    public static final Object a(C1790m mVar, C1790m.b bVar, p pVar, C6658d dVar) {
        if (bVar == C1790m.b.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        } else if (mVar.b() == C1790m.b.DESTROYED) {
            return C6514M.f71813a;
        } else {
            Object e10 = Ug.L.e(new a(mVar, bVar, pVar, (C6658d) null), dVar);
            if (e10 == C6680b.f()) {
                return e10;
            }
            return C6514M.f71813a;
        }
    }
}

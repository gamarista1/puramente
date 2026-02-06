package androidx.compose.material3.internal;

import Ug.L;
import W.C1430e;
import W.C1431f;
import W.h;
import W.i;
import Xg.C5694f;
import Xg.C5695g;
import Y.p1;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lf.w;
import mf.O;
import qf.C6658d;
import rf.C6680b;
import w.C2797i;
import w.l0;
import x.C2848L;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.r;
import z.q;

public abstract class b {

    static final class a extends l implements r {

        /* renamed from: a  reason: collision with root package name */
        int f13214a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f13215b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f13216c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f13217d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C1431f f13218e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f13219f;

        /* renamed from: androidx.compose.material3.internal.b$a$a  reason: collision with other inner class name */
        static final class C0250a extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1430e f13220a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ K f13221b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0250a(C1430e eVar, K k10) {
                super(2);
                this.f13220a = eVar;
                this.f13221b = k10;
            }

            public final void a(float f10, float f11) {
                this.f13220a.a(f10, f11);
                this.f13221b.f71756a = f10;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1431f fVar, float f10, C6658d dVar) {
            super(4, dVar);
            this.f13218e = fVar;
            this.f13219f = f10;
        }

        /* renamed from: i */
        public final Object invoke(C1430e eVar, h hVar, Object obj, C6658d dVar) {
            a aVar = new a(this.f13218e, this.f13219f, dVar);
            aVar.f13215b = eVar;
            aVar.f13216c = hVar;
            aVar.f13217d = obj;
            return aVar.invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            float w10;
            Object f10 = C6680b.f();
            int i10 = this.f13214a;
            if (i10 == 0) {
                w.b(obj);
                C1430e eVar = (C1430e) this.f13215b;
                float e10 = ((h) this.f13216c).e(this.f13217d);
                if (!Float.isNaN(e10)) {
                    K k10 = new K();
                    if (Float.isNaN(this.f13218e.w())) {
                        w10 = 0.0f;
                    } else {
                        w10 = this.f13218e.w();
                    }
                    float f11 = w10;
                    k10.f71756a = f11;
                    float f12 = this.f13219f;
                    C2797i p10 = this.f13218e.p();
                    C0250a aVar = new C0250a(eVar, k10);
                    this.f13215b = null;
                    this.f13216c = null;
                    this.f13214a = 1;
                    if (l0.b(f11, e10, f12, p10, aVar, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: androidx.compose.material3.internal.b$b  reason: collision with other inner class name */
    static final class C0251b extends d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f13222a;

        /* renamed from: b  reason: collision with root package name */
        int f13223b;

        C0251b(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13222a = obj;
            this.f13223b |= Integer.MIN_VALUE;
            return b.h((C6787a) null, (p) null, this);
        }
    }

    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f13224a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f13225b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6787a f13226c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f13227d;

        static final class a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ N f13228a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Ug.K f13229b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ p f13230c;

            /* renamed from: androidx.compose.material3.internal.b$c$a$a  reason: collision with other inner class name */
            static final class C0252a extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f13231a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ p f13232b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ Object f13233c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ Ug.K f13234d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0252a(p pVar, Object obj, Ug.K k10, C6658d dVar) {
                    super(2, dVar);
                    this.f13232b = pVar;
                    this.f13233c = obj;
                    this.f13234d = k10;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new C0252a(this.f13232b, this.f13233c, this.f13234d, dVar);
                }

                public final Object invoke(Ug.K k10, C6658d dVar) {
                    return ((C0252a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f13231a;
                    if (i10 == 0) {
                        w.b(obj);
                        p pVar = this.f13232b;
                        Object obj2 = this.f13233c;
                        this.f13231a = 1;
                        if (pVar.invoke(obj2, this) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        w.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    L.c(this.f13234d, new a());
                    return C6514M.f71813a;
                }
            }

            /* renamed from: androidx.compose.material3.internal.b$c$a$b  reason: collision with other inner class name */
            static final class C0253b extends d {

                /* renamed from: a  reason: collision with root package name */
                Object f13235a;

                /* renamed from: b  reason: collision with root package name */
                Object f13236b;

                /* renamed from: c  reason: collision with root package name */
                Object f13237c;

                /* renamed from: d  reason: collision with root package name */
                /* synthetic */ Object f13238d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f13239e;

                /* renamed from: f  reason: collision with root package name */
                int f13240f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0253b(a aVar, C6658d dVar) {
                    super(dVar);
                    this.f13239e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f13238d = obj;
                    this.f13240f |= Integer.MIN_VALUE;
                    return this.f13239e.emit((Object) null, this);
                }
            }

            a(N n10, Ug.K k10, p pVar) {
                this.f13228a = n10;
                this.f13229b = k10;
                this.f13230c = pVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, qf.C6658d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.compose.material3.internal.b.c.a.C0253b
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    androidx.compose.material3.internal.b$c$a$b r0 = (androidx.compose.material3.internal.b.c.a.C0253b) r0
                    int r1 = r0.f13240f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f13240f = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.compose.material3.internal.b$c$a$b r0 = new androidx.compose.material3.internal.b$c$a$b
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f13238d
                    java.lang.Object r1 = rf.C6680b.f()
                    int r2 = r0.f13240f
                    r3 = 1
                    if (r2 == 0) goto L_0x003b
                    if (r2 != r3) goto L_0x0033
                    java.lang.Object r8 = r0.f13237c
                    Ug.w0 r8 = (Ug.C5600w0) r8
                    java.lang.Object r8 = r0.f13236b
                    java.lang.Object r0 = r0.f13235a
                    androidx.compose.material3.internal.b$c$a r0 = (androidx.compose.material3.internal.b.c.a) r0
                    lf.w.b(r9)
                    goto L_0x005e
                L_0x0033:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x003b:
                    lf.w.b(r9)
                    kotlin.jvm.internal.N r9 = r7.f13228a
                    java.lang.Object r9 = r9.f71759a
                    Ug.w0 r9 = (Ug.C5600w0) r9
                    if (r9 == 0) goto L_0x005d
                    androidx.compose.material3.internal.a r2 = new androidx.compose.material3.internal.a
                    r2.<init>()
                    r9.n(r2)
                    r0.f13235a = r7
                    r0.f13236b = r8
                    r0.f13237c = r9
                    r0.f13240f = r3
                    java.lang.Object r9 = r9.B0(r0)
                    if (r9 != r1) goto L_0x005d
                    return r1
                L_0x005d:
                    r0 = r7
                L_0x005e:
                    kotlin.jvm.internal.N r9 = r0.f13228a
                    Ug.K r1 = r0.f13229b
                    Ug.M r3 = Ug.M.UNDISPATCHED
                    androidx.compose.material3.internal.b$c$a$a r4 = new androidx.compose.material3.internal.b$c$a$a
                    yf.p r0 = r0.f13230c
                    r2 = 0
                    r4.<init>(r0, r8, r1, r2)
                    r5 = 1
                    r6 = 0
                    Ug.w0 r8 = Ug.C5576k.d(r1, r2, r3, r4, r5, r6)
                    r9.f71759a = r8
                    lf.M r8 = lf.C6514M.f71813a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.b.c.a.emit(java.lang.Object, qf.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C6787a aVar, p pVar, C6658d dVar) {
            super(2, dVar);
            this.f13226c = aVar;
            this.f13227d = pVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            c cVar = new c(this.f13226c, this.f13227d, dVar);
            cVar.f13225b = obj;
            return cVar;
        }

        public final Object invoke(Ug.K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f13224a;
            if (i10 == 0) {
                w.b(obj);
                N n10 = new N();
                C5694f p10 = p1.p(this.f13226c);
                a aVar = new a(n10, (Ug.K) this.f13225b, this.f13227d);
                this.f13224a = 1;
                if (p10.collect(aVar, this) == f10) {
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

    public static final h a(C6798l lVar) {
        i iVar = new i();
        lVar.invoke(iVar);
        return new d(iVar.b());
    }

    public static final Object d(C1431f fVar, Object obj, float f10, C6658d dVar) {
        Object k10 = C1431f.k(fVar, obj, (C2848L) null, new a(fVar, f10, (C6658d) null), dVar, 2, (Object) null);
        if (k10 == C6680b.f()) {
            return k10;
        }
        return C6514M.f71813a;
    }

    public static /* synthetic */ Object e(C1431f fVar, Object obj, float f10, C6658d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            f10 = fVar.v();
        }
        return d(fVar, obj, f10, dVar);
    }

    public static final k0.i f(k0.i iVar, C1431f fVar, q qVar, p pVar) {
        return iVar.h(new DraggableAnchorsElement(fVar, pVar, qVar));
    }

    /* access modifiers changed from: private */
    public static final d g() {
        return new d(O.i());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object h(yf.C6787a r4, yf.p r5, qf.C6658d r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material3.internal.b.C0251b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.material3.internal.b$b r0 = (androidx.compose.material3.internal.b.C0251b) r0
            int r1 = r0.f13223b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13223b = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.internal.b$b r0 = new androidx.compose.material3.internal.b$b
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f13222a
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f13223b
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            lf.w.b(r6)     // Catch:{ a -> 0x0043 }
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            lf.w.b(r6)
            androidx.compose.material3.internal.b$c r6 = new androidx.compose.material3.internal.b$c     // Catch:{ a -> 0x0043 }
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch:{ a -> 0x0043 }
            r0.f13223b = r3     // Catch:{ a -> 0x0043 }
            java.lang.Object r4 = Ug.L.e(r6, r0)     // Catch:{ a -> 0x0043 }
            if (r4 != r1) goto L_0x0043
            return r1
        L_0x0043:
            lf.M r4 = lf.C6514M.f71813a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.b.h(yf.a, yf.p, qf.d):java.lang.Object");
    }
}

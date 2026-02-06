package androidx.compose.foundation.gestures;

import B.l;
import D0.A;
import D0.C1124o;
import D0.C1126q;
import D0.J;
import D0.T;
import D0.V;
import J0.C1242h;
import J0.C1243i;
import J0.C1247m;
import J0.s0;
import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.M;
import Wg.g;
import Wg.h;
import androidx.compose.foundation.gestures.a;
import androidx.compose.ui.platform.C1644k0;
import androidx.compose.ui.platform.v1;
import c1.z;
import com.google.android.gms.common.api.a;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import z.j;
import z.q;

public abstract class b extends C1247m implements s0, C1242h {
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public q f12596p;

    /* renamed from: q  reason: collision with root package name */
    private C6798l f12597q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f12598r;

    /* renamed from: s  reason: collision with root package name */
    private l f12599s;

    /* renamed from: t  reason: collision with root package name */
    private final C6798l f12600t = new a(this);
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public Wg.d f12601u;

    /* renamed from: v  reason: collision with root package name */
    private B.b f12602v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public boolean f12603w;

    /* renamed from: x  reason: collision with root package name */
    private V f12604x;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f12605a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.f12605a = bVar;
        }

        /* renamed from: a */
        public final Boolean invoke(A a10) {
            return (Boolean) this.f12605a.B2().invoke(a10);
        }
    }

    /* renamed from: androidx.compose.foundation.gestures.b$b  reason: collision with other inner class name */
    static final class C0236b extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12606a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f12607b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f12608c;

        /* renamed from: androidx.compose.foundation.gestures.b$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f12609a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f12610b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f12611c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ J f12612d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ yf.q f12613e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C6798l f12614f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C6787a f12615g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C6787a f12616h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ p f12617i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, J j10, yf.q qVar, C6798l lVar, C6787a aVar, C6787a aVar2, p pVar, C6658d dVar) {
                super(2, dVar);
                this.f12611c = bVar;
                this.f12612d = j10;
                this.f12613e = qVar;
                this.f12614f = lVar;
                this.f12615g = aVar;
                this.f12616h = aVar2;
                this.f12617i = pVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f12611c, this.f12612d, this.f12613e, this.f12614f, this.f12615g, this.f12616h, this.f12617i, dVar);
                aVar.f12610b = obj;
                return aVar;
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                CancellationException e10;
                K k10;
                Object f10 = C6680b.f();
                int i10 = this.f12609a;
                if (i10 == 0) {
                    w.b(obj);
                    K k11 = (K) this.f12610b;
                    try {
                        q s22 = this.f12611c.f12596p;
                        J j10 = this.f12612d;
                        yf.q qVar = this.f12613e;
                        C6798l lVar = this.f12614f;
                        C6787a aVar = this.f12615g;
                        C6787a aVar2 = this.f12616h;
                        p pVar = this.f12617i;
                        this.f12610b = k11;
                        this.f12609a = 1;
                        if (j.e(j10, qVar, lVar, aVar, aVar2, s22, pVar, this) == f10) {
                            return f10;
                        }
                    } catch (CancellationException e11) {
                        CancellationException cancellationException = e11;
                        k10 = k11;
                        e10 = cancellationException;
                        Wg.d r22 = this.f12611c.f12601u;
                        if (r22 != null) {
                            h.b(r22.c(a.C0235a.f12592a));
                        }
                        if (!L.g(k10)) {
                            throw e10;
                        }
                        return C6514M.f71813a;
                    }
                } else if (i10 == 1) {
                    k10 = (K) this.f12610b;
                    try {
                        w.b(obj);
                    } catch (CancellationException e12) {
                        e10 = e12;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C6514M.f71813a;
            }
        }

        /* renamed from: androidx.compose.foundation.gestures.b$b$b  reason: collision with other inner class name */
        static final class C0237b extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ E0.d f12618a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f12619b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0237b(E0.d dVar, b bVar) {
                super(2);
                this.f12618a = dVar;
                this.f12619b = bVar;
            }

            public final void a(A a10, long j10) {
                E0.e.c(this.f12618a, a10);
                Wg.d r22 = this.f12619b.f12601u;
                if (r22 != null) {
                    h.b(r22.c(new a.b(j10, (DefaultConstructorMarker) null)));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((A) obj, ((C2421g) obj2).v());
                return C6514M.f71813a;
            }
        }

        /* renamed from: androidx.compose.foundation.gestures.b$b$c */
        static final class c extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f12620a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(b bVar) {
                super(0);
                this.f12620a = bVar;
            }

            public final void invoke() {
                Wg.d r22 = this.f12620a.f12601u;
                if (r22 != null) {
                    h.b(r22.c(a.C0235a.f12592a));
                }
            }
        }

        /* renamed from: androidx.compose.foundation.gestures.b$b$d */
        static final class d extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ E0.d f12621a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f12622b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(E0.d dVar, b bVar) {
                super(1);
                this.f12621a = dVar;
                this.f12622b = bVar;
            }

            public final void a(A a10) {
                E0.e.c(this.f12621a, a10);
                float f10 = ((v1) C1243i.a(this.f12622b, C1644k0.r())).f();
                long b10 = this.f12621a.b(z.a(f10, f10));
                this.f12621a.e();
                Wg.d r22 = this.f12622b.f12601u;
                if (r22 != null) {
                    h.b(r22.c(new a.d(z.l.l(b10), (DefaultConstructorMarker) null)));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((A) obj);
                return C6514M.f71813a;
            }
        }

        /* renamed from: androidx.compose.foundation.gestures.b$b$e */
        static final class e extends C6498u implements yf.q {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f12623a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ E0.d f12624b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(b bVar, E0.d dVar) {
                super(3);
                this.f12623a = bVar;
                this.f12624b = dVar;
            }

            public final void a(A a10, A a11, long j10) {
                if (((Boolean) this.f12623a.B2().invoke(a10)).booleanValue()) {
                    if (!this.f12623a.f12603w) {
                        if (this.f12623a.f12601u == null) {
                            this.f12623a.f12601u = g.b(a.e.API_PRIORITY_OTHER, (Wg.a) null, (C6798l) null, 6, (Object) null);
                        }
                        this.f12623a.K2();
                    }
                    E0.e.c(this.f12624b, a10);
                    long q10 = C2421g.q(a11.h(), j10);
                    Wg.d r22 = this.f12623a.f12601u;
                    if (r22 != null) {
                        h.b(r22.c(new a.c(q10, (DefaultConstructorMarker) null)));
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((A) obj, (A) obj2, ((C2421g) obj3).v());
                return C6514M.f71813a;
            }
        }

        /* renamed from: androidx.compose.foundation.gestures.b$b$f */
        static final class f extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f12625a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(b bVar) {
                super(0);
                this.f12625a = bVar;
            }

            /* renamed from: a */
            public final Boolean invoke() {
                return Boolean.valueOf(!this.f12625a.J2());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0236b(b bVar, C6658d dVar) {
            super(2, dVar);
            this.f12608c = bVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            C0236b bVar = new C0236b(this.f12608c, dVar);
            bVar.f12607b = obj;
            return bVar;
        }

        public final Object invoke(J j10, C6658d dVar) {
            return ((C0236b) create(j10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12606a;
            if (i10 == 0) {
                w.b(obj);
                E0.d dVar = new E0.d();
                e eVar = new e(this.f12608c, dVar);
                d dVar2 = new d(dVar, this.f12608c);
                c cVar = new c(this.f12608c);
                f fVar = new f(this.f12608c);
                C0237b bVar = new C0237b(dVar, this.f12608c);
                a aVar = new a(this.f12608c, (J) this.f12607b, eVar, dVar2, cVar, fVar, bVar, (C6658d) null);
                this.f12606a = 1;
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

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f12626a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f12627b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f12628c;

        /* renamed from: d  reason: collision with root package name */
        int f12629d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, C6658d dVar) {
            super(dVar);
            this.f12628c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12627b = obj;
            this.f12629d |= Integer.MIN_VALUE;
            return this.f12628c.G2(this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f12630a;

        /* renamed from: b  reason: collision with root package name */
        Object f12631b;

        /* renamed from: c  reason: collision with root package name */
        Object f12632c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f12633d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f12634e;

        /* renamed from: f  reason: collision with root package name */
        int f12635f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, C6658d dVar) {
            super(dVar);
            this.f12634e = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12633d = obj;
            this.f12635f |= Integer.MIN_VALUE;
            return this.f12634e.H2((a.c) null, this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f12636a;

        /* renamed from: b  reason: collision with root package name */
        Object f12637b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f12638c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f12639d;

        /* renamed from: e  reason: collision with root package name */
        int f12640e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, C6658d dVar) {
            super(dVar);
            this.f12639d = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12638c = obj;
            this.f12640e |= Integer.MIN_VALUE;
            return this.f12639d.I2((a.d) null, this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f12641a;

        /* renamed from: b  reason: collision with root package name */
        Object f12642b;

        /* renamed from: c  reason: collision with root package name */
        int f12643c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f12644d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f12645e;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* renamed from: a  reason: collision with root package name */
            Object f12646a;

            /* renamed from: b  reason: collision with root package name */
            int f12647b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f12648c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ N f12649d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ b f12650e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(N n10, b bVar, C6658d dVar) {
                super(2, dVar);
                this.f12649d = n10;
                this.f12650e = bVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f12649d, this.f12650e, dVar);
                aVar.f12648c = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C6798l lVar, C6658d dVar) {
                return ((a) create(lVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = rf.C6680b.f()
                    int r1 = r5.f12647b
                    r2 = 1
                    if (r1 == 0) goto L_0x001f
                    if (r1 != r2) goto L_0x0017
                    java.lang.Object r1 = r5.f12646a
                    kotlin.jvm.internal.N r1 = (kotlin.jvm.internal.N) r1
                    java.lang.Object r3 = r5.f12648c
                    yf.l r3 = (yf.C6798l) r3
                    lf.w.b(r6)
                    goto L_0x0058
                L_0x0017:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L_0x001f:
                    lf.w.b(r6)
                    java.lang.Object r6 = r5.f12648c
                    yf.l r6 = (yf.C6798l) r6
                    r3 = r6
                L_0x0027:
                    kotlin.jvm.internal.N r6 = r5.f12649d
                    java.lang.Object r6 = r6.f71759a
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.a.d
                    if (r1 != 0) goto L_0x005e
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.a.C0235a
                    if (r1 != 0) goto L_0x005e
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.a.b
                    r4 = 0
                    if (r1 == 0) goto L_0x003b
                    androidx.compose.foundation.gestures.a$b r6 = (androidx.compose.foundation.gestures.a.b) r6
                    goto L_0x003c
                L_0x003b:
                    r6 = r4
                L_0x003c:
                    if (r6 == 0) goto L_0x0041
                    r3.invoke(r6)
                L_0x0041:
                    kotlin.jvm.internal.N r1 = r5.f12649d
                    androidx.compose.foundation.gestures.b r6 = r5.f12650e
                    Wg.d r6 = r6.f12601u
                    if (r6 == 0) goto L_0x005b
                    r5.f12648c = r3
                    r5.f12646a = r1
                    r5.f12647b = r2
                    java.lang.Object r6 = r6.l(r5)
                    if (r6 != r0) goto L_0x0058
                    return r0
                L_0x0058:
                    r4 = r6
                    androidx.compose.foundation.gestures.a r4 = (androidx.compose.foundation.gestures.a) r4
                L_0x005b:
                    r1.f71759a = r4
                    goto L_0x0027
                L_0x005e:
                    lf.M r6 = lf.C6514M.f71813a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, C6658d dVar) {
            super(2, dVar);
            this.f12645e = bVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            f fVar = new f(this.f12645e, dVar);
            fVar.f12644d = obj;
            return fVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((f) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:34|35|36|(1:38)|13|39|40|(2:47|(2:49|(1:51)))(2:42|(1:44))) */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d7, code lost:
            r1 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            lf.w.b(r7);
         */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00fc A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00fd  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r6.f12643c
                r2 = 0
                switch(r1) {
                    case 0: goto L_0x0056;
                    case 1: goto L_0x0046;
                    case 2: goto L_0x003a;
                    case 3: goto L_0x0029;
                    case 4: goto L_0x0022;
                    case 5: goto L_0x001a;
                    case 6: goto L_0x0012;
                    default: goto L_0x000a;
                }
            L_0x000a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0012:
                java.lang.Object r1 = r6.f12644d
                Ug.K r1 = (Ug.K) r1
                lf.w.b(r7)
                goto L_0x0027
            L_0x001a:
                java.lang.Object r1 = r6.f12644d
                Ug.K r1 = (Ug.K) r1
            L_0x001e:
                lf.w.b(r7)     // Catch:{ CancellationException -> 0x00ed }
                goto L_0x0027
            L_0x0022:
                java.lang.Object r1 = r6.f12644d
                Ug.K r1 = (Ug.K) r1
                goto L_0x001e
            L_0x0027:
                r4 = r1
                goto L_0x005e
            L_0x0029:
                java.lang.Object r1 = r6.f12641a
                kotlin.jvm.internal.N r1 = (kotlin.jvm.internal.N) r1
                java.lang.Object r3 = r6.f12644d
                Ug.K r3 = (Ug.K) r3
                lf.w.b(r7)     // Catch:{ CancellationException -> 0x0037 }
            L_0x0034:
                r4 = r3
                goto L_0x00ba
            L_0x0037:
                r1 = r3
                goto L_0x00ed
            L_0x003a:
                java.lang.Object r1 = r6.f12641a
                kotlin.jvm.internal.N r1 = (kotlin.jvm.internal.N) r1
                java.lang.Object r3 = r6.f12644d
                Ug.K r3 = (Ug.K) r3
                lf.w.b(r7)
                goto L_0x00a5
            L_0x0046:
                java.lang.Object r1 = r6.f12642b
                kotlin.jvm.internal.N r1 = (kotlin.jvm.internal.N) r1
                java.lang.Object r3 = r6.f12641a
                kotlin.jvm.internal.N r3 = (kotlin.jvm.internal.N) r3
                java.lang.Object r4 = r6.f12644d
                Ug.K r4 = (Ug.K) r4
                lf.w.b(r7)
                goto L_0x0082
            L_0x0056:
                lf.w.b(r7)
                java.lang.Object r7 = r6.f12644d
                Ug.K r7 = (Ug.K) r7
                r4 = r7
            L_0x005e:
                boolean r7 = Ug.L.g(r4)
                if (r7 == 0) goto L_0x00fd
                kotlin.jvm.internal.N r1 = new kotlin.jvm.internal.N
                r1.<init>()
                androidx.compose.foundation.gestures.b r7 = r6.f12645e
                Wg.d r7 = r7.f12601u
                if (r7 == 0) goto L_0x0085
                r6.f12644d = r4
                r6.f12641a = r1
                r6.f12642b = r1
                r3 = 1
                r6.f12643c = r3
                java.lang.Object r7 = r7.l(r6)
                if (r7 != r0) goto L_0x0081
                return r0
            L_0x0081:
                r3 = r1
            L_0x0082:
                androidx.compose.foundation.gestures.a r7 = (androidx.compose.foundation.gestures.a) r7
                goto L_0x0087
            L_0x0085:
                r3 = r1
                r7 = r2
            L_0x0087:
                r1.f71759a = r7
                java.lang.Object r7 = r3.f71759a
                boolean r1 = r7 instanceof androidx.compose.foundation.gestures.a.c
                if (r1 == 0) goto L_0x005e
                androidx.compose.foundation.gestures.b r1 = r6.f12645e
                androidx.compose.foundation.gestures.a$c r7 = (androidx.compose.foundation.gestures.a.c) r7
                r6.f12644d = r4
                r6.f12641a = r3
                r6.f12642b = r2
                r5 = 2
                r6.f12643c = r5
                java.lang.Object r7 = r1.H2(r7, r6)
                if (r7 != r0) goto L_0x00a3
                return r0
            L_0x00a3:
                r1 = r3
                r3 = r4
            L_0x00a5:
                androidx.compose.foundation.gestures.b r7 = r6.f12645e     // Catch:{ CancellationException -> 0x0037 }
                androidx.compose.foundation.gestures.b$f$a r4 = new androidx.compose.foundation.gestures.b$f$a     // Catch:{ CancellationException -> 0x0037 }
                r4.<init>(r1, r7, r2)     // Catch:{ CancellationException -> 0x0037 }
                r6.f12644d = r3     // Catch:{ CancellationException -> 0x0037 }
                r6.f12641a = r1     // Catch:{ CancellationException -> 0x0037 }
                r5 = 3
                r6.f12643c = r5     // Catch:{ CancellationException -> 0x0037 }
                java.lang.Object r7 = r7.A2(r4, r6)     // Catch:{ CancellationException -> 0x0037 }
                if (r7 != r0) goto L_0x0034
                return r0
            L_0x00ba:
                java.lang.Object r7 = r1.f71759a     // Catch:{ CancellationException -> 0x00d7 }
                boolean r1 = r7 instanceof androidx.compose.foundation.gestures.a.d     // Catch:{ CancellationException -> 0x00d7 }
                if (r1 == 0) goto L_0x00d9
                androidx.compose.foundation.gestures.b r1 = r6.f12645e     // Catch:{ CancellationException -> 0x00d7 }
                java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped"
                kotlin.jvm.internal.C6496s.f(r7, r3)     // Catch:{ CancellationException -> 0x00d7 }
                androidx.compose.foundation.gestures.a$d r7 = (androidx.compose.foundation.gestures.a.d) r7     // Catch:{ CancellationException -> 0x00d7 }
                r6.f12644d = r4     // Catch:{ CancellationException -> 0x00d7 }
                r6.f12641a = r2     // Catch:{ CancellationException -> 0x00d7 }
                r3 = 4
                r6.f12643c = r3     // Catch:{ CancellationException -> 0x00d7 }
                java.lang.Object r7 = r1.I2(r7, r6)     // Catch:{ CancellationException -> 0x00d7 }
                if (r7 != r0) goto L_0x005e
                return r0
            L_0x00d7:
                r1 = r4
                goto L_0x00ed
            L_0x00d9:
                boolean r7 = r7 instanceof androidx.compose.foundation.gestures.a.C0235a     // Catch:{ CancellationException -> 0x00d7 }
                if (r7 == 0) goto L_0x005e
                androidx.compose.foundation.gestures.b r7 = r6.f12645e     // Catch:{ CancellationException -> 0x00d7 }
                r6.f12644d = r4     // Catch:{ CancellationException -> 0x00d7 }
                r6.f12641a = r2     // Catch:{ CancellationException -> 0x00d7 }
                r1 = 5
                r6.f12643c = r1     // Catch:{ CancellationException -> 0x00d7 }
                java.lang.Object r7 = r7.G2(r6)     // Catch:{ CancellationException -> 0x00d7 }
                if (r7 != r0) goto L_0x005e
                return r0
            L_0x00ed:
                androidx.compose.foundation.gestures.b r7 = r6.f12645e
                r6.f12644d = r1
                r6.f12641a = r2
                r3 = 6
                r6.f12643c = r3
                java.lang.Object r7 = r7.G2(r6)
                if (r7 != r0) goto L_0x0027
                return r0
            L_0x00fd:
                lf.M r7 = lf.C6514M.f71813a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(C6798l lVar, boolean z10, l lVar2, q qVar) {
        this.f12596p = qVar;
        this.f12597q = lVar;
        this.f12598r = z10;
        this.f12599s = lVar2;
    }

    private final V D2() {
        return T.a(new C0236b(this, (C6658d) null));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object G2(qf.C6658d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.b.c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.foundation.gestures.b$c r0 = (androidx.compose.foundation.gestures.b.c) r0
            int r1 = r0.f12629d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12629d = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.b$c r0 = new androidx.compose.foundation.gestures.b$c
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f12627b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f12629d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f12626a
            androidx.compose.foundation.gestures.b r0 = (androidx.compose.foundation.gestures.b) r0
            lf.w.b(r6)
            goto L_0x0051
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0035:
            lf.w.b(r6)
            B.b r6 = r5.f12602v
            if (r6 == 0) goto L_0x0055
            B.l r2 = r5.f12599s
            if (r2 == 0) goto L_0x0050
            B.a r4 = new B.a
            r4.<init>(r6)
            r0.f12626a = r5
            r0.f12629d = r3
            java.lang.Object r6 = r2.b(r4, r0)
            if (r6 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r0 = r5
        L_0x0051:
            r6 = 0
            r0.f12602v = r6
            goto L_0x0056
        L_0x0055:
            r0 = r5
        L_0x0056:
            c1.y$a r6 = c1.y.f19251b
            long r1 = r6.a()
            r0.F2(r1)
            lf.M r6 = lf.C6514M.f71813a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.G2(qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object H2(androidx.compose.foundation.gestures.a.c r7, qf.C6658d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.b.d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.gestures.b$d r0 = (androidx.compose.foundation.gestures.b.d) r0
            int r1 = r0.f12635f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12635f = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.b$d r0 = new androidx.compose.foundation.gestures.b$d
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f12633d
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f12635f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r7 = r0.f12632c
            B.b r7 = (B.b) r7
            java.lang.Object r1 = r0.f12631b
            androidx.compose.foundation.gestures.a$c r1 = (androidx.compose.foundation.gestures.a.c) r1
            java.lang.Object r0 = r0.f12630a
            androidx.compose.foundation.gestures.b r0 = (androidx.compose.foundation.gestures.b) r0
            lf.w.b(r8)
            goto L_0x0085
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            java.lang.Object r7 = r0.f12631b
            androidx.compose.foundation.gestures.a$c r7 = (androidx.compose.foundation.gestures.a.c) r7
            java.lang.Object r2 = r0.f12630a
            androidx.compose.foundation.gestures.b r2 = (androidx.compose.foundation.gestures.b) r2
            lf.w.b(r8)
            goto L_0x006a
        L_0x004c:
            lf.w.b(r8)
            B.b r8 = r6.f12602v
            if (r8 == 0) goto L_0x0069
            B.l r2 = r6.f12599s
            if (r2 == 0) goto L_0x0069
            B.a r5 = new B.a
            r5.<init>(r8)
            r0.f12630a = r6
            r0.f12631b = r7
            r0.f12635f = r4
            java.lang.Object r8 = r2.b(r5, r0)
            if (r8 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r2 = r6
        L_0x006a:
            B.b r8 = new B.b
            r8.<init>()
            B.l r4 = r2.f12599s
            if (r4 == 0) goto L_0x0088
            r0.f12630a = r2
            r0.f12631b = r7
            r0.f12632c = r8
            r0.f12635f = r3
            java.lang.Object r0 = r4.b(r8, r0)
            if (r0 != r1) goto L_0x0082
            return r1
        L_0x0082:
            r1 = r7
            r7 = r8
            r0 = r2
        L_0x0085:
            r8 = r7
            r2 = r0
            r7 = r1
        L_0x0088:
            r2.f12602v = r8
            long r7 = r7.a()
            r2.E2(r7)
            lf.M r7 = lf.C6514M.f71813a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.H2(androidx.compose.foundation.gestures.a$c, qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object I2(androidx.compose.foundation.gestures.a.d r6, qf.C6658d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.b.e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.foundation.gestures.b$e r0 = (androidx.compose.foundation.gestures.b.e) r0
            int r1 = r0.f12640e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12640e = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.b$e r0 = new androidx.compose.foundation.gestures.b$e
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f12638c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f12640e
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r6 = r0.f12637b
            androidx.compose.foundation.gestures.a$d r6 = (androidx.compose.foundation.gestures.a.d) r6
            java.lang.Object r0 = r0.f12636a
            androidx.compose.foundation.gestures.b r0 = (androidx.compose.foundation.gestures.b) r0
            lf.w.b(r7)
            goto L_0x0057
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            lf.w.b(r7)
            B.b r7 = r5.f12602v
            if (r7 == 0) goto L_0x005b
            B.l r2 = r5.f12599s
            if (r2 == 0) goto L_0x0056
            B.c r4 = new B.c
            r4.<init>(r7)
            r0.f12636a = r5
            r0.f12637b = r6
            r0.f12640e = r3
            java.lang.Object r7 = r2.b(r4, r0)
            if (r7 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r0 = r5
        L_0x0057:
            r7 = 0
            r0.f12602v = r7
            goto L_0x005c
        L_0x005b:
            r0 = r5
        L_0x005c:
            long r6 = r6.a()
            r0.F2(r6)
            lf.M r6 = lf.C6514M.f71813a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.I2(androidx.compose.foundation.gestures.a$d, qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void K2() {
        this.f12603w = true;
        C5600w0 unused = C5576k.d(L1(), (qf.g) null, (M) null, new f(this, (C6658d) null), 3, (Object) null);
    }

    public abstract Object A2(p pVar, C6658d dVar);

    /* access modifiers changed from: protected */
    public final C6798l B2() {
        return this.f12597q;
    }

    public void C0(C1124o oVar, C1126q qVar, long j10) {
        if (this.f12598r && this.f12604x == null) {
            this.f12604x = (V) l2(D2());
        }
        V v10 = this.f12604x;
        if (v10 != null) {
            v10.C0(oVar, qVar, j10);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean C2() {
        return this.f12598r;
    }

    public abstract void E2(long j10);

    public abstract void F2(long j10);

    public abstract boolean J2();

    public final void L2(C6798l lVar, boolean z10, l lVar2, q qVar, boolean z11) {
        V v10;
        this.f12597q = lVar;
        boolean z12 = true;
        if (this.f12598r != z10) {
            this.f12598r = z10;
            if (!z10) {
                z2();
                V v11 = this.f12604x;
                if (v11 != null) {
                    o2(v11);
                }
                this.f12604x = null;
            }
            z11 = true;
        }
        if (!C6496s.c(this.f12599s, lVar2)) {
            z2();
            this.f12599s = lVar2;
        }
        if (this.f12596p != qVar) {
            this.f12596p = qVar;
        } else {
            z12 = z11;
        }
        if (z12 && (v10 = this.f12604x) != null) {
            v10.P0();
        }
    }

    public void W1() {
        this.f12603w = false;
        z2();
    }

    public void i1() {
        V v10 = this.f12604x;
        if (v10 != null) {
            v10.i1();
        }
    }

    public final void z2() {
        B.b bVar = this.f12602v;
        if (bVar != null) {
            l lVar = this.f12599s;
            if (lVar != null) {
                lVar.a(new B.a(bVar));
            }
            this.f12602v = null;
        }
    }
}

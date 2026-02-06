package P;

import D0.A;
import D0.C1111b;
import D0.C1124o;
import D0.C1125p;
import D0.J;
import D0.O;
import D0.T;
import J.K;
import androidx.compose.ui.platform.v1;
import java.util.List;
import k0.i;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;
import z.j;
import z.o;

public abstract class t {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f4932a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f4933b;

        /* renamed from: c  reason: collision with root package name */
        int f4934c;

        a(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f4933b = obj;
            this.f4934c |= Integer.MIN_VALUE;
            return t.e((C1111b) null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f4935a;

        /* renamed from: b  reason: collision with root package name */
        Object f4936b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f4937c;

        /* renamed from: d  reason: collision with root package name */
        int f4938d;

        b(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f4937c = obj;
            this.f4938d |= Integer.MIN_VALUE;
            return t.h((C1111b) null, (C1292h) null, (C1288d) null, (C1124o) null, this);
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1292h f4939a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C1292h hVar) {
            super(1);
            this.f4939a = hVar;
        }

        public final void a(A a10) {
            if (this.f4939a.d(a10.h())) {
                a10.a();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((A) obj);
            return C6514M.f71813a;
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1292h f4940a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f4941b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C1292h hVar, q qVar) {
            super(1);
            this.f4940a = hVar;
            this.f4941b = qVar;
        }

        public final void a(A a10) {
            if (this.f4940a.a(a10.h(), this.f4941b)) {
                a10.a();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((A) obj);
            return C6514M.f71813a;
        }
    }

    static final class e extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f4942a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f4943b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1292h f4944c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ K f4945d;

        static final class a extends k implements p {

            /* renamed from: b  reason: collision with root package name */
            int f4946b;

            /* renamed from: c  reason: collision with root package name */
            private /* synthetic */ Object f4947c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C1292h f4948d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C1288d f4949e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ K f4950f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C1292h hVar, C1288d dVar, K k10, C6658d dVar2) {
                super(2, dVar2);
                this.f4948d = hVar;
                this.f4949e = dVar;
                this.f4950f = k10;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f4948d, this.f4949e, this.f4950f, dVar);
                aVar.f4947c = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C1111b bVar, C6658d dVar) {
                return ((a) create(bVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: D0.b} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = rf.C6680b.f()
                    int r1 = r9.f4946b
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L_0x0026
                    if (r1 == r4) goto L_0x001e
                    if (r1 == r3) goto L_0x001a
                    if (r1 != r2) goto L_0x0012
                    goto L_0x001a
                L_0x0012:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L_0x001a:
                    lf.w.b(r10)
                    goto L_0x0089
                L_0x001e:
                    java.lang.Object r1 = r9.f4947c
                    D0.b r1 = (D0.C1111b) r1
                    lf.w.b(r10)
                    goto L_0x0039
                L_0x0026:
                    lf.w.b(r10)
                    java.lang.Object r10 = r9.f4947c
                    r1 = r10
                    D0.b r1 = (D0.C1111b) r1
                    r9.f4947c = r1
                    r9.f4946b = r4
                    java.lang.Object r10 = P.t.e(r1, r9)
                    if (r10 != r0) goto L_0x0039
                    return r0
                L_0x0039:
                    D0.o r10 = (D0.C1124o) r10
                    boolean r4 = P.t.g(r10)
                    r5 = 0
                    if (r4 == 0) goto L_0x0076
                    int r4 = r10.b()
                    boolean r4 = D0.C1128t.b(r4)
                    if (r4 == 0) goto L_0x0076
                    java.util.List r4 = r10.c()
                    int r6 = r4.size()
                    r7 = 0
                L_0x0055:
                    if (r7 >= r6) goto L_0x0067
                    java.lang.Object r8 = r4.get(r7)
                    D0.A r8 = (D0.A) r8
                    boolean r8 = r8.p()
                    if (r8 == 0) goto L_0x0064
                    goto L_0x0076
                L_0x0064:
                    int r7 = r7 + 1
                    goto L_0x0055
                L_0x0067:
                    P.h r2 = r9.f4948d
                    P.d r4 = r9.f4949e
                    r9.f4947c = r5
                    r9.f4946b = r3
                    java.lang.Object r10 = P.t.h(r1, r2, r4, r10, r9)
                    if (r10 != r0) goto L_0x0089
                    return r0
                L_0x0076:
                    boolean r3 = P.t.g(r10)
                    if (r3 != 0) goto L_0x0089
                    J.K r3 = r9.f4950f
                    r9.f4947c = r5
                    r9.f4946b = r2
                    java.lang.Object r10 = P.t.j(r1, r3, r10, r9)
                    if (r10 != r0) goto L_0x0089
                    return r0
                L_0x0089:
                    lf.M r10 = lf.C6514M.f71813a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: P.t.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C1292h hVar, K k10, C6658d dVar) {
            super(2, dVar);
            this.f4944c = hVar;
            this.f4945d = k10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            e eVar = new e(this.f4944c, this.f4945d, dVar);
            eVar.f4943b = obj;
            return eVar;
        }

        public final Object invoke(J j10, C6658d dVar) {
            return ((e) create(j10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f4942a;
            if (i10 == 0) {
                w.b(obj);
                J j10 = (J) this.f4943b;
                a aVar = new a(this.f4944c, new C1288d(j10.getViewConfiguration()), this.f4945d, (C6658d) null);
                this.f4942a = 1;
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

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f4951a;

        /* renamed from: b  reason: collision with root package name */
        Object f4952b;

        /* renamed from: c  reason: collision with root package name */
        Object f4953c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f4954d;

        /* renamed from: e  reason: collision with root package name */
        int f4955e;

        f(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f4954d = obj;
            this.f4955e |= Integer.MIN_VALUE;
            return t.j((C1111b) null, (K) null, (C1124o) null, this);
        }
    }

    static final class g extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f4956a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(K k10) {
            super(1);
            this.f4956a = k10;
        }

        public final void a(A a10) {
            this.f4956a.d(C1125p.g(a10));
            a10.a();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((A) obj);
            return C6514M.f71813a;
        }
    }

    static final class h extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f4957a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f4958b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6798l f4959c;

        static final class a extends k implements p {

            /* renamed from: b  reason: collision with root package name */
            int f4960b;

            /* renamed from: c  reason: collision with root package name */
            private /* synthetic */ Object f4961c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C6798l f4962d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C6798l lVar, C6658d dVar) {
                super(2, dVar);
                this.f4962d = lVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f4962d, dVar);
                aVar.f4961c = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C1111b bVar, C6658d dVar) {
                return ((a) create(bVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                */
            /* JADX WARNING: Removed duplicated region for block: B:9:0x002f A[RETURN] */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = rf.C6680b.f()
                    int r1 = r4.f4960b
                    r2 = 1
                    if (r1 == 0) goto L_0x001b
                    if (r1 != r2) goto L_0x0013
                    java.lang.Object r1 = r4.f4961c
                    D0.b r1 = (D0.C1111b) r1
                    lf.w.b(r5)
                    goto L_0x0030
                L_0x0013:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L_0x001b:
                    lf.w.b(r5)
                    java.lang.Object r5 = r4.f4961c
                    D0.b r5 = (D0.C1111b) r5
                    r1 = r5
                L_0x0023:
                    D0.q r5 = D0.C1126q.Initial
                    r4.f4961c = r1
                    r4.f4960b = r2
                    java.lang.Object r5 = r1.Z0(r5, r4)
                    if (r5 != r0) goto L_0x0030
                    return r0
                L_0x0030:
                    D0.o r5 = (D0.C1124o) r5
                    yf.l r3 = r4.f4962d
                    boolean r5 = P.t.g(r5)
                    r5 = r5 ^ r2
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r3.invoke(r5)
                    goto L_0x0023
                */
                throw new UnsupportedOperationException("Method not decompiled: P.t.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C6798l lVar, C6658d dVar) {
            super(2, dVar);
            this.f4959c = lVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            h hVar = new h(this.f4959c, dVar);
            hVar.f4958b = obj;
            return hVar;
        }

        public final Object invoke(J j10, C6658d dVar) {
            return ((h) create(j10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f4957a;
            if (i10 == 0) {
                w.b(obj);
                a aVar = new a(this.f4959c, (C6658d) null);
                this.f4957a = 1;
                if (((J) this.f4958b).z0(aVar, this) == f10) {
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

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062 A[SYNTHETIC] */
    public static final java.lang.Object e(D0.C1111b r7, qf.C6658d r8) {
        /*
            boolean r0 = r8 instanceof P.t.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            P.t$a r0 = (P.t.a) r0
            int r1 = r0.f4934c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f4934c = r1
            goto L_0x0018
        L_0x0013:
            P.t$a r0 = new P.t$a
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.f4933b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f4934c
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.f4932a
            D0.b r7 = (D0.C1111b) r7
            lf.w.b(r8)
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            lf.w.b(r8)
        L_0x0038:
            D0.q r8 = D0.C1126q.Main
            r0.f4932a = r7
            r0.f4934c = r3
            java.lang.Object r8 = r7.Z0(r8, r0)
            if (r8 != r1) goto L_0x0045
            return r1
        L_0x0045:
            D0.o r8 = (D0.C1124o) r8
            java.util.List r2 = r8.c()
            int r4 = r2.size()
            r5 = 0
        L_0x0050:
            if (r5 >= r4) goto L_0x0062
            java.lang.Object r6 = r2.get(r5)
            D0.A r6 = (D0.A) r6
            boolean r6 = D0.C1125p.b(r6)
            if (r6 != 0) goto L_0x005f
            goto L_0x0038
        L_0x005f:
            int r5 = r5 + 1
            goto L_0x0050
        L_0x0062:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: P.t.e(D0.b, qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final boolean f(v1 v1Var, A a10, A a11) {
        if (C2421g.k(C2421g.q(a10.h(), a11.h())) < j.h(v1Var, a10.n())) {
            return true;
        }
        return false;
    }

    public static final boolean g(C1124o oVar) {
        List c10 = oVar.c();
        int size = c10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!O.g(((A) c10.get(i10)).n(), O.f1413a.b())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: P.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: P.h} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object h(D0.C1111b r7, P.C1292h r8, P.C1288d r9, D0.C1124o r10, qf.C6658d r11) {
        /*
            boolean r0 = r11 instanceof P.t.b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            P.t$b r0 = (P.t.b) r0
            int r1 = r0.f4938d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f4938d = r1
            goto L_0x0018
        L_0x0013:
            P.t$b r0 = new P.t$b
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.f4937c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f4938d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r5) goto L_0x003f
            if (r2 != r4) goto L_0x0037
            java.lang.Object r7 = r0.f4936b
            r8 = r7
            P.h r8 = (P.C1292h) r8
            java.lang.Object r7 = r0.f4935a
            D0.b r7 = (D0.C1111b) r7
            lf.w.b(r11)
            goto L_0x00ea
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003f:
            java.lang.Object r7 = r0.f4936b
            r8 = r7
            P.h r8 = (P.C1292h) r8
            java.lang.Object r7 = r0.f4935a
            D0.b r7 = (D0.C1111b) r7
            lf.w.b(r11)
            goto L_0x0082
        L_0x004c:
            lf.w.b(r11)
            r9.d(r10)
            java.util.List r11 = r10.c()
            java.lang.Object r11 = r11.get(r3)
            D0.A r11 = (D0.A) r11
            boolean r10 = P.I.b(r10)
            if (r10 == 0) goto L_0x00ae
            long r9 = r11.h()
            boolean r9 = r8.e(r9)
            if (r9 == 0) goto L_0x0115
            long r9 = r11.f()
            P.t$c r11 = new P.t$c
            r11.<init>(r8)
            r0.f4935a = r7
            r0.f4936b = r8
            r0.f4938d = r5
            java.lang.Object r11 = z.j.f(r7, r9, r11, r0)
            if (r11 != r1) goto L_0x0082
            return r1
        L_0x0082:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r9 = r11.booleanValue()
            if (r9 == 0) goto L_0x00aa
            D0.o r7 = r7.V0()
            java.util.List r7 = r7.c()
            int r9 = r7.size()
        L_0x0096:
            if (r3 >= r9) goto L_0x00aa
            java.lang.Object r10 = r7.get(r3)
            D0.A r10 = (D0.A) r10
            boolean r11 = D0.C1125p.c(r10)
            if (r11 == 0) goto L_0x00a7
            r10.a()
        L_0x00a7:
            int r3 = r3 + 1
            goto L_0x0096
        L_0x00aa:
            r8.b()
            goto L_0x0115
        L_0x00ae:
            int r9 = r9.a()
            if (r9 == r5) goto L_0x00c4
            if (r9 == r4) goto L_0x00bd
            P.q$a r9 = P.q.f4914a
            P.q r9 = r9.m()
            goto L_0x00ca
        L_0x00bd:
            P.q$a r9 = P.q.f4914a
            P.q r9 = r9.n()
            goto L_0x00ca
        L_0x00c4:
            P.q$a r9 = P.q.f4914a
            P.q r9 = r9.l()
        L_0x00ca:
            long r5 = r11.h()
            boolean r10 = r8.c(r5, r9)
            if (r10 == 0) goto L_0x0115
            long r10 = r11.f()
            P.t$d r2 = new P.t$d
            r2.<init>(r8, r9)
            r0.f4935a = r7
            r0.f4936b = r8
            r0.f4938d = r4
            java.lang.Object r11 = z.j.f(r7, r10, r2, r0)
            if (r11 != r1) goto L_0x00ea
            return r1
        L_0x00ea:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r9 = r11.booleanValue()
            if (r9 == 0) goto L_0x0112
            D0.o r7 = r7.V0()
            java.util.List r7 = r7.c()
            int r9 = r7.size()
        L_0x00fe:
            if (r3 >= r9) goto L_0x0112
            java.lang.Object r10 = r7.get(r3)
            D0.A r10 = (D0.A) r10
            boolean r11 = D0.C1125p.c(r10)
            if (r11 == 0) goto L_0x010f
            r10.a()
        L_0x010f:
            int r3 = r3 + 1
            goto L_0x00fe
        L_0x0112:
            r8.b()
        L_0x0115:
            lf.M r7 = lf.C6514M.f71813a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: P.t.h(D0.b, P.h, P.d, D0.o, qf.d):java.lang.Object");
    }

    public static final i i(i iVar, C1292h hVar, K k10) {
        return T.c(iVar, hVar, k10, new e(hVar, k10, (C6658d) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: J.K} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0 A[Catch:{ CancellationException -> 0x0035 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9 A[Catch:{ CancellationException -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ce A[Catch:{ CancellationException -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(D0.C1111b r8, J.K r9, D0.C1124o r10, qf.C6658d r11) {
        /*
            boolean r0 = r11 instanceof P.t.f
            if (r0 == 0) goto L_0x0013
            r0 = r11
            P.t$f r0 = (P.t.f) r0
            int r1 = r0.f4955e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f4955e = r1
            goto L_0x0018
        L_0x0013:
            P.t$f r0 = new P.t$f
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.f4954d
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f4955e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r8 = r0.f4952b
            r9 = r8
            J.K r9 = (J.K) r9
            java.lang.Object r8 = r0.f4951a
            D0.b r8 = (D0.C1111b) r8
            lf.w.b(r11)     // Catch:{ CancellationException -> 0x0035 }
            goto L_0x00a1
        L_0x0035:
            r8 = move-exception
            goto L_0x00d4
        L_0x0038:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0040:
            java.lang.Object r8 = r0.f4953c
            D0.A r8 = (D0.A) r8
            java.lang.Object r9 = r0.f4952b
            J.K r9 = (J.K) r9
            java.lang.Object r10 = r0.f4951a
            D0.b r10 = (D0.C1111b) r10
            lf.w.b(r11)     // Catch:{ CancellationException -> 0x0035 }
            r7 = r10
            r10 = r8
            r8 = r7
            goto L_0x0073
        L_0x0053:
            lf.w.b(r11)
            java.util.List r10 = r10.c()     // Catch:{ CancellationException -> 0x0035 }
            java.lang.Object r10 = mf.C6565s.o0(r10)     // Catch:{ CancellationException -> 0x0035 }
            D0.A r10 = (D0.A) r10     // Catch:{ CancellationException -> 0x0035 }
            long r5 = r10.f()     // Catch:{ CancellationException -> 0x0035 }
            r0.f4951a = r8     // Catch:{ CancellationException -> 0x0035 }
            r0.f4952b = r9     // Catch:{ CancellationException -> 0x0035 }
            r0.f4953c = r10     // Catch:{ CancellationException -> 0x0035 }
            r0.f4955e = r4     // Catch:{ CancellationException -> 0x0035 }
            java.lang.Object r11 = z.j.c(r8, r5, r0)     // Catch:{ CancellationException -> 0x0035 }
            if (r11 != r1) goto L_0x0073
            return r1
        L_0x0073:
            D0.A r11 = (D0.A) r11     // Catch:{ CancellationException -> 0x0035 }
            if (r11 == 0) goto L_0x00d1
            androidx.compose.ui.platform.v1 r2 = r8.getViewConfiguration()     // Catch:{ CancellationException -> 0x0035 }
            boolean r10 = f(r2, r10, r11)     // Catch:{ CancellationException -> 0x0035 }
            if (r10 == 0) goto L_0x00d1
            long r4 = r11.h()     // Catch:{ CancellationException -> 0x0035 }
            r9.b(r4)     // Catch:{ CancellationException -> 0x0035 }
            long r10 = r11.f()     // Catch:{ CancellationException -> 0x0035 }
            P.t$g r2 = new P.t$g     // Catch:{ CancellationException -> 0x0035 }
            r2.<init>(r9)     // Catch:{ CancellationException -> 0x0035 }
            r0.f4951a = r8     // Catch:{ CancellationException -> 0x0035 }
            r0.f4952b = r9     // Catch:{ CancellationException -> 0x0035 }
            r4 = 0
            r0.f4953c = r4     // Catch:{ CancellationException -> 0x0035 }
            r0.f4955e = r3     // Catch:{ CancellationException -> 0x0035 }
            java.lang.Object r11 = z.j.f(r8, r10, r2, r0)     // Catch:{ CancellationException -> 0x0035 }
            if (r11 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ CancellationException -> 0x0035 }
            boolean r10 = r11.booleanValue()     // Catch:{ CancellationException -> 0x0035 }
            if (r10 == 0) goto L_0x00ce
            D0.o r8 = r8.V0()     // Catch:{ CancellationException -> 0x0035 }
            java.util.List r8 = r8.c()     // Catch:{ CancellationException -> 0x0035 }
            int r10 = r8.size()     // Catch:{ CancellationException -> 0x0035 }
            r11 = 0
        L_0x00b6:
            if (r11 >= r10) goto L_0x00ca
            java.lang.Object r0 = r8.get(r11)     // Catch:{ CancellationException -> 0x0035 }
            D0.A r0 = (D0.A) r0     // Catch:{ CancellationException -> 0x0035 }
            boolean r1 = D0.C1125p.c(r0)     // Catch:{ CancellationException -> 0x0035 }
            if (r1 == 0) goto L_0x00c7
            r0.a()     // Catch:{ CancellationException -> 0x0035 }
        L_0x00c7:
            int r11 = r11 + 1
            goto L_0x00b6
        L_0x00ca:
            r9.onStop()     // Catch:{ CancellationException -> 0x0035 }
            goto L_0x00d1
        L_0x00ce:
            r9.onCancel()     // Catch:{ CancellationException -> 0x0035 }
        L_0x00d1:
            lf.M r8 = lf.C6514M.f71813a
            return r8
        L_0x00d4:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: P.t.j(D0.b, J.K, D0.o, qf.d):java.lang.Object");
    }

    public static final i k(i iVar, C6798l lVar) {
        return T.d(iVar, 8675309, new h(lVar, (C6658d) null));
    }
}

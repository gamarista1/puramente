package z;

import D0.A;
import D0.C1111b;
import D0.C1124o;
import D0.J;
import D0.O;
import D0.z;
import androidx.compose.ui.platform.v1;
import java.util.List;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.N;
import lf.C6514M;
import q0.C2421g;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private static final float f28975a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f28976b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f28977c;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f28978a;

        /* renamed from: b  reason: collision with root package name */
        Object f28979b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f28980c;

        /* renamed from: d  reason: collision with root package name */
        int f28981d;

        a(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f28980c = obj;
            this.f28981d |= Integer.MIN_VALUE;
            return j.b((C1111b) null, 0, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f28982a;

        /* renamed from: b  reason: collision with root package name */
        Object f28983b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f28984c;

        /* renamed from: d  reason: collision with root package name */
        int f28985d;

        b(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f28984c = obj;
            this.f28985d |= Integer.MIN_VALUE;
            return j.c((C1111b) null, 0, this);
        }
    }

    static final class c extends k implements p {

        /* renamed from: b  reason: collision with root package name */
        Object f28986b;

        /* renamed from: c  reason: collision with root package name */
        int f28987c;

        /* renamed from: d  reason: collision with root package name */
        int f28988d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f28989e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ N f28990f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ N f28991g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(N n10, N n11, C6658d dVar) {
            super(2, dVar);
            this.f28990f = n10;
            this.f28991g = n11;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            c cVar = new c(this.f28990f, this.f28991g, dVar);
            cVar.f28989e = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(C1111b bVar, C6658d dVar) {
            return ((c) create(bVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00dd  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x010c  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x006f A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x009b A[EDGE_INSN: B:63:0x009b->B:27:0x009b ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x00cd A[EDGE_INSN: B:65:0x00cd->B:37:0x00cd ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f28988d
                r3 = 2
                r4 = 0
                r6 = 1
                if (r2 == 0) goto L_0x0036
                if (r2 == r6) goto L_0x002a
                if (r2 != r3) goto L_0x0022
                int r2 = r0.f28987c
                java.lang.Object r7 = r0.f28986b
                D0.o r7 = (D0.C1124o) r7
                java.lang.Object r8 = r0.f28989e
                D0.b r8 = (D0.C1111b) r8
                lf.w.b(r17)
                r4 = r17
                goto L_0x00af
            L_0x0022:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x002a:
                int r2 = r0.f28987c
                java.lang.Object r7 = r0.f28989e
                D0.b r7 = (D0.C1111b) r7
                lf.w.b(r17)
                r8 = r17
                goto L_0x0052
            L_0x0036:
                lf.w.b(r17)
                java.lang.Object r2 = r0.f28989e
                D0.b r2 = (D0.C1111b) r2
                r7 = r2
                r2 = 0
            L_0x003f:
                if (r2 != 0) goto L_0x0145
                D0.q r8 = D0.C1126q.Main
                r0.f28989e = r7
                r0.f28986b = r4
                r0.f28987c = r2
                r0.f28988d = r6
                java.lang.Object r8 = r7.Z0(r8, r0)
                if (r8 != r1) goto L_0x0052
                return r1
            L_0x0052:
                D0.o r8 = (D0.C1124o) r8
                java.util.List r9 = r8.c()
                int r10 = r9.size()
                r11 = 0
            L_0x005d:
                if (r11 >= r10) goto L_0x006f
                java.lang.Object r12 = r9.get(r11)
                D0.A r12 = (D0.A) r12
                boolean r12 = D0.C1125p.d(r12)
                if (r12 != 0) goto L_0x006c
                goto L_0x0070
            L_0x006c:
                int r11 = r11 + 1
                goto L_0x005d
            L_0x006f:
                r2 = r6
            L_0x0070:
                java.util.List r9 = r8.c()
                int r10 = r9.size()
                r11 = 0
            L_0x0079:
                if (r11 >= r10) goto L_0x009b
                java.lang.Object r12 = r9.get(r11)
                D0.A r12 = (D0.A) r12
                boolean r13 = r12.p()
                if (r13 != 0) goto L_0x009a
                long r13 = r7.b()
                long r4 = r7.w0()
                boolean r4 = D0.C1125p.f(r12, r13, r4)
                if (r4 == 0) goto L_0x0096
                goto L_0x009a
            L_0x0096:
                int r11 = r11 + 1
                r4 = 0
                goto L_0x0079
            L_0x009a:
                r2 = r6
            L_0x009b:
                D0.q r4 = D0.C1126q.Final
                r0.f28989e = r7
                r0.f28986b = r8
                r0.f28987c = r2
                r0.f28988d = r3
                java.lang.Object r4 = r7.Z0(r4, r0)
                if (r4 != r1) goto L_0x00ac
                return r1
            L_0x00ac:
                r15 = r8
                r8 = r7
                r7 = r15
            L_0x00af:
                D0.o r4 = (D0.C1124o) r4
                java.util.List r4 = r4.c()
                int r5 = r4.size()
                r9 = 0
            L_0x00ba:
                if (r9 >= r5) goto L_0x00cd
                java.lang.Object r10 = r4.get(r9)
                D0.A r10 = (D0.A) r10
                boolean r10 = r10.p()
                if (r10 == 0) goto L_0x00ca
                r2 = r6
                goto L_0x00cd
            L_0x00ca:
                int r9 = r9 + 1
                goto L_0x00ba
            L_0x00cd:
                kotlin.jvm.internal.N r4 = r0.f28990f
                java.lang.Object r4 = r4.f71759a
                D0.A r4 = (D0.A) r4
                long r4 = r4.f()
                boolean r4 = z.j.g(r7, r4)
                if (r4 == 0) goto L_0x010c
                java.util.List r4 = r7.c()
                int r5 = r4.size()
                r7 = 0
            L_0x00e6:
                if (r7 >= r5) goto L_0x00f9
                java.lang.Object r9 = r4.get(r7)
                r10 = r9
                D0.A r10 = (D0.A) r10
                boolean r10 = r10.i()
                if (r10 == 0) goto L_0x00f6
                goto L_0x00fa
            L_0x00f6:
                int r7 = r7 + 1
                goto L_0x00e6
            L_0x00f9:
                r9 = 0
            L_0x00fa:
                D0.A r9 = (D0.A) r9
                if (r9 == 0) goto L_0x0107
                kotlin.jvm.internal.N r4 = r0.f28990f
                r4.f71759a = r9
                kotlin.jvm.internal.N r4 = r0.f28991g
                r4.f71759a = r9
                goto L_0x0140
            L_0x0107:
                r2 = r6
                r7 = r8
                r4 = 0
                goto L_0x003f
            L_0x010c:
                kotlin.jvm.internal.N r4 = r0.f28991g
                java.util.List r5 = r7.c()
                kotlin.jvm.internal.N r7 = r0.f28990f
                int r9 = r5.size()
                r10 = 0
            L_0x0119:
                if (r10 >= r9) goto L_0x013d
                java.lang.Object r11 = r5.get(r10)
                r12 = r11
                D0.A r12 = (D0.A) r12
                long r12 = r12.f()
                java.lang.Object r14 = r7.f71759a
                D0.A r14 = (D0.A) r14
                r17 = r7
                long r6 = r14.f()
                boolean r6 = D0.z.d(r12, r6)
                if (r6 == 0) goto L_0x0137
                goto L_0x013e
            L_0x0137:
                int r10 = r10 + 1
                r7 = r17
                r6 = 1
                goto L_0x0119
            L_0x013d:
                r11 = 0
            L_0x013e:
                r4.f71759a = r11
            L_0x0140:
                r7 = r8
                r4 = 0
                r6 = 1
                goto L_0x003f
            L_0x0145:
                lf.M r1 = lf.C6514M.f71813a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: z.j.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class d extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f28992a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C6798l lVar) {
            super(3);
            this.f28992a = lVar;
        }

        public final void a(A a10, A a11, long j10) {
            this.f28992a.invoke(C2421g.d(a11.h()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((A) obj, (A) obj2, ((C2421g) obj3).v());
            return C6514M.f71813a;
        }
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f28993a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C6787a aVar) {
            super(1);
            this.f28993a = aVar;
        }

        public final void a(A a10) {
            this.f28993a.invoke();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((A) obj);
            return C6514M.f71813a;
        }
    }

    static final class f extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final f f28994a = new f();

        f() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static final class g extends k implements p {

        /* renamed from: b  reason: collision with root package name */
        Object f28995b;

        /* renamed from: c  reason: collision with root package name */
        Object f28996c;

        /* renamed from: d  reason: collision with root package name */
        Object f28997d;

        /* renamed from: e  reason: collision with root package name */
        Object f28998e;

        /* renamed from: f  reason: collision with root package name */
        Object f28999f;

        /* renamed from: g  reason: collision with root package name */
        Object f29000g;

        /* renamed from: h  reason: collision with root package name */
        boolean f29001h;

        /* renamed from: i  reason: collision with root package name */
        float f29002i;

        /* renamed from: j  reason: collision with root package name */
        int f29003j;

        /* renamed from: k  reason: collision with root package name */
        private /* synthetic */ Object f29004k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C6787a f29005l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ M f29006m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ q f29007n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ q f29008o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ p f29009p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ C6787a f29010q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ C6798l f29011r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C6787a aVar, M m10, q qVar, q qVar2, p pVar, C6787a aVar2, C6798l lVar, C6658d dVar) {
            super(2, dVar);
            this.f29005l = aVar;
            this.f29006m = m10;
            this.f29007n = qVar;
            this.f29008o = qVar2;
            this.f29009p = pVar;
            this.f29010q = aVar2;
            this.f29011r = lVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            g gVar = new g(this.f29005l, this.f29006m, this.f29007n, this.f29008o, this.f29009p, this.f29010q, this.f29011r, dVar);
            gVar.f29004k = obj;
            return gVar;
        }

        /* renamed from: i */
        public final Object invoke(C1111b bVar, C6658d dVar) {
            return ((g) create(bVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: D0.A} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: D0.A} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: D0.q} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: D0.A} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: D0.A} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: D0.A} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: D0.q} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: D0.A} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: D0.A} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: D0.q} */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x0316  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x031e  */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x0326  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x017e A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x02a6 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0120  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0123  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0151 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x015f  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x019a  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x01c5  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x027c A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x028a  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x02ab  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x02ad  */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r6 = r22
                java.lang.Object r7 = rf.C6680b.f()
                int r0 = r6.f29003j
                r8 = 5
                r9 = 4
                r10 = 3
                r1 = 2
                r11 = 0
                r12 = 1
                r13 = 0
                if (r0 == 0) goto L_0x00b7
                if (r0 == r12) goto L_0x00ac
                if (r0 == r1) goto L_0x009a
                if (r0 == r10) goto L_0x006f
                if (r0 == r9) goto L_0x0040
                if (r0 != r8) goto L_0x0038
                java.lang.Object r0 = r6.f28998e
                kotlin.jvm.internal.M r0 = (kotlin.jvm.internal.M) r0
                java.lang.Object r1 = r6.f28997d
                D0.b r1 = (D0.C1111b) r1
                java.lang.Object r2 = r6.f28996c
                z.q r2 = (z.q) r2
                java.lang.Object r3 = r6.f28995b
                yf.p r3 = (yf.p) r3
                java.lang.Object r4 = r6.f29004k
                D0.b r4 = (D0.C1111b) r4
                lf.w.b(r23)
                r10 = r23
                r9 = r12
                r5 = r13
                goto L_0x027d
            L_0x0038:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0040:
                float r0 = r6.f29002i
                java.lang.Object r1 = r6.f29000g
                D0.A r1 = (D0.A) r1
                java.lang.Object r2 = r6.f28999f
                z.E r2 = (z.C2941E) r2
                java.lang.Object r3 = r6.f28998e
                kotlin.jvm.internal.M r3 = (kotlin.jvm.internal.M) r3
                java.lang.Object r4 = r6.f28997d
                kotlin.jvm.internal.M r4 = (kotlin.jvm.internal.M) r4
                java.lang.Object r5 = r6.f28996c
                D0.b r5 = (D0.C1111b) r5
                java.lang.Object r14 = r6.f28995b
                D0.A r14 = (D0.A) r14
                java.lang.Object r15 = r6.f29004k
                D0.b r15 = (D0.C1111b) r15
                lf.w.b(r23)
                r20 = r2
                r2 = r0
                r0 = r14
                r14 = r4
                r4 = r20
                r21 = r15
                r15 = r3
                r3 = r21
                goto L_0x020b
            L_0x006f:
                float r0 = r6.f29002i
                java.lang.Object r1 = r6.f28999f
                z.E r1 = (z.C2941E) r1
                java.lang.Object r2 = r6.f28998e
                kotlin.jvm.internal.M r2 = (kotlin.jvm.internal.M) r2
                java.lang.Object r3 = r6.f28997d
                kotlin.jvm.internal.M r3 = (kotlin.jvm.internal.M) r3
                java.lang.Object r4 = r6.f28996c
                D0.b r4 = (D0.C1111b) r4
                java.lang.Object r5 = r6.f28995b
                D0.A r5 = (D0.A) r5
                java.lang.Object r14 = r6.f29004k
                D0.b r14 = (D0.C1111b) r14
                lf.w.b(r23)
                r15 = r2
                r2 = r4
                r4 = r1
                r1 = r0
                r0 = r5
                r5 = r23
                r20 = r14
                r14 = r3
                r3 = r20
                goto L_0x0152
            L_0x009a:
                boolean r0 = r6.f29001h
                java.lang.Object r1 = r6.f28995b
                D0.A r1 = (D0.A) r1
                java.lang.Object r2 = r6.f29004k
                D0.b r2 = (D0.C1111b) r2
                lf.w.b(r23)
                r17 = r0
                r0 = r23
                goto L_0x00fc
            L_0x00ac:
                java.lang.Object r0 = r6.f29004k
                D0.b r0 = (D0.C1111b) r0
                lf.w.b(r23)
                r2 = r23
            L_0x00b5:
                r14 = r0
                goto L_0x00cb
            L_0x00b7:
                lf.w.b(r23)
                java.lang.Object r0 = r6.f29004k
                D0.b r0 = (D0.C1111b) r0
                D0.q r2 = D0.C1126q.Initial
                r6.f29004k = r0
                r6.f29003j = r12
                java.lang.Object r2 = z.C2938B.d(r0, r11, r2, r6)
                if (r2 != r7) goto L_0x00b5
                return r7
            L_0x00cb:
                r15 = r2
                D0.A r15 = (D0.A) r15
                yf.a r0 = r6.f29005l
                java.lang.Object r0 = r0.invoke()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r5 = r0.booleanValue()
                if (r5 != 0) goto L_0x00df
                r15.a()
            L_0x00df:
                r6.f29004k = r14
                r6.f28995b = r15
                r6.f29001h = r5
                r6.f29003j = r1
                r1 = 0
                r2 = 0
                r4 = 2
                r16 = 0
                r0 = r14
                r3 = r22
                r17 = r5
                r5 = r16
                java.lang.Object r0 = z.C2938B.e(r0, r1, r2, r3, r4, r5)
                if (r0 != r7) goto L_0x00fa
                return r7
            L_0x00fa:
                r2 = r14
                r1 = r15
            L_0x00fc:
                D0.A r0 = (D0.A) r0
                kotlin.jvm.internal.M r3 = r6.f29006m
                q0.g$a r4 = q0.C2421g.f25320b
                long r4 = r4.c()
                r3.f71758a = r4
                if (r17 == 0) goto L_0x0227
            L_0x010a:
                long r3 = r0.f()
                int r1 = r0.n()
                z.q r5 = r6.f29007n
                kotlin.jvm.internal.M r14 = r6.f29006m
                D0.o r15 = r2.V0()
                boolean r15 = z.j.g(r15, r3)
                if (r15 == 0) goto L_0x0123
                r1 = r13
                goto L_0x0213
            L_0x0123:
                androidx.compose.ui.platform.v1 r15 = r2.getViewConfiguration()
                float r1 = z.j.h(r15, r1)
                kotlin.jvm.internal.M r15 = new kotlin.jvm.internal.M
                r15.<init>()
                r15.f71758a = r3
                z.E r3 = new z.E
                r3.<init>(r5)
                r4 = r3
                r3 = r2
            L_0x0139:
                r6.f29004k = r3
                r6.f28995b = r0
                r6.f28996c = r2
                r6.f28997d = r14
                r6.f28998e = r15
                r6.f28999f = r4
                r6.f29000g = r13
                r6.f29002i = r1
                r6.f29003j = r10
                java.lang.Object r5 = D0.C1111b.u0(r2, r13, r6, r12, r13)
                if (r5 != r7) goto L_0x0152
                return r7
            L_0x0152:
                D0.o r5 = (D0.C1124o) r5
                java.util.List r10 = r5.c()
                int r11 = r10.size()
                r12 = 0
            L_0x015d:
                if (r12 >= r11) goto L_0x017e
                java.lang.Object r18 = r10.get(r12)
                r19 = r18
                D0.A r19 = (D0.A) r19
                long r8 = r19.f()
                r23 = r14
                long r13 = r15.f71758a
                boolean r8 = D0.z.d(r8, r13)
                if (r8 == 0) goto L_0x0176
                goto L_0x0182
            L_0x0176:
                int r12 = r12 + 1
                r14 = r23
                r8 = 5
                r9 = 4
                r13 = 0
                goto L_0x015d
            L_0x017e:
                r23 = r14
                r18 = 0
            L_0x0182:
                r8 = r18
                D0.A r8 = (D0.A) r8
                if (r8 != 0) goto L_0x018d
            L_0x0188:
                r2 = r3
                r1 = 0
            L_0x018a:
                r9 = 4
                goto L_0x0213
            L_0x018d:
                boolean r9 = r8.p()
                if (r9 == 0) goto L_0x0194
                goto L_0x0188
            L_0x0194:
                boolean r9 = D0.C1125p.d(r8)
                if (r9 == 0) goto L_0x01c5
                java.util.List r5 = r5.c()
                int r8 = r5.size()
                r9 = 0
            L_0x01a3:
                if (r9 >= r8) goto L_0x01b6
                java.lang.Object r10 = r5.get(r9)
                r11 = r10
                D0.A r11 = (D0.A) r11
                boolean r11 = r11.i()
                if (r11 == 0) goto L_0x01b3
                goto L_0x01b7
            L_0x01b3:
                int r9 = r9 + 1
                goto L_0x01a3
            L_0x01b6:
                r10 = 0
            L_0x01b7:
                D0.A r10 = (D0.A) r10
                if (r10 != 0) goto L_0x01bc
                goto L_0x0188
            L_0x01bc:
                long r8 = r10.f()
                r15.f71758a = r8
                r14 = r23
                goto L_0x01e2
            L_0x01c5:
                q0.g r5 = r4.a(r8, r1)
                if (r5 == 0) goto L_0x01ea
                long r9 = r5.v()
                r8.a()
                r14 = r23
                r14.f71758a = r9
                boolean r5 = r8.p()
                if (r5 == 0) goto L_0x01df
                r2 = r3
                r1 = r8
                goto L_0x018a
            L_0x01df:
                r4.e()
            L_0x01e2:
                r8 = 5
                r9 = 4
            L_0x01e4:
                r10 = 3
                r11 = 0
                r12 = 1
                r13 = 0
                goto L_0x0139
            L_0x01ea:
                r14 = r23
                D0.q r5 = D0.C1126q.Final
                r6.f29004k = r3
                r6.f28995b = r0
                r6.f28996c = r2
                r6.f28997d = r14
                r6.f28998e = r15
                r6.f28999f = r4
                r6.f29000g = r8
                r6.f29002i = r1
                r9 = 4
                r6.f29003j = r9
                java.lang.Object r5 = r2.Z0(r5, r6)
                if (r5 != r7) goto L_0x0208
                return r7
            L_0x0208:
                r5 = r2
                r2 = r1
                r1 = r8
            L_0x020b:
                boolean r1 = r1.p()
                if (r1 == 0) goto L_0x0223
                r2 = r3
                r1 = 0
            L_0x0213:
                if (r1 == 0) goto L_0x0227
                boolean r3 = r1.p()
                if (r3 == 0) goto L_0x021c
                goto L_0x0227
            L_0x021c:
                r8 = 5
                r10 = 3
                r11 = 0
                r12 = 1
                r13 = 0
                goto L_0x010a
            L_0x0223:
                r1 = r2
                r2 = r5
                r8 = 5
                goto L_0x01e4
            L_0x0227:
                if (r1 == 0) goto L_0x0345
                yf.q r3 = r6.f29008o
                kotlin.jvm.internal.M r4 = r6.f29006m
                long r4 = r4.f71758a
                q0.g r4 = q0.C2421g.d(r4)
                r3.invoke(r0, r1, r4)
                yf.p r0 = r6.f29009p
                kotlin.jvm.internal.M r3 = r6.f29006m
                long r3 = r3.f71758a
                q0.g r3 = q0.C2421g.d(r3)
                r0.invoke(r1, r3)
                long r0 = r1.f()
                yf.p r3 = r6.f29009p
                z.q r4 = r6.f29007n
                D0.o r5 = r2.V0()
                boolean r5 = z.j.g(r5, r0)
                if (r5 == 0) goto L_0x0258
            L_0x0255:
                r13 = 0
                goto L_0x0314
            L_0x0258:
                kotlin.jvm.internal.M r5 = new kotlin.jvm.internal.M
                r5.<init>()
                r5.f71758a = r0
                r1 = r2
                r0 = r5
                r2 = r4
                r4 = r1
            L_0x0263:
                r6.f29004k = r4
                r6.f28995b = r3
                r6.f28996c = r2
                r6.f28997d = r1
                r6.f28998e = r0
                r5 = 0
                r6.f28999f = r5
                r6.f29000g = r5
                r8 = 5
                r6.f29003j = r8
                r9 = 1
                java.lang.Object r10 = D0.C1111b.u0(r1, r5, r6, r9, r5)
                if (r10 != r7) goto L_0x027d
                return r7
            L_0x027d:
                D0.o r10 = (D0.C1124o) r10
                java.util.List r11 = r10.c()
                int r12 = r11.size()
                r13 = 0
            L_0x0288:
                if (r13 >= r12) goto L_0x02a6
                java.lang.Object r14 = r11.get(r13)
                r15 = r14
                D0.A r15 = (D0.A) r15
                long r8 = r15.f()
                long r5 = r0.f71758a
                boolean r5 = D0.z.d(r8, r5)
                if (r5 == 0) goto L_0x029e
                goto L_0x02a7
            L_0x029e:
                int r13 = r13 + 1
                r5 = 0
                r8 = 5
                r9 = 1
                r6 = r22
                goto L_0x0288
            L_0x02a6:
                r14 = 0
            L_0x02a7:
                D0.A r14 = (D0.A) r14
                if (r14 != 0) goto L_0x02ad
                r14 = 0
                goto L_0x0301
            L_0x02ad:
                boolean r5 = D0.C1125p.d(r14)
                if (r5 == 0) goto L_0x02df
                java.util.List r5 = r10.c()
                int r6 = r5.size()
                r8 = 0
            L_0x02bc:
                if (r8 >= r6) goto L_0x02cf
                java.lang.Object r9 = r5.get(r8)
                r10 = r9
                D0.A r10 = (D0.A) r10
                boolean r10 = r10.i()
                if (r10 == 0) goto L_0x02cc
                goto L_0x02d0
            L_0x02cc:
                int r8 = r8 + 1
                goto L_0x02bc
            L_0x02cf:
                r9 = 0
            L_0x02d0:
                D0.A r9 = (D0.A) r9
                if (r9 != 0) goto L_0x02d5
                goto L_0x0301
            L_0x02d5:
                long r5 = r9.f()
                r0.f71758a = r5
            L_0x02db:
                r5 = r22
                goto L_0x0342
            L_0x02df:
                long r5 = D0.C1125p.h(r14)
                if (r2 != 0) goto L_0x02ea
                float r5 = q0.C2421g.k(r5)
                goto L_0x02f7
            L_0x02ea:
                z.q r8 = z.q.Vertical
                if (r2 != r8) goto L_0x02f3
                float r5 = q0.C2421g.n(r5)
                goto L_0x02f7
            L_0x02f3:
                float r5 = q0.C2421g.m(r5)
            L_0x02f7:
                r6 = 0
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 != 0) goto L_0x02fe
                r5 = 1
                goto L_0x02ff
            L_0x02fe:
                r5 = 0
            L_0x02ff:
                if (r5 != 0) goto L_0x02db
            L_0x0301:
                if (r14 != 0) goto L_0x0305
                goto L_0x0255
            L_0x0305:
                boolean r0 = r14.p()
                if (r0 == 0) goto L_0x030d
                goto L_0x0255
            L_0x030d:
                boolean r0 = D0.C1125p.d(r14)
                if (r0 == 0) goto L_0x0326
                r13 = r14
            L_0x0314:
                if (r13 != 0) goto L_0x031e
                r5 = r22
                yf.a r0 = r5.f29010q
                r0.invoke()
                goto L_0x0346
            L_0x031e:
                r5 = r22
                yf.l r0 = r5.f29011r
                r0.invoke(r13)
                goto L_0x0346
            L_0x0326:
                r5 = r22
                long r0 = D0.C1125p.g(r14)
                q0.g r0 = q0.C2421g.d(r0)
                r3.invoke(r14, r0)
                r14.a()
                long r0 = r14.f()
                r6 = r5
                r20 = r4
                r4 = r2
                r2 = r20
                goto L_0x0258
            L_0x0342:
                r6 = r5
                goto L_0x0263
            L_0x0345:
                r5 = r6
            L_0x0346:
                lf.M r0 = lf.C6514M.f71813a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: z.j.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f29012a;

        /* renamed from: b  reason: collision with root package name */
        Object f29013b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f29014c;

        /* renamed from: d  reason: collision with root package name */
        int f29015d;

        h(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f29014c = obj;
            this.f29015d |= Integer.MIN_VALUE;
            return j.f((C1111b) null, 0, (C6798l) null, this);
        }
    }

    static {
        float j10 = c1.h.j((float) 0.125d);
        f28975a = j10;
        float j11 = c1.h.j((float) 18);
        f28976b = j11;
        f28977c = j10 / j11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ca, code lost:
        if (D0.C1125p.j(r11) != false) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(D0.C1111b r17, long r18, qf.C6658d r20) {
        /*
            r0 = r18
            r2 = r20
            boolean r3 = r2 instanceof z.j.a
            if (r3 == 0) goto L_0x0017
            r3 = r2
            z.j$a r3 = (z.j.a) r3
            int r4 = r3.f28981d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.f28981d = r4
            goto L_0x001c
        L_0x0017:
            z.j$a r3 = new z.j$a
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.f28980c
            java.lang.Object r4 = rf.C6680b.f()
            int r5 = r3.f28981d
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0043
            if (r5 != r6) goto L_0x003b
            java.lang.Object r0 = r3.f28979b
            kotlin.jvm.internal.M r0 = (kotlin.jvm.internal.M) r0
            java.lang.Object r1 = r3.f28978a
            D0.b r1 = (D0.C1111b) r1
            lf.w.b(r2)
            r16 = r1
            r1 = r0
            r0 = r16
            goto L_0x006c
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            lf.w.b(r2)
            D0.o r2 = r17.V0()
            boolean r2 = g(r2, r0)
            if (r2 == 0) goto L_0x0051
            return r7
        L_0x0051:
            kotlin.jvm.internal.M r2 = new kotlin.jvm.internal.M
            r2.<init>()
            r2.f71758a = r0
            r0 = r17
        L_0x005a:
            r3.f28978a = r0
            r3.f28979b = r2
            r3.f28981d = r6
            java.lang.Object r1 = D0.C1111b.u0(r0, r7, r3, r6, r7)
            if (r1 != r4) goto L_0x0067
            return r4
        L_0x0067:
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x006c:
            D0.o r2 = (D0.C1124o) r2
            java.util.List r5 = r2.c()
            int r8 = r5.size()
            r9 = 0
            r10 = r9
        L_0x0078:
            if (r10 >= r8) goto L_0x0091
            java.lang.Object r11 = r5.get(r10)
            r12 = r11
            D0.A r12 = (D0.A) r12
            long r12 = r12.f()
            long r14 = r1.f71758a
            boolean r12 = D0.z.d(r12, r14)
            if (r12 == 0) goto L_0x008e
            goto L_0x0092
        L_0x008e:
            int r10 = r10 + 1
            goto L_0x0078
        L_0x0091:
            r11 = r7
        L_0x0092:
            D0.A r11 = (D0.A) r11
            if (r11 != 0) goto L_0x0098
            r11 = r7
            goto L_0x00cc
        L_0x0098:
            boolean r5 = D0.C1125p.d(r11)
            if (r5 == 0) goto L_0x00c6
            java.util.List r2 = r2.c()
            int r5 = r2.size()
        L_0x00a6:
            if (r9 >= r5) goto L_0x00b9
            java.lang.Object r8 = r2.get(r9)
            r10 = r8
            D0.A r10 = (D0.A) r10
            boolean r10 = r10.i()
            if (r10 == 0) goto L_0x00b6
            goto L_0x00ba
        L_0x00b6:
            int r9 = r9 + 1
            goto L_0x00a6
        L_0x00b9:
            r8 = r7
        L_0x00ba:
            D0.A r8 = (D0.A) r8
            if (r8 != 0) goto L_0x00bf
            goto L_0x00cc
        L_0x00bf:
            long r8 = r8.f()
            r1.f71758a = r8
            goto L_0x00d6
        L_0x00c6:
            boolean r2 = D0.C1125p.j(r11)
            if (r2 == 0) goto L_0x00d6
        L_0x00cc:
            if (r11 == 0) goto L_0x00d5
            boolean r0 = r11.p()
            if (r0 != 0) goto L_0x00d5
            r7 = r11
        L_0x00d5:
            return r7
        L_0x00d6:
            r2 = r1
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: z.j.b(D0.b, long, qf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(D0.C1111b r9, long r10, qf.C6658d r12) {
        /*
            boolean r0 = r12 instanceof z.j.b
            if (r0 == 0) goto L_0x0013
            r0 = r12
            z.j$b r0 = (z.j.b) r0
            int r1 = r0.f28985d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f28985d = r1
            goto L_0x0018
        L_0x0013:
            z.j$b r0 = new z.j$b
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.f28984c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f28985d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r9 = r0.f28983b
            kotlin.jvm.internal.N r9 = (kotlin.jvm.internal.N) r9
            java.lang.Object r10 = r0.f28982a
            D0.A r10 = (D0.A) r10
            lf.w.b(r12)     // Catch:{ r -> 0x009b }
            goto L_0x00a4
        L_0x0033:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003b:
            lf.w.b(r12)
            D0.o r12 = r9.V0()
            boolean r12 = g(r12, r10)
            if (r12 == 0) goto L_0x0049
            return r4
        L_0x0049:
            D0.o r12 = r9.V0()
            java.util.List r12 = r12.c()
            int r2 = r12.size()
            r5 = 0
        L_0x0056:
            if (r5 >= r2) goto L_0x006d
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            D0.A r7 = (D0.A) r7
            long r7 = r7.f()
            boolean r7 = D0.z.d(r7, r10)
            if (r7 == 0) goto L_0x006a
            goto L_0x006e
        L_0x006a:
            int r5 = r5 + 1
            goto L_0x0056
        L_0x006d:
            r6 = r4
        L_0x006e:
            r10 = r6
            D0.A r10 = (D0.A) r10
            if (r10 != 0) goto L_0x0074
            return r4
        L_0x0074:
            kotlin.jvm.internal.N r11 = new kotlin.jvm.internal.N
            r11.<init>()
            kotlin.jvm.internal.N r12 = new kotlin.jvm.internal.N
            r12.<init>()
            r12.f71759a = r10
            androidx.compose.ui.platform.v1 r2 = r9.getViewConfiguration()
            long r5 = r2.c()
            z.j$c r2 = new z.j$c     // Catch:{ r -> 0x009a }
            r2.<init>(r12, r11, r4)     // Catch:{ r -> 0x009a }
            r0.f28982a = r10     // Catch:{ r -> 0x009a }
            r0.f28983b = r11     // Catch:{ r -> 0x009a }
            r0.f28985d = r3     // Catch:{ r -> 0x009a }
            java.lang.Object r9 = r9.a0(r5, r2, r0)     // Catch:{ r -> 0x009a }
            if (r9 != r1) goto L_0x00a4
            return r1
        L_0x009a:
            r9 = r11
        L_0x009b:
            java.lang.Object r9 = r9.f71759a
            D0.A r9 = (D0.A) r9
            if (r9 != 0) goto L_0x00a3
            r4 = r10
            goto L_0x00a4
        L_0x00a3:
            r4 = r9
        L_0x00a4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z.j.c(D0.b, long, qf.d):java.lang.Object");
    }

    public static final Object d(J j10, C6798l lVar, C6787a aVar, C6787a aVar2, p pVar, C6658d dVar) {
        Object e10 = e(j10, new d(lVar), new e(aVar), aVar2, f.f28994a, (q) null, pVar, dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    public static final Object e(J j10, q qVar, C6798l lVar, C6787a aVar, C6787a aVar2, q qVar2, p pVar, C6658d dVar) {
        J j11 = j10;
        Object c10 = o.c(j10, new g(aVar2, new M(), qVar2, qVar, pVar, aVar, lVar, (C6658d) null), dVar);
        if (c10 == C6680b.f()) {
            return c10;
        }
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object f(D0.C1111b r4, long r5, yf.C6798l r7, qf.C6658d r8) {
        /*
            boolean r0 = r8 instanceof z.j.h
            if (r0 == 0) goto L_0x0013
            r0 = r8
            z.j$h r0 = (z.j.h) r0
            int r1 = r0.f29015d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f29015d = r1
            goto L_0x0018
        L_0x0013:
            z.j$h r0 = new z.j$h
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.f29014c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f29015d
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.f29013b
            yf.l r4 = (yf.C6798l) r4
            java.lang.Object r5 = r0.f29012a
            D0.b r5 = (D0.C1111b) r5
            lf.w.b(r8)
            r7 = r4
            r4 = r5
            goto L_0x004b
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            lf.w.b(r8)
        L_0x003e:
            r0.f29012a = r4
            r0.f29013b = r7
            r0.f29015d = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L_0x004b
            return r1
        L_0x004b:
            D0.A r8 = (D0.A) r8
            if (r8 != 0) goto L_0x0055
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r4
        L_0x0055:
            boolean r5 = D0.C1125p.d(r8)
            if (r5 == 0) goto L_0x0060
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r4
        L_0x0060:
            r7.invoke(r8)
            long r5 = r8.f()
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: z.j.f(D0.b, long, yf.l, qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final boolean g(C1124o oVar, long j10) {
        Object obj;
        List c10 = oVar.c();
        int size = c10.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = c10.get(i10);
            if (z.d(((A) obj).f(), j10)) {
                break;
            }
            i10++;
        }
        A a10 = (A) obj;
        if (a10 != null && a10.i()) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float h(v1 v1Var, int i10) {
        if (O.g(i10, O.f1413a.b())) {
            return v1Var.g() * f28977c;
        }
        return v1Var.g();
    }
}

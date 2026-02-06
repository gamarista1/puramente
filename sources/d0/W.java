package D0;

import J0.C1245k;
import Ug.C5582n;
import Ug.C5584o;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import a0.C1538b;
import androidx.compose.ui.platform.v1;
import c1.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k0.i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.v;
import lf.w;
import q0.C2427m;
import q0.C2428n;
import qf.C6658d;
import qf.f;
import qf.g;
import qf.h;
import rf.C6680b;
import yf.C6798l;
import yf.p;

public final class W extends i.c implements V, J, c1.d {

    /* renamed from: n  reason: collision with root package name */
    private Object f1422n;

    /* renamed from: o  reason: collision with root package name */
    private Object f1423o;

    /* renamed from: p  reason: collision with root package name */
    private Object[] f1424p;

    /* renamed from: q  reason: collision with root package name */
    private p f1425q;

    /* renamed from: r  reason: collision with root package name */
    private C5600w0 f1426r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public C1124o f1427s = T.f1420a;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final C1538b f1428t = new C1538b(new a[16], 0);

    /* renamed from: u  reason: collision with root package name */
    private final C1538b f1429u = new C1538b(new a[16], 0);

    /* renamed from: v  reason: collision with root package name */
    private C1124o f1430v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public long f1431w = r.f19235b.a();

    private final class a implements C1111b, c1.d, C6658d {

        /* renamed from: a  reason: collision with root package name */
        private final C6658d f1432a;

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ W f1433b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public C5582n f1434c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public C1126q f1435d = C1126q.Main;

        /* renamed from: e  reason: collision with root package name */
        private final g f1436e = h.f72645a;

        /* renamed from: D0.W$a$a  reason: collision with other inner class name */
        static final class C0018a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f1438a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f1439b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f1440c;

            /* renamed from: d  reason: collision with root package name */
            int f1441d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0018a(a aVar, C6658d dVar) {
                super(dVar);
                this.f1440c = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f1439b = obj;
                this.f1441d |= Integer.MIN_VALUE;
                return this.f1440c.a0(0, (p) null, this);
            }
        }

        static final class b extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f1442a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f1443b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f1444c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(long j10, a aVar, C6658d dVar) {
                super(2, dVar);
                this.f1443b = j10;
                this.f1444c = aVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new b(this.f1443b, this.f1444c, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = rf.C6680b.f()
                    int r1 = r8.f1442a
                    r2 = 1
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L_0x0020
                    if (r1 == r5) goto L_0x001c
                    if (r1 != r4) goto L_0x0014
                    lf.w.b(r9)
                    goto L_0x0038
                L_0x0014:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L_0x001c:
                    lf.w.b(r9)
                    goto L_0x002f
                L_0x0020:
                    lf.w.b(r9)
                    long r6 = r8.f1443b
                    long r6 = r6 - r2
                    r8.f1442a = r5
                    java.lang.Object r9 = Ug.V.a(r6, r8)
                    if (r9 != r0) goto L_0x002f
                    return r0
                L_0x002f:
                    r8.f1442a = r4
                    java.lang.Object r9 = Ug.V.a(r2, r8)
                    if (r9 != r0) goto L_0x0038
                    return r0
                L_0x0038:
                    D0.W$a r9 = r8.f1444c
                    Ug.n r9 = r9.f1434c
                    if (r9 == 0) goto L_0x0054
                    lf.v$a r0 = lf.v.f71841b
                    D0.r r0 = new D0.r
                    long r1 = r8.f1443b
                    r0.<init>(r1)
                    java.lang.Object r0 = lf.w.a(r0)
                    java.lang.Object r0 = lf.v.b(r0)
                    r9.resumeWith(r0)
                L_0x0054:
                    lf.M r9 = lf.C6514M.f71813a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: D0.W.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        static final class c extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f1445a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f1446b;

            /* renamed from: c  reason: collision with root package name */
            int f1447c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(a aVar, C6658d dVar) {
                super(dVar);
                this.f1446b = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f1445a = obj;
                this.f1447c |= Integer.MIN_VALUE;
                return this.f1446b.y0(0, (p) null, this);
            }
        }

        public a(C6658d dVar) {
            this.f1432a = dVar;
            this.f1433b = W.this;
        }

        public long B1(long j10) {
            return this.f1433b.B1(j10);
        }

        public float E(int i10) {
            return this.f1433b.E(i10);
        }

        public int E0(float f10) {
            return this.f1433b.E0(f10);
        }

        public float N0(long j10) {
            return this.f1433b.N0(j10);
        }

        public long P(float f10) {
            return this.f1433b.P(f10);
        }

        public long Q(long j10) {
            return this.f1433b.Q(j10);
        }

        public final void T(Throwable th2) {
            C5582n nVar = this.f1434c;
            if (nVar != null) {
                nVar.B(th2);
            }
            this.f1434c = null;
        }

        public float V(long j10) {
            return this.f1433b.V(j10);
        }

        public C1124o V0() {
            return W.this.f1427s;
        }

        public final void W(C1124o oVar, C1126q qVar) {
            C5582n nVar;
            if (qVar == this.f1435d && (nVar = this.f1434c) != null) {
                this.f1434c = null;
                nVar.resumeWith(v.b(oVar));
            }
        }

        public Object Z0(C1126q qVar, C6658d dVar) {
            C5584o oVar = new C5584o(C6680b.c(dVar), 1);
            oVar.E();
            this.f1435d = qVar;
            this.f1434c = oVar;
            Object v10 = oVar.v();
            if (v10 == C6680b.f()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return v10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a0(long r11, yf.p r13, qf.C6658d r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof D0.W.a.C0018a
                if (r0 == 0) goto L_0x0013
                r0 = r14
                D0.W$a$a r0 = (D0.W.a.C0018a) r0
                int r1 = r0.f1441d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f1441d = r1
                goto L_0x0018
            L_0x0013:
                D0.W$a$a r0 = new D0.W$a$a
                r0.<init>(r10, r14)
            L_0x0018:
                java.lang.Object r14 = r0.f1439b
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f1441d
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r11 = r0.f1438a
                Ug.w0 r11 = (Ug.C5600w0) r11
                lf.w.b(r14)     // Catch:{ all -> 0x002d }
                goto L_0x0075
            L_0x002d:
                r12 = move-exception
                goto L_0x007b
            L_0x002f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L_0x0037:
                lf.w.b(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L_0x0056
                Ug.n r14 = r10.f1434c
                if (r14 == 0) goto L_0x0056
                lf.v$a r2 = lf.v.f71841b
                D0.r r2 = new D0.r
                r2.<init>(r11)
                java.lang.Object r2 = lf.w.a(r2)
                java.lang.Object r2 = lf.v.b(r2)
                r14.resumeWith(r2)
            L_0x0056:
                D0.W r14 = D0.W.this
                Ug.K r4 = r14.L1()
                D0.W$a$b r7 = new D0.W$a$b
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                Ug.w0 r11 = Ug.C5576k.d(r4, r5, r6, r7, r8, r9)
                r0.f1438a = r11     // Catch:{ all -> 0x002d }
                r0.f1441d = r3     // Catch:{ all -> 0x002d }
                java.lang.Object r14 = r13.invoke(r10, r0)     // Catch:{ all -> 0x002d }
                if (r14 != r1) goto L_0x0075
                return r1
            L_0x0075:
                D0.c r12 = D0.C1112c.f1453a
                r11.n(r12)
                return r14
            L_0x007b:
                D0.c r13 = D0.C1112c.f1453a
                r11.n(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: D0.W.a.a0(long, yf.p, qf.d):java.lang.Object");
        }

        public long b() {
            return W.this.f1431w;
        }

        public long f0(int i10) {
            return this.f1433b.f0(i10);
        }

        public long g0(float f10) {
            return this.f1433b.g0(f10);
        }

        public g getContext() {
            return this.f1436e;
        }

        public float getDensity() {
            return this.f1433b.getDensity();
        }

        public v1 getViewConfiguration() {
            return W.this.getViewConfiguration();
        }

        public float m1(float f10) {
            return this.f1433b.m1(f10);
        }

        public float r1() {
            return this.f1433b.r1();
        }

        public void resumeWith(Object obj) {
            C1538b n22 = W.this.f1428t;
            W w10 = W.this;
            synchronized (n22) {
                w10.f1428t.w(this);
                C6514M m10 = C6514M.f71813a;
            }
            this.f1432a.resumeWith(obj);
        }

        public float t1(float f10) {
            return this.f1433b.t1(f10);
        }

        public long w0() {
            return W.this.w0();
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object y0(long r5, yf.p r7, qf.C6658d r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof D0.W.a.c
                if (r0 == 0) goto L_0x0013
                r0 = r8
                D0.W$a$c r0 = (D0.W.a.c) r0
                int r1 = r0.f1447c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f1447c = r1
                goto L_0x0018
            L_0x0013:
                D0.W$a$c r0 = new D0.W$a$c
                r0.<init>(r4, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f1445a
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f1447c
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                lf.w.b(r8)     // Catch:{ r -> 0x003d }
                goto L_0x003e
            L_0x0029:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0031:
                lf.w.b(r8)
                r0.f1447c = r3     // Catch:{ r -> 0x003d }
                java.lang.Object r8 = r4.a0(r5, r7, r0)     // Catch:{ r -> 0x003d }
                if (r8 != r1) goto L_0x003e
                return r1
            L_0x003d:
                r8 = 0
            L_0x003e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: D0.W.a.y0(long, yf.p, qf.d):java.lang.Object");
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1448a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                D0.q[] r0 = D0.C1126q.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                D0.q r1 = D0.C1126q.Initial     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                D0.q r1 = D0.C1126q.Final     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                D0.q r1 = D0.C1126q.Main     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f1448a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D0.W.b.<clinit>():void");
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f1449a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.f1449a = aVar;
        }

        public final void a(Throwable th2) {
            this.f1449a.T(th2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    static final class d extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f1450a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ W f1451b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(W w10, C6658d dVar) {
            super(2, dVar);
            this.f1451b = w10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new d(this.f1451b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((d) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f1450a;
            if (i10 == 0) {
                w.b(obj);
                p p22 = this.f1451b.p2();
                W w10 = this.f1451b;
                this.f1450a = 1;
                if (p22.invoke(w10, this) == f10) {
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

    public W(Object obj, Object obj2, Object[] objArr, p pVar) {
        this.f1422n = obj;
        this.f1423o = obj2;
        this.f1424p = objArr;
        this.f1425q = pVar;
    }

    private final void o2(C1124o oVar, C1126q qVar) {
        synchronized (this.f1428t) {
            C1538b bVar = this.f1429u;
            bVar.d(bVar.q(), this.f1428t);
        }
        try {
            int i10 = b.f1448a[qVar.ordinal()];
            if (i10 == 1 || i10 == 2) {
                C1538b bVar2 = this.f1429u;
                int q10 = bVar2.q();
                if (q10 > 0) {
                    Object[] p10 = bVar2.p();
                    int i11 = 0;
                    do {
                        ((a) p10[i11]).W(oVar, qVar);
                        i11++;
                    } while (i11 < q10);
                }
            } else if (i10 == 3) {
                C1538b bVar3 = this.f1429u;
                int q11 = bVar3.q();
                if (q11 > 0) {
                    int i12 = q11 - 1;
                    Object[] p11 = bVar3.p();
                    do {
                        ((a) p11[i12]).W(oVar, qVar);
                        i12--;
                    } while (i12 >= 0);
                }
            }
        } finally {
            this.f1429u.i();
        }
    }

    public void C0(C1124o oVar, C1126q qVar, long j10) {
        this.f1431w = j10;
        if (qVar == C1126q.Initial) {
            this.f1427s = oVar;
        }
        if (this.f1426r == null) {
            this.f1426r = C5576k.d(L1(), (g) null, M.UNDISPATCHED, new d(this, (C6658d) null), 1, (Object) null);
        }
        o2(oVar, qVar);
        List c10 = oVar.c();
        int size = c10.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!C1125p.d((A) c10.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            oVar = null;
        }
        this.f1430v = oVar;
    }

    public void C1() {
        P0();
    }

    public void P0() {
        C5600w0 w0Var = this.f1426r;
        if (w0Var != null) {
            w0Var.n(new I());
            this.f1426r = null;
        }
    }

    public void W1() {
        P0();
        super.W1();
    }

    public long b() {
        return this.f1431w;
    }

    public float getDensity() {
        return C1245k.m(this).K().getDensity();
    }

    public v1 getViewConfiguration() {
        return C1245k.m(this).r0();
    }

    public void i1() {
        C1124o oVar = this.f1430v;
        if (oVar != null) {
            List c10 = oVar.c();
            int size = c10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((A) c10.get(i10)).i()) {
                    List c11 = oVar.c();
                    ArrayList arrayList = new ArrayList(c11.size());
                    int size2 = c11.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        A a10 = (A) c11.get(i11);
                        arrayList.add(new A(a10.f(), a10.o(), a10.h(), false, a10.j(), a10.o(), a10.h(), a10.i(), a10.i(), 0, 0, 1536, (DefaultConstructorMarker) null));
                    }
                    C1124o oVar2 = new C1124o(arrayList);
                    this.f1427s = oVar2;
                    o2(oVar2, C1126q.Initial);
                    o2(oVar2, C1126q.Main);
                    o2(oVar2, C1126q.Final);
                    this.f1430v = null;
                    return;
                }
            }
        }
    }

    public void p1() {
        P0();
    }

    public p p2() {
        return this.f1425q;
    }

    public final void q2(Object obj, Object obj2, Object[] objArr, p pVar) {
        boolean z10 = true;
        boolean z11 = !C6496s.c(this.f1422n, obj);
        this.f1422n = obj;
        if (!C6496s.c(this.f1423o, obj2)) {
            z11 = true;
        }
        this.f1423o = obj2;
        Object[] objArr2 = this.f1424p;
        if (objArr2 != null && objArr == null) {
            z11 = true;
        }
        if (objArr2 == null && objArr != null) {
            z11 = true;
        }
        if (objArr2 == null || objArr == null || Arrays.equals(objArr, objArr2)) {
            z10 = z11;
        }
        this.f1424p = objArr;
        if (z10) {
            P0();
        }
        this.f1425q = pVar;
    }

    public float r1() {
        return C1245k.m(this).K().r1();
    }

    public long w0() {
        long B12 = B1(getViewConfiguration().e());
        long b10 = b();
        return C2428n.a(Math.max(0.0f, C2427m.k(B12) - ((float) r.g(b10))) / 2.0f, Math.max(0.0f, C2427m.i(B12) - ((float) r.f(b10))) / 2.0f);
    }

    public Object z0(p pVar, C6658d dVar) {
        C5584o oVar = new C5584o(C6680b.c(dVar), 1);
        oVar.E();
        a aVar = new a(oVar);
        synchronized (this.f1428t) {
            this.f1428t.b(aVar);
            C6658d a10 = f.a(pVar, aVar, aVar);
            v.a aVar2 = v.f71841b;
            a10.resumeWith(v.b(C6514M.f71813a));
        }
        oVar.s(new c(aVar));
        Object v10 = oVar.v();
        if (v10 == C6680b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return v10;
    }
}

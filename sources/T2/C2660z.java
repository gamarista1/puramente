package t2;

import f2.C1967b;
import f2.H;
import f2.w;
import i2.L;
import t2.C2615C;
import w2.C2820b;

/* renamed from: t2.z  reason: case insensitive filesystem */
public final class C2660z extends l0 {

    /* renamed from: m  reason: collision with root package name */
    private final boolean f26344m;

    /* renamed from: n  reason: collision with root package name */
    private final H.c f26345n;

    /* renamed from: o  reason: collision with root package name */
    private final H.b f26346o;

    /* renamed from: p  reason: collision with root package name */
    private a f26347p;

    /* renamed from: q  reason: collision with root package name */
    private C2659y f26348q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f26349r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f26350s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f26351t;

    /* renamed from: t2.z$a */
    private static final class a extends C2656v {

        /* renamed from: h  reason: collision with root package name */
        public static final Object f26352h = new Object();

        /* renamed from: f  reason: collision with root package name */
        private final Object f26353f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final Object f26354g;

        private a(H h10, Object obj, Object obj2) {
            super(h10);
            this.f26353f = obj;
            this.f26354g = obj2;
        }

        public static a u(w wVar) {
            return new a(new b(wVar), H.c.f19757q, f26352h);
        }

        public static a v(H h10, Object obj, Object obj2) {
            return new a(h10, obj, obj2);
        }

        public int b(Object obj) {
            Object obj2;
            H h10 = this.f26321e;
            if (f26352h.equals(obj) && (obj2 = this.f26354g) != null) {
                obj = obj2;
            }
            return h10.b(obj);
        }

        public H.b g(int i10, H.b bVar, boolean z10) {
            this.f26321e.g(i10, bVar, z10);
            if (L.c(bVar.f19745b, this.f26354g) && z10) {
                bVar.f19745b = f26352h;
            }
            return bVar;
        }

        public Object m(int i10) {
            Object m10 = this.f26321e.m(i10);
            if (L.c(m10, this.f26354g)) {
                return f26352h;
            }
            return m10;
        }

        public H.c o(int i10, H.c cVar, long j10) {
            this.f26321e.o(i10, cVar, j10);
            if (L.c(cVar.f19767a, this.f26353f)) {
                cVar.f19767a = H.c.f19757q;
            }
            return cVar;
        }

        public a t(H h10) {
            return new a(h10, this.f26353f, this.f26354g);
        }
    }

    /* renamed from: t2.z$b */
    public static final class b extends H {

        /* renamed from: e  reason: collision with root package name */
        private final w f26355e;

        public b(w wVar) {
            this.f26355e = wVar;
        }

        public int b(Object obj) {
            if (obj == a.f26352h) {
                return 0;
            }
            return -1;
        }

        public H.b g(int i10, H.b bVar, boolean z10) {
            Integer num;
            Object obj = null;
            if (z10) {
                num = 0;
            } else {
                num = null;
            }
            if (z10) {
                obj = a.f26352h;
            }
            bVar.t(num, obj, 0, -9223372036854775807L, 0, C1967b.f19921g, true);
            return bVar;
        }

        public int i() {
            return 1;
        }

        public Object m(int i10) {
            return a.f26352h;
        }

        public H.c o(int i10, H.c cVar, long j10) {
            H.c cVar2 = cVar;
            cVar.g(H.c.f19757q, this.f26355e, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, (w.g) null, 0, -9223372036854775807L, 0, 0, 0);
            H.c cVar3 = cVar;
            cVar3.f19777k = true;
            return cVar3;
        }

        public int p() {
            return 1;
        }
    }

    public C2660z(C2615C c10, boolean z10) {
        super(c10);
        boolean z11;
        if (!z10 || !c10.d()) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f26344m = z11;
        this.f26345n = new H.c();
        this.f26346o = new H.b();
        H e10 = c10.e();
        if (e10 != null) {
            this.f26347p = a.v(e10, (Object) null, (Object) null);
            this.f26351t = true;
            return;
        }
        this.f26347p = a.u(c10.a());
    }

    private Object T(Object obj) {
        if (this.f26347p.f26354g == null || !this.f26347p.f26354g.equals(obj)) {
            return obj;
        }
        return a.f26352h;
    }

    private Object U(Object obj) {
        if (this.f26347p.f26354g == null || !obj.equals(a.f26352h)) {
            return obj;
        }
        return this.f26347p.f26354g;
    }

    private boolean W(long j10) {
        C2659y yVar = this.f26348q;
        int b10 = this.f26347p.b(yVar.f26335a.f25960a);
        if (b10 == -1) {
            return false;
        }
        long j11 = this.f26347p.f(b10, this.f26346o).f19747d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0, j11 - 1);
        }
        yVar.u(j10);
        return true;
    }

    public void A() {
        this.f26350s = false;
        this.f26349r = false;
        super.A();
    }

    /* access modifiers changed from: protected */
    public C2615C.b J(C2615C.b bVar) {
        return bVar.a(T(bVar.f25960a));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void O(f2.H r15) {
        /*
            r14 = this;
            boolean r0 = r14.f26350s
            if (r0 == 0) goto L_0x0019
            t2.z$a r0 = r14.f26347p
            t2.z$a r15 = r0.t(r15)
            r14.f26347p = r15
            t2.y r15 = r14.f26348q
            if (r15 == 0) goto L_0x00b1
            long r0 = r15.l()
            r14.W(r0)
            goto L_0x00b1
        L_0x0019:
            boolean r0 = r15.q()
            if (r0 == 0) goto L_0x0036
            boolean r0 = r14.f26351t
            if (r0 == 0) goto L_0x002a
            t2.z$a r0 = r14.f26347p
            t2.z$a r15 = r0.t(r15)
            goto L_0x0032
        L_0x002a:
            java.lang.Object r0 = f2.H.c.f19757q
            java.lang.Object r1 = t2.C2660z.a.f26352h
            t2.z$a r15 = t2.C2660z.a.v(r15, r0, r1)
        L_0x0032:
            r14.f26347p = r15
            goto L_0x00b1
        L_0x0036:
            f2.H$c r0 = r14.f26345n
            r1 = 0
            r15.n(r1, r0)
            f2.H$c r0 = r14.f26345n
            long r2 = r0.c()
            f2.H$c r0 = r14.f26345n
            java.lang.Object r0 = r0.f19767a
            t2.y r4 = r14.f26348q
            if (r4 == 0) goto L_0x0074
            long r4 = r4.m()
            t2.z$a r6 = r14.f26347p
            t2.y r7 = r14.f26348q
            t2.C$b r7 = r7.f26335a
            java.lang.Object r7 = r7.f25960a
            f2.H$b r8 = r14.f26346o
            r6.h(r7, r8)
            f2.H$b r6 = r14.f26346o
            long r6 = r6.n()
            long r6 = r6 + r4
            t2.z$a r4 = r14.f26347p
            f2.H$c r5 = r14.f26345n
            f2.H$c r1 = r4.n(r1, r5)
            long r4 = r1.c()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0074
            r12 = r6
            goto L_0x0075
        L_0x0074:
            r12 = r2
        L_0x0075:
            f2.H$c r9 = r14.f26345n
            f2.H$b r10 = r14.f26346o
            r11 = 0
            r8 = r15
            android.util.Pair r1 = r8.j(r9, r10, r11, r12)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r14.f26351t
            if (r1 == 0) goto L_0x0094
            t2.z$a r0 = r14.f26347p
            t2.z$a r15 = r0.t(r15)
            goto L_0x0098
        L_0x0094:
            t2.z$a r15 = t2.C2660z.a.v(r15, r0, r2)
        L_0x0098:
            r14.f26347p = r15
            t2.y r15 = r14.f26348q
            if (r15 == 0) goto L_0x00b1
            boolean r0 = r14.W(r3)
            if (r0 == 0) goto L_0x00b1
            t2.C$b r15 = r15.f26335a
            java.lang.Object r0 = r15.f25960a
            java.lang.Object r0 = r14.U(r0)
            t2.C$b r15 = r15.a(r0)
            goto L_0x00b2
        L_0x00b1:
            r15 = 0
        L_0x00b2:
            r0 = 1
            r14.f26351t = r0
            r14.f26350s = r0
            t2.z$a r0 = r14.f26347p
            r14.z(r0)
            if (r15 == 0) goto L_0x00c9
            t2.y r0 = r14.f26348q
            java.lang.Object r0 = i2.C2076a.e(r0)
            t2.y r0 = (t2.C2659y) r0
            r0.k(r15)
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C2660z.O(f2.H):void");
    }

    public void R() {
        if (!this.f26344m) {
            this.f26349r = true;
            Q();
        }
    }

    /* renamed from: S */
    public C2659y o(C2615C.b bVar, C2820b bVar2, long j10) {
        C2659y yVar = new C2659y(bVar, bVar2, j10);
        yVar.w(this.f26281k);
        if (this.f26350s) {
            yVar.k(bVar.a(U(bVar.f25960a)));
        } else {
            this.f26348q = yVar;
            if (!this.f26349r) {
                this.f26349r = true;
                Q();
            }
        }
        return yVar;
    }

    public H V() {
        return this.f26347p;
    }

    public void j(C2614B b10) {
        ((C2659y) b10).v();
        if (b10 == this.f26348q) {
            this.f26348q = null;
        }
    }

    public void m(w wVar) {
        if (this.f26351t) {
            this.f26347p = this.f26347p.t(new h0(this.f26347p.f26321e, wVar));
        } else {
            this.f26347p = a.u(wVar);
        }
        this.f26281k.m(wVar);
    }

    public void c() {
    }
}

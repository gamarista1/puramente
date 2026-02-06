package N9;

import N9.B;
import N9.C3070t;
import N9.G;
import android.os.Looper;
import ia.A;
import ia.C3604b;
import ia.C3612j;
import ia.J;
import ia.w;
import ja.C3645a;
import k9.C3732y0;
import k9.n1;
import l9.s0;
import o9.C3925l;
import o9.v;
import o9.x;
import q9.C3973h;
import q9.p;

public final class H extends C3052a implements G.b {

    /* renamed from: h  reason: collision with root package name */
    private final C3732y0 f33098h;

    /* renamed from: i  reason: collision with root package name */
    private final C3732y0.h f33099i;

    /* renamed from: j  reason: collision with root package name */
    private final C3612j.a f33100j;

    /* renamed from: k  reason: collision with root package name */
    private final B.a f33101k;

    /* renamed from: l  reason: collision with root package name */
    private final v f33102l;

    /* renamed from: m  reason: collision with root package name */
    private final A f33103m;

    /* renamed from: n  reason: collision with root package name */
    private final int f33104n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f33105o;

    /* renamed from: p  reason: collision with root package name */
    private long f33106p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f33107q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f33108r;

    /* renamed from: s  reason: collision with root package name */
    private J f33109s;

    class a extends C3063l {
        a(H h10, n1 n1Var) {
            super(n1Var);
        }

        public n1.b k(int i10, n1.b bVar, boolean z10) {
            super.k(i10, bVar, z10);
            bVar.f45718f = true;
            return bVar;
        }

        public n1.d s(int i10, n1.d dVar, long j10) {
            super.s(i10, dVar, j10);
            dVar.f45739l = true;
            return dVar;
        }
    }

    public static final class b implements C3070t.a {

        /* renamed from: a  reason: collision with root package name */
        private final C3612j.a f33110a;

        /* renamed from: b  reason: collision with root package name */
        private B.a f33111b;

        /* renamed from: c  reason: collision with root package name */
        private x f33112c;

        /* renamed from: d  reason: collision with root package name */
        private A f33113d;

        /* renamed from: e  reason: collision with root package name */
        private int f33114e;

        /* renamed from: f  reason: collision with root package name */
        private String f33115f;

        /* renamed from: g  reason: collision with root package name */
        private Object f33116g;

        public b(C3612j.a aVar) {
            this(aVar, (p) new C3973h());
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ B c(p pVar, s0 s0Var) {
            return new C3054c(pVar);
        }

        public H b(C3732y0 y0Var) {
            boolean z10;
            C3645a.e(y0Var.f45856b);
            C3732y0.h hVar = y0Var.f45856b;
            boolean z11 = false;
            if (hVar.f45926h != null || this.f33116g == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (hVar.f45923e == null && this.f33115f != null) {
                z11 = true;
            }
            if (z10 && z11) {
                y0Var = y0Var.b().d(this.f33116g).b(this.f33115f).a();
            } else if (z10) {
                y0Var = y0Var.b().d(this.f33116g).a();
            } else if (z11) {
                y0Var = y0Var.b().b(this.f33115f).a();
            }
            C3732y0 y0Var2 = y0Var;
            return new H(y0Var2, this.f33110a, this.f33111b, this.f33112c.a(y0Var2), this.f33113d, this.f33114e, (a) null);
        }

        public b(C3612j.a aVar, p pVar) {
            this(aVar, (B.a) new I(pVar));
        }

        public b(C3612j.a aVar, B.a aVar2) {
            this(aVar, aVar2, new C3925l(), new w(), 1048576);
        }

        public b(C3612j.a aVar, B.a aVar2, x xVar, A a10, int i10) {
            this.f33110a = aVar;
            this.f33111b = aVar2;
            this.f33112c = xVar;
            this.f33113d = a10;
            this.f33114e = i10;
        }
    }

    /* synthetic */ H(C3732y0 y0Var, C3612j.a aVar, B.a aVar2, v vVar, A a10, int i10, a aVar3) {
        this(y0Var, aVar, aVar2, vVar, a10, i10);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [N9.H$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void F() {
        /*
            r9 = this;
            N9.P r8 = new N9.P
            long r1 = r9.f33106p
            boolean r3 = r9.f33107q
            boolean r5 = r9.f33108r
            r6 = 0
            k9.y0 r7 = r9.f33098h
            r4 = 0
            r0 = r8
            r0.<init>(r1, r3, r4, r5, r6, r7)
            boolean r0 = r9.f33105o
            if (r0 == 0) goto L_0x001a
            N9.H$a r0 = new N9.H$a
            r0.<init>(r9, r8)
            r8 = r0
        L_0x001a:
            r9.D(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N9.H.F():void");
    }

    /* access modifiers changed from: protected */
    public void C(J j10) {
        this.f33109s = j10;
        this.f33102l.j();
        this.f33102l.b((Looper) C3645a.e(Looper.myLooper()), A());
        F();
    }

    /* access modifiers changed from: protected */
    public void E() {
        this.f33102l.release();
    }

    public C3732y0 a() {
        return this.f33098h;
    }

    public void b(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f33106p;
        }
        if (this.f33105o || this.f33106p != j10 || this.f33107q != z10 || this.f33108r != z11) {
            this.f33106p = j10;
            this.f33107q = z10;
            this.f33108r = z11;
            this.f33105o = false;
            F();
        }
    }

    public void g(r rVar) {
        ((G) rVar).f0();
    }

    public r i(C3070t.b bVar, C3604b bVar2, long j10) {
        C3612j a10 = this.f33100j.a();
        J j11 = this.f33109s;
        if (j11 != null) {
            a10.n(j11);
        }
        return new G(this.f33099i.f45919a, a10, this.f33101k.a(A()), this.f33102l, s(bVar), this.f33103m, w(bVar), this, bVar2, this.f33099i.f45923e, this.f33104n);
    }

    private H(C3732y0 y0Var, C3612j.a aVar, B.a aVar2, v vVar, A a10, int i10) {
        this.f33099i = (C3732y0.h) C3645a.e(y0Var.f45856b);
        this.f33098h = y0Var;
        this.f33100j = aVar;
        this.f33101k = aVar2;
        this.f33102l = vVar;
        this.f33103m = a10;
        this.f33104n = i10;
        this.f33105o = true;
        this.f33106p = -9223372036854775807L;
    }

    public void c() {
    }
}

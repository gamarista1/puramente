package t2;

import android.os.Looper;
import f2.H;
import f2.w;
import i2.C2076a;
import i2.L;
import k2.f;
import k2.x;
import n2.u1;
import p2.C2408l;
import p2.u;
import t2.C2615C;
import t2.C2626N;
import t2.C2631T;
import w2.C2820b;
import w2.C2826h;
import w2.C2827i;

/* renamed from: t2.U  reason: case insensitive filesystem */
public final class C2632U extends C2635a implements C2631T.c {

    /* renamed from: h  reason: collision with root package name */
    private final f.a f26088h;

    /* renamed from: i  reason: collision with root package name */
    private final C2626N.a f26089i;

    /* renamed from: j  reason: collision with root package name */
    private final u f26090j;

    /* renamed from: k  reason: collision with root package name */
    private final C2827i f26091k;

    /* renamed from: l  reason: collision with root package name */
    private final int f26092l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f26093m;

    /* renamed from: n  reason: collision with root package name */
    private long f26094n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f26095o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f26096p;

    /* renamed from: q  reason: collision with root package name */
    private x f26097q;

    /* renamed from: r  reason: collision with root package name */
    private w f26098r;

    /* renamed from: t2.U$a */
    class a extends C2656v {
        a(H h10) {
            super(h10);
        }

        public H.b g(int i10, H.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f19749f = true;
            return bVar;
        }

        public H.c o(int i10, H.c cVar, long j10) {
            super.o(i10, cVar, j10);
            cVar.f19777k = true;
            return cVar;
        }
    }

    /* renamed from: t2.U$b */
    public static final class b implements C2622J {

        /* renamed from: c  reason: collision with root package name */
        private final f.a f26100c;

        /* renamed from: d  reason: collision with root package name */
        private C2626N.a f26101d;

        /* renamed from: e  reason: collision with root package name */
        private p2.w f26102e;

        /* renamed from: f  reason: collision with root package name */
        private C2827i f26103f;

        /* renamed from: g  reason: collision with root package name */
        private int f26104g;

        public b(f.a aVar, z2.u uVar) {
            this(aVar, (C2626N.a) new C2633V(uVar));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ C2626N h(z2.u uVar, u1 u1Var) {
            return new C2637c(uVar);
        }

        /* renamed from: b */
        public C2632U d(w wVar) {
            C2076a.e(wVar.f20157b);
            return new C2632U(wVar, this.f26100c, this.f26101d, this.f26102e.a(wVar), this.f26103f, this.f26104g, (a) null);
        }

        /* renamed from: i */
        public b e(p2.w wVar) {
            this.f26102e = (p2.w) C2076a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        /* renamed from: j */
        public b f(C2827i iVar) {
            this.f26103f = (C2827i) C2076a.f(iVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(f.a aVar, C2626N.a aVar2) {
            this(aVar, aVar2, new C2408l(), new C2826h(), 1048576);
        }

        public b(f.a aVar, C2626N.a aVar2, p2.w wVar, C2827i iVar, int i10) {
            this.f26100c = aVar;
            this.f26101d = aVar2;
            this.f26102e = wVar;
            this.f26103f = iVar;
            this.f26104g = i10;
        }
    }

    /* synthetic */ C2632U(w wVar, f.a aVar, C2626N.a aVar2, u uVar, C2827i iVar, int i10, a aVar3) {
        this(wVar, aVar, aVar2, uVar, iVar, i10);
    }

    private w.h B() {
        return (w.h) C2076a.e(a().f20157b);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [t2.U$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void C() {
        /*
            r9 = this;
            t2.c0 r8 = new t2.c0
            long r1 = r9.f26094n
            boolean r3 = r9.f26095o
            boolean r5 = r9.f26096p
            r6 = 0
            f2.w r7 = r9.a()
            r4 = 0
            r0 = r8
            r0.<init>(r1, r3, r4, r5, r6, r7)
            boolean r0 = r9.f26093m
            if (r0 == 0) goto L_0x001c
            t2.U$a r0 = new t2.U$a
            r0.<init>(r8)
            r8 = r0
        L_0x001c:
            r9.z(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C2632U.C():void");
    }

    /* access modifiers changed from: protected */
    public void A() {
        this.f26090j.release();
    }

    public synchronized w a() {
        return this.f26098r;
    }

    public void b(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f26094n;
        }
        if (this.f26093m || this.f26094n != j10 || this.f26095o != z10 || this.f26096p != z11) {
            this.f26094n = j10;
            this.f26095o = z10;
            this.f26096p = z11;
            this.f26093m = false;
            C();
        }
    }

    public void j(C2614B b10) {
        ((C2631T) b10).g0();
    }

    public synchronized void m(w wVar) {
        this.f26098r = wVar;
    }

    public C2614B o(C2615C.b bVar, C2820b bVar2, long j10) {
        f a10 = this.f26088h.a();
        x xVar = this.f26097q;
        if (xVar != null) {
            a10.n(xVar);
        }
        w.h B10 = B();
        return new C2631T(B10.f20249a, a10, this.f26089i.a(w()), this.f26090j, r(bVar), this.f26091k, t(bVar), this, bVar2, B10.f20253e, this.f26092l, L.L0(B10.f20257i));
    }

    /* access modifiers changed from: protected */
    public void y(x xVar) {
        this.f26097q = xVar;
        this.f26090j.b((Looper) C2076a.e(Looper.myLooper()), w());
        this.f26090j.j();
        C();
    }

    private C2632U(w wVar, f.a aVar, C2626N.a aVar2, u uVar, C2827i iVar, int i10) {
        this.f26098r = wVar;
        this.f26088h = aVar;
        this.f26089i = aVar2;
        this.f26090j = uVar;
        this.f26091k = iVar;
        this.f26092l = i10;
        this.f26093m = true;
        this.f26094n = -9223372036854775807L;
    }

    public void c() {
    }
}

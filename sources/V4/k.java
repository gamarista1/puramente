package V4;

import T4.f;
import T4.i;
import V4.h;
import V4.p;
import X4.a;
import X4.h;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import o5.g;
import p5.C3931a;
import x1.e;

public class k implements m, h.a, p.a {

    /* renamed from: i  reason: collision with root package name */
    private static final boolean f34543i = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    private final s f34544a;

    /* renamed from: b  reason: collision with root package name */
    private final o f34545b;

    /* renamed from: c  reason: collision with root package name */
    private final h f34546c;

    /* renamed from: d  reason: collision with root package name */
    private final b f34547d;

    /* renamed from: e  reason: collision with root package name */
    private final y f34548e;

    /* renamed from: f  reason: collision with root package name */
    private final c f34549f;

    /* renamed from: g  reason: collision with root package name */
    private final a f34550g;

    /* renamed from: h  reason: collision with root package name */
    private final a f34551h;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final h.e f34552a;

        /* renamed from: b  reason: collision with root package name */
        final e f34553b = C3931a.d(150, new C0562a());

        /* renamed from: c  reason: collision with root package name */
        private int f34554c;

        /* renamed from: V4.k$a$a  reason: collision with other inner class name */
        class C0562a implements C3931a.d {
            C0562a() {
            }

            /* renamed from: a */
            public h create() {
                a aVar = a.this;
                return new h(aVar.f34552a, aVar.f34553b);
            }
        }

        a(h.e eVar) {
            this.f34552a = eVar;
        }

        /* access modifiers changed from: package-private */
        public h a(com.bumptech.glide.e eVar, Object obj, n nVar, f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, j jVar, Map map, boolean z10, boolean z11, boolean z12, i iVar, h.b bVar) {
            h hVar2 = (h) o5.k.d((h) this.f34553b.b());
            int i12 = this.f34554c;
            int i13 = i12;
            this.f34554c = i12 + 1;
            return hVar2.t(eVar, obj, nVar, fVar, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, z12, iVar, bVar, i13);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final Y4.a f34556a;

        /* renamed from: b  reason: collision with root package name */
        final Y4.a f34557b;

        /* renamed from: c  reason: collision with root package name */
        final Y4.a f34558c;

        /* renamed from: d  reason: collision with root package name */
        final Y4.a f34559d;

        /* renamed from: e  reason: collision with root package name */
        final m f34560e;

        /* renamed from: f  reason: collision with root package name */
        final p.a f34561f;

        /* renamed from: g  reason: collision with root package name */
        final e f34562g = C3931a.d(150, new a());

        class a implements C3931a.d {
            a() {
            }

            /* renamed from: a */
            public l create() {
                b bVar = b.this;
                return new l(bVar.f34556a, bVar.f34557b, bVar.f34558c, bVar.f34559d, bVar.f34560e, bVar.f34561f, bVar.f34562g);
            }
        }

        b(Y4.a aVar, Y4.a aVar2, Y4.a aVar3, Y4.a aVar4, m mVar, p.a aVar5) {
            this.f34556a = aVar;
            this.f34557b = aVar2;
            this.f34558c = aVar3;
            this.f34559d = aVar4;
            this.f34560e = mVar;
            this.f34561f = aVar5;
        }

        /* access modifiers changed from: package-private */
        public l a(f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((l) o5.k.d((l) this.f34562g.b())).l(fVar, z10, z11, z12, z13);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            o5.e.c(this.f34556a);
            o5.e.c(this.f34557b);
            o5.e.c(this.f34558c);
            o5.e.c(this.f34559d);
        }
    }

    private static class c implements h.e {

        /* renamed from: a  reason: collision with root package name */
        private final a.C0566a f34564a;

        /* renamed from: b  reason: collision with root package name */
        private volatile X4.a f34565b;

        c(a.C0566a aVar) {
            this.f34564a = aVar;
        }

        public X4.a a() {
            if (this.f34565b == null) {
                synchronized (this) {
                    try {
                        if (this.f34565b == null) {
                            this.f34565b = this.f34564a.f();
                        }
                        if (this.f34565b == null) {
                            this.f34565b = new X4.b();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f34565b;
        }

        /* access modifiers changed from: package-private */
        public synchronized void b() {
            if (this.f34565b != null) {
                this.f34565b.clear();
            }
        }
    }

    public class d {

        /* renamed from: a  reason: collision with root package name */
        private final l f34566a;

        /* renamed from: b  reason: collision with root package name */
        private final com.bumptech.glide.request.i f34567b;

        d(com.bumptech.glide.request.i iVar, l lVar) {
            this.f34567b = iVar;
            this.f34566a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f34566a.r(this.f34567b);
            }
        }
    }

    public k(X4.h hVar, a.C0566a aVar, Y4.a aVar2, Y4.a aVar3, Y4.a aVar4, Y4.a aVar5, boolean z10) {
        this(hVar, aVar, aVar2, aVar3, aVar4, aVar5, (s) null, (o) null, (a) null, (b) null, (a) null, (y) null, z10);
    }

    private p f(f fVar) {
        v d10 = this.f34546c.d(fVar);
        if (d10 == null) {
            return null;
        }
        if (d10 instanceof p) {
            return (p) d10;
        }
        return new p(d10, true, true, fVar, this);
    }

    private p h(f fVar) {
        p e10 = this.f34551h.e(fVar);
        if (e10 != null) {
            e10.b();
        }
        return e10;
    }

    private p i(f fVar) {
        p f10 = f(fVar);
        if (f10 != null) {
            f10.b();
            this.f34551h.a(fVar, f10);
        }
        return f10;
    }

    private p j(n nVar, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        p h10 = h(nVar);
        if (h10 != null) {
            if (f34543i) {
                k("Loaded resource from active resources", j10, nVar);
            }
            return h10;
        }
        p i10 = i(nVar);
        if (i10 == null) {
            return null;
        }
        if (f34543i) {
            k("Loaded resource from cache", j10, nVar);
        }
        return i10;
    }

    private static void k(String str, long j10, f fVar) {
        Log.v("Engine", str + " in " + g.a(j10) + "ms, key: " + fVar);
    }

    private d n(com.bumptech.glide.e eVar, Object obj, f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, j jVar, Map map, boolean z10, boolean z11, i iVar, boolean z12, boolean z13, boolean z14, boolean z15, com.bumptech.glide.request.i iVar2, Executor executor, n nVar, long j10) {
        com.bumptech.glide.request.i iVar3 = iVar2;
        Executor executor2 = executor;
        n nVar2 = nVar;
        long j11 = j10;
        l a10 = this.f34544a.a(nVar2, z15);
        if (a10 != null) {
            a10.e(iVar3, executor2);
            if (f34543i) {
                k("Added to existing load", j11, nVar2);
            }
            return new d(iVar3, a10);
        }
        l a11 = this.f34547d.a(nVar, z12, z13, z14, z15);
        l lVar = a11;
        n nVar3 = nVar2;
        h a12 = this.f34550g.a(eVar, obj, nVar, fVar, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, z15, iVar, a11);
        this.f34544a.c(nVar3, lVar);
        l lVar2 = lVar;
        n nVar4 = nVar3;
        com.bumptech.glide.request.i iVar4 = iVar2;
        lVar2.e(iVar4, executor);
        lVar2.s(a12);
        if (f34543i) {
            k("Started new load", j10, nVar4);
        }
        return new d(iVar4, lVar2);
    }

    public synchronized void a(l lVar, f fVar) {
        this.f34544a.d(fVar, lVar);
    }

    public synchronized void b(l lVar, f fVar, p pVar) {
        if (pVar != null) {
            try {
                if (pVar.d()) {
                    this.f34551h.a(fVar, pVar);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f34544a.d(fVar, lVar);
    }

    public void c(v vVar) {
        this.f34548e.a(vVar, true);
    }

    public void d(f fVar, p pVar) {
        this.f34551h.d(fVar);
        if (pVar.d()) {
            this.f34546c.c(fVar, pVar);
        } else {
            this.f34548e.a(pVar, false);
        }
    }

    public void e() {
        this.f34549f.a().clear();
    }

    public d g(com.bumptech.glide.e eVar, Object obj, f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, j jVar, Map map, boolean z10, boolean z11, i iVar, boolean z12, boolean z13, boolean z14, boolean z15, com.bumptech.glide.request.i iVar2, Executor executor) {
        long b10 = f34543i ? g.b() : 0;
        n a10 = this.f34545b.a(obj, fVar, i10, i11, map, cls, cls2, iVar);
        synchronized (this) {
            try {
                p j10 = j(a10, z12, b10);
                if (j10 == null) {
                    d n10 = n(eVar, obj, fVar, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, iVar, z12, z13, z14, z15, iVar2, executor, a10, b10);
                    return n10;
                }
                iVar2.a(j10, T4.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public void l(v vVar) {
        if (vVar instanceof p) {
            ((p) vVar).e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public void m() {
        this.f34547d.b();
        this.f34549f.b();
        this.f34551h.g();
    }

    k(X4.h hVar, a.C0566a aVar, Y4.a aVar2, Y4.a aVar3, Y4.a aVar4, Y4.a aVar5, s sVar, o oVar, a aVar6, b bVar, a aVar7, y yVar, boolean z10) {
        this.f34546c = hVar;
        a.C0566a aVar8 = aVar;
        c cVar = new c(aVar);
        this.f34549f = cVar;
        a aVar9 = aVar6 == null ? new a(z10) : aVar6;
        this.f34551h = aVar9;
        aVar9.f(this);
        this.f34545b = oVar == null ? new o() : oVar;
        this.f34544a = sVar == null ? new s() : sVar;
        this.f34547d = bVar == null ? new b(aVar2, aVar3, aVar4, aVar5, this, this) : bVar;
        this.f34550g = aVar7 == null ? new a(cVar) : aVar7;
        this.f34548e = yVar == null ? new y() : yVar;
        hVar.e(this);
    }
}

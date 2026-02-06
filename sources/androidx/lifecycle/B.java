package androidx.lifecycle;

import androidx.lifecycle.C1790m;
import java.util.Map;
import o.C2335c;
import p.C2383b;

public abstract class B {

    /* renamed from: k  reason: collision with root package name */
    static final Object f17080k = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Object f17081a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private C2383b f17082b = new C2383b();

    /* renamed from: c  reason: collision with root package name */
    int f17083c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f17084d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f17085e;

    /* renamed from: f  reason: collision with root package name */
    volatile Object f17086f;

    /* renamed from: g  reason: collision with root package name */
    private int f17087g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f17088h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f17089i;

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f17090j;

    class a implements Runnable {
        a() {
        }

        public void run() {
            Object obj;
            synchronized (B.this.f17081a) {
                obj = B.this.f17086f;
                B.this.f17086f = B.f17080k;
            }
            B.this.n(obj);
        }
    }

    private class b extends d {
        b(E e10) {
            super(e10);
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            return true;
        }
    }

    class c extends d implements C1795s {

        /* renamed from: e  reason: collision with root package name */
        final C1798v f17093e;

        c(C1798v vVar, E e10) {
            super(e10);
            this.f17093e = vVar;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f17093e.getLifecycle().d(this);
        }

        /* access modifiers changed from: package-private */
        public boolean c(C1798v vVar) {
            if (this.f17093e == vVar) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            return this.f17093e.getLifecycle().b().b(C1790m.b.STARTED);
        }

        public void f(C1798v vVar, C1790m.a aVar) {
            C1790m.b b10 = this.f17093e.getLifecycle().b();
            if (b10 == C1790m.b.DESTROYED) {
                B.this.m(this.f17095a);
                return;
            }
            C1790m.b bVar = null;
            while (bVar != b10) {
                a(d());
                bVar = b10;
                b10 = this.f17093e.getLifecycle().b();
            }
        }
    }

    private abstract class d {

        /* renamed from: a  reason: collision with root package name */
        final E f17095a;

        /* renamed from: b  reason: collision with root package name */
        boolean f17096b;

        /* renamed from: c  reason: collision with root package name */
        int f17097c = -1;

        d(E e10) {
            this.f17095a = e10;
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z10) {
            int i10;
            if (z10 != this.f17096b) {
                this.f17096b = z10;
                B b10 = B.this;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                b10.c(i10);
                if (this.f17096b) {
                    B.this.e(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
        }

        /* access modifiers changed from: package-private */
        public boolean c(C1798v vVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract boolean d();
    }

    public B() {
        Object obj = f17080k;
        this.f17086f = obj;
        this.f17090j = new a();
        this.f17085e = obj;
        this.f17087g = -1;
    }

    static void b(String str) {
        if (!C2335c.g().b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void d(d dVar) {
        if (dVar.f17096b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f17097c;
            int i11 = this.f17087g;
            if (i10 < i11) {
                dVar.f17097c = i11;
                dVar.f17095a.a(this.f17085e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(int i10) {
        boolean z10;
        boolean z11;
        int i11 = this.f17083c;
        this.f17083c = i10 + i11;
        if (!this.f17084d) {
            this.f17084d = true;
            while (true) {
                try {
                    int i12 = this.f17083c;
                    if (i11 != i12) {
                        if (i11 != 0 || i12 <= 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (i11 <= 0 || i12 != 0) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z10) {
                            j();
                        } else if (z11) {
                            k();
                        }
                        i11 = i12;
                    } else {
                        this.f17084d = false;
                        return;
                    }
                } catch (Throwable th2) {
                    this.f17084d = false;
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(d dVar) {
        if (this.f17088h) {
            this.f17089i = true;
            return;
        }
        this.f17088h = true;
        do {
            this.f17089i = false;
            if (dVar == null) {
                C2383b.d d10 = this.f17082b.d();
                while (d10.hasNext()) {
                    d((d) ((Map.Entry) d10.next()).getValue());
                    if (this.f17089i) {
                        break;
                    }
                }
            } else {
                d(dVar);
                dVar = null;
            }
        } while (this.f17089i);
        this.f17088h = false;
    }

    public Object f() {
        Object obj = this.f17085e;
        if (obj != f17080k) {
            return obj;
        }
        return null;
    }

    public boolean g() {
        if (this.f17083c > 0) {
            return true;
        }
        return false;
    }

    public void h(C1798v vVar, E e10) {
        b("observe");
        if (vVar.getLifecycle().b() != C1790m.b.DESTROYED) {
            c cVar = new c(vVar, e10);
            d dVar = (d) this.f17082b.k(e10, cVar);
            if (dVar != null && !dVar.c(vVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (dVar == null) {
                vVar.getLifecycle().a(cVar);
            }
        }
    }

    public void i(E e10) {
        b("observeForever");
        b bVar = new b(e10);
        d dVar = (d) this.f17082b.k(e10, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (dVar == null) {
            bVar.a(true);
        }
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public void k() {
    }

    /* access modifiers changed from: protected */
    public void l(Object obj) {
        boolean z10;
        synchronized (this.f17081a) {
            if (this.f17086f == f17080k) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f17086f = obj;
        }
        if (z10) {
            C2335c.g().c(this.f17090j);
        }
    }

    public void m(E e10) {
        b("removeObserver");
        d dVar = (d) this.f17082b.m(e10);
        if (dVar != null) {
            dVar.b();
            dVar.a(false);
        }
    }

    /* access modifiers changed from: protected */
    public void n(Object obj) {
        b("setValue");
        this.f17087g++;
        this.f17085e = obj;
        e((d) null);
    }
}

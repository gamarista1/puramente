package V4;

import T4.f;
import V4.h;
import V4.p;
import com.bumptech.glide.request.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o5.k;
import p5.C3931a;
import p5.C3933c;

class l implements h.b, C3931a.f {

    /* renamed from: z  reason: collision with root package name */
    private static final c f34569z = new c();

    /* renamed from: a  reason: collision with root package name */
    final e f34570a;

    /* renamed from: b  reason: collision with root package name */
    private final C3933c f34571b;

    /* renamed from: c  reason: collision with root package name */
    private final p.a f34572c;

    /* renamed from: d  reason: collision with root package name */
    private final x1.e f34573d;

    /* renamed from: e  reason: collision with root package name */
    private final c f34574e;

    /* renamed from: f  reason: collision with root package name */
    private final m f34575f;

    /* renamed from: g  reason: collision with root package name */
    private final Y4.a f34576g;

    /* renamed from: h  reason: collision with root package name */
    private final Y4.a f34577h;

    /* renamed from: i  reason: collision with root package name */
    private final Y4.a f34578i;

    /* renamed from: j  reason: collision with root package name */
    private final Y4.a f34579j;

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f34580k;

    /* renamed from: l  reason: collision with root package name */
    private f f34581l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f34582m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f34583n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f34584o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f34585p;

    /* renamed from: q  reason: collision with root package name */
    private v f34586q;

    /* renamed from: r  reason: collision with root package name */
    T4.a f34587r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f34588s;

    /* renamed from: t  reason: collision with root package name */
    q f34589t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f34590u;

    /* renamed from: v  reason: collision with root package name */
    p f34591v;

    /* renamed from: w  reason: collision with root package name */
    private h f34592w;

    /* renamed from: x  reason: collision with root package name */
    private volatile boolean f34593x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f34594y;

    private class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final i f34595a;

        a(i iVar) {
            this.f34595a = iVar;
        }

        public void run() {
            synchronized (this.f34595a.f()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f34570a.b(this.f34595a)) {
                            l.this.f(this.f34595a);
                        }
                        l.this.i();
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    private class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final i f34597a;

        b(i iVar) {
            this.f34597a = iVar;
        }

        public void run() {
            synchronized (this.f34597a.f()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f34570a.b(this.f34597a)) {
                            l.this.f34591v.b();
                            l.this.g(this.f34597a);
                            l.this.r(this.f34597a);
                        }
                        l.this.i();
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    static class c {
        c() {
        }

        public p a(v vVar, boolean z10, f fVar, p.a aVar) {
            return new p(vVar, z10, true, fVar, aVar);
        }
    }

    static final class d {

        /* renamed from: a  reason: collision with root package name */
        final i f34599a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f34600b;

        d(i iVar, Executor executor) {
            this.f34599a = iVar;
            this.f34600b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f34599a.equals(((d) obj).f34599a);
            }
            return false;
        }

        public int hashCode() {
            return this.f34599a.hashCode();
        }
    }

    static final class e implements Iterable {

        /* renamed from: a  reason: collision with root package name */
        private final List f34601a;

        e() {
            this(new ArrayList(2));
        }

        private static d g(i iVar) {
            return new d(iVar, o5.e.a());
        }

        /* access modifiers changed from: package-private */
        public void a(i iVar, Executor executor) {
            this.f34601a.add(new d(iVar, executor));
        }

        /* access modifiers changed from: package-private */
        public boolean b(i iVar) {
            return this.f34601a.contains(g(iVar));
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            this.f34601a.clear();
        }

        /* access modifiers changed from: package-private */
        public e d() {
            return new e(new ArrayList(this.f34601a));
        }

        /* access modifiers changed from: package-private */
        public void h(i iVar) {
            this.f34601a.remove(g(iVar));
        }

        /* access modifiers changed from: package-private */
        public boolean isEmpty() {
            return this.f34601a.isEmpty();
        }

        public Iterator iterator() {
            return this.f34601a.iterator();
        }

        /* access modifiers changed from: package-private */
        public int size() {
            return this.f34601a.size();
        }

        e(List list) {
            this.f34601a = list;
        }
    }

    l(Y4.a aVar, Y4.a aVar2, Y4.a aVar3, Y4.a aVar4, m mVar, p.a aVar5, x1.e eVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, eVar, f34569z);
    }

    private Y4.a j() {
        if (this.f34583n) {
            return this.f34578i;
        }
        if (this.f34584o) {
            return this.f34579j;
        }
        return this.f34577h;
    }

    private boolean m() {
        if (this.f34590u || this.f34588s || this.f34593x) {
            return true;
        }
        return false;
    }

    private synchronized void q() {
        if (this.f34581l != null) {
            this.f34570a.clear();
            this.f34581l = null;
            this.f34591v = null;
            this.f34586q = null;
            this.f34590u = false;
            this.f34593x = false;
            this.f34588s = false;
            this.f34594y = false;
            this.f34592w.F(false);
            this.f34592w = null;
            this.f34589t = null;
            this.f34587r = null;
            this.f34573d.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void a(v vVar, T4.a aVar, boolean z10) {
        synchronized (this) {
            this.f34586q = vVar;
            this.f34587r = aVar;
            this.f34594y = z10;
        }
        o();
    }

    public C3933c b() {
        return this.f34571b;
    }

    public void c(q qVar) {
        synchronized (this) {
            this.f34589t = qVar;
        }
        n();
    }

    public void d(h hVar) {
        j().execute(hVar);
    }

    /* access modifiers changed from: package-private */
    public synchronized void e(i iVar, Executor executor) {
        try {
            this.f34571b.c();
            this.f34570a.a(iVar, executor);
            if (this.f34588s) {
                k(1);
                executor.execute(new b(iVar));
            } else if (this.f34590u) {
                k(1);
                executor.execute(new a(iVar));
            } else {
                k.a(!this.f34593x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f(i iVar) {
        try {
            iVar.c(this.f34589t);
        } catch (Throwable th2) {
            throw new b(th2);
        }
    }

    /* access modifiers changed from: package-private */
    public void g(i iVar) {
        try {
            iVar.a(this.f34591v, this.f34587r, this.f34594y);
        } catch (Throwable th2) {
            throw new b(th2);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        if (!m()) {
            this.f34593x = true;
            this.f34592w.f();
            this.f34575f.a(this, this.f34581l);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        boolean z10;
        p pVar;
        synchronized (this) {
            try {
                this.f34571b.c();
                k.a(m(), "Not yet complete!");
                int decrementAndGet = this.f34580k.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k.a(z10, "Can't decrement below 0");
                if (decrementAndGet == 0) {
                    pVar = this.f34591v;
                    q();
                } else {
                    pVar = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (pVar != null) {
            pVar.e();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void k(int i10) {
        p pVar;
        k.a(m(), "Not yet complete!");
        if (this.f34580k.getAndAdd(i10) == 0 && (pVar = this.f34591v) != null) {
            pVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized l l(f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f34581l = fVar;
        this.f34582m = z10;
        this.f34583n = z11;
        this.f34584o = z12;
        this.f34585p = z13;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        r4.f34575f.b(r4, r1, (V4.p) null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r0.hasNext() == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        r1 = (V4.l.d) r0.next();
        r1.f34600b.execute(new V4.l.a(r4, r1.f34599a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n() {
        /*
            r4 = this;
            monitor-enter(r4)
            p5.c r0 = r4.f34571b     // Catch:{ all -> 0x000f }
            r0.c()     // Catch:{ all -> 0x000f }
            boolean r0 = r4.f34593x     // Catch:{ all -> 0x000f }
            if (r0 == 0) goto L_0x0011
            r4.q()     // Catch:{ all -> 0x000f }
            monitor-exit(r4)     // Catch:{ all -> 0x000f }
            return
        L_0x000f:
            r0 = move-exception
            goto L_0x0068
        L_0x0011:
            V4.l$e r0 = r4.f34570a     // Catch:{ all -> 0x000f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x000f }
            if (r0 != 0) goto L_0x0060
            boolean r0 = r4.f34590u     // Catch:{ all -> 0x000f }
            if (r0 != 0) goto L_0x0058
            r0 = 1
            r4.f34590u = r0     // Catch:{ all -> 0x000f }
            T4.f r1 = r4.f34581l     // Catch:{ all -> 0x000f }
            V4.l$e r2 = r4.f34570a     // Catch:{ all -> 0x000f }
            V4.l$e r2 = r2.d()     // Catch:{ all -> 0x000f }
            int r3 = r2.size()     // Catch:{ all -> 0x000f }
            int r3 = r3 + r0
            r4.k(r3)     // Catch:{ all -> 0x000f }
            monitor-exit(r4)     // Catch:{ all -> 0x000f }
            V4.m r0 = r4.f34575f
            r3 = 0
            r0.b(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x003b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0054
            java.lang.Object r1 = r0.next()
            V4.l$d r1 = (V4.l.d) r1
            java.util.concurrent.Executor r2 = r1.f34600b
            V4.l$a r3 = new V4.l$a
            com.bumptech.glide.request.i r1 = r1.f34599a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x003b
        L_0x0054:
            r4.i()
            return
        L_0x0058:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x000f }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x000f }
            throw r0     // Catch:{ all -> 0x000f }
        L_0x0060:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x000f }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x000f }
            throw r0     // Catch:{ all -> 0x000f }
        L_0x0068:
            monitor-exit(r4)     // Catch:{ all -> 0x000f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.l.n():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r5.f34575f.b(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r0.hasNext() == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        r1 = (V4.l.d) r0.next();
        r1.f34600b.execute(new V4.l.b(r5, r1.f34599a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o() {
        /*
            r5 = this;
            monitor-enter(r5)
            p5.c r0 = r5.f34571b     // Catch:{ all -> 0x0014 }
            r0.c()     // Catch:{ all -> 0x0014 }
            boolean r0 = r5.f34593x     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0016
            V4.v r0 = r5.f34586q     // Catch:{ all -> 0x0014 }
            r0.recycle()     // Catch:{ all -> 0x0014 }
            r5.q()     // Catch:{ all -> 0x0014 }
            monitor-exit(r5)     // Catch:{ all -> 0x0014 }
            return
        L_0x0014:
            r0 = move-exception
            goto L_0x007e
        L_0x0016:
            V4.l$e r0 = r5.f34570a     // Catch:{ all -> 0x0014 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x0076
            boolean r0 = r5.f34588s     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x006e
            V4.l$c r0 = r5.f34574e     // Catch:{ all -> 0x0014 }
            V4.v r1 = r5.f34586q     // Catch:{ all -> 0x0014 }
            boolean r2 = r5.f34582m     // Catch:{ all -> 0x0014 }
            T4.f r3 = r5.f34581l     // Catch:{ all -> 0x0014 }
            V4.p$a r4 = r5.f34572c     // Catch:{ all -> 0x0014 }
            V4.p r0 = r0.a(r1, r2, r3, r4)     // Catch:{ all -> 0x0014 }
            r5.f34591v = r0     // Catch:{ all -> 0x0014 }
            r0 = 1
            r5.f34588s = r0     // Catch:{ all -> 0x0014 }
            V4.l$e r1 = r5.f34570a     // Catch:{ all -> 0x0014 }
            V4.l$e r1 = r1.d()     // Catch:{ all -> 0x0014 }
            int r2 = r1.size()     // Catch:{ all -> 0x0014 }
            int r2 = r2 + r0
            r5.k(r2)     // Catch:{ all -> 0x0014 }
            T4.f r0 = r5.f34581l     // Catch:{ all -> 0x0014 }
            V4.p r2 = r5.f34591v     // Catch:{ all -> 0x0014 }
            monitor-exit(r5)     // Catch:{ all -> 0x0014 }
            V4.m r3 = r5.f34575f
            r3.b(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x0051:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x006a
            java.lang.Object r1 = r0.next()
            V4.l$d r1 = (V4.l.d) r1
            java.util.concurrent.Executor r2 = r1.f34600b
            V4.l$b r3 = new V4.l$b
            com.bumptech.glide.request.i r1 = r1.f34599a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0051
        L_0x006a:
            r5.i()
            return
        L_0x006e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0014 }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x0014 }
            throw r0     // Catch:{ all -> 0x0014 }
        L_0x0076:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0014 }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0014 }
            throw r0     // Catch:{ all -> 0x0014 }
        L_0x007e:
            monitor-exit(r5)     // Catch:{ all -> 0x0014 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.l.o():void");
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f34585p;
    }

    /* access modifiers changed from: package-private */
    public synchronized void r(i iVar) {
        try {
            this.f34571b.c();
            this.f34570a.h(iVar);
            if (this.f34570a.isEmpty()) {
                h();
                if (!this.f34588s) {
                    if (this.f34590u) {
                    }
                }
                if (this.f34580k.get() == 0) {
                    q();
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void s(h hVar) {
        Y4.a aVar;
        try {
            this.f34592w = hVar;
            if (hVar.P()) {
                aVar = this.f34576g;
            } else {
                aVar = j();
            }
            aVar.execute(hVar);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    l(Y4.a aVar, Y4.a aVar2, Y4.a aVar3, Y4.a aVar4, m mVar, p.a aVar5, x1.e eVar, c cVar) {
        this.f34570a = new e();
        this.f34571b = C3933c.a();
        this.f34580k = new AtomicInteger();
        this.f34576g = aVar;
        this.f34577h = aVar2;
        this.f34578i = aVar3;
        this.f34579j = aVar4;
        this.f34575f = mVar;
        this.f34572c = aVar5;
        this.f34573d = eVar;
        this.f34574e = cVar;
    }
}

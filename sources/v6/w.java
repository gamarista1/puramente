package V6;

import T5.k;
import T5.l;
import V6.n;
import V6.x;
import X5.h;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class w implements n, x {

    /* renamed from: a  reason: collision with root package name */
    private final n.b f34731a;

    /* renamed from: b  reason: collision with root package name */
    final m f34732b;

    /* renamed from: c  reason: collision with root package name */
    final m f34733c;

    /* renamed from: d  reason: collision with root package name */
    final Map f34734d = new WeakHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final D f34735e;

    /* renamed from: f  reason: collision with root package name */
    private final x.a f34736f;

    /* renamed from: g  reason: collision with root package name */
    private final T5.n f34737g;

    /* renamed from: h  reason: collision with root package name */
    protected y f34738h;

    /* renamed from: i  reason: collision with root package name */
    private long f34739i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final boolean f34740j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f34741k;

    class a implements D {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ D f34742a;

        a(D d10) {
            this.f34742a = d10;
        }

        /* renamed from: b */
        public int a(n.a aVar) {
            if (w.this.f34740j) {
                return aVar.f34722g;
            }
            return this.f34742a.a(aVar.f34717b.I());
        }
    }

    class b implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n.a f34744a;

        b(n.a aVar) {
            this.f34744a = aVar;
        }

        public void a(Object obj) {
            w.this.z(this.f34744a);
        }
    }

    public w(D d10, x.a aVar, T5.n nVar, n.b bVar, boolean z10, boolean z11) {
        this.f34735e = d10;
        this.f34732b = new m(B(d10));
        this.f34733c = new m(B(d10));
        this.f34736f = aVar;
        this.f34737g = nVar;
        this.f34738h = (y) k.h((y) nVar.get(), "mMemoryCacheParamsSupplier returned null");
        this.f34739i = SystemClock.uptimeMillis();
        this.f34731a = bVar;
        this.f34740j = z10;
        this.f34741k = z11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        if (r3.f34741k == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        r3.f34732b.k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        throw new java.lang.IllegalStateException(java.lang.String.format("key is null, but exclusiveEntries count: %d, size: %d", new java.lang.Object[]{java.lang.Integer.valueOf(r3.f34732b.c()), java.lang.Integer.valueOf(r3.f34732b.f())}));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.util.ArrayList A(int r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            int r4 = java.lang.Math.max(r4, r0)     // Catch:{ all -> 0x001d }
            int r5 = java.lang.Math.max(r5, r0)     // Catch:{ all -> 0x001d }
            V6.m r0 = r3.f34732b     // Catch:{ all -> 0x001d }
            int r0 = r0.c()     // Catch:{ all -> 0x001d }
            if (r0 > r4) goto L_0x001f
            V6.m r0 = r3.f34732b     // Catch:{ all -> 0x001d }
            int r0 = r0.f()     // Catch:{ all -> 0x001d }
            if (r0 > r5) goto L_0x001f
            monitor-exit(r3)
            r4 = 0
            return r4
        L_0x001d:
            r4 = move-exception
            goto L_0x007c
        L_0x001f:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x001d }
            r0.<init>()     // Catch:{ all -> 0x001d }
        L_0x0024:
            V6.m r1 = r3.f34732b     // Catch:{ all -> 0x001d }
            int r1 = r1.c()     // Catch:{ all -> 0x001d }
            if (r1 > r4) goto L_0x0034
            V6.m r1 = r3.f34732b     // Catch:{ all -> 0x001d }
            int r1 = r1.f()     // Catch:{ all -> 0x001d }
            if (r1 <= r5) goto L_0x0045
        L_0x0034:
            V6.m r1 = r3.f34732b     // Catch:{ all -> 0x001d }
            java.lang.Object r1 = r1.d()     // Catch:{ all -> 0x001d }
            if (r1 != 0) goto L_0x006b
            boolean r4 = r3.f34741k     // Catch:{ all -> 0x001d }
            if (r4 == 0) goto L_0x0047
            V6.m r4 = r3.f34732b     // Catch:{ all -> 0x001d }
            r4.k()     // Catch:{ all -> 0x001d }
        L_0x0045:
            monitor-exit(r3)
            return r0
        L_0x0047:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001d }
            java.lang.String r5 = "key is null, but exclusiveEntries count: %d, size: %d"
            V6.m r0 = r3.f34732b     // Catch:{ all -> 0x001d }
            int r0 = r0.c()     // Catch:{ all -> 0x001d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x001d }
            V6.m r1 = r3.f34732b     // Catch:{ all -> 0x001d }
            int r1 = r1.f()     // Catch:{ all -> 0x001d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x001d }
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}     // Catch:{ all -> 0x001d }
            java.lang.String r5 = java.lang.String.format(r5, r0)     // Catch:{ all -> 0x001d }
            r4.<init>(r5)     // Catch:{ all -> 0x001d }
            throw r4     // Catch:{ all -> 0x001d }
        L_0x006b:
            V6.m r2 = r3.f34732b     // Catch:{ all -> 0x001d }
            r2.i(r1)     // Catch:{ all -> 0x001d }
            V6.m r2 = r3.f34733c     // Catch:{ all -> 0x001d }
            java.lang.Object r1 = r2.i(r1)     // Catch:{ all -> 0x001d }
            V6.n$a r1 = (V6.n.a) r1     // Catch:{ all -> 0x001d }
            r0.add(r1)     // Catch:{ all -> 0x001d }
            goto L_0x0024
        L_0x007c:
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: V6.w.A(int, int):java.util.ArrayList");
    }

    private D B(D d10) {
        return new a(d10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (m() <= (r3.f34738h.f34746a - r4)) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean j(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            V6.y r0 = r3.f34738h     // Catch:{ all -> 0x001f }
            int r0 = r0.f34750e     // Catch:{ all -> 0x001f }
            if (r4 > r0) goto L_0x0021
            int r0 = r3.l()     // Catch:{ all -> 0x001f }
            V6.y r1 = r3.f34738h     // Catch:{ all -> 0x001f }
            int r1 = r1.f34747b     // Catch:{ all -> 0x001f }
            r2 = 1
            int r1 = r1 - r2
            if (r0 > r1) goto L_0x0021
            int r0 = r3.m()     // Catch:{ all -> 0x001f }
            V6.y r1 = r3.f34738h     // Catch:{ all -> 0x001f }
            int r1 = r1.f34746a     // Catch:{ all -> 0x001f }
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0021
            goto L_0x0022
        L_0x001f:
            r4 = move-exception
            goto L_0x0024
        L_0x0021:
            r2 = 0
        L_0x0022:
            monitor-exit(r3)
            return r2
        L_0x0024:
            monitor-exit(r3)     // Catch:{ all -> 0x001f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: V6.w.j(int):boolean");
    }

    private synchronized void k(n.a aVar) {
        boolean z10;
        k.g(aVar);
        if (aVar.f34718c > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.i(z10);
        aVar.f34718c--;
    }

    private synchronized void n(n.a aVar) {
        k.g(aVar);
        k.i(!aVar.f34719d);
        aVar.f34718c++;
    }

    private synchronized void o(n.a aVar) {
        k.g(aVar);
        k.i(!aVar.f34719d);
        aVar.f34719d = true;
    }

    private synchronized void p(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o((n.a) it.next());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean q(V6.n.a r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r3.f34719d     // Catch:{ all -> 0x0013 }
            if (r0 != 0) goto L_0x0015
            int r0 = r3.f34718c     // Catch:{ all -> 0x0013 }
            if (r0 != 0) goto L_0x0015
            V6.m r0 = r2.f34732b     // Catch:{ all -> 0x0013 }
            java.lang.Object r1 = r3.f34716a     // Catch:{ all -> 0x0013 }
            r0.h(r1, r3)     // Catch:{ all -> 0x0013 }
            monitor-exit(r2)
            r3 = 1
            return r3
        L_0x0013:
            r3 = move-exception
            goto L_0x0018
        L_0x0015:
            monitor-exit(r2)
            r3 = 0
            return r3
        L_0x0018:
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: V6.w.q(V6.n$a):boolean");
    }

    private void r(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                X5.a.E(y((n.a) it.next()));
            }
        }
    }

    private static void t(n.a aVar) {
        n.b bVar;
        if (aVar != null && (bVar = aVar.f34720e) != null) {
            bVar.a(aVar.f34716a, true);
        }
    }

    private static void u(n.a aVar) {
        n.b bVar;
        if (aVar != null && (bVar = aVar.f34720e) != null) {
            bVar.a(aVar.f34716a, false);
        }
    }

    private void v(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                u((n.a) it.next());
            }
        }
    }

    private synchronized void w() {
        if (this.f34739i + this.f34738h.f34751f <= SystemClock.uptimeMillis()) {
            this.f34739i = SystemClock.uptimeMillis();
            this.f34738h = (y) k.h((y) this.f34737g.get(), "mMemoryCacheParamsSupplier returned null");
        }
    }

    private synchronized X5.a x(n.a aVar) {
        n(aVar);
        return X5.a.g0(aVar.f34717b.I(), new b(aVar));
    }

    private synchronized X5.a y(n.a aVar) {
        X5.a aVar2;
        k.g(aVar);
        if (!aVar.f34719d || aVar.f34718c != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar.f34717b;
        }
        return aVar2;
    }

    /* access modifiers changed from: private */
    public void z(n.a aVar) {
        boolean q10;
        X5.a y10;
        k.g(aVar);
        synchronized (this) {
            k(aVar);
            q10 = q(aVar);
            y10 = y(aVar);
        }
        X5.a.E(y10);
        if (!q10) {
            aVar = null;
        }
        t(aVar);
        w();
        s();
    }

    public X5.a b(Object obj, X5.a aVar) {
        return f(obj, aVar, this.f34731a);
    }

    public void c(Object obj) {
        k.g(obj);
        synchronized (this) {
            try {
                n.a aVar = (n.a) this.f34732b.i(obj);
                if (aVar != null) {
                    this.f34732b.h(obj, aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized boolean contains(Object obj) {
        return this.f34733c.a(obj);
    }

    public synchronized boolean d(l lVar) {
        return !this.f34733c.e(lVar).isEmpty();
    }

    public X5.a e(Object obj) {
        n.a aVar;
        boolean z10;
        X5.a aVar2;
        k.g(obj);
        synchronized (this) {
            try {
                aVar = (n.a) this.f34732b.i(obj);
                z10 = false;
                if (aVar != null) {
                    n.a aVar3 = (n.a) this.f34733c.i(obj);
                    k.g(aVar3);
                    if (aVar3.f34718c == 0) {
                        z10 = true;
                    }
                    k.i(z10);
                    aVar2 = aVar3.f34717b;
                    z10 = true;
                } else {
                    aVar2 = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (z10) {
            u(aVar);
        }
        return aVar2;
    }

    public X5.a f(Object obj, X5.a aVar, n.b bVar) {
        n.a aVar2;
        X5.a aVar3;
        X5.a aVar4;
        n.a aVar5;
        k.g(obj);
        k.g(aVar);
        w();
        synchronized (this) {
            try {
                aVar2 = (n.a) this.f34732b.i(obj);
                n.a aVar6 = (n.a) this.f34733c.i(obj);
                aVar3 = null;
                if (aVar6 != null) {
                    o(aVar6);
                    aVar4 = y(aVar6);
                } else {
                    aVar4 = null;
                }
                int a10 = this.f34735e.a(aVar.I());
                if (j(a10)) {
                    if (this.f34740j) {
                        aVar5 = n.a.a(obj, aVar, a10, bVar);
                    } else {
                        aVar5 = n.a.b(obj, aVar, bVar);
                    }
                    this.f34733c.h(obj, aVar5);
                    aVar3 = x(aVar5);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        X5.a.E(aVar4);
        u(aVar2);
        s();
        return aVar3;
    }

    public int g(l lVar) {
        ArrayList j10;
        ArrayList j11;
        synchronized (this) {
            j10 = this.f34732b.j(lVar);
            j11 = this.f34733c.j(lVar);
            p(j11);
        }
        r(j11);
        v(j10);
        w();
        s();
        return j11.size();
    }

    public X5.a get(Object obj) {
        n.a aVar;
        X5.a aVar2;
        k.g(obj);
        synchronized (this) {
            try {
                aVar = (n.a) this.f34732b.i(obj);
                n.a aVar3 = (n.a) this.f34733c.b(obj);
                if (aVar3 != null) {
                    aVar2 = x(aVar3);
                } else {
                    aVar2 = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        u(aVar);
        w();
        s();
        return aVar2;
    }

    public synchronized int l() {
        return this.f34733c.c() - this.f34732b.c();
    }

    public synchronized int m() {
        return this.f34733c.f() - this.f34732b.f();
    }

    public void s() {
        ArrayList A10;
        synchronized (this) {
            y yVar = this.f34738h;
            int min = Math.min(yVar.f34749d, yVar.f34747b - l());
            y yVar2 = this.f34738h;
            A10 = A(min, Math.min(yVar2.f34748c, yVar2.f34746a - m()));
            p(A10);
        }
        r(A10);
        v(A10);
    }
}

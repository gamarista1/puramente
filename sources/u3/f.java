package U3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class f {

    /* renamed from: i  reason: collision with root package name */
    public static final ExecutorService f6413i = b.a();

    /* renamed from: j  reason: collision with root package name */
    private static final Executor f6414j = b.b();

    /* renamed from: k  reason: collision with root package name */
    public static final Executor f6415k = a.c();

    /* renamed from: l  reason: collision with root package name */
    private static f f6416l = new f((Object) null);

    /* renamed from: m  reason: collision with root package name */
    private static f f6417m = new f((Object) Boolean.TRUE);

    /* renamed from: n  reason: collision with root package name */
    private static f f6418n = new f((Object) Boolean.FALSE);

    /* renamed from: o  reason: collision with root package name */
    private static f f6419o = new f(true);

    /* renamed from: a  reason: collision with root package name */
    private final Object f6420a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f6421b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6422c;

    /* renamed from: d  reason: collision with root package name */
    private Object f6423d;

    /* renamed from: e  reason: collision with root package name */
    private Exception f6424e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6425f;

    /* renamed from: g  reason: collision with root package name */
    private h f6426g;

    /* renamed from: h  reason: collision with root package name */
    private List f6427h = new ArrayList();

    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f6428a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f6429b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Executor f6430c;

        a(g gVar, d dVar, Executor executor, c cVar) {
            this.f6428a = gVar;
            this.f6429b = dVar;
            this.f6430c = executor;
        }

        /* renamed from: b */
        public Void a(f fVar) {
            f.d(this.f6428a, this.f6429b, fVar, this.f6430c, (c) null);
            return null;
        }
    }

    static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f6432a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f6433b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f6434c;

        b(c cVar, g gVar, d dVar, f fVar) {
            this.f6432a = gVar;
            this.f6433b = dVar;
            this.f6434c = fVar;
        }

        public void run() {
            try {
                this.f6432a.d(this.f6433b.a(this.f6434c));
            } catch (CancellationException unused) {
                this.f6432a.b();
            } catch (Exception e10) {
                this.f6432a.c(e10);
            }
        }
    }

    static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f6435a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Callable f6436b;

        c(c cVar, g gVar, Callable callable) {
            this.f6435a = gVar;
            this.f6436b = callable;
        }

        public void run() {
            try {
                this.f6435a.d(this.f6436b.call());
            } catch (CancellationException unused) {
                this.f6435a.b();
            } catch (Exception e10) {
                this.f6435a.c(e10);
            }
        }
    }

    public interface d {
    }

    f() {
    }

    public static f b(Callable callable, Executor executor) {
        return c(callable, executor, (c) null);
    }

    public static f c(Callable callable, Executor executor, c cVar) {
        g gVar = new g();
        try {
            executor.execute(new c(cVar, gVar, callable));
        } catch (Exception e10) {
            gVar.c(new e(e10));
        }
        return gVar.a();
    }

    /* access modifiers changed from: private */
    public static void d(g gVar, d dVar, f fVar, Executor executor, c cVar) {
        try {
            executor.execute(new b(cVar, gVar, dVar, fVar));
        } catch (Exception e10) {
            gVar.c(new e(e10));
        }
    }

    public static f g(Exception exc) {
        g gVar = new g();
        gVar.c(exc);
        return gVar.a();
    }

    public static f h(Object obj) {
        if (obj == null) {
            return f6416l;
        }
        if (!(obj instanceof Boolean)) {
            g gVar = new g();
            gVar.d(obj);
            return gVar.a();
        } else if (((Boolean) obj).booleanValue()) {
            return f6417m;
        } else {
            return f6418n;
        }
    }

    public static d k() {
        return null;
    }

    private void o() {
        synchronized (this.f6420a) {
            for (d a10 : this.f6427h) {
                try {
                    a10.a(this);
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f6427h = null;
        }
    }

    public f e(d dVar) {
        return f(dVar, f6414j, (c) null);
    }

    public f f(d dVar, Executor executor, c cVar) {
        boolean m10;
        g gVar = new g();
        synchronized (this.f6420a) {
            try {
                m10 = m();
                if (!m10) {
                    this.f6427h.add(new a(gVar, dVar, executor, cVar));
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (m10) {
            d(gVar, dVar, this, executor, cVar);
        }
        return gVar.a();
    }

    public Exception i() {
        Exception exc;
        synchronized (this.f6420a) {
            try {
                if (this.f6424e != null) {
                    this.f6425f = true;
                }
                exc = this.f6424e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return exc;
    }

    public Object j() {
        Object obj;
        synchronized (this.f6420a) {
            obj = this.f6423d;
        }
        return obj;
    }

    public boolean l() {
        boolean z10;
        synchronized (this.f6420a) {
            z10 = this.f6422c;
        }
        return z10;
    }

    public boolean m() {
        boolean z10;
        synchronized (this.f6420a) {
            z10 = this.f6421b;
        }
        return z10;
    }

    public boolean n() {
        boolean z10;
        synchronized (this.f6420a) {
            if (i() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        synchronized (this.f6420a) {
            try {
                if (this.f6421b) {
                    return false;
                }
                this.f6421b = true;
                this.f6422c = true;
                this.f6420a.notifyAll();
                o();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean q(java.lang.Exception r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f6420a
            monitor-enter(r0)
            boolean r1 = r3.f6421b     // Catch:{ all -> 0x000a }
            r2 = 0
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return r2
        L_0x000a:
            r4 = move-exception
            goto L_0x0024
        L_0x000c:
            r1 = 1
            r3.f6421b = r1     // Catch:{ all -> 0x000a }
            r3.f6424e = r4     // Catch:{ all -> 0x000a }
            r3.f6425f = r2     // Catch:{ all -> 0x000a }
            java.lang.Object r4 = r3.f6420a     // Catch:{ all -> 0x000a }
            r4.notifyAll()     // Catch:{ all -> 0x000a }
            r3.o()     // Catch:{ all -> 0x000a }
            boolean r4 = r3.f6425f     // Catch:{ all -> 0x000a }
            if (r4 != 0) goto L_0x0022
            k()     // Catch:{ all -> 0x000a }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return r1
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.f.q(java.lang.Exception):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean r(Object obj) {
        synchronized (this.f6420a) {
            try {
                if (this.f6421b) {
                    return false;
                }
                this.f6421b = true;
                this.f6423d = obj;
                this.f6420a.notifyAll();
                o();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private f(Object obj) {
        r(obj);
    }

    private f(boolean z10) {
        if (z10) {
            p();
        } else {
            r((Object) null);
        }
    }
}

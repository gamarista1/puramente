package b8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public class d implements J7.a {

    /* renamed from: i  reason: collision with root package name */
    public static final Executor f36260i = c.f36259c;

    /* renamed from: j  reason: collision with root package name */
    public static final Executor f36261j = c.f36258b;

    /* renamed from: k  reason: collision with root package name */
    private static d f36262k = new d((Object) null);

    /* renamed from: l  reason: collision with root package name */
    private static d f36263l = new d((Object) Boolean.TRUE);

    /* renamed from: m  reason: collision with root package name */
    private static d f36264m = new d((Object) Boolean.FALSE);

    /* renamed from: n  reason: collision with root package name */
    private static d f36265n = new d(true);

    /* renamed from: a  reason: collision with root package name */
    private final Object f36266a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f36267b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36268c;

    /* renamed from: d  reason: collision with root package name */
    private Object f36269d;

    /* renamed from: e  reason: collision with root package name */
    private Exception f36270e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f36271f;

    /* renamed from: g  reason: collision with root package name */
    private f f36272g;

    /* renamed from: h  reason: collision with root package name */
    private List f36273h = new ArrayList();

    class a implements C3159a {
        a() {
        }

        /* renamed from: b */
        public d a(d dVar) {
            if (dVar.q()) {
                return d.e();
            }
            if (dVar.s()) {
                return d.l(dVar.n());
            }
            return d.m((Object) null);
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f36275a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Callable f36276b;

        b(e eVar, Callable callable) {
            this.f36275a = eVar;
            this.f36276b = callable;
        }

        public void run() {
            try {
                this.f36275a.d(this.f36276b.call());
            } catch (CancellationException unused) {
                this.f36275a.b();
            } catch (Exception e10) {
                this.f36275a.c(e10);
            }
        }
    }

    class c implements C3159a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f36277a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C3159a f36278b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Executor f36279c;

        c(e eVar, C3159a aVar, Executor executor) {
            this.f36277a = eVar;
            this.f36278b = aVar;
            this.f36279c = executor;
        }

        /* renamed from: b */
        public Void a(d dVar) {
            d.g(this.f36277a, this.f36278b, dVar, this.f36279c);
            return null;
        }
    }

    /* renamed from: b8.d$d  reason: collision with other inner class name */
    class C0594d implements C3159a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f36281a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C3159a f36282b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Executor f36283c;

        C0594d(e eVar, C3159a aVar, Executor executor) {
            this.f36281a = eVar;
            this.f36282b = aVar;
            this.f36283c = executor;
        }

        /* renamed from: b */
        public Void a(d dVar) {
            d.f(this.f36281a, this.f36282b, dVar, this.f36283c);
            return null;
        }
    }

    class e implements C3159a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C3159a f36285a;

        e(C3159a aVar) {
            this.f36285a = aVar;
        }

        /* renamed from: b */
        public d a(d dVar) {
            if (dVar.s()) {
                return d.l(dVar.n());
            }
            if (dVar.q()) {
                return d.e();
            }
            return dVar.h(this.f36285a);
        }
    }

    class f implements C3159a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C3159a f36287a;

        f(C3159a aVar) {
            this.f36287a = aVar;
        }

        /* renamed from: b */
        public d a(d dVar) {
            if (dVar.s()) {
                return d.l(dVar.n());
            }
            if (dVar.q()) {
                return d.e();
            }
            return dVar.j(this.f36287a);
        }
    }

    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C3159a f36289a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f36290b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f36291c;

        g(C3159a aVar, d dVar, e eVar) {
            this.f36289a = aVar;
            this.f36290b = dVar;
            this.f36291c = eVar;
        }

        public void run() {
            try {
                this.f36291c.d(this.f36289a.a(this.f36290b));
            } catch (CancellationException unused) {
                this.f36291c.b();
            } catch (Exception e10) {
                this.f36291c.c(e10);
            }
        }
    }

    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C3159a f36292a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f36293b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f36294c;

        class a implements C3159a {
            a() {
            }

            /* renamed from: b */
            public Void a(d dVar) {
                if (dVar.q()) {
                    h.this.f36294c.b();
                    return null;
                } else if (dVar.s()) {
                    h.this.f36294c.c(dVar.n());
                    return null;
                } else {
                    h.this.f36294c.d(dVar.o());
                    return null;
                }
            }
        }

        h(C3159a aVar, d dVar, e eVar) {
            this.f36292a = aVar;
            this.f36293b = dVar;
            this.f36294c = eVar;
        }

        public void run() {
            try {
                d dVar = (d) this.f36292a.a(this.f36293b);
                if (dVar == null) {
                    this.f36294c.d((Object) null);
                } else {
                    dVar.h(new a());
                }
            } catch (CancellationException unused) {
                this.f36294c.b();
            } catch (Exception e10) {
                this.f36294c.c(e10);
            }
        }
    }

    public interface i {
    }

    d() {
    }

    public static d c(Callable callable) {
        return d(callable, f36260i);
    }

    public static d d(Callable callable, Executor executor) {
        e eVar = new e();
        try {
            executor.execute(new b(eVar, callable));
        } catch (Exception e10) {
            eVar.c(new b(e10));
        }
        return eVar.a();
    }

    public static d e() {
        return f36265n;
    }

    /* access modifiers changed from: private */
    public static void f(e eVar, C3159a aVar, d dVar, Executor executor) {
        try {
            executor.execute(new h(aVar, dVar, eVar));
        } catch (Exception e10) {
            eVar.c(new b(e10));
        }
    }

    /* access modifiers changed from: private */
    public static void g(e eVar, C3159a aVar, d dVar, Executor executor) {
        try {
            executor.execute(new g(aVar, dVar, eVar));
        } catch (Exception e10) {
            eVar.c(new b(e10));
        }
    }

    public static d l(Exception exc) {
        e eVar = new e();
        eVar.c(exc);
        return eVar.a();
    }

    public static d m(Object obj) {
        if (obj == null) {
            return f36262k;
        }
        if (!(obj instanceof Boolean)) {
            e eVar = new e();
            eVar.d(obj);
            return eVar.a();
        } else if (((Boolean) obj).booleanValue()) {
            return f36263l;
        } else {
            return f36264m;
        }
    }

    public static i p() {
        return null;
    }

    private void w() {
        synchronized (this.f36266a) {
            for (C3159a a10 : this.f36273h) {
                try {
                    a10.a(this);
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f36273h = null;
        }
    }

    public d h(C3159a aVar) {
        return i(aVar, f36260i);
    }

    public d i(C3159a aVar, Executor executor) {
        boolean r10;
        e eVar = new e();
        synchronized (this.f36266a) {
            try {
                r10 = r();
                if (!r10) {
                    this.f36273h.add(new c(eVar, aVar, executor));
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (r10) {
            g(eVar, aVar, this, executor);
        }
        return eVar.a();
    }

    public d j(C3159a aVar) {
        return k(aVar, f36260i);
    }

    public d k(C3159a aVar, Executor executor) {
        boolean r10;
        e eVar = new e();
        synchronized (this.f36266a) {
            try {
                r10 = r();
                if (!r10) {
                    this.f36273h.add(new C0594d(eVar, aVar, executor));
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (r10) {
            f(eVar, aVar, this, executor);
        }
        return eVar.a();
    }

    public Exception n() {
        Exception exc;
        synchronized (this.f36266a) {
            try {
                if (this.f36270e != null) {
                    this.f36271f = true;
                }
                exc = this.f36270e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return exc;
    }

    public Object o() {
        Object obj;
        synchronized (this.f36266a) {
            obj = this.f36269d;
        }
        return obj;
    }

    public boolean q() {
        boolean z10;
        synchronized (this.f36266a) {
            z10 = this.f36268c;
        }
        return z10;
    }

    public boolean r() {
        boolean z10;
        synchronized (this.f36266a) {
            z10 = this.f36267b;
        }
        return z10;
    }

    public boolean s() {
        boolean z10;
        synchronized (this.f36266a) {
            if (n() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public d t() {
        return j(new a());
    }

    public d u(C3159a aVar, Executor executor) {
        return k(new e(aVar), executor);
    }

    public d v(C3159a aVar, Executor executor) {
        return k(new f(aVar), executor);
    }

    /* access modifiers changed from: package-private */
    public boolean x() {
        synchronized (this.f36266a) {
            try {
                if (this.f36267b) {
                    return false;
                }
                this.f36267b = true;
                this.f36268c = true;
                this.f36266a.notifyAll();
                w();
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
    public boolean y(java.lang.Exception r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f36266a
            monitor-enter(r0)
            boolean r1 = r3.f36267b     // Catch:{ all -> 0x000a }
            r2 = 0
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return r2
        L_0x000a:
            r4 = move-exception
            goto L_0x0024
        L_0x000c:
            r1 = 1
            r3.f36267b = r1     // Catch:{ all -> 0x000a }
            r3.f36270e = r4     // Catch:{ all -> 0x000a }
            r3.f36271f = r2     // Catch:{ all -> 0x000a }
            java.lang.Object r4 = r3.f36266a     // Catch:{ all -> 0x000a }
            r4.notifyAll()     // Catch:{ all -> 0x000a }
            r3.w()     // Catch:{ all -> 0x000a }
            boolean r4 = r3.f36271f     // Catch:{ all -> 0x000a }
            if (r4 != 0) goto L_0x0022
            p()     // Catch:{ all -> 0x000a }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return r1
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.d.y(java.lang.Exception):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean z(Object obj) {
        synchronized (this.f36266a) {
            try {
                if (this.f36267b) {
                    return false;
                }
                this.f36267b = true;
                this.f36269d = obj;
                this.f36266a.notifyAll();
                w();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private d(Object obj) {
        z(obj);
    }

    private d(boolean z10) {
        if (z10) {
            x();
        } else {
            z((Object) null);
        }
    }
}

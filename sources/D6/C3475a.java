package d6;

import android.util.Pair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: d6.a  reason: case insensitive filesystem */
public abstract class C3475a implements C3477c {

    /* renamed from: a  reason: collision with root package name */
    private Map f43138a;

    /* renamed from: b  reason: collision with root package name */
    private d f43139b = d.IN_PROGRESS;

    /* renamed from: c  reason: collision with root package name */
    private boolean f43140c = false;

    /* renamed from: d  reason: collision with root package name */
    private Object f43141d = null;

    /* renamed from: e  reason: collision with root package name */
    private Throwable f43142e = null;

    /* renamed from: f  reason: collision with root package name */
    private float f43143f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    private final ConcurrentLinkedQueue f43144g = new ConcurrentLinkedQueue();

    /* renamed from: d6.a$a  reason: collision with other inner class name */
    class C0665a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f43145a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f43146b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f43147c;

        C0665a(boolean z10, e eVar, boolean z11) {
            this.f43145a = z10;
            this.f43146b = eVar;
            this.f43147c = z11;
        }

        public void run() {
            if (this.f43145a) {
                this.f43146b.d(C3475a.this);
            } else if (this.f43147c) {
                this.f43146b.a(C3475a.this);
            } else {
                this.f43146b.c(C3475a.this);
            }
        }
    }

    /* renamed from: d6.a$b */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f43149a;

        b(e eVar) {
            this.f43149a = eVar;
        }

        public void run() {
            this.f43149a.b(C3475a.this);
        }
    }

    /* renamed from: d6.a$c */
    public interface c {
    }

    /* renamed from: d6.a$d */
    private enum d {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    protected C3475a() {
    }

    public static c i() {
        return null;
    }

    private void m() {
        boolean j10 = j();
        boolean w10 = w();
        Iterator it = this.f43144g.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            l((e) pair.first, (Executor) pair.second, j10, w10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean r(java.lang.Throwable r3, java.util.Map r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f43140c     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0019
            d6.a$d r0 = r2.f43139b     // Catch:{ all -> 0x0017 }
            d6.a$d r1 = d6.C3475a.d.IN_PROGRESS     // Catch:{ all -> 0x0017 }
            if (r0 == r1) goto L_0x000c
            goto L_0x0019
        L_0x000c:
            d6.a$d r0 = d6.C3475a.d.FAILURE     // Catch:{ all -> 0x0017 }
            r2.f43139b = r0     // Catch:{ all -> 0x0017 }
            r2.f43142e = r3     // Catch:{ all -> 0x0017 }
            r2.f43138a = r4     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            r3 = 1
            return r3
        L_0x0017:
            r3 = move-exception
            goto L_0x001c
        L_0x0019:
            monitor-exit(r2)
            r3 = 0
            return r3
        L_0x001c:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.C3475a.r(java.lang.Throwable, java.util.Map):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean t(float r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f43140c     // Catch:{ all -> 0x001a }
            r1 = 0
            if (r0 != 0) goto L_0x001c
            d6.a$d r0 = r3.f43139b     // Catch:{ all -> 0x001a }
            d6.a$d r2 = d6.C3475a.d.IN_PROGRESS     // Catch:{ all -> 0x001a }
            if (r0 == r2) goto L_0x000d
            goto L_0x001c
        L_0x000d:
            float r0 = r3.f43143f     // Catch:{ all -> 0x001a }
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0015
            monitor-exit(r3)
            return r1
        L_0x0015:
            r3.f43143f = r4     // Catch:{ all -> 0x001a }
            monitor-exit(r3)
            r4 = 1
            return r4
        L_0x001a:
            r4 = move-exception
            goto L_0x001e
        L_0x001c:
            monitor-exit(r3)
            return r1
        L_0x001e:
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.C3475a.t(float):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0027, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0029, code lost:
        h(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return false;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x0032=Splitter:B:27:0x0032, B:21:0x0026=Splitter:B:21:0x0026} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean v(java.lang.Object r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            monitor-enter(r3)     // Catch:{ all -> 0x003c }
            boolean r1 = r3.f43140c     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x0032
            d6.a$d r1 = r3.f43139b     // Catch:{ all -> 0x0018 }
            d6.a$d r2 = d6.C3475a.d.IN_PROGRESS     // Catch:{ all -> 0x0018 }
            if (r1 == r2) goto L_0x000d
            goto L_0x0032
        L_0x000d:
            if (r5 == 0) goto L_0x001a
            d6.a$d r5 = d6.C3475a.d.SUCCESS     // Catch:{ all -> 0x0018 }
            r3.f43139b = r5     // Catch:{ all -> 0x0018 }
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.f43143f = r5     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r4 = move-exception
            goto L_0x003a
        L_0x001a:
            java.lang.Object r5 = r3.f43141d     // Catch:{ all -> 0x0018 }
            if (r5 == r4) goto L_0x0025
            r3.f43141d = r4     // Catch:{ all -> 0x0022 }
            r4 = r5
            goto L_0x0026
        L_0x0022:
            r4 = move-exception
            r0 = r5
            goto L_0x003a
        L_0x0025:
            r4 = r0
        L_0x0026:
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            if (r4 == 0) goto L_0x002c
            r3.h(r4)
        L_0x002c:
            r4 = 1
            return r4
        L_0x002e:
            r5 = move-exception
            r0 = r4
            r4 = r5
            goto L_0x003a
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            if (r4 == 0) goto L_0x0038
            r3.h(r4)
        L_0x0038:
            r4 = 0
            return r4
        L_0x003a:
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            throw r4     // Catch:{ all -> 0x003c }
        L_0x003c:
            r4 = move-exception
            if (r0 == 0) goto L_0x0042
            r3.h(r0)
        L_0x0042:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.C3475a.v(java.lang.Object, boolean):boolean");
    }

    private synchronized boolean w() {
        boolean z10;
        if (!k() || c()) {
            z10 = false;
        } else {
            z10 = true;
        }
        return z10;
    }

    public synchronized Object a() {
        return this.f43141d;
    }

    public synchronized boolean b() {
        boolean z10;
        if (this.f43141d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public synchronized boolean c() {
        boolean z10;
        if (this.f43139b != d.IN_PROGRESS) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r1 == null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        h(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (c() != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.f43144g.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean close() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f43140c     // Catch:{ all -> 0x0008 }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r3)     // Catch:{ all -> 0x0008 }
            r0 = 0
            return r0
        L_0x0008:
            r0 = move-exception
            goto L_0x002c
        L_0x000a:
            r0 = 1
            r3.f43140c = r0     // Catch:{ all -> 0x0008 }
            java.lang.Object r1 = r3.f43141d     // Catch:{ all -> 0x0008 }
            r2 = 0
            r3.f43141d = r2     // Catch:{ all -> 0x0008 }
            monitor-exit(r3)     // Catch:{ all -> 0x0008 }
            if (r1 == 0) goto L_0x0018
            r3.h(r1)
        L_0x0018:
            boolean r1 = r3.c()
            if (r1 != 0) goto L_0x0021
            r3.m()
        L_0x0021:
            monitor-enter(r3)
            java.util.concurrent.ConcurrentLinkedQueue r1 = r3.f43144g     // Catch:{ all -> 0x0029 }
            r1.clear()     // Catch:{ all -> 0x0029 }
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            throw r0
        L_0x002c:
            monitor-exit(r3)     // Catch:{ all -> 0x0008 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.C3475a.close():boolean");
    }

    public synchronized Throwable d() {
        return this.f43142e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        l(r3, r4, j(), w());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(d6.e r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            T5.k.g(r3)
            T5.k.g(r4)
            monitor-enter(r2)
            boolean r0 = r2.f43140c     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r2)     // Catch:{ all -> 0x000d }
            return
        L_0x000d:
            r3 = move-exception
            goto L_0x0043
        L_0x000f:
            d6.a$d r0 = r2.f43139b     // Catch:{ all -> 0x000d }
            d6.a$d r1 = d6.C3475a.d.IN_PROGRESS     // Catch:{ all -> 0x000d }
            if (r0 != r1) goto L_0x001e
            java.util.concurrent.ConcurrentLinkedQueue r0 = r2.f43144g     // Catch:{ all -> 0x000d }
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch:{ all -> 0x000d }
            r0.add(r1)     // Catch:{ all -> 0x000d }
        L_0x001e:
            boolean r0 = r2.b()     // Catch:{ all -> 0x000d }
            if (r0 != 0) goto L_0x0033
            boolean r0 = r2.c()     // Catch:{ all -> 0x000d }
            if (r0 != 0) goto L_0x0033
            boolean r0 = r2.w()     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r0 = 0
            goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            monitor-exit(r2)     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x0042
            boolean r0 = r2.j()
            boolean r1 = r2.w()
            r2.l(r3, r4, r0, r1)
        L_0x0042:
            return
        L_0x0043:
            monitor-exit(r2)     // Catch:{ all -> 0x000d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.C3475a.e(d6.e, java.util.concurrent.Executor):void");
    }

    public synchronized float f() {
        return this.f43143f;
    }

    public boolean g() {
        return false;
    }

    public Map getExtras() {
        return this.f43138a;
    }

    public synchronized boolean j() {
        boolean z10;
        if (this.f43139b == d.FAILURE) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public synchronized boolean k() {
        return this.f43140c;
    }

    /* access modifiers changed from: protected */
    public void l(e eVar, Executor executor, boolean z10, boolean z11) {
        C0665a aVar = new C0665a(z10, eVar, z11);
        i();
        executor.execute(aVar);
    }

    /* access modifiers changed from: protected */
    public void n() {
        Iterator it = this.f43144g.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ((Executor) pair.second).execute(new b((e) pair.first));
        }
    }

    /* access modifiers changed from: protected */
    public void o(Map map) {
        this.f43138a = map;
    }

    /* access modifiers changed from: protected */
    public boolean p(Throwable th2) {
        return q(th2, (Map) null);
    }

    /* access modifiers changed from: protected */
    public boolean q(Throwable th2, Map map) {
        boolean r10 = r(th2, map);
        if (r10) {
            m();
        }
        return r10;
    }

    /* access modifiers changed from: protected */
    public boolean s(float f10) {
        boolean t10 = t(f10);
        if (t10) {
            n();
        }
        return t10;
    }

    /* access modifiers changed from: protected */
    public boolean u(Object obj, boolean z10, Map map) {
        o(map);
        boolean v10 = v(obj, z10);
        if (v10) {
            m();
        }
        return v10;
    }

    /* access modifiers changed from: protected */
    public void h(Object obj) {
    }
}

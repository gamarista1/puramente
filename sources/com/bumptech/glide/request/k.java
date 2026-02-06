package com.bumptech.glide.request;

import com.bumptech.glide.request.e;

public class k implements e, d {

    /* renamed from: a  reason: collision with root package name */
    private final e f39216a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f39217b;

    /* renamed from: c  reason: collision with root package name */
    private volatile d f39218c;

    /* renamed from: d  reason: collision with root package name */
    private volatile d f39219d;

    /* renamed from: e  reason: collision with root package name */
    private e.a f39220e;

    /* renamed from: f  reason: collision with root package name */
    private e.a f39221f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f39222g;

    public k(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f39220e = aVar;
        this.f39221f = aVar;
        this.f39217b = obj;
        this.f39216a = eVar;
    }

    private boolean k() {
        e eVar = this.f39216a;
        if (eVar == null || eVar.j(this)) {
            return true;
        }
        return false;
    }

    private boolean l() {
        e eVar = this.f39216a;
        if (eVar == null || eVar.a(this)) {
            return true;
        }
        return false;
    }

    private boolean m() {
        e eVar = this.f39216a;
        if (eVar == null || eVar.c(this)) {
            return true;
        }
        return false;
    }

    public boolean a(d dVar) {
        boolean z10;
        synchronized (this.f39217b) {
            try {
                if (!l() || !dVar.equals(this.f39218c) || b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f39217b) {
            try {
                if (!this.f39219d.b()) {
                    if (!this.f39218c.b()) {
                        z10 = false;
                    }
                }
                z10 = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean c(d dVar) {
        boolean z10;
        synchronized (this.f39217b) {
            try {
                if (m()) {
                    if (!dVar.equals(this.f39218c)) {
                        if (this.f39220e != e.a.SUCCESS) {
                        }
                    }
                    z10 = true;
                }
                z10 = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void clear() {
        synchronized (this.f39217b) {
            this.f39222g = false;
            e.a aVar = e.a.CLEARED;
            this.f39220e = aVar;
            this.f39221f = aVar;
            this.f39219d.clear();
            this.f39218c.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(com.bumptech.glide.request.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f39217b
            monitor-enter(r0)
            com.bumptech.glide.request.d r1 = r2.f39218c     // Catch:{ all -> 0x0011 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0011 }
            if (r3 != 0) goto L_0x0013
            com.bumptech.glide.request.e$a r3 = com.bumptech.glide.request.e.a.FAILED     // Catch:{ all -> 0x0011 }
            r2.f39221f = r3     // Catch:{ all -> 0x0011 }
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r3 = move-exception
            goto L_0x0020
        L_0x0013:
            com.bumptech.glide.request.e$a r3 = com.bumptech.glide.request.e.a.FAILED     // Catch:{ all -> 0x0011 }
            r2.f39220e = r3     // Catch:{ all -> 0x0011 }
            com.bumptech.glide.request.e r3 = r2.f39216a     // Catch:{ all -> 0x0011 }
            if (r3 == 0) goto L_0x001e
            r3.d(r2)     // Catch:{ all -> 0x0011 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.k.d(com.bumptech.glide.request.d):void");
    }

    public boolean e() {
        boolean z10;
        synchronized (this.f39217b) {
            if (this.f39220e == e.a.CLEARED) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(com.bumptech.glide.request.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f39217b
            monitor-enter(r0)
            com.bumptech.glide.request.d r1 = r2.f39219d     // Catch:{ all -> 0x0011 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0011 }
            if (r3 == 0) goto L_0x0013
            com.bumptech.glide.request.e$a r3 = com.bumptech.glide.request.e.a.SUCCESS     // Catch:{ all -> 0x0011 }
            r2.f39221f = r3     // Catch:{ all -> 0x0011 }
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r3 = move-exception
            goto L_0x002d
        L_0x0013:
            com.bumptech.glide.request.e$a r3 = com.bumptech.glide.request.e.a.SUCCESS     // Catch:{ all -> 0x0011 }
            r2.f39220e = r3     // Catch:{ all -> 0x0011 }
            com.bumptech.glide.request.e r3 = r2.f39216a     // Catch:{ all -> 0x0011 }
            if (r3 == 0) goto L_0x001e
            r3.f(r2)     // Catch:{ all -> 0x0011 }
        L_0x001e:
            com.bumptech.glide.request.e$a r3 = r2.f39221f     // Catch:{ all -> 0x0011 }
            boolean r3 = r3.b()     // Catch:{ all -> 0x0011 }
            if (r3 != 0) goto L_0x002b
            com.bumptech.glide.request.d r3 = r2.f39219d     // Catch:{ all -> 0x0011 }
            r3.clear()     // Catch:{ all -> 0x0011 }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.k.f(com.bumptech.glide.request.d):void");
    }

    public boolean g() {
        boolean z10;
        synchronized (this.f39217b) {
            if (this.f39220e == e.a.SUCCESS) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public e getRoot() {
        e eVar;
        synchronized (this.f39217b) {
            try {
                e eVar2 = this.f39216a;
                if (eVar2 != null) {
                    eVar = eVar2.getRoot();
                } else {
                    eVar = this;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h(com.bumptech.glide.request.d r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.request.k
            r1 = 0
            if (r0 == 0) goto L_0x002e
            com.bumptech.glide.request.k r4 = (com.bumptech.glide.request.k) r4
            com.bumptech.glide.request.d r0 = r3.f39218c
            if (r0 != 0) goto L_0x0010
            com.bumptech.glide.request.d r0 = r4.f39218c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            com.bumptech.glide.request.d r0 = r3.f39218c
            com.bumptech.glide.request.d r2 = r4.f39218c
            boolean r0 = r0.h(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            com.bumptech.glide.request.d r0 = r3.f39219d
            if (r0 != 0) goto L_0x0023
            com.bumptech.glide.request.d r4 = r4.f39219d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            com.bumptech.glide.request.d r0 = r3.f39219d
            com.bumptech.glide.request.d r4 = r4.f39219d
            boolean r4 = r0.h(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.k.h(com.bumptech.glide.request.d):boolean");
    }

    public void i() {
        e.a aVar;
        e.a aVar2;
        synchronized (this.f39217b) {
            try {
                this.f39222g = true;
                if (!(this.f39220e == e.a.SUCCESS || this.f39221f == (aVar2 = e.a.RUNNING))) {
                    this.f39221f = aVar2;
                    this.f39219d.i();
                }
                if (this.f39222g && this.f39220e != (aVar = e.a.RUNNING)) {
                    this.f39220e = aVar;
                    this.f39218c.i();
                }
                this.f39222g = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean isRunning() {
        boolean z10;
        synchronized (this.f39217b) {
            if (this.f39220e == e.a.RUNNING) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean j(d dVar) {
        boolean z10;
        synchronized (this.f39217b) {
            try {
                if (!k() || !dVar.equals(this.f39218c) || this.f39220e == e.a.PAUSED) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void n(d dVar, d dVar2) {
        this.f39218c = dVar;
        this.f39219d = dVar2;
    }

    public void pause() {
        synchronized (this.f39217b) {
            try {
                if (!this.f39221f.b()) {
                    this.f39221f = e.a.PAUSED;
                    this.f39219d.pause();
                }
                if (!this.f39220e.b()) {
                    this.f39220e = e.a.PAUSED;
                    this.f39218c.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package com.bumptech.glide.request;

import com.bumptech.glide.request.e;

public final class b implements e, d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f39154a;

    /* renamed from: b  reason: collision with root package name */
    private final e f39155b;

    /* renamed from: c  reason: collision with root package name */
    private volatile d f39156c;

    /* renamed from: d  reason: collision with root package name */
    private volatile d f39157d;

    /* renamed from: e  reason: collision with root package name */
    private e.a f39158e;

    /* renamed from: f  reason: collision with root package name */
    private e.a f39159f;

    public b(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f39158e = aVar;
        this.f39159f = aVar;
        this.f39154a = obj;
        this.f39155b = eVar;
    }

    private boolean k(d dVar) {
        e.a aVar;
        e.a aVar2 = this.f39158e;
        e.a aVar3 = e.a.FAILED;
        if (aVar2 != aVar3) {
            return dVar.equals(this.f39156c);
        }
        if (!dVar.equals(this.f39157d) || ((aVar = this.f39159f) != e.a.SUCCESS && aVar != aVar3)) {
            return false;
        }
        return true;
    }

    private boolean l() {
        e eVar = this.f39155b;
        if (eVar == null || eVar.j(this)) {
            return true;
        }
        return false;
    }

    private boolean m() {
        e eVar = this.f39155b;
        if (eVar == null || eVar.a(this)) {
            return true;
        }
        return false;
    }

    private boolean n() {
        e eVar = this.f39155b;
        if (eVar == null || eVar.c(this)) {
            return true;
        }
        return false;
    }

    public boolean a(d dVar) {
        boolean z10;
        synchronized (this.f39154a) {
            try {
                if (!m() || !k(dVar)) {
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
        synchronized (this.f39154a) {
            try {
                if (!this.f39156c.b()) {
                    if (!this.f39157d.b()) {
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
        boolean n10;
        synchronized (this.f39154a) {
            n10 = n();
        }
        return n10;
    }

    public void clear() {
        synchronized (this.f39154a) {
            try {
                e.a aVar = e.a.CLEARED;
                this.f39158e = aVar;
                this.f39156c.clear();
                if (this.f39159f != aVar) {
                    this.f39159f = aVar;
                    this.f39157d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(com.bumptech.glide.request.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f39154a
            monitor-enter(r0)
            com.bumptech.glide.request.d r1 = r2.f39157d     // Catch:{ all -> 0x001d }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001d }
            if (r3 != 0) goto L_0x0021
            com.bumptech.glide.request.e$a r3 = com.bumptech.glide.request.e.a.FAILED     // Catch:{ all -> 0x001d }
            r2.f39158e = r3     // Catch:{ all -> 0x001d }
            com.bumptech.glide.request.e$a r3 = r2.f39159f     // Catch:{ all -> 0x001d }
            com.bumptech.glide.request.e$a r1 = com.bumptech.glide.request.e.a.RUNNING     // Catch:{ all -> 0x001d }
            if (r3 == r1) goto L_0x001f
            r2.f39159f = r1     // Catch:{ all -> 0x001d }
            com.bumptech.glide.request.d r3 = r2.f39157d     // Catch:{ all -> 0x001d }
            r3.i()     // Catch:{ all -> 0x001d }
            goto L_0x001f
        L_0x001d:
            r3 = move-exception
            goto L_0x002e
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x0021:
            com.bumptech.glide.request.e$a r3 = com.bumptech.glide.request.e.a.FAILED     // Catch:{ all -> 0x001d }
            r2.f39159f = r3     // Catch:{ all -> 0x001d }
            com.bumptech.glide.request.e r3 = r2.f39155b     // Catch:{ all -> 0x001d }
            if (r3 == 0) goto L_0x002c
            r3.d(r2)     // Catch:{ all -> 0x001d }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.b.d(com.bumptech.glide.request.d):void");
    }

    public boolean e() {
        boolean z10;
        synchronized (this.f39154a) {
            try {
                e.a aVar = this.f39158e;
                e.a aVar2 = e.a.CLEARED;
                if (aVar == aVar2 && this.f39159f == aVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void f(d dVar) {
        synchronized (this.f39154a) {
            try {
                if (dVar.equals(this.f39156c)) {
                    this.f39158e = e.a.SUCCESS;
                } else if (dVar.equals(this.f39157d)) {
                    this.f39159f = e.a.SUCCESS;
                }
                e eVar = this.f39155b;
                if (eVar != null) {
                    eVar.f(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean g() {
        boolean z10;
        synchronized (this.f39154a) {
            try {
                e.a aVar = this.f39158e;
                e.a aVar2 = e.a.SUCCESS;
                if (aVar != aVar2) {
                    if (this.f39159f != aVar2) {
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

    public e getRoot() {
        e eVar;
        synchronized (this.f39154a) {
            try {
                e eVar2 = this.f39155b;
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

    public boolean h(d dVar) {
        if (!(dVar instanceof b)) {
            return false;
        }
        b bVar = (b) dVar;
        if (!this.f39156c.h(bVar.f39156c) || !this.f39157d.h(bVar.f39157d)) {
            return false;
        }
        return true;
    }

    public void i() {
        synchronized (this.f39154a) {
            try {
                e.a aVar = this.f39158e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f39158e = aVar2;
                    this.f39156c.i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean isRunning() {
        boolean z10;
        synchronized (this.f39154a) {
            try {
                e.a aVar = this.f39158e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    if (this.f39159f != aVar2) {
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

    public boolean j(d dVar) {
        boolean z10;
        synchronized (this.f39154a) {
            try {
                if (!l() || !dVar.equals(this.f39156c)) {
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

    public void o(d dVar, d dVar2) {
        this.f39156c = dVar;
        this.f39157d = dVar2;
    }

    public void pause() {
        synchronized (this.f39154a) {
            try {
                e.a aVar = this.f39158e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar == aVar2) {
                    this.f39158e = e.a.PAUSED;
                    this.f39156c.pause();
                }
                if (this.f39159f == aVar2) {
                    this.f39159f = e.a.PAUSED;
                    this.f39157d.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package com.bumptech.glide.request;

import V4.q;
import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l5.i;
import l5.j;
import m5.C3775b;
import o5.l;

public class f implements c, g {

    /* renamed from: k  reason: collision with root package name */
    private static final a f39167k = new a();

    /* renamed from: a  reason: collision with root package name */
    private final int f39168a;

    /* renamed from: b  reason: collision with root package name */
    private final int f39169b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f39170c;

    /* renamed from: d  reason: collision with root package name */
    private final a f39171d;

    /* renamed from: e  reason: collision with root package name */
    private Object f39172e;

    /* renamed from: f  reason: collision with root package name */
    private d f39173f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f39174g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f39175h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f39176i;

    /* renamed from: j  reason: collision with root package name */
    private q f39177j;

    static class a {
        a() {
        }

        /* access modifiers changed from: package-private */
        public void a(Object obj) {
            obj.notifyAll();
        }

        /* access modifiers changed from: package-private */
        public void b(Object obj, long j10) {
            obj.wait(j10);
        }
    }

    public f(int i10, int i11) {
        this(i10, i11, true, f39167k);
    }

    private synchronized Object j(Long l10) {
        try {
            if (this.f39170c && !isDone()) {
                l.a();
            }
            if (this.f39174g) {
                throw new CancellationException();
            } else if (this.f39176i) {
                throw new ExecutionException(this.f39177j);
            } else if (this.f39175h) {
                return this.f39172e;
            } else {
                if (l10 == null) {
                    this.f39171d.b(this, 0);
                } else if (l10.longValue() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long longValue = l10.longValue() + currentTimeMillis;
                    while (!isDone() && currentTimeMillis < longValue) {
                        this.f39171d.b(this, longValue - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                }
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                } else if (this.f39176i) {
                    throw new ExecutionException(this.f39177j);
                } else if (this.f39174g) {
                    throw new CancellationException();
                } else if (this.f39175h) {
                    return this.f39172e;
                } else {
                    throw new TimeoutException();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized d a() {
        return this.f39173f;
    }

    public void c(Drawable drawable) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r1 == null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        r1.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x000a }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r2)     // Catch:{ all -> 0x000a }
            r3 = 0
            return r3
        L_0x000a:
            r3 = move-exception
            goto L_0x0023
        L_0x000c:
            r0 = 1
            r2.f39174g = r0     // Catch:{ all -> 0x000a }
            com.bumptech.glide.request.f$a r1 = r2.f39171d     // Catch:{ all -> 0x000a }
            r1.a(r2)     // Catch:{ all -> 0x000a }
            r1 = 0
            if (r3 == 0) goto L_0x001c
            com.bumptech.glide.request.d r3 = r2.f39173f     // Catch:{ all -> 0x000a }
            r2.f39173f = r1     // Catch:{ all -> 0x000a }
            r1 = r3
        L_0x001c:
            monitor-exit(r2)     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0022
            r1.clear()
        L_0x0022:
            return r0
        L_0x0023:
            monitor-exit(r2)     // Catch:{ all -> 0x000a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.f.cancel(boolean):boolean");
    }

    public void d(Drawable drawable) {
    }

    public synchronized void f(d dVar) {
        this.f39173f = dVar;
    }

    public synchronized void g(Drawable drawable) {
    }

    public Object get() {
        try {
            return j((Long) null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    public synchronized void h(Object obj, C3775b bVar) {
    }

    public void i(i iVar) {
        iVar.d(this.f39168a, this.f39169b);
    }

    public synchronized boolean isCancelled() {
        return this.f39174g;
    }

    public synchronized boolean isDone() {
        boolean z10;
        if (this.f39174g || this.f39175h || this.f39176i) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public void onDestroy() {
    }

    public synchronized boolean onLoadFailed(q qVar, Object obj, j jVar, boolean z10) {
        this.f39176i = true;
        this.f39177j = qVar;
        this.f39171d.a(this);
        return false;
    }

    public synchronized boolean onResourceReady(Object obj, Object obj2, j jVar, T4.a aVar, boolean z10) {
        this.f39175h = true;
        this.f39172e = obj;
        this.f39171d.a(this);
        return false;
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public String toString() {
        d dVar;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            try {
                dVar = null;
                if (this.f39174g) {
                    str = "CANCELLED";
                } else if (this.f39176i) {
                    str = "FAILURE";
                } else if (this.f39175h) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    dVar = this.f39173f;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (dVar != null) {
            return str2 + str + ", request=[" + dVar + "]]";
        }
        return str2 + str + "]";
    }

    f(int i10, int i11, boolean z10, a aVar) {
        this.f39168a = i10;
        this.f39169b = i11;
        this.f39170c = z10;
        this.f39171d = aVar;
    }

    public Object get(long j10, TimeUnit timeUnit) {
        return j(Long.valueOf(timeUnit.toMillis(j10)));
    }

    public void b(i iVar) {
    }
}

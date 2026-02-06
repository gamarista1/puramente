package com.google.firebase.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class p extends androidx.concurrent.futures.a implements ScheduledFuture {

    /* renamed from: h  reason: collision with root package name */
    private final ScheduledFuture f57113h;

    class a implements b {
        a() {
        }

        public void a(Throwable th2) {
            boolean unused = p.this.x(th2);
        }

        public void set(Object obj) {
            boolean unused = p.this.u(obj);
        }
    }

    interface b {
        void a(Throwable th2);

        void set(Object obj);
    }

    interface c {
        ScheduledFuture a(b bVar);
    }

    p(c cVar) {
        this.f57113h = cVar.a(new a());
    }

    /* renamed from: D */
    public int compareTo(Delayed delayed) {
        return this.f57113h.compareTo(delayed);
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.f57113h.cancel(z());
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.f57113h.getDelay(timeUnit);
    }
}

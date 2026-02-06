package com.reactnativecommunity.asyncstorage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class l implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque f59262a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    private Runnable f59263b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f59264c;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f59265a;

        a(Runnable runnable) {
            this.f59265a = runnable;
        }

        public void run() {
            try {
                this.f59265a.run();
            } finally {
                l.this.a();
            }
        }
    }

    public l(Executor executor) {
        this.f59264c = executor;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a() {
        Runnable runnable = (Runnable) this.f59262a.poll();
        this.f59263b = runnable;
        if (runnable != null) {
            this.f59264c.execute(runnable);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f59262a.offer(new a(runnable));
        if (this.f59263b == null) {
            a();
        }
    }
}

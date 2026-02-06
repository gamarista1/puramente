package com.google.firebase.perf.session.gauges;

import Ac.k;
import Ac.o;
import Bc.b;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import uc.C5233a;

public class l {

    /* renamed from: f  reason: collision with root package name */
    private static final C5233a f57763f = C5233a.e();

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f57764a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentLinkedQueue f57765b;

    /* renamed from: c  reason: collision with root package name */
    private final Runtime f57766c;

    /* renamed from: d  reason: collision with root package name */
    private ScheduledFuture f57767d;

    /* renamed from: e  reason: collision with root package name */
    private long f57768e;

    l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    private int d() {
        return o.c(k.BYTES.b(this.f57766c.totalMemory() - this.f57766c.freeMemory()));
    }

    public static boolean e(long j10) {
        return j10 <= 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(Ac.l lVar) {
        b l10 = l(lVar);
        if (l10 != null) {
            this.f57765b.add(l10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(Ac.l lVar) {
        b l10 = l(lVar);
        if (l10 != null) {
            this.f57765b.add(l10);
        }
    }

    private synchronized void h(Ac.l lVar) {
        try {
            this.f57764a.schedule(new k(this, lVar), 0, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            C5233a aVar = f57763f;
            aVar.j("Unable to collect Memory Metric: " + e10.getMessage());
        }
    }

    private synchronized void i(long j10, Ac.l lVar) {
        this.f57768e = j10;
        try {
            this.f57767d = this.f57764a.scheduleAtFixedRate(new j(this, lVar), 0, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            C5233a aVar = f57763f;
            aVar.j("Unable to start collecting Memory Metrics: " + e10.getMessage());
        }
    }

    private b l(Ac.l lVar) {
        if (lVar == null) {
            return null;
        }
        return (b) b.W().z(lVar.b()).A(d()).q();
    }

    public void c(Ac.l lVar) {
        h(lVar);
    }

    public void j(long j10, Ac.l lVar) {
        if (!e(j10)) {
            if (this.f57767d == null) {
                i(j10, lVar);
            } else if (this.f57768e != j10) {
                k();
                i(j10, lVar);
            }
        }
    }

    public void k() {
        ScheduledFuture scheduledFuture = this.f57767d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f57767d = null;
            this.f57768e = -1;
        }
    }

    l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f57767d = null;
        this.f57768e = -1;
        this.f57764a = scheduledExecutorService;
        this.f57765b = new ConcurrentLinkedQueue();
        this.f57766c = runtime;
    }
}

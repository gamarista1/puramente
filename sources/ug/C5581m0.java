package Ug;

import Zg.C5714c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import qf.g;

/* renamed from: Ug.m0  reason: case insensitive filesystem */
public final class C5581m0 extends C5579l0 implements U {

    /* renamed from: d  reason: collision with root package name */
    private final Executor f65396d;

    public C5581m0(Executor executor) {
        this.f65396d = executor;
        C5714c.a(E1());
    }

    private final void D1(g gVar, RejectedExecutionException rejectedExecutionException) {
        A0.d(gVar, C5577k0.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture F1(ScheduledExecutorService scheduledExecutorService, Runnable runnable, g gVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            D1(gVar, e10);
            return null;
        }
    }

    public Executor E1() {
        return this.f65396d;
    }

    public C5559b0 I0(long j10, Runnable runnable, g gVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor E12 = E1();
        ScheduledFuture scheduledFuture = null;
        if (E12 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) E12;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = F1(scheduledExecutorService, runnable, gVar, j10);
        }
        if (scheduledFuture != null) {
            return new C5557a0(scheduledFuture);
        }
        return P.f65329i.I0(j10, runnable, gVar);
    }

    public void close() {
        ExecutorService executorService;
        Executor E12 = E1();
        if (E12 instanceof ExecutorService) {
            executorService = (ExecutorService) E12;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5581m0) || ((C5581m0) obj).E1() != E1()) {
            return false;
        }
        return true;
    }

    public void g0(long j10, C5582n nVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor E12 = E1();
        ScheduledFuture scheduledFuture = null;
        if (E12 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) E12;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = F1(scheduledExecutorService, new Q0(this, nVar), nVar.getContext(), j10);
        }
        if (scheduledFuture != null) {
            A0.j(nVar, scheduledFuture);
        } else {
            P.f65329i.g0(j10, nVar);
        }
    }

    public int hashCode() {
        return System.identityHashCode(E1());
    }

    public String toString() {
        return E1().toString();
    }

    public void z1(g gVar, Runnable runnable) {
        try {
            Executor E12 = E1();
            C5560c.a();
            E12.execute(runnable);
        } catch (RejectedExecutionException e10) {
            C5560c.a();
            D1(gVar, e10);
            Z.b().z1(gVar, runnable);
        }
    }
}

package com.google.firebase.perf.session.gauges;

import Ac.l;
import Bc.e;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import uc.C5233a;

public class c {

    /* renamed from: g  reason: collision with root package name */
    private static final C5233a f57740g = C5233a.e();

    /* renamed from: h  reason: collision with root package name */
    private static final long f57741h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentLinkedQueue f57742a = new ConcurrentLinkedQueue();

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f57743b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c  reason: collision with root package name */
    private final String f57744c;

    /* renamed from: d  reason: collision with root package name */
    private final long f57745d;

    /* renamed from: e  reason: collision with root package name */
    private ScheduledFuture f57746e = null;

    /* renamed from: f  reason: collision with root package name */
    private long f57747f = -1;

    c() {
        int myPid = Process.myPid();
        this.f57744c = "/proc/" + Integer.toString(myPid) + "/stat";
        this.f57745d = e();
    }

    private long d(long j10) {
        return Math.round((((double) j10) / ((double) this.f57745d)) * ((double) f57741h));
    }

    private long e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public static boolean f(long j10) {
        return j10 <= 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(l lVar) {
        e m10 = m(lVar);
        if (m10 != null) {
            this.f57742a.add(m10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(l lVar) {
        e m10 = m(lVar);
        if (m10 != null) {
            this.f57742a.add(m10);
        }
    }

    private synchronized void i(l lVar) {
        try {
            this.f57743b.schedule(new b(this, lVar), 0, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            C5233a aVar = f57740g;
            aVar.j("Unable to collect Cpu Metric: " + e10.getMessage());
        }
    }

    private synchronized void j(long j10, l lVar) {
        this.f57747f = j10;
        try {
            this.f57746e = this.f57743b.scheduleAtFixedRate(new a(this, lVar), 0, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            C5233a aVar = f57740g;
            aVar.j("Unable to start collecting Cpu Metrics: " + e10.getMessage());
        }
    }

    private e m(l lVar) {
        BufferedReader bufferedReader;
        if (lVar == null) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(this.f57744c));
            long b10 = lVar.b();
            String[] split = bufferedReader.readLine().split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            long parseLong = Long.parseLong(split[13]);
            long parseLong2 = Long.parseLong(split[15]);
            e eVar = (e) e.X().z(b10).A(d(Long.parseLong(split[14]) + Long.parseLong(split[16]))).B(d(parseLong + parseLong2)).q();
            bufferedReader.close();
            return eVar;
        } catch (IOException e10) {
            C5233a aVar = f57740g;
            aVar.j("Unable to read 'proc/[pid]/stat' file: " + e10.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e11) {
            C5233a aVar2 = f57740g;
            aVar2.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e11.getMessage());
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public void c(l lVar) {
        i(lVar);
    }

    public void k(long j10, l lVar) {
        long j11 = this.f57745d;
        if (j11 != -1 && j11 != 0 && !f(j10)) {
            if (this.f57746e == null) {
                j(j10, lVar);
            } else if (this.f57747f != j10) {
                l();
                j(j10, lVar);
            }
        }
    }

    public void l() {
        ScheduledFuture scheduledFuture = this.f57746e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f57746e = null;
            this.f57747f = -1;
        }
    }
}

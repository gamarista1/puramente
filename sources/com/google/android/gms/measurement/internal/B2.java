package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.C4536s;
import java.util.concurrent.BlockingQueue;

final class B2 extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final Object f54455a;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue f54456b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f54457c = false;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C4734z2 f54458d;

    public B2(C4734z2 z2Var, String str, BlockingQueue blockingQueue) {
        this.f54458d = z2Var;
        C4536s.l(str);
        C4536s.l(blockingQueue);
        this.f54455a = new Object();
        this.f54456b = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        X1 G10 = this.f54458d.zzj().G();
        String name = getName();
        G10.b(name + " was interrupted", interruptedException);
    }

    private final void c() {
        synchronized (this.f54458d.f55430i) {
            try {
                if (!this.f54457c) {
                    this.f54458d.f55431j.release();
                    this.f54458d.f55430i.notifyAll();
                    if (this == this.f54458d.f55424c) {
                        this.f54458d.f55424c = null;
                    } else if (this == this.f54458d.f55425d) {
                        this.f54458d.f55425d = null;
                    } else {
                        this.f54458d.zzj().B().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f54457c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        synchronized (this.f54455a) {
            this.f54455a.notifyAll();
        }
    }

    public final void run() {
        int i10;
        boolean z10 = false;
        while (!z10) {
            try {
                this.f54458d.f55431j.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                b(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C2 c22 = (C2) this.f54456b.poll();
                if (c22 != null) {
                    if (c22.f54474b) {
                        i10 = threadPriority;
                    } else {
                        i10 = 10;
                    }
                    Process.setThreadPriority(i10);
                    c22.run();
                } else {
                    synchronized (this.f54455a) {
                        if (this.f54456b.peek() == null && !this.f54458d.f55432k) {
                            try {
                                this.f54455a.wait(30000);
                            } catch (InterruptedException e11) {
                                b(e11);
                            }
                        }
                    }
                    synchronized (this.f54458d.f55430i) {
                        if (this.f54456b.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }
}

package com.amazon.a.a.n.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.amazon.a.a.n.a;
import com.amazon.a.a.o.c;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class b implements c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final c f37414a = new c("SimpleTaskPipeline");

    /* renamed from: b  reason: collision with root package name */
    private final Handler f37415b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Set<Runnable> f37416c = Collections.synchronizedSet(new HashSet());
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String f37417d;

    private b(HandlerThread handlerThread) {
        this.f37417d = handlerThread.getName();
        handlerThread.start();
        this.f37415b = new Handler(handlerThread.getLooper());
    }

    private Runnable c(final a aVar) {
        AnonymousClass1 r02 = new Runnable() {
            public void run() {
                StringBuilder sb2;
                c cVar;
                b.this.f37416c.remove(this);
                try {
                    if (c.f37534a) {
                        c b10 = b.f37414a;
                        b10.a(b.this.f37417d + ": Executing Task: " + aVar + ", current time: " + new Date() + ", uptime: " + SystemClock.uptimeMillis());
                    }
                    aVar.a();
                    if (c.f37534a) {
                        cVar = b.f37414a;
                        sb2 = new StringBuilder();
                        sb2.append(b.this.f37417d);
                        sb2.append(": Task finished executing: ");
                        sb2.append(aVar);
                        cVar.a(sb2.toString());
                    }
                } catch (Throwable th2) {
                    if (c.f37534a) {
                        c b11 = b.f37414a;
                        b11.a(b.this.f37417d + ": Task finished executing: " + aVar);
                    }
                    throw th2;
                }
            }

            public String toString() {
                return aVar.toString();
            }
        };
        this.f37416c.add(r02);
        return r02;
    }

    public static b a(String str) {
        return new b(new HandlerThread("KIWI_" + str));
    }

    public static b b(String str) {
        return new b(str);
    }

    public void a(a aVar) {
        if (c.f37534a) {
            c cVar = f37414a;
            cVar.a("Scheduling task: " + aVar);
        }
        this.f37415b.post(c(aVar));
    }

    public void b(a aVar) {
        if (c.f37534a) {
            c cVar = f37414a;
            cVar.a(this.f37417d + ": Scheduling task immediately: " + aVar);
        }
        this.f37415b.postAtFrontOfQueue(c(aVar));
    }

    private b(String str) {
        this.f37417d = str;
        this.f37415b = new Handler();
    }

    public void a(a aVar, Date date) {
        long a10 = a(date);
        if (c.f37534a) {
            c cVar = f37414a;
            cVar.a(this.f37417d + ": Scheduling task: " + aVar + ", at time: " + date + ", System uptimeMillis: " + System.currentTimeMillis() + ", uptimeMillis: " + a10);
        }
        this.f37415b.postAtTime(c(aVar), a10);
    }

    private long a(Date date) {
        return SystemClock.uptimeMillis() + (date.getTime() - System.currentTimeMillis());
    }

    public void a(a aVar, long j10) {
        if (c.f37534a) {
            c cVar = f37414a;
            cVar.a(this.f37417d + ": Scheduling task: " + aVar + ", with delay: " + j10);
        }
        this.f37415b.postDelayed(c(aVar), j10);
    }

    public void a() {
        for (Runnable next : this.f37416c) {
            if (c.f37534a) {
                c cVar = f37414a;
                cVar.a(this.f37417d + ": Removing callback: " + next);
            }
            this.f37415b.removeCallbacks(next);
        }
        this.f37416c.clear();
        if (this.f37415b.getLooper() != Looper.getMainLooper() && this.f37415b.getLooper().getThread().isAlive()) {
            c cVar2 = f37414a;
            cVar2.a("Interrupting looper thread!");
            this.f37415b.getLooper().getThread().interrupt();
            cVar2.a("Quitting looper: " + this.f37415b.getLooper().getThread() + ", " + this.f37415b.getLooper().getThread().isAlive());
            this.f37415b.getLooper().quit();
        }
    }
}

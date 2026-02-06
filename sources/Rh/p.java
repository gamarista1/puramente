package rh;

import com.google.android.gms.common.api.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import sh.C6726e;
import wh.C6775e;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private int f73447a = 64;

    /* renamed from: b  reason: collision with root package name */
    private int f73448b = 5;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f73449c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f73450d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque f73451e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque f73452f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque f73453g = new ArrayDeque();

    private final C6775e.a d(String str) {
        Iterator it = this.f73452f.iterator();
        while (it.hasNext()) {
            C6775e.a aVar = (C6775e.a) it.next();
            if (C6496s.c(aVar.d(), str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f73451e.iterator();
        while (it2.hasNext()) {
            C6775e.a aVar2 = (C6775e.a) it2.next();
            if (C6496s.c(aVar2.d(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    private final void e(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(obj)) {
                runnable = this.f73449c;
                C6514M m10 = C6514M.f71813a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!i() && runnable != null) {
            runnable.run();
        }
    }

    private final boolean i() {
        int i10;
        boolean z10;
        if (!C6726e.f73547h || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    Iterator it = this.f73451e.iterator();
                    C6496s.g(it, "readyAsyncCalls.iterator()");
                    while (it.hasNext()) {
                        C6775e.a aVar = (C6775e.a) it.next();
                        if (this.f73452f.size() >= this.f73447a) {
                            break;
                        } else if (aVar.c().get() < this.f73448b) {
                            it.remove();
                            aVar.c().incrementAndGet();
                            C6496s.g(aVar, "asyncCall");
                            arrayList.add(aVar);
                            this.f73452f.add(aVar);
                        }
                    }
                    if (l() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    C6514M m10 = C6514M.f71813a;
                } finally {
                }
            }
            int size = arrayList.size();
            for (i10 = 0; i10 < size; i10++) {
                ((C6775e.a) arrayList.get(i10)).a(c());
            }
            return z10;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void a(C6775e.a aVar) {
        C6775e.a d10;
        C6496s.h(aVar, "call");
        synchronized (this) {
            try {
                this.f73451e.add(aVar);
                if (!aVar.b().p() && (d10 = d(aVar.d())) != null) {
                    aVar.e(d10);
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i();
    }

    public final synchronized void b(C6775e eVar) {
        C6496s.h(eVar, "call");
        this.f73453g.add(eVar);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        try {
            if (this.f73450d == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                this.f73450d = new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, 60, timeUnit, synchronousQueue, C6726e.N(C6726e.f73548i + " Dispatcher", false));
            }
            executorService = this.f73450d;
            C6496s.e(executorService);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return executorService;
    }

    public final void f(C6775e.a aVar) {
        C6496s.h(aVar, "call");
        aVar.c().decrementAndGet();
        e(this.f73452f, aVar);
    }

    public final void g(C6775e eVar) {
        C6496s.h(eVar, "call");
        e(this.f73453g, eVar);
    }

    public final synchronized int h() {
        return this.f73447a;
    }

    public final synchronized List j() {
        List unmodifiableList;
        try {
            ArrayDeque<C6775e.a> arrayDeque = this.f73451e;
            ArrayList arrayList = new ArrayList(C6565s.y(arrayDeque, 10));
            for (C6775e.a b10 : arrayDeque) {
                arrayList.add(b10.b());
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
            C6496s.g(unmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return unmodifiableList;
    }

    public final synchronized List k() {
        List unmodifiableList;
        try {
            ArrayDeque arrayDeque = this.f73453g;
            ArrayDeque<C6775e.a> arrayDeque2 = this.f73452f;
            ArrayList arrayList = new ArrayList(C6565s.y(arrayDeque2, 10));
            for (C6775e.a b10 : arrayDeque2) {
                arrayList.add(b10.b());
            }
            unmodifiableList = Collections.unmodifiableList(C6565s.K0(arrayDeque, arrayList));
            C6496s.g(unmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return unmodifiableList;
    }

    public final synchronized int l() {
        return this.f73452f.size() + this.f73453g.size();
    }

    public final synchronized void m(Runnable runnable) {
        this.f73449c = runnable;
    }

    public final void n(int i10) {
        if (i10 >= 1) {
            synchronized (this) {
                this.f73447a = i10;
                C6514M m10 = C6514M.f71813a;
            }
            i();
            return;
        }
        throw new IllegalArgumentException(("max < 1: " + i10).toString());
    }
}

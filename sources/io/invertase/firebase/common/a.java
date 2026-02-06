package io.invertase.firebase.common;

import Ue.i;
import Ue.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class a {

    /* renamed from: e  reason: collision with root package name */
    private static final Map f71257e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final String f71258a;

    /* renamed from: b  reason: collision with root package name */
    private final int f71259b;

    /* renamed from: c  reason: collision with root package name */
    private final int f71260c;

    /* renamed from: d  reason: collision with root package name */
    private final RejectedExecutionHandler f71261d = new n(this);

    a(String str) {
        this.f71258a = str;
        i g10 = i.g();
        this.f71259b = g10.d("android_task_executor_maximum_pool_size", 1);
        this.f71260c = g10.d("android_task_executor_keep_alive_seconds", 3);
    }

    private ExecutorService e(boolean z10) {
        if (z10) {
            return Executors.newSingleThreadExecutor();
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, this.f71259b, (long) this.f71260c, TimeUnit.SECONDS, new SynchronousQueue());
        threadPoolExecutor.setRejectedExecutionHandler(this.f71261d);
        return threadPoolExecutor;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (!threadPoolExecutor.isShutdown() && !threadPoolExecutor.isTerminated() && !threadPoolExecutor.isTerminating()) {
            f().execute(runnable);
        }
    }

    public ExecutorService b() {
        boolean z10 = true;
        if (this.f71259b > 1) {
            z10 = false;
        }
        return c(z10, "");
    }

    public ExecutorService c(boolean z10, String str) {
        String d10 = d(z10, str);
        Map map = f71257e;
        synchronized (map) {
            try {
                ExecutorService executorService = (ExecutorService) map.get(d10);
                if (executorService != null) {
                    return executorService;
                }
                ExecutorService e10 = e(z10);
                map.put(d10, e10);
                return e10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String d(boolean z10, String str) {
        if (z10) {
            return this.f71258a + "TransactionalExecutor" + str;
        }
        return this.f71258a + "Executor" + str;
    }

    public ExecutorService f() {
        return c(true, "");
    }

    public ExecutorService g(String str) {
        if (this.f71259b == 0) {
            str = "";
        }
        return c(true, str);
    }

    public void i(String str) {
        Map map = f71257e;
        synchronized (map) {
            try {
                ExecutorService executorService = (ExecutorService) map.get(str);
                if (executorService != null) {
                    executorService.shutdownNow();
                    map.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j() {
        Map map = f71257e;
        synchronized (map) {
            try {
                for (String str : new ArrayList(map.keySet())) {
                    if (!str.startsWith(this.f71258a)) {
                        f71257e.remove(str);
                    } else {
                        i(str);
                    }
                }
            } finally {
            }
        }
    }
}

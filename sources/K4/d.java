package K4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class d {
    public static final ExecutorService b(String str, t tVar, boolean z10) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        c cVar = new c(str, tVar);
        return new ThreadPoolExecutor(z10 ? 1 : 0, 1, 30, TimeUnit.SECONDS, linkedBlockingQueue, cVar);
    }

    /* access modifiers changed from: private */
    public static final Thread c(String str, t tVar, Runnable runnable) {
        return new u(runnable, str, tVar);
    }

    public static final t d(Thread thread) {
        u uVar;
        if (thread instanceof u) {
            uVar = (u) thread;
        } else {
            uVar = null;
        }
        if (uVar == null) {
            return null;
        }
        return uVar.a();
    }
}

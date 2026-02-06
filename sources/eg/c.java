package Eg;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

public final class c extends d {

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f62837c;

    /* renamed from: d  reason: collision with root package name */
    private final C6798l f62838d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Lock lock, Runnable runnable, C6798l lVar) {
        super(lock);
        C6496s.h(lock, "lock");
        C6496s.h(runnable, "checkCancelled");
        C6496s.h(lVar, "interruptedExceptionHandler");
        this.f62837c = runnable;
        this.f62838d = lVar;
    }

    public void lock() {
        while (!a().tryLock(50, TimeUnit.MILLISECONDS)) {
            try {
                this.f62837c.run();
            } catch (InterruptedException e10) {
                this.f62838d.invoke(e10);
                return;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(Runnable runnable, C6798l lVar) {
        this(new ReentrantLock(), runnable, lVar);
        C6496s.h(runnable, "checkCancelled");
        C6496s.h(lVar, "interruptedExceptionHandler");
    }
}

package H4;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class g implements ThreadFactory {

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicInteger f31660d = new AtomicInteger(1);

    /* renamed from: a  reason: collision with root package name */
    private final ThreadGroup f31661a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f31662b = new AtomicInteger(1);

    /* renamed from: c  reason: collision with root package name */
    private final String f31663c;

    public g() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            threadGroup = Thread.currentThread().getThreadGroup();
        } else {
            threadGroup = securityManager.getThreadGroup();
        }
        this.f31661a = threadGroup;
        this.f31663c = "lottie-" + f31660d.getAndIncrement() + "-thread-";
    }

    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f31661a;
        Thread thread = new Thread(threadGroup, runnable, this.f31663c + this.f31662b.getAndIncrement(), 0);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}

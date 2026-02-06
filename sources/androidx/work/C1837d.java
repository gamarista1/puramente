package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C6496s;

/* renamed from: androidx.work.d  reason: case insensitive filesystem */
public abstract class C1837d {

    /* renamed from: a  reason: collision with root package name */
    private static final int f18712a = 8;

    /* renamed from: androidx.work.d$a */
    public static final class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f18713a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f18714b;

        a(boolean z10) {
            this.f18714b = z10;
        }

        public Thread newThread(Runnable runnable) {
            String str;
            C6496s.h(runnable, "runnable");
            if (this.f18714b) {
                str = "WM.task-";
            } else {
                str = "androidx.work-";
            }
            return new Thread(runnable, str + this.f18713a.incrementAndGet());
        }
    }

    /* access modifiers changed from: private */
    public static final Executor b(boolean z10) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(z10));
        C6496s.g(newFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return newFixedThreadPool;
    }

    public static final int c() {
        return f18712a;
    }
}

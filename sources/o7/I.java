package o7;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.C6496s;

public final class I {

    /* renamed from: a  reason: collision with root package name */
    private Object f47110a;

    /* renamed from: b  reason: collision with root package name */
    private CountDownLatch f47111b = new CountDownLatch(1);

    public I(Callable callable) {
        C6496s.h(callable, "callable");
        com.facebook.I.t().execute(new FutureTask(new H(this, callable)));
    }

    /* access modifiers changed from: private */
    public static final Void b(I i10, Callable callable) {
        C6496s.h(i10, "this$0");
        C6496s.h(callable, "$callable");
        try {
            i10.f47110a = callable.call();
        } finally {
            CountDownLatch countDownLatch = i10.f47111b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}

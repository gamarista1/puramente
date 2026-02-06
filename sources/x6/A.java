package X6;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C6496s;

public final class A implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final int f35043a;

    /* renamed from: b  reason: collision with root package name */
    private final String f35044b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f35045c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicInteger f35046d = new AtomicInteger(1);

    public A(int i10, String str, boolean z10) {
        C6496s.h(str, "prefix");
        this.f35043a = i10;
        this.f35044b = str;
        this.f35045c = z10;
    }

    /* access modifiers changed from: private */
    public static final void b(A a10, Runnable runnable) {
        C6496s.h(a10, "this$0");
        C6496s.h(runnable, "$runnable");
        try {
            Process.setThreadPriority(a10.f35043a);
        } catch (Throwable unused) {
        }
        runnable.run();
    }

    public Thread newThread(Runnable runnable) {
        String str;
        C6496s.h(runnable, "runnable");
        z zVar = new z(this, runnable);
        if (this.f35045c) {
            str = this.f35044b + "-" + this.f35046d.getAndIncrement();
        } else {
            str = this.f35044b;
        }
        return new Thread(zVar, str);
    }
}

package u3;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

/* renamed from: u3.C  reason: case insensitive filesystem */
public final class C2708C implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f26588a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque f26589b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private Runnable f26590c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f26591d = new Object();

    public C2708C(Executor executor) {
        C6496s.h(executor, "executor");
        this.f26588a = executor;
    }

    /* access modifiers changed from: private */
    public static final void b(Runnable runnable, C2708C c10) {
        C6496s.h(runnable, "$command");
        C6496s.h(c10, "this$0");
        try {
            runnable.run();
        } finally {
            c10.c();
        }
    }

    public final void c() {
        synchronized (this.f26591d) {
            try {
                Object poll = this.f26589b.poll();
                Runnable runnable = (Runnable) poll;
                this.f26590c = runnable;
                if (poll != null) {
                    this.f26588a.execute(runnable);
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void execute(Runnable runnable) {
        C6496s.h(runnable, "command");
        synchronized (this.f26591d) {
            try {
                this.f26589b.offer(new C2707B(runnable, this));
                if (this.f26590c == null) {
                    c();
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package We;

import java.io.Closeable;
import p003if.h;

public final class W0 implements J, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final Runtime f65763a;

    /* renamed from: b  reason: collision with root package name */
    private Thread f65764b;

    public W0(Runtime runtime) {
        this.f65763a = (Runtime) h.c(runtime, "Runtime is required");
    }

    private void b(Runnable runnable) {
        try {
            runnable.run();
        } catch (IllegalStateException e10) {
            String message = e10.getMessage();
            if (message == null || (!message.equals("Shutdown in progress") && !message.equals("VM already shutting down"))) {
                throw e10;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f65763a.removeShutdownHook(this.f65764b);
    }

    public void close() {
        if (this.f65764b != null) {
            b(new V0(this));
        }
    }

    public W0() {
        this(Runtime.getRuntime());
    }
}

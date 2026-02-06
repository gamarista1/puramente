package Fa;

import android.os.Process;

/* renamed from: Fa.c  reason: case insensitive filesystem */
final class C4288c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f50776a;

    public C4288c(Runnable runnable, int i10) {
        this.f50776a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f50776a.run();
    }
}

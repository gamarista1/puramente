package androidx.lifecycle;

import Ug.I0;
import Ug.Z;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.jvm.internal.C6496s;
import qf.g;

/* renamed from: androidx.lifecycle.g  reason: case insensitive filesystem */
public final class C1784g {

    /* renamed from: a  reason: collision with root package name */
    private boolean f17220a = true;

    /* renamed from: b  reason: collision with root package name */
    private boolean f17221b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17222c;

    /* renamed from: d  reason: collision with root package name */
    private final Queue f17223d = new ArrayDeque();

    /* access modifiers changed from: private */
    public static final void d(C1784g gVar, Runnable runnable) {
        C6496s.h(gVar, "this$0");
        C6496s.h(runnable, "$runnable");
        gVar.f(runnable);
    }

    private final void f(Runnable runnable) {
        if (this.f17223d.offer(runnable)) {
            e();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables");
    }

    public final boolean b() {
        if (this.f17221b || !this.f17220a) {
            return true;
        }
        return false;
    }

    public final void c(g gVar, Runnable runnable) {
        C6496s.h(gVar, "context");
        C6496s.h(runnable, "runnable");
        I0 D12 = Z.c().D1();
        if (D12.B1(gVar) || b()) {
            D12.z1(gVar, new C1783f(this, runnable));
        } else {
            f(runnable);
        }
    }

    public final void e() {
        if (!this.f17222c) {
            boolean z10 = true;
            z10 = false;
            try {
                while (true) {
                    if (this.f17223d.isEmpty()) {
                        break;
                    } else if (!b()) {
                        break;
                    } else {
                        Runnable runnable = (Runnable) this.f17223d.poll();
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                this.f17222c = z10;
            } finally {
                this.f17222c = z10;
            }
        }
    }

    public final void g() {
        this.f17221b = true;
        e();
    }

    public final void h() {
        this.f17220a = true;
    }

    public final void i() {
        if (this.f17220a) {
            if (!this.f17221b) {
                this.f17220a = false;
                e();
                return;
            }
            throw new IllegalStateException("Cannot resume a finished dispatcher");
        }
    }
}

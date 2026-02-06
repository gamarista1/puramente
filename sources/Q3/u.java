package Q3;

import androidx.work.impl.A;
import androidx.work.impl.C1860u;
import androidx.work.s;
import kotlin.jvm.internal.C6496s;

public final class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1860u f5478a;

    /* renamed from: b  reason: collision with root package name */
    private final A f5479b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5480c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5481d;

    public u(C1860u uVar, A a10, boolean z10, int i10) {
        C6496s.h(uVar, "processor");
        C6496s.h(a10, "token");
        this.f5478a = uVar;
        this.f5479b = a10;
        this.f5480c = z10;
        this.f5481d = i10;
    }

    public void run() {
        boolean z10;
        if (this.f5480c) {
            z10 = this.f5478a.v(this.f5479b, this.f5481d);
        } else {
            z10 = this.f5478a.w(this.f5479b, this.f5481d);
        }
        s e10 = s.e();
        String i10 = s.i("StopWorkRunnable");
        e10.a(i10, "StopWorkRunnable for " + this.f5479b.a().b() + "; Processor.stopWork = " + z10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public u(C1860u uVar, A a10, boolean z10) {
        this(uVar, a10, z10, -512);
        C6496s.h(uVar, "processor");
        C6496s.h(a10, "token");
    }
}

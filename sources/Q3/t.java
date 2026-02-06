package Q3;

import androidx.work.WorkerParameters;
import androidx.work.impl.A;
import androidx.work.impl.C1860u;
import kotlin.jvm.internal.C6496s;

public final class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1860u f5475a;

    /* renamed from: b  reason: collision with root package name */
    private final A f5476b;

    /* renamed from: c  reason: collision with root package name */
    private final WorkerParameters.a f5477c;

    public t(C1860u uVar, A a10, WorkerParameters.a aVar) {
        C6496s.h(uVar, "processor");
        C6496s.h(a10, "startStopToken");
        this.f5475a = uVar;
        this.f5476b = a10;
        this.f5477c = aVar;
    }

    public void run() {
        this.f5475a.s(this.f5476b, this.f5477c);
    }
}

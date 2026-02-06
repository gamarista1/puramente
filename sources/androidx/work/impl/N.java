package androidx.work.impl;

import androidx.work.WorkerParameters;
import kotlin.jvm.internal.C6496s;

public interface N {
    void a(A a10, WorkerParameters.a aVar);

    void b(A a10, int i10) {
        C6496s.h(a10, "workSpecId");
        d(a10, i10);
    }

    void c(A a10) {
        C6496s.h(a10, "workSpecId");
        a(a10, (WorkerParameters.a) null);
    }

    void d(A a10, int i10);

    void e(A a10) {
        C6496s.h(a10, "workSpecId");
        d(a10, -512);
    }
}

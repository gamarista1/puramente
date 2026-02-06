package androidx.work.impl;

import Q3.t;
import Q3.u;
import R3.b;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.C6496s;

public final class O implements N {

    /* renamed from: a  reason: collision with root package name */
    private final C1860u f18767a;

    /* renamed from: b  reason: collision with root package name */
    private final b f18768b;

    public O(C1860u uVar, b bVar) {
        C6496s.h(uVar, "processor");
        C6496s.h(bVar, "workTaskExecutor");
        this.f18767a = uVar;
        this.f18768b = bVar;
    }

    public void a(A a10, WorkerParameters.a aVar) {
        C6496s.h(a10, "workSpecId");
        this.f18768b.d(new t(this.f18767a, a10, aVar));
    }

    public void d(A a10, int i10) {
        C6496s.h(a10, "workSpecId");
        this.f18768b.d(new u(this.f18767a, a10, false, i10));
    }
}

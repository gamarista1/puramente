package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import kc.C5066d;

class e implements h {

    /* renamed from: a  reason: collision with root package name */
    private final i f57377a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource f57378b;

    public e(i iVar, TaskCompletionSource taskCompletionSource) {
        this.f57377a = iVar;
        this.f57378b = taskCompletionSource;
    }

    public boolean a(Exception exc) {
        this.f57378b.trySetException(exc);
        return true;
    }

    public boolean b(C5066d dVar) {
        if (!dVar.k() || this.f57377a.f(dVar)) {
            return false;
        }
        this.f57378b.setResult(g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}

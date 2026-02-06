package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import kc.C5066d;

class f implements h {

    /* renamed from: a  reason: collision with root package name */
    final TaskCompletionSource f57379a;

    public f(TaskCompletionSource taskCompletionSource) {
        this.f57379a = taskCompletionSource;
    }

    public boolean a(Exception exc) {
        return false;
    }

    public boolean b(C5066d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f57379a.trySetResult(dVar.d());
        return true;
    }
}

package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class r implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f57912a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f57913b;

    public /* synthetic */ r(t tVar, Task task) {
        this.f57912a = tVar;
        this.f57913b = task;
    }

    public final Object then(Task task) {
        return this.f57912a.q(this.f57913b, task);
    }
}

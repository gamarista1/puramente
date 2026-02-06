package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class s implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f57914a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f57915b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f57916c;

    public /* synthetic */ s(t tVar, Task task, Task task2) {
        this.f57914a = tVar;
        this.f57915b = task;
        this.f57916c = task2;
    }

    public final Object then(Task task) {
        return this.f57914a.r(this.f57915b, this.f57916c, task);
    }
}

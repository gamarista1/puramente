package com.google.firebase.functions;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class j implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f57208a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f57209b;

    public /* synthetic */ j(n nVar, v vVar) {
        this.f57208a = nVar;
        this.f57209b = vVar;
    }

    public final Object then(Task task) {
        return this.f57208a.q(this.f57209b, task);
    }
}

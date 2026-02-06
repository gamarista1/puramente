package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class j implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final k f57311a;

    j(k kVar) {
        this.f57311a = kVar;
    }

    public Object then(Task task) {
        return this.f57311a.h(task);
    }
}

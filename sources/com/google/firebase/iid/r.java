package com.google.firebase.iid;

import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class r implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final s f57328a;

    /* renamed from: b  reason: collision with root package name */
    private final Pair f57329b;

    r(s sVar, Pair pair) {
        this.f57328a = sVar;
        this.f57329b = pair;
    }

    public Object then(Task task) {
        this.f57328a.b(this.f57329b, task);
        return task;
    }
}

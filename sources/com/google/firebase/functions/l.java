package com.google.firebase.functions;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class l implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f57214a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f57215b;

    public /* synthetic */ l(n nVar, v vVar) {
        this.f57214a = nVar;
        this.f57215b = vVar;
    }

    public final Object then(Task task) {
        return this.f57214a.o(this.f57215b, task);
    }
}

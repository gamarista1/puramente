package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class G implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ H f57415a;

    public /* synthetic */ G(H h10) {
        this.f57415a = h10;
    }

    public final Object then(Task task) {
        return this.f57415a.j(task);
    }
}

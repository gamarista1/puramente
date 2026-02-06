package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class Y implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Z f57470a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f57471b;

    public /* synthetic */ Y(Z z10, String str) {
        this.f57470a = z10;
        this.f57471b = str;
    }

    public final Object then(Task task) {
        return this.f57470a.c(this.f57471b, task);
    }
}

package com.google.firebase.functions;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class e implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f57195a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f57196b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f57197c;

    public /* synthetic */ e(h hVar, Task task, Task task2) {
        this.f57195a = hVar;
        this.f57196b = task;
        this.f57197c = task2;
    }

    public final Task then(Object obj) {
        return this.f57195a.k(this.f57196b, this.f57197c, (Void) obj);
    }
}

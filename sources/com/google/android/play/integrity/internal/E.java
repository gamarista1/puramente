package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class E implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4741d f56553a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f56554b;

    public /* synthetic */ E(C4741d dVar, TaskCompletionSource taskCompletionSource) {
        this.f56553a = dVar;
        this.f56554b = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        this.f56553a.u(this.f56554b, task);
    }
}

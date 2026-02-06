package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

final class A implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f53944a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ B f53945b;

    A(B b10, TaskCompletionSource taskCompletionSource) {
        this.f53945b = b10;
        this.f53944a = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        this.f53945b.f53947b.remove(this.f53944a);
    }
}

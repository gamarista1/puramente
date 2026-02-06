package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class B implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ D f57969a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Continuation f57970b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f57971c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f57972d;

    public /* synthetic */ B(D d10, Continuation continuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource) {
        this.f57969a = d10;
        this.f57970b = continuation;
        this.f57971c = taskCompletionSource;
        this.f57972d = cancellationTokenSource;
    }

    public final void onComplete(Task task) {
        this.f57969a.N(this.f57970b, this.f57971c, this.f57972d, task);
    }
}

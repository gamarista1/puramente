package com.google.firebase.storage;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class z implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ D f58125a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Continuation f58126b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f58127c;

    public /* synthetic */ z(D d10, Continuation continuation, TaskCompletionSource taskCompletionSource) {
        this.f58125a = d10;
        this.f58126b = continuation;
        this.f58127c = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        this.f58125a.M(this.f58126b, this.f58127c, task);
    }
}

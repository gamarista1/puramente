package com.google.firebase.storage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class s implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f58120a;

    public /* synthetic */ s(TaskCompletionSource taskCompletionSource) {
        this.f58120a = taskCompletionSource;
    }

    public final void onFailure(Exception exc) {
        this.f58120a.setException(exc);
    }
}

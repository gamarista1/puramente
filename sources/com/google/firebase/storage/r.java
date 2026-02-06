package com.google.firebase.storage;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class r implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f58119a;

    public /* synthetic */ r(TaskCompletionSource taskCompletionSource) {
        this.f58119a = taskCompletionSource;
    }

    public final void onSuccess(Object obj) {
        this.f58119a.setResult(obj);
    }
}

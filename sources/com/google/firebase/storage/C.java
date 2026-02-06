package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.D;

public final /* synthetic */ class C implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SuccessContinuation f57973a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f57974b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f57975c;

    public /* synthetic */ C(SuccessContinuation successContinuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource) {
        this.f57973a = successContinuation;
        this.f57974b = taskCompletionSource;
        this.f57975c = cancellationTokenSource;
    }

    public final void onSuccess(Object obj) {
        D.T(this.f57973a, this.f57974b, this.f57975c, (D.a) obj);
    }
}

package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCanceledListener;

public final /* synthetic */ class t implements OnCanceledListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f58121a;

    public /* synthetic */ t(CancellationTokenSource cancellationTokenSource) {
        this.f58121a = cancellationTokenSource;
    }

    public final void onCanceled() {
        this.f58121a.cancel();
    }
}

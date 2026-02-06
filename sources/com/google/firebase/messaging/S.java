package com.google.firebase.messaging;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class S implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f57434a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f57435b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f57436c;

    public /* synthetic */ S(Context context, boolean z10, TaskCompletionSource taskCompletionSource) {
        this.f57434a = context;
        this.f57435b = z10;
        this.f57436c = taskCompletionSource;
    }

    public final void run() {
        T.e(this.f57434a, this.f57435b, this.f57436c);
    }
}

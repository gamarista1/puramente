package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class I implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ J f57422a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f57423b;

    public /* synthetic */ I(J j10, TaskCompletionSource taskCompletionSource) {
        this.f57422a = j10;
        this.f57423b = taskCompletionSource;
    }

    public final void run() {
        this.f57422a.q(this.f57423b);
    }
}

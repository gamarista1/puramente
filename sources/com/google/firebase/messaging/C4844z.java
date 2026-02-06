package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.messaging.z  reason: case insensitive filesystem */
public final /* synthetic */ class C4844z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f57608a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f57609b;

    public /* synthetic */ C4844z(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        this.f57608a = firebaseMessaging;
        this.f57609b = taskCompletionSource;
    }

    public final void run() {
        this.f57608a.I(this.f57609b);
    }
}

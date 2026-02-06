package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.messaging.y  reason: case insensitive filesystem */
public final /* synthetic */ class C4843y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f57606a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f57607b;

    public /* synthetic */ C4843y(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        this.f57606a = firebaseMessaging;
        this.f57607b = taskCompletionSource;
    }

    public final void run() {
        this.f57606a.H(this.f57607b);
    }
}

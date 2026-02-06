package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.messaging.w  reason: case insensitive filesystem */
public final /* synthetic */ class C4841w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f57603a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f57604b;

    public /* synthetic */ C4841w(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        this.f57603a = firebaseMessaging;
        this.f57604b = taskCompletionSource;
    }

    public final void run() {
        this.f57603a.J(this.f57604b);
    }
}

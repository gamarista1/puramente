package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnSuccessListener;

public final /* synthetic */ class C implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f57390a;

    public /* synthetic */ C(FirebaseMessaging firebaseMessaging) {
        this.f57390a = firebaseMessaging;
    }

    public final void onSuccess(Object obj) {
        this.f57390a.N((j0) obj);
    }
}

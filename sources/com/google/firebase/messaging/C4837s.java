package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnSuccessListener;
import xa.C5268a;

/* renamed from: com.google.firebase.messaging.s  reason: case insensitive filesystem */
public final /* synthetic */ class C4837s implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f57596a;

    public /* synthetic */ C4837s(FirebaseMessaging firebaseMessaging) {
        this.f57596a = firebaseMessaging;
    }

    public final void onSuccess(Object obj) {
        this.f57596a.K((C5268a) obj);
    }
}

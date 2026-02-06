package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.e0;

/* renamed from: com.google.firebase.messaging.u  reason: case insensitive filesystem */
public final /* synthetic */ class C4839u implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f57600a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f57601b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e0.a f57602c;

    public /* synthetic */ C4839u(FirebaseMessaging firebaseMessaging, String str, e0.a aVar) {
        this.f57600a = firebaseMessaging;
        this.f57601b = str;
        this.f57602c = aVar;
    }

    public final Task then(Object obj) {
        return this.f57600a.F(this.f57601b, this.f57602c, (String) obj);
    }
}

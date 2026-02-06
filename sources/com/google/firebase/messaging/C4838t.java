package com.google.firebase.messaging;

import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.Z;
import com.google.firebase.messaging.e0;

/* renamed from: com.google.firebase.messaging.t  reason: case insensitive filesystem */
public final /* synthetic */ class C4838t implements Z.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f57597a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f57598b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e0.a f57599c;

    public /* synthetic */ C4838t(FirebaseMessaging firebaseMessaging, String str, e0.a aVar) {
        this.f57597a = firebaseMessaging;
        this.f57598b = str;
        this.f57599c = aVar;
    }

    public final Task start() {
        return this.f57597a.G(this.f57598b, this.f57599c);
    }
}

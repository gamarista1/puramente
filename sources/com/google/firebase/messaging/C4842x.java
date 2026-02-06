package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.messaging.x  reason: case insensitive filesystem */
public final /* synthetic */ class C4842x implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f57605a;

    public /* synthetic */ C4842x(String str) {
        this.f57605a = str;
    }

    public final Task then(Object obj) {
        return ((j0) obj).u(this.f57605a);
    }
}

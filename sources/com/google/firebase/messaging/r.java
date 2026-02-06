package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class r implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f57587a;

    public /* synthetic */ r(String str) {
        this.f57587a = str;
    }

    public final Task then(Object obj) {
        return ((j0) obj).r(this.f57587a);
    }
}

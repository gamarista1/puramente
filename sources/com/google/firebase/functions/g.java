package com.google.firebase.functions;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import zb.C5300b;

public final /* synthetic */ class g implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f57198a;

    public /* synthetic */ g(h hVar) {
        this.f57198a = hVar;
    }

    public final Task then(Object obj) {
        return this.f57198a.i((C5300b) obj);
    }
}

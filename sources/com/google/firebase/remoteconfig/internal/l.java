package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.m;

public final /* synthetic */ class l implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m.a f57860a;

    public /* synthetic */ l(m.a aVar) {
        this.f57860a = aVar;
    }

    public final Task then(Object obj) {
        return Tasks.forResult(this.f57860a);
    }
}

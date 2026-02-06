package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

public final /* synthetic */ class ak implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ al f56479a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ StandardIntegrityManager.PrepareIntegrityTokenRequest f56480b;

    public /* synthetic */ ak(al alVar, StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        this.f56479a = alVar;
        this.f56480b = prepareIntegrityTokenRequest;
    }

    public final Task then(Object obj) {
        return this.f56479a.a(this.f56480b, (Long) obj);
    }
}

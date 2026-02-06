package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.StandardIntegrityManager;

final class al implements StandardIntegrityManager {

    /* renamed from: a  reason: collision with root package name */
    private final ax f56481a;

    /* renamed from: b  reason: collision with root package name */
    private final bd f56482b;

    al(ax axVar, bd bdVar) {
        this.f56481a = axVar;
        this.f56482b = bdVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l10) {
        return Tasks.forResult(new bc(this.f56482b, prepareIntegrityTokenRequest.a(), l10.longValue()));
    }

    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        return this.f56481a.d(prepareIntegrityTokenRequest.a()).onSuccessTask(new ak(this, prepareIntegrityTokenRequest));
    }
}

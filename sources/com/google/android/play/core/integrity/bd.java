package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

final class bd {

    /* renamed from: a  reason: collision with root package name */
    private final ax f56517a;

    bd(ax axVar) {
        this.f56517a = axVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task a(long j10, long j11, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f56517a.c(standardIntegrityTokenRequest.a(), j10, j11);
    }
}

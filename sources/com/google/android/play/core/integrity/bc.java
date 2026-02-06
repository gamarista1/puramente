package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

public final /* synthetic */ class bc implements StandardIntegrityManager.StandardIntegrityTokenProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ bd f56514a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f56515b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f56516c;

    public /* synthetic */ bc(bd bdVar, long j10, long j11) {
        this.f56514a = bdVar;
        this.f56515b = j10;
        this.f56516c = j11;
    }

    public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f56514a.a(this.f56515b, this.f56516c, standardIntegrityTokenRequest);
    }
}

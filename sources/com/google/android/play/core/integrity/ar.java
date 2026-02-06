package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.u;

final class ar extends aw {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f56489a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f56490b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ax f56491c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ar(ax axVar, TaskCompletionSource taskCompletionSource, long j10, TaskCompletionSource taskCompletionSource2) {
        super(axVar, taskCompletionSource);
        this.f56491c = axVar;
        this.f56489a = j10;
        this.f56490b = taskCompletionSource2;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (ax.g(this.f56491c)) {
            super.a(new StandardIntegrityException(-2, (Throwable) null));
            return;
        }
        try {
            ax axVar = this.f56491c;
            ((u) axVar.f56502a.e()).Z0(ax.b(axVar, this.f56489a), new av(this.f56491c, this.f56490b));
        } catch (RemoteException e10) {
            this.f56491c.f56503b.b(e10, "warmUpIntegrityToken(%s)", Long.valueOf(this.f56489a));
            this.f56490b.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}

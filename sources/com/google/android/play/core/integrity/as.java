package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.u;

final class as extends aw {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f56492a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f56493b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f56494c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f56495d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ax f56496e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    as(ax axVar, TaskCompletionSource taskCompletionSource, String str, long j10, long j11, TaskCompletionSource taskCompletionSource2) {
        super(axVar, taskCompletionSource);
        this.f56496e = axVar;
        this.f56492a = str;
        this.f56493b = j10;
        this.f56494c = j11;
        this.f56495d = taskCompletionSource2;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (ax.g(this.f56496e)) {
            super.a(new StandardIntegrityException(-2, (Throwable) null));
            return;
        }
        try {
            ax axVar = this.f56496e;
            ((u) axVar.f56502a.e()).e1(ax.a(axVar, this.f56492a, this.f56493b, this.f56494c), new au(this.f56496e, this.f56495d));
        } catch (RemoteException e10) {
            this.f56496e.f56503b.b(e10, "requestExpressIntegrityToken(%s, %s)", this.f56492a, Long.valueOf(this.f56493b));
            this.f56495d.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}

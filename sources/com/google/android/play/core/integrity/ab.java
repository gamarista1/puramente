package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C4742e;
import com.google.android.play.integrity.internal.D;
import com.google.android.play.integrity.internal.z;

final class ab extends D {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ byte[] f56462a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Long f56463b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f56464c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f56465d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ad f56466e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ab(ad adVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f56466e = adVar;
        this.f56462a = bArr;
        this.f56463b = l10;
        this.f56464c = taskCompletionSource2;
        this.f56465d = integrityTokenRequest;
    }

    public final void a(Exception exc) {
        if (exc instanceof C4742e) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        try {
            ((z) this.f56466e.f56470a.e()).t(ad.a(this.f56466e, this.f56462a, this.f56463b, (Parcelable) null), new ac(this.f56466e, this.f56464c));
        } catch (RemoteException e10) {
            this.f56466e.f56471b.b(e10, "requestIntegrityToken(%s)", this.f56465d);
            this.f56464c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}

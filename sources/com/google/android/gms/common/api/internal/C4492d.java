package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.C4536s;

/* renamed from: com.google.android.gms.common.api.internal.d  reason: case insensitive filesystem */
public abstract class C4492d extends BasePendingResult implements C4493e {
    private final a api;
    private final a.c clientKey;

    protected C4492d(a aVar, f fVar) {
        super((f) C4536s.m(fVar, "GoogleApiClient must not be null"));
        C4536s.m(aVar, "Api must not be null");
        this.clientKey = aVar.b();
        this.api = aVar;
    }

    private void c(RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* access modifiers changed from: protected */
    public abstract void doExecute(a.b bVar);

    public final a getApi() {
        return this.api;
    }

    public final a.c getClientKey() {
        return this.clientKey;
    }

    /* access modifiers changed from: protected */
    public void onSetFailedResult(k kVar) {
    }

    public final void run(a.b bVar) {
        try {
            doExecute(bVar);
        } catch (DeadObjectException e10) {
            c(e10);
            throw e10;
        } catch (RemoteException e11) {
            c(e11);
        }
    }

    public final void setFailedResult(Status status) {
        C4536s.b(!status.s0(), "Failed result must not be success");
        k createFailedResult = createFailedResult(status);
        setResult(createFailedResult);
        onSetFailedResult(createFailedResult);
    }
}

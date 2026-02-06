package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class j0 extends V {

    /* renamed from: b  reason: collision with root package name */
    protected final TaskCompletionSource f54044b;

    public j0(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.f54044b = taskCompletionSource;
    }

    public final void a(Status status) {
        this.f54044b.trySetException(new b(status));
    }

    public final void b(Exception exc) {
        this.f54044b.trySetException(exc);
    }

    public final void c(L l10) {
        try {
            h(l10);
        } catch (DeadObjectException e10) {
            a(p0.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(p0.e(e11));
        } catch (RuntimeException e12) {
            this.f54044b.trySetException(e12);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void h(L l10);
}

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f54063a;

    public p0(int i10) {
        this.f54063a = i10;
    }

    static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(L l10);

    public abstract void d(B b10, boolean z10);
}

package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import ya.C5286c;

public final class n0 extends V {

    /* renamed from: b  reason: collision with root package name */
    private final C4510w f54058b;

    /* renamed from: c  reason: collision with root package name */
    private final TaskCompletionSource f54059c;

    /* renamed from: d  reason: collision with root package name */
    private final C4508u f54060d;

    public n0(int i10, C4510w wVar, TaskCompletionSource taskCompletionSource, C4508u uVar) {
        super(i10);
        this.f54059c = taskCompletionSource;
        this.f54058b = wVar;
        this.f54060d = uVar;
        if (i10 == 2 && wVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        this.f54059c.trySetException(this.f54060d.a(status));
    }

    public final void b(Exception exc) {
        this.f54059c.trySetException(exc);
    }

    public final void c(L l10) {
        try {
            this.f54058b.b(l10.v(), this.f54059c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(p0.e(e11));
        } catch (RuntimeException e12) {
            this.f54059c.trySetException(e12);
        }
    }

    public final void d(B b10, boolean z10) {
        b10.d(this.f54059c, z10);
    }

    public final boolean f(L l10) {
        return this.f54058b.c();
    }

    public final C5286c[] g(L l10) {
        return this.f54058b.e();
    }
}

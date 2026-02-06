package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4536s;

public final class m0 extends p0 {

    /* renamed from: b  reason: collision with root package name */
    protected final C4492d f54057b;

    public m0(int i10, C4492d dVar) {
        super(i10);
        this.f54057b = (C4492d) C4536s.m(dVar, "Null methods are not runnable.");
    }

    public final void a(Status status) {
        try {
            this.f54057b.setFailedResult(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f54057b.setFailedResult(new Status(10, simpleName + ": " + localizedMessage));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    public final void c(L l10) {
        try {
            this.f54057b.run(l10.v());
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    public final void d(B b10, boolean z10) {
        b10.c(this.f54057b, z10);
    }
}

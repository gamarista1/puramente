package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C4499k;
import com.google.android.gms.tasks.TaskCompletionSource;
import ya.C5286c;

public final class o0 extends j0 {

    /* renamed from: c  reason: collision with root package name */
    public final C4499k.a f54062c;

    public o0(C4499k.a aVar, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f54062c = aVar;
    }

    public final /* bridge */ /* synthetic */ void d(B b10, boolean z10) {
    }

    public final boolean f(L l10) {
        b0 b0Var = (b0) l10.x().get(this.f54062c);
        return false;
    }

    public final C5286c[] g(L l10) {
        b0 b0Var = (b0) l10.x().get(this.f54062c);
        return null;
    }

    public final void h(L l10) {
        b0 b0Var = (b0) l10.x().remove(this.f54062c);
        this.f54044b.trySetResult(Boolean.FALSE);
    }
}

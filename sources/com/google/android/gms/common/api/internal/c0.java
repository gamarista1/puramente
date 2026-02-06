package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

final class c0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f0 f54011a;

    c0(f0 f0Var) {
        this.f54011a = f0Var;
    }

    public final void run() {
        this.f54011a.f54021g.c(new ConnectionResult(4));
    }
}

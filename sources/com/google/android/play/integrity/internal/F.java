package com.google.android.play.integrity.internal;

import android.os.IBinder;

public final /* synthetic */ class F implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4741d f56555a;

    public /* synthetic */ F(C4741d dVar) {
        this.f56555a = dVar;
    }

    public final void binderDied() {
        C4741d.k(this.f56555a);
    }
}

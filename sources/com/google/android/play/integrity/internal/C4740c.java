package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.google.android.play.integrity.internal.c  reason: case insensitive filesystem */
final class C4740c implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C4741d f56565a;

    /* synthetic */ C4740c(C4741d dVar, C4739b bVar) {
        this.f56565a = dVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f56565a.f56568b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        C4741d dVar = this.f56565a;
        dVar.c().post(new K(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f56565a.f56568b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        C4741d dVar = this.f56565a;
        dVar.c().post(new L(this));
    }
}

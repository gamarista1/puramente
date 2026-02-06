package com.google.android.gms.common.api.internal;

final class J implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ K f53958a;

    J(K k10) {
        this.f53958a = k10;
    }

    public final void run() {
        L l10 = this.f53958a.f53959a;
        l10.f53961b.disconnect(l10.f53961b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}

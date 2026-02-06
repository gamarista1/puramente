package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f57107a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p.b f57108b;

    public /* synthetic */ m(Runnable runnable, p.b bVar) {
        this.f57107a = runnable;
        this.f57108b = bVar;
    }

    public final void run() {
        o.m(this.f57107a, this.f57108b);
    }
}

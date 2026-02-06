package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f57077a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p.b f57078b;

    public /* synthetic */ d(Runnable runnable, p.b bVar) {
        this.f57077a = runnable;
        this.f57078b = bVar;
    }

    public final void run() {
        o.s(this.f57077a, this.f57078b);
    }
}

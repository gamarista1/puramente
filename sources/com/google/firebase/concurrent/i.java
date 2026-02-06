package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f57095a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f57096b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p.b f57097c;

    public /* synthetic */ i(o oVar, Runnable runnable, p.b bVar) {
        this.f57095a = oVar;
        this.f57096b = runnable;
        this.f57097c = bVar;
    }

    public final void run() {
        this.f57095a.u(this.f57096b, this.f57097c);
    }
}

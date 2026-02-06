package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f57098a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f57099b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p.b f57100c;

    public /* synthetic */ j(o oVar, Runnable runnable, p.b bVar) {
        this.f57098a = oVar;
        this.f57099b = runnable;
        this.f57100c = bVar;
    }

    public final void run() {
        this.f57098a.n(this.f57099b, this.f57100c);
    }
}

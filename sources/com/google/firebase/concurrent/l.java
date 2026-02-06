package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f57104a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f57105b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p.b f57106c;

    public /* synthetic */ l(o oVar, Runnable runnable, p.b bVar) {
        this.f57104a = oVar;
        this.f57105b = runnable;
        this.f57106c = bVar;
    }

    public final void run() {
        this.f57104a.w(this.f57105b, this.f57106c);
    }
}

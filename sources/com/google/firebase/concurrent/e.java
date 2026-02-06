package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f57079a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p.b f57080b;

    public /* synthetic */ e(Runnable runnable, p.b bVar) {
        this.f57079a = runnable;
        this.f57080b = bVar;
    }

    public final void run() {
        o.y(this.f57079a, this.f57080b);
    }
}

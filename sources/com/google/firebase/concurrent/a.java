package com.google.firebase.concurrent;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f57066a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f57067b;

    public /* synthetic */ a(b bVar, Runnable runnable) {
        this.f57066a = bVar;
        this.f57067b = runnable;
    }

    public final void run() {
        this.f57066a.b(this.f57067b);
    }
}

package com.google.firebase.storage;

import com.google.firebase.storage.D;

public final /* synthetic */ class I implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ J f58003a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f58004b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ D.a f58005c;

    public /* synthetic */ I(J j10, Object obj, D.a aVar) {
        this.f58003a = j10;
        this.f58004b = obj;
        this.f58005c = aVar;
    }

    public final void run() {
        this.f58003a.f(this.f58004b, this.f58005c);
    }
}

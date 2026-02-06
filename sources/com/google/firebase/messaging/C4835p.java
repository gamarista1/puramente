package com.google.firebase.messaging;

import android.content.Intent;

/* renamed from: com.google.firebase.messaging.p  reason: case insensitive filesystem */
public final /* synthetic */ class C4835p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4836q f57582a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f57583b;

    public /* synthetic */ C4835p(C4836q qVar, Intent intent) {
        this.f57582a = qVar;
        this.f57583b = intent;
    }

    public final void run() {
        this.f57582a.b(this.f57583b);
    }
}

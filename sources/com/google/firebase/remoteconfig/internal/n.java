package com.google.firebase.remoteconfig.internal;

import Ea.d;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f57880a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f57881b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f57882c;

    public /* synthetic */ n(d dVar, String str, g gVar) {
        this.f57880a = dVar;
        this.f57881b = str;
        this.f57882c = gVar;
    }

    public final void run() {
        this.f57880a.accept(this.f57881b, this.f57882c);
    }
}

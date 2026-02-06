package com.google.firebase.storage;

import com.google.firebase.storage.D;

public final /* synthetic */ class G implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ J f57998a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f57999b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ D.a f58000c;

    public /* synthetic */ G(J j10, Object obj, D.a aVar) {
        this.f57998a = j10;
        this.f57999b = obj;
        this.f58000c = aVar;
    }

    public final void run() {
        this.f57998a.g(this.f57999b, this.f58000c);
    }
}

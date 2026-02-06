package androidx.work.impl;

import com.google.common.util.concurrent.g;

/* renamed from: androidx.work.impl.s  reason: case insensitive filesystem */
public final /* synthetic */ class C1858s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1860u f18947a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f18948b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ U f18949c;

    public /* synthetic */ C1858s(C1860u uVar, g gVar, U u10) {
        this.f18947a = uVar;
        this.f18948b = gVar;
        this.f18949c = u10;
    }

    public final void run() {
        this.f18947a.n(this.f18948b, this.f18949c);
    }
}

package androidx.work.impl;

import P3.m;

/* renamed from: androidx.work.impl.t  reason: case insensitive filesystem */
public final /* synthetic */ class C1859t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1860u f18950a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f18951b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f18952c;

    public /* synthetic */ C1859t(C1860u uVar, m mVar, boolean z10) {
        this.f18950a = uVar;
        this.f18951b = mVar;
        this.f18952c = z10;
    }

    public final void run() {
        this.f18950a.l(this.f18951b, this.f18952c);
    }
}

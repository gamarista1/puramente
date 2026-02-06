package p2;

import p2.t;

/* renamed from: p2.n  reason: case insensitive filesystem */
public final /* synthetic */ class C2410n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t.a f25288a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f25289b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Exception f25290c;

    public /* synthetic */ C2410n(t.a aVar, t tVar, Exception exc) {
        this.f25288a = aVar;
        this.f25289b = tVar;
        this.f25290c = exc;
    }

    public final void run() {
        this.f25288a.r(this.f25289b, this.f25290c);
    }
}

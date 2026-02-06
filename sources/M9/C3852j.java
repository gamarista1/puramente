package m9;

import m9.r;

/* renamed from: m9.j  reason: case insensitive filesystem */
public final /* synthetic */ class C3852j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r.a f46663a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Exception f46664b;

    public /* synthetic */ C3852j(r.a aVar, Exception exc) {
        this.f46663a = aVar;
        this.f46664b = exc;
    }

    public final void run() {
        this.f46663a.r(this.f46664b);
    }
}

package o9;

import o9.u;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u.a f47528a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f47529b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Exception f47530c;

    public /* synthetic */ o(u.a aVar, u uVar, Exception exc) {
        this.f47528a = aVar;
        this.f47529b = uVar;
        this.f47530c = exc;
    }

    public final void run() {
        this.f47528a.r(this.f47529b, this.f47530c);
    }
}

package m9;

import m9.r;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r.a f46674a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Exception f46675b;

    public /* synthetic */ o(r.a aVar, Exception exc) {
        this.f46674a = aVar;
        this.f46675b = exc;
    }

    public final void run() {
        this.f46674a.s(this.f46675b);
    }
}

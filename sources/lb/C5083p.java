package lb;

import android.os.IBinder;

/* renamed from: lb.p  reason: case insensitive filesystem */
final class C5083p extends C5077j {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ IBinder f60979b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C5086s f60980c;

    C5083p(C5086s sVar, IBinder iBinder) {
        this.f60980c = sVar;
        this.f60979b = iBinder;
    }

    public final void a() {
        this.f60980c.f60982a.f60996m = C5072e.b(this.f60979b);
        C5087t.n(this.f60980c.f60982a);
        this.f60980c.f60982a.f60990g = false;
        for (Runnable run : this.f60980c.f60982a.f60987d) {
            run.run();
        }
        this.f60980c.f60982a.f60987d.clear();
    }
}

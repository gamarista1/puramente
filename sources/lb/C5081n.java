package lb;

/* renamed from: lb.n  reason: case insensitive filesystem */
final class C5081n extends C5077j {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C5087t f60978b;

    C5081n(C5087t tVar) {
        this.f60978b = tVar;
    }

    public final void a() {
        C5087t tVar = this.f60978b;
        if (tVar.f60996m != null) {
            tVar.f60985b.d("Unbind from service.", new Object[0]);
            C5087t tVar2 = this.f60978b;
            tVar2.f60984a.unbindService(tVar2.f60995l);
            this.f60978b.f60990g = false;
            this.f60978b.f60996m = null;
            this.f60978b.f60995l = null;
        }
        this.f60978b.t();
    }
}

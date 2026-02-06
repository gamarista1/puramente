package lb;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: lb.s  reason: case insensitive filesystem */
final class C5086s implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C5087t f60982a;

    /* synthetic */ C5086s(C5087t tVar, C5085r rVar) {
        this.f60982a = tVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f60982a.f60985b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        C5087t tVar = this.f60982a;
        tVar.c().post(new C5083p(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f60982a.f60985b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        C5087t tVar = this.f60982a;
        tVar.c().post(new C5084q(this));
    }
}

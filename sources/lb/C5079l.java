package lb;

import android.os.IBinder;

/* renamed from: lb.l  reason: case insensitive filesystem */
public final /* synthetic */ class C5079l implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C5087t f60975a;

    public /* synthetic */ C5079l(C5087t tVar) {
        this.f60975a = tVar;
    }

    public final void binderDied() {
        C5087t.h(this.f60975a);
    }
}

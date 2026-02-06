package D5;

import D5.u;
import java.util.List;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f30458a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f30459b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ u.b f30460c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ List f30461d;

    public /* synthetic */ n(o oVar, Runnable runnable, u.b bVar, List list) {
        this.f30458a = oVar;
        this.f30459b = runnable;
        this.f30460c = bVar;
        this.f30461d = list;
    }

    public final void run() {
        o.z(this.f30458a, this.f30459b, this.f30460c, this.f30461d);
    }
}

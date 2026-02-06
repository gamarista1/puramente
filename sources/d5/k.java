package D5;

import D5.u;
import java.util.List;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f30422a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f30423b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ u.b f30424c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ List f30425d;

    public /* synthetic */ k(l lVar, Runnable runnable, u.b bVar, List list) {
        this.f30422a = lVar;
        this.f30423b = runnable;
        this.f30424c = bVar;
        this.f30425d = list;
    }

    public final void run() {
        l.t(this.f30422a, this.f30423b, this.f30424c, this.f30425d);
    }
}

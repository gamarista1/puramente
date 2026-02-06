package Hb;

import Db.C4251a;
import Lb.B;
import java.util.concurrent.ExecutorService;
import nc.C5116b;

public final /* synthetic */ class l implements C4251a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExecutorService f50876a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ B.b f50877b;

    public /* synthetic */ l(ExecutorService executorService, B.b bVar) {
        this.f50876a = executorService;
        this.f50877b = bVar;
    }

    public final void a(C5116b bVar) {
        this.f50876a.execute(new m(this.f50877b, bVar));
    }
}

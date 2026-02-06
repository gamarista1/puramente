package Hb;

import Db.C4253b;
import Lb.B;
import ic.C5026a;
import ic.C5027b;
import java.util.concurrent.ExecutorService;

public final /* synthetic */ class h implements C5026a.C0893a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExecutorService f50871a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ B.b f50872b;

    public /* synthetic */ h(ExecutorService executorService, B.b bVar) {
        this.f50871a = executorService;
        this.f50872b = bVar;
    }

    public final void a(C5027b bVar) {
        ((C4253b) bVar.get()).a(new l(this.f50871a, this.f50872b));
    }
}

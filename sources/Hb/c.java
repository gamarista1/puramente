package Hb;

import Cb.a;
import Lb.B;
import java.util.concurrent.ExecutorService;
import zb.C5300b;

public final /* synthetic */ class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExecutorService f50863a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ B.b f50864b;

    public /* synthetic */ c(ExecutorService executorService, B.b bVar) {
        this.f50863a = executorService;
        this.f50864b = bVar;
    }

    public final void a(C5300b bVar) {
        this.f50863a.execute(new f(this.f50864b, bVar));
    }
}

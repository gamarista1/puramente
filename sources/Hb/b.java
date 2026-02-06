package Hb;

import Lb.B;
import ic.C5026a;
import ic.C5027b;
import java.util.concurrent.ExecutorService;

public final /* synthetic */ class b implements C5026a.C0893a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExecutorService f50861a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ B.b f50862b;

    public /* synthetic */ b(ExecutorService executorService, B.b bVar) {
        this.f50861a = executorService;
        this.f50862b = bVar;
    }

    public final void a(C5027b bVar) {
        ((Cb.b) bVar.get()).b(new c(this.f50861a, this.f50862b));
    }
}

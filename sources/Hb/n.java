package Hb;

import Db.C4253b;
import Lb.B;
import ic.C5026a;
import ic.C5027b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import oc.C5121a;
import ub.C5227d;

public class n implements B {

    /* renamed from: a  reason: collision with root package name */
    private final C5026a f50880a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference f50881b = new AtomicReference();

    public n(C5026a aVar) {
        this.f50880a = aVar;
        aVar.a(new i(this));
    }

    private static boolean i(Exception exc) {
        if ((exc instanceof C5227d) || (exc instanceof C5121a)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void n(B.a aVar, Exception exc) {
        if (i(exc)) {
            aVar.b((String) null);
        } else {
            aVar.a(exc.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o(C5027b bVar) {
        this.f50881b.set((C4253b) bVar.get());
    }

    public void a(boolean z10, B.a aVar) {
        C4253b bVar = (C4253b) this.f50881b.get();
        if (bVar != null) {
            bVar.b(z10).addOnSuccessListener(new j(aVar)).addOnFailureListener(new k(aVar));
        } else {
            aVar.b((String) null);
        }
    }

    public void b(ExecutorService executorService, B.b bVar) {
        this.f50880a.a(new h(executorService, bVar));
    }
}

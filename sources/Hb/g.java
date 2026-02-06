package Hb;

import Cb.b;
import Lb.B;
import ic.C5026a;
import ic.C5027b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

public class g implements B {

    /* renamed from: a  reason: collision with root package name */
    private final C5026a f50869a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference f50870b = new AtomicReference();

    public g(C5026a aVar) {
        this.f50869a = aVar;
        aVar.a(new a(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n(C5027b bVar) {
        this.f50870b.set((b) bVar.get());
    }

    public void a(boolean z10, B.a aVar) {
        b bVar = (b) this.f50870b.get();
        if (bVar != null) {
            bVar.a(z10).addOnSuccessListener(new d(aVar)).addOnFailureListener(new e(aVar));
        } else {
            aVar.b((String) null);
        }
    }

    public void b(ExecutorService executorService, B.b bVar) {
        this.f50869a.a(new b(executorService, bVar));
    }
}

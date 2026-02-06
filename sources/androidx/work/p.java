package androidx.work;

import Ug.C5582n;
import com.google.common.util.concurrent.g;
import java.util.concurrent.CancellationException;
import lf.v;
import lf.w;

public final class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C5582n f19023a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f19024b;

    public p(C5582n nVar, g gVar) {
        this.f19023a = nVar;
        this.f19024b = gVar;
    }

    public final void run() {
        try {
            C5582n nVar = this.f19023a;
            v.a aVar = v.f71841b;
            nVar.resumeWith(v.b(this.f19024b.get()));
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                cause = th2;
            }
            if (th2 instanceof CancellationException) {
                this.f19023a.B(cause);
                return;
            }
            C5582n nVar2 = this.f19023a;
            v.a aVar2 = v.f71841b;
            nVar2.resumeWith(v.b(w.a(cause)));
        }
    }
}

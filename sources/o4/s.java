package o4;

import Ug.C5582n;
import java.io.IOException;
import lf.C6514M;
import lf.v;
import lf.w;
import rh.C6708e;
import rh.C6709f;
import rh.E;
import yf.C6798l;

final class s implements C6709f, C6798l {

    /* renamed from: a  reason: collision with root package name */
    private final C6708e f47012a;

    /* renamed from: b  reason: collision with root package name */
    private final C5582n f47013b;

    public s(C6708e eVar, C5582n nVar) {
        this.f47012a = eVar;
        this.f47013b = nVar;
    }

    public void a(Throwable th2) {
        try {
            this.f47012a.cancel();
        } catch (Throwable unused) {
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return C6514M.f71813a;
    }

    public void onFailure(C6708e eVar, IOException iOException) {
        if (!eVar.isCanceled()) {
            C5582n nVar = this.f47013b;
            v.a aVar = v.f71841b;
            nVar.resumeWith(v.b(w.a(iOException)));
        }
    }

    public void onResponse(C6708e eVar, E e10) {
        this.f47013b.resumeWith(v.b(e10));
    }
}

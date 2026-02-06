package ah;

import Zg.C5723l;
import lf.C6514M;
import lf.v;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;

/* renamed from: ah.a  reason: case insensitive filesystem */
public abstract class C5730a {
    private static final void a(C6658d dVar, Throwable th2) {
        v.a aVar = v.f71841b;
        dVar.resumeWith(v.b(w.a(th2)));
        throw th2;
    }

    public static final void b(C6658d dVar, C6658d dVar2) {
        try {
            C6658d c10 = C6680b.c(dVar);
            v.a aVar = v.f71841b;
            C5723l.c(c10, v.b(C6514M.f71813a), (C6798l) null, 2, (Object) null);
        } catch (Throwable th2) {
            a(dVar2, th2);
        }
    }

    public static final void c(p pVar, Object obj, C6658d dVar, C6798l lVar) {
        try {
            C6658d c10 = C6680b.c(C6680b.a(pVar, obj, dVar));
            v.a aVar = v.f71841b;
            C5723l.b(c10, v.b(C6514M.f71813a), lVar);
        } catch (Throwable th2) {
            a(dVar, th2);
        }
    }

    public static /* synthetic */ void d(p pVar, Object obj, C6658d dVar, C6798l lVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        c(pVar, obj, dVar, lVar);
    }
}

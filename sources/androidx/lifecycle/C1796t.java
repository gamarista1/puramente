package androidx.lifecycle;

import Ug.C5600w0;
import Ug.U0;
import Ug.Z;
import kotlin.jvm.internal.C6496s;
import w.C2780Y;

/* renamed from: androidx.lifecycle.t  reason: case insensitive filesystem */
public abstract class C1796t {
    public static final C1793p a(C1790m mVar) {
        C1794q qVar;
        C6496s.h(mVar, "<this>");
        do {
            C1794q qVar2 = (C1794q) mVar.c().get();
            if (qVar2 != null) {
                return qVar2;
            }
            qVar = new C1794q(mVar, U0.b((C5600w0) null, 1, (Object) null).n1(Z.c().D1()));
        } while (!C2780Y.a(mVar.c(), (Object) null, qVar));
        qVar.c();
        return qVar;
    }
}

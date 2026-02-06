package Y;

import a0.C1538b;
import yf.C6787a;

abstract /* synthetic */ class q1 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final v1 f10109a = new v1();

    /* renamed from: b  reason: collision with root package name */
    private static final v1 f10110b = new v1();

    public static final C1538b b() {
        v1 v1Var = f10110b;
        C1538b bVar = (C1538b) v1Var.a();
        if (bVar != null) {
            return bVar;
        }
        C1538b bVar2 = new C1538b(new J[0], 0);
        v1Var.b(bVar2);
        return bVar2;
    }

    public static final A1 c(o1 o1Var, C6787a aVar) {
        return new H(aVar, o1Var);
    }

    public static final A1 d(C6787a aVar) {
        return new H(aVar, (o1) null);
    }
}

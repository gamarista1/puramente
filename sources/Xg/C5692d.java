package Xg;

import Wg.a;
import Wg.r;
import Yg.e;
import lf.C6514M;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

/* renamed from: Xg.d  reason: case insensitive filesystem */
abstract class C5692d extends e {

    /* renamed from: d  reason: collision with root package name */
    private final p f66501d;

    public C5692d(p pVar, g gVar, int i10, a aVar) {
        super(gVar, i10, aVar);
        this.f66501d = pVar;
    }

    static /* synthetic */ Object o(C5692d dVar, r rVar, C6658d dVar2) {
        Object invoke = dVar.f66501d.invoke(rVar, dVar2);
        if (invoke == C6680b.f()) {
            return invoke;
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: protected */
    public Object i(r rVar, C6658d dVar) {
        return o(this, rVar, dVar);
    }

    public String toString() {
        return "block[" + this.f66501d + "] -> " + super.toString();
    }
}

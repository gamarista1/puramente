package Xg;

import Ug.C5600w0;
import Wg.a;
import Yg.q;
import java.util.List;
import qf.C6658d;
import qf.g;

final class z implements L, C5694f, q {

    /* renamed from: a  reason: collision with root package name */
    private final C5600w0 f66718a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ L f66719b;

    public z(L l10, C5600w0 w0Var) {
        this.f66718a = w0Var;
        this.f66719b = l10;
    }

    public C5694f a(g gVar, int i10, a aVar) {
        return N.d(this, gVar, i10, aVar);
    }

    public Object collect(C5695g gVar, C6658d dVar) {
        return this.f66719b.collect(gVar, dVar);
    }

    public List d() {
        return this.f66719b.d();
    }

    public Object getValue() {
        return this.f66719b.getValue();
    }
}

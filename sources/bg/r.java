package Bg;

import Dg.w;
import Eg.n;
import Rf.H;
import kotlin.jvm.internal.C6496s;
import ng.c;
import ng.f;
import yg.C6812k;

public abstract class r extends H {

    /* renamed from: g  reason: collision with root package name */
    private final n f62577g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(c cVar, n nVar, Of.H h10) {
        super(h10, cVar);
        C6496s.h(cVar, "fqName");
        C6496s.h(nVar, "storageManager");
        C6496s.h(h10, "module");
        this.f62577g = nVar;
    }

    public abstract C5324j H0();

    public boolean K0(f fVar) {
        C6496s.h(fVar, "name");
        C6812k o10 = o();
        if (!(o10 instanceof w) || !((w) o10).t().contains(fVar)) {
            return false;
        }
        return true;
    }

    public abstract void L0(C5328n nVar);
}

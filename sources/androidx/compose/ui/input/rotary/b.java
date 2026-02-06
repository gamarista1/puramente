package androidx.compose.ui.input.rotary;

import F0.a;
import k0.i;
import yf.C6798l;

final class b extends i.c implements a {

    /* renamed from: n  reason: collision with root package name */
    private C6798l f13448n;

    /* renamed from: o  reason: collision with root package name */
    private C6798l f13449o;

    public b(C6798l lVar, C6798l lVar2) {
        this.f13448n = lVar;
        this.f13449o = lVar2;
    }

    public boolean J0(F0.b bVar) {
        C6798l lVar = this.f13448n;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(bVar)).booleanValue();
        }
        return false;
    }

    public final void l2(C6798l lVar) {
        this.f13448n = lVar;
    }

    public final void m2(C6798l lVar) {
        this.f13449o = lVar;
    }

    public boolean s0(F0.b bVar) {
        C6798l lVar = this.f13449o;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(bVar)).booleanValue();
        }
        return false;
    }
}

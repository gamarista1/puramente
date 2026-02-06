package Ug;

import qf.g;

public final class f1 extends G {

    /* renamed from: c  reason: collision with root package name */
    public static final f1 f65373c = new f1();

    private f1() {
    }

    public boolean B1(g gVar) {
        return false;
    }

    public G C1(int i10) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }

    public void z1(g gVar, Runnable runnable) {
        j1 j1Var = (j1) gVar.b(j1.f65390c);
        if (j1Var != null) {
            j1Var.f65391b = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
}

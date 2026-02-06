package O0;

import J0.w0;
import k0.i;
import yf.C6798l;

public final class c extends i.c implements w0 {

    /* renamed from: n  reason: collision with root package name */
    private boolean f4527n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f4528o;

    /* renamed from: p  reason: collision with root package name */
    private C6798l f4529p;

    public c(boolean z10, boolean z11, C6798l lVar) {
        this.f4527n = z10;
        this.f4528o = z11;
        this.f4529p = lVar;
    }

    public boolean F1() {
        return this.f4527n;
    }

    public void W(v vVar) {
        this.f4529p.invoke(vVar);
    }

    public boolean e0() {
        return this.f4528o;
    }

    public final void l2(boolean z10) {
        this.f4527n = z10;
    }

    public final void m2(C6798l lVar) {
        this.f4529p = lVar;
    }
}

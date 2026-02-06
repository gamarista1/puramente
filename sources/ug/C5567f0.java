package Ug;

import Zg.C5726o;
import mf.C6558k;

/* renamed from: Ug.f0  reason: case insensitive filesystem */
public abstract class C5567f0 extends G {

    /* renamed from: c  reason: collision with root package name */
    private long f65370c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f65371d;

    /* renamed from: e  reason: collision with root package name */
    private C6558k f65372e;

    public static /* synthetic */ void E1(C5567f0 f0Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            f0Var.D1(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    private final long F1(boolean z10) {
        if (z10) {
            return 4294967296L;
        }
        return 1;
    }

    public static /* synthetic */ void J1(C5567f0 f0Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            f0Var.I1(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final G C1(int i10) {
        C5726o.a(i10);
        return this;
    }

    public final void D1(boolean z10) {
        long F12 = this.f65370c - F1(z10);
        this.f65370c = F12;
        if (F12 <= 0 && this.f65371d) {
            shutdown();
        }
    }

    public final void G1(X x10) {
        C6558k kVar = this.f65372e;
        if (kVar == null) {
            kVar = new C6558k();
            this.f65372e = kVar;
        }
        kVar.addLast(x10);
    }

    /* access modifiers changed from: protected */
    public long H1() {
        C6558k kVar = this.f65372e;
        if (kVar != null && !kVar.isEmpty()) {
            return 0;
        }
        return Long.MAX_VALUE;
    }

    public final void I1(boolean z10) {
        this.f65370c += F1(z10);
        if (!z10) {
            this.f65371d = true;
        }
    }

    public final boolean K1() {
        if (this.f65370c >= F1(true)) {
            return true;
        }
        return false;
    }

    public final boolean L1() {
        C6558k kVar = this.f65372e;
        if (kVar != null) {
            return kVar.isEmpty();
        }
        return true;
    }

    public abstract long M1();

    public final boolean N1() {
        X x10;
        C6558k kVar = this.f65372e;
        if (kVar == null || (x10 = (X) kVar.E()) == null) {
            return false;
        }
        x10.run();
        return true;
    }

    public boolean O1() {
        return false;
    }

    public abstract void shutdown();
}

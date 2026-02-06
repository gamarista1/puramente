package Ug;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Ug.z0  reason: case insensitive filesystem */
public class C5606z0 extends E0 implements C5605z {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f65419c = c1();

    public C5606z0(C5600w0 w0Var) {
        super(true);
        r0(w0Var);
    }

    private final boolean c1() {
        C5595u uVar;
        E0 v10;
        C5595u uVar2;
        C5593t k02 = k0();
        if (k02 instanceof C5595u) {
            uVar = (C5595u) k02;
        } else {
            uVar = null;
        }
        if (!(uVar == null || (v10 = uVar.v()) == null)) {
            while (!v10.e0()) {
                C5593t k03 = v10.k0();
                if (k03 instanceof C5595u) {
                    uVar2 = (C5595u) k03;
                } else {
                    uVar2 = null;
                }
                if (uVar2 != null) {
                    v10 = uVar2.v();
                    if (v10 == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean e0() {
        return this.f65419c;
    }

    public boolean f(Throwable th2) {
        return z0(new B(th2, false, 2, (DefaultConstructorMarker) null));
    }

    public boolean h0() {
        return true;
    }
}

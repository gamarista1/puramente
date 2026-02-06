package V0;

import V0.p;

/* renamed from: V0.d  reason: case insensitive filesystem */
public abstract class C1423d {
    public static final p a(p.a aVar) {
        return aVar.f();
    }

    public static final int b(boolean z10, boolean z11) {
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        if (z11) {
            return 2;
        }
        return 0;
    }

    public static final int c(p pVar, int i10) {
        boolean z10;
        if (pVar.compareTo(a(p.f8210b)) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return b(z10, n.f(i10, n.f8200b.a()));
    }
}

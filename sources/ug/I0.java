package Ug;

import Zg.C5726o;

public abstract class I0 extends G {
    public G C1(int i10) {
        C5726o.a(i10);
        return this;
    }

    public abstract I0 D1();

    /* access modifiers changed from: protected */
    public final String E1() {
        I0 i02;
        I0 c10 = Z.c();
        if (this == c10) {
            return "Dispatchers.Main";
        }
        try {
            i02 = c10.D1();
        } catch (UnsupportedOperationException unused) {
            i02 = null;
        }
        if (this == i02) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}

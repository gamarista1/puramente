package androidx.media3.exoplayer;

import f2.s;

public interface r0 {

    public interface a {
        void c(q0 q0Var);
    }

    static int B(int i10) {
        return i10 & 7;
    }

    static boolean E(int i10, boolean z10) {
        int B10 = B(i10);
        if (B10 == 4 || (z10 && B10 == 3)) {
            return true;
        }
        return false;
    }

    static int F(int i10, int i11, int i12, int i13) {
        return L(i10, i11, i12, 0, 128, i13);
    }

    static int I(int i10) {
        return i10 & 3584;
    }

    static int L(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i10 | i11 | i12 | i13 | i14 | i15;
    }

    static int i(int i10) {
        return i10 & 384;
    }

    static int l(int i10, int i11, int i12, int i13, int i14) {
        return L(i10, i11, i12, i13, i14, 0);
    }

    static int m(int i10) {
        return i10 & 32;
    }

    static int n(int i10) {
        return i10 & 24;
    }

    static int o(int i10) {
        return F(i10, 0, 0, 0);
    }

    static int s(int i10) {
        return i10 & 64;
    }

    void C();

    void P(a aVar);

    int a(s sVar);

    int e();

    String getName();

    int w();
}

package k9;

public interface b1 {
    static int B(int i10) {
        return i10 & 7;
    }

    static int C(int i10, int i11, int i12) {
        return l(i10, i11, i12, 0, 128);
    }

    static int i(int i10) {
        return i10 & 128;
    }

    static int l(int i10, int i11, int i12, int i13, int i14) {
        return i10 | i11 | i12 | i13 | i14;
    }

    static int m(int i10) {
        return i10 & 32;
    }

    static int n(int i10) {
        return i10 & 24;
    }

    static int o(int i10) {
        return C(i10, 0, 0);
    }

    static int s(int i10) {
        return i10 & 64;
    }

    int a(C3717q0 q0Var);

    int e();

    String getName();

    int w();
}

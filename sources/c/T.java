package C;

import H0.G;
import H0.H;
import H0.U;

public interface T {
    static /* synthetic */ long o(T t10, int i10, int i11, int i12, int i13, boolean z10, int i14, Object obj) {
        if (obj == null) {
            if ((i14 & 16) != 0) {
                z10 = false;
            }
            return t10.e(i10, i11, i12, i13, z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createConstraints-xF2OJ5Q");
    }

    void c(int i10, int[] iArr, int[] iArr2, H h10);

    int d(U u10);

    long e(int i10, int i11, int i12, int i13, boolean z10);

    G f(U[] uArr, H h10, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15);

    int i(U u10);
}

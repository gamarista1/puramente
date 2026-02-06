package i2;

/* renamed from: i2.B  reason: case insensitive filesystem */
public abstract class C2074B {
    public static int a(int i10, int i11) {
        for (int i12 = 1; i12 <= 2; i12++) {
            int i13 = (i10 + i12) % 3;
            if (b(i13, i11)) {
                return i13;
            }
        }
        return i10;
    }

    public static boolean b(int i10, int i11) {
        if (i10 == 0) {
            return true;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            if ((i11 & 2) != 0) {
                return true;
            }
            return false;
        } else if ((i11 & 1) != 0) {
            return true;
        } else {
            return false;
        }
    }
}

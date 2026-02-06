package zd;

/* renamed from: zd.a  reason: case insensitive filesystem */
public abstract class C5314a {
    public static final boolean a(float f10, float f11, float f12) {
        if (Math.abs(f10 - f11) <= f12) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean b(float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f12 = 1.0E-4f;
        }
        return a(f10, f11, f12);
    }
}

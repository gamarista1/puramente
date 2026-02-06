package f7;

import android.util.SparseIntArray;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f43454a = new n();

    /* renamed from: b  reason: collision with root package name */
    private static final SparseIntArray f43455b = new SparseIntArray(0);

    private n() {
    }

    public static final E a() {
        return new E(0, f43454a.b(), f43455b);
    }

    private final int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }
}

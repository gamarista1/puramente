package K;

import android.os.Build;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f3980a;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 34) {
            z10 = true;
        } else {
            z10 = false;
        }
        f3980a = z10;
    }

    public static final boolean a() {
        return f3980a;
    }
}

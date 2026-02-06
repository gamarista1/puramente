package ja;

import android.os.Trace;

public abstract class J {
    public static void a(String str) {
        if (M.f44981a >= 18) {
            b(str);
        }
    }

    private static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (M.f44981a >= 18) {
            d();
        }
    }

    private static void d() {
        Trace.endSection();
    }
}

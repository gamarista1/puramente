package o4;

import android.os.SystemClock;
import java.io.File;

final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f47015a = new u();

    /* renamed from: b  reason: collision with root package name */
    private static final File f47016b = new File("/proc/self/fd");

    /* renamed from: c  reason: collision with root package name */
    private static int f47017c = 30;

    /* renamed from: d  reason: collision with root package name */
    private static long f47018d = SystemClock.uptimeMillis();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f47019e = true;

    private u() {
    }

    private final boolean a() {
        int i10 = f47017c;
        f47017c = i10 + 1;
        if (i10 >= 30 || SystemClock.uptimeMillis() > f47018d + ((long) 30000)) {
            return true;
        }
        return false;
    }

    public final synchronized boolean b(z zVar) {
        try {
            if (a()) {
                boolean z10 = false;
                f47017c = 0;
                f47018d = SystemClock.uptimeMillis();
                String[] list = f47016b.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                if (length < 800) {
                    z10 = true;
                }
                f47019e = z10;
                if (!z10 && zVar != null && zVar.b() <= 5) {
                    zVar.a("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, (Throwable) null);
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return f47019e;
    }
}

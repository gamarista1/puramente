package w8;

/* renamed from: w8.a  reason: case insensitive filesystem */
public abstract class C4145a {

    /* renamed from: a  reason: collision with root package name */
    private static C4146b f49228a;

    public static void a(C4146b bVar) {
        synchronized (C4145a.class) {
            try {
                if (f49228a == null) {
                    f49228a = bVar;
                } else {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(C4146b bVar) {
        if (!c()) {
            a(bVar);
        }
    }

    public static boolean c() {
        boolean z10;
        synchronized (C4145a.class) {
            if (f49228a != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public static boolean d(String str) {
        return e(str, 0);
    }

    public static boolean e(String str, int i10) {
        C4146b bVar;
        synchronized (C4145a.class) {
            bVar = f49228a;
            if (bVar == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return bVar.a(str, i10);
    }
}

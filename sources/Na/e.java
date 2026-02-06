package Na;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static e f52065a;

    public static synchronized e b() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f52065a == null) {
                    f52065a = new b();
                }
                eVar = f52065a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return eVar;
    }

    public abstract f a(String str, boolean z10);
}

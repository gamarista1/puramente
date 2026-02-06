package Q5;

public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private static c f33661a;

    private c() {
    }

    public static synchronized c b() {
        c cVar;
        synchronized (c.class) {
            try {
                if (f33661a == null) {
                    f33661a = new c();
                }
                cVar = f33661a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return cVar;
    }

    public void a(a aVar) {
    }
}

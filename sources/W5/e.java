package W5;

public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private static e f34855a;

    public static synchronized e b() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f34855a == null) {
                    f34855a = new e();
                }
                eVar = f34855a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return eVar;
    }

    public void a(c cVar) {
    }
}

package M5;

import M5.a;

public class g implements a {

    /* renamed from: a  reason: collision with root package name */
    private static g f32601a;

    private g() {
    }

    public static synchronized g b() {
        g gVar;
        synchronized (g.class) {
            try {
                if (f32601a == null) {
                    f32601a = new g();
                }
                gVar = f32601a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return gVar;
    }

    public void a(a.C0534a aVar, Class cls, String str, Throwable th2) {
    }
}

package f7;

import com.facebook.imagepipeline.memory.a;

public class z implements F {

    /* renamed from: a  reason: collision with root package name */
    private static z f43473a;

    private z() {
    }

    public static synchronized z h() {
        z zVar;
        synchronized (z.class) {
            try {
                if (f43473a == null) {
                    f43473a = new z();
                }
                zVar = f43473a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return zVar;
    }

    public void a() {
    }

    public void g() {
    }

    public void b(int i10) {
    }

    public void c(int i10) {
    }

    public void d(int i10) {
    }

    public void e(int i10) {
    }

    public void f(a aVar) {
    }
}

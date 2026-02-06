package m6;

import android.os.Looper;

/* renamed from: m6.a  reason: case insensitive filesystem */
public abstract class C3777a {

    /* renamed from: a  reason: collision with root package name */
    private static C3777a f46467a;

    /* renamed from: m6.a$a  reason: collision with other inner class name */
    public interface C0696a {
        void release();
    }

    public static synchronized C3777a b() {
        C3777a aVar;
        synchronized (C3777a.class) {
            try {
                if (f46467a == null) {
                    f46467a = new C3778b();
                }
                aVar = f46467a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return aVar;
    }

    static boolean c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public abstract void a(C0696a aVar);

    public abstract void d(C0696a aVar);
}

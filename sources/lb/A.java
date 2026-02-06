package Lb;

import java.lang.Thread;

public interface A {

    /* renamed from: a  reason: collision with root package name */
    public static final A f51688a = new a();

    class a implements A {
        a() {
        }

        public void a(Thread thread, String str) {
            thread.setName(str);
        }

        public void b(Thread thread, boolean z10) {
            thread.setDaemon(z10);
        }

        public void c(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    void a(Thread thread, String str);

    void b(Thread thread, boolean z10);

    void c(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler);
}

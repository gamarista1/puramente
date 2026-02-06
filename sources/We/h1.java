package We;

import java.lang.Thread;

interface h1 {

    public static final class a implements h1 {

        /* renamed from: a  reason: collision with root package name */
        private static final a f65869a = new a();

        private a() {
        }

        static h1 c() {
            return f65869a;
        }

        public void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        public Thread.UncaughtExceptionHandler b() {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
    }

    void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    Thread.UncaughtExceptionHandler b();
}

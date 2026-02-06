package ae;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.C6496s;

public interface p {

    public static final class a {
        public static void a(p pVar, CodedException codedException) {
            C6496s.h(codedException, "exception");
            pVar.reject(codedException.getCode(), codedException.getLocalizedMessage(), codedException.getCause());
        }

        public static void b(p pVar) {
            pVar.resolve((Object) null);
        }

        public static void c(p pVar, double d10) {
            pVar.resolve(Double.valueOf(d10));
        }

        public static void d(p pVar, float f10) {
            pVar.resolve(Float.valueOf(f10));
        }

        public static void e(p pVar, int i10) {
            pVar.resolve(Integer.valueOf(i10));
        }

        public static void f(p pVar, String str) {
            C6496s.h(str, "result");
            pVar.resolve(str);
        }

        public static void g(p pVar, boolean z10) {
            pVar.resolve(Boolean.valueOf(z10));
        }
    }

    void a();

    void b(boolean z10);

    void c(int i10);

    void d(double d10);

    void e(float f10);

    void f(String str);

    void g(CodedException codedException);

    void reject(String str, String str2, Throwable th2);

    void resolve(Object obj);
}

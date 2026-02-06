package P3;

import java.util.List;
import kotlin.jvm.internal.C6496s;

public interface j {

    public static final class a {
        public static i a(j jVar, m mVar) {
            C6496s.h(mVar, "id");
            return j.super.a(mVar);
        }

        public static void b(j jVar, m mVar) {
            C6496s.h(mVar, "id");
            j.super.f(mVar);
        }
    }

    i a(m mVar) {
        C6496s.h(mVar, "id");
        return b(mVar.b(), mVar.a());
    }

    i b(String str, int i10);

    void c(i iVar);

    List d();

    void f(m mVar) {
        C6496s.h(mVar, "id");
        h(mVar.b(), mVar.a());
    }

    void h(String str, int i10);

    void i(String str);
}

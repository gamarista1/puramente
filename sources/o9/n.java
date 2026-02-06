package o9;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import n9.C3866b;
import o9.u;

public interface n {

    public static class a extends IOException {

        /* renamed from: a  reason: collision with root package name */
        public final int f47527a;

        public a(Throwable th2, int i10) {
            super(th2);
            this.f47527a = i10;
        }
    }

    static void h(n nVar, n nVar2) {
        if (nVar != nVar2) {
            if (nVar2 != null) {
                nVar2.g((u.a) null);
            }
            if (nVar != null) {
                nVar.i((u.a) null);
            }
        }
    }

    a a();

    UUID b();

    boolean c();

    C3866b d();

    Map e();

    boolean f(String str);

    void g(u.a aVar);

    int getState();

    void i(u.a aVar);
}

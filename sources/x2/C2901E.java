package x2;

import android.view.Surface;
import f2.P;
import f2.s;
import i2.C2075C;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: x2.E  reason: case insensitive filesystem */
public interface C2901E {

    /* renamed from: x2.E$b */
    public static final class b extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final s f28226a;

        public b(Throwable th2, s sVar) {
            super(th2);
            this.f28226a = sVar;
        }
    }

    boolean b();

    void c(a aVar, Executor executor);

    boolean d();

    boolean e();

    void g(long j10, long j11);

    long i(long j10, boolean z10);

    void j();

    void k();

    void l(List list);

    void m(long j10, long j11);

    boolean n();

    void o(boolean z10);

    Surface p();

    void q();

    void r(Surface surface, C2075C c10);

    void release();

    void s();

    void t(o oVar);

    void u();

    void v(boolean z10);

    void w(s sVar);

    void x(int i10, s sVar);

    void z(float f10);

    /* renamed from: x2.E$a */
    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f28225a = new C0471a();

        void a(C2901E e10);

        void b(C2901E e10, P p10);

        void c(C2901E e10);

        /* renamed from: x2.E$a$a  reason: collision with other inner class name */
        class C0471a implements a {
            C0471a() {
            }

            public void a(C2901E e10) {
            }

            public void c(C2901E e10) {
            }

            public void b(C2901E e10, P p10) {
            }
        }
    }
}

package N9;

import android.os.Handler;
import ia.C3604b;
import ia.J;
import k9.C3732y0;
import k9.n1;
import l9.s0;
import o9.u;

/* renamed from: N9.t  reason: case insensitive filesystem */
public interface C3070t {

    /* renamed from: N9.t$a */
    public interface a {
    }

    /* renamed from: N9.t$b */
    public static final class b extends C3069s {
        public b(Object obj) {
            super(obj);
        }

        public b c(Object obj) {
            return new b(super.a(obj));
        }

        public b(Object obj, long j10) {
            super(obj, j10);
        }

        public b(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public b(C3069s sVar) {
            super(sVar);
        }
    }

    /* renamed from: N9.t$c */
    public interface c {
        void a(C3070t tVar, n1 n1Var);
    }

    C3732y0 a();

    void c();

    boolean d() {
        return true;
    }

    n1 e() {
        return null;
    }

    void f(Handler handler, A a10);

    void g(r rVar);

    void h(A a10);

    r i(b bVar, C3604b bVar2, long j10);

    void j(Handler handler, u uVar);

    void k(c cVar);

    void m(u uVar);

    void n(c cVar);

    void o(c cVar);

    void q(c cVar, J j10, s0 s0Var);
}

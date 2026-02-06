package Ug;

import Rg.h;
import java.util.concurrent.CancellationException;
import qf.C6658d;
import qf.g;
import yf.C6798l;
import yf.p;

/* renamed from: Ug.w0  reason: case insensitive filesystem */
public interface C5600w0 extends g.b {

    /* renamed from: O  reason: collision with root package name */
    public static final b f65416O = b.f65417a;

    /* renamed from: Ug.w0$a */
    public static final class a {
        public static /* synthetic */ void a(C5600w0 w0Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    cancellationException = null;
                }
                w0Var.n(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static Object b(C5600w0 w0Var, Object obj, p pVar) {
            return g.b.a.a(w0Var, obj, pVar);
        }

        public static g.b c(C5600w0 w0Var, g.c cVar) {
            return g.b.a.b(w0Var, cVar);
        }

        public static g d(C5600w0 w0Var, g.c cVar) {
            return g.b.a.c(w0Var, cVar);
        }

        public static g e(C5600w0 w0Var, g gVar) {
            return g.b.a.d(w0Var, gVar);
        }
    }

    /* renamed from: Ug.w0$b */
    public static final class b implements g.c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f65417a = new b();

        private b() {
        }
    }

    Object B0(C6658d dVar);

    h E();

    CancellationException M();

    C5559b0 P0(C6798l lVar);

    boolean a();

    C5600w0 getParent();

    boolean isCancelled();

    void n(CancellationException cancellationException);

    boolean o();

    C5593t q(C5597v vVar);

    boolean start();

    C5559b0 x0(boolean z10, boolean z11, C6798l lVar);
}

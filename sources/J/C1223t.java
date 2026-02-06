package J;

import B0.d;
import android.view.KeyEvent;

/* renamed from: J.t  reason: case insensitive filesystem */
public abstract class C1223t {

    /* renamed from: a  reason: collision with root package name */
    private static final r f3474a = new a();

    /* renamed from: J.t$a */
    public static final class a implements r {
        a() {
        }

        public C1220p a(KeyEvent keyEvent) {
            C1220p pVar = null;
            if (d.f(keyEvent) && d.d(keyEvent)) {
                long a10 = d.a(keyEvent);
                C c10 = C.f2837a;
                if (B0.a.p(a10, c10.i())) {
                    pVar = C1220p.SELECT_LINE_LEFT;
                } else if (B0.a.p(a10, c10.j())) {
                    pVar = C1220p.SELECT_LINE_RIGHT;
                } else if (B0.a.p(a10, c10.k())) {
                    pVar = C1220p.SELECT_HOME;
                } else if (B0.a.p(a10, c10.h())) {
                    pVar = C1220p.SELECT_END;
                }
            } else if (d.d(keyEvent)) {
                long a11 = d.a(keyEvent);
                C c11 = C.f2837a;
                if (B0.a.p(a11, c11.i())) {
                    pVar = C1220p.LINE_LEFT;
                } else if (B0.a.p(a11, c11.j())) {
                    pVar = C1220p.LINE_RIGHT;
                } else if (B0.a.p(a11, c11.k())) {
                    pVar = C1220p.HOME;
                } else if (B0.a.p(a11, c11.h())) {
                    pVar = C1220p.END;
                }
            }
            if (pVar == null) {
                return C1222s.b().a(keyEvent);
            }
            return pVar;
        }
    }

    public static final r a() {
        return f3474a;
    }
}

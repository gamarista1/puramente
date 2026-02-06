package J;

import B0.d;
import android.view.KeyEvent;
import kotlin.jvm.internal.F;
import yf.C6798l;

/* renamed from: J.s  reason: case insensitive filesystem */
public abstract class C1222s {

    /* renamed from: a  reason: collision with root package name */
    private static final r f3470a = new c(a(b.f3472b));

    /* renamed from: J.s$a */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f3471a;

        a(C6798l lVar) {
            this.f3471a = lVar;
        }

        public C1220p a(KeyEvent keyEvent) {
            boolean z10;
            if (!((Boolean) this.f3471a.invoke(B0.b.a(keyEvent))).booleanValue() || !d.f(keyEvent)) {
                if (((Boolean) this.f3471a.invoke(B0.b.a(keyEvent))).booleanValue()) {
                    long a10 = d.a(keyEvent);
                    C c10 = C.f2837a;
                    if (B0.a.p(a10, c10.d())) {
                        z10 = true;
                    } else {
                        z10 = B0.a.p(a10, c10.n());
                    }
                    if (z10) {
                        return C1220p.COPY;
                    }
                    if (B0.a.p(a10, c10.u())) {
                        return C1220p.PASTE;
                    }
                    if (B0.a.p(a10, c10.v())) {
                        return C1220p.CUT;
                    }
                    if (B0.a.p(a10, c10.a())) {
                        return C1220p.SELECT_ALL;
                    }
                    if (B0.a.p(a10, c10.w())) {
                        return C1220p.REDO;
                    }
                    if (B0.a.p(a10, c10.x())) {
                        return C1220p.UNDO;
                    }
                    return null;
                } else if (d.e(keyEvent)) {
                    return null;
                } else {
                    if (d.f(keyEvent)) {
                        long a11 = d.a(keyEvent);
                        C c11 = C.f2837a;
                        if (B0.a.p(a11, c11.i())) {
                            return C1220p.SELECT_LEFT_CHAR;
                        }
                        if (B0.a.p(a11, c11.j())) {
                            return C1220p.SELECT_RIGHT_CHAR;
                        }
                        if (B0.a.p(a11, c11.k())) {
                            return C1220p.SELECT_UP;
                        }
                        if (B0.a.p(a11, c11.h())) {
                            return C1220p.SELECT_DOWN;
                        }
                        if (B0.a.p(a11, c11.r())) {
                            return C1220p.SELECT_PAGE_UP;
                        }
                        if (B0.a.p(a11, c11.q())) {
                            return C1220p.SELECT_PAGE_DOWN;
                        }
                        if (B0.a.p(a11, c11.p())) {
                            return C1220p.SELECT_LINE_START;
                        }
                        if (B0.a.p(a11, c11.o())) {
                            return C1220p.SELECT_LINE_END;
                        }
                        if (B0.a.p(a11, c11.n())) {
                            return C1220p.PASTE;
                        }
                        return null;
                    }
                    long a12 = d.a(keyEvent);
                    C c12 = C.f2837a;
                    if (B0.a.p(a12, c12.i())) {
                        return C1220p.LEFT_CHAR;
                    }
                    if (B0.a.p(a12, c12.j())) {
                        return C1220p.RIGHT_CHAR;
                    }
                    if (B0.a.p(a12, c12.k())) {
                        return C1220p.UP;
                    }
                    if (B0.a.p(a12, c12.h())) {
                        return C1220p.DOWN;
                    }
                    if (B0.a.p(a12, c12.r())) {
                        return C1220p.PAGE_UP;
                    }
                    if (B0.a.p(a12, c12.q())) {
                        return C1220p.PAGE_DOWN;
                    }
                    if (B0.a.p(a12, c12.p())) {
                        return C1220p.LINE_START;
                    }
                    if (B0.a.p(a12, c12.o())) {
                        return C1220p.LINE_END;
                    }
                    if (B0.a.p(a12, c12.l())) {
                        return C1220p.NEW_LINE;
                    }
                    if (B0.a.p(a12, c12.c())) {
                        return C1220p.DELETE_PREV_CHAR;
                    }
                    if (B0.a.p(a12, c12.g())) {
                        return C1220p.DELETE_NEXT_CHAR;
                    }
                    if (B0.a.p(a12, c12.s())) {
                        return C1220p.PASTE;
                    }
                    if (B0.a.p(a12, c12.f())) {
                        return C1220p.CUT;
                    }
                    if (B0.a.p(a12, c12.e())) {
                        return C1220p.COPY;
                    }
                    if (B0.a.p(a12, c12.t())) {
                        return C1220p.TAB;
                    }
                    return null;
                }
            } else if (B0.a.p(d.a(keyEvent), C.f2837a.x())) {
                return C1220p.REDO;
            } else {
                return null;
            }
        }
    }

    /* renamed from: J.s$b */
    /* synthetic */ class b extends F {

        /* renamed from: b  reason: collision with root package name */
        public static final b f3472b = new b();

        b() {
            super(d.class, "isCtrlPressed", "isCtrlPressed-ZmokQxo(Landroid/view/KeyEvent;)Z", 1);
        }

        public Object get(Object obj) {
            return Boolean.valueOf(d.e(((B0.b) obj).f()));
        }
    }

    /* renamed from: J.s$c */
    public static final class c implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f3473a;

        c(r rVar) {
            this.f3473a = rVar;
        }

        public C1220p a(KeyEvent keyEvent) {
            C1220p pVar = null;
            if (d.f(keyEvent) && d.e(keyEvent)) {
                long a10 = d.a(keyEvent);
                C c10 = C.f2837a;
                if (B0.a.p(a10, c10.i())) {
                    pVar = C1220p.SELECT_LEFT_WORD;
                } else if (B0.a.p(a10, c10.j())) {
                    pVar = C1220p.SELECT_RIGHT_WORD;
                } else if (B0.a.p(a10, c10.k())) {
                    pVar = C1220p.SELECT_PREV_PARAGRAPH;
                } else if (B0.a.p(a10, c10.h())) {
                    pVar = C1220p.SELECT_NEXT_PARAGRAPH;
                }
            } else if (d.e(keyEvent)) {
                long a11 = d.a(keyEvent);
                C c11 = C.f2837a;
                if (B0.a.p(a11, c11.i())) {
                    pVar = C1220p.LEFT_WORD;
                } else if (B0.a.p(a11, c11.j())) {
                    pVar = C1220p.RIGHT_WORD;
                } else if (B0.a.p(a11, c11.k())) {
                    pVar = C1220p.PREV_PARAGRAPH;
                } else if (B0.a.p(a11, c11.h())) {
                    pVar = C1220p.NEXT_PARAGRAPH;
                } else if (B0.a.p(a11, c11.m())) {
                    pVar = C1220p.DELETE_PREV_CHAR;
                } else if (B0.a.p(a11, c11.g())) {
                    pVar = C1220p.DELETE_NEXT_WORD;
                } else if (B0.a.p(a11, c11.c())) {
                    pVar = C1220p.DELETE_PREV_WORD;
                } else if (B0.a.p(a11, c11.b())) {
                    pVar = C1220p.DESELECT;
                }
            } else if (d.f(keyEvent)) {
                long a12 = d.a(keyEvent);
                C c12 = C.f2837a;
                if (B0.a.p(a12, c12.p())) {
                    pVar = C1220p.SELECT_LINE_LEFT;
                } else if (B0.a.p(a12, c12.o())) {
                    pVar = C1220p.SELECT_LINE_RIGHT;
                }
            } else if (d.d(keyEvent)) {
                long a13 = d.a(keyEvent);
                C c13 = C.f2837a;
                if (B0.a.p(a13, c13.c())) {
                    pVar = C1220p.DELETE_FROM_LINE_START;
                } else if (B0.a.p(a13, c13.g())) {
                    pVar = C1220p.DELETE_TO_LINE_END;
                }
            }
            if (pVar == null) {
                return this.f3473a.a(keyEvent);
            }
            return pVar;
        }
    }

    public static final r a(C6798l lVar) {
        return new a(lVar);
    }

    public static final r b() {
        return f3470a;
    }
}

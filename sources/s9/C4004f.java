package s9;

import com.google.common.collect.C4770v;
import com.google.common.collect.g0;
import ja.B;

/* renamed from: s9.f  reason: case insensitive filesystem */
final class C4004f implements C3999a {

    /* renamed from: a  reason: collision with root package name */
    public final C4770v f48153a;

    /* renamed from: b  reason: collision with root package name */
    private final int f48154b;

    private C4004f(int i10, C4770v vVar) {
        this.f48154b = i10;
        this.f48153a = vVar;
    }

    private static C3999a a(int i10, int i11, B b10) {
        switch (i10) {
            case 1718776947:
                return C4005g.d(i11, b10);
            case 1751742049:
                return C4001c.b(b10);
            case 1752331379:
                return C4002d.c(b10);
            case 1852994675:
                return C4006h.a(b10);
            default:
                return null;
        }
    }

    public static C4004f c(int i10, B b10) {
        C3999a aVar;
        C4770v.a aVar2 = new C4770v.a();
        int f10 = b10.f();
        int i11 = -2;
        while (b10.a() > 8) {
            int q10 = b10.q();
            int e10 = b10.e() + b10.q();
            b10.O(e10);
            if (q10 == 1414744396) {
                aVar = c(b10.q(), b10);
            } else {
                aVar = a(q10, i11, b10);
            }
            if (aVar != null) {
                if (aVar.getType() == 1752331379) {
                    i11 = ((C4002d) aVar).b();
                }
                aVar2.a(aVar);
            }
            b10.P(e10);
            b10.O(f10);
        }
        return new C4004f(i10, aVar2.k());
    }

    public C3999a b(Class cls) {
        g0 m10 = this.f48153a.iterator();
        while (m10.hasNext()) {
            C3999a aVar = (C3999a) m10.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    public int getType() {
        return this.f48154b;
    }
}

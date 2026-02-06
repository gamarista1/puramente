package B2;

import com.google.common.collect.C4770v;
import com.google.common.collect.g0;
import i2.C2073A;

final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final C4770v f820a;

    /* renamed from: b  reason: collision with root package name */
    private final int f821b;

    private f(int i10, C4770v vVar) {
        this.f821b = i10;
        this.f820a = vVar;
    }

    private static a a(int i10, int i11, C2073A a10) {
        switch (i10) {
            case 1718776947:
                return g.d(i11, a10);
            case 1751742049:
                return c.b(a10);
            case 1752331379:
                return d.c(a10);
            case 1852994675:
                return h.a(a10);
            default:
                return null;
        }
    }

    public static f c(int i10, C2073A a10) {
        a aVar;
        C4770v.a aVar2 = new C4770v.a();
        int g10 = a10.g();
        int i11 = -2;
        while (a10.a() > 8) {
            int u10 = a10.u();
            int f10 = a10.f() + a10.u();
            a10.T(f10);
            if (u10 == 1414744396) {
                aVar = c(a10.u(), a10);
            } else {
                aVar = a(u10, i11, a10);
            }
            if (aVar != null) {
                if (aVar.getType() == 1752331379) {
                    i11 = ((d) aVar).b();
                }
                aVar2.a(aVar);
            }
            a10.U(f10);
            a10.T(g10);
        }
        return new f(i10, aVar2.k());
    }

    public a b(Class cls) {
        g0 m10 = this.f820a.iterator();
        while (m10.hasNext()) {
            a aVar = (a) m10.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    public int getType() {
        return this.f821b;
    }
}

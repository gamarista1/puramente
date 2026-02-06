package F4;

import G4.c;

/* renamed from: F4.n  reason: case insensitive filesystem */
abstract class C3011n {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30718a = c.a.a("fFamily", "fName", "fStyle", "ascent");

    static A4.c a(c cVar) {
        cVar.f();
        String str = null;
        String str2 = null;
        float f10 = 0.0f;
        String str3 = null;
        while (cVar.q()) {
            int T10 = cVar.T(f30718a);
            if (T10 == 0) {
                str = cVar.F();
            } else if (T10 == 1) {
                str3 = cVar.F();
            } else if (T10 == 2) {
                str2 = cVar.F();
            } else if (T10 != 3) {
                cVar.U();
                cVar.V();
            } else {
                f10 = (float) cVar.v();
            }
        }
        cVar.o();
        return new A4.c(str, str3, str2, f10);
    }
}

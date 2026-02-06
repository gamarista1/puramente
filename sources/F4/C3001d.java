package F4;

import B4.a;
import B4.b;
import B4.d;
import B4.f;
import B4.g;
import B4.h;
import B4.j;
import G4.c;
import H4.l;
import java.util.List;
import u4.C4071k;

/* renamed from: F4.d  reason: case insensitive filesystem */
public abstract class C3001d {
    private static List a(c cVar, float f10, C4071k kVar, N n10) {
        return u.a(cVar, kVar, f10, n10, false);
    }

    private static List b(c cVar, C4071k kVar, N n10) {
        return u.a(cVar, kVar, 1.0f, n10, false);
    }

    static a c(c cVar, C4071k kVar) {
        return new a(b(cVar, kVar, C3004g.f30699a));
    }

    static j d(c cVar, C4071k kVar) {
        return new j(a(cVar, l.e(), kVar, C3006i.f30701a));
    }

    public static b e(c cVar, C4071k kVar) {
        return f(cVar, kVar, true);
    }

    public static b f(c cVar, C4071k kVar, boolean z10) {
        float f10;
        if (z10) {
            f10 = l.e();
        } else {
            f10 = 1.0f;
        }
        return new b(a(cVar, f10, kVar, C3009l.f30715a));
    }

    static B4.c g(c cVar, C4071k kVar, int i10) {
        return new B4.c(b(cVar, kVar, new o(i10)));
    }

    static d h(c cVar, C4071k kVar) {
        return new d(b(cVar, kVar, r.f30725a));
    }

    static f i(c cVar, C4071k kVar) {
        return new f(u.a(cVar, kVar, l.e(), B.f30676a, true));
    }

    static g j(c cVar, C4071k kVar) {
        return new g(b(cVar, kVar, G.f30681a));
    }

    static h k(c cVar, C4071k kVar) {
        return new h(a(cVar, l.e(), kVar, H.f30682a));
    }
}

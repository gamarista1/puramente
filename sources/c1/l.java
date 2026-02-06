package c1;

import d1.C1923a;
import d1.C1924b;

public interface l {
    long P(float f10) {
        float f11;
        C1924b bVar = C1924b.f19438a;
        if (!bVar.f(r1())) {
            return w.e(f10 / r1());
        }
        C1923a b10 = bVar.b(r1());
        if (b10 != null) {
            f11 = b10.a(f10);
        } else {
            f11 = f10 / r1();
        }
        return w.e(f11);
    }

    float V(long j10) {
        float b10;
        if (!x.g(v.g(j10), x.f19246b.b())) {
            m.b("Only Sp can convert to Px");
        }
        C1924b bVar = C1924b.f19438a;
        if (!bVar.f(r1())) {
            return h.j(v.h(j10) * r1());
        }
        C1923a b11 = bVar.b(r1());
        float h10 = v.h(j10);
        if (b11 == null) {
            b10 = h10 * r1();
        } else {
            b10 = b11.b(h10);
        }
        return h.j(b10);
    }

    float r1();
}

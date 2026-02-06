package jh;

import gh.C5986j;
import gh.C5987k;
import ih.f;
import jh.d;
import jh.f;
import kh.C6440a0;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;

public abstract class b implements f, d {
    public final void A(f fVar, int i10, boolean z10) {
        C6496s.h(fVar, "descriptor");
        if (G(fVar, i10)) {
            u(z10);
        }
    }

    public void B(f fVar, int i10, C5987k kVar, Object obj) {
        C6496s.h(fVar, "descriptor");
        C6496s.h(kVar, "serializer");
        if (G(fVar, i10)) {
            m(kVar, obj);
        }
    }

    public final void C(f fVar, int i10, long j10) {
        C6496s.h(fVar, "descriptor");
        if (G(fVar, i10)) {
            n(j10);
        }
    }

    public void D(int i10) {
        I(Integer.valueOf(i10));
    }

    public final void E(f fVar, int i10, short s10) {
        C6496s.h(fVar, "descriptor");
        if (G(fVar, i10)) {
            s(s10);
        }
    }

    public void F(String str) {
        C6496s.h(str, "value");
        I(str);
    }

    public boolean G(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return true;
    }

    public void H(C5987k kVar, Object obj) {
        f.a.c(this, kVar, obj);
    }

    public void I(Object obj) {
        C6496s.h(obj, "value");
        throw new C5986j("Non-serializable " + O.b(obj.getClass()) + " is not supported by " + O.b(getClass()) + " encoder");
    }

    public d b(ih.f fVar) {
        C6496s.h(fVar, "descriptor");
        return this;
    }

    public void c(ih.f fVar) {
        C6496s.h(fVar, "descriptor");
    }

    public d e(ih.f fVar, int i10) {
        return f.a.a(this, fVar, i10);
    }

    public void f(double d10) {
        I(Double.valueOf(d10));
    }

    public final void g(ih.f fVar, int i10, double d10) {
        C6496s.h(fVar, "descriptor");
        if (G(fVar, i10)) {
            f(d10);
        }
    }

    public void h(byte b10) {
        I(Byte.valueOf(b10));
    }

    public final void i(ih.f fVar, int i10, int i11) {
        C6496s.h(fVar, "descriptor");
        if (G(fVar, i10)) {
            D(i11);
        }
    }

    public f j(ih.f fVar) {
        C6496s.h(fVar, "descriptor");
        return this;
    }

    public final f k(ih.f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        if (G(fVar, i10)) {
            return j(fVar.g(i10));
        }
        return C6440a0.f71640a;
    }

    public final void l(ih.f fVar, int i10, byte b10) {
        C6496s.h(fVar, "descriptor");
        if (G(fVar, i10)) {
            h(b10);
        }
    }

    public void m(C5987k kVar, Object obj) {
        f.a.d(this, kVar, obj);
    }

    public void n(long j10) {
        I(Long.valueOf(j10));
    }

    public final void o(ih.f fVar, int i10, float f10) {
        C6496s.h(fVar, "descriptor");
        if (G(fVar, i10)) {
            x(f10);
        }
    }

    public void p(ih.f fVar, int i10, C5987k kVar, Object obj) {
        C6496s.h(fVar, "descriptor");
        C6496s.h(kVar, "serializer");
        if (G(fVar, i10)) {
            H(kVar, obj);
        }
    }

    public boolean q(ih.f fVar, int i10) {
        return d.a.a(this, fVar, i10);
    }

    public void r() {
        throw new C5986j("'null' is not supported by default");
    }

    public void s(short s10) {
        I(Short.valueOf(s10));
    }

    public final void t(ih.f fVar, int i10, String str) {
        C6496s.h(fVar, "descriptor");
        C6496s.h(str, "value");
        if (G(fVar, i10)) {
            F(str);
        }
    }

    public void u(boolean z10) {
        I(Boolean.valueOf(z10));
    }

    public final void v(ih.f fVar, int i10, char c10) {
        C6496s.h(fVar, "descriptor");
        if (G(fVar, i10)) {
            y(c10);
        }
    }

    public void w(ih.f fVar, int i10) {
        C6496s.h(fVar, "enumDescriptor");
        I(Integer.valueOf(i10));
    }

    public void x(float f10) {
        I(Float.valueOf(f10));
    }

    public void y(char c10) {
        I(Character.valueOf(c10));
    }

    public void z() {
        f.a.b(this);
    }
}

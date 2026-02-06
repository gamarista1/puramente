package jh;

import gh.C5977a;
import gh.C5986j;
import ih.f;
import jh.c;
import jh.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;

/* renamed from: jh.a  reason: case insensitive filesystem */
public abstract class C6432a implements e, c {
    public final String A(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return B();
    }

    public String B() {
        Object J10 = J();
        C6496s.f(J10, "null cannot be cast to non-null type kotlin.String");
        return (String) J10;
    }

    public Object C(f fVar, int i10, C5977a aVar, Object obj) {
        C6496s.h(fVar, "descriptor");
        C6496s.h(aVar, "deserializer");
        return I(aVar, obj);
    }

    public boolean D() {
        return true;
    }

    public final int E(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return h();
    }

    public int F(f fVar) {
        C6496s.h(fVar, "enumDescriptor");
        Object J10 = J();
        C6496s.f(J10, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) J10).intValue();
    }

    public final long G(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return m();
    }

    public abstract byte H();

    public Object I(C5977a aVar, Object obj) {
        C6496s.h(aVar, "deserializer");
        return n(aVar);
    }

    public Object J() {
        throw new C5986j(O.b(getClass()) + " can't retrieve untyped values");
    }

    public c b(f fVar) {
        C6496s.h(fVar, "descriptor");
        return this;
    }

    public void c(f fVar) {
        C6496s.h(fVar, "descriptor");
    }

    public e e(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return l(fVar.g(i10));
    }

    public final float f(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return u();
    }

    public abstract int h();

    public final Object i(f fVar, int i10, C5977a aVar, Object obj) {
        C6496s.h(fVar, "descriptor");
        C6496s.h(aVar, "deserializer");
        if (aVar.getDescriptor().b() || D()) {
            return I(aVar, obj);
        }
        return j();
    }

    public Void j() {
        return null;
    }

    public final byte k(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return H();
    }

    public e l(f fVar) {
        C6496s.h(fVar, "descriptor");
        return this;
    }

    public abstract long m();

    public Object n(C5977a aVar) {
        return e.a.a(this, aVar);
    }

    public boolean p() {
        return c.a.b(this);
    }

    public int q(f fVar) {
        return c.a.a(this, fVar);
    }

    public final short r(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return t();
    }

    public final boolean s(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return y();
    }

    public abstract short t();

    public float u() {
        Object J10 = J();
        C6496s.f(J10, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) J10).floatValue();
    }

    public final char v(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return z();
    }

    public double w() {
        Object J10 = J();
        C6496s.f(J10, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) J10).doubleValue();
    }

    public final double x(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return w();
    }

    public boolean y() {
        Object J10 = J();
        C6496s.f(J10, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) J10).booleanValue();
    }

    public char z() {
        Object J10 = J();
        C6496s.f(J10, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) J10).charValue();
    }
}

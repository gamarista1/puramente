package kh;

import gh.C5986j;
import gh.C5987k;
import java.util.ArrayList;
import jh.d;
import jh.f;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public abstract class z0 implements f, d {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f71741a = new ArrayList();

    private final boolean G(ih.f fVar, int i10) {
        Y(W(fVar, i10));
        return true;
    }

    public final void A(ih.f fVar, int i10, boolean z10) {
        C6496s.h(fVar, "descriptor");
        I(W(fVar, i10), z10);
    }

    public void B(ih.f fVar, int i10, C5987k kVar, Object obj) {
        C6496s.h(fVar, "descriptor");
        C6496s.h(kVar, "serializer");
        if (G(fVar, i10)) {
            m(kVar, obj);
        }
    }

    public final void C(ih.f fVar, int i10, long j10) {
        C6496s.h(fVar, "descriptor");
        Q(W(fVar, i10), j10);
    }

    public final void D(int i10) {
        P(X(), i10);
    }

    public final void E(ih.f fVar, int i10, short s10) {
        C6496s.h(fVar, "descriptor");
        R(W(fVar, i10), s10);
    }

    public final void F(String str) {
        C6496s.h(str, "value");
        S(X(), str);
    }

    public void H(C5987k kVar, Object obj) {
        f.a.c(this, kVar, obj);
    }

    /* access modifiers changed from: protected */
    public abstract void I(Object obj, boolean z10);

    /* access modifiers changed from: protected */
    public abstract void J(Object obj, byte b10);

    /* access modifiers changed from: protected */
    public abstract void K(Object obj, char c10);

    /* access modifiers changed from: protected */
    public abstract void L(Object obj, double d10);

    /* access modifiers changed from: protected */
    public abstract void M(Object obj, ih.f fVar, int i10);

    /* access modifiers changed from: protected */
    public abstract void N(Object obj, float f10);

    /* access modifiers changed from: protected */
    public f O(Object obj, ih.f fVar) {
        C6496s.h(fVar, "inlineDescriptor");
        Y(obj);
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract void P(Object obj, int i10);

    /* access modifiers changed from: protected */
    public abstract void Q(Object obj, long j10);

    /* access modifiers changed from: protected */
    public abstract void R(Object obj, short s10);

    /* access modifiers changed from: protected */
    public abstract void S(Object obj, String str);

    /* access modifiers changed from: protected */
    public abstract void T(ih.f fVar);

    /* access modifiers changed from: protected */
    public final Object U() {
        return C6565s.z0(this.f71741a);
    }

    /* access modifiers changed from: protected */
    public final Object V() {
        return C6565s.B0(this.f71741a);
    }

    /* access modifiers changed from: protected */
    public abstract Object W(ih.f fVar, int i10);

    /* access modifiers changed from: protected */
    public final Object X() {
        if (!this.f71741a.isEmpty()) {
            ArrayList arrayList = this.f71741a;
            return arrayList.remove(C6565s.p(arrayList));
        }
        throw new C5986j("No tag in stack for requested element");
    }

    /* access modifiers changed from: protected */
    public final void Y(Object obj) {
        this.f71741a.add(obj);
    }

    public final void c(ih.f fVar) {
        C6496s.h(fVar, "descriptor");
        if (!this.f71741a.isEmpty()) {
            X();
        }
        T(fVar);
    }

    public d e(ih.f fVar, int i10) {
        return f.a.a(this, fVar, i10);
    }

    public final void f(double d10) {
        L(X(), d10);
    }

    public final void g(ih.f fVar, int i10, double d10) {
        C6496s.h(fVar, "descriptor");
        L(W(fVar, i10), d10);
    }

    public final void h(byte b10) {
        J(X(), b10);
    }

    public final void i(ih.f fVar, int i10, int i11) {
        C6496s.h(fVar, "descriptor");
        P(W(fVar, i10), i11);
    }

    public f j(ih.f fVar) {
        C6496s.h(fVar, "descriptor");
        return O(X(), fVar);
    }

    public final f k(ih.f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return O(W(fVar, i10), fVar.g(i10));
    }

    public final void l(ih.f fVar, int i10, byte b10) {
        C6496s.h(fVar, "descriptor");
        J(W(fVar, i10), b10);
    }

    public abstract void m(C5987k kVar, Object obj);

    public final void n(long j10) {
        Q(X(), j10);
    }

    public final void o(ih.f fVar, int i10, float f10) {
        C6496s.h(fVar, "descriptor");
        N(W(fVar, i10), f10);
    }

    public void p(ih.f fVar, int i10, C5987k kVar, Object obj) {
        C6496s.h(fVar, "descriptor");
        C6496s.h(kVar, "serializer");
        if (G(fVar, i10)) {
            H(kVar, obj);
        }
    }

    public final void s(short s10) {
        R(X(), s10);
    }

    public final void t(ih.f fVar, int i10, String str) {
        C6496s.h(fVar, "descriptor");
        C6496s.h(str, "value");
        S(W(fVar, i10), str);
    }

    public final void u(boolean z10) {
        I(X(), z10);
    }

    public final void v(ih.f fVar, int i10, char c10) {
        C6496s.h(fVar, "descriptor");
        K(W(fVar, i10), c10);
    }

    public final void w(ih.f fVar, int i10) {
        C6496s.h(fVar, "enumDescriptor");
        M(X(), fVar, i10);
    }

    public final void x(float f10) {
        N(X(), f10);
    }

    public final void y(char c10) {
        K(X(), c10);
    }
}

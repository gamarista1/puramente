package kh;

import gh.C5977a;
import ih.f;
import java.util.ArrayList;
import jh.c;
import jh.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import mf.C6565s;
import yf.C6787a;

public abstract class y0 implements e, c {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f71733a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f71734b;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y0 f71735a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5977a f71736b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f71737c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(y0 y0Var, C5977a aVar, Object obj) {
            super(0);
            this.f71735a = y0Var;
            this.f71736b = aVar;
            this.f71737c = obj;
        }

        public final Object invoke() {
            y0 y0Var = this.f71735a;
            C5977a aVar = this.f71736b;
            Object obj = this.f71737c;
            if (aVar.getDescriptor().b() || y0Var.D()) {
                return y0Var.I(aVar, obj);
            }
            return y0Var.j();
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y0 f71738a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5977a f71739b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f71740c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(y0 y0Var, C5977a aVar, Object obj) {
            super(0);
            this.f71738a = y0Var;
            this.f71739b = aVar;
            this.f71740c = obj;
        }

        public final Object invoke() {
            return this.f71738a.I(this.f71739b, this.f71740c);
        }
    }

    private final Object Y(Object obj, C6787a aVar) {
        X(obj);
        Object invoke = aVar.invoke();
        if (!this.f71734b) {
            W();
        }
        this.f71734b = false;
        return invoke;
    }

    public final String A(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return T(V(fVar, i10));
    }

    public final String B() {
        return T(W());
    }

    public final Object C(f fVar, int i10, C5977a aVar, Object obj) {
        C6496s.h(fVar, "descriptor");
        C6496s.h(aVar, "deserializer");
        return Y(V(fVar, i10), new b(this, aVar, obj));
    }

    public final int E(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return Q(V(fVar, i10));
    }

    public final int F(f fVar) {
        C6496s.h(fVar, "enumDescriptor");
        return N(W(), fVar);
    }

    public final long G(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return R(V(fVar, i10));
    }

    public final byte H() {
        return K(W());
    }

    /* access modifiers changed from: protected */
    public Object I(C5977a aVar, Object obj) {
        C6496s.h(aVar, "deserializer");
        return n(aVar);
    }

    /* access modifiers changed from: protected */
    public abstract boolean J(Object obj);

    /* access modifiers changed from: protected */
    public abstract byte K(Object obj);

    /* access modifiers changed from: protected */
    public abstract char L(Object obj);

    /* access modifiers changed from: protected */
    public abstract double M(Object obj);

    /* access modifiers changed from: protected */
    public abstract int N(Object obj, f fVar);

    /* access modifiers changed from: protected */
    public abstract float O(Object obj);

    /* access modifiers changed from: protected */
    public e P(Object obj, f fVar) {
        C6496s.h(fVar, "inlineDescriptor");
        X(obj);
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract int Q(Object obj);

    /* access modifiers changed from: protected */
    public abstract long R(Object obj);

    /* access modifiers changed from: protected */
    public abstract short S(Object obj);

    /* access modifiers changed from: protected */
    public abstract String T(Object obj);

    /* access modifiers changed from: protected */
    public final Object U() {
        return C6565s.B0(this.f71733a);
    }

    /* access modifiers changed from: protected */
    public abstract Object V(f fVar, int i10);

    /* access modifiers changed from: protected */
    public final Object W() {
        ArrayList arrayList = this.f71733a;
        Object remove = arrayList.remove(C6565s.p(arrayList));
        this.f71734b = true;
        return remove;
    }

    /* access modifiers changed from: protected */
    public final void X(Object obj) {
        this.f71733a.add(obj);
    }

    public final e e(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return P(V(fVar, i10), fVar.g(i10));
    }

    public final float f(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return O(V(fVar, i10));
    }

    public final int h() {
        return Q(W());
    }

    public final Object i(f fVar, int i10, C5977a aVar, Object obj) {
        C6496s.h(fVar, "descriptor");
        C6496s.h(aVar, "deserializer");
        return Y(V(fVar, i10), new a(this, aVar, obj));
    }

    public final Void j() {
        return null;
    }

    public final byte k(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return K(V(fVar, i10));
    }

    public e l(f fVar) {
        C6496s.h(fVar, "descriptor");
        return P(W(), fVar);
    }

    public final long m() {
        return R(W());
    }

    public abstract Object n(C5977a aVar);

    public boolean p() {
        return c.a.b(this);
    }

    public int q(f fVar) {
        return c.a.a(this, fVar);
    }

    public final short r(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return S(V(fVar, i10));
    }

    public final boolean s(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return J(V(fVar, i10));
    }

    public final short t() {
        return S(W());
    }

    public final float u() {
        return O(W());
    }

    public final char v(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return L(V(fVar, i10));
    }

    public final double w() {
        return M(W());
    }

    public final double x(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return M(V(fVar, i10));
    }

    public final boolean y() {
        return J(W());
    }

    public final char z() {
        return L(W());
    }
}

package w;

import Y.C1510r0;
import Y.o1;
import yf.C6787a;

/* renamed from: w.h  reason: case insensitive filesystem */
public final class C2796h {

    /* renamed from: a  reason: collision with root package name */
    private final r0 f27421a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f27422b;

    /* renamed from: c  reason: collision with root package name */
    private final long f27423c;

    /* renamed from: d  reason: collision with root package name */
    private final C6787a f27424d;

    /* renamed from: e  reason: collision with root package name */
    private final C1510r0 f27425e;

    /* renamed from: f  reason: collision with root package name */
    private C2805q f27426f;

    /* renamed from: g  reason: collision with root package name */
    private long f27427g;

    /* renamed from: h  reason: collision with root package name */
    private long f27428h = Long.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    private final C1510r0 f27429i;

    public C2796h(Object obj, r0 r0Var, C2805q qVar, long j10, Object obj2, long j11, boolean z10, C6787a aVar) {
        this.f27421a = r0Var;
        this.f27422b = obj2;
        this.f27423c = j11;
        this.f27424d = aVar;
        this.f27425e = u1.d(obj, (o1) null, 2, (Object) null);
        this.f27426f = C2806r.e(qVar);
        this.f27427g = j10;
        this.f27429i = u1.d(Boolean.valueOf(z10), (o1) null, 2, (Object) null);
    }

    public final void a() {
        k(false);
        this.f27424d.invoke();
    }

    public final long b() {
        return this.f27428h;
    }

    public final long c() {
        return this.f27427g;
    }

    public final long d() {
        return this.f27423c;
    }

    public final Object e() {
        return this.f27425e.getValue();
    }

    public final Object f() {
        return this.f27421a.b().invoke(this.f27426f);
    }

    public final C2805q g() {
        return this.f27426f;
    }

    public final boolean h() {
        return ((Boolean) this.f27429i.getValue()).booleanValue();
    }

    public final void i(long j10) {
        this.f27428h = j10;
    }

    public final void j(long j10) {
        this.f27427g = j10;
    }

    public final void k(boolean z10) {
        this.f27429i.setValue(Boolean.valueOf(z10));
    }

    public final void l(Object obj) {
        this.f27425e.setValue(obj);
    }

    public final void m(C2805q qVar) {
        this.f27426f = qVar;
    }
}

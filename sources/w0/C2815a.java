package w0;

import c1.n;
import c1.r;
import c1.s;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2427m;
import r0.C1;
import r0.C2547y0;
import r0.H1;
import t0.C2605f;
import t0.C2606g;

/* renamed from: w0.a  reason: case insensitive filesystem */
public final class C2815a extends C2817c {

    /* renamed from: g  reason: collision with root package name */
    private final H1 f27655g;

    /* renamed from: h  reason: collision with root package name */
    private final long f27656h;

    /* renamed from: i  reason: collision with root package name */
    private final long f27657i;

    /* renamed from: j  reason: collision with root package name */
    private int f27658j;

    /* renamed from: k  reason: collision with root package name */
    private final long f27659k;

    /* renamed from: l  reason: collision with root package name */
    private float f27660l;

    /* renamed from: m  reason: collision with root package name */
    private C2547y0 f27661m;

    public /* synthetic */ C2815a(H1 h12, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(h12, j10, j11);
    }

    private final long o(long j10, long j11) {
        if (n.j(j10) >= 0 && n.k(j10) >= 0 && r.g(j11) >= 0 && r.f(j11) >= 0 && r.g(j11) <= this.f27655g.e() && r.f(j11) <= this.f27655g.d()) {
            return j11;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* access modifiers changed from: protected */
    public boolean a(float f10) {
        this.f27660l = f10;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean e(C2547y0 y0Var) {
        this.f27661m = y0Var;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2815a)) {
            return false;
        }
        C2815a aVar = (C2815a) obj;
        if (C6496s.c(this.f27655g, aVar.f27655g) && n.i(this.f27656h, aVar.f27656h) && r.e(this.f27657i, aVar.f27657i) && C1.d(this.f27658j, aVar.f27658j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f27655g.hashCode() * 31) + n.l(this.f27656h)) * 31) + r.h(this.f27657i)) * 31) + C1.e(this.f27658j);
    }

    public long k() {
        return s.d(this.f27659k);
    }

    /* access modifiers changed from: protected */
    public void m(C2605f fVar) {
        C2605f.S(fVar, this.f27655g, this.f27656h, this.f27657i, 0, s.a(Math.round(C2427m.k(fVar.d())), Math.round(C2427m.i(fVar.d()))), this.f27660l, (C2606g) null, this.f27661m, 0, this.f27658j, 328, (Object) null);
    }

    public final void n(int i10) {
        this.f27658j = i10;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.f27655g + ", srcOffset=" + n.o(this.f27656h) + ", srcSize=" + r.i(this.f27657i) + ", filterQuality=" + C1.f(this.f27658j) + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2815a(H1 h12, long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(h12, (i10 & 2) != 0 ? n.f19226b.a() : j10, (i10 & 4) != 0 ? s.a(h12.e(), h12.d()) : j11, (DefaultConstructorMarker) null);
    }

    private C2815a(H1 h12, long j10, long j11) {
        this.f27655g = h12;
        this.f27656h = j10;
        this.f27657i = j11;
        this.f27658j = C1.f25397a.a();
        this.f27659k = o(j10, j11);
        this.f27660l = 1.0f;
    }
}

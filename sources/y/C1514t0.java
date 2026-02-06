package Y;

/* renamed from: Y.t0  reason: case insensitive filesystem */
public final class C1514t0 implements C1483f {

    /* renamed from: a  reason: collision with root package name */
    private final C1483f f10176a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10177b;

    /* renamed from: c  reason: collision with root package name */
    private int f10178c;

    public C1514t0(C1483f fVar, int i10) {
        this.f10176a = fVar;
        this.f10177b = i10;
    }

    public void a(int i10, int i11) {
        int i12;
        C1483f fVar = this.f10176a;
        if (this.f10178c == 0) {
            i12 = this.f10177b;
        } else {
            i12 = 0;
        }
        fVar.a(i10 + i12, i11);
    }

    public Object b() {
        return this.f10176a.b();
    }

    public void c(int i10, int i11, int i12) {
        int i13;
        if (this.f10178c == 0) {
            i13 = this.f10177b;
        } else {
            i13 = 0;
        }
        this.f10176a.c(i10 + i13, i11 + i13, i12);
    }

    public void clear() {
        C1506p.r("Clear is not valid on OffsetApplier");
    }

    public void d(int i10, Object obj) {
        int i11;
        C1483f fVar = this.f10176a;
        if (this.f10178c == 0) {
            i11 = this.f10177b;
        } else {
            i11 = 0;
        }
        fVar.d(i10 + i11, obj);
    }

    public void f(int i10, Object obj) {
        int i11;
        C1483f fVar = this.f10176a;
        if (this.f10178c == 0) {
            i11 = this.f10177b;
        } else {
            i11 = 0;
        }
        fVar.f(i10 + i11, obj);
    }

    public void g(Object obj) {
        this.f10178c++;
        this.f10176a.g(obj);
    }

    public void i() {
        boolean z10;
        if (this.f10178c > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C1506p.r("OffsetApplier up called with no corresponding down");
        }
        this.f10178c--;
        this.f10176a.i();
    }
}

package q0;

/* renamed from: q0.e  reason: case insensitive filesystem */
public final class C2419e {

    /* renamed from: a  reason: collision with root package name */
    private float f25316a;

    /* renamed from: b  reason: collision with root package name */
    private float f25317b;

    /* renamed from: c  reason: collision with root package name */
    private float f25318c;

    /* renamed from: d  reason: collision with root package name */
    private float f25319d;

    public C2419e(float f10, float f11, float f12, float f13) {
        this.f25316a = f10;
        this.f25317b = f11;
        this.f25318c = f12;
        this.f25319d = f13;
    }

    public final float a() {
        return this.f25319d;
    }

    public final float b() {
        return this.f25316a;
    }

    public final float c() {
        return this.f25318c;
    }

    public final float d() {
        return this.f25317b;
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f25316a = Math.max(f10, this.f25316a);
        this.f25317b = Math.max(f11, this.f25317b);
        this.f25318c = Math.min(f12, this.f25318c);
        this.f25319d = Math.min(f13, this.f25319d);
    }

    public final boolean f() {
        if (this.f25316a >= this.f25318c || this.f25317b >= this.f25319d) {
            return true;
        }
        return false;
    }

    public final void g(float f10, float f11, float f12, float f13) {
        this.f25316a = f10;
        this.f25317b = f11;
        this.f25318c = f12;
        this.f25319d = f13;
    }

    public final void h(float f10) {
        this.f25319d = f10;
    }

    public final void i(float f10) {
        this.f25316a = f10;
    }

    public final void j(float f10) {
        this.f25318c = f10;
    }

    public final void k(float f10) {
        this.f25317b = f10;
    }

    public String toString() {
        return "MutableRect(" + C2417c.a(this.f25316a, 1) + ", " + C2417c.a(this.f25317b, 1) + ", " + C2417c.a(this.f25318c, 1) + ", " + C2417c.a(this.f25319d, 1) + ')';
    }
}

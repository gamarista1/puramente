package I4;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private float f31764a;

    /* renamed from: b  reason: collision with root package name */
    private float f31765b;

    public d(float f10, float f11) {
        this.f31764a = f10;
        this.f31765b = f11;
    }

    public boolean a(float f10, float f11) {
        if (this.f31764a == f10 && this.f31765b == f11) {
            return true;
        }
        return false;
    }

    public float b() {
        return this.f31764a;
    }

    public float c() {
        return this.f31765b;
    }

    public void d(float f10, float f11) {
        this.f31764a = f10;
        this.f31765b = f11;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public d() {
        this(1.0f, 1.0f);
    }
}

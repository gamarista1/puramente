package Y;

/* renamed from: Y.d  reason: case insensitive filesystem */
public final class C1477d {

    /* renamed from: a  reason: collision with root package name */
    private int f9968a;

    public C1477d(int i10) {
        this.f9968a = i10;
    }

    public final int a() {
        return this.f9968a;
    }

    public final boolean b() {
        if (this.f9968a != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void c(int i10) {
        this.f9968a = i10;
    }

    public final int d(C1476c1 c1Var) {
        return c1Var.b(this);
    }

    public final int e(C1485f1 f1Var) {
        return f1Var.F(this);
    }

    public String toString() {
        return super.toString() + "{ location = " + this.f9968a + " }";
    }
}

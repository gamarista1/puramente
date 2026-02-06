package l2;

/* renamed from: l2.a  reason: case insensitive filesystem */
public abstract class C2169a {

    /* renamed from: a  reason: collision with root package name */
    private int f23505a;

    public final void f(int i10) {
        this.f23505a = i10 | this.f23505a;
    }

    public void i() {
        this.f23505a = 0;
    }

    /* access modifiers changed from: protected */
    public final boolean j(int i10) {
        if ((this.f23505a & i10) == i10) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        return j(268435456);
    }

    public final boolean m() {
        return j(4);
    }

    public final boolean o() {
        return j(134217728);
    }

    public final boolean p() {
        return j(1);
    }

    public final boolean r() {
        return j(536870912);
    }

    public final void s(int i10) {
        this.f23505a = i10;
    }
}

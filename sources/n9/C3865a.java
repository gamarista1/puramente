package n9;

/* renamed from: n9.a  reason: case insensitive filesystem */
public abstract class C3865a {

    /* renamed from: a  reason: collision with root package name */
    private int f46924a;

    public final void f(int i10) {
        this.f46924a = i10 | this.f46924a;
    }

    public void i() {
        this.f46924a = 0;
    }

    public final void j(int i10) {
        this.f46924a = (~i10) & this.f46924a;
    }

    /* access modifiers changed from: protected */
    public final boolean l(int i10) {
        if ((this.f46924a & i10) == i10) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        return l(268435456);
    }

    public final boolean o() {
        return l(Integer.MIN_VALUE);
    }

    public final boolean p() {
        return l(4);
    }

    public final boolean r() {
        return l(134217728);
    }

    public final boolean s() {
        return l(1);
    }

    public final void t(int i10) {
        this.f46924a = i10;
    }
}

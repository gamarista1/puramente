package va;

/* renamed from: va.b  reason: case insensitive filesystem */
public class C5243b {

    /* renamed from: a  reason: collision with root package name */
    private int f61721a = 1;

    public C5243b a(Object obj) {
        int i10;
        int i11 = this.f61721a * 31;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        this.f61721a = i11 + i10;
        return this;
    }

    public int b() {
        return this.f61721a;
    }

    public final C5243b c(boolean z10) {
        this.f61721a = (this.f61721a * 31) + (z10 ? 1 : 0);
        return this;
    }
}

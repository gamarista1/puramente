package i2;

/* renamed from: i2.C  reason: case insensitive filesystem */
public final class C2075C {

    /* renamed from: c  reason: collision with root package name */
    public static final C2075C f22055c = new C2075C(-1, -1);

    /* renamed from: d  reason: collision with root package name */
    public static final C2075C f22056d = new C2075C(0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final int f22057a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22058b;

    public C2075C(int i10, int i11) {
        boolean z10;
        if ((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        this.f22057a = i10;
        this.f22058b = i11;
    }

    public int a() {
        return this.f22058b;
    }

    public int b() {
        return this.f22057a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2075C)) {
            return false;
        }
        C2075C c10 = (C2075C) obj;
        if (this.f22057a == c10.f22057a && this.f22058b == c10.f22058b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f22058b;
        int i11 = this.f22057a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f22057a + "x" + this.f22058b;
    }
}

package Eb;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final E f50737a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50738b;

    /* renamed from: c  reason: collision with root package name */
    private final int f50739c;

    private q(Class cls, int i10, int i11) {
        this(E.b(cls), i10, i11);
    }

    public static q a(Class cls) {
        return new q(cls, 0, 2);
    }

    private static String b(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    public static q h(Class cls) {
        return new q(cls, 0, 0);
    }

    public static q i(E e10) {
        return new q(e10, 0, 1);
    }

    public static q j(Class cls) {
        return new q(cls, 0, 1);
    }

    public static q k(E e10) {
        return new q(e10, 1, 0);
    }

    public static q l(Class cls) {
        return new q(cls, 1, 0);
    }

    public static q m(E e10) {
        return new q(e10, 1, 1);
    }

    public static q n(Class cls) {
        return new q(cls, 1, 1);
    }

    public static q o(Class cls) {
        return new q(cls, 2, 0);
    }

    public E c() {
        return this.f50737a;
    }

    public boolean d() {
        if (this.f50739c == 2) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (this.f50739c == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f50737a.equals(qVar.f50737a) && this.f50738b == qVar.f50738b && this.f50739c == qVar.f50739c) {
            return true;
        }
        return false;
    }

    public boolean f() {
        if (this.f50738b == 1) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.f50738b == 2) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f50737a.hashCode() ^ 1000003) * 1000003) ^ this.f50738b) * 1000003) ^ this.f50739c;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f50737a);
        sb2.append(", type=");
        int i10 = this.f50738b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        sb2.append(b(this.f50739c));
        sb2.append("}");
        return sb2.toString();
    }

    private q(E e10, int i10, int i11) {
        this.f50737a = (E) D.c(e10, "Null dependency anInterface.");
        this.f50738b = i10;
        this.f50739c = i11;
    }
}

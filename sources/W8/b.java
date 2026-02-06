package W8;

final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f34920a;

    b(Integer num) {
        this.f34920a = num;
    }

    public Integer a() {
        return this.f34920a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Integer num = this.f34920a;
        Integer a10 = ((f) obj).a();
        if (num != null) {
            return num.equals(a10);
        }
        if (a10 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        Integer num = this.f34920a;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        return i10 ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f34920a + "}";
    }
}

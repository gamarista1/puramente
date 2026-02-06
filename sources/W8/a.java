package W8;

final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f34916a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f34917b;

    /* renamed from: c  reason: collision with root package name */
    private final e f34918c;

    /* renamed from: d  reason: collision with root package name */
    private final f f34919d;

    a(Integer num, Object obj, e eVar, f fVar) {
        this.f34916a = num;
        if (obj != null) {
            this.f34917b = obj;
            if (eVar != null) {
                this.f34918c = eVar;
                this.f34919d = fVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    public Integer a() {
        return this.f34916a;
    }

    public Object b() {
        return this.f34917b;
    }

    public e c() {
        return this.f34918c;
    }

    public f d() {
        return this.f34919d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        Integer num = this.f34916a;
        if (num != null ? num.equals(dVar.a()) : dVar.a() == null) {
            if (this.f34917b.equals(dVar.b()) && this.f34918c.equals(dVar.c())) {
                f fVar = this.f34919d;
                if (fVar == null) {
                    if (dVar.d() == null) {
                        return true;
                    }
                } else if (fVar.equals(dVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i10;
        Integer num = this.f34916a;
        int i11 = 0;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        int hashCode = (((((i10 ^ 1000003) * 1000003) ^ this.f34917b.hashCode()) * 1000003) ^ this.f34918c.hashCode()) * 1000003;
        f fVar = this.f34919d;
        if (fVar != null) {
            i11 = fVar.hashCode();
        }
        return hashCode ^ i11;
    }

    public String toString() {
        return "Event{code=" + this.f34916a + ", payload=" + this.f34917b + ", priority=" + this.f34918c + ", productData=" + this.f34919d + "}";
    }
}

package Ob;

import com.amazon.a.a.o.b.f;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final Object f52114a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f52115b;

    public g(Object obj, Object obj2) {
        this.f52114a = obj;
        this.f52115b = obj2;
    }

    public Object a() {
        return this.f52114a;
    }

    public Object b() {
        return this.f52115b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        Object obj2 = this.f52114a;
        if (obj2 == null ? gVar.f52114a != null : !obj2.equals(gVar.f52114a)) {
            return false;
        }
        Object obj3 = this.f52115b;
        Object obj4 = gVar.f52115b;
        if (obj3 == null ? obj4 == null : obj3.equals(obj4)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        Object obj = this.f52114a;
        int i11 = 0;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        Object obj2 = this.f52115b;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        return "Pair(" + this.f52114a + f.f37529a + this.f52115b + ")";
    }
}

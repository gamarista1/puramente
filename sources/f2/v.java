package f2;

import i2.L;

public class v {

    /* renamed from: c  reason: collision with root package name */
    private static final String f20145c = L.y0(0);

    /* renamed from: d  reason: collision with root package name */
    private static final String f20146d = L.y0(1);

    /* renamed from: a  reason: collision with root package name */
    public final String f20147a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20148b;

    public v(String str, String str2) {
        this.f20147a = L.N0(str);
        this.f20148b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (!L.c(this.f20147a, vVar.f20147a) || !L.c(this.f20148b, vVar.f20148b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f20148b.hashCode() * 31;
        String str = this.f20147a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}

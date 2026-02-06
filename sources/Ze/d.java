package Ze;

import p003if.h;

final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f66912a;

    /* renamed from: b  reason: collision with root package name */
    private final String f66913b;

    d(String str, String str2) {
        this.f66912a = str;
        this.f66913b = str2;
    }

    public String a() {
        return this.f66913b;
    }

    public String b() {
        return this.f66912a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!h.a(b(), dVar.b()) || !h.a(a(), dVar.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return h.b(b(), a());
    }
}

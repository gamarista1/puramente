package o5;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private Class f47051a;

    /* renamed from: b  reason: collision with root package name */
    private Class f47052b;

    /* renamed from: c  reason: collision with root package name */
    private Class f47053c;

    public j() {
    }

    public void a(Class cls, Class cls2, Class cls3) {
        this.f47051a = cls;
        this.f47052b = cls2;
        this.f47053c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f47051a.equals(jVar.f47051a) && this.f47052b.equals(jVar.f47052b) && l.e(this.f47053c, jVar.f47053c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((this.f47051a.hashCode() * 31) + this.f47052b.hashCode()) * 31;
        Class cls = this.f47053c;
        if (cls != null) {
            i10 = cls.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f47051a + ", second=" + this.f47052b + '}';
    }

    public j(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }
}

package Cc;

final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f50390a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50391b;

    a(String str, String str2) {
        if (str != null) {
            this.f50390a = str;
            if (str2 != null) {
                this.f50391b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public String b() {
        return this.f50390a;
    }

    public String c() {
        return this.f50391b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f50390a.equals(fVar.b()) || !this.f50391b.equals(fVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f50390a.hashCode() ^ 1000003) * 1000003) ^ this.f50391b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f50390a + ", version=" + this.f50391b + "}";
    }
}

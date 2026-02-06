package R9;

import nb.k;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f33749a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33750b;

    /* renamed from: c  reason: collision with root package name */
    public final int f33751c;

    /* renamed from: d  reason: collision with root package name */
    public final int f33752d;

    public b(String str, String str2, int i10, int i11) {
        this.f33749a = str;
        this.f33750b = str2;
        this.f33751c = i10;
        this.f33752d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f33751c != bVar.f33751c || this.f33752d != bVar.f33752d || !k.a(this.f33749a, bVar.f33749a) || !k.a(this.f33750b, bVar.f33750b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return k.b(this.f33749a, this.f33750b, Integer.valueOf(this.f33751c), Integer.valueOf(this.f33752d));
    }
}

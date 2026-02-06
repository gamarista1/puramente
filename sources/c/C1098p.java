package C;

import c1.d;
import c1.t;

/* renamed from: C.p  reason: case insensitive filesystem */
final class C1098p implements f0 {

    /* renamed from: b  reason: collision with root package name */
    private final int f1009b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1010c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1011d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1012e;

    public C1098p(int i10, int i11, int i12, int i13) {
        this.f1009b = i10;
        this.f1010c = i11;
        this.f1011d = i12;
        this.f1012e = i13;
    }

    public int a(d dVar) {
        return this.f1012e;
    }

    public int b(d dVar, t tVar) {
        return this.f1011d;
    }

    public int c(d dVar) {
        return this.f1010c;
    }

    public int d(d dVar, t tVar) {
        return this.f1009b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1098p)) {
            return false;
        }
        C1098p pVar = (C1098p) obj;
        if (this.f1009b == pVar.f1009b && this.f1010c == pVar.f1010c && this.f1011d == pVar.f1011d && this.f1012e == pVar.f1012e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f1009b * 31) + this.f1010c) * 31) + this.f1011d) * 31) + this.f1012e;
    }

    public String toString() {
        return "Insets(left=" + this.f1009b + ", top=" + this.f1010c + ", right=" + this.f1011d + ", bottom=" + this.f1012e + ')';
    }
}

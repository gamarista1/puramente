package m2;

import f2.s;
import i2.C2076a;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final String f23715a;

    /* renamed from: b  reason: collision with root package name */
    public final s f23716b;

    /* renamed from: c  reason: collision with root package name */
    public final s f23717c;

    /* renamed from: d  reason: collision with root package name */
    public final int f23718d;

    /* renamed from: e  reason: collision with root package name */
    public final int f23719e;

    public l(String str, s sVar, s sVar2, int i10, int i11) {
        boolean z10;
        if (i10 == 0 || i11 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        this.f23715a = C2076a.d(str);
        this.f23716b = (s) C2076a.e(sVar);
        this.f23717c = (s) C2076a.e(sVar2);
        this.f23718d = i10;
        this.f23719e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f23718d != lVar.f23718d || this.f23719e != lVar.f23719e || !this.f23715a.equals(lVar.f23715a) || !this.f23716b.equals(lVar.f23716b) || !this.f23717c.equals(lVar.f23717c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((527 + this.f23718d) * 31) + this.f23719e) * 31) + this.f23715a.hashCode()) * 31) + this.f23716b.hashCode()) * 31) + this.f23717c.hashCode();
    }
}

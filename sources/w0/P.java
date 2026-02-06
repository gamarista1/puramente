package W0;

import Ef.m;

public final class P implements C1441i {

    /* renamed from: a  reason: collision with root package name */
    private final int f8503a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8504b;

    public P(int i10, int i11) {
        this.f8503a = i10;
        this.f8504b = i11;
    }

    public void a(C1444l lVar) {
        int l10 = m.l(this.f8503a, 0, lVar.h());
        int l11 = m.l(this.f8504b, 0, lVar.h());
        if (l10 < l11) {
            lVar.p(l10, l11);
        } else {
            lVar.p(l11, l10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        if (this.f8503a == p10.f8503a && this.f8504b == p10.f8504b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f8503a * 31) + this.f8504b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f8503a + ", end=" + this.f8504b + ')';
    }
}

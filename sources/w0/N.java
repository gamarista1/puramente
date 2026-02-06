package W0;

import Ef.m;

public final class N implements C1441i {

    /* renamed from: a  reason: collision with root package name */
    private final int f8499a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8500b;

    public N(int i10, int i11) {
        this.f8499a = i10;
        this.f8500b = i11;
    }

    public void a(C1444l lVar) {
        if (lVar.l()) {
            lVar.a();
        }
        int l10 = m.l(this.f8499a, 0, lVar.h());
        int l11 = m.l(this.f8500b, 0, lVar.h());
        if (l10 == l11) {
            return;
        }
        if (l10 < l11) {
            lVar.n(l10, l11);
        } else {
            lVar.n(l11, l10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        if (this.f8499a == n10.f8499a && this.f8500b == n10.f8500b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f8499a * 31) + this.f8500b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f8499a + ", end=" + this.f8500b + ')';
    }
}

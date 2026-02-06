package t2;

import com.google.common.collect.C4770v;
import com.google.common.collect.E;
import f2.I;
import i2.L;
import i2.p;

public final class j0 {

    /* renamed from: d  reason: collision with root package name */
    public static final j0 f26269d = new j0(new I[0]);

    /* renamed from: e  reason: collision with root package name */
    private static final String f26270e = L.y0(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f26271a;

    /* renamed from: b  reason: collision with root package name */
    private final C4770v f26272b;

    /* renamed from: c  reason: collision with root package name */
    private int f26273c;

    public j0(I... iArr) {
        this.f26272b = C4770v.A(iArr);
        this.f26271a = iArr.length;
        f();
    }

    private void f() {
        int i10 = 0;
        while (i10 < this.f26272b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f26272b.size(); i12++) {
                if (((I) this.f26272b.get(i10)).equals(this.f26272b.get(i12))) {
                    p.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public I b(int i10) {
        return (I) this.f26272b.get(i10);
    }

    public C4770v c() {
        return C4770v.z(E.k(this.f26272b, new i0()));
    }

    public int d(I i10) {
        int indexOf = this.f26272b.indexOf(i10);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f26271a != j0Var.f26271a || !this.f26272b.equals(j0Var.f26272b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f26273c == 0) {
            this.f26273c = this.f26272b.hashCode();
        }
        return this.f26273c;
    }
}

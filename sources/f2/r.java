package f2;

import android.util.SparseBooleanArray;
import i2.C2076a;
import i2.L;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final SparseBooleanArray f20021a;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final SparseBooleanArray f20022a = new SparseBooleanArray();

        /* renamed from: b  reason: collision with root package name */
        private boolean f20023b;

        public b a(int i10) {
            C2076a.g(!this.f20023b);
            this.f20022a.append(i10, true);
            return this;
        }

        public b b(r rVar) {
            for (int i10 = 0; i10 < rVar.d(); i10++) {
                a(rVar.c(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int a10 : iArr) {
                a(a10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            if (z10) {
                return a(i10);
            }
            return this;
        }

        public r e() {
            C2076a.g(!this.f20023b);
            this.f20023b = true;
            return new r(this.f20022a);
        }
    }

    public boolean a(int i10) {
        return this.f20021a.get(i10);
    }

    public boolean b(int... iArr) {
        for (int a10 : iArr) {
            if (a(a10)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i10) {
        C2076a.c(i10, 0, d());
        return this.f20021a.keyAt(i10);
    }

    public int d() {
        return this.f20021a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (L.f22072a >= 24) {
            return this.f20021a.equals(rVar.f20021a);
        }
        if (d() != rVar.d()) {
            return false;
        }
        for (int i10 = 0; i10 < d(); i10++) {
            if (c(i10) != rVar.c(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (L.f22072a >= 24) {
            return this.f20021a.hashCode();
        }
        int d10 = d();
        for (int i10 = 0; i10 < d(); i10++) {
            d10 = (d10 * 31) + c(i10);
        }
        return d10;
    }

    private r(SparseBooleanArray sparseBooleanArray) {
        this.f20021a = sparseBooleanArray;
    }
}

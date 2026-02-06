package f2;

import com.google.common.collect.C4770v;
import i2.C2076a;
import java.util.Arrays;
import java.util.List;

public final class L {

    /* renamed from: b  reason: collision with root package name */
    public static final L f19893b = new L(C4770v.E());

    /* renamed from: c  reason: collision with root package name */
    private static final String f19894c = i2.L.y0(0);

    /* renamed from: a  reason: collision with root package name */
    private final C4770v f19895a;

    public static final class a {

        /* renamed from: f  reason: collision with root package name */
        private static final String f19896f = i2.L.y0(0);

        /* renamed from: g  reason: collision with root package name */
        private static final String f19897g = i2.L.y0(1);

        /* renamed from: h  reason: collision with root package name */
        private static final String f19898h = i2.L.y0(3);

        /* renamed from: i  reason: collision with root package name */
        private static final String f19899i = i2.L.y0(4);

        /* renamed from: a  reason: collision with root package name */
        public final int f19900a;

        /* renamed from: b  reason: collision with root package name */
        private final I f19901b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f19902c;

        /* renamed from: d  reason: collision with root package name */
        private final int[] f19903d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean[] f19904e;

        public a(I i10, boolean z10, int[] iArr, boolean[] zArr) {
            boolean z11;
            int i11 = i10.f19785a;
            this.f19900a = i11;
            boolean z12 = false;
            if (i11 == iArr.length && i11 == zArr.length) {
                z11 = true;
            } else {
                z11 = false;
            }
            C2076a.a(z11);
            this.f19901b = i10;
            if (z10 && i11 > 1) {
                z12 = true;
            }
            this.f19902c = z12;
            this.f19903d = (int[]) iArr.clone();
            this.f19904e = (boolean[]) zArr.clone();
        }

        public I a() {
            return this.f19901b;
        }

        public s b(int i10) {
            return this.f19901b.a(i10);
        }

        public int c() {
            return this.f19901b.f19787c;
        }

        public boolean d() {
            return com.google.common.primitives.a.b(this.f19904e, true);
        }

        public boolean e(boolean z10) {
            for (int i10 = 0; i10 < this.f19903d.length; i10++) {
                if (h(i10, z10)) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f19902c != aVar.f19902c || !this.f19901b.equals(aVar.f19901b) || !Arrays.equals(this.f19903d, aVar.f19903d) || !Arrays.equals(this.f19904e, aVar.f19904e)) {
                return false;
            }
            return true;
        }

        public boolean f(int i10) {
            return this.f19904e[i10];
        }

        public boolean g(int i10) {
            return h(i10, false);
        }

        public boolean h(int i10, boolean z10) {
            int i11 = this.f19903d[i10];
            if (i11 == 4 || (z10 && i11 == 3)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f19901b.hashCode() * 31) + (this.f19902c ? 1 : 0)) * 31) + Arrays.hashCode(this.f19903d)) * 31) + Arrays.hashCode(this.f19904e);
        }
    }

    public L(List list) {
        this.f19895a = C4770v.z(list);
    }

    public C4770v a() {
        return this.f19895a;
    }

    public boolean b() {
        return this.f19895a.isEmpty();
    }

    public boolean c(int i10) {
        for (int i11 = 0; i11 < this.f19895a.size(); i11++) {
            a aVar = (a) this.f19895a.get(i11);
            if (aVar.d() && aVar.c() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        return e(i10, false);
    }

    public boolean e(int i10, boolean z10) {
        for (int i11 = 0; i11 < this.f19895a.size(); i11++) {
            if (((a) this.f19895a.get(i11)).c() == i10 && ((a) this.f19895a.get(i11)).e(z10)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || L.class != obj.getClass()) {
            return false;
        }
        return this.f19895a.equals(((L) obj).f19895a);
    }

    public int hashCode() {
        return this.f19895a.hashCode();
    }
}

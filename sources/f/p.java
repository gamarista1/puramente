package F;

import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6558k;
import mf.C6559l;
import mf.C6565s;
import pf.C6632a;
import yf.C6798l;

public final class p {

    /* renamed from: d  reason: collision with root package name */
    public static final a f2023d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f2024e = 8;

    /* renamed from: a  reason: collision with root package name */
    private int f2025a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f2026b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    private final C6558k f2027c = new C6558k();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f2028a;

        /* renamed from: b  reason: collision with root package name */
        private int[] f2029b;

        public b(int i10, int[] iArr) {
            this.f2028a = i10;
            this.f2029b = iArr;
        }

        public final int[] a() {
            return this.f2029b;
        }

        public final int b() {
            return this.f2028a;
        }

        public final void c(int[] iArr) {
            this.f2029b = iArr;
        }
    }

    public static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparable f2030a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Comparable comparable) {
            super(1);
            this.f2030a = comparable;
        }

        /* renamed from: a */
        public final Integer invoke(Object obj) {
            return Integer.valueOf(C6632a.d(Integer.valueOf(((b) obj).b()), this.f2030a));
        }
    }

    public static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparable f2031a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Comparable comparable) {
            super(1);
            this.f2031a = comparable;
        }

        /* renamed from: a */
        public final Integer invoke(Object obj) {
            return Integer.valueOf(C6632a.d(Integer.valueOf(((b) obj).b()), this.f2031a));
        }
    }

    private final void b(int i10, int i11) {
        if (i10 <= 131072) {
            int[] iArr = this.f2026b;
            if (iArr.length < i10) {
                int length = iArr.length;
                while (length < i10) {
                    length *= 2;
                }
                this.f2026b = C6559l.p(this.f2026b, new int[length], i11, 0, 0, 12, (Object) null);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Requested item capacity " + i10 + " is larger than max supported: 131072!").toString());
    }

    static /* synthetic */ void c(p pVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        pVar.b(i10, i11);
    }

    public final boolean a(int i10, int i11) {
        int h10 = h(i10);
        if (h10 == i11 || h10 == -1 || h10 == -2) {
            return true;
        }
        return false;
    }

    public final void d(int i10) {
        int i11 = this.f2025a;
        int i12 = i10 - i11;
        if (i12 < 0 || i12 >= 131072) {
            int max = Math.max(i10 - (this.f2026b.length / 2), 0);
            this.f2025a = max;
            int i13 = max - i11;
            if (i13 >= 0) {
                int[] iArr = this.f2026b;
                if (i13 < iArr.length) {
                    C6559l.k(iArr, iArr, 0, i13, iArr.length);
                }
                int[] iArr2 = this.f2026b;
                C6559l.u(iArr2, 0, Math.max(0, iArr2.length - i13), this.f2026b.length);
            } else {
                int i14 = -i13;
                int[] iArr3 = this.f2026b;
                if (iArr3.length + i14 < 131072) {
                    b(iArr3.length + i14 + 1, i14);
                } else {
                    if (i14 < iArr3.length) {
                        C6559l.k(iArr3, iArr3, i14, 0, iArr3.length - i14);
                    }
                    int[] iArr4 = this.f2026b;
                    C6559l.u(iArr4, 0, 0, Math.min(iArr4.length, i14));
                }
            }
        } else {
            c(this, i12 + 1, 0, 2, (Object) null);
        }
        while (!this.f2027c.isEmpty() && ((b) this.f2027c.first()).b() < i()) {
            this.f2027c.removeFirst();
        }
        while (!this.f2027c.isEmpty() && ((b) this.f2027c.last()).b() > m()) {
            this.f2027c.removeLast();
        }
    }

    public final int e(int i10, int i11) {
        int m10 = m();
        for (int i12 = i10 + 1; i12 < m10; i12++) {
            if (a(i12, i11)) {
                return i12;
            }
        }
        return m();
    }

    public final int f(int i10, int i11) {
        while (true) {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
            if (a(i10, i11)) {
                return i10;
            }
        }
    }

    public final int[] g(int i10) {
        C6558k kVar = this.f2027c;
        b bVar = (b) C6565s.r0(this.f2027c, C6565s.j(kVar, 0, kVar.size(), new c(Integer.valueOf(i10))));
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public final int h(int i10) {
        if (i10 < i() || i10 >= m()) {
            return -1;
        }
        return this.f2026b[i10 - this.f2025a] - 1;
    }

    public final int i() {
        return this.f2025a;
    }

    public final void j() {
        C6559l.y(this.f2026b, 0, 0, 0, 6, (Object) null);
        this.f2027c.clear();
    }

    public final void k(int i10, int[] iArr) {
        C6558k kVar = this.f2027c;
        int j10 = C6565s.j(kVar, 0, kVar.size(), new d(Integer.valueOf(i10)));
        if (j10 < 0) {
            if (iArr != null) {
                this.f2027c.add(-(j10 + 1), new b(i10, iArr));
            }
        } else if (iArr == null) {
            this.f2027c.remove(j10);
        } else {
            ((b) this.f2027c.get(j10)).c(iArr);
        }
    }

    public final void l(int i10, int i11) {
        if (i10 >= 0) {
            d(i10);
            this.f2026b[i10 - this.f2025a] = i11 + 1;
            return;
        }
        throw new IllegalArgumentException("Negative lanes are not supported");
    }

    public final int m() {
        return this.f2025a + this.f2026b.length;
    }
}

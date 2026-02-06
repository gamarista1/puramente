package E;

import a0.C1538b;

/* renamed from: E.j  reason: case insensitive filesystem */
public final class C1141j {

    /* renamed from: b  reason: collision with root package name */
    public static final int f1651b = C1538b.f10554d;

    /* renamed from: a  reason: collision with root package name */
    private final C1538b f1652a = new C1538b(new a[16], 0);

    /* renamed from: E.j$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f1653a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1654b;

        public a(int i10, int i11) {
            this.f1653a = i10;
            this.f1654b = i11;
            if (i10 < 0) {
                throw new IllegalArgumentException("negative start index");
            } else if (i11 < i10) {
                throw new IllegalArgumentException("end index greater than start");
            }
        }

        public final int a() {
            return this.f1654b;
        }

        public final int b() {
            return this.f1653a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f1653a == aVar.f1653a && this.f1654b == aVar.f1654b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f1653a) * 31) + Integer.hashCode(this.f1654b);
        }

        public String toString() {
            return "Interval(start=" + this.f1653a + ", end=" + this.f1654b + ')';
        }
    }

    public final a a(int i10, int i11) {
        a aVar = new a(i10, i11);
        this.f1652a.b(aVar);
        return aVar;
    }

    public final int b() {
        int a10 = ((a) this.f1652a.n()).a();
        C1538b bVar = this.f1652a;
        int q10 = bVar.q();
        if (q10 > 0) {
            Object[] p10 = bVar.p();
            int i10 = 0;
            do {
                a aVar = (a) p10[i10];
                if (aVar.a() > a10) {
                    a10 = aVar.a();
                }
                i10++;
            } while (i10 < q10);
        }
        return a10;
    }

    public final int c() {
        int b10 = ((a) this.f1652a.n()).b();
        C1538b bVar = this.f1652a;
        int q10 = bVar.q();
        if (q10 > 0) {
            Object[] p10 = bVar.p();
            int i10 = 0;
            do {
                a aVar = (a) p10[i10];
                if (aVar.b() < b10) {
                    b10 = aVar.b();
                }
                i10++;
            } while (i10 < q10);
        }
        if (b10 >= 0) {
            return b10;
        }
        throw new IllegalArgumentException("negative minIndex");
    }

    public final boolean d() {
        return this.f1652a.t();
    }

    public final void e(a aVar) {
        this.f1652a.w(aVar);
    }
}

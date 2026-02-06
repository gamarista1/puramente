package ka;

import java.util.Arrays;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private a f45965a = new a();

    /* renamed from: b  reason: collision with root package name */
    private a f45966b = new a();

    /* renamed from: c  reason: collision with root package name */
    private boolean f45967c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f45968d;

    /* renamed from: e  reason: collision with root package name */
    private long f45969e = -9223372036854775807L;

    /* renamed from: f  reason: collision with root package name */
    private int f45970f;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f45971a;

        /* renamed from: b  reason: collision with root package name */
        private long f45972b;

        /* renamed from: c  reason: collision with root package name */
        private long f45973c;

        /* renamed from: d  reason: collision with root package name */
        private long f45974d;

        /* renamed from: e  reason: collision with root package name */
        private long f45975e;

        /* renamed from: f  reason: collision with root package name */
        private long f45976f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean[] f45977g = new boolean[15];

        /* renamed from: h  reason: collision with root package name */
        private int f45978h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f45975e;
            if (j10 == 0) {
                return 0;
            }
            return this.f45976f / j10;
        }

        public long b() {
            return this.f45976f;
        }

        public boolean d() {
            long j10 = this.f45974d;
            if (j10 == 0) {
                return false;
            }
            return this.f45977g[c(j10 - 1)];
        }

        public boolean e() {
            if (this.f45974d <= 15 || this.f45978h != 0) {
                return false;
            }
            return true;
        }

        public void f(long j10) {
            long j11 = this.f45974d;
            if (j11 == 0) {
                this.f45971a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f45971a;
                this.f45972b = j12;
                this.f45976f = j12;
                this.f45975e = 1;
            } else {
                long j13 = j10 - this.f45973c;
                int c10 = c(j11);
                if (Math.abs(j13 - this.f45972b) <= 1000000) {
                    this.f45975e++;
                    this.f45976f += j13;
                    boolean[] zArr = this.f45977g;
                    if (zArr[c10]) {
                        zArr[c10] = false;
                        this.f45978h--;
                    }
                } else {
                    boolean[] zArr2 = this.f45977g;
                    if (!zArr2[c10]) {
                        zArr2[c10] = true;
                        this.f45978h++;
                    }
                }
            }
            this.f45974d++;
            this.f45973c = j10;
        }

        public void g() {
            this.f45974d = 0;
            this.f45975e = 0;
            this.f45976f = 0;
            this.f45978h = 0;
            Arrays.fill(this.f45977g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f45965a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / ((double) this.f45965a.a()));
        }
        return -1.0f;
    }

    public int c() {
        return this.f45970f;
    }

    public long d() {
        if (e()) {
            return this.f45965a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f45965a.e();
    }

    public void f(long j10) {
        this.f45965a.f(j10);
        int i10 = 0;
        if (this.f45965a.e() && !this.f45968d) {
            this.f45967c = false;
        } else if (this.f45969e != -9223372036854775807L) {
            if (!this.f45967c || this.f45966b.d()) {
                this.f45966b.g();
                this.f45966b.f(this.f45969e);
            }
            this.f45967c = true;
            this.f45966b.f(j10);
        }
        if (this.f45967c && this.f45966b.e()) {
            a aVar = this.f45965a;
            this.f45965a = this.f45966b;
            this.f45966b = aVar;
            this.f45967c = false;
            this.f45968d = false;
        }
        this.f45969e = j10;
        if (!this.f45965a.e()) {
            i10 = this.f45970f + 1;
        }
        this.f45970f = i10;
    }

    public void g() {
        this.f45965a.g();
        this.f45966b.g();
        this.f45967c = false;
        this.f45969e = -9223372036854775807L;
        this.f45970f = 0;
    }
}

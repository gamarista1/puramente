package x2;

import java.util.Arrays;

final class i {

    /* renamed from: a  reason: collision with root package name */
    private a f28277a = new a();

    /* renamed from: b  reason: collision with root package name */
    private a f28278b = new a();

    /* renamed from: c  reason: collision with root package name */
    private boolean f28279c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f28280d;

    /* renamed from: e  reason: collision with root package name */
    private long f28281e = -9223372036854775807L;

    /* renamed from: f  reason: collision with root package name */
    private int f28282f;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f28283a;

        /* renamed from: b  reason: collision with root package name */
        private long f28284b;

        /* renamed from: c  reason: collision with root package name */
        private long f28285c;

        /* renamed from: d  reason: collision with root package name */
        private long f28286d;

        /* renamed from: e  reason: collision with root package name */
        private long f28287e;

        /* renamed from: f  reason: collision with root package name */
        private long f28288f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean[] f28289g = new boolean[15];

        /* renamed from: h  reason: collision with root package name */
        private int f28290h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f28287e;
            if (j10 == 0) {
                return 0;
            }
            return this.f28288f / j10;
        }

        public long b() {
            return this.f28288f;
        }

        public boolean d() {
            long j10 = this.f28286d;
            if (j10 == 0) {
                return false;
            }
            return this.f28289g[c(j10 - 1)];
        }

        public boolean e() {
            if (this.f28286d <= 15 || this.f28290h != 0) {
                return false;
            }
            return true;
        }

        public void f(long j10) {
            long j11 = this.f28286d;
            if (j11 == 0) {
                this.f28283a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f28283a;
                this.f28284b = j12;
                this.f28288f = j12;
                this.f28287e = 1;
            } else {
                long j13 = j10 - this.f28285c;
                int c10 = c(j11);
                if (Math.abs(j13 - this.f28284b) <= 1000000) {
                    this.f28287e++;
                    this.f28288f += j13;
                    boolean[] zArr = this.f28289g;
                    if (zArr[c10]) {
                        zArr[c10] = false;
                        this.f28290h--;
                    }
                } else {
                    boolean[] zArr2 = this.f28289g;
                    if (!zArr2[c10]) {
                        zArr2[c10] = true;
                        this.f28290h++;
                    }
                }
            }
            this.f28286d++;
            this.f28285c = j10;
        }

        public void g() {
            this.f28286d = 0;
            this.f28287e = 0;
            this.f28288f = 0;
            this.f28290h = 0;
            Arrays.fill(this.f28289g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f28277a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / ((double) this.f28277a.a()));
        }
        return -1.0f;
    }

    public int c() {
        return this.f28282f;
    }

    public long d() {
        if (e()) {
            return this.f28277a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f28277a.e();
    }

    public void f(long j10) {
        this.f28277a.f(j10);
        int i10 = 0;
        if (this.f28277a.e() && !this.f28280d) {
            this.f28279c = false;
        } else if (this.f28281e != -9223372036854775807L) {
            if (!this.f28279c || this.f28278b.d()) {
                this.f28278b.g();
                this.f28278b.f(this.f28281e);
            }
            this.f28279c = true;
            this.f28278b.f(j10);
        }
        if (this.f28279c && this.f28278b.e()) {
            a aVar = this.f28277a;
            this.f28277a = this.f28278b;
            this.f28278b = aVar;
            this.f28279c = false;
            this.f28280d = false;
        }
        this.f28281e = j10;
        if (!this.f28277a.e()) {
            i10 = this.f28282f + 1;
        }
        this.f28282f = i10;
    }

    public void g() {
        this.f28277a.g();
        this.f28278b.g();
        this.f28279c = false;
        this.f28281e = -9223372036854775807L;
        this.f28282f = 0;
    }
}

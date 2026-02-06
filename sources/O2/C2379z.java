package o2;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: o2.z  reason: case insensitive filesystem */
final class C2379z {

    /* renamed from: a  reason: collision with root package name */
    private final a f25065a;

    /* renamed from: b  reason: collision with root package name */
    private int f25066b;

    /* renamed from: c  reason: collision with root package name */
    private long f25067c;

    /* renamed from: d  reason: collision with root package name */
    private long f25068d;

    /* renamed from: e  reason: collision with root package name */
    private long f25069e;

    /* renamed from: f  reason: collision with root package name */
    private long f25070f;

    /* renamed from: o2.z$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final AudioTrack f25071a;

        /* renamed from: b  reason: collision with root package name */
        private final AudioTimestamp f25072b = new AudioTimestamp();

        /* renamed from: c  reason: collision with root package name */
        private long f25073c;

        /* renamed from: d  reason: collision with root package name */
        private long f25074d;

        /* renamed from: e  reason: collision with root package name */
        private long f25075e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f25076f;

        /* renamed from: g  reason: collision with root package name */
        private long f25077g;

        public a(AudioTrack audioTrack) {
            this.f25071a = audioTrack;
        }

        public void a() {
            this.f25076f = true;
        }

        public long b() {
            return this.f25075e;
        }

        public long c() {
            return this.f25072b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.f25071a.getTimestamp(this.f25072b);
            if (timestamp) {
                long j10 = this.f25072b.framePosition;
                long j11 = this.f25074d;
                if (j11 > j10) {
                    if (this.f25076f) {
                        this.f25077g += j11;
                        this.f25076f = false;
                    } else {
                        this.f25073c++;
                    }
                }
                this.f25074d = j10;
                this.f25075e = j10 + this.f25077g + (this.f25073c << 32);
            }
            return timestamp;
        }
    }

    public C2379z(AudioTrack audioTrack) {
        this.f25065a = new a(audioTrack);
        h();
    }

    private void i(int i10) {
        this.f25066b = i10;
        if (i10 == 0) {
            this.f25069e = 0;
            this.f25070f = -1;
            this.f25067c = System.nanoTime() / 1000;
            this.f25068d = 10000;
        } else if (i10 == 1) {
            this.f25068d = 10000;
        } else if (i10 == 2 || i10 == 3) {
            this.f25068d = 10000000;
        } else if (i10 == 4) {
            this.f25068d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }

    public void a() {
        if (this.f25066b == 4) {
            h();
        }
    }

    public void b() {
        a aVar = this.f25065a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public long c() {
        a aVar = this.f25065a;
        if (aVar != null) {
            return aVar.b();
        }
        return -1;
    }

    public long d() {
        a aVar = this.f25065a;
        if (aVar != null) {
            return aVar.c();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        if (this.f25066b == 2) {
            return true;
        }
        return false;
    }

    public boolean f(long j10) {
        a aVar = this.f25065a;
        if (aVar == null || j10 - this.f25069e < this.f25068d) {
            return false;
        }
        this.f25069e = j10;
        boolean d10 = aVar.d();
        int i10 = this.f25066b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (d10) {
                        h();
                    }
                } else if (!d10) {
                    h();
                }
            } else if (!d10) {
                h();
            } else if (this.f25065a.b() > this.f25070f) {
                i(2);
            }
        } else if (d10) {
            if (this.f25065a.c() < this.f25067c) {
                return false;
            }
            this.f25070f = this.f25065a.b();
            i(1);
        } else if (j10 - this.f25067c > 500000) {
            i(3);
        }
        return d10;
    }

    public void g() {
        i(4);
    }

    public void h() {
        if (this.f25065a != null) {
            i(0);
        }
    }
}

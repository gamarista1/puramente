package m9;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import ja.M;

final class t {

    /* renamed from: a  reason: collision with root package name */
    private final a f46693a;

    /* renamed from: b  reason: collision with root package name */
    private int f46694b;

    /* renamed from: c  reason: collision with root package name */
    private long f46695c;

    /* renamed from: d  reason: collision with root package name */
    private long f46696d;

    /* renamed from: e  reason: collision with root package name */
    private long f46697e;

    /* renamed from: f  reason: collision with root package name */
    private long f46698f;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final AudioTrack f46699a;

        /* renamed from: b  reason: collision with root package name */
        private final AudioTimestamp f46700b = new AudioTimestamp();

        /* renamed from: c  reason: collision with root package name */
        private long f46701c;

        /* renamed from: d  reason: collision with root package name */
        private long f46702d;

        /* renamed from: e  reason: collision with root package name */
        private long f46703e;

        public a(AudioTrack audioTrack) {
            this.f46699a = audioTrack;
        }

        public long a() {
            return this.f46703e;
        }

        public long b() {
            return this.f46700b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f46699a.getTimestamp(this.f46700b);
            if (timestamp) {
                long j10 = this.f46700b.framePosition;
                if (this.f46702d > j10) {
                    this.f46701c++;
                }
                this.f46702d = j10;
                this.f46703e = j10 + (this.f46701c << 32);
            }
            return timestamp;
        }
    }

    public t(AudioTrack audioTrack) {
        if (M.f44981a >= 19) {
            this.f46693a = new a(audioTrack);
            g();
            return;
        }
        this.f46693a = null;
        h(3);
    }

    private void h(int i10) {
        this.f46694b = i10;
        if (i10 == 0) {
            this.f46697e = 0;
            this.f46698f = -1;
            this.f46695c = System.nanoTime() / 1000;
            this.f46696d = 10000;
        } else if (i10 == 1) {
            this.f46696d = 10000;
        } else if (i10 == 2 || i10 == 3) {
            this.f46696d = 10000000;
        } else if (i10 == 4) {
            this.f46696d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }

    public void a() {
        if (this.f46694b == 4) {
            g();
        }
    }

    public long b() {
        a aVar = this.f46693a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1;
    }

    public long c() {
        a aVar = this.f46693a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        if (this.f46694b == 2) {
            return true;
        }
        return false;
    }

    public boolean e(long j10) {
        a aVar = this.f46693a;
        if (aVar == null || j10 - this.f46697e < this.f46696d) {
            return false;
        }
        this.f46697e = j10;
        boolean c10 = aVar.c();
        int i10 = this.f46694b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c10) {
                        g();
                    }
                } else if (!c10) {
                    g();
                }
            } else if (!c10) {
                g();
            } else if (this.f46693a.a() > this.f46698f) {
                h(2);
            }
        } else if (c10) {
            if (this.f46693a.b() < this.f46695c) {
                return false;
            }
            this.f46698f = this.f46693a.a();
            h(1);
        } else if (j10 - this.f46695c > 500000) {
            h(3);
        }
        return c10;
    }

    public void f() {
        h(4);
    }

    public void g() {
        if (this.f46693a != null) {
            h(0);
        }
    }
}

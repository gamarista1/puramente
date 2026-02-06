package m9;

import android.media.AudioTrack;
import android.os.SystemClock;
import ja.C3645a;
import ja.M;
import java.lang.reflect.Method;

final class u {

    /* renamed from: A  reason: collision with root package name */
    private long f46704A;

    /* renamed from: B  reason: collision with root package name */
    private long f46705B;

    /* renamed from: C  reason: collision with root package name */
    private long f46706C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f46707D;

    /* renamed from: E  reason: collision with root package name */
    private long f46708E;

    /* renamed from: F  reason: collision with root package name */
    private long f46709F;

    /* renamed from: a  reason: collision with root package name */
    private final a f46710a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f46711b;

    /* renamed from: c  reason: collision with root package name */
    private AudioTrack f46712c;

    /* renamed from: d  reason: collision with root package name */
    private int f46713d;

    /* renamed from: e  reason: collision with root package name */
    private int f46714e;

    /* renamed from: f  reason: collision with root package name */
    private t f46715f;

    /* renamed from: g  reason: collision with root package name */
    private int f46716g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f46717h;

    /* renamed from: i  reason: collision with root package name */
    private long f46718i;

    /* renamed from: j  reason: collision with root package name */
    private float f46719j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f46720k;

    /* renamed from: l  reason: collision with root package name */
    private long f46721l;

    /* renamed from: m  reason: collision with root package name */
    private long f46722m;

    /* renamed from: n  reason: collision with root package name */
    private Method f46723n;

    /* renamed from: o  reason: collision with root package name */
    private long f46724o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f46725p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f46726q;

    /* renamed from: r  reason: collision with root package name */
    private long f46727r;

    /* renamed from: s  reason: collision with root package name */
    private long f46728s;

    /* renamed from: t  reason: collision with root package name */
    private long f46729t;

    /* renamed from: u  reason: collision with root package name */
    private long f46730u;

    /* renamed from: v  reason: collision with root package name */
    private int f46731v;

    /* renamed from: w  reason: collision with root package name */
    private int f46732w;

    /* renamed from: x  reason: collision with root package name */
    private long f46733x;

    /* renamed from: y  reason: collision with root package name */
    private long f46734y;

    /* renamed from: z  reason: collision with root package name */
    private long f46735z;

    public interface a {
        void a(int i10, long j10);

        void b(long j10);

        void c(long j10);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10, long j11, long j12, long j13);
    }

    public u(a aVar) {
        this.f46710a = (a) C3645a.e(aVar);
        if (M.f44981a >= 18) {
            try {
                this.f46723n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f46711b = new long[10];
    }

    private boolean a() {
        if (this.f46717h && ((AudioTrack) C3645a.e(this.f46712c)).getPlayState() == 2 && e() == 0) {
            return true;
        }
        return false;
    }

    private long b(long j10) {
        return (j10 * 1000000) / ((long) this.f46716g);
    }

    private long e() {
        AudioTrack audioTrack = (AudioTrack) C3645a.e(this.f46712c);
        if (this.f46733x != -9223372036854775807L) {
            return Math.min(this.f46704A, this.f46735z + ((((SystemClock.elapsedRealtime() * 1000) - this.f46733x) * ((long) this.f46716g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f46717h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f46730u = this.f46728s;
            }
            playbackHeadPosition += this.f46730u;
        }
        if (M.f44981a <= 29) {
            if (playbackHeadPosition == 0 && this.f46728s > 0 && playState == 3) {
                if (this.f46734y == -9223372036854775807L) {
                    this.f46734y = SystemClock.elapsedRealtime();
                }
                return this.f46728s;
            }
            this.f46734y = -9223372036854775807L;
        }
        if (this.f46728s > playbackHeadPosition) {
            this.f46729t++;
        }
        this.f46728s = playbackHeadPosition;
        return playbackHeadPosition + (this.f46729t << 32);
    }

    private long f() {
        return b(e());
    }

    private void l(long j10, long j11) {
        t tVar = (t) C3645a.e(this.f46715f);
        if (tVar.e(j10)) {
            long c10 = tVar.c();
            long b10 = tVar.b();
            if (Math.abs(c10 - j10) > 5000000) {
                this.f46710a.e(b10, c10, j10, j11);
                tVar.f();
            } else if (Math.abs(b(b10) - j11) > 5000000) {
                this.f46710a.d(b10, c10, j10, j11);
                tVar.f();
            } else {
                tVar.a();
            }
        }
    }

    private void m() {
        long f10 = f();
        if (f10 != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f46722m >= 30000) {
                long[] jArr = this.f46711b;
                int i10 = this.f46731v;
                jArr[i10] = f10 - nanoTime;
                this.f46731v = (i10 + 1) % 10;
                int i11 = this.f46732w;
                if (i11 < 10) {
                    this.f46732w = i11 + 1;
                }
                this.f46722m = nanoTime;
                this.f46721l = 0;
                int i12 = 0;
                while (true) {
                    int i13 = this.f46732w;
                    if (i12 >= i13) {
                        break;
                    }
                    this.f46721l += this.f46711b[i12] / ((long) i13);
                    i12++;
                }
            }
            if (!this.f46717h) {
                l(nanoTime, f10);
                n(nanoTime);
            }
        }
    }

    private void n(long j10) {
        Method method;
        if (this.f46726q && (method = this.f46723n) != null && j10 - this.f46727r >= 500000) {
            try {
                long intValue = (((long) ((Integer) M.j((Integer) method.invoke(C3645a.e(this.f46712c), (Object[]) null))).intValue()) * 1000) - this.f46718i;
                this.f46724o = intValue;
                long max = Math.max(intValue, 0);
                this.f46724o = max;
                if (max > 5000000) {
                    this.f46710a.b(max);
                    this.f46724o = 0;
                }
            } catch (Exception unused) {
                this.f46723n = null;
            }
            this.f46727r = j10;
        }
    }

    private static boolean o(int i10) {
        if (M.f44981a >= 23 || (i10 != 5 && i10 != 6)) {
            return false;
        }
        return true;
    }

    private void r() {
        this.f46721l = 0;
        this.f46732w = 0;
        this.f46731v = 0;
        this.f46722m = 0;
        this.f46706C = 0;
        this.f46709F = 0;
        this.f46720k = false;
    }

    public int c(long j10) {
        return this.f46714e - ((int) (j10 - (e() * ((long) this.f46713d))));
    }

    public long d(boolean z10) {
        long j10;
        if (((AudioTrack) C3645a.e(this.f46712c)).getPlayState() == 3) {
            m();
        }
        long nanoTime = System.nanoTime() / 1000;
        t tVar = (t) C3645a.e(this.f46715f);
        boolean d10 = tVar.d();
        if (d10) {
            j10 = b(tVar.b()) + M.a0(nanoTime - tVar.c(), this.f46719j);
        } else {
            if (this.f46732w == 0) {
                j10 = f();
            } else {
                j10 = this.f46721l + nanoTime;
            }
            if (!z10) {
                j10 = Math.max(0, j10 - this.f46724o);
            }
        }
        if (this.f46707D != d10) {
            this.f46709F = this.f46706C;
            this.f46708E = this.f46705B;
        }
        long j11 = nanoTime - this.f46709F;
        if (j11 < 1000000) {
            long j12 = (j11 * 1000) / 1000000;
            j10 = ((j10 * j12) + ((1000 - j12) * (this.f46708E + M.a0(j11, this.f46719j)))) / 1000;
        }
        if (!this.f46720k) {
            long j13 = this.f46705B;
            if (j10 > j13) {
                this.f46720k = true;
                this.f46710a.c(System.currentTimeMillis() - M.Z0(M.f0(M.Z0(j10 - j13), this.f46719j)));
            }
        }
        this.f46706C = nanoTime;
        this.f46705B = j10;
        this.f46707D = d10;
        return j10;
    }

    public void g(long j10) {
        this.f46735z = e();
        this.f46733x = SystemClock.elapsedRealtime() * 1000;
        this.f46704A = j10;
    }

    public boolean h(long j10) {
        if (j10 > e() || a()) {
            return true;
        }
        return false;
    }

    public boolean i() {
        if (((AudioTrack) C3645a.e(this.f46712c)).getPlayState() == 3) {
            return true;
        }
        return false;
    }

    public boolean j(long j10) {
        if (this.f46734y == -9223372036854775807L || j10 <= 0 || SystemClock.elapsedRealtime() - this.f46734y < 200) {
            return false;
        }
        return true;
    }

    public boolean k(long j10) {
        int playState = ((AudioTrack) C3645a.e(this.f46712c)).getPlayState();
        if (this.f46717h) {
            if (playState == 2) {
                this.f46725p = false;
                return false;
            } else if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z10 = this.f46725p;
        boolean h10 = h(j10);
        this.f46725p = h10;
        if (z10 && !h10 && playState != 1) {
            this.f46710a.a(this.f46714e, M.Z0(this.f46718i));
        }
        return true;
    }

    public boolean p() {
        r();
        if (this.f46733x != -9223372036854775807L) {
            return false;
        }
        ((t) C3645a.e(this.f46715f)).g();
        return true;
    }

    public void q() {
        r();
        this.f46712c = null;
        this.f46715f = null;
    }

    public void s(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        boolean z11;
        long j10;
        this.f46712c = audioTrack;
        this.f46713d = i11;
        this.f46714e = i12;
        this.f46715f = new t(audioTrack);
        this.f46716g = audioTrack.getSampleRate();
        if (!z10 || !o(i10)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f46717h = z11;
        boolean v02 = M.v0(i10);
        this.f46726q = v02;
        if (v02) {
            j10 = b((long) (i12 / i11));
        } else {
            j10 = -9223372036854775807L;
        }
        this.f46718i = j10;
        this.f46728s = 0;
        this.f46729t = 0;
        this.f46730u = 0;
        this.f46725p = false;
        this.f46733x = -9223372036854775807L;
        this.f46734y = -9223372036854775807L;
        this.f46727r = 0;
        this.f46724o = 0;
        this.f46719j = 1.0f;
    }

    public void t(float f10) {
        this.f46719j = f10;
        t tVar = this.f46715f;
        if (tVar != null) {
            tVar.g();
        }
    }

    public void u() {
        ((t) C3645a.e(this.f46715f)).g();
    }
}

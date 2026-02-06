package o2;

import android.media.AudioTrack;
import i2.C2076a;
import i2.C2078c;
import i2.L;
import java.lang.reflect.Method;

/* renamed from: o2.A  reason: case insensitive filesystem */
final class C2351A {

    /* renamed from: A  reason: collision with root package name */
    private long f24770A;

    /* renamed from: B  reason: collision with root package name */
    private long f24771B;

    /* renamed from: C  reason: collision with root package name */
    private long f24772C;

    /* renamed from: D  reason: collision with root package name */
    private long f24773D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f24774E;

    /* renamed from: F  reason: collision with root package name */
    private long f24775F;

    /* renamed from: G  reason: collision with root package name */
    private long f24776G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f24777H;

    /* renamed from: I  reason: collision with root package name */
    private long f24778I;

    /* renamed from: J  reason: collision with root package name */
    private C2078c f24779J;

    /* renamed from: a  reason: collision with root package name */
    private final a f24780a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f24781b;

    /* renamed from: c  reason: collision with root package name */
    private AudioTrack f24782c;

    /* renamed from: d  reason: collision with root package name */
    private int f24783d;

    /* renamed from: e  reason: collision with root package name */
    private int f24784e;

    /* renamed from: f  reason: collision with root package name */
    private C2379z f24785f;

    /* renamed from: g  reason: collision with root package name */
    private int f24786g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f24787h;

    /* renamed from: i  reason: collision with root package name */
    private long f24788i;

    /* renamed from: j  reason: collision with root package name */
    private float f24789j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f24790k;

    /* renamed from: l  reason: collision with root package name */
    private long f24791l;

    /* renamed from: m  reason: collision with root package name */
    private long f24792m;

    /* renamed from: n  reason: collision with root package name */
    private Method f24793n;

    /* renamed from: o  reason: collision with root package name */
    private long f24794o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f24795p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f24796q;

    /* renamed from: r  reason: collision with root package name */
    private long f24797r;

    /* renamed from: s  reason: collision with root package name */
    private long f24798s;

    /* renamed from: t  reason: collision with root package name */
    private long f24799t;

    /* renamed from: u  reason: collision with root package name */
    private long f24800u;

    /* renamed from: v  reason: collision with root package name */
    private long f24801v;

    /* renamed from: w  reason: collision with root package name */
    private int f24802w;

    /* renamed from: x  reason: collision with root package name */
    private int f24803x;

    /* renamed from: y  reason: collision with root package name */
    private long f24804y;

    /* renamed from: z  reason: collision with root package name */
    private long f24805z;

    /* renamed from: o2.A$a */
    public interface a {
        void a(int i10, long j10);

        void b(long j10);

        void c(long j10);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10, long j11, long j12, long j13);
    }

    public C2351A(a aVar) {
        this.f24780a = (a) C2076a.e(aVar);
        try {
            this.f24793n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.f24781b = new long[10];
        this.f24779J = C2078c.f22089a;
    }

    private boolean b() {
        if (this.f24787h && ((AudioTrack) C2076a.e(this.f24782c)).getPlayState() == 2 && e() == 0) {
            return true;
        }
        return false;
    }

    private long e() {
        long a10 = this.f24779J.a();
        if (this.f24804y == -9223372036854775807L) {
            if (a10 - this.f24798s >= 5) {
                w(a10);
                this.f24798s = a10;
            }
            return this.f24799t + this.f24778I + (this.f24800u << 32);
        } else if (((AudioTrack) C2076a.e(this.f24782c)).getPlayState() == 2) {
            return this.f24770A;
        } else {
            return Math.min(this.f24771B, this.f24770A + L.E(L.b0(L.L0(a10) - this.f24804y, this.f24789j), this.f24786g));
        }
    }

    private long f() {
        return L.T0(e(), this.f24786g);
    }

    private void l(long j10) {
        C2379z zVar = (C2379z) C2076a.e(this.f24785f);
        if (zVar.f(j10)) {
            long d10 = zVar.d();
            long c10 = zVar.c();
            long f10 = f();
            if (Math.abs(d10 - j10) > 5000000) {
                this.f24780a.e(c10, d10, j10, f10);
                zVar.g();
            } else if (Math.abs(L.T0(c10, this.f24786g) - f10) > 5000000) {
                this.f24780a.d(c10, d10, j10, f10);
                zVar.g();
            } else {
                zVar.a();
            }
        }
    }

    private void m() {
        long b10 = this.f24779J.b() / 1000;
        if (b10 - this.f24792m >= 30000) {
            long f10 = f();
            if (f10 != 0) {
                this.f24781b[this.f24802w] = L.g0(f10, this.f24789j) - b10;
                this.f24802w = (this.f24802w + 1) % 10;
                int i10 = this.f24803x;
                if (i10 < 10) {
                    this.f24803x = i10 + 1;
                }
                this.f24792m = b10;
                this.f24791l = 0;
                int i11 = 0;
                while (true) {
                    int i12 = this.f24803x;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f24791l += this.f24781b[i11] / ((long) i12);
                    i11++;
                }
            } else {
                return;
            }
        }
        if (!this.f24787h) {
            l(b10);
            n(b10);
        }
    }

    private void n(long j10) {
        Method method;
        if (this.f24796q && (method = this.f24793n) != null && j10 - this.f24797r >= 500000) {
            try {
                long intValue = (((long) ((Integer) L.h((Integer) method.invoke(C2076a.e(this.f24782c), (Object[]) null))).intValue()) * 1000) - this.f24788i;
                this.f24794o = intValue;
                long max = Math.max(intValue, 0);
                this.f24794o = max;
                if (max > 5000000) {
                    this.f24780a.b(max);
                    this.f24794o = 0;
                }
            } catch (Exception unused) {
                this.f24793n = null;
            }
            this.f24797r = j10;
        }
    }

    private static boolean o(int i10) {
        if (L.f22072a >= 23 || (i10 != 5 && i10 != 6)) {
            return false;
        }
        return true;
    }

    private void r() {
        this.f24791l = 0;
        this.f24803x = 0;
        this.f24802w = 0;
        this.f24792m = 0;
        this.f24773D = 0;
        this.f24776G = 0;
        this.f24790k = false;
    }

    private void w(long j10) {
        AudioTrack audioTrack = (AudioTrack) C2076a.e(this.f24782c);
        int playState = audioTrack.getPlayState();
        if (playState != 1) {
            long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
            if (this.f24787h) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.f24801v = this.f24799t;
                }
                playbackHeadPosition += this.f24801v;
            }
            if (L.f22072a <= 29) {
                if (playbackHeadPosition != 0 || this.f24799t <= 0 || playState != 3) {
                    this.f24805z = -9223372036854775807L;
                } else if (this.f24805z == -9223372036854775807L) {
                    this.f24805z = j10;
                    return;
                } else {
                    return;
                }
            }
            long j11 = this.f24799t;
            if (j11 > playbackHeadPosition) {
                if (this.f24777H) {
                    this.f24778I += j11;
                    this.f24777H = false;
                } else {
                    this.f24800u++;
                }
            }
            this.f24799t = playbackHeadPosition;
        }
    }

    public void a() {
        this.f24777H = true;
        C2379z zVar = this.f24785f;
        if (zVar != null) {
            zVar.b();
        }
    }

    public int c(long j10) {
        return this.f24784e - ((int) (j10 - (e() * ((long) this.f24783d))));
    }

    public long d(boolean z10) {
        long j10;
        if (((AudioTrack) C2076a.e(this.f24782c)).getPlayState() == 3) {
            m();
        }
        long b10 = this.f24779J.b() / 1000;
        C2379z zVar = (C2379z) C2076a.e(this.f24785f);
        boolean e10 = zVar.e();
        if (e10) {
            j10 = L.T0(zVar.c(), this.f24786g) + L.b0(b10 - zVar.d(), this.f24789j);
        } else {
            if (this.f24803x == 0) {
                j10 = f();
            } else {
                j10 = L.b0(this.f24791l + b10, this.f24789j);
            }
            if (!z10) {
                j10 = Math.max(0, j10 - this.f24794o);
            }
        }
        if (this.f24774E != e10) {
            this.f24776G = this.f24773D;
            this.f24775F = this.f24772C;
        }
        long j11 = b10 - this.f24776G;
        if (j11 < 1000000) {
            long j12 = (j11 * 1000) / 1000000;
            j10 = ((j10 * j12) + ((1000 - j12) * (this.f24775F + L.b0(j11, this.f24789j)))) / 1000;
        }
        if (!this.f24790k) {
            long j13 = this.f24772C;
            if (j10 > j13) {
                this.f24790k = true;
                this.f24780a.c(this.f24779J.currentTimeMillis() - L.h1(L.g0(L.h1(j10 - j13), this.f24789j)));
            }
        }
        this.f24773D = b10;
        this.f24772C = j10;
        this.f24774E = e10;
        return j10;
    }

    public void g(long j10) {
        this.f24770A = e();
        this.f24804y = L.L0(this.f24779J.a());
        this.f24771B = j10;
    }

    public boolean h(long j10) {
        if (j10 > L.E(d(false), this.f24786g) || b()) {
            return true;
        }
        return false;
    }

    public boolean i() {
        if (((AudioTrack) C2076a.e(this.f24782c)).getPlayState() == 3) {
            return true;
        }
        return false;
    }

    public boolean j(long j10) {
        if (this.f24805z == -9223372036854775807L || j10 <= 0 || this.f24779J.a() - this.f24805z < 200) {
            return false;
        }
        return true;
    }

    public boolean k(long j10) {
        int playState = ((AudioTrack) C2076a.e(this.f24782c)).getPlayState();
        if (this.f24787h) {
            if (playState == 2) {
                this.f24795p = false;
                return false;
            } else if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z10 = this.f24795p;
        boolean h10 = h(j10);
        this.f24795p = h10;
        if (z10 && !h10 && playState != 1) {
            this.f24780a.a(this.f24784e, L.h1(this.f24788i));
        }
        return true;
    }

    public boolean p() {
        r();
        if (this.f24804y == -9223372036854775807L) {
            ((C2379z) C2076a.e(this.f24785f)).h();
            return true;
        }
        this.f24770A = e();
        return false;
    }

    public void q() {
        r();
        this.f24782c = null;
        this.f24785f = null;
    }

    public void s(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        boolean z11;
        long j10;
        this.f24782c = audioTrack;
        this.f24783d = i11;
        this.f24784e = i12;
        this.f24785f = new C2379z(audioTrack);
        this.f24786g = audioTrack.getSampleRate();
        if (!z10 || !o(i10)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f24787h = z11;
        boolean C02 = L.C0(i10);
        this.f24796q = C02;
        if (C02) {
            j10 = L.T0((long) (i12 / i11), this.f24786g);
        } else {
            j10 = -9223372036854775807L;
        }
        this.f24788i = j10;
        this.f24799t = 0;
        this.f24800u = 0;
        this.f24777H = false;
        this.f24778I = 0;
        this.f24801v = 0;
        this.f24795p = false;
        this.f24804y = -9223372036854775807L;
        this.f24805z = -9223372036854775807L;
        this.f24797r = 0;
        this.f24794o = 0;
        this.f24789j = 1.0f;
    }

    public void t(float f10) {
        this.f24789j = f10;
        C2379z zVar = this.f24785f;
        if (zVar != null) {
            zVar.h();
        }
        r();
    }

    public void u(C2078c cVar) {
        this.f24779J = cVar;
    }

    public void v() {
        if (this.f24804y != -9223372036854775807L) {
            this.f24804y = L.L0(this.f24779J.a());
        }
        ((C2379z) C2076a.e(this.f24785f)).h();
    }
}

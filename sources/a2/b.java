package A2;

import f2.C1961B;
import f2.s;
import i2.C2076a;
import i2.L;
import java.io.EOFException;
import java.util.Arrays;
import z2.C2964h;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.J;
import z2.O;
import z2.r;
import z2.u;

public final class b implements C2972p {

    /* renamed from: p  reason: collision with root package name */
    public static final u f435p = new a();

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f436q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f437r;

    /* renamed from: s  reason: collision with root package name */
    private static final byte[] f438s = L.q0("#!AMR\n");

    /* renamed from: t  reason: collision with root package name */
    private static final byte[] f439t = L.q0("#!AMR-WB\n");

    /* renamed from: u  reason: collision with root package name */
    private static final int f440u;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f441a;

    /* renamed from: b  reason: collision with root package name */
    private final int f442b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f443c;

    /* renamed from: d  reason: collision with root package name */
    private long f444d;

    /* renamed from: e  reason: collision with root package name */
    private int f445e;

    /* renamed from: f  reason: collision with root package name */
    private int f446f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f447g;

    /* renamed from: h  reason: collision with root package name */
    private long f448h;

    /* renamed from: i  reason: collision with root package name */
    private int f449i;

    /* renamed from: j  reason: collision with root package name */
    private int f450j;

    /* renamed from: k  reason: collision with root package name */
    private long f451k;

    /* renamed from: l  reason: collision with root package name */
    private r f452l;

    /* renamed from: m  reason: collision with root package name */
    private O f453m;

    /* renamed from: n  reason: collision with root package name */
    private J f454n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f455o;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f437r = iArr;
        f440u = iArr[8];
    }

    public b() {
        this(0);
    }

    private void c() {
        C2076a.i(this.f453m);
        L.h(this.f452l);
    }

    private static int d(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private J e(long j10, boolean z10) {
        return new C2964h(j10, this.f448h, d(this.f449i, 20000), this.f449i, z10);
    }

    private int g(int i10) {
        String str;
        if (!m(i10)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Illegal AMR ");
            if (this.f443c) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb2.append(str);
            sb2.append(" frame type ");
            sb2.append(i10);
            throw C1961B.a(sb2.toString(), (Throwable) null);
        } else if (this.f443c) {
            return f437r[i10];
        } else {
            return f436q[i10];
        }
    }

    private boolean l(int i10) {
        if (this.f443c || (i10 >= 12 && i10 <= 14)) {
            return false;
        }
        return true;
    }

    private boolean m(int i10) {
        if (i10 < 0 || i10 > 15 || (!n(i10) && !l(i10))) {
            return false;
        }
        return true;
    }

    private boolean n(int i10) {
        if (!this.f443c || (i10 >= 10 && i10 <= 13)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C2972p[] o() {
        return new C2972p[]{new b()};
    }

    private void p() {
        String str;
        int i10;
        if (!this.f455o) {
            this.f455o = true;
            boolean z10 = this.f443c;
            if (z10) {
                str = "audio/amr-wb";
            } else {
                str = "audio/3gpp";
            }
            if (z10) {
                i10 = 16000;
            } else {
                i10 = 8000;
            }
            this.f453m.c(new s.b().o0(str).f0(f440u).N(1).p0(i10).K());
        }
    }

    private void q(long j10, int i10) {
        int i11;
        boolean z10;
        if (!this.f447g) {
            int i12 = this.f442b;
            if ((i12 & 1) == 0 || j10 == -1 || !((i11 = this.f449i) == -1 || i11 == this.f445e)) {
                J.b bVar = new J.b(-9223372036854775807L);
                this.f454n = bVar;
                this.f452l.u(bVar);
                this.f447g = true;
            } else if (this.f450j >= 20 || i10 == -1) {
                if ((i12 & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                J e10 = e(j10, z10);
                this.f454n = e10;
                this.f452l.u(e10);
                this.f447g = true;
            }
        }
    }

    private static boolean r(C2973q qVar, byte[] bArr) {
        qVar.e();
        byte[] bArr2 = new byte[bArr.length];
        qVar.l(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int s(C2973q qVar) {
        qVar.e();
        qVar.l(this.f441a, 0, 1);
        byte b10 = this.f441a[0];
        if ((b10 & 131) <= 0) {
            return g((b10 >> 3) & 15);
        }
        throw C1961B.a("Invalid padding bits for frame header " + b10, (Throwable) null);
    }

    private boolean t(C2973q qVar) {
        byte[] bArr = f438s;
        if (r(qVar, bArr)) {
            this.f443c = false;
            qVar.j(bArr.length);
            return true;
        }
        byte[] bArr2 = f439t;
        if (!r(qVar, bArr2)) {
            return false;
        }
        this.f443c = true;
        qVar.j(bArr2.length);
        return true;
    }

    private int u(C2973q qVar) {
        if (this.f446f == 0) {
            try {
                int s10 = s(qVar);
                this.f445e = s10;
                this.f446f = s10;
                if (this.f449i == -1) {
                    this.f448h = qVar.getPosition();
                    this.f449i = this.f445e;
                }
                if (this.f449i == this.f445e) {
                    this.f450j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int a10 = this.f453m.a(qVar, this.f446f, true);
        if (a10 == -1) {
            return -1;
        }
        int i10 = this.f446f - a10;
        this.f446f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f453m.d(this.f451k + this.f444d, 1, this.f445e, 0, (O.a) null);
        this.f444d += 20000;
        return 0;
    }

    public void a(long j10, long j11) {
        this.f444d = 0;
        this.f445e = 0;
        this.f446f = 0;
        if (j10 != 0) {
            J j12 = this.f454n;
            if (j12 instanceof C2964h) {
                this.f451k = ((C2964h) j12).f(j10);
                return;
            }
        }
        this.f451k = 0;
    }

    public void f(r rVar) {
        this.f452l = rVar;
        this.f453m = rVar.d(0, 1);
        rVar.k();
    }

    public int i(C2973q qVar, I i10) {
        c();
        if (qVar.getPosition() != 0 || t(qVar)) {
            p();
            int u10 = u(qVar);
            q(qVar.a(), u10);
            return u10;
        }
        throw C1961B.a("Could not find AMR header.", (Throwable) null);
    }

    public boolean j(C2973q qVar) {
        return t(qVar);
    }

    public b(int i10) {
        this.f442b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f441a = new byte[1];
        this.f449i = -1;
    }

    public void release() {
    }
}

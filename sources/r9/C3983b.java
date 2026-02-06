package r9;

import ja.C3645a;
import ja.M;
import java.io.EOFException;
import java.util.Arrays;
import k9.C3717q0;
import k9.L0;
import q9.C3962B;
import q9.C3969d;
import q9.k;
import q9.l;
import q9.m;
import q9.p;
import q9.y;
import q9.z;

/* renamed from: r9.b  reason: case insensitive filesystem */
public final class C3983b implements k {

    /* renamed from: p  reason: collision with root package name */
    public static final p f47993p = new C3982a();

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f47994q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f47995r;

    /* renamed from: s  reason: collision with root package name */
    private static final byte[] f47996s = M.n0("#!AMR\n");

    /* renamed from: t  reason: collision with root package name */
    private static final byte[] f47997t = M.n0("#!AMR-WB\n");

    /* renamed from: u  reason: collision with root package name */
    private static final int f47998u;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f47999a;

    /* renamed from: b  reason: collision with root package name */
    private final int f48000b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f48001c;

    /* renamed from: d  reason: collision with root package name */
    private long f48002d;

    /* renamed from: e  reason: collision with root package name */
    private int f48003e;

    /* renamed from: f  reason: collision with root package name */
    private int f48004f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f48005g;

    /* renamed from: h  reason: collision with root package name */
    private long f48006h;

    /* renamed from: i  reason: collision with root package name */
    private int f48007i;

    /* renamed from: j  reason: collision with root package name */
    private int f48008j;

    /* renamed from: k  reason: collision with root package name */
    private long f48009k;

    /* renamed from: l  reason: collision with root package name */
    private m f48010l;

    /* renamed from: m  reason: collision with root package name */
    private C3962B f48011m;

    /* renamed from: n  reason: collision with root package name */
    private z f48012n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f48013o;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f47995r = iArr;
        f47998u = iArr[8];
    }

    public C3983b() {
        this(0);
    }

    private void c() {
        C3645a.h(this.f48011m);
        M.j(this.f48010l);
    }

    private static int d(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private z e(long j10, boolean z10) {
        return new C3969d(j10, this.f48006h, d(this.f48007i, 20000), this.f48007i, z10);
    }

    private int g(int i10) {
        String str;
        if (!k(i10)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Illegal AMR ");
            if (this.f48001c) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb2.append(str);
            sb2.append(" frame type ");
            sb2.append(i10);
            throw L0.a(sb2.toString(), (Throwable) null);
        } else if (this.f48001c) {
            return f47995r[i10];
        } else {
            return f47994q[i10];
        }
    }

    private boolean j(int i10) {
        if (this.f48001c || (i10 >= 12 && i10 <= 14)) {
            return false;
        }
        return true;
    }

    private boolean k(int i10) {
        if (i10 < 0 || i10 > 15 || (!l(i10) && !j(i10))) {
            return false;
        }
        return true;
    }

    private boolean l(int i10) {
        if (!this.f48001c || (i10 >= 10 && i10 <= 13)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ k[] m() {
        return new k[]{new C3983b()};
    }

    private void n() {
        String str;
        int i10;
        if (!this.f48013o) {
            this.f48013o = true;
            boolean z10 = this.f48001c;
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
            this.f48011m.c(new C3717q0.b().e0(str).W(f47998u).H(1).f0(i10).E());
        }
    }

    private void o(long j10, int i10) {
        int i11;
        boolean z10;
        if (!this.f48005g) {
            int i12 = this.f48000b;
            if ((i12 & 1) == 0 || j10 == -1 || !((i11 = this.f48007i) == -1 || i11 == this.f48003e)) {
                z.b bVar = new z.b(-9223372036854775807L);
                this.f48012n = bVar;
                this.f48010l.q(bVar);
                this.f48005g = true;
            } else if (this.f48008j >= 20 || i10 == -1) {
                if ((i12 & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z e10 = e(j10, z10);
                this.f48012n = e10;
                this.f48010l.q(e10);
                this.f48005g = true;
            }
        }
    }

    private static boolean p(l lVar, byte[] bArr) {
        lVar.e();
        byte[] bArr2 = new byte[bArr.length];
        lVar.l(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int q(l lVar) {
        lVar.e();
        lVar.l(this.f47999a, 0, 1);
        byte b10 = this.f47999a[0];
        if ((b10 & 131) <= 0) {
            return g((b10 >> 3) & 15);
        }
        throw L0.a("Invalid padding bits for frame header " + b10, (Throwable) null);
    }

    private boolean r(l lVar) {
        byte[] bArr = f47996s;
        if (p(lVar, bArr)) {
            this.f48001c = false;
            lVar.j(bArr.length);
            return true;
        }
        byte[] bArr2 = f47997t;
        if (!p(lVar, bArr2)) {
            return false;
        }
        this.f48001c = true;
        lVar.j(bArr2.length);
        return true;
    }

    private int s(l lVar) {
        if (this.f48004f == 0) {
            try {
                int q10 = q(lVar);
                this.f48003e = q10;
                this.f48004f = q10;
                if (this.f48007i == -1) {
                    this.f48006h = lVar.getPosition();
                    this.f48007i = this.f48003e;
                }
                if (this.f48007i == this.f48003e) {
                    this.f48008j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int a10 = this.f48011m.a(lVar, this.f48004f, true);
        if (a10 == -1) {
            return -1;
        }
        int i10 = this.f48004f - a10;
        this.f48004f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f48011m.f(this.f48009k + this.f48002d, 1, this.f48003e, 0, (C3962B.a) null);
        this.f48002d += 20000;
        return 0;
    }

    public void a(long j10, long j11) {
        this.f48002d = 0;
        this.f48003e = 0;
        this.f48004f = 0;
        if (j10 != 0) {
            z zVar = this.f48012n;
            if (zVar instanceof C3969d) {
                this.f48009k = ((C3969d) zVar).f(j10);
                return;
            }
        }
        this.f48009k = 0;
    }

    public void f(m mVar) {
        this.f48010l = mVar;
        this.f48011m = mVar.d(0, 1);
        mVar.k();
    }

    public boolean h(l lVar) {
        return r(lVar);
    }

    public int i(l lVar, y yVar) {
        c();
        if (lVar.getPosition() != 0 || r(lVar)) {
            n();
            int s10 = s(lVar);
            o(lVar.a(), s10);
            return s10;
        }
        throw L0.a("Could not find AMR header.", (Throwable) null);
    }

    public C3983b(int i10) {
        this.f48000b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f47999a = new byte[1];
        this.f48007i = -1;
    }

    public void release() {
    }
}

package f3;

import com.google.common.primitives.f;
import f2.C1979n;
import f2.s;
import f3.K;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import java.util.concurrent.atomic.AtomicInteger;
import z2.C2971o;
import z2.O;
import z2.r;

/* renamed from: f3.k  reason: case insensitive filesystem */
public final class C1995k implements C1997m {

    /* renamed from: a  reason: collision with root package name */
    private final C2073A f20559a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f20560b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    private final String f20561c;

    /* renamed from: d  reason: collision with root package name */
    private final int f20562d;

    /* renamed from: e  reason: collision with root package name */
    private String f20563e;

    /* renamed from: f  reason: collision with root package name */
    private O f20564f;

    /* renamed from: g  reason: collision with root package name */
    private int f20565g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f20566h;

    /* renamed from: i  reason: collision with root package name */
    private int f20567i;

    /* renamed from: j  reason: collision with root package name */
    private long f20568j;

    /* renamed from: k  reason: collision with root package name */
    private s f20569k;

    /* renamed from: l  reason: collision with root package name */
    private int f20570l;

    /* renamed from: m  reason: collision with root package name */
    private int f20571m;

    /* renamed from: n  reason: collision with root package name */
    private int f20572n = -1;

    /* renamed from: o  reason: collision with root package name */
    private int f20573o = -1;

    /* renamed from: p  reason: collision with root package name */
    private long f20574p = -9223372036854775807L;

    public C1995k(String str, int i10, int i11) {
        this.f20559a = new C2073A(new byte[i11]);
        this.f20561c = str;
        this.f20562d = i10;
    }

    private boolean f(C2073A a10, byte[] bArr, int i10) {
        int min = Math.min(a10.a(), i10 - this.f20566h);
        a10.l(bArr, this.f20566h, min);
        int i11 = this.f20566h + min;
        this.f20566h = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private void g() {
        byte[] e10 = this.f20559a.e();
        if (this.f20569k == null) {
            s h10 = C2971o.h(e10, this.f20563e, this.f20561c, this.f20562d, (C1979n) null);
            this.f20569k = h10;
            this.f20564f.c(h10);
        }
        this.f20570l = C2971o.b(e10);
        this.f20568j = (long) f.d(L.T0((long) C2971o.g(e10), this.f20569k.f20060C));
    }

    private void h() {
        C2971o.b i10 = C2971o.i(this.f20559a.e());
        k(i10);
        this.f20570l = i10.f29272d;
        long j10 = i10.f29273e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f20568j = j10;
    }

    private void i() {
        C2971o.b k10 = C2971o.k(this.f20559a.e(), this.f20560b);
        if (this.f20571m == 3) {
            k(k10);
        }
        this.f20570l = k10.f29272d;
        long j10 = k10.f29273e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f20568j = j10;
    }

    private boolean j(C2073A a10) {
        while (a10.a() > 0) {
            int i10 = this.f20567i << 8;
            this.f20567i = i10;
            int H10 = i10 | a10.H();
            this.f20567i = H10;
            int c10 = C2971o.c(H10);
            this.f20571m = c10;
            if (c10 != 0) {
                byte[] e10 = this.f20559a.e();
                int i11 = this.f20567i;
                e10[0] = (byte) ((i11 >> 24) & 255);
                e10[1] = (byte) ((i11 >> 16) & 255);
                e10[2] = (byte) ((i11 >> 8) & 255);
                e10[3] = (byte) (i11 & 255);
                this.f20566h = 4;
                this.f20567i = 0;
                return true;
            }
        }
        return false;
    }

    private void k(C2971o.b bVar) {
        int i10;
        s.b bVar2;
        int i11 = bVar.f29270b;
        if (i11 != -2147483647 && (i10 = bVar.f29271c) != -1) {
            s sVar = this.f20569k;
            if (sVar == null || i10 != sVar.f20059B || i11 != sVar.f20060C || !L.c(bVar.f29269a, sVar.f20083n)) {
                s sVar2 = this.f20569k;
                if (sVar2 == null) {
                    bVar2 = new s.b();
                } else {
                    bVar2 = sVar2.a();
                }
                s K10 = bVar2.a0(this.f20563e).o0(bVar.f29269a).N(bVar.f29271c).p0(bVar.f29270b).e0(this.f20561c).m0(this.f20562d).K();
                this.f20569k = K10;
                this.f20564f.c(K10);
            }
        }
    }

    public void a() {
        this.f20565g = 0;
        this.f20566h = 0;
        this.f20567i = 0;
        this.f20574p = -9223372036854775807L;
        this.f20560b.set(0);
    }

    public void b(C2073A a10) {
        boolean z10;
        int i10;
        C2076a.i(this.f20564f);
        while (a10.a() > 0) {
            switch (this.f20565g) {
                case 0:
                    if (j(a10)) {
                        int i11 = this.f20571m;
                        if (i11 != 3 && i11 != 4) {
                            if (i11 != 1) {
                                this.f20565g = 2;
                                break;
                            } else {
                                this.f20565g = 1;
                                break;
                            }
                        } else {
                            this.f20565g = 4;
                            break;
                        }
                    } else {
                        break;
                    }
                case 1:
                    if (!f(a10, this.f20559a.e(), 18)) {
                        break;
                    } else {
                        g();
                        this.f20559a.U(0);
                        this.f20564f.f(this.f20559a, 18);
                        this.f20565g = 6;
                        break;
                    }
                case 2:
                    if (!f(a10, this.f20559a.e(), 7)) {
                        break;
                    } else {
                        this.f20572n = C2971o.j(this.f20559a.e());
                        this.f20565g = 3;
                        break;
                    }
                case 3:
                    if (!f(a10, this.f20559a.e(), this.f20572n)) {
                        break;
                    } else {
                        h();
                        this.f20559a.U(0);
                        this.f20564f.f(this.f20559a, this.f20572n);
                        this.f20565g = 6;
                        break;
                    }
                case 4:
                    if (!f(a10, this.f20559a.e(), 6)) {
                        break;
                    } else {
                        int l10 = C2971o.l(this.f20559a.e());
                        this.f20573o = l10;
                        int i12 = this.f20566h;
                        if (i12 > l10) {
                            int i13 = i12 - l10;
                            this.f20566h = i12 - i13;
                            a10.U(a10.f() - i13);
                        }
                        this.f20565g = 5;
                        break;
                    }
                case 5:
                    if (!f(a10, this.f20559a.e(), this.f20573o)) {
                        break;
                    } else {
                        i();
                        this.f20559a.U(0);
                        this.f20564f.f(this.f20559a, this.f20573o);
                        this.f20565g = 6;
                        break;
                    }
                case 6:
                    int min = Math.min(a10.a(), this.f20570l - this.f20566h);
                    this.f20564f.f(a10, min);
                    int i14 = this.f20566h + min;
                    this.f20566h = i14;
                    if (i14 == this.f20570l) {
                        if (this.f20574p != -9223372036854775807L) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        C2076a.g(z10);
                        O o10 = this.f20564f;
                        long j10 = this.f20574p;
                        if (this.f20571m == 4) {
                            i10 = 0;
                        } else {
                            i10 = 1;
                        }
                        o10.d(j10, i10, this.f20570l, 0, (O.a) null);
                        this.f20574p += this.f20568j;
                        this.f20565g = 0;
                        break;
                    } else {
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public void d(long j10, int i10) {
        this.f20574p = j10;
    }

    public void e(r rVar, K.d dVar) {
        dVar.a();
        this.f20563e = dVar.b();
        this.f20564f = rVar.d(dVar.c(), 1);
    }

    public void c(boolean z10) {
    }
}

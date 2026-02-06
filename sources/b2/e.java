package B2;

import i2.C2076a;
import i2.L;
import java.util.Arrays;
import z2.C2973q;
import z2.J;
import z2.K;
import z2.O;

final class e {

    /* renamed from: a  reason: collision with root package name */
    protected final O f808a;

    /* renamed from: b  reason: collision with root package name */
    private final int f809b;

    /* renamed from: c  reason: collision with root package name */
    private final int f810c;

    /* renamed from: d  reason: collision with root package name */
    private final long f811d;

    /* renamed from: e  reason: collision with root package name */
    private final int f812e;

    /* renamed from: f  reason: collision with root package name */
    private int f813f;

    /* renamed from: g  reason: collision with root package name */
    private int f814g;

    /* renamed from: h  reason: collision with root package name */
    private int f815h;

    /* renamed from: i  reason: collision with root package name */
    private int f816i;

    /* renamed from: j  reason: collision with root package name */
    private int f817j;

    /* renamed from: k  reason: collision with root package name */
    private long[] f818k;

    /* renamed from: l  reason: collision with root package name */
    private int[] f819l;

    public e(int i10, int i11, long j10, int i12, O o10) {
        int i13;
        int i14;
        boolean z10 = true;
        if (!(i11 == 1 || i11 == 2)) {
            z10 = false;
        }
        C2076a.a(z10);
        this.f811d = j10;
        this.f812e = i12;
        this.f808a = o10;
        if (i11 == 2) {
            i13 = 1667497984;
        } else {
            i13 = 1651965952;
        }
        this.f809b = d(i10, i13);
        if (i11 == 2) {
            i14 = d(i10, 1650720768);
        } else {
            i14 = -1;
        }
        this.f810c = i14;
        this.f818k = new long[512];
        this.f819l = new int[512];
    }

    private static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private long e(int i10) {
        return (this.f811d * ((long) i10)) / ((long) this.f812e);
    }

    private K h(int i10) {
        return new K(((long) this.f819l[i10]) * g(), this.f818k[i10]);
    }

    public void a() {
        this.f815h++;
    }

    public void b(long j10) {
        if (this.f817j == this.f819l.length) {
            long[] jArr = this.f818k;
            this.f818k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f819l;
            this.f819l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f818k;
        int i10 = this.f817j;
        jArr2[i10] = j10;
        this.f819l[i10] = this.f816i;
        this.f817j = i10 + 1;
    }

    public void c() {
        this.f818k = Arrays.copyOf(this.f818k, this.f817j);
        this.f819l = Arrays.copyOf(this.f819l, this.f817j);
    }

    public long f() {
        return e(this.f815h);
    }

    public long g() {
        return e(1);
    }

    public J.a i(long j10) {
        int g10 = (int) (j10 / g());
        int f10 = L.f(this.f819l, g10, true, true);
        if (this.f819l[f10] == g10) {
            return new J.a(h(f10));
        }
        K h10 = h(f10);
        int i10 = f10 + 1;
        if (i10 < this.f818k.length) {
            return new J.a(h10, h(i10));
        }
        return new J.a(h10);
    }

    public boolean j(int i10) {
        if (this.f809b == i10 || this.f810c == i10) {
            return true;
        }
        return false;
    }

    public void k() {
        this.f816i++;
    }

    public boolean l() {
        if (Arrays.binarySearch(this.f819l, this.f815h) >= 0) {
            return true;
        }
        return false;
    }

    public boolean m(C2973q qVar) {
        int i10 = this.f814g;
        boolean z10 = false;
        int a10 = i10 - this.f808a.a(qVar, i10, false);
        this.f814g = a10;
        if (a10 == 0) {
            z10 = true;
        }
        if (z10) {
            if (this.f813f > 0) {
                O o10 = this.f808a;
                long f10 = f();
                boolean l10 = l();
                o10.d(f10, l10 ? 1 : 0, this.f813f, 0, (O.a) null);
            }
            a();
        }
        return z10;
    }

    public void n(int i10) {
        this.f813f = i10;
        this.f814g = i10;
    }

    public void o(long j10) {
        if (this.f817j == 0) {
            this.f815h = 0;
            return;
        }
        this.f815h = this.f819l[L.g(this.f818k, j10, true, true)];
    }
}

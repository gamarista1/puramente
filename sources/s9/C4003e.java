package s9;

import ja.C3645a;
import ja.M;
import java.util.Arrays;
import q9.C3961A;
import q9.C3962B;
import q9.l;
import q9.z;

/* renamed from: s9.e  reason: case insensitive filesystem */
final class C4003e {

    /* renamed from: a  reason: collision with root package name */
    protected final C3962B f48141a;

    /* renamed from: b  reason: collision with root package name */
    private final int f48142b;

    /* renamed from: c  reason: collision with root package name */
    private final int f48143c;

    /* renamed from: d  reason: collision with root package name */
    private final long f48144d;

    /* renamed from: e  reason: collision with root package name */
    private final int f48145e;

    /* renamed from: f  reason: collision with root package name */
    private int f48146f;

    /* renamed from: g  reason: collision with root package name */
    private int f48147g;

    /* renamed from: h  reason: collision with root package name */
    private int f48148h;

    /* renamed from: i  reason: collision with root package name */
    private int f48149i;

    /* renamed from: j  reason: collision with root package name */
    private int f48150j;

    /* renamed from: k  reason: collision with root package name */
    private long[] f48151k;

    /* renamed from: l  reason: collision with root package name */
    private int[] f48152l;

    public C4003e(int i10, int i11, long j10, int i12, C3962B b10) {
        int i13;
        int i14;
        boolean z10 = true;
        if (!(i11 == 1 || i11 == 2)) {
            z10 = false;
        }
        C3645a.a(z10);
        this.f48144d = j10;
        this.f48145e = i12;
        this.f48141a = b10;
        if (i11 == 2) {
            i13 = 1667497984;
        } else {
            i13 = 1651965952;
        }
        this.f48142b = d(i10, i13);
        if (i11 == 2) {
            i14 = d(i10, 1650720768);
        } else {
            i14 = -1;
        }
        this.f48143c = i14;
        this.f48151k = new long[512];
        this.f48152l = new int[512];
    }

    private static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private long e(int i10) {
        return (this.f48144d * ((long) i10)) / ((long) this.f48145e);
    }

    private C3961A h(int i10) {
        return new C3961A(((long) this.f48152l[i10]) * g(), this.f48151k[i10]);
    }

    public void a() {
        this.f48148h++;
    }

    public void b(long j10) {
        if (this.f48150j == this.f48152l.length) {
            long[] jArr = this.f48151k;
            this.f48151k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f48152l;
            this.f48152l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f48151k;
        int i10 = this.f48150j;
        jArr2[i10] = j10;
        this.f48152l[i10] = this.f48149i;
        this.f48150j = i10 + 1;
    }

    public void c() {
        this.f48151k = Arrays.copyOf(this.f48151k, this.f48150j);
        this.f48152l = Arrays.copyOf(this.f48152l, this.f48150j);
    }

    public long f() {
        return e(this.f48148h);
    }

    public long g() {
        return e(1);
    }

    public z.a i(long j10) {
        int g10 = (int) (j10 / g());
        int h10 = M.h(this.f48152l, g10, true, true);
        if (this.f48152l[h10] == g10) {
            return new z.a(h(h10));
        }
        C3961A h11 = h(h10);
        int i10 = h10 + 1;
        if (i10 < this.f48151k.length) {
            return new z.a(h11, h(i10));
        }
        return new z.a(h11);
    }

    public boolean j(int i10) {
        if (this.f48142b == i10 || this.f48143c == i10) {
            return true;
        }
        return false;
    }

    public void k() {
        this.f48149i++;
    }

    public boolean l() {
        if (Arrays.binarySearch(this.f48152l, this.f48148h) >= 0) {
            return true;
        }
        return false;
    }

    public boolean m(l lVar) {
        int i10 = this.f48147g;
        boolean z10 = false;
        int a10 = i10 - this.f48141a.a(lVar, i10, false);
        this.f48147g = a10;
        if (a10 == 0) {
            z10 = true;
        }
        if (z10) {
            if (this.f48146f > 0) {
                C3962B b10 = this.f48141a;
                long f10 = f();
                boolean l10 = l();
                b10.f(f10, l10 ? 1 : 0, this.f48146f, 0, (C3962B.a) null);
            }
            a();
        }
        return z10;
    }

    public void n(int i10) {
        this.f48146f = i10;
        this.f48147g = i10;
    }

    public void o(long j10) {
        if (this.f48150j == 0) {
            this.f48148h = 0;
            return;
        }
        this.f48148h = this.f48152l[M.i(this.f48151k, j10, true, true)];
    }
}

package k9;

import N9.V;
import ga.r;
import ia.C3604b;
import ia.o;
import ja.C3645a;
import ja.M;
import ja.s;

/* renamed from: k9.l  reason: case insensitive filesystem */
public class C3706l implements C3728w0 {

    /* renamed from: a  reason: collision with root package name */
    private final o f45609a;

    /* renamed from: b  reason: collision with root package name */
    private final long f45610b;

    /* renamed from: c  reason: collision with root package name */
    private final long f45611c;

    /* renamed from: d  reason: collision with root package name */
    private final long f45612d;

    /* renamed from: e  reason: collision with root package name */
    private final long f45613e;

    /* renamed from: f  reason: collision with root package name */
    private final int f45614f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f45615g;

    /* renamed from: h  reason: collision with root package name */
    private final long f45616h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f45617i;

    /* renamed from: j  reason: collision with root package name */
    private int f45618j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f45619k;

    public C3706l() {
        this(new o(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    private static void j(int i10, int i11, String str, String str2) {
        boolean z10;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.b(z10, str + " cannot be less than " + str2);
    }

    private static int l(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void m(boolean z10) {
        int i10 = this.f45614f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f45618j = i10;
        this.f45619k = false;
        if (z10) {
            this.f45609a.g();
        }
    }

    public C3604b a() {
        return this.f45609a;
    }

    public void b(a1[] a1VarArr, V v10, r[] rVarArr) {
        int i10 = this.f45614f;
        if (i10 == -1) {
            i10 = k(a1VarArr, rVarArr);
        }
        this.f45618j = i10;
        this.f45609a.h(i10);
    }

    public boolean c() {
        return this.f45617i;
    }

    public void d() {
        m(false);
    }

    public long e() {
        return this.f45616h;
    }

    public boolean f(long j10, float f10, boolean z10, long j11) {
        long j12;
        long f02 = M.f0(j10, f10);
        if (z10) {
            j12 = this.f45613e;
        } else {
            j12 = this.f45612d;
        }
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        if (j12 <= 0 || f02 >= j12 || (!this.f45615g && this.f45609a.f() >= this.f45618j)) {
            return true;
        }
        return false;
    }

    public void g() {
        m(true);
    }

    public void h() {
        m(true);
    }

    public boolean i(long j10, long j11, float f10) {
        boolean z10;
        boolean z11 = true;
        if (this.f45609a.f() >= this.f45618j) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j12 = this.f45610b;
        if (f10 > 1.0f) {
            j12 = Math.min(M.a0(j12, f10), this.f45611c);
        }
        if (j11 < Math.max(j12, 500000)) {
            if (!this.f45615g && z10) {
                z11 = false;
            }
            this.f45619k = z11;
            if (!z11 && j11 < 500000) {
                s.i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f45611c || z10) {
            this.f45619k = false;
        }
        return this.f45619k;
    }

    /* access modifiers changed from: protected */
    public int k(a1[] a1VarArr, r[] rVarArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < a1VarArr.length; i11++) {
            if (rVarArr[i11] != null) {
                i10 += l(a1VarArr[i11].e());
            }
        }
        return Math.max(13107200, i10);
    }

    protected C3706l(o oVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        j(i12, 0, "bufferForPlaybackMs", "0");
        j(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        j(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j(i11, i10, "maxBufferMs", "minBufferMs");
        j(i15, 0, "backBufferDurationMs", "0");
        this.f45609a = oVar;
        this.f45610b = M.C0((long) i10);
        this.f45611c = M.C0((long) i11);
        this.f45612d = M.C0((long) i12);
        this.f45613e = M.C0((long) i13);
        this.f45614f = i14;
        this.f45618j = i14 == -1 ? 13107200 : i14;
        this.f45615g = z10;
        this.f45616h = M.C0((long) i15);
        this.f45617i = z11;
    }
}

package androidx.media3.exoplayer;

import android.os.SystemClock;
import com.google.common.collect.C4770v;
import f2.C1963D;
import f2.H;
import i2.L;
import java.util.List;
import t2.C2615C;
import t2.j0;
import v2.D;

final class n0 {

    /* renamed from: u  reason: collision with root package name */
    private static final C2615C.b f17753u = new C2615C.b(new Object());

    /* renamed from: a  reason: collision with root package name */
    public final H f17754a;

    /* renamed from: b  reason: collision with root package name */
    public final C2615C.b f17755b;

    /* renamed from: c  reason: collision with root package name */
    public final long f17756c;

    /* renamed from: d  reason: collision with root package name */
    public final long f17757d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17758e;

    /* renamed from: f  reason: collision with root package name */
    public final C1810h f17759f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f17760g;

    /* renamed from: h  reason: collision with root package name */
    public final j0 f17761h;

    /* renamed from: i  reason: collision with root package name */
    public final D f17762i;

    /* renamed from: j  reason: collision with root package name */
    public final List f17763j;

    /* renamed from: k  reason: collision with root package name */
    public final C2615C.b f17764k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f17765l;

    /* renamed from: m  reason: collision with root package name */
    public final int f17766m;

    /* renamed from: n  reason: collision with root package name */
    public final int f17767n;

    /* renamed from: o  reason: collision with root package name */
    public final C1963D f17768o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f17769p;

    /* renamed from: q  reason: collision with root package name */
    public volatile long f17770q;

    /* renamed from: r  reason: collision with root package name */
    public volatile long f17771r;

    /* renamed from: s  reason: collision with root package name */
    public volatile long f17772s;

    /* renamed from: t  reason: collision with root package name */
    public volatile long f17773t;

    public n0(H h10, C2615C.b bVar, long j10, long j11, int i10, C1810h hVar, boolean z10, j0 j0Var, D d10, List list, C2615C.b bVar2, boolean z11, int i11, int i12, C1963D d11, long j12, long j13, long j14, long j15, boolean z12) {
        this.f17754a = h10;
        this.f17755b = bVar;
        this.f17756c = j10;
        this.f17757d = j11;
        this.f17758e = i10;
        this.f17759f = hVar;
        this.f17760g = z10;
        this.f17761h = j0Var;
        this.f17762i = d10;
        this.f17763j = list;
        this.f17764k = bVar2;
        this.f17765l = z11;
        this.f17766m = i11;
        this.f17767n = i12;
        this.f17768o = d11;
        this.f17770q = j12;
        this.f17771r = j13;
        this.f17772s = j14;
        this.f17773t = j15;
        this.f17769p = z12;
    }

    public static n0 k(D d10) {
        H h10 = H.f19735a;
        C2615C.b bVar = f17753u;
        return new n0(h10, bVar, -9223372036854775807L, 0, 1, (C1810h) null, false, j0.f26269d, d10, C4770v.E(), bVar, false, 1, 0, C1963D.f19706d, 0, 0, 0, 0, false);
    }

    public static C2615C.b l() {
        return f17753u;
    }

    public n0 a() {
        return new n0(this.f17754a, this.f17755b, this.f17756c, this.f17757d, this.f17758e, this.f17759f, this.f17760g, this.f17761h, this.f17762i, this.f17763j, this.f17764k, this.f17765l, this.f17766m, this.f17767n, this.f17768o, this.f17770q, this.f17771r, m(), SystemClock.elapsedRealtime(), this.f17769p);
    }

    public n0 b(boolean z10) {
        H h10 = this.f17754a;
        return new n0(h10, this.f17755b, this.f17756c, this.f17757d, this.f17758e, this.f17759f, z10, this.f17761h, this.f17762i, this.f17763j, this.f17764k, this.f17765l, this.f17766m, this.f17767n, this.f17768o, this.f17770q, this.f17771r, this.f17772s, this.f17773t, this.f17769p);
    }

    public n0 c(C2615C.b bVar) {
        H h10 = this.f17754a;
        return new n0(h10, this.f17755b, this.f17756c, this.f17757d, this.f17758e, this.f17759f, this.f17760g, this.f17761h, this.f17762i, this.f17763j, bVar, this.f17765l, this.f17766m, this.f17767n, this.f17768o, this.f17770q, this.f17771r, this.f17772s, this.f17773t, this.f17769p);
    }

    public n0 d(C2615C.b bVar, long j10, long j11, long j12, long j13, j0 j0Var, D d10, List list) {
        long j14 = j10;
        j0 j0Var2 = j0Var;
        D d11 = d10;
        List list2 = list;
        H h10 = this.f17754a;
        return new n0(h10, bVar, j11, j12, this.f17758e, this.f17759f, this.f17760g, j0Var2, d11, list2, this.f17764k, this.f17765l, this.f17766m, this.f17767n, this.f17768o, this.f17770q, j13, j14, SystemClock.elapsedRealtime(), this.f17769p);
    }

    public n0 e(boolean z10, int i10, int i11) {
        H h10 = this.f17754a;
        return new n0(h10, this.f17755b, this.f17756c, this.f17757d, this.f17758e, this.f17759f, this.f17760g, this.f17761h, this.f17762i, this.f17763j, this.f17764k, z10, i10, i11, this.f17768o, this.f17770q, this.f17771r, this.f17772s, this.f17773t, this.f17769p);
    }

    public n0 f(C1810h hVar) {
        H h10 = this.f17754a;
        return new n0(h10, this.f17755b, this.f17756c, this.f17757d, this.f17758e, hVar, this.f17760g, this.f17761h, this.f17762i, this.f17763j, this.f17764k, this.f17765l, this.f17766m, this.f17767n, this.f17768o, this.f17770q, this.f17771r, this.f17772s, this.f17773t, this.f17769p);
    }

    public n0 g(C1963D d10) {
        H h10 = this.f17754a;
        return new n0(h10, this.f17755b, this.f17756c, this.f17757d, this.f17758e, this.f17759f, this.f17760g, this.f17761h, this.f17762i, this.f17763j, this.f17764k, this.f17765l, this.f17766m, this.f17767n, d10, this.f17770q, this.f17771r, this.f17772s, this.f17773t, this.f17769p);
    }

    public n0 h(int i10) {
        H h10 = this.f17754a;
        return new n0(h10, this.f17755b, this.f17756c, this.f17757d, i10, this.f17759f, this.f17760g, this.f17761h, this.f17762i, this.f17763j, this.f17764k, this.f17765l, this.f17766m, this.f17767n, this.f17768o, this.f17770q, this.f17771r, this.f17772s, this.f17773t, this.f17769p);
    }

    public n0 i(boolean z10) {
        H h10 = this.f17754a;
        return new n0(h10, this.f17755b, this.f17756c, this.f17757d, this.f17758e, this.f17759f, this.f17760g, this.f17761h, this.f17762i, this.f17763j, this.f17764k, this.f17765l, this.f17766m, this.f17767n, this.f17768o, this.f17770q, this.f17771r, this.f17772s, this.f17773t, z10);
    }

    public n0 j(H h10) {
        return new n0(h10, this.f17755b, this.f17756c, this.f17757d, this.f17758e, this.f17759f, this.f17760g, this.f17761h, this.f17762i, this.f17763j, this.f17764k, this.f17765l, this.f17766m, this.f17767n, this.f17768o, this.f17770q, this.f17771r, this.f17772s, this.f17773t, this.f17769p);
    }

    public long m() {
        long j10;
        long j11;
        if (!n()) {
            return this.f17772s;
        }
        do {
            j10 = this.f17773t;
            j11 = this.f17772s;
        } while (j10 != this.f17773t);
        return L.L0(L.h1(j11) + ((long) (((float) (SystemClock.elapsedRealtime() - j10)) * this.f17768o.f19709a)));
    }

    public boolean n() {
        if (this.f17758e == 3 && this.f17765l && this.f17767n == 0) {
            return true;
        }
        return false;
    }

    public void o(long j10) {
        this.f17772s = j10;
        this.f17773t = SystemClock.elapsedRealtime();
    }
}

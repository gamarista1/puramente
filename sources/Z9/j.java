package z9;

import com.google.common.collect.C4770v;
import ja.B;
import ja.C3645a;
import java.util.ArrayList;
import java.util.Arrays;
import k9.C3717q0;
import k9.L0;
import q9.C3965E;
import z9.i;

final class j extends i {

    /* renamed from: n  reason: collision with root package name */
    private a f50154n;

    /* renamed from: o  reason: collision with root package name */
    private int f50155o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f50156p;

    /* renamed from: q  reason: collision with root package name */
    private C3965E.d f50157q;

    /* renamed from: r  reason: collision with root package name */
    private C3965E.b f50158r;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final C3965E.d f50159a;

        /* renamed from: b  reason: collision with root package name */
        public final C3965E.b f50160b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f50161c;

        /* renamed from: d  reason: collision with root package name */
        public final C3965E.c[] f50162d;

        /* renamed from: e  reason: collision with root package name */
        public final int f50163e;

        public a(C3965E.d dVar, C3965E.b bVar, byte[] bArr, C3965E.c[] cVarArr, int i10) {
            this.f50159a = dVar;
            this.f50160b = bVar;
            this.f50161c = bArr;
            this.f50162d = cVarArr;
            this.f50163e = i10;
        }
    }

    j() {
    }

    static void n(B b10, long j10) {
        if (b10.b() < b10.f() + 4) {
            b10.M(Arrays.copyOf(b10.d(), b10.f() + 4));
        } else {
            b10.O(b10.f() + 4);
        }
        byte[] d10 = b10.d();
        d10[b10.f() - 4] = (byte) ((int) (j10 & 255));
        d10[b10.f() - 3] = (byte) ((int) ((j10 >>> 8) & 255));
        d10[b10.f() - 2] = (byte) ((int) ((j10 >>> 16) & 255));
        d10[b10.f() - 1] = (byte) ((int) ((j10 >>> 24) & 255));
    }

    private static int o(byte b10, a aVar) {
        if (!aVar.f50162d[p(b10, aVar.f50163e, 1)].f47814a) {
            return aVar.f50159a.f47824g;
        }
        return aVar.f50159a.f47825h;
    }

    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(B b10) {
        try {
            return C3965E.m(1, b10, true);
        } catch (L0 unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void e(long j10) {
        boolean z10;
        super.e(j10);
        int i10 = 0;
        if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50156p = z10;
        C3965E.d dVar = this.f50157q;
        if (dVar != null) {
            i10 = dVar.f47824g;
        }
        this.f50155o = i10;
    }

    /* access modifiers changed from: protected */
    public long f(B b10) {
        int i10 = 0;
        if ((b10.d()[0] & 1) == 1) {
            return -1;
        }
        int o10 = o(b10.d()[0], (a) C3645a.h(this.f50154n));
        if (this.f50156p) {
            i10 = (this.f50155o + o10) / 4;
        }
        long j10 = (long) i10;
        n(b10, j10);
        this.f50156p = true;
        this.f50155o = o10;
        return j10;
    }

    /* access modifiers changed from: protected */
    public boolean h(B b10, long j10, i.b bVar) {
        if (this.f50154n != null) {
            C3645a.e(bVar.f50152a);
            return false;
        }
        a q10 = q(b10);
        this.f50154n = q10;
        if (q10 == null) {
            return true;
        }
        C3965E.d dVar = q10.f50159a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f47827j);
        arrayList.add(q10.f50161c);
        bVar.f50152a = new C3717q0.b().e0("audio/vorbis").G(dVar.f47822e).Z(dVar.f47821d).H(dVar.f47819b).f0(dVar.f47820c).T(arrayList).X(C3965E.c(C4770v.A(q10.f50160b.f47812b))).E();
        return true;
    }

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f50154n = null;
            this.f50157q = null;
            this.f50158r = null;
        }
        this.f50155o = 0;
        this.f50156p = false;
    }

    /* access modifiers changed from: package-private */
    public a q(B b10) {
        C3965E.d dVar = this.f50157q;
        if (dVar == null) {
            this.f50157q = C3965E.k(b10);
            return null;
        }
        C3965E.b bVar = this.f50158r;
        if (bVar == null) {
            this.f50158r = C3965E.i(b10);
            return null;
        }
        byte[] bArr = new byte[b10.f()];
        System.arraycopy(b10.d(), 0, bArr, 0, b10.f());
        C3965E.c[] l10 = C3965E.l(b10, dVar.f47819b);
        return new a(dVar, bVar, bArr, l10, C3965E.a(l10.length - 1));
    }
}

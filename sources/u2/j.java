package U2;

import U2.i;
import com.google.common.collect.C4770v;
import f2.C1961B;
import f2.s;
import i2.C2073A;
import i2.C2076a;
import java.util.ArrayList;
import java.util.Arrays;
import z2.S;

final class j extends i {

    /* renamed from: n  reason: collision with root package name */
    private a f6393n;

    /* renamed from: o  reason: collision with root package name */
    private int f6394o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f6395p;

    /* renamed from: q  reason: collision with root package name */
    private S.c f6396q;

    /* renamed from: r  reason: collision with root package name */
    private S.a f6397r;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final S.c f6398a;

        /* renamed from: b  reason: collision with root package name */
        public final S.a f6399b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f6400c;

        /* renamed from: d  reason: collision with root package name */
        public final S.b[] f6401d;

        /* renamed from: e  reason: collision with root package name */
        public final int f6402e;

        public a(S.c cVar, S.a aVar, byte[] bArr, S.b[] bVarArr, int i10) {
            this.f6398a = cVar;
            this.f6399b = aVar;
            this.f6400c = bArr;
            this.f6401d = bVarArr;
            this.f6402e = i10;
        }
    }

    j() {
    }

    static void n(C2073A a10, long j10) {
        if (a10.b() < a10.g() + 4) {
            a10.R(Arrays.copyOf(a10.e(), a10.g() + 4));
        } else {
            a10.T(a10.g() + 4);
        }
        byte[] e10 = a10.e();
        e10[a10.g() - 4] = (byte) ((int) (j10 & 255));
        e10[a10.g() - 3] = (byte) ((int) ((j10 >>> 8) & 255));
        e10[a10.g() - 2] = (byte) ((int) ((j10 >>> 16) & 255));
        e10[a10.g() - 1] = (byte) ((int) ((j10 >>> 24) & 255));
    }

    private static int o(byte b10, a aVar) {
        if (!aVar.f6401d[p(b10, aVar.f6402e, 1)].f29141a) {
            return aVar.f6398a.f29151g;
        }
        return aVar.f6398a.f29152h;
    }

    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(C2073A a10) {
        try {
            return S.o(1, a10, true);
        } catch (C1961B unused) {
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
        this.f6395p = z10;
        S.c cVar = this.f6396q;
        if (cVar != null) {
            i10 = cVar.f29151g;
        }
        this.f6394o = i10;
    }

    /* access modifiers changed from: protected */
    public long f(C2073A a10) {
        int i10 = 0;
        if ((a10.e()[0] & 1) == 1) {
            return -1;
        }
        int o10 = o(a10.e()[0], (a) C2076a.i(this.f6393n));
        if (this.f6395p) {
            i10 = (this.f6394o + o10) / 4;
        }
        long j10 = (long) i10;
        n(a10, j10);
        this.f6395p = true;
        this.f6394o = o10;
        return j10;
    }

    /* access modifiers changed from: protected */
    public boolean h(C2073A a10, long j10, i.b bVar) {
        if (this.f6393n != null) {
            C2076a.e(bVar.f6391a);
            return false;
        }
        a q10 = q(a10);
        this.f6393n = q10;
        if (q10 == null) {
            return true;
        }
        S.c cVar = q10.f6398a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f29154j);
        arrayList.add(q10.f6400c);
        bVar.f6391a = new s.b().o0("audio/vorbis").M(cVar.f29149e).j0(cVar.f29148d).N(cVar.f29146b).p0(cVar.f29147c).b0(arrayList).h0(S.d(C4770v.A(q10.f6399b.f29139b))).K();
        return true;
    }

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f6393n = null;
            this.f6396q = null;
            this.f6397r = null;
        }
        this.f6394o = 0;
        this.f6395p = false;
    }

    /* access modifiers changed from: package-private */
    public a q(C2073A a10) {
        S.c cVar = this.f6396q;
        if (cVar == null) {
            this.f6396q = S.l(a10);
            return null;
        }
        S.a aVar = this.f6397r;
        if (aVar == null) {
            this.f6397r = S.j(a10);
            return null;
        }
        byte[] bArr = new byte[a10.g()];
        System.arraycopy(a10.e(), 0, bArr, 0, a10.g());
        S.b[] m10 = S.m(a10, cVar.f29146b);
        return new a(cVar, aVar, bArr, m10, S.b(m10.length - 1));
    }
}

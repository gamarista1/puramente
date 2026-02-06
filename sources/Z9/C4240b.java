package z9;

import ja.B;
import ja.C3645a;
import ja.M;
import java.util.Arrays;
import q9.l;
import q9.q;
import q9.r;
import q9.s;
import q9.t;
import q9.z;
import z9.i;

/* renamed from: z9.b  reason: case insensitive filesystem */
final class C4240b extends i {

    /* renamed from: n  reason: collision with root package name */
    private t f50110n;

    /* renamed from: o  reason: collision with root package name */
    private a f50111o;

    /* renamed from: z9.b$a */
    private static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        private t f50112a;

        /* renamed from: b  reason: collision with root package name */
        private t.a f50113b;

        /* renamed from: c  reason: collision with root package name */
        private long f50114c = -1;

        /* renamed from: d  reason: collision with root package name */
        private long f50115d = -1;

        public a(t tVar, t.a aVar) {
            this.f50112a = tVar;
            this.f50113b = aVar;
        }

        public long a(l lVar) {
            long j10 = this.f50115d;
            if (j10 < 0) {
                return -1;
            }
            long j11 = -(j10 + 2);
            this.f50115d = -1;
            return j11;
        }

        public z b() {
            boolean z10;
            if (this.f50114c != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3645a.f(z10);
            return new s(this.f50112a, this.f50114c);
        }

        public void c(long j10) {
            long[] jArr = this.f50113b.f47908a;
            this.f50115d = jArr[M.i(jArr, j10, true, true)];
        }

        public void d(long j10) {
            this.f50114c = j10;
        }
    }

    C4240b() {
    }

    private int n(B b10) {
        int i10 = (b10.d()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            b10.Q(4);
            b10.K();
        }
        int j10 = q.j(b10, i10);
        b10.P(0);
        return j10;
    }

    private static boolean o(byte[] bArr) {
        if (bArr[0] == -1) {
            return true;
        }
        return false;
    }

    public static boolean p(B b10) {
        if (b10.a() >= 5 && b10.D() == 127 && b10.F() == 1179402563) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public long f(B b10) {
        if (!o(b10.d())) {
            return -1;
        }
        return (long) n(b10);
    }

    /* access modifiers changed from: protected */
    public boolean h(B b10, long j10, i.b bVar) {
        byte[] d10 = b10.d();
        t tVar = this.f50110n;
        if (tVar == null) {
            t tVar2 = new t(d10, 17);
            this.f50110n = tVar2;
            bVar.f50152a = tVar2.g(Arrays.copyOfRange(d10, 9, b10.f()), (D9.a) null);
            return true;
        } else if ((d10[0] & Byte.MAX_VALUE) == 3) {
            t.a f10 = r.f(b10);
            t b11 = tVar.b(f10);
            this.f50110n = b11;
            this.f50111o = new a(b11, f10);
            return true;
        } else if (!o(d10)) {
            return true;
        } else {
            a aVar = this.f50111o;
            if (aVar != null) {
                aVar.d(j10);
                bVar.f50153b = this.f50111o;
            }
            C3645a.e(bVar.f50152a);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f50110n = null;
            this.f50111o = null;
        }
    }
}

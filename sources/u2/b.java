package U2;

import U2.i;
import f2.z;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import java.util.Arrays;
import z2.C2973q;
import z2.J;
import z2.v;
import z2.w;
import z2.x;
import z2.y;

final class b extends i {

    /* renamed from: n  reason: collision with root package name */
    private y f6349n;

    /* renamed from: o  reason: collision with root package name */
    private a f6350o;

    private static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        private y f6351a;

        /* renamed from: b  reason: collision with root package name */
        private y.a f6352b;

        /* renamed from: c  reason: collision with root package name */
        private long f6353c = -1;

        /* renamed from: d  reason: collision with root package name */
        private long f6354d = -1;

        public a(y yVar, y.a aVar) {
            this.f6351a = yVar;
            this.f6352b = aVar;
        }

        public long a(C2973q qVar) {
            long j10 = this.f6354d;
            if (j10 < 0) {
                return -1;
            }
            long j11 = -(j10 + 2);
            this.f6354d = -1;
            return j11;
        }

        public J b() {
            boolean z10;
            if (this.f6353c != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.g(z10);
            return new x(this.f6351a, this.f6353c);
        }

        public void c(long j10) {
            long[] jArr = this.f6352b.f29293a;
            this.f6354d = jArr[L.g(jArr, j10, true, true)];
        }

        public void d(long j10) {
            this.f6353c = j10;
        }
    }

    b() {
    }

    private int n(C2073A a10) {
        int i10 = (a10.e()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            a10.V(4);
            a10.O();
        }
        int j10 = v.j(a10, i10);
        a10.U(0);
        return j10;
    }

    private static boolean o(byte[] bArr) {
        if (bArr[0] == -1) {
            return true;
        }
        return false;
    }

    public static boolean p(C2073A a10) {
        if (a10.a() >= 5 && a10.H() == 127 && a10.J() == 1179402563) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public long f(C2073A a10) {
        if (!o(a10.e())) {
            return -1;
        }
        return (long) n(a10);
    }

    /* access modifiers changed from: protected */
    public boolean h(C2073A a10, long j10, i.b bVar) {
        byte[] e10 = a10.e();
        y yVar = this.f6349n;
        if (yVar == null) {
            y yVar2 = new y(e10, 17);
            this.f6349n = yVar2;
            bVar.f6391a = yVar2.g(Arrays.copyOfRange(e10, 9, a10.g()), (z) null);
            return true;
        } else if ((e10[0] & Byte.MAX_VALUE) == 3) {
            y.a f10 = w.f(a10);
            y b10 = yVar.b(f10);
            this.f6349n = b10;
            this.f6350o = new a(b10, f10);
            return true;
        } else if (!o(e10)) {
            return true;
        } else {
            a aVar = this.f6350o;
            if (aVar != null) {
                aVar.d(j10);
                bVar.f6392b = this.f6350o;
            }
            C2076a.e(bVar.f6391a);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f6349n = null;
            this.f6350o = null;
        }
    }
}

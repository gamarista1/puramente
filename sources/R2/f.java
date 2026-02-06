package R2;

import i2.C2073A;
import z2.C2973q;

final class f {

    /* renamed from: a  reason: collision with root package name */
    private final C2073A f5806a = new C2073A(8);

    /* renamed from: b  reason: collision with root package name */
    private int f5807b;

    private long a(C2973q qVar) {
        int i10 = 0;
        qVar.l(this.f5806a.e(), 0, 1);
        byte b10 = this.f5806a.e()[0] & 255;
        if (b10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((b10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = b10 & (~i11);
        qVar.l(this.f5806a.e(), 1, i12);
        while (i10 < i12) {
            i10++;
            i13 = (this.f5806a.e()[i10] & 255) + (i13 << 8);
        }
        this.f5807b += i12 + 1;
        return (long) i13;
    }

    public boolean b(C2973q qVar) {
        long a10;
        int i10;
        long a11 = qVar.a();
        int i11 = (a11 > -1 ? 1 : (a11 == -1 ? 0 : -1));
        long j10 = 1024;
        if (i11 != 0 && a11 <= 1024) {
            j10 = a11;
        }
        int i12 = (int) j10;
        qVar.l(this.f5806a.e(), 0, 4);
        long J10 = this.f5806a.J();
        this.f5807b = 4;
        while (J10 != 440786851) {
            int i13 = this.f5807b + 1;
            this.f5807b = i13;
            if (i13 == i12) {
                return false;
            }
            qVar.l(this.f5806a.e(), 0, 1);
            J10 = ((J10 << 8) & -256) | ((long) (this.f5806a.e()[0] & 255));
        }
        long a12 = a(qVar);
        long j11 = (long) this.f5807b;
        if (a12 == Long.MIN_VALUE) {
            return false;
        }
        if (i11 != 0 && j11 + a12 >= a11) {
            return false;
        }
        while (true) {
            int i14 = this.f5807b;
            long j12 = j11 + a12;
            if (((long) i14) < j12) {
                if (a(qVar) != Long.MIN_VALUE && a10 >= 0 && a10 <= 2147483647L) {
                    if (i10 != 0) {
                        int a13 = (int) (a10 = a(qVar));
                        qVar.h(a13);
                        this.f5807b += a13;
                    }
                }
            } else if (((long) i14) == j12) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

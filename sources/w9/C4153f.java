package w9;

import ja.B;
import q9.l;

/* renamed from: w9.f  reason: case insensitive filesystem */
final class C4153f {

    /* renamed from: a  reason: collision with root package name */
    private final B f49351a = new B(8);

    /* renamed from: b  reason: collision with root package name */
    private int f49352b;

    private long a(l lVar) {
        int i10 = 0;
        lVar.l(this.f49351a.d(), 0, 1);
        byte b10 = this.f49351a.d()[0] & 255;
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
        lVar.l(this.f49351a.d(), 1, i12);
        while (i10 < i12) {
            i10++;
            i13 = (this.f49351a.d()[i10] & 255) + (i13 << 8);
        }
        this.f49352b += i12 + 1;
        return (long) i13;
    }

    public boolean b(l lVar) {
        long a10;
        int i10;
        long a11 = lVar.a();
        int i11 = (a11 > -1 ? 1 : (a11 == -1 ? 0 : -1));
        long j10 = 1024;
        if (i11 != 0 && a11 <= 1024) {
            j10 = a11;
        }
        int i12 = (int) j10;
        lVar.l(this.f49351a.d(), 0, 4);
        long F10 = this.f49351a.F();
        this.f49352b = 4;
        while (F10 != 440786851) {
            int i13 = this.f49352b + 1;
            this.f49352b = i13;
            if (i13 == i12) {
                return false;
            }
            lVar.l(this.f49351a.d(), 0, 1);
            F10 = ((F10 << 8) & -256) | ((long) (this.f49351a.d()[0] & 255));
        }
        long a12 = a(lVar);
        long j11 = (long) this.f49352b;
        if (a12 == Long.MIN_VALUE) {
            return false;
        }
        if (i11 != 0 && j11 + a12 >= a11) {
            return false;
        }
        while (true) {
            int i14 = this.f49352b;
            long j12 = j11 + a12;
            if (((long) i14) < j12) {
                if (a(lVar) != Long.MIN_VALUE && a10 >= 0 && a10 <= 2147483647L) {
                    if (i10 != 0) {
                        int a13 = (int) (a10 = a(lVar));
                        lVar.h(a13);
                        this.f49352b += a13;
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

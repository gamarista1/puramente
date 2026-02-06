package P9;

import N9.L;
import P9.g;
import ja.s;
import q9.C3962B;
import q9.j;

public final class c implements g.b {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f33580a;

    /* renamed from: b  reason: collision with root package name */
    private final L[] f33581b;

    public c(int[] iArr, L[] lArr) {
        this.f33580a = iArr;
        this.f33581b = lArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f33581b.length];
        int i10 = 0;
        while (true) {
            L[] lArr = this.f33581b;
            if (i10 >= lArr.length) {
                return iArr;
            }
            iArr[i10] = lArr[i10].G();
            i10++;
        }
    }

    public void b(long j10) {
        for (L a02 : this.f33581b) {
            a02.a0(j10);
        }
    }

    public C3962B d(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f33580a;
            if (i12 >= iArr.length) {
                s.c("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new j();
            } else if (i11 == iArr[i12]) {
                return this.f33581b[i12];
            } else {
                i12++;
            }
        }
    }
}

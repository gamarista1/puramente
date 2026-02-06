package w9;

import q9.l;

/* renamed from: w9.g  reason: case insensitive filesystem */
final class C4154g {

    /* renamed from: d  reason: collision with root package name */
    private static final long[] f49353d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f49354a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private int f49355b;

    /* renamed from: c  reason: collision with root package name */
    private int f49356c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f49353d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f49353d;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & ((long) i10)) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public int b() {
        return this.f49356c;
    }

    public long d(l lVar, boolean z10, boolean z11, int i10) {
        if (this.f49355b == 0) {
            if (!lVar.f(this.f49354a, 0, 1, z10)) {
                return -1;
            }
            int c10 = c(this.f49354a[0] & 255);
            this.f49356c = c10;
            if (c10 != -1) {
                this.f49355b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i11 = this.f49356c;
        if (i11 > i10) {
            this.f49355b = 0;
            return -2;
        }
        if (i11 != 1) {
            lVar.readFully(this.f49354a, 1, i11 - 1);
        }
        this.f49355b = 0;
        return a(this.f49354a, this.f49356c, z11);
    }

    public void e() {
        this.f49355b = 0;
        this.f49356c = 0;
    }
}

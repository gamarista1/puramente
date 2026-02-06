package R2;

import z2.C2973q;

final class g {

    /* renamed from: d  reason: collision with root package name */
    private static final long[] f5808d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f5809a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private int f5810b;

    /* renamed from: c  reason: collision with root package name */
    private int f5811c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f5808d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f5808d;
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
        return this.f5811c;
    }

    public long d(C2973q qVar, boolean z10, boolean z11, int i10) {
        if (this.f5810b == 0) {
            if (!qVar.f(this.f5809a, 0, 1, z10)) {
                return -1;
            }
            int c10 = c(this.f5809a[0] & 255);
            this.f5811c = c10;
            if (c10 != -1) {
                this.f5810b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i11 = this.f5811c;
        if (i11 > i10) {
            this.f5810b = 0;
            return -2;
        }
        if (i11 != 1) {
            qVar.readFully(this.f5809a, 1, i11 - 1);
        }
        this.f5810b = 0;
        return a(this.f5809a, this.f5811c, z11);
    }

    public void e() {
        this.f5810b = 0;
        this.f5811c = 0;
    }
}

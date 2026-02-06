package z2;

import i2.L;
import java.util.Arrays;
import z2.J;

/* renamed from: z2.g  reason: case insensitive filesystem */
public final class C2963g implements J {

    /* renamed from: a  reason: collision with root package name */
    public final int f29214a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f29215b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f29216c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f29217d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f29218e;

    /* renamed from: f  reason: collision with root package name */
    private final long f29219f;

    public C2963g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f29215b = iArr;
        this.f29216c = jArr;
        this.f29217d = jArr2;
        this.f29218e = jArr3;
        int length = iArr.length;
        this.f29214a = length;
        if (length > 0) {
            this.f29219f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f29219f = 0;
        }
    }

    public int a(long j10) {
        return L.g(this.f29218e, j10, true, true);
    }

    public J.a c(long j10) {
        int a10 = a(j10);
        K k10 = new K(this.f29218e[a10], this.f29216c[a10]);
        if (k10.f29112a >= j10 || a10 == this.f29214a - 1) {
            return new J.a(k10);
        }
        int i10 = a10 + 1;
        return new J.a(k10, new K(this.f29218e[i10], this.f29216c[i10]));
    }

    public boolean e() {
        return true;
    }

    public long g() {
        return this.f29219f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f29214a + ", sizes=" + Arrays.toString(this.f29215b) + ", offsets=" + Arrays.toString(this.f29216c) + ", timeUs=" + Arrays.toString(this.f29218e) + ", durationsUs=" + Arrays.toString(this.f29217d) + ")";
    }
}

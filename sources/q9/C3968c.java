package q9;

import ja.M;
import java.util.Arrays;
import q9.z;

/* renamed from: q9.c  reason: case insensitive filesystem */
public final class C3968c implements z {

    /* renamed from: a  reason: collision with root package name */
    public final int f47851a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f47852b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f47853c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f47854d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f47855e;

    /* renamed from: f  reason: collision with root package name */
    private final long f47856f;

    public C3968c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f47852b = iArr;
        this.f47853c = jArr;
        this.f47854d = jArr2;
        this.f47855e = jArr3;
        int length = iArr.length;
        this.f47851a = length;
        if (length > 0) {
            this.f47856f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f47856f = 0;
        }
    }

    public int a(long j10) {
        return M.i(this.f47855e, j10, true, true);
    }

    public z.a c(long j10) {
        int a10 = a(j10);
        C3961A a11 = new C3961A(this.f47855e[a10], this.f47853c[a10]);
        if (a11.f47789a >= j10 || a10 == this.f47851a - 1) {
            return new z.a(a11);
        }
        int i10 = a10 + 1;
        return new z.a(a11, new C3961A(this.f47855e[i10], this.f47853c[i10]));
    }

    public boolean e() {
        return true;
    }

    public long g() {
        return this.f47856f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f47851a + ", sizes=" + Arrays.toString(this.f47852b) + ", offsets=" + Arrays.toString(this.f47853c) + ", timeUs=" + Arrays.toString(this.f47855e) + ", durationsUs=" + Arrays.toString(this.f47854d) + ")";
    }
}

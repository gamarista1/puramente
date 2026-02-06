package g0;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final int f20860a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f20861b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f20862c;

    public h(int i10, long[] jArr, Object[] objArr) {
        this.f20860a = i10;
        this.f20861b = jArr;
        this.f20862c = objArr;
    }

    private final int a(long j10) {
        int i10 = this.f20860a - 1;
        if (i10 == -1) {
            return -1;
        }
        int i11 = 0;
        if (i10 != 0) {
            while (i11 <= i10) {
                int i12 = (i11 + i10) >>> 1;
                int i13 = ((this.f20861b[i12] - j10) > 0 ? 1 : ((this.f20861b[i12] - j10) == 0 ? 0 : -1));
                if (i13 < 0) {
                    i11 = i12 + 1;
                } else if (i13 <= 0) {
                    return i12;
                } else {
                    i10 = i12 - 1;
                }
            }
            return -(i11 + 1);
        }
        long j11 = this.f20861b[0];
        if (j11 == j10) {
            return 0;
        }
        if (j11 > j10) {
            return -2;
        }
        return -1;
    }

    public final Object b(long j10) {
        int a10 = a(j10);
        if (a10 >= 0) {
            return this.f20862c[a10];
        }
        return null;
    }

    public final h c(long j10, Object obj) {
        int i10 = this.f20860a;
        int i11 = 0;
        int i12 = 0;
        for (Object obj2 : this.f20862c) {
            if (obj2 != null) {
                i12++;
            }
        }
        int i13 = i12 + 1;
        long[] jArr = new long[i13];
        Object[] objArr = new Object[i13];
        if (i13 > 1) {
            int i14 = 0;
            while (true) {
                if (i11 >= i13 || i14 >= i10) {
                    break;
                }
                long j11 = this.f20861b[i14];
                Object obj3 = this.f20862c[i14];
                if (j11 > j10) {
                    jArr[i11] = j10;
                    objArr[i11] = obj;
                    i11++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i11] = j11;
                    objArr[i11] = obj3;
                    i11++;
                }
                i14++;
            }
            if (i14 == i10) {
                jArr[i12] = j10;
                objArr[i12] = obj;
            } else {
                while (i11 < i13) {
                    long j12 = this.f20861b[i14];
                    Object obj4 = this.f20862c[i14];
                    if (obj4 != null) {
                        jArr[i11] = j12;
                        objArr[i11] = obj4;
                        i11++;
                    }
                    i14++;
                }
            }
        } else {
            jArr[0] = j10;
            objArr[0] = obj;
        }
        return new h(i13, jArr, objArr);
    }

    public final boolean d(long j10, Object obj) {
        int a10 = a(j10);
        if (a10 < 0) {
            return false;
        }
        this.f20862c[a10] = obj;
        return true;
    }
}

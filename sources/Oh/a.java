package Oh;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal f64539b = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    private boolean f64540a = true;

    public a a(byte b10, byte b11) {
        boolean z10;
        if (!this.f64540a) {
            return this;
        }
        if (b10 == b11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f64540a = z10;
        return this;
    }

    public a b(char c10, char c11) {
        boolean z10;
        if (!this.f64540a) {
            return this;
        }
        if (c10 == c11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f64540a = z10;
        return this;
    }

    public a c(double d10, double d11) {
        if (!this.f64540a) {
            return this;
        }
        return f(Double.doubleToLongBits(d10), Double.doubleToLongBits(d11));
    }

    public a d(float f10, float f11) {
        if (!this.f64540a) {
            return this;
        }
        return e(Float.floatToIntBits(f10), Float.floatToIntBits(f11));
    }

    public a e(int i10, int i11) {
        boolean z10;
        if (!this.f64540a) {
            return this;
        }
        if (i10 == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f64540a = z10;
        return this;
    }

    public a f(long j10, long j11) {
        boolean z10;
        if (!this.f64540a) {
            return this;
        }
        if (j10 == j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f64540a = z10;
        return this;
    }

    public a g(Object obj, Object obj2) {
        if (!this.f64540a || obj == obj2) {
            return this;
        }
        if (obj == null || obj2 == null) {
            t(false);
            return this;
        }
        if (!obj.getClass().isArray()) {
            this.f64540a = obj.equals(obj2);
        } else if (obj.getClass() != obj2.getClass()) {
            t(false);
        } else if (obj instanceof long[]) {
            o((long[]) obj, (long[]) obj2);
        } else if (obj instanceof int[]) {
            n((int[]) obj, (int[]) obj2);
        } else if (obj instanceof short[]) {
            q((short[]) obj, (short[]) obj2);
        } else if (obj instanceof char[]) {
            k((char[]) obj, (char[]) obj2);
        } else if (obj instanceof byte[]) {
            j((byte[]) obj, (byte[]) obj2);
        } else if (obj instanceof double[]) {
            l((double[]) obj, (double[]) obj2);
        } else if (obj instanceof float[]) {
            m((float[]) obj, (float[]) obj2);
        } else if (obj instanceof boolean[]) {
            r((boolean[]) obj, (boolean[]) obj2);
        } else {
            p((Object[]) obj, (Object[]) obj2);
        }
        return this;
    }

    public a h(short s10, short s11) {
        boolean z10;
        if (!this.f64540a) {
            return this;
        }
        if (s10 == s11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f64540a = z10;
        return this;
    }

    public a i(boolean z10, boolean z11) {
        boolean z12;
        if (!this.f64540a) {
            return this;
        }
        if (z10 == z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f64540a = z12;
        return this;
    }

    public a j(byte[] bArr, byte[] bArr2) {
        if (!this.f64540a || bArr == bArr2) {
            return this;
        }
        if (bArr == null || bArr2 == null) {
            t(false);
            return this;
        } else if (bArr.length != bArr2.length) {
            t(false);
            return this;
        } else {
            for (int i10 = 0; i10 < bArr.length && this.f64540a; i10++) {
                a(bArr[i10], bArr2[i10]);
            }
            return this;
        }
    }

    public a k(char[] cArr, char[] cArr2) {
        if (!this.f64540a || cArr == cArr2) {
            return this;
        }
        if (cArr == null || cArr2 == null) {
            t(false);
            return this;
        } else if (cArr.length != cArr2.length) {
            t(false);
            return this;
        } else {
            for (int i10 = 0; i10 < cArr.length && this.f64540a; i10++) {
                b(cArr[i10], cArr2[i10]);
            }
            return this;
        }
    }

    public a l(double[] dArr, double[] dArr2) {
        if (!this.f64540a || dArr == dArr2) {
            return this;
        }
        if (dArr == null || dArr2 == null) {
            t(false);
            return this;
        } else if (dArr.length != dArr2.length) {
            t(false);
            return this;
        } else {
            for (int i10 = 0; i10 < dArr.length && this.f64540a; i10++) {
                c(dArr[i10], dArr2[i10]);
            }
            return this;
        }
    }

    public a m(float[] fArr, float[] fArr2) {
        if (!this.f64540a || fArr == fArr2) {
            return this;
        }
        if (fArr == null || fArr2 == null) {
            t(false);
            return this;
        } else if (fArr.length != fArr2.length) {
            t(false);
            return this;
        } else {
            for (int i10 = 0; i10 < fArr.length && this.f64540a; i10++) {
                d(fArr[i10], fArr2[i10]);
            }
            return this;
        }
    }

    public a n(int[] iArr, int[] iArr2) {
        if (!this.f64540a || iArr == iArr2) {
            return this;
        }
        if (iArr == null || iArr2 == null) {
            t(false);
            return this;
        } else if (iArr.length != iArr2.length) {
            t(false);
            return this;
        } else {
            for (int i10 = 0; i10 < iArr.length && this.f64540a; i10++) {
                e(iArr[i10], iArr2[i10]);
            }
            return this;
        }
    }

    public a o(long[] jArr, long[] jArr2) {
        if (!this.f64540a || jArr == jArr2) {
            return this;
        }
        if (jArr == null || jArr2 == null) {
            t(false);
            return this;
        } else if (jArr.length != jArr2.length) {
            t(false);
            return this;
        } else {
            for (int i10 = 0; i10 < jArr.length && this.f64540a; i10++) {
                f(jArr[i10], jArr2[i10]);
            }
            return this;
        }
    }

    public a p(Object[] objArr, Object[] objArr2) {
        if (!this.f64540a || objArr == objArr2) {
            return this;
        }
        if (objArr == null || objArr2 == null) {
            t(false);
            return this;
        } else if (objArr.length != objArr2.length) {
            t(false);
            return this;
        } else {
            for (int i10 = 0; i10 < objArr.length && this.f64540a; i10++) {
                g(objArr[i10], objArr2[i10]);
            }
            return this;
        }
    }

    public a q(short[] sArr, short[] sArr2) {
        if (!this.f64540a || sArr == sArr2) {
            return this;
        }
        if (sArr == null || sArr2 == null) {
            t(false);
            return this;
        } else if (sArr.length != sArr2.length) {
            t(false);
            return this;
        } else {
            for (int i10 = 0; i10 < sArr.length && this.f64540a; i10++) {
                h(sArr[i10], sArr2[i10]);
            }
            return this;
        }
    }

    public a r(boolean[] zArr, boolean[] zArr2) {
        if (!this.f64540a || zArr == zArr2) {
            return this;
        }
        if (zArr == null || zArr2 == null) {
            t(false);
            return this;
        } else if (zArr.length != zArr2.length) {
            t(false);
            return this;
        } else {
            for (int i10 = 0; i10 < zArr.length && this.f64540a; i10++) {
                i(zArr[i10], zArr2[i10]);
            }
            return this;
        }
    }

    public boolean s() {
        return this.f64540a;
    }

    /* access modifiers changed from: protected */
    public void t(boolean z10) {
        this.f64540a = z10;
    }
}

package Oh;

public class b {

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadLocal f64541c = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    private final int f64542a = 37;

    /* renamed from: b  reason: collision with root package name */
    private int f64543b = 17;

    public b a(byte b10) {
        this.f64543b = (this.f64543b * this.f64542a) + b10;
        return this;
    }

    public b b(char c10) {
        this.f64543b = (this.f64543b * this.f64542a) + c10;
        return this;
    }

    public b c(double d10) {
        return f(Double.doubleToLongBits(d10));
    }

    public b d(float f10) {
        this.f64543b = (this.f64543b * this.f64542a) + Float.floatToIntBits(f10);
        return this;
    }

    public b e(int i10) {
        this.f64543b = (this.f64543b * this.f64542a) + i10;
        return this;
    }

    public b f(long j10) {
        this.f64543b = (this.f64543b * this.f64542a) + ((int) (j10 ^ (j10 >> 32)));
        return this;
    }

    public b g(Object obj) {
        if (obj == null) {
            this.f64543b *= this.f64542a;
        } else if (!obj.getClass().isArray()) {
            this.f64543b = (this.f64543b * this.f64542a) + obj.hashCode();
        } else if (obj instanceof long[]) {
            o((long[]) obj);
        } else if (obj instanceof int[]) {
            n((int[]) obj);
        } else if (obj instanceof short[]) {
            q((short[]) obj);
        } else if (obj instanceof char[]) {
            k((char[]) obj);
        } else if (obj instanceof byte[]) {
            j((byte[]) obj);
        } else if (obj instanceof double[]) {
            l((double[]) obj);
        } else if (obj instanceof float[]) {
            m((float[]) obj);
        } else if (obj instanceof boolean[]) {
            r((boolean[]) obj);
        } else {
            p((Object[]) obj);
        }
        return this;
    }

    public b h(short s10) {
        this.f64543b = (this.f64543b * this.f64542a) + s10;
        return this;
    }

    public int hashCode() {
        return s();
    }

    public b i(boolean z10) {
        this.f64543b = (this.f64543b * this.f64542a) + (z10 ^ true ? 1 : 0);
        return this;
    }

    public b j(byte[] bArr) {
        if (bArr == null) {
            this.f64543b *= this.f64542a;
        } else {
            for (byte a10 : bArr) {
                a(a10);
            }
        }
        return this;
    }

    public b k(char[] cArr) {
        if (cArr == null) {
            this.f64543b *= this.f64542a;
        } else {
            for (char b10 : cArr) {
                b(b10);
            }
        }
        return this;
    }

    public b l(double[] dArr) {
        if (dArr == null) {
            this.f64543b *= this.f64542a;
        } else {
            for (double c10 : dArr) {
                c(c10);
            }
        }
        return this;
    }

    public b m(float[] fArr) {
        if (fArr == null) {
            this.f64543b *= this.f64542a;
        } else {
            for (float d10 : fArr) {
                d(d10);
            }
        }
        return this;
    }

    public b n(int[] iArr) {
        if (iArr == null) {
            this.f64543b *= this.f64542a;
        } else {
            for (int e10 : iArr) {
                e(e10);
            }
        }
        return this;
    }

    public b o(long[] jArr) {
        if (jArr == null) {
            this.f64543b *= this.f64542a;
        } else {
            for (long f10 : jArr) {
                f(f10);
            }
        }
        return this;
    }

    public b p(Object[] objArr) {
        if (objArr == null) {
            this.f64543b *= this.f64542a;
        } else {
            for (Object g10 : objArr) {
                g(g10);
            }
        }
        return this;
    }

    public b q(short[] sArr) {
        if (sArr == null) {
            this.f64543b *= this.f64542a;
        } else {
            for (short h10 : sArr) {
                h(h10);
            }
        }
        return this;
    }

    public b r(boolean[] zArr) {
        if (zArr == null) {
            this.f64543b *= this.f64542a;
        } else {
            for (boolean i10 : zArr) {
                i(i10);
            }
        }
        return this;
    }

    public int s() {
        return this.f64543b;
    }
}

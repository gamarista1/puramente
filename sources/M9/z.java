package m9;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.common.primitives.f;
import ja.M;
import m9.y;

public class z implements y.d {

    /* renamed from: b  reason: collision with root package name */
    protected final int f46836b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f46837c;

    /* renamed from: d  reason: collision with root package name */
    protected final int f46838d;

    /* renamed from: e  reason: collision with root package name */
    protected final int f46839e;

    /* renamed from: f  reason: collision with root package name */
    protected final int f46840f;

    /* renamed from: g  reason: collision with root package name */
    public final int f46841g;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f46842a = 250000;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f46843b = 750000;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f46844c = 4;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f46845d = 250000;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f46846e = 50000000;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f46847f = 2;

        public z g() {
            return new z(this);
        }
    }

    protected z(a aVar) {
        this.f46836b = aVar.f46842a;
        this.f46837c = aVar.f46843b;
        this.f46838d = aVar.f46844c;
        this.f46839e = aVar.f46845d;
        this.f46840f = aVar.f46846e;
        this.f46841g = aVar.f46847f;
    }

    protected static int b(int i10, int i11, int i12) {
        return f.d(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    protected static int d(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case StdKeyDeserializer.TYPE_URL:
                return 3062500;
            case StdKeyDeserializer.TYPE_CLASS:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            default:
                throw new IllegalArgumentException();
        }
    }

    public int a(int i10, int i11, int i12, int i13, int i14, double d10) {
        return (((Math.max(i10, (int) (((double) c(i10, i11, i12, i13, i14)) * d10)) + i13) - 1) / i13) * i13;
    }

    /* access modifiers changed from: protected */
    public int c(int i10, int i11, int i12, int i13, int i14) {
        if (i12 == 0) {
            return g(i10, i14, i13);
        }
        if (i12 == 1) {
            return e(i11);
        }
        if (i12 == 2) {
            return f(i11);
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    public int e(int i10) {
        return f.d((((long) this.f46840f) * ((long) d(i10))) / 1000000);
    }

    /* access modifiers changed from: protected */
    public int f(int i10) {
        int i11 = this.f46839e;
        if (i10 == 5) {
            i11 *= this.f46841g;
        }
        return f.d((((long) i11) * ((long) d(i10))) / 1000000);
    }

    /* access modifiers changed from: protected */
    public int g(int i10, int i11, int i12) {
        return M.q(i10 * this.f46838d, b(this.f46836b, i11, i12), b(this.f46837c, i11, i12));
    }
}

package o2;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.common.primitives.f;
import i2.L;
import o2.M;

public class V implements M.e {

    /* renamed from: b  reason: collision with root package name */
    protected final int f24930b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f24931c;

    /* renamed from: d  reason: collision with root package name */
    protected final int f24932d;

    /* renamed from: e  reason: collision with root package name */
    protected final int f24933e;

    /* renamed from: f  reason: collision with root package name */
    protected final int f24934f;

    /* renamed from: g  reason: collision with root package name */
    public final int f24935g;

    /* renamed from: h  reason: collision with root package name */
    public final int f24936h;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f24937a = 250000;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f24938b = 750000;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f24939c = 4;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f24940d = 250000;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f24941e = 50000000;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f24942f = 2;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f24943g = 4;

        public V h() {
            return new V(this);
        }
    }

    protected V(a aVar) {
        this.f24930b = aVar.f24937a;
        this.f24931c = aVar.f24938b;
        this.f24932d = aVar.f24939c;
        this.f24933e = aVar.f24940d;
        this.f24934f = aVar.f24941e;
        this.f24935g = aVar.f24942f;
        this.f24936h = aVar.f24943g;
    }

    protected static int b(int i10, int i11, int i12) {
        return f.d(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    protected static int d(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
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
            default:
                switch (i10) {
                    case StdKeyDeserializer.TYPE_URL /*14*/:
                        return 3062500;
                    case StdKeyDeserializer.TYPE_CLASS /*15*/:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        return (((Math.max(i10, (int) (((double) c(i10, i11, i12, i13, i14, i15)) * d10)) + i13) - 1) / i13) * i13;
    }

    /* access modifiers changed from: protected */
    public int c(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 0) {
            return g(i10, i14, i13);
        }
        if (i12 == 1) {
            return e(i11);
        }
        if (i12 == 2) {
            return f(i11, i15);
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    public int e(int i10) {
        return f.d((((long) this.f24934f) * ((long) d(i10))) / 1000000);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0013  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.f24933e
            r1 = 5
            r2 = 8
            if (r4 != r1) goto L_0x000b
            int r1 = r3.f24935g
        L_0x0009:
            int r0 = r0 * r1
            goto L_0x0010
        L_0x000b:
            if (r4 != r2) goto L_0x0010
            int r1 = r3.f24936h
            goto L_0x0009
        L_0x0010:
            r1 = -1
            if (r5 == r1) goto L_0x001a
            java.math.RoundingMode r4 = java.math.RoundingMode.CEILING
            int r4 = pb.d.b(r5, r2, r4)
            goto L_0x001e
        L_0x001a:
            int r4 = d(r4)
        L_0x001e:
            long r0 = (long) r0
            long r4 = (long) r4
            long r0 = r0 * r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r4
            int r4 = com.google.common.primitives.f.d(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.V.f(int, int):int");
    }

    /* access modifiers changed from: protected */
    public int g(int i10, int i11, int i12) {
        return L.o(i10 * this.f24932d, b(this.f24930b, i11, i12), b(this.f24931c, i11, i12));
    }
}

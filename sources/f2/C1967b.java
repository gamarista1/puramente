package f2;

import android.net.Uri;
import f2.w;
import i2.C2076a;
import i2.L;
import java.util.Arrays;

/* renamed from: f2.b  reason: case insensitive filesystem */
public final class C1967b {

    /* renamed from: g  reason: collision with root package name */
    public static final C1967b f19921g = new C1967b((Object) null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h  reason: collision with root package name */
    private static final a f19922h = new a(0).i(0);

    /* renamed from: i  reason: collision with root package name */
    private static final String f19923i = L.y0(1);

    /* renamed from: j  reason: collision with root package name */
    private static final String f19924j = L.y0(2);

    /* renamed from: k  reason: collision with root package name */
    private static final String f19925k = L.y0(3);

    /* renamed from: l  reason: collision with root package name */
    private static final String f19926l = L.y0(4);

    /* renamed from: a  reason: collision with root package name */
    public final Object f19927a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19928b;

    /* renamed from: c  reason: collision with root package name */
    public final long f19929c;

    /* renamed from: d  reason: collision with root package name */
    public final long f19930d;

    /* renamed from: e  reason: collision with root package name */
    public final int f19931e;

    /* renamed from: f  reason: collision with root package name */
    private final a[] f19932f;

    /* renamed from: f2.b$a */
    public static final class a {

        /* renamed from: j  reason: collision with root package name */
        private static final String f19933j = L.y0(0);

        /* renamed from: k  reason: collision with root package name */
        private static final String f19934k = L.y0(1);

        /* renamed from: l  reason: collision with root package name */
        private static final String f19935l = L.y0(2);

        /* renamed from: m  reason: collision with root package name */
        private static final String f19936m = L.y0(3);

        /* renamed from: n  reason: collision with root package name */
        private static final String f19937n = L.y0(4);

        /* renamed from: o  reason: collision with root package name */
        private static final String f19938o = L.y0(5);

        /* renamed from: p  reason: collision with root package name */
        private static final String f19939p = L.y0(6);

        /* renamed from: q  reason: collision with root package name */
        private static final String f19940q = L.y0(7);

        /* renamed from: r  reason: collision with root package name */
        static final String f19941r = L.y0(8);

        /* renamed from: a  reason: collision with root package name */
        public final long f19942a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19943b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19944c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri[] f19945d;

        /* renamed from: e  reason: collision with root package name */
        public final w[] f19946e;

        /* renamed from: f  reason: collision with root package name */
        public final int[] f19947f;

        /* renamed from: g  reason: collision with root package name */
        public final long[] f19948g;

        /* renamed from: h  reason: collision with root package name */
        public final long f19949h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f19950i;

        public a(long j10) {
            this(j10, -1, -1, new int[0], new w[0], new long[0], 0, false);
        }

        private static long[] b(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        private static int[] c(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* access modifiers changed from: private */
        public boolean g() {
            if (this.f19950i && this.f19942a == Long.MIN_VALUE && this.f19943b == -1) {
                return true;
            }
            return false;
        }

        public int d() {
            return e(-1);
        }

        public int e(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f19947f;
                if (i12 >= iArr.length || this.f19950i || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    return i12;
                }
                i12++;
            }
            return i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f19942a == aVar.f19942a && this.f19943b == aVar.f19943b && this.f19944c == aVar.f19944c && Arrays.equals(this.f19946e, aVar.f19946e) && Arrays.equals(this.f19947f, aVar.f19947f) && Arrays.equals(this.f19948g, aVar.f19948g) && this.f19949h == aVar.f19949h && this.f19950i == aVar.f19950i) {
                return true;
            }
            return false;
        }

        public boolean f() {
            if (this.f19943b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f19943b; i10++) {
                int i11 = this.f19947f[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean h() {
            if (this.f19943b == -1 || d() < this.f19943b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f19942a;
            long j11 = this.f19949h;
            return (((((((((((((this.f19943b * 31) + this.f19944c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f19946e)) * 31) + Arrays.hashCode(this.f19947f)) * 31) + Arrays.hashCode(this.f19948g)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f19950i ? 1 : 0);
        }

        public a i(int i10) {
            int[] c10 = c(this.f19947f, i10);
            long[] b10 = b(this.f19948g, i10);
            return new a(this.f19942a, i10, this.f19944c, c10, (w[]) Arrays.copyOf(this.f19946e, i10), b10, this.f19949h, this.f19950i);
        }

        private a(long j10, int i10, int i11, int[] iArr, w[] wVarArr, long[] jArr, long j11, boolean z10) {
            int i12 = 0;
            C2076a.a(iArr.length == wVarArr.length);
            this.f19942a = j10;
            this.f19943b = i10;
            this.f19944c = i11;
            this.f19947f = iArr;
            this.f19946e = wVarArr;
            this.f19948g = jArr;
            this.f19949h = j11;
            this.f19950i = z10;
            this.f19945d = new Uri[wVarArr.length];
            while (true) {
                Uri[] uriArr = this.f19945d;
                if (i12 < uriArr.length) {
                    w wVar = wVarArr[i12];
                    uriArr[i12] = wVar == null ? null : ((w.h) C2076a.e(wVar.f20157b)).f20249a;
                    i12++;
                } else {
                    return;
                }
            }
        }
    }

    private C1967b(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f19927a = obj;
        this.f19929c = j10;
        this.f19930d = j11;
        this.f19928b = aVarArr.length + i10;
        this.f19932f = aVarArr;
        this.f19931e = i10;
    }

    private boolean e(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        a a10 = a(i10);
        long j12 = a10.f19942a;
        if (j12 == Long.MIN_VALUE) {
            if (j11 == -9223372036854775807L || ((a10.f19950i && a10.f19943b == -1) || j10 < j11)) {
                return true;
            }
            return false;
        } else if (j10 < j12) {
            return true;
        } else {
            return false;
        }
    }

    public a a(int i10) {
        int i11 = this.f19931e;
        if (i10 < i11) {
            return f19922h;
        }
        return this.f19932f[i10 - i11];
    }

    public int b(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i10 = this.f19931e;
        while (i10 < this.f19928b && ((a(i10).f19942a != Long.MIN_VALUE && a(i10).f19942a <= j10) || !a(i10).h())) {
            i10++;
        }
        if (i10 < this.f19928b) {
            return i10;
        }
        return -1;
    }

    public int c(long j10, long j11) {
        int i10 = this.f19928b - 1;
        int i11 = i10 - (d(i10) ? 1 : 0);
        while (i11 >= 0 && e(j10, j11, i11)) {
            i11--;
        }
        if (i11 < 0 || !a(i11).f()) {
            return -1;
        }
        return i11;
    }

    public boolean d(int i10) {
        if (i10 != this.f19928b - 1 || !a(i10).g()) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1967b.class != obj.getClass()) {
            return false;
        }
        C1967b bVar = (C1967b) obj;
        if (L.c(this.f19927a, bVar.f19927a) && this.f19928b == bVar.f19928b && this.f19929c == bVar.f19929c && this.f19930d == bVar.f19930d && this.f19931e == bVar.f19931e && Arrays.equals(this.f19932f, bVar.f19932f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = this.f19928b * 31;
        Object obj = this.f19927a;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        return ((((((((i11 + i10) * 31) + ((int) this.f19929c)) * 31) + ((int) this.f19930d)) * 31) + this.f19931e) * 31) + Arrays.hashCode(this.f19932f);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f19927a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f19929c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f19932f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f19932f[i10].f19942a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f19932f[i10].f19947f.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f19932f[i10].f19947f[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f19932f[i10].f19948g[i11]);
                sb2.append(')');
                if (i11 < this.f19932f[i10].f19947f.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f19932f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}

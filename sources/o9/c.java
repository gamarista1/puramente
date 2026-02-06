package O9;

import android.net.Uri;
import android.os.Bundle;
import ja.C3645a;
import ja.M;
import java.util.ArrayList;
import java.util.Arrays;
import k9.C3700i;

public final class c implements C3700i {

    /* renamed from: g  reason: collision with root package name */
    public static final c f33398g = new c((Object) null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h  reason: collision with root package name */
    private static final a f33399h = new a(0).j(0);

    /* renamed from: i  reason: collision with root package name */
    public static final C3700i.a f33400i = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Object f33401a;

    /* renamed from: b  reason: collision with root package name */
    public final int f33402b;

    /* renamed from: c  reason: collision with root package name */
    public final long f33403c;

    /* renamed from: d  reason: collision with root package name */
    public final long f33404d;

    /* renamed from: e  reason: collision with root package name */
    public final int f33405e;

    /* renamed from: f  reason: collision with root package name */
    private final a[] f33406f;

    public static final class a implements C3700i {

        /* renamed from: h  reason: collision with root package name */
        public static final C3700i.a f33407h = new b();

        /* renamed from: a  reason: collision with root package name */
        public final long f33408a;

        /* renamed from: b  reason: collision with root package name */
        public final int f33409b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri[] f33410c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f33411d;

        /* renamed from: e  reason: collision with root package name */
        public final long[] f33412e;

        /* renamed from: f  reason: collision with root package name */
        public final long f33413f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f33414g;

        public a(long j10) {
            this(j10, -1, new int[0], new Uri[0], new long[0], 0, false);
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
        public static a d(Bundle bundle) {
            Uri[] uriArr;
            long[] jArr;
            long j10 = bundle.getLong(h(0));
            int i10 = bundle.getInt(h(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(h(2));
            int[] intArray = bundle.getIntArray(h(3));
            long[] longArray = bundle.getLongArray(h(4));
            long j11 = bundle.getLong(h(5));
            boolean z10 = bundle.getBoolean(h(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            int[] iArr = intArray;
            if (parcelableArrayList == null) {
                uriArr = new Uri[0];
            } else {
                uriArr = (Uri[]) parcelableArrayList.toArray(new Uri[0]);
            }
            if (longArray == null) {
                jArr = new long[0];
            } else {
                jArr = longArray;
            }
            return new a(j10, i10, iArr, uriArr, jArr, j11, z10);
        }

        private static String h(int i10) {
            return Integer.toString(i10, 36);
        }

        public int e() {
            return f(-1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f33408a == aVar.f33408a && this.f33409b == aVar.f33409b && Arrays.equals(this.f33410c, aVar.f33410c) && Arrays.equals(this.f33411d, aVar.f33411d) && Arrays.equals(this.f33412e, aVar.f33412e) && this.f33413f == aVar.f33413f && this.f33414g == aVar.f33414g) {
                return true;
            }
            return false;
        }

        public int f(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f33411d;
                if (i12 >= iArr.length || this.f33414g || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    return i12;
                }
                i12++;
            }
            return i12;
        }

        public boolean g() {
            if (this.f33409b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f33409b; i10++) {
                int i11 = this.f33411d[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f33408a;
            long j11 = this.f33413f;
            return (((((((((((this.f33409b * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f33410c)) * 31) + Arrays.hashCode(this.f33411d)) * 31) + Arrays.hashCode(this.f33412e)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f33414g ? 1 : 0);
        }

        public boolean i() {
            if (this.f33409b == -1 || e() < this.f33409b) {
                return true;
            }
            return false;
        }

        public a j(int i10) {
            int[] c10 = c(this.f33411d, i10);
            long[] b10 = b(this.f33412e, i10);
            return new a(this.f33408a, i10, c10, (Uri[]) Arrays.copyOf(this.f33410c, i10), b10, this.f33413f, this.f33414g);
        }

        private a(long j10, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            C3645a.a(iArr.length == uriArr.length);
            this.f33408a = j10;
            this.f33409b = i10;
            this.f33411d = iArr;
            this.f33410c = uriArr;
            this.f33412e = jArr;
            this.f33413f = j11;
            this.f33414g = z10;
        }
    }

    private c(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f33401a = obj;
        this.f33403c = j10;
        this.f33404d = j11;
        this.f33402b = aVarArr.length + i10;
        this.f33406f = aVarArr;
        this.f33405e = i10;
    }

    /* access modifiers changed from: private */
    public static c b(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(g(1));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = (a) a.f33407h.a((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        return new c((Object) null, aVarArr, bundle.getLong(g(2), 0), bundle.getLong(g(3), -9223372036854775807L), bundle.getInt(g(4)));
    }

    private boolean f(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = c(i10).f33408a;
        if (j12 == Long.MIN_VALUE) {
            if (j11 == -9223372036854775807L || j10 < j11) {
                return true;
            }
            return false;
        } else if (j10 < j12) {
            return true;
        } else {
            return false;
        }
    }

    private static String g(int i10) {
        return Integer.toString(i10, 36);
    }

    public a c(int i10) {
        int i11 = this.f33405e;
        if (i10 < i11) {
            return f33399h;
        }
        return this.f33406f[i10 - i11];
    }

    public int d(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i10 = this.f33405e;
        while (i10 < this.f33402b && ((c(i10).f33408a != Long.MIN_VALUE && c(i10).f33408a <= j10) || !c(i10).i())) {
            i10++;
        }
        if (i10 < this.f33402b) {
            return i10;
        }
        return -1;
    }

    public int e(long j10, long j11) {
        int i10 = this.f33402b - 1;
        while (i10 >= 0 && f(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !c(i10).g()) {
            return -1;
        }
        return i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (M.c(this.f33401a, cVar.f33401a) && this.f33402b == cVar.f33402b && this.f33403c == cVar.f33403c && this.f33404d == cVar.f33404d && this.f33405e == cVar.f33405e && Arrays.equals(this.f33406f, cVar.f33406f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = this.f33402b * 31;
        Object obj = this.f33401a;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        return ((((((((i11 + i10) * 31) + ((int) this.f33403c)) * 31) + ((int) this.f33404d)) * 31) + this.f33405e) * 31) + Arrays.hashCode(this.f33406f);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f33401a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f33403c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f33406f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f33406f[i10].f33408a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f33406f[i10].f33411d.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f33406f[i10].f33411d[i11];
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
                sb2.append(this.f33406f[i10].f33412e[i11]);
                sb2.append(')');
                if (i11 < this.f33406f[i10].f33411d.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f33406f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}

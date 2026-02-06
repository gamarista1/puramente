package k2;

import android.net.Uri;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import f2.x;
import i2.C2076a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f23194a;

    /* renamed from: b  reason: collision with root package name */
    public final long f23195b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23196c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f23197d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f23198e;

    /* renamed from: f  reason: collision with root package name */
    public final long f23199f;

    /* renamed from: g  reason: collision with root package name */
    public final long f23200g;

    /* renamed from: h  reason: collision with root package name */
    public final long f23201h;

    /* renamed from: i  reason: collision with root package name */
    public final String f23202i;

    /* renamed from: j  reason: collision with root package name */
    public final int f23203j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f23204k;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Uri f23205a;

        /* renamed from: b  reason: collision with root package name */
        private long f23206b;

        /* renamed from: c  reason: collision with root package name */
        private int f23207c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f23208d;

        /* renamed from: e  reason: collision with root package name */
        private Map f23209e;

        /* renamed from: f  reason: collision with root package name */
        private long f23210f;

        /* renamed from: g  reason: collision with root package name */
        private long f23211g;

        /* renamed from: h  reason: collision with root package name */
        private String f23212h;

        /* renamed from: i  reason: collision with root package name */
        private int f23213i;

        /* renamed from: j  reason: collision with root package name */
        private Object f23214j;

        public j a() {
            C2076a.j(this.f23205a, "The uri must be set.");
            return new j(this.f23205a, this.f23206b, this.f23207c, this.f23208d, this.f23209e, this.f23210f, this.f23211g, this.f23212h, this.f23213i, this.f23214j);
        }

        public b b(int i10) {
            this.f23213i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f23208d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f23207c = i10;
            return this;
        }

        public b e(Map map) {
            this.f23209e = map;
            return this;
        }

        public b f(String str) {
            this.f23212h = str;
            return this;
        }

        public b g(long j10) {
            this.f23210f = j10;
            return this;
        }

        public b h(Uri uri) {
            this.f23205a = uri;
            return this;
        }

        public b i(String str) {
            this.f23205a = Uri.parse(str);
            return this;
        }

        public b() {
            this.f23207c = 1;
            this.f23209e = Collections.emptyMap();
            this.f23211g = -1;
        }

        private b(j jVar) {
            this.f23205a = jVar.f23194a;
            this.f23206b = jVar.f23195b;
            this.f23207c = jVar.f23196c;
            this.f23208d = jVar.f23197d;
            this.f23209e = jVar.f23198e;
            this.f23210f = jVar.f23200g;
            this.f23211g = jVar.f23201h;
            this.f23212h = jVar.f23202i;
            this.f23213i = jVar.f23203j;
            this.f23214j = jVar.f23204k;
        }
    }

    static {
        x.a("media3.datasource");
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f23196c);
    }

    public boolean d(int i10) {
        if ((this.f23203j & i10) == i10) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "DataSpec[" + b() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f23194a + ", " + this.f23200g + ", " + this.f23201h + ", " + this.f23202i + ", " + this.f23203j + "]";
    }

    private j(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        long j13 = j10;
        byte[] bArr2 = bArr;
        long j14 = j11;
        long j15 = j12;
        long j16 = j13 + j14;
        boolean z10 = false;
        C2076a.a(j16 >= 0);
        C2076a.a(j14 >= 0);
        C2076a.a((j15 > 0 || j15 == -1) ? true : z10);
        this.f23194a = (Uri) C2076a.e(uri);
        this.f23195b = j13;
        this.f23196c = i10;
        this.f23197d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f23198e = Collections.unmodifiableMap(new HashMap(map));
        this.f23200g = j14;
        this.f23199f = j16;
        this.f23201h = j15;
        this.f23202i = str;
        this.f23203j = i11;
        this.f23204k = obj;
    }
}

package ia;

import android.net.Uri;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import ja.C3645a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k9.C3711n0;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f44456a;

    /* renamed from: b  reason: collision with root package name */
    public final long f44457b;

    /* renamed from: c  reason: collision with root package name */
    public final int f44458c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f44459d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f44460e;

    /* renamed from: f  reason: collision with root package name */
    public final long f44461f;

    /* renamed from: g  reason: collision with root package name */
    public final long f44462g;

    /* renamed from: h  reason: collision with root package name */
    public final long f44463h;

    /* renamed from: i  reason: collision with root package name */
    public final String f44464i;

    /* renamed from: j  reason: collision with root package name */
    public final int f44465j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f44466k;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Uri f44467a;

        /* renamed from: b  reason: collision with root package name */
        private long f44468b;

        /* renamed from: c  reason: collision with root package name */
        private int f44469c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f44470d;

        /* renamed from: e  reason: collision with root package name */
        private Map f44471e;

        /* renamed from: f  reason: collision with root package name */
        private long f44472f;

        /* renamed from: g  reason: collision with root package name */
        private long f44473g;

        /* renamed from: h  reason: collision with root package name */
        private String f44474h;

        /* renamed from: i  reason: collision with root package name */
        private int f44475i;

        /* renamed from: j  reason: collision with root package name */
        private Object f44476j;

        public n a() {
            C3645a.i(this.f44467a, "The uri must be set.");
            return new n(this.f44467a, this.f44468b, this.f44469c, this.f44470d, this.f44471e, this.f44472f, this.f44473g, this.f44474h, this.f44475i, this.f44476j);
        }

        public b b(int i10) {
            this.f44475i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f44470d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f44469c = i10;
            return this;
        }

        public b e(Map map) {
            this.f44471e = map;
            return this;
        }

        public b f(String str) {
            this.f44474h = str;
            return this;
        }

        public b g(long j10) {
            this.f44473g = j10;
            return this;
        }

        public b h(long j10) {
            this.f44472f = j10;
            return this;
        }

        public b i(Uri uri) {
            this.f44467a = uri;
            return this;
        }

        public b j(String str) {
            this.f44467a = Uri.parse(str);
            return this;
        }

        public b() {
            this.f44469c = 1;
            this.f44471e = Collections.emptyMap();
            this.f44473g = -1;
        }

        private b(n nVar) {
            this.f44467a = nVar.f44456a;
            this.f44468b = nVar.f44457b;
            this.f44469c = nVar.f44458c;
            this.f44470d = nVar.f44459d;
            this.f44471e = nVar.f44460e;
            this.f44472f = nVar.f44462g;
            this.f44473g = nVar.f44463h;
            this.f44474h = nVar.f44464i;
            this.f44475i = nVar.f44465j;
            this.f44476j = nVar.f44466k;
        }
    }

    static {
        C3711n0.a("goog.exo.datasource");
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
        return c(this.f44458c);
    }

    public boolean d(int i10) {
        if ((this.f44465j & i10) == i10) {
            return true;
        }
        return false;
    }

    public n e(long j10) {
        long j11 = this.f44463h;
        long j12 = -1;
        if (j11 != -1) {
            j12 = j11 - j10;
        }
        return f(j10, j12);
    }

    public n f(long j10, long j11) {
        if (j10 == 0 && this.f44463h == j11) {
            return this;
        }
        return new n(this.f44456a, this.f44457b, this.f44458c, this.f44459d, this.f44460e, this.f44462g + j10, j11, this.f44464i, this.f44465j, this.f44466k);
    }

    public String toString() {
        return "DataSpec[" + b() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f44456a + ", " + this.f44462g + ", " + this.f44463h + ", " + this.f44464i + ", " + this.f44465j + "]";
    }

    public n(Uri uri) {
        this(uri, 0, -1);
    }

    public n(Uri uri, long j10, long j11) {
        this(uri, 0, 1, (byte[]) null, Collections.emptyMap(), j10, j11, (String) null, 0, (Object) null);
    }

    private n(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        long j13 = j10;
        byte[] bArr2 = bArr;
        long j14 = j11;
        long j15 = j12;
        long j16 = j13 + j14;
        boolean z10 = false;
        C3645a.a(j16 >= 0);
        C3645a.a(j14 >= 0);
        C3645a.a((j15 > 0 || j15 == -1) ? true : z10);
        this.f44456a = uri;
        this.f44457b = j13;
        this.f44458c = i10;
        this.f44459d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f44460e = Collections.unmodifiableMap(new HashMap(map));
        this.f44462g = j14;
        this.f44461f = j16;
        this.f44463h = j15;
        this.f44464i = str;
        this.f44465j = i11;
        this.f44466k = obj;
    }
}

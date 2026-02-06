package X8;

import X8.l;
import java.util.Arrays;

final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    private final long f35455a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f35456b;

    /* renamed from: c  reason: collision with root package name */
    private final long f35457c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f35458d;

    /* renamed from: e  reason: collision with root package name */
    private final String f35459e;

    /* renamed from: f  reason: collision with root package name */
    private final long f35460f;

    /* renamed from: g  reason: collision with root package name */
    private final o f35461g;

    static final class b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f35462a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f35463b;

        /* renamed from: c  reason: collision with root package name */
        private Long f35464c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f35465d;

        /* renamed from: e  reason: collision with root package name */
        private String f35466e;

        /* renamed from: f  reason: collision with root package name */
        private Long f35467f;

        /* renamed from: g  reason: collision with root package name */
        private o f35468g;

        b() {
        }

        public l a() {
            String str = "";
            if (this.f35462a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f35464c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f35467f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f35462a.longValue(), this.f35463b, this.f35464c.longValue(), this.f35465d, this.f35466e, this.f35467f.longValue(), this.f35468g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public l.a b(Integer num) {
            this.f35463b = num;
            return this;
        }

        public l.a c(long j10) {
            this.f35462a = Long.valueOf(j10);
            return this;
        }

        public l.a d(long j10) {
            this.f35464c = Long.valueOf(j10);
            return this;
        }

        public l.a e(o oVar) {
            this.f35468g = oVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public l.a f(byte[] bArr) {
            this.f35465d = bArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        public l.a g(String str) {
            this.f35466e = str;
            return this;
        }

        public l.a h(long j10) {
            this.f35467f = Long.valueOf(j10);
            return this;
        }
    }

    public Integer b() {
        return this.f35456b;
    }

    public long c() {
        return this.f35455a;
    }

    public long d() {
        return this.f35457c;
    }

    public o e() {
        return this.f35461g;
    }

    public boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f35455a == lVar.c() && ((num = this.f35456b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f35457c == lVar.d()) {
            byte[] bArr2 = this.f35458d;
            if (lVar instanceof f) {
                bArr = ((f) lVar).f35458d;
            } else {
                bArr = lVar.f();
            }
            if (Arrays.equals(bArr2, bArr) && ((str = this.f35459e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f35460f == lVar.h()) {
                o oVar = this.f35461g;
                if (oVar == null) {
                    if (lVar.e() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public byte[] f() {
        return this.f35458d;
    }

    public String g() {
        return this.f35459e;
    }

    public long h() {
        return this.f35460f;
    }

    public int hashCode() {
        int i10;
        int i11;
        long j10 = this.f35455a;
        int i12 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f35456b;
        int i13 = 0;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        long j11 = this.f35457c;
        int hashCode = (((((i12 ^ i10) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f35458d)) * 1000003;
        String str = this.f35459e;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        long j12 = this.f35460f;
        int i14 = (((hashCode ^ i11) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f35461g;
        if (oVar != null) {
            i13 = oVar.hashCode();
        }
        return i14 ^ i13;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f35455a + ", eventCode=" + this.f35456b + ", eventUptimeMs=" + this.f35457c + ", sourceExtension=" + Arrays.toString(this.f35458d) + ", sourceExtensionJsonProto3=" + this.f35459e + ", timezoneOffsetSeconds=" + this.f35460f + ", networkConnectionInfo=" + this.f35461g + "}";
    }

    private f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f35455a = j10;
        this.f35456b = num;
        this.f35457c = j11;
        this.f35458d = bArr;
        this.f35459e = str;
        this.f35460f = j12;
        this.f35461g = oVar;
    }
}

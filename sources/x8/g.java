package X8;

import X8.m;
import java.util.List;

final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    private final long f35469a;

    /* renamed from: b  reason: collision with root package name */
    private final long f35470b;

    /* renamed from: c  reason: collision with root package name */
    private final k f35471c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f35472d;

    /* renamed from: e  reason: collision with root package name */
    private final String f35473e;

    /* renamed from: f  reason: collision with root package name */
    private final List f35474f;

    /* renamed from: g  reason: collision with root package name */
    private final p f35475g;

    static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f35476a;

        /* renamed from: b  reason: collision with root package name */
        private Long f35477b;

        /* renamed from: c  reason: collision with root package name */
        private k f35478c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f35479d;

        /* renamed from: e  reason: collision with root package name */
        private String f35480e;

        /* renamed from: f  reason: collision with root package name */
        private List f35481f;

        /* renamed from: g  reason: collision with root package name */
        private p f35482g;

        b() {
        }

        public m a() {
            String str = "";
            if (this.f35476a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f35477b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f35476a.longValue(), this.f35477b.longValue(), this.f35478c, this.f35479d, this.f35480e, this.f35481f, this.f35482g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public m.a b(k kVar) {
            this.f35478c = kVar;
            return this;
        }

        public m.a c(List list) {
            this.f35481f = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public m.a d(Integer num) {
            this.f35479d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        public m.a e(String str) {
            this.f35480e = str;
            return this;
        }

        public m.a f(p pVar) {
            this.f35482g = pVar;
            return this;
        }

        public m.a g(long j10) {
            this.f35476a = Long.valueOf(j10);
            return this;
        }

        public m.a h(long j10) {
            this.f35477b = Long.valueOf(j10);
            return this;
        }
    }

    public k b() {
        return this.f35471c;
    }

    public List c() {
        return this.f35474f;
    }

    public Integer d() {
        return this.f35472d;
    }

    public String e() {
        return this.f35473e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f35469a == mVar.g() && this.f35470b == mVar.h() && ((kVar = this.f35471c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f35472d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f35473e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f35474f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f35475g;
            if (pVar == null) {
                if (mVar.f() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.f())) {
                return true;
            }
        }
        return false;
    }

    public p f() {
        return this.f35475g;
    }

    public long g() {
        return this.f35469a;
    }

    public long h() {
        return this.f35470b;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        long j10 = this.f35469a;
        long j11 = this.f35470b;
        int i14 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f35471c;
        int i15 = 0;
        if (kVar == null) {
            i10 = 0;
        } else {
            i10 = kVar.hashCode();
        }
        int i16 = (i14 ^ i10) * 1000003;
        Integer num = this.f35472d;
        if (num == null) {
            i11 = 0;
        } else {
            i11 = num.hashCode();
        }
        int i17 = (i16 ^ i11) * 1000003;
        String str = this.f35473e;
        if (str == null) {
            i12 = 0;
        } else {
            i12 = str.hashCode();
        }
        int i18 = (i17 ^ i12) * 1000003;
        List list = this.f35474f;
        if (list == null) {
            i13 = 0;
        } else {
            i13 = list.hashCode();
        }
        int i19 = (i18 ^ i13) * 1000003;
        p pVar = this.f35475g;
        if (pVar != null) {
            i15 = pVar.hashCode();
        }
        return i19 ^ i15;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f35469a + ", requestUptimeMs=" + this.f35470b + ", clientInfo=" + this.f35471c + ", logSource=" + this.f35472d + ", logSourceName=" + this.f35473e + ", logEvents=" + this.f35474f + ", qosTier=" + this.f35475g + "}";
    }

    private g(long j10, long j11, k kVar, Integer num, String str, List list, p pVar) {
        this.f35469a = j10;
        this.f35470b = j11;
        this.f35471c = kVar;
        this.f35472d = num;
        this.f35473e = str;
        this.f35474f = list;
        this.f35475g = pVar;
    }
}

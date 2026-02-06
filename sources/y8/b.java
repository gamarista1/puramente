package Y8;

import Y8.i;
import java.util.Map;

final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    private final String f35718a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f35719b;

    /* renamed from: c  reason: collision with root package name */
    private final h f35720c;

    /* renamed from: d  reason: collision with root package name */
    private final long f35721d;

    /* renamed from: e  reason: collision with root package name */
    private final long f35722e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f35723f;

    /* renamed from: Y8.b$b  reason: collision with other inner class name */
    static final class C0581b extends i.a {

        /* renamed from: a  reason: collision with root package name */
        private String f35724a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f35725b;

        /* renamed from: c  reason: collision with root package name */
        private h f35726c;

        /* renamed from: d  reason: collision with root package name */
        private Long f35727d;

        /* renamed from: e  reason: collision with root package name */
        private Long f35728e;

        /* renamed from: f  reason: collision with root package name */
        private Map f35729f;

        C0581b() {
        }

        public i d() {
            String str = "";
            if (this.f35724a == null) {
                str = str + " transportName";
            }
            if (this.f35726c == null) {
                str = str + " encodedPayload";
            }
            if (this.f35727d == null) {
                str = str + " eventMillis";
            }
            if (this.f35728e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f35729f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f35724a, this.f35725b, this.f35726c, this.f35727d.longValue(), this.f35728e.longValue(), this.f35729f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: protected */
        public Map e() {
            Map map = this.f35729f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        public i.a f(Map map) {
            if (map != null) {
                this.f35729f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        public i.a g(Integer num) {
            this.f35725b = num;
            return this;
        }

        public i.a h(h hVar) {
            if (hVar != null) {
                this.f35726c = hVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public i.a i(long j10) {
            this.f35727d = Long.valueOf(j10);
            return this;
        }

        public i.a j(String str) {
            if (str != null) {
                this.f35724a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        public i.a k(long j10) {
            this.f35728e = Long.valueOf(j10);
            return this;
        }
    }

    /* access modifiers changed from: protected */
    public Map c() {
        return this.f35723f;
    }

    public Integer d() {
        return this.f35719b;
    }

    public h e() {
        return this.f35720c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.f35718a.equals(iVar.j()) || ((num = this.f35719b) != null ? !num.equals(iVar.d()) : iVar.d() != null) || !this.f35720c.equals(iVar.e()) || this.f35721d != iVar.f() || this.f35722e != iVar.k() || !this.f35723f.equals(iVar.c())) {
            return false;
        }
        return true;
    }

    public long f() {
        return this.f35721d;
    }

    public int hashCode() {
        int i10;
        int hashCode = (this.f35718a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f35719b;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        long j10 = this.f35721d;
        long j11 = this.f35722e;
        return ((((((((hashCode ^ i10) * 1000003) ^ this.f35720c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f35723f.hashCode();
    }

    public String j() {
        return this.f35718a;
    }

    public long k() {
        return this.f35722e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f35718a + ", code=" + this.f35719b + ", encodedPayload=" + this.f35720c + ", eventMillis=" + this.f35721d + ", uptimeMillis=" + this.f35722e + ", autoMetadata=" + this.f35723f + "}";
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map map) {
        this.f35718a = str;
        this.f35719b = num;
        this.f35720c = hVar;
        this.f35721d = j10;
        this.f35722e = j11;
        this.f35723f = map;
    }
}

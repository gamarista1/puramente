package o2;

/* renamed from: o2.k  reason: case insensitive filesystem */
public final class C2365k {

    /* renamed from: d  reason: collision with root package name */
    public static final C2365k f25012d = new b().d();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f25013a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f25014b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f25015c;

    /* renamed from: o2.k$b */
    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f25016a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f25017b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public boolean f25018c;

        public C2365k d() {
            if (this.f25016a || (!this.f25017b && !this.f25018c)) {
                return new C2365k(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z10) {
            this.f25016a = z10;
            return this;
        }

        public b f(boolean z10) {
            this.f25017b = z10;
            return this;
        }

        public b g(boolean z10) {
            this.f25018c = z10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2365k.class != obj.getClass()) {
            return false;
        }
        C2365k kVar = (C2365k) obj;
        if (this.f25013a == kVar.f25013a && this.f25014b == kVar.f25014b && this.f25015c == kVar.f25015c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f25013a ? 1 : 0) << true) + ((this.f25014b ? 1 : 0) << true) + (this.f25015c ? 1 : 0);
    }

    private C2365k(b bVar) {
        this.f25013a = bVar.f25016a;
        this.f25014b = bVar.f25017b;
        this.f25015c = bVar.f25018c;
    }
}

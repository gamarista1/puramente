package b9;

/* renamed from: b9.b  reason: case insensitive filesystem */
public final class C3161b {

    /* renamed from: b  reason: collision with root package name */
    private static final C3161b f36306b = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final C3164e f36307a;

    /* renamed from: b9.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private C3164e f36308a = null;

        a() {
        }

        public C3161b a() {
            return new C3161b(this.f36308a);
        }

        public a b(C3164e eVar) {
            this.f36308a = eVar;
            return this;
        }
    }

    C3161b(C3164e eVar) {
        this.f36307a = eVar;
    }

    public static a b() {
        return new a();
    }

    public C3164e a() {
        return this.f36307a;
    }
}

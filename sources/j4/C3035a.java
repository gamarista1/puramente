package J4;

/* renamed from: J4.a  reason: case insensitive filesystem */
public final class C3035a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f32150a;

    /* renamed from: J4.a$a  reason: collision with other inner class name */
    public static final class C0524a {

        /* renamed from: a  reason: collision with root package name */
        private String f32151a;

        /* synthetic */ C0524a(q qVar) {
        }

        public C3035a a() {
            String str = this.f32151a;
            if (str != null) {
                C3035a aVar = new C3035a((q) null);
                aVar.f32150a = str;
                return aVar;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        public C0524a b(String str) {
            this.f32151a = str;
            return this;
        }
    }

    /* synthetic */ C3035a(q qVar) {
    }

    public static C0524a b() {
        return new C0524a((q) null);
    }

    public String a() {
        return this.f32150a;
    }
}

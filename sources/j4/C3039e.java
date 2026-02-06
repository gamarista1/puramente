package J4;

/* renamed from: J4.e  reason: case insensitive filesystem */
public final class C3039e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f32152a;

    /* renamed from: J4.e$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f32153a;

        /* synthetic */ a(C c10) {
        }

        public C3039e a() {
            String str = this.f32153a;
            if (str != null) {
                C3039e eVar = new C3039e((C) null);
                eVar.f32152a = str;
                return eVar;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        public a b(String str) {
            this.f32153a = str;
            return this;
        }
    }

    /* synthetic */ C3039e(C c10) {
    }

    public static a b() {
        return new a((C) null);
    }

    public String a() {
        return this.f32152a;
    }
}

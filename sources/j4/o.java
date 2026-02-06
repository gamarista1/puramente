package J4;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final String f32158a;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f32159a;

        /* synthetic */ a(L l10) {
        }

        public o a() {
            if (this.f32159a != null) {
                return new o(this, (L) null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f32159a = str;
            return this;
        }
    }

    /* synthetic */ o(a aVar, L l10) {
        this.f32158a = aVar.f32159a;
    }

    public static a a() {
        return new a((L) null);
    }

    public final String b() {
        return this.f32158a;
    }
}

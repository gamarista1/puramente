package J4;

/* renamed from: J4.n  reason: case insensitive filesystem */
public final class C3048n {

    /* renamed from: a  reason: collision with root package name */
    private final String f32156a;

    /* renamed from: J4.n$a */
    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f32157a;

        /* synthetic */ a(K k10) {
        }

        public C3048n a() {
            if (this.f32157a != null) {
                return new C3048n(this, (K) null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f32157a = str;
            return this;
        }
    }

    /* synthetic */ C3048n(a aVar, K k10) {
        this.f32156a = aVar.f32157a;
    }

    public static a a() {
        return new a((K) null);
    }

    public final String b() {
        return this.f32156a;
    }
}

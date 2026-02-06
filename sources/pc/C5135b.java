package pc;

import com.google.firebase.messaging.O;

/* renamed from: pc.b  reason: case insensitive filesystem */
public final class C5135b {

    /* renamed from: b  reason: collision with root package name */
    private static final C5135b f61304b = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final C5134a f61305a;

    /* renamed from: pc.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private C5134a f61306a = null;

        a() {
        }

        public C5135b a() {
            return new C5135b(this.f61306a);
        }

        public a b(C5134a aVar) {
            this.f61306a = aVar;
            return this;
        }
    }

    C5135b(C5134a aVar) {
        this.f61305a = aVar;
    }

    public static a b() {
        return new a();
    }

    public C5134a a() {
        return this.f61305a;
    }

    public byte[] c() {
        return O.a(this);
    }
}

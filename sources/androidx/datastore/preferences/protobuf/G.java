package androidx.datastore.preferences.protobuf;

final class G implements f0 {

    /* renamed from: b  reason: collision with root package name */
    private static final N f16268b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final N f16269a;

    static class a implements N {
        a() {
        }

        public M a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public boolean b(Class cls) {
            return false;
        }
    }

    private static class b implements N {

        /* renamed from: a  reason: collision with root package name */
        private N[] f16270a;

        b(N... nArr) {
            this.f16270a = nArr;
        }

        public M a(Class cls) {
            for (N n10 : this.f16270a) {
                if (n10.b(cls)) {
                    return n10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public boolean b(Class cls) {
            for (N b10 : this.f16270a) {
                if (b10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public G() {
        this(b());
    }

    private static N b() {
        return new b(C1748v.c(), c());
    }

    private static N c() {
        try {
            return (N) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return f16268b;
        }
    }

    private static boolean d(M m10) {
        if (m10.c() == Z.PROTO2) {
            return true;
        }
        return false;
    }

    private static e0 e(Class cls, M m10) {
        if (C1749w.class.isAssignableFrom(cls)) {
            if (d(m10)) {
                return S.M(cls, m10, W.b(), E.b(), g0.L(), r.b(), L.b());
            }
            return S.M(cls, m10, W.b(), E.b(), g0.L(), (C1743p) null, L.b());
        } else if (d(m10)) {
            return S.M(cls, m10, W.a(), E.a(), g0.G(), r.a(), L.a());
        } else {
            return S.M(cls, m10, W.a(), E.a(), g0.H(), (C1743p) null, L.a());
        }
    }

    public e0 a(Class cls) {
        g0.I(cls);
        M a10 = this.f16269a.a(cls);
        if (!a10.a()) {
            return e(cls, a10);
        }
        if (C1749w.class.isAssignableFrom(cls)) {
            return T.l(g0.L(), r.b(), a10.b());
        }
        return T.l(g0.G(), r.a(), a10.b());
    }

    private G(N n10) {
        this.f16269a = (N) C1751y.b(n10, "messageInfoFactory");
    }
}

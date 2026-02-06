package com.google.protobuf;

final class C implements a0 {

    /* renamed from: b  reason: collision with root package name */
    private static final J f58374b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final J f58375a;

    class a implements J {
        a() {
        }

        public I a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public boolean b(Class cls) {
            return false;
        }
    }

    private static class b implements J {

        /* renamed from: a  reason: collision with root package name */
        private J[] f58376a;

        b(J... jArr) {
            this.f58376a = jArr;
        }

        public I a(Class cls) {
            for (J j10 : this.f58376a) {
                if (j10.b(cls)) {
                    return j10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public boolean b(Class cls) {
            for (J b10 : this.f58376a) {
                if (b10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C() {
        this(b());
    }

    private static J b() {
        return new b(C4879q.c(), c());
    }

    private static J c() {
        try {
            return (J) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return f58374b;
        }
    }

    private static boolean d(I i10) {
        if (i10.c() == V.PROTO2) {
            return true;
        }
        return false;
    }

    private static Z e(Class cls, I i10) {
        if (r.class.isAssignableFrom(cls)) {
            if (d(i10)) {
                return N.I(cls, i10, S.b(), A.b(), b0.J(), C4876n.b(), H.b());
            }
            return N.I(cls, i10, S.b(), A.b(), b0.J(), (C4874l) null, H.b());
        } else if (d(i10)) {
            return N.I(cls, i10, S.a(), A.a(), b0.F(), C4876n.a(), H.a());
        } else {
            return N.I(cls, i10, S.a(), A.a(), b0.G(), (C4874l) null, H.a());
        }
    }

    public Z a(Class cls) {
        b0.H(cls);
        I a10 = this.f58375a.a(cls);
        if (!a10.a()) {
            return e(cls, a10);
        }
        if (r.class.isAssignableFrom(cls)) {
            return O.j(b0.J(), C4876n.b(), a10.b());
        }
        return O.j(b0.F(), C4876n.a(), a10.b());
    }

    private C(J j10) {
        this.f58375a = (J) C4881t.b(j10, "messageInfoFactory");
    }
}

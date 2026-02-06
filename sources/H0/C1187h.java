package H0;

import q0.C2427m;

/* renamed from: H0.h  reason: case insensitive filesystem */
public interface C1187h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2609a = a.f2610a;

    /* renamed from: H0.h$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f2610a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final C1187h f2611b = new C0044a();

        /* renamed from: c  reason: collision with root package name */
        private static final C1187h f2612c = new e();

        /* renamed from: d  reason: collision with root package name */
        private static final C1187h f2613d = new c();

        /* renamed from: e  reason: collision with root package name */
        private static final C1187h f2614e = new d();

        /* renamed from: f  reason: collision with root package name */
        private static final C1187h f2615f = new f();

        /* renamed from: g  reason: collision with root package name */
        private static final C1190k f2616g = new C1190k(1.0f);

        /* renamed from: h  reason: collision with root package name */
        private static final C1187h f2617h = new b();

        /* renamed from: H0.h$a$a  reason: collision with other inner class name */
        public static final class C0044a implements C1187h {
            C0044a() {
            }

            public long a(long j10, long j11) {
                float b10 = C1188i.f(j10, j11);
                return c0.a(b10, b10);
            }
        }

        /* renamed from: H0.h$a$b */
        public static final class b implements C1187h {
            b() {
            }

            public long a(long j10, long j11) {
                return c0.a(C1188i.h(j10, j11), C1188i.e(j10, j11));
            }
        }

        /* renamed from: H0.h$a$c */
        public static final class c implements C1187h {
            c() {
            }

            public long a(long j10, long j11) {
                float a10 = C1188i.e(j10, j11);
                return c0.a(a10, a10);
            }
        }

        /* renamed from: H0.h$a$d */
        public static final class d implements C1187h {
            d() {
            }

            public long a(long j10, long j11) {
                float d10 = C1188i.h(j10, j11);
                return c0.a(d10, d10);
            }
        }

        /* renamed from: H0.h$a$e */
        public static final class e implements C1187h {
            e() {
            }

            public long a(long j10, long j11) {
                float c10 = C1188i.g(j10, j11);
                return c0.a(c10, c10);
            }
        }

        /* renamed from: H0.h$a$f */
        public static final class f implements C1187h {
            f() {
            }

            public long a(long j10, long j11) {
                if (C2427m.k(j10) <= C2427m.k(j11) && C2427m.i(j10) <= C2427m.i(j11)) {
                    return c0.a(1.0f, 1.0f);
                }
                float c10 = C1188i.g(j10, j11);
                return c0.a(c10, c10);
            }
        }

        private a() {
        }

        public final C1187h a() {
            return f2611b;
        }

        public final C1187h b() {
            return f2613d;
        }

        public final C1187h c() {
            return f2614e;
        }

        public final C1187h d() {
            return f2612c;
        }

        public final C1187h e() {
            return f2615f;
        }

        public final C1190k f() {
            return f2616g;
        }
    }

    long a(long j10, long j11);
}

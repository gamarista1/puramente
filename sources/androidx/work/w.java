package androidx.work;

public interface w {

    /* renamed from: a  reason: collision with root package name */
    public static final b.c f19041a = new b.c();

    /* renamed from: b  reason: collision with root package name */
    public static final b.C0326b f19042b = new b.C0326b();

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f19043a;

            public a(Throwable th2) {
                this.f19043a = th2;
            }

            public Throwable a() {
                return this.f19043a;
            }

            public String toString() {
                return "FAILURE (" + this.f19043a.getMessage() + ")";
            }
        }

        /* renamed from: androidx.work.w$b$b  reason: collision with other inner class name */
        public static final class C0326b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0326b() {
            }
        }

        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }
}

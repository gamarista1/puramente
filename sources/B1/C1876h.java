package b1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: b1.h  reason: case insensitive filesystem */
public final class C1876h {

    /* renamed from: c  reason: collision with root package name */
    public static final b f19093c = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C1876h f19094d = new C1876h(a.f19097a.b(), c.f19102a.a(), (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final float f19095a;

    /* renamed from: b  reason: collision with root package name */
    private final int f19096b;

    /* renamed from: b1.h$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0330a f19097a = new C0330a((DefaultConstructorMarker) null);

        /* renamed from: b  reason: collision with root package name */
        private static final float f19098b = c(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final float f19099c = c(0.5f);
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final float f19100d = c(-1.0f);

        /* renamed from: e  reason: collision with root package name */
        private static final float f19101e = c(1.0f);

        /* renamed from: b1.h$a$a  reason: collision with other inner class name */
        public static final class C0330a {
            public /* synthetic */ C0330a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final float a() {
                return a.f19099c;
            }

            public final float b() {
                return a.f19100d;
            }

            private C0330a() {
            }
        }

        public static float c(float f10) {
            if ((0.0f <= f10 && f10 <= 1.0f) || f10 == -1.0f) {
                return f10;
            }
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }

        public static final boolean d(float f10, float f11) {
            if (Float.compare(f10, f11) == 0) {
                return true;
            }
            return false;
        }

        public static int e(float f10) {
            return Float.hashCode(f10);
        }

        public static String f(float f10) {
            if (f10 == f19098b) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f10 == f19099c) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f10 == f19100d) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f10 == f19101e) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }
    }

    /* renamed from: b1.h$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1876h a() {
            return C1876h.f19094d;
        }

        private b() {
        }
    }

    public /* synthetic */ C1876h(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, i10);
    }

    public final float b() {
        return this.f19095a;
    }

    public final int c() {
        return this.f19096b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1876h)) {
            return false;
        }
        C1876h hVar = (C1876h) obj;
        if (a.d(this.f19095a, hVar.f19095a) && c.d(this.f19096b, hVar.f19096b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (a.e(this.f19095a) * 31) + c.e(this.f19096b);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + a.f(this.f19095a) + ", trim=" + c.h(this.f19096b) + ')';
    }

    private C1876h(float f10, int i10) {
        this.f19095a = f10;
        this.f19096b = i10;
    }

    /* renamed from: b1.h$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19102a = new a((DefaultConstructorMarker) null);

        /* renamed from: b  reason: collision with root package name */
        private static final int f19103b = c(1);

        /* renamed from: c  reason: collision with root package name */
        private static final int f19104c = c(16);
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final int f19105d = c(17);
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final int f19106e = c(0);

        /* renamed from: b1.h$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.f19105d;
            }

            public final int b() {
                return c.f19106e;
            }

            private a() {
            }
        }

        public static final boolean d(int i10, int i11) {
            if (i10 == i11) {
                return true;
            }
            return false;
        }

        public static int e(int i10) {
            return Integer.hashCode(i10);
        }

        public static final boolean f(int i10) {
            if ((i10 & 1) > 0) {
                return true;
            }
            return false;
        }

        public static final boolean g(int i10) {
            if ((i10 & 16) > 0) {
                return true;
            }
            return false;
        }

        public static String h(int i10) {
            if (i10 == f19103b) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i10 == f19104c) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i10 == f19105d) {
                return "LineHeightStyle.Trim.Both";
            }
            if (i10 == f19106e) {
                return "LineHeightStyle.Trim.None";
            }
            return "Invalid";
        }

        private static int c(int i10) {
            return i10;
        }
    }
}

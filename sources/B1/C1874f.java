package b1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: b1.f  reason: case insensitive filesystem */
public final class C1874f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19072b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f19073c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f19074d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f19075e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f19076f = d(0);

    /* renamed from: a  reason: collision with root package name */
    private final int f19077a;

    /* renamed from: b1.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C1874f.f19073c;
        }

        public final int b() {
            return C1874f.f19076f;
        }

        private a() {
        }
    }

    static {
        b.a aVar = b.f19078a;
        int c10 = aVar.c();
        c.a aVar2 = c.f19083a;
        int c11 = aVar2.c();
        d.a aVar3 = d.f19089a;
        f19073c = d(C1875g.e(c10, c11, aVar3.a()));
        f19074d = d(C1875g.e(aVar.a(), aVar2.b(), aVar3.b()));
        f19075e = d(C1875g.e(aVar.b(), aVar2.d(), aVar3.a()));
    }

    private /* synthetic */ C1874f(int i10) {
        this.f19077a = i10;
    }

    public static final /* synthetic */ C1874f c(int i10) {
        return new C1874f(i10);
    }

    public static boolean e(int i10, Object obj) {
        if ((obj instanceof C1874f) && i10 == ((C1874f) obj).l()) {
            return true;
        }
        return false;
    }

    public static final boolean f(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static final int g(int i10) {
        return b.d(C1875g.f(i10));
    }

    public static final int h(int i10) {
        return c.e(C1875g.g(i10));
    }

    public static final int i(int i10) {
        return d.c(C1875g.h(i10));
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    public static String k(int i10) {
        return "LineBreak(strategy=" + b.f(g(i10)) + ", strictness=" + c.g(h(i10)) + ", wordBreak=" + d.e(i(i10)) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f19077a, obj);
    }

    public int hashCode() {
        return j(this.f19077a);
    }

    public final /* synthetic */ int l() {
        return this.f19077a;
    }

    public String toString() {
        return k(this.f19077a);
    }

    /* renamed from: b1.f$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19078a = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static final int f19079b = d(1);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final int f19080c = d(2);
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final int f19081d = d(3);

        /* renamed from: e  reason: collision with root package name */
        private static final int f19082e = d(0);

        /* renamed from: b1.f$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.f19081d;
            }

            public final int b() {
                return b.f19080c;
            }

            public final int c() {
                return b.f19079b;
            }

            private a() {
            }
        }

        public static final boolean e(int i10, int i11) {
            if (i10 == i11) {
                return true;
            }
            return false;
        }

        public static String f(int i10) {
            if (e(i10, f19079b)) {
                return "Strategy.Simple";
            }
            if (e(i10, f19080c)) {
                return "Strategy.HighQuality";
            }
            if (e(i10, f19081d)) {
                return "Strategy.Balanced";
            }
            if (e(i10, f19082e)) {
                return "Strategy.Unspecified";
            }
            return "Invalid";
        }

        public static int d(int i10) {
            return i10;
        }
    }

    /* renamed from: b1.f$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19083a = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static final int f19084b = e(1);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final int f19085c = e(2);
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final int f19086d = e(3);
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final int f19087e = e(4);

        /* renamed from: f  reason: collision with root package name */
        private static final int f19088f = e(0);

        /* renamed from: b1.f$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.f19084b;
            }

            public final int b() {
                return c.f19085c;
            }

            public final int c() {
                return c.f19086d;
            }

            public final int d() {
                return c.f19087e;
            }

            private a() {
            }
        }

        public static final boolean f(int i10, int i11) {
            if (i10 == i11) {
                return true;
            }
            return false;
        }

        public static String g(int i10) {
            if (f(i10, f19084b)) {
                return "Strictness.None";
            }
            if (f(i10, f19085c)) {
                return "Strictness.Loose";
            }
            if (f(i10, f19086d)) {
                return "Strictness.Normal";
            }
            if (f(i10, f19087e)) {
                return "Strictness.Strict";
            }
            if (f(i10, f19088f)) {
                return "Strictness.Unspecified";
            }
            return "Invalid";
        }

        public static int e(int i10) {
            return i10;
        }
    }

    /* renamed from: b1.f$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19089a = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static final int f19090b = c(1);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final int f19091c = c(2);

        /* renamed from: d  reason: collision with root package name */
        private static final int f19092d = c(0);

        /* renamed from: b1.f$d$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return d.f19090b;
            }

            public final int b() {
                return d.f19091c;
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

        public static String e(int i10) {
            if (d(i10, f19090b)) {
                return "WordBreak.None";
            }
            if (d(i10, f19091c)) {
                return "WordBreak.Phrase";
            }
            if (d(i10, f19092d)) {
                return "WordBreak.Unspecified";
            }
            return "Invalid";
        }

        public static int c(int i10) {
            return i10;
        }
    }

    private static int d(int i10) {
        return i10;
    }
}

package W0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static final a f8593b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f8594c = k(-1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f8595d = k(1);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f8596e = k(0);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f8597f = k(2);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f8598g = k(3);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int f8599h = k(4);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final int f8600i = k(5);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final int f8601j = k(6);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final int f8602k = k(7);

    /* renamed from: a  reason: collision with root package name */
    private final int f8603a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return r.f8595d;
        }

        public final int b() {
            return r.f8602k;
        }

        public final int c() {
            return r.f8597f;
        }

        public final int d() {
            return r.f8601j;
        }

        public final int e() {
            return r.f8596e;
        }

        public final int f() {
            return r.f8600i;
        }

        public final int g() {
            return r.f8598g;
        }

        public final int h() {
            return r.f8599h;
        }

        public final int i() {
            return r.f8594c;
        }

        private a() {
        }
    }

    private /* synthetic */ r(int i10) {
        this.f8603a = i10;
    }

    public static final /* synthetic */ r j(int i10) {
        return new r(i10);
    }

    public static boolean l(int i10, Object obj) {
        if ((obj instanceof r) && i10 == ((r) obj).p()) {
            return true;
        }
        return false;
    }

    public static final boolean m(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static int n(int i10) {
        return Integer.hashCode(i10);
    }

    public static String o(int i10) {
        if (m(i10, f8594c)) {
            return "Unspecified";
        }
        if (m(i10, f8596e)) {
            return "None";
        }
        if (m(i10, f8595d)) {
            return "Default";
        }
        if (m(i10, f8597f)) {
            return "Go";
        }
        if (m(i10, f8598g)) {
            return "Search";
        }
        if (m(i10, f8599h)) {
            return "Send";
        }
        if (m(i10, f8600i)) {
            return "Previous";
        }
        if (m(i10, f8601j)) {
            return "Next";
        }
        if (m(i10, f8602k)) {
            return "Done";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return l(this.f8603a, obj);
    }

    public int hashCode() {
        return n(this.f8603a);
    }

    public final /* synthetic */ int p() {
        return this.f8603a;
    }

    public String toString() {
        return o(this.f8603a);
    }

    private static int k(int i10) {
        return i10;
    }
}

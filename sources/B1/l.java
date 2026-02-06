package b1;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19124b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f19125c = h(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f19126d = h(2);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f19127e = h(3);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f19128f = h(4);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f19129g = h(5);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int f19130h = h(Integer.MIN_VALUE);

    /* renamed from: a  reason: collision with root package name */
    private final int f19131a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return l.f19127e;
        }

        public final int b() {
            return l.f19128f;
        }

        public final int c() {
            return l.f19129g;
        }

        public final int d() {
            return l.f19125c;
        }

        public final int e() {
            return l.f19126d;
        }

        public final int f() {
            return l.f19130h;
        }

        private a() {
        }
    }

    private /* synthetic */ l(int i10) {
        this.f19131a = i10;
    }

    public static final /* synthetic */ l g(int i10) {
        return new l(i10);
    }

    public static boolean i(int i10, Object obj) {
        if ((obj instanceof l) && i10 == ((l) obj).m()) {
            return true;
        }
        return false;
    }

    public static final boolean j(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static int k(int i10) {
        return Integer.hashCode(i10);
    }

    public static String l(int i10) {
        if (j(i10, f19125c)) {
            return "Ltr";
        }
        if (j(i10, f19126d)) {
            return "Rtl";
        }
        if (j(i10, f19127e)) {
            return "Content";
        }
        if (j(i10, f19128f)) {
            return "ContentOrLtr";
        }
        if (j(i10, f19129g)) {
            return "ContentOrRtl";
        }
        if (j(i10, f19130h)) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.f19131a, obj);
    }

    public int hashCode() {
        return k(this.f19131a);
    }

    public final /* synthetic */ int m() {
        return this.f19131a;
    }

    public String toString() {
        return l(this.f19131a);
    }

    public static int h(int i10) {
        return i10;
    }
}

package W0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: W0.y  reason: case insensitive filesystem */
public final class C1456y {

    /* renamed from: b  reason: collision with root package name */
    public static final a f8623b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f8624c = l(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f8625d = l(1);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f8626e = l(2);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f8627f = l(3);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f8628g = l(4);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int f8629h = l(5);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final int f8630i = l(6);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final int f8631j = l(7);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final int f8632k = l(8);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final int f8633l = l(9);

    /* renamed from: a  reason: collision with root package name */
    private final int f8634a;

    /* renamed from: W0.y$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C1456y.f8626e;
        }

        public final int b() {
            return C1456y.f8633l;
        }

        public final int c() {
            return C1456y.f8630i;
        }

        public final int d() {
            return C1456y.f8627f;
        }

        public final int e() {
            return C1456y.f8632k;
        }

        public final int f() {
            return C1456y.f8631j;
        }

        public final int g() {
            return C1456y.f8628g;
        }

        public final int h() {
            return C1456y.f8625d;
        }

        public final int i() {
            return C1456y.f8624c;
        }

        public final int j() {
            return C1456y.f8629h;
        }

        private a() {
        }
    }

    private /* synthetic */ C1456y(int i10) {
        this.f8634a = i10;
    }

    public static final /* synthetic */ C1456y k(int i10) {
        return new C1456y(i10);
    }

    public static boolean m(int i10, Object obj) {
        if ((obj instanceof C1456y) && i10 == ((C1456y) obj).q()) {
            return true;
        }
        return false;
    }

    public static final boolean n(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static int o(int i10) {
        return Integer.hashCode(i10);
    }

    public static String p(int i10) {
        if (n(i10, f8624c)) {
            return "Unspecified";
        }
        if (n(i10, f8625d)) {
            return "Text";
        }
        if (n(i10, f8626e)) {
            return "Ascii";
        }
        if (n(i10, f8627f)) {
            return "Number";
        }
        if (n(i10, f8628g)) {
            return "Phone";
        }
        if (n(i10, f8629h)) {
            return "Uri";
        }
        if (n(i10, f8630i)) {
            return "Email";
        }
        if (n(i10, f8631j)) {
            return "Password";
        }
        if (n(i10, f8632k)) {
            return "NumberPassword";
        }
        if (n(i10, f8633l)) {
            return "Decimal";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m(this.f8634a, obj);
    }

    public int hashCode() {
        return o(this.f8634a);
    }

    public final /* synthetic */ int q() {
        return this.f8634a;
    }

    public String toString() {
        return p(this.f8634a);
    }

    private static int l(int i10) {
        return i10;
    }
}

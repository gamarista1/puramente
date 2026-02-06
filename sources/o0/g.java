package O0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f4539b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f4540c = i(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f4541d = i(1);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f4542e = i(2);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f4543f = i(3);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f4544g = i(4);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int f4545h = i(5);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final int f4546i = i(6);

    /* renamed from: a  reason: collision with root package name */
    private final int f4547a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return g.f4540c;
        }

        public final int b() {
            return g.f4541d;
        }

        public final int c() {
            return g.f4546i;
        }

        public final int d() {
            return g.f4545h;
        }

        public final int e() {
            return g.f4543f;
        }

        public final int f() {
            return g.f4542e;
        }

        public final int g() {
            return g.f4544g;
        }

        private a() {
        }
    }

    private /* synthetic */ g(int i10) {
        this.f4547a = i10;
    }

    public static final /* synthetic */ g h(int i10) {
        return new g(i10);
    }

    public static boolean j(int i10, Object obj) {
        if ((obj instanceof g) && i10 == ((g) obj).n()) {
            return true;
        }
        return false;
    }

    public static final boolean k(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static int l(int i10) {
        return Integer.hashCode(i10);
    }

    public static String m(int i10) {
        if (k(i10, f4540c)) {
            return "Button";
        }
        if (k(i10, f4541d)) {
            return "Checkbox";
        }
        if (k(i10, f4542e)) {
            return "Switch";
        }
        if (k(i10, f4543f)) {
            return "RadioButton";
        }
        if (k(i10, f4544g)) {
            return "Tab";
        }
        if (k(i10, f4545h)) {
            return "Image";
        }
        if (k(i10, f4546i)) {
            return "DropdownList";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return j(this.f4547a, obj);
    }

    public int hashCode() {
        return l(this.f4547a);
    }

    public final /* synthetic */ int n() {
        return this.f4547a;
    }

    public String toString() {
        return m(this.f4547a);
    }

    private static int i(int i10) {
        return i10;
    }
}

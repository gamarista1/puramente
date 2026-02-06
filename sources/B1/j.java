package b1;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19110b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f19111c = i(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f19112d = i(2);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f19113e = i(3);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f19114f = i(4);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f19115g = i(5);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int f19116h = i(6);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final int f19117i = i(Integer.MIN_VALUE);

    /* renamed from: a  reason: collision with root package name */
    private final int f19118a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return j.f19113e;
        }

        public final int b() {
            return j.f19116h;
        }

        public final int c() {
            return j.f19114f;
        }

        public final int d() {
            return j.f19111c;
        }

        public final int e() {
            return j.f19112d;
        }

        public final int f() {
            return j.f19115g;
        }

        public final int g() {
            return j.f19117i;
        }

        private a() {
        }
    }

    private /* synthetic */ j(int i10) {
        this.f19118a = i10;
    }

    public static final /* synthetic */ j h(int i10) {
        return new j(i10);
    }

    public static boolean j(int i10, Object obj) {
        if ((obj instanceof j) && i10 == ((j) obj).n()) {
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
        if (k(i10, f19111c)) {
            return "Left";
        }
        if (k(i10, f19112d)) {
            return "Right";
        }
        if (k(i10, f19113e)) {
            return "Center";
        }
        if (k(i10, f19114f)) {
            return "Justify";
        }
        if (k(i10, f19115g)) {
            return "Start";
        }
        if (k(i10, f19116h)) {
            return "End";
        }
        if (k(i10, f19117i)) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return j(this.f19118a, obj);
    }

    public int hashCode() {
        return l(this.f19118a);
    }

    public final /* synthetic */ int n() {
        return this.f19118a;
    }

    public String toString() {
        return m(this.f19118a);
    }

    public static int i(int i10) {
        return i10;
    }
}

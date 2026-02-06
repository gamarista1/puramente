package androidx.compose.ui.focus;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13315b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f13316c = j(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f13317d = j(2);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f13318e = j(3);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f13319f = j(4);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f13320g = j(5);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int f13321h = j(6);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final int f13322i = j(7);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final int f13323j = j(8);

    /* renamed from: a  reason: collision with root package name */
    private final int f13324a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.f13321h;
        }

        public final int b() {
            return d.f13322i;
        }

        public final int c() {
            return d.f13323j;
        }

        public final int d() {
            return d.f13318e;
        }

        public final int e() {
            return d.f13316c;
        }

        public final int f() {
            return d.f13317d;
        }

        public final int g() {
            return d.f13319f;
        }

        public final int h() {
            return d.f13320g;
        }

        private a() {
        }
    }

    private /* synthetic */ d(int i10) {
        this.f13324a = i10;
    }

    public static final /* synthetic */ d i(int i10) {
        return new d(i10);
    }

    public static int j(int i10) {
        return i10;
    }

    public static boolean k(int i10, Object obj) {
        return (obj instanceof d) && i10 == ((d) obj).o();
    }

    public static final boolean l(int i10, int i11) {
        return i10 == i11;
    }

    public static int m(int i10) {
        return Integer.hashCode(i10);
    }

    public static String n(int i10) {
        if (l(i10, f13316c)) {
            return "Next";
        }
        if (l(i10, f13317d)) {
            return "Previous";
        }
        if (l(i10, f13318e)) {
            return "Left";
        }
        if (l(i10, f13319f)) {
            return "Right";
        }
        if (l(i10, f13320g)) {
            return "Up";
        }
        if (l(i10, f13321h)) {
            return "Down";
        }
        if (l(i10, f13322i)) {
            return "Enter";
        }
        if (l(i10, f13323j)) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.f13324a, obj);
    }

    public int hashCode() {
        return m(this.f13324a);
    }

    public final /* synthetic */ int o() {
        return this.f13324a;
    }

    public String toString() {
        return n(this.f13324a);
    }
}

package A0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0001a f420b = new C0001a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f421c = d(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f422d = d(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f423a;

    /* renamed from: A0.a$a  reason: collision with other inner class name */
    public static final class C0001a {
        public /* synthetic */ C0001a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return a.f422d;
        }

        public final int b() {
            return a.f421c;
        }

        private C0001a() {
        }
    }

    private /* synthetic */ a(int i10) {
        this.f423a = i10;
    }

    public static final /* synthetic */ a c(int i10) {
        return new a(i10);
    }

    public static boolean e(int i10, Object obj) {
        if ((obj instanceof a) && i10 == ((a) obj).i()) {
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

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        if (f(i10, f421c)) {
            return "Touch";
        }
        if (f(i10, f422d)) {
            return "Keyboard";
        }
        return "Error";
    }

    public boolean equals(Object obj) {
        return e(this.f423a, obj);
    }

    public int hashCode() {
        return g(this.f423a);
    }

    public final /* synthetic */ int i() {
        return this.f423a;
    }

    public String toString() {
        return h(this.f423a);
    }

    public static int d(int i10) {
        return i10;
    }
}

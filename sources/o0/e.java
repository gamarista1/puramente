package O0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f4530b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f4531c = d(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f4532d = d(1);

    /* renamed from: a  reason: collision with root package name */
    private final int f4533a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return e.f4532d;
        }

        public final int b() {
            return e.f4531c;
        }

        private a() {
        }
    }

    private /* synthetic */ e(int i10) {
        this.f4533a = i10;
    }

    public static final /* synthetic */ e c(int i10) {
        return new e(i10);
    }

    public static boolean e(int i10, Object obj) {
        if ((obj instanceof e) && i10 == ((e) obj).i()) {
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
        if (f(i10, f4531c)) {
            return "Polite";
        }
        if (f(i10, f4532d)) {
            return "Assertive";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f4533a, obj);
    }

    public int hashCode() {
        return g(this.f4533a);
    }

    public final /* synthetic */ int i() {
        return this.f4533a;
    }

    public String toString() {
        return h(this.f4533a);
    }

    private static int d(int i10) {
        return i10;
    }
}

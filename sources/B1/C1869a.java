package b1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: b1.a  reason: case insensitive filesystem */
public final class C1869a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0329a f19059b = new C0329a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final float f19060c = c(0.5f);

    /* renamed from: d  reason: collision with root package name */
    private static final float f19061d = c(-0.5f);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final float f19062e = c(0.0f);

    /* renamed from: a  reason: collision with root package name */
    private final float f19063a;

    /* renamed from: b1.a$a  reason: collision with other inner class name */
    public static final class C0329a {
        public /* synthetic */ C0329a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return C1869a.f19062e;
        }

        private C0329a() {
        }
    }

    private /* synthetic */ C1869a(float f10) {
        this.f19063a = f10;
    }

    public static final /* synthetic */ C1869a b(float f10) {
        return new C1869a(f10);
    }

    public static boolean d(float f10, Object obj) {
        if ((obj instanceof C1869a) && Float.compare(f10, ((C1869a) obj).h()) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean e(float f10, float f11) {
        if (Float.compare(f10, f11) == 0) {
            return true;
        }
        return false;
    }

    public static int f(float f10) {
        return Float.hashCode(f10);
    }

    public static String g(float f10) {
        return "BaselineShift(multiplier=" + f10 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f19063a, obj);
    }

    public final /* synthetic */ float h() {
        return this.f19063a;
    }

    public int hashCode() {
        return f(this.f19063a);
    }

    public String toString() {
        return g(this.f19063a);
    }

    public static float c(float f10) {
        return f10;
    }
}

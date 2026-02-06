package c1;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class h implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19213b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final float f19214c = j(0.0f);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final float f19215d = j(Float.POSITIVE_INFINITY);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final float f19216e = j(Float.NaN);

    /* renamed from: a  reason: collision with root package name */
    private final float f19217a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return h.f19214c;
        }

        public final float b() {
            return h.f19215d;
        }

        public final float c() {
            return h.f19216e;
        }

        private a() {
        }
    }

    private /* synthetic */ h(float f10) {
        this.f19217a = f10;
    }

    public static final /* synthetic */ h e(float f10) {
        return new h(f10);
    }

    public static int i(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    public static boolean l(float f10, Object obj) {
        if ((obj instanceof h) && Float.compare(f10, ((h) obj).r()) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean m(float f10, float f11) {
        if (Float.compare(f10, f11) == 0) {
            return true;
        }
        return false;
    }

    public static int o(float f10) {
        return Float.hashCode(f10);
    }

    public static String p(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return f(((h) obj).r());
    }

    public boolean equals(Object obj) {
        return l(this.f19217a, obj);
    }

    public int f(float f10) {
        return i(this.f19217a, f10);
    }

    public int hashCode() {
        return o(this.f19217a);
    }

    public final /* synthetic */ float r() {
        return this.f19217a;
    }

    public String toString() {
        return p(this.f19217a);
    }

    public static float j(float f10) {
        return f10;
    }
}

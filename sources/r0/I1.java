package r0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class I1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f25425b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f25426c = g(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f25427d = g(1);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f25428e = g(2);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f25429f = g(3);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f25430g = g(4);

    /* renamed from: a  reason: collision with root package name */
    private final int f25431a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return I1.f25427d;
        }

        public final int b() {
            return I1.f25426c;
        }

        public final int c() {
            return I1.f25429f;
        }

        public final int d() {
            return I1.f25430g;
        }

        public final int e() {
            return I1.f25428e;
        }

        private a() {
        }
    }

    private /* synthetic */ I1(int i10) {
        this.f25431a = i10;
    }

    public static final /* synthetic */ I1 f(int i10) {
        return new I1(i10);
    }

    public static boolean h(int i10, Object obj) {
        if ((obj instanceof I1) && i10 == ((I1) obj).l()) {
            return true;
        }
        return false;
    }

    public static final boolean i(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    public static String k(int i10) {
        if (i(i10, f25426c)) {
            return "Argb8888";
        }
        if (i(i10, f25427d)) {
            return "Alpha8";
        }
        if (i(i10, f25428e)) {
            return "Rgb565";
        }
        if (i(i10, f25429f)) {
            return "F16";
        }
        if (i(i10, f25430g)) {
            return "Gpu";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return h(this.f25431a, obj);
    }

    public int hashCode() {
        return j(this.f25431a);
    }

    public final /* synthetic */ int l() {
        return this.f25431a;
    }

    public String toString() {
        return k(this.f25431a);
    }

    public static int g(int i10) {
        return i10;
    }
}

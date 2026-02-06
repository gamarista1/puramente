package b1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: b1.e  reason: case insensitive filesystem */
public final class C1873e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19067b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f19068c = e(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f19069d = e(2);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f19070e = e(Integer.MIN_VALUE);

    /* renamed from: a  reason: collision with root package name */
    private final int f19071a;

    /* renamed from: b1.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C1873e.f19069d;
        }

        public final int b() {
            return C1873e.f19068c;
        }

        public final int c() {
            return C1873e.f19070e;
        }

        private a() {
        }
    }

    private /* synthetic */ C1873e(int i10) {
        this.f19071a = i10;
    }

    public static final /* synthetic */ C1873e d(int i10) {
        return new C1873e(i10);
    }

    public static boolean f(int i10, Object obj) {
        if ((obj instanceof C1873e) && i10 == ((C1873e) obj).j()) {
            return true;
        }
        return false;
    }

    public static final boolean g(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        if (g(i10, f19068c)) {
            return "Hyphens.None";
        }
        if (g(i10, f19069d)) {
            return "Hyphens.Auto";
        }
        if (g(i10, f19070e)) {
            return "Hyphens.Unspecified";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f19071a, obj);
    }

    public int hashCode() {
        return h(this.f19071a);
    }

    public final /* synthetic */ int j() {
        return this.f19071a;
    }

    public String toString() {
        return i(this.f19071a);
    }

    private static int e(int i10) {
        return i10;
    }
}

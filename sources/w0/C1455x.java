package W0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: W0.x  reason: case insensitive filesystem */
public final class C1455x {

    /* renamed from: b  reason: collision with root package name */
    public static final a f8616b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f8617c = g(-1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f8618d = g(0);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f8619e = g(1);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f8620f = g(2);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f8621g = g(3);

    /* renamed from: a  reason: collision with root package name */
    private final int f8622a;

    /* renamed from: W0.x$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C1455x.f8619e;
        }

        public final int b() {
            return C1455x.f8618d;
        }

        public final int c() {
            return C1455x.f8621g;
        }

        public final int d() {
            return C1455x.f8617c;
        }

        public final int e() {
            return C1455x.f8620f;
        }

        private a() {
        }
    }

    private /* synthetic */ C1455x(int i10) {
        this.f8622a = i10;
    }

    public static final /* synthetic */ C1455x f(int i10) {
        return new C1455x(i10);
    }

    public static boolean h(int i10, Object obj) {
        if ((obj instanceof C1455x) && i10 == ((C1455x) obj).l()) {
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
        if (i(i10, f8617c)) {
            return "Unspecified";
        }
        if (i(i10, f8618d)) {
            return "None";
        }
        if (i(i10, f8619e)) {
            return "Characters";
        }
        if (i(i10, f8620f)) {
            return "Words";
        }
        if (i(i10, f8621g)) {
            return "Sentences";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return h(this.f8622a, obj);
    }

    public int hashCode() {
        return j(this.f8622a);
    }

    public final /* synthetic */ int l() {
        return this.f8622a;
    }

    public String toString() {
        return k(this.f8622a);
    }

    private static int g(int i10) {
        return i10;
    }
}

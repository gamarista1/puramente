package V0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final a f8204b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f8205c = f(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f8206d = f(1);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f8207e = f(2);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f8208f = f(3);

    /* renamed from: a  reason: collision with root package name */
    private final int f8209a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return o.f8206d;
        }

        public final int b() {
            return o.f8205c;
        }

        public final int c() {
            return o.f8208f;
        }

        public final int d() {
            return o.f8207e;
        }

        private a() {
        }
    }

    private /* synthetic */ o(int i10) {
        this.f8209a = i10;
    }

    public static final /* synthetic */ o e(int i10) {
        return new o(i10);
    }

    public static boolean g(int i10, Object obj) {
        if ((obj instanceof o) && i10 == ((o) obj).k()) {
            return true;
        }
        return false;
    }

    public static final boolean h(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }

    public static String j(int i10) {
        if (h(i10, f8205c)) {
            return "None";
        }
        if (h(i10, f8206d)) {
            return "All";
        }
        if (h(i10, f8207e)) {
            return "Weight";
        }
        if (h(i10, f8208f)) {
            return "Style";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return g(this.f8209a, obj);
    }

    public int hashCode() {
        return i(this.f8209a);
    }

    public final /* synthetic */ int k() {
        return this.f8209a;
    }

    public String toString() {
        return j(this.f8209a);
    }

    public static int f(int i10) {
        return i10;
    }
}

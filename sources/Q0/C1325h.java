package Q0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Q0.h  reason: case insensitive filesystem */
public final class C1325h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f5340b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f5341c = e(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f5342d = e(1);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f5343e = e(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f5344a;

    /* renamed from: Q0.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C1325h.f5343e;
        }

        public final int b() {
            return C1325h.f5341c;
        }

        public final int c() {
            return C1325h.f5342d;
        }

        private a() {
        }
    }

    private /* synthetic */ C1325h(int i10) {
        this.f5344a = i10;
    }

    public static final /* synthetic */ C1325h d(int i10) {
        return new C1325h(i10);
    }

    public static boolean f(int i10, Object obj) {
        if ((obj instanceof C1325h) && i10 == ((C1325h) obj).j()) {
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
        if (i10 == f5341c) {
            return "EmojiSupportMatch.Default";
        }
        if (i10 == f5342d) {
            return "EmojiSupportMatch.None";
        }
        if (i10 == f5343e) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f5344a, obj);
    }

    public int hashCode() {
        return h(this.f5344a);
    }

    public final /* synthetic */ int j() {
        return this.f5344a;
    }

    public String toString() {
        return i(this.f5344a);
    }

    private static int e(int i10) {
        return i10;
    }
}

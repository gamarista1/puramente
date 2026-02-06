package D0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class O {

    /* renamed from: a  reason: collision with root package name */
    public static final a f1413a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f1414b = f(0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f1415c = f(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f1416d = f(2);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f1417e = f(3);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f1418f = f(4);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return O.f1418f;
        }

        public final int b() {
            return O.f1416d;
        }

        public final int c() {
            return O.f1417e;
        }

        public final int d() {
            return O.f1415c;
        }

        public final int e() {
            return O.f1414b;
        }

        private a() {
        }
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
        if (i10 == 1) {
            return "Touch";
        }
        if (i10 == 2) {
            return "Mouse";
        }
        if (i10 == 3) {
            return "Stylus";
        }
        if (i10 != 4) {
            return "Unknown";
        }
        return "Eraser";
    }

    private static int f(int i10) {
        return i10;
    }
}

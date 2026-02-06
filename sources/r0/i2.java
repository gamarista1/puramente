package r0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class i2 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f25529a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f25530b = d(0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f25531c = d(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f25532d = d(2);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return i2.f25530b;
        }

        public final int b() {
            return i2.f25531c;
        }

        public final int c() {
            return i2.f25532d;
        }

        private a() {
        }
    }

    public static final boolean e(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        if (e(i10, f25530b)) {
            return "Butt";
        }
        if (e(i10, f25531c)) {
            return "Round";
        }
        if (e(i10, f25532d)) {
            return "Square";
        }
        return "Unknown";
    }

    public static int d(int i10) {
        return i10;
    }
}

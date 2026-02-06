package r0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class j2 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f25533a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f25534b = d(0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f25535c = d(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f25536d = d(2);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return j2.f25536d;
        }

        public final int b() {
            return j2.f25534b;
        }

        public final int c() {
            return j2.f25535c;
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
        if (e(i10, f25534b)) {
            return "Miter";
        }
        if (e(i10, f25535c)) {
            return "Round";
        }
        if (e(i10, f25536d)) {
            return "Bevel";
        }
        return "Unknown";
    }

    public static int d(int i10) {
        return i10;
    }
}

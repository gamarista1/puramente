package r0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class k2 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f25537a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f25538b = e(0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f25539c = e(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f25540d = e(2);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f25541e = e(3);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return k2.f25538b;
        }

        public final int b() {
            return k2.f25541e;
        }

        public final int c() {
            return k2.f25540d;
        }

        public final int d() {
            return k2.f25539c;
        }

        private a() {
        }
    }

    public static final boolean f(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        if (f(i10, f25538b)) {
            return "Clamp";
        }
        if (f(i10, f25539c)) {
            return "Repeated";
        }
        if (f(i10, f25540d)) {
            return "Mirror";
        }
        if (f(i10, f25541e)) {
            return "Decal";
        }
        return "Unknown";
    }

    public static int e(int i10) {
        return i10;
    }
}

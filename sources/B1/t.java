package b1;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final a f19154a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f19155b = d(1);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f19156c = d(2);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f19157d = d(3);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return t.f19155b;
        }

        public final int b() {
            return t.f19156c;
        }

        public final int c() {
            return t.f19157d;
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
        if (e(i10, f19155b)) {
            return "Clip";
        }
        if (e(i10, f19156c)) {
            return "Ellipsis";
        }
        if (e(i10, f19157d)) {
            return "Visible";
        }
        return "Invalid";
    }

    public static int d(int i10) {
        return i10;
    }
}

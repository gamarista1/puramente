package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0255a f13386a = new C0255a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f13387b = d(0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f13388c = d(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f13389d = d(2);

    /* renamed from: androidx.compose.ui.graphics.a$a  reason: collision with other inner class name */
    public static final class C0255a {
        public /* synthetic */ C0255a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return a.f13387b;
        }

        public final int b() {
            return a.f13389d;
        }

        public final int c() {
            return a.f13388c;
        }

        private C0255a() {
        }
    }

    public static int d(int i10) {
        return i10;
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        return "CompositingStrategy(value=" + i10 + ')';
    }
}

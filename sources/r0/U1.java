package r0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class U1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f25466a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f25467b = c(0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f25468c = c(1);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return U1.f25468c;
        }

        public final int b() {
            return U1.f25467b;
        }

        private a() {
        }
    }

    public static final boolean d(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static int e(int i10) {
        return Integer.hashCode(i10);
    }

    public static int c(int i10) {
        return i10;
    }
}

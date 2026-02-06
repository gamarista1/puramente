package r0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class C1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f25397a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f25398b = c(0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f25399c = c(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f25400d = c(2);

    /* renamed from: e  reason: collision with root package name */
    private static final int f25401e = c(3);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C1.f25399c;
        }

        public final int b() {
            return C1.f25398b;
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

    public static String f(int i10) {
        if (d(i10, f25398b)) {
            return "None";
        }
        if (d(i10, f25399c)) {
            return "Low";
        }
        if (d(i10, f25400d)) {
            return "Medium";
        }
        if (d(i10, f25401e)) {
            return "High";
        }
        return "Unknown";
    }

    public static int c(int i10) {
        return i10;
    }
}

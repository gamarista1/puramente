package w;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w.t  reason: case insensitive filesystem */
public abstract class C2808t {

    /* renamed from: a  reason: collision with root package name */
    public static final a f27575a = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final int f27576b = b(5);

    /* renamed from: c  reason: collision with root package name */
    private static final int f27577c = b(4);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f27578d = b(0);

    /* renamed from: w.t$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C2808t.f27578d;
        }

        private a() {
        }
    }

    public static final boolean c(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String e(int i10) {
        return "ArcMode(value=" + i10 + ')';
    }

    public static int b(int i10) {
        return i10;
    }
}

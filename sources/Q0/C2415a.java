package q0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q0.a  reason: case insensitive filesystem */
public abstract class C2415a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0425a f25314a = new C0425a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final long f25315b = C2416b.b(0.0f, 0.0f, 2, (Object) null);

    /* renamed from: q0.a$a  reason: collision with other inner class name */
    public static final class C0425a {
        public /* synthetic */ C0425a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return C2415a.f25315b;
        }

        private C0425a() {
        }
    }

    public static final boolean c(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final float d(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float e(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int f(long j10) {
        return Long.hashCode(j10);
    }

    public static String g(long j10) {
        if (d(j10) == e(j10)) {
            return "CornerRadius.circular(" + C2417c.a(d(j10), 1) + ')';
        }
        return "CornerRadius.elliptical(" + C2417c.a(d(j10), 1) + ", " + C2417c.a(e(j10), 1) + ')';
    }

    public static long b(long j10) {
        return j10;
    }
}

package O;

import c1.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0112a f4454a = new C0112a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final long f4455b = b(Float.NaN, Float.NaN);

    /* renamed from: O.a$a  reason: collision with other inner class name */
    public static final class C0112a {
        public /* synthetic */ C0112a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a.f4455b;
        }

        private C0112a() {
        }
    }

    public static long b(float f10, float f11) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f10);
        return c((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static long d(d dVar) {
        return b(dVar.getDensity(), dVar.r1());
    }

    public static final boolean e(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final float f(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float g(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static String h(long j10) {
        return "InlineDensity(density=" + f(j10) + ", fontScale=" + g(j10) + ')';
    }

    private static long c(long j10) {
        return j10;
    }
}

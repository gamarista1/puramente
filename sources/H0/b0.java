package H0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2567a = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final long f2568b = c0.a(Float.NaN, Float.NaN);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final float b(long j10) {
        boolean z10;
        if (j10 != f2568b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            G0.a.b("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        boolean z10;
        if (j10 != f2568b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            G0.a.b("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static long a(long j10) {
        return j10;
    }
}

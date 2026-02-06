package s0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: s0.b  reason: case insensitive filesystem */
public abstract class C2580b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f25785a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final long f25786b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f25787c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f25788d;

    /* renamed from: e  reason: collision with root package name */
    private static final long f25789e;

    /* renamed from: s0.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return C2580b.f25788d;
        }

        public final long b() {
            return C2580b.f25786b;
        }

        public final long c() {
            return C2580b.f25787c;
        }

        private a() {
        }
    }

    static {
        long j10 = (long) 3;
        long j11 = j10 << 32;
        f25786b = d((((long) 0) & 4294967295L) | j11);
        f25787c = d((((long) 1) & 4294967295L) | j11);
        f25788d = d(j11 | (((long) 2) & 4294967295L));
        f25789e = d((j10 & 4294967295L) | (((long) 4) << 32));
    }

    public static final boolean e(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final int f(long j10) {
        return (int) (j10 >> 32);
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        if (e(j10, f25786b)) {
            return "Rgb";
        }
        if (e(j10, f25787c)) {
            return "Xyz";
        }
        if (e(j10, f25788d)) {
            return "Lab";
        }
        if (e(j10, f25789e)) {
            return "Cmyk";
        }
        return "Unknown";
    }

    public static long d(long j10) {
        return j10;
    }
}

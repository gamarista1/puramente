package c1;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class x {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19246b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f19247c = e(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f19248d = e(4294967296L);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final long f19249e = e(8589934592L);

    /* renamed from: a  reason: collision with root package name */
    private final long f19250a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return x.f19249e;
        }

        public final long b() {
            return x.f19248d;
        }

        public final long c() {
            return x.f19247c;
        }

        private a() {
        }
    }

    private /* synthetic */ x(long j10) {
        this.f19250a = j10;
    }

    public static final /* synthetic */ x d(long j10) {
        return new x(j10);
    }

    public static boolean f(long j10, Object obj) {
        if ((obj instanceof x) && j10 == ((x) obj).j()) {
            return true;
        }
        return false;
    }

    public static final boolean g(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        if (g(j10, f19247c)) {
            return "Unspecified";
        }
        if (g(j10, f19248d)) {
            return "Sp";
        }
        if (g(j10, f19249e)) {
            return "Em";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f19250a, obj);
    }

    public int hashCode() {
        return h(this.f19250a);
    }

    public final /* synthetic */ long j() {
        return this.f19250a;
    }

    public String toString() {
        return i(this.f19250a);
    }

    public static long e(long j10) {
        return j10;
    }
}

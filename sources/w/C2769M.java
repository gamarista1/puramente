package w;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w.M  reason: case insensitive filesystem */
public final class C2769M implements C2797i {

    /* renamed from: d  reason: collision with root package name */
    public static final int f27197d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C2759C f27198a;

    /* renamed from: b  reason: collision with root package name */
    private final C2785b0 f27199b;

    /* renamed from: c  reason: collision with root package name */
    private final long f27200c;

    public /* synthetic */ C2769M(C2759C c10, C2785b0 b0Var, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c10, b0Var, j10);
    }

    public u0 a(r0 r0Var) {
        return new B0(this.f27198a.a(r0Var), this.f27199b, this.f27200c, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2769M)) {
            return false;
        }
        C2769M m10 = (C2769M) obj;
        if (!C6496s.c(m10.f27198a, this.f27198a) || m10.f27199b != this.f27199b || !j0.d(m10.f27200c, this.f27200c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f27198a.hashCode() * 31) + this.f27199b.hashCode()) * 31) + j0.e(this.f27200c);
    }

    private C2769M(C2759C c10, C2785b0 b0Var, long j10) {
        this.f27198a = c10;
        this.f27199b = b0Var;
        this.f27200c = j10;
    }
}

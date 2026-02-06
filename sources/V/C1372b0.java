package V;

import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;

/* renamed from: V.b0  reason: case insensitive filesystem */
public final class C1372b0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f7276a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7277b;

    /* renamed from: c  reason: collision with root package name */
    private final long f7278c;

    /* renamed from: d  reason: collision with root package name */
    private final long f7279d;

    /* renamed from: e  reason: collision with root package name */
    private final long f7280e;

    /* renamed from: f  reason: collision with root package name */
    private final long f7281f;

    public /* synthetic */ C1372b0(long j10, long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15);
    }

    public final long a(boolean z10) {
        if (z10) {
            return this.f7277b;
        }
        return this.f7280e;
    }

    public final long b(boolean z10) {
        if (z10) {
            return this.f7276a;
        }
        return this.f7279d;
    }

    public final long c(boolean z10) {
        if (z10) {
            return this.f7278c;
        }
        return this.f7281f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1372b0)) {
            return false;
        }
        C1372b0 b0Var = (C1372b0) obj;
        if (C2544x0.q(this.f7276a, b0Var.f7276a) && C2544x0.q(this.f7277b, b0Var.f7277b) && C2544x0.q(this.f7278c, b0Var.f7278c) && C2544x0.q(this.f7279d, b0Var.f7279d) && C2544x0.q(this.f7280e, b0Var.f7280e) && C2544x0.q(this.f7281f, b0Var.f7281f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((C2544x0.w(this.f7276a) * 31) + C2544x0.w(this.f7277b)) * 31) + C2544x0.w(this.f7278c)) * 31) + C2544x0.w(this.f7279d)) * 31) + C2544x0.w(this.f7280e)) * 31) + C2544x0.w(this.f7281f);
    }

    private C1372b0(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f7276a = j10;
        this.f7277b = j11;
        this.f7278c = j12;
        this.f7279d = j13;
        this.f7280e = j14;
        this.f7281f = j15;
    }
}

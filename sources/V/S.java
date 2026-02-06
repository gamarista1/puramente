package V;

import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;

public final class S {

    /* renamed from: a  reason: collision with root package name */
    private final long f7023a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7024b;

    /* renamed from: c  reason: collision with root package name */
    private final long f7025c;

    /* renamed from: d  reason: collision with root package name */
    private final long f7026d;

    public /* synthetic */ S(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    public static /* synthetic */ S d(S s10, long j10, long j11, long j12, long j13, int i10, Object obj) {
        long j14;
        long j15;
        long j16;
        long j17;
        S s11 = s10;
        if ((i10 & 1) != 0) {
            j14 = s11.f7023a;
        } else {
            j14 = j10;
        }
        if ((i10 & 2) != 0) {
            j15 = s11.f7024b;
        } else {
            j15 = j11;
        }
        if ((i10 & 4) != 0) {
            j16 = s11.f7025c;
        } else {
            j16 = j12;
        }
        if ((i10 & 8) != 0) {
            j17 = s11.f7026d;
        } else {
            j17 = j13;
        }
        return s10.c(j14, j15, j16, j17);
    }

    public final long a(boolean z10) {
        if (z10) {
            return this.f7023a;
        }
        return this.f7025c;
    }

    public final long b(boolean z10) {
        if (z10) {
            return this.f7024b;
        }
        return this.f7026d;
    }

    public final S c(long j10, long j11, long j12, long j13) {
        long j14;
        long j15;
        long j16;
        long j17;
        if (j10 != 16) {
            j14 = j10;
        } else {
            j14 = this.f7023a;
        }
        if (j11 != 16) {
            j15 = j11;
        } else {
            j15 = this.f7024b;
        }
        if (j12 != 16) {
            j16 = j12;
        } else {
            j16 = this.f7025c;
        }
        if (j13 != 16) {
            j17 = j13;
        } else {
            j17 = this.f7026d;
        }
        return new S(j14, j15, j16, j17, (DefaultConstructorMarker) null);
    }

    public final long e() {
        return this.f7024b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        if (C2544x0.q(this.f7023a, s10.f7023a) && C2544x0.q(this.f7024b, s10.f7024b) && C2544x0.q(this.f7025c, s10.f7025c) && C2544x0.q(this.f7026d, s10.f7026d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((C2544x0.w(this.f7023a) * 31) + C2544x0.w(this.f7024b)) * 31) + C2544x0.w(this.f7025c)) * 31) + C2544x0.w(this.f7026d);
    }

    private S(long j10, long j11, long j12, long j13) {
        this.f7023a = j10;
        this.f7024b = j11;
        this.f7025c = j12;
        this.f7026d = j13;
    }
}

package V;

import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;

/* renamed from: V.n  reason: case insensitive filesystem */
public final class C1395n {

    /* renamed from: a  reason: collision with root package name */
    private final long f7829a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7830b;

    /* renamed from: c  reason: collision with root package name */
    private final long f7831c;

    /* renamed from: d  reason: collision with root package name */
    private final long f7832d;

    public /* synthetic */ C1395n(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    public final long a(boolean z10) {
        if (z10) {
            return this.f7829a;
        }
        return this.f7831c;
    }

    public final long b(boolean z10) {
        if (z10) {
            return this.f7830b;
        }
        return this.f7832d;
    }

    public final C1395n c(long j10, long j11, long j12, long j13) {
        long j14;
        long j15;
        long j16;
        long j17;
        if (j10 != 16) {
            j14 = j10;
        } else {
            j14 = this.f7829a;
        }
        if (j11 != 16) {
            j15 = j11;
        } else {
            j15 = this.f7830b;
        }
        if (j12 != 16) {
            j16 = j12;
        } else {
            j16 = this.f7831c;
        }
        if (j13 != 16) {
            j17 = j13;
        } else {
            j17 = this.f7832d;
        }
        return new C1395n(j14, j15, j16, j17, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1395n)) {
            return false;
        }
        C1395n nVar = (C1395n) obj;
        if (C2544x0.q(this.f7829a, nVar.f7829a) && C2544x0.q(this.f7830b, nVar.f7830b) && C2544x0.q(this.f7831c, nVar.f7831c) && C2544x0.q(this.f7832d, nVar.f7832d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((C2544x0.w(this.f7829a) * 31) + C2544x0.w(this.f7830b)) * 31) + C2544x0.w(this.f7831c)) * 31) + C2544x0.w(this.f7832d);
    }

    private C1395n(long j10, long j11, long j12, long j13) {
        this.f7829a = j10;
        this.f7830b = j11;
        this.f7831c = j12;
        this.f7832d = j13;
    }
}

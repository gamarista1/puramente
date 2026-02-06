package V;

import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;

/* renamed from: V.j  reason: case insensitive filesystem */
public final class C1387j {

    /* renamed from: a  reason: collision with root package name */
    private final long f7674a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7675b;

    /* renamed from: c  reason: collision with root package name */
    private final long f7676c;

    /* renamed from: d  reason: collision with root package name */
    private final long f7677d;

    public /* synthetic */ C1387j(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    public final long a(boolean z10) {
        if (z10) {
            return this.f7674a;
        }
        return this.f7676c;
    }

    public final long b(boolean z10) {
        if (z10) {
            return this.f7675b;
        }
        return this.f7677d;
    }

    public final C1387j c(long j10, long j11, long j12, long j13) {
        long j14;
        long j15;
        long j16;
        long j17;
        if (j10 != 16) {
            j14 = j10;
        } else {
            j14 = this.f7674a;
        }
        if (j11 != 16) {
            j15 = j11;
        } else {
            j15 = this.f7675b;
        }
        if (j12 != 16) {
            j16 = j12;
        } else {
            j16 = this.f7676c;
        }
        if (j13 != 16) {
            j17 = j13;
        } else {
            j17 = this.f7677d;
        }
        return new C1387j(j14, j15, j16, j17, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1387j)) {
            return false;
        }
        C1387j jVar = (C1387j) obj;
        if (C2544x0.q(this.f7674a, jVar.f7674a) && C2544x0.q(this.f7675b, jVar.f7675b) && C2544x0.q(this.f7676c, jVar.f7676c) && C2544x0.q(this.f7677d, jVar.f7677d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((C2544x0.w(this.f7674a) * 31) + C2544x0.w(this.f7675b)) * 31) + C2544x0.w(this.f7676c)) * 31) + C2544x0.w(this.f7677d);
    }

    private C1387j(long j10, long j11, long j12, long j13) {
        this.f7674a = j10;
        this.f7675b = j11;
        this.f7676c = j12;
        this.f7677d = j13;
    }
}

package V;

import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;
import r0.C2550z0;
import w.C2762F;

public final class U0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f7116a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7117b;

    /* renamed from: c  reason: collision with root package name */
    private final long f7118c;

    /* renamed from: d  reason: collision with root package name */
    private final long f7119d;

    /* renamed from: e  reason: collision with root package name */
    private final long f7120e;

    public /* synthetic */ U0(long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14);
    }

    public final long a(float f10) {
        return C2550z0.i(this.f7116a, this.f7117b, C2762F.c().a(f10));
    }

    public final U0 b(long j10, long j11, long j12, long j13, long j14) {
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        if (j10 != 16) {
            j15 = j10;
        } else {
            j15 = this.f7116a;
        }
        if (j11 != 16) {
            j16 = j11;
        } else {
            j16 = this.f7117b;
        }
        if (j12 != 16) {
            j17 = j12;
        } else {
            j17 = this.f7118c;
        }
        if (j13 != 16) {
            j18 = j13;
        } else {
            j18 = this.f7119d;
        }
        if (j14 != 16) {
            j19 = j14;
        } else {
            j19 = this.f7120e;
        }
        return new U0(j15, j16, j17, j18, j19, (DefaultConstructorMarker) null);
    }

    public final long c() {
        return this.f7120e;
    }

    public final long d() {
        return this.f7118c;
    }

    public final long e() {
        return this.f7119d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof U0)) {
            return false;
        }
        U0 u02 = (U0) obj;
        if (C2544x0.q(this.f7116a, u02.f7116a) && C2544x0.q(this.f7117b, u02.f7117b) && C2544x0.q(this.f7118c, u02.f7118c) && C2544x0.q(this.f7119d, u02.f7119d) && C2544x0.q(this.f7120e, u02.f7120e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((C2544x0.w(this.f7116a) * 31) + C2544x0.w(this.f7117b)) * 31) + C2544x0.w(this.f7118c)) * 31) + C2544x0.w(this.f7119d)) * 31) + C2544x0.w(this.f7120e);
    }

    private U0(long j10, long j11, long j12, long j13, long j14) {
        this.f7116a = j10;
        this.f7117b = j11;
        this.f7118c = j12;
        this.f7119d = j13;
        this.f7120e = j14;
    }
}

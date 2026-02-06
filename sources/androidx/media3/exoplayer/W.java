package androidx.media3.exoplayer;

import i2.C2076a;
import i2.L;
import t2.C2615C;

final class W {

    /* renamed from: a  reason: collision with root package name */
    public final C2615C.b f17564a;

    /* renamed from: b  reason: collision with root package name */
    public final long f17565b;

    /* renamed from: c  reason: collision with root package name */
    public final long f17566c;

    /* renamed from: d  reason: collision with root package name */
    public final long f17567d;

    /* renamed from: e  reason: collision with root package name */
    public final long f17568e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f17569f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f17570g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f17571h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f17572i;

    W(C2615C.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16 = z10;
        boolean z17 = z11;
        boolean z18 = z12;
        boolean z19 = z13;
        boolean z20 = true;
        if (!z19 || z17) {
            z14 = true;
        } else {
            z14 = false;
        }
        C2076a.a(z14);
        if (!z18 || z17) {
            z15 = true;
        } else {
            z15 = false;
        }
        C2076a.a(z15);
        if (z16 && (z17 || z18 || z19)) {
            z20 = false;
        }
        C2076a.a(z20);
        this.f17564a = bVar;
        this.f17565b = j10;
        this.f17566c = j11;
        this.f17567d = j12;
        this.f17568e = j13;
        this.f17569f = z16;
        this.f17570g = z17;
        this.f17571h = z18;
        this.f17572i = z19;
    }

    public W a(long j10) {
        if (j10 == this.f17566c) {
            return this;
        }
        return new W(this.f17564a, this.f17565b, j10, this.f17567d, this.f17568e, this.f17569f, this.f17570g, this.f17571h, this.f17572i);
    }

    public W b(long j10) {
        if (j10 == this.f17565b) {
            return this;
        }
        return new W(this.f17564a, j10, this.f17566c, this.f17567d, this.f17568e, this.f17569f, this.f17570g, this.f17571h, this.f17572i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W.class != obj.getClass()) {
            return false;
        }
        W w10 = (W) obj;
        if (this.f17565b == w10.f17565b && this.f17566c == w10.f17566c && this.f17567d == w10.f17567d && this.f17568e == w10.f17568e && this.f17569f == w10.f17569f && this.f17570g == w10.f17570g && this.f17571h == w10.f17571h && this.f17572i == w10.f17572i && L.c(this.f17564a, w10.f17564a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f17564a.hashCode()) * 31) + ((int) this.f17565b)) * 31) + ((int) this.f17566c)) * 31) + ((int) this.f17567d)) * 31) + ((int) this.f17568e)) * 31) + (this.f17569f ? 1 : 0)) * 31) + (this.f17570g ? 1 : 0)) * 31) + (this.f17571h ? 1 : 0)) * 31) + (this.f17572i ? 1 : 0);
    }
}

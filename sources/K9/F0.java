package k9;

import N9.C3070t;
import ja.C3645a;
import ja.M;

final class F0 {

    /* renamed from: a  reason: collision with root package name */
    public final C3070t.b f45281a;

    /* renamed from: b  reason: collision with root package name */
    public final long f45282b;

    /* renamed from: c  reason: collision with root package name */
    public final long f45283c;

    /* renamed from: d  reason: collision with root package name */
    public final long f45284d;

    /* renamed from: e  reason: collision with root package name */
    public final long f45285e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f45286f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f45287g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f45288h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f45289i;

    F0(C3070t.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
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
        C3645a.a(z14);
        if (!z18 || z17) {
            z15 = true;
        } else {
            z15 = false;
        }
        C3645a.a(z15);
        if (z16 && (z17 || z18 || z19)) {
            z20 = false;
        }
        C3645a.a(z20);
        this.f45281a = bVar;
        this.f45282b = j10;
        this.f45283c = j11;
        this.f45284d = j12;
        this.f45285e = j13;
        this.f45286f = z16;
        this.f45287g = z17;
        this.f45288h = z18;
        this.f45289i = z19;
    }

    public F0 a(long j10) {
        if (j10 == this.f45283c) {
            return this;
        }
        return new F0(this.f45281a, this.f45282b, j10, this.f45284d, this.f45285e, this.f45286f, this.f45287g, this.f45288h, this.f45289i);
    }

    public F0 b(long j10) {
        if (j10 == this.f45282b) {
            return this;
        }
        return new F0(this.f45281a, j10, this.f45283c, this.f45284d, this.f45285e, this.f45286f, this.f45287g, this.f45288h, this.f45289i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F0.class != obj.getClass()) {
            return false;
        }
        F0 f02 = (F0) obj;
        if (this.f45282b == f02.f45282b && this.f45283c == f02.f45283c && this.f45284d == f02.f45284d && this.f45285e == f02.f45285e && this.f45286f == f02.f45286f && this.f45287g == f02.f45287g && this.f45288h == f02.f45288h && this.f45289i == f02.f45289i && M.c(this.f45281a, f02.f45281a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f45281a.hashCode()) * 31) + ((int) this.f45282b)) * 31) + ((int) this.f45283c)) * 31) + ((int) this.f45284d)) * 31) + ((int) this.f45285e)) * 31) + (this.f45286f ? 1 : 0)) * 31) + (this.f45287g ? 1 : 0)) * 31) + (this.f45288h ? 1 : 0)) * 31) + (this.f45289i ? 1 : 0);
    }
}

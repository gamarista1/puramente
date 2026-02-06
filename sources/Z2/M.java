package z2;

import z2.J;

public final class M implements J {

    /* renamed from: a  reason: collision with root package name */
    private final long f29121a;

    /* renamed from: b  reason: collision with root package name */
    private final long f29122b;

    public M(long j10) {
        this(j10, 0);
    }

    public J.a c(long j10) {
        return new J.a(new K(j10, this.f29122b));
    }

    public boolean e() {
        return true;
    }

    public long g() {
        return this.f29121a;
    }

    public M(long j10, long j11) {
        this.f29121a = j10;
        this.f29122b = j11;
    }
}

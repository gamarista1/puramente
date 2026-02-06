package P9;

import java.util.NoSuchElementException;

public abstract class b implements o {

    /* renamed from: b  reason: collision with root package name */
    private final long f33577b;

    /* renamed from: c  reason: collision with root package name */
    private final long f33578c;

    /* renamed from: d  reason: collision with root package name */
    private long f33579d;

    public b(long j10, long j11) {
        this.f33577b = j10;
        this.f33578c = j11;
        f();
    }

    /* access modifiers changed from: protected */
    public final void c() {
        long j10 = this.f33579d;
        if (j10 < this.f33577b || j10 > this.f33578c) {
            throw new NoSuchElementException();
        }
    }

    /* access modifiers changed from: protected */
    public final long d() {
        return this.f33579d;
    }

    public boolean e() {
        if (this.f33579d > this.f33578c) {
            return true;
        }
        return false;
    }

    public void f() {
        this.f33579d = this.f33577b - 1;
    }

    public boolean next() {
        this.f33579d++;
        return !e();
    }
}

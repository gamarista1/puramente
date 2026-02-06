package Ef;

import java.util.NoSuchElementException;
import mf.M;

public final class k extends M {

    /* renamed from: a  reason: collision with root package name */
    private final long f62831a;

    /* renamed from: b  reason: collision with root package name */
    private final long f62832b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f62833c;

    /* renamed from: d  reason: collision with root package name */
    private long f62834d;

    public k(long j10, long j11, long j12) {
        this.f62831a = j12;
        this.f62832b = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.f62833c = z10;
        this.f62834d = !z10 ? j11 : j10;
    }

    public long a() {
        long j10 = this.f62834d;
        if (j10 != this.f62832b) {
            this.f62834d = this.f62831a + j10;
        } else if (this.f62833c) {
            this.f62833c = false;
        } else {
            throw new NoSuchElementException();
        }
        return j10;
    }

    public boolean hasNext() {
        return this.f62833c;
    }
}

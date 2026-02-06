package Gh;

import kotlin.jvm.internal.C6496s;

/* renamed from: Gh.n  reason: case insensitive filesystem */
public abstract class C5413n implements U {

    /* renamed from: a  reason: collision with root package name */
    private final U f63323a;

    public C5413n(U u10) {
        C6496s.h(u10, "delegate");
        this.f63323a = u10;
    }

    public void P(C5404e eVar, long j10) {
        C6496s.h(eVar, "source");
        this.f63323a.P(eVar, j10);
    }

    public void close() {
        this.f63323a.close();
    }

    public void flush() {
        this.f63323a.flush();
    }

    public X timeout() {
        return this.f63323a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f63323a + ')';
    }
}

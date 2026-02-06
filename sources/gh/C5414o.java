package Gh;

import kotlin.jvm.internal.C6496s;

/* renamed from: Gh.o  reason: case insensitive filesystem */
public abstract class C5414o implements W {

    /* renamed from: a  reason: collision with root package name */
    private final W f63324a;

    public C5414o(W w10) {
        C6496s.h(w10, "delegate");
        this.f63324a = w10;
    }

    public final W a() {
        return this.f63324a;
    }

    public void close() {
        this.f63324a.close();
    }

    public X timeout() {
        return this.f63324a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f63324a + ')';
    }

    public long y1(C5404e eVar, long j10) {
        C6496s.h(eVar, "sink");
        return this.f63324a.y1(eVar, j10);
    }
}

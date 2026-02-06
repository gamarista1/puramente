package Gh;

import java.io.OutputStream;
import kotlin.jvm.internal.C6496s;

final class L implements U {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f63221a;

    /* renamed from: b  reason: collision with root package name */
    private final X f63222b;

    public L(OutputStream outputStream, X x10) {
        C6496s.h(outputStream, "out");
        C6496s.h(x10, "timeout");
        this.f63221a = outputStream;
        this.f63222b = x10;
    }

    public void P(C5404e eVar, long j10) {
        C6496s.h(eVar, "source");
        C5401b.b(eVar.B0(), 0, j10);
        while (j10 > 0) {
            this.f63222b.f();
            Q q10 = eVar.f63284a;
            C6496s.e(q10);
            int min = (int) Math.min(j10, (long) (q10.f63243c - q10.f63242b));
            this.f63221a.write(q10.f63241a, q10.f63242b, min);
            q10.f63242b += min;
            long j11 = (long) min;
            j10 -= j11;
            eVar.x0(eVar.B0() - j11);
            if (q10.f63242b == q10.f63243c) {
                eVar.f63284a = q10.b();
                S.b(q10);
            }
        }
    }

    public void close() {
        this.f63221a.close();
    }

    public void flush() {
        this.f63221a.flush();
    }

    public X timeout() {
        return this.f63222b;
    }

    public String toString() {
        return "sink(" + this.f63221a + ')';
    }
}

package Gh;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.C6496s;

/* renamed from: Gh.s  reason: case insensitive filesystem */
class C5417s implements W {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f63335a;

    /* renamed from: b  reason: collision with root package name */
    private final X f63336b;

    public C5417s(InputStream inputStream, X x10) {
        C6496s.h(inputStream, MetricTracker.Object.INPUT);
        C6496s.h(x10, "timeout");
        this.f63335a = inputStream;
        this.f63336b = x10;
    }

    public void close() {
        this.f63335a.close();
    }

    public X timeout() {
        return this.f63336b;
    }

    public String toString() {
        return "source(" + this.f63335a + ')';
    }

    public long y1(C5404e eVar, long j10) {
        C6496s.h(eVar, "sink");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 == 0) {
            return 0;
        }
        if (i10 >= 0) {
            try {
                this.f63336b.f();
                Q L02 = eVar.L0(1);
                int read = this.f63335a.read(L02.f63241a, L02.f63243c, (int) Math.min(j10, (long) (8192 - L02.f63243c)));
                if (read != -1) {
                    L02.f63243c += read;
                    long j11 = (long) read;
                    eVar.x0(eVar.B0() + j11);
                    return j11;
                } else if (L02.f63242b != L02.f63243c) {
                    return -1;
                } else {
                    eVar.f63284a = L02.b();
                    S.b(L02);
                    return -1;
                }
            } catch (AssertionError e10) {
                if (H.e(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
    }
}

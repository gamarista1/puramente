package Gh;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.C6496s;

public final class r implements W {

    /* renamed from: a  reason: collision with root package name */
    private final C5406g f63331a;

    /* renamed from: b  reason: collision with root package name */
    private final Inflater f63332b;

    /* renamed from: c  reason: collision with root package name */
    private int f63333c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f63334d;

    public r(C5406g gVar, Inflater inflater) {
        C6496s.h(gVar, "source");
        C6496s.h(inflater, "inflater");
        this.f63331a = gVar;
        this.f63332b = inflater;
    }

    private final void f() {
        int i10 = this.f63333c;
        if (i10 != 0) {
            int remaining = i10 - this.f63332b.getRemaining();
            this.f63333c -= remaining;
            this.f63331a.skip((long) remaining);
        }
    }

    public final long a(C5404e eVar, long j10) {
        C6496s.h(eVar, "sink");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (this.f63334d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        } else if (i10 == 0) {
            return 0;
        } else {
            try {
                Q L02 = eVar.L0(1);
                b();
                int inflate = this.f63332b.inflate(L02.f63241a, L02.f63243c, (int) Math.min(j10, (long) (8192 - L02.f63243c)));
                f();
                if (inflate > 0) {
                    L02.f63243c += inflate;
                    long j11 = (long) inflate;
                    eVar.x0(eVar.B0() + j11);
                    return j11;
                }
                if (L02.f63242b == L02.f63243c) {
                    eVar.f63284a = L02.b();
                    S.b(L02);
                }
                return 0;
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        }
    }

    public final boolean b() {
        if (!this.f63332b.needsInput()) {
            return false;
        }
        if (this.f63331a.J0()) {
            return true;
        }
        Q q10 = this.f63331a.i().f63284a;
        C6496s.e(q10);
        int i10 = q10.f63243c;
        int i11 = q10.f63242b;
        int i12 = i10 - i11;
        this.f63333c = i12;
        this.f63332b.setInput(q10.f63241a, i11, i12);
        return false;
    }

    public void close() {
        if (!this.f63334d) {
            this.f63332b.end();
            this.f63334d = true;
            this.f63331a.close();
        }
    }

    public X timeout() {
        return this.f63331a.timeout();
    }

    public long y1(C5404e eVar, long j10) {
        C6496s.h(eVar, "sink");
        do {
            long a10 = a(eVar, j10);
            if (a10 > 0) {
                return a10;
            }
            if (this.f63332b.finished() || this.f63332b.needsDictionary()) {
                return -1;
            }
        } while (!this.f63331a.J0());
        throw new EOFException("source exhausted prematurely");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public r(W w10, Inflater inflater) {
        this(H.d(w10), inflater);
        C6496s.h(w10, "source");
        C6496s.h(inflater, "inflater");
    }
}

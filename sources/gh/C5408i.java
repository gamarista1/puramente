package Gh;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.C6496s;

/* renamed from: Gh.i  reason: case insensitive filesystem */
public final class C5408i implements U {

    /* renamed from: a  reason: collision with root package name */
    private final C5405f f63300a;

    /* renamed from: b  reason: collision with root package name */
    private final Deflater f63301b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f63302c;

    public C5408i(C5405f fVar, Deflater deflater) {
        C6496s.h(fVar, "sink");
        C6496s.h(deflater, "deflater");
        this.f63300a = fVar;
        this.f63301b = deflater;
    }

    private final void a(boolean z10) {
        Q L02;
        int i10;
        C5404e i11 = this.f63300a.i();
        while (true) {
            L02 = i11.L0(1);
            if (z10) {
                try {
                    Deflater deflater = this.f63301b;
                    byte[] bArr = L02.f63241a;
                    int i12 = L02.f63243c;
                    i10 = deflater.deflate(bArr, i12, 8192 - i12, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                Deflater deflater2 = this.f63301b;
                byte[] bArr2 = L02.f63241a;
                int i13 = L02.f63243c;
                i10 = deflater2.deflate(bArr2, i13, 8192 - i13);
            }
            if (i10 > 0) {
                L02.f63243c += i10;
                i11.x0(i11.B0() + ((long) i10));
                this.f63300a.L();
            } else if (this.f63301b.needsInput()) {
                break;
            }
        }
        if (L02.f63242b == L02.f63243c) {
            i11.f63284a = L02.b();
            S.b(L02);
        }
    }

    public void P(C5404e eVar, long j10) {
        C6496s.h(eVar, "source");
        C5401b.b(eVar.B0(), 0, j10);
        while (j10 > 0) {
            Q q10 = eVar.f63284a;
            C6496s.e(q10);
            int min = (int) Math.min(j10, (long) (q10.f63243c - q10.f63242b));
            this.f63301b.setInput(q10.f63241a, q10.f63242b, min);
            a(false);
            long j11 = (long) min;
            eVar.x0(eVar.B0() - j11);
            int i10 = q10.f63242b + min;
            q10.f63242b = i10;
            if (i10 == q10.f63243c) {
                eVar.f63284a = q10.b();
                S.b(q10);
            }
            j10 -= j11;
        }
    }

    public final void b() {
        this.f63301b.finish();
        a(false);
    }

    public void close() {
        if (!this.f63302c) {
            try {
                b();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f63301b.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f63300a.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f63302c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public void flush() {
        a(true);
        this.f63300a.flush();
    }

    public X timeout() {
        return this.f63300a.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f63300a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C5408i(U u10, Deflater deflater) {
        this(H.c(u10), deflater);
        C6496s.h(u10, "sink");
        C6496s.h(deflater, "deflater");
    }
}

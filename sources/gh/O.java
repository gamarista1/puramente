package Gh;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.C6496s;

public final class O implements C5405f {

    /* renamed from: a  reason: collision with root package name */
    public final U f63232a;

    /* renamed from: b  reason: collision with root package name */
    public final C5404e f63233b = new C5404e();

    /* renamed from: c  reason: collision with root package name */
    public boolean f63234c;

    public O(U u10) {
        C6496s.h(u10, "sink");
        this.f63232a = u10;
    }

    public C5405f A() {
        if (!this.f63234c) {
            long B02 = this.f63233b.B0();
            if (B02 > 0) {
                this.f63232a.P(this.f63233b, B02);
            }
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    public C5405f D(int i10) {
        if (!this.f63234c) {
            this.f63233b.D(i10);
            return L();
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    public C5405f D0(int i10) {
        if (!this.f63234c) {
            this.f63233b.D0(i10);
            return L();
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    public long K(W w10) {
        C6496s.h(w10, "source");
        long j10 = 0;
        while (true) {
            long y12 = w10.y1(this.f63233b, 8192);
            if (y12 == -1) {
                return j10;
            }
            j10 += y12;
            L();
        }
    }

    public C5405f K0(int i10) {
        if (!this.f63234c) {
            this.f63233b.K0(i10);
            return L();
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    public C5405f L() {
        if (!this.f63234c) {
            long q10 = this.f63233b.q();
            if (q10 > 0) {
                this.f63232a.P(this.f63233b, q10);
            }
            return this;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    public void P(C5404e eVar, long j10) {
        C6496s.h(eVar, "source");
        if (!this.f63234c) {
            this.f63233b.P(eVar, j10);
            L();
            return;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    public C5405f X(String str) {
        C6496s.h(str, "string");
        if (!this.f63234c) {
            this.f63233b.X(str);
            return L();
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    public C5405f a0(String str, int i10, int i11) {
        C6496s.h(str, "string");
        if (!this.f63234c) {
            this.f63233b.a0(str, i10, i11);
            return L();
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    public C5405f c1(byte[] bArr, int i10, int i11) {
        C6496s.h(bArr, "source");
        if (!this.f63234c) {
            this.f63233b.c1(bArr, i10, i11);
            return L();
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    public void close() {
        if (!this.f63234c) {
            try {
                if (this.f63233b.B0() > 0) {
                    U u10 = this.f63232a;
                    C5404e eVar = this.f63233b;
                    u10.P(eVar, eVar.B0());
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f63232a.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f63234c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public C5405f e1(long j10) {
        if (!this.f63234c) {
            this.f63233b.e1(j10);
            return L();
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    public void flush() {
        if (!this.f63234c) {
            if (this.f63233b.B0() > 0) {
                U u10 = this.f63232a;
                C5404e eVar = this.f63233b;
                u10.P(eVar, eVar.B0());
            }
            this.f63232a.flush();
            return;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    public C5404e i() {
        return this.f63233b;
    }

    public boolean isOpen() {
        return !this.f63234c;
    }

    public C5405f k0(C5407h hVar) {
        C6496s.h(hVar, "byteString");
        if (!this.f63234c) {
            this.f63233b.k0(hVar);
            return L();
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    public C5405f n0(byte[] bArr) {
        C6496s.h(bArr, "source");
        if (!this.f63234c) {
            this.f63233b.n0(bArr);
            return L();
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    public OutputStream t1() {
        return new a(this);
    }

    public X timeout() {
        return this.f63232a.timeout();
    }

    public String toString() {
        return "buffer(" + this.f63232a + ')';
    }

    public C5405f v0(long j10) {
        if (!this.f63234c) {
            this.f63233b.v0(j10);
            return L();
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    public int write(ByteBuffer byteBuffer) {
        C6496s.h(byteBuffer, "source");
        if (!this.f63234c) {
            int write = this.f63233b.write(byteBuffer);
            L();
            return write;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    public static final class a extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ O f63235a;

        a(O o10) {
            this.f63235a = o10;
        }

        public void close() {
            this.f63235a.close();
        }

        public void flush() {
            O o10 = this.f63235a;
            if (!o10.f63234c) {
                o10.flush();
            }
        }

        public String toString() {
            return this.f63235a + ".outputStream()";
        }

        public void write(int i10) {
            O o10 = this.f63235a;
            if (!o10.f63234c) {
                o10.f63233b.K0((byte) i10);
                this.f63235a.L();
                return;
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }

        public void write(byte[] bArr, int i10, int i11) {
            C6496s.h(bArr, "data");
            O o10 = this.f63235a;
            if (!o10.f63234c) {
                o10.f63233b.c1(bArr, i10, i11);
                this.f63235a.L();
                return;
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }
}

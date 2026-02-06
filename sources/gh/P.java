package Gh;

import Sg.C5538a;
import com.google.android.gms.common.api.a;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C6496s;

public final class P implements C5406g {

    /* renamed from: a  reason: collision with root package name */
    public final W f63236a;

    /* renamed from: b  reason: collision with root package name */
    public final C5404e f63237b = new C5404e();

    /* renamed from: c  reason: collision with root package name */
    public boolean f63238c;

    public P(W w10) {
        C6496s.h(w10, "source");
        this.f63236a = w10;
    }

    public C5407h A0(long j10) {
        u0(j10);
        return this.f63237b.A0(j10);
    }

    public boolean F0(long j10, C5407h hVar) {
        C6496s.h(hVar, "bytes");
        return o(j10, hVar, 0, hVar.O());
    }

    public byte[] H0() {
        this.f63237b.K(this.f63236a);
        return this.f63237b.H0();
    }

    public boolean J0() {
        if (this.f63238c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        } else if (!this.f63237b.J0() || this.f63236a.y1(this.f63237b, 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    public String N(long j10) {
        long j11;
        if (j10 >= 0) {
            if (j10 == Long.MAX_VALUE) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10 + 1;
            }
            long b10 = b((byte) 10, 0, j11);
            if (b10 != -1) {
                return Hh.a.d(this.f63237b, b10);
            }
            if (j11 < Long.MAX_VALUE && e0(j11) && this.f63237b.I(j11 - 1) == 13 && e0(1 + j11) && this.f63237b.I(j11) == 10) {
                return Hh.a.d(this.f63237b, j11);
            }
            C5404e eVar = new C5404e();
            C5404e eVar2 = this.f63237b;
            eVar2.y(eVar, 0, Math.min((long) 32, eVar2.B0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f63237b.B0(), j10) + " content=" + eVar.o0().r() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j10).toString());
    }

    public long N0(C5407h hVar) {
        C6496s.h(hVar, "bytes");
        return f(hVar, 0);
    }

    public long O0() {
        int i10;
        u0(1);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!e0(j11)) {
                break;
            }
            byte I10 = this.f63237b.I(j10);
            if ((I10 >= 48 && I10 <= 57) || (j10 == 0 && I10 == 45)) {
                j10 = j11;
            } else if (i10 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a digit or '-' but was 0x");
                String num = Integer.toString(I10, C5538a.a(16));
                C6496s.g(num, "toString(...)");
                sb2.append(num);
                throw new NumberFormatException(sb2.toString());
            }
        }
        return this.f63237b.O0();
    }

    public long Z(C5407h hVar) {
        C6496s.h(hVar, "targetBytes");
        return n(hVar, 0);
    }

    public void Z0(C5404e eVar, long j10) {
        C6496s.h(eVar, "sink");
        try {
            u0(j10);
            this.f63237b.Z0(eVar, j10);
        } catch (EOFException e10) {
            eVar.K(this.f63237b);
            throw e10;
        }
    }

    public long a(byte b10) {
        return b(b10, 0, Long.MAX_VALUE);
    }

    public long b(byte b10, long j10, long j11) {
        if (this.f63238c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        } else if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        } else {
            while (j10 < j11) {
                long Q10 = this.f63237b.Q(b10, j10, j11);
                if (Q10 != -1) {
                    return Q10;
                }
                long B02 = this.f63237b.B0();
                if (B02 >= j11 || this.f63236a.y1(this.f63237b, 8192) == -1) {
                    return -1;
                }
                j10 = Math.max(j10, B02);
            }
            return -1;
        }
    }

    public String b1(Charset charset) {
        C6496s.h(charset, "charset");
        this.f63237b.K(this.f63236a);
        return this.f63237b.b1(charset);
    }

    public void close() {
        if (!this.f63238c) {
            this.f63238c = true;
            this.f63236a.close();
            this.f63237b.a();
        }
    }

    public long d0(U u10) {
        C6496s.h(u10, "sink");
        long j10 = 0;
        while (this.f63236a.y1(this.f63237b, 8192) != -1) {
            long q10 = this.f63237b.q();
            if (q10 > 0) {
                j10 += q10;
                u10.P(this.f63237b, q10);
            }
        }
        if (this.f63237b.B0() <= 0) {
            return j10;
        }
        long B02 = j10 + this.f63237b.B0();
        C5404e eVar = this.f63237b;
        u10.P(eVar, eVar.B0());
        return B02;
    }

    public boolean e0(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (!this.f63238c) {
            while (this.f63237b.B0() < j10) {
                if (this.f63236a.y1(this.f63237b, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
    }

    public long f(C5407h hVar, long j10) {
        C6496s.h(hVar, "bytes");
        if (!this.f63238c) {
            while (true) {
                long T10 = this.f63237b.T(hVar, j10);
                if (T10 != -1) {
                    return T10;
                }
                long B02 = this.f63237b.B0();
                if (this.f63236a.y1(this.f63237b, 8192) == -1) {
                    return -1;
                }
                j10 = Math.max(j10, (B02 - ((long) hVar.O())) + 1);
            }
        } else {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
    }

    public C5404e i() {
        return this.f63237b;
    }

    public String i0() {
        return N(Long.MAX_VALUE);
    }

    public boolean isOpen() {
        return !this.f63238c;
    }

    public byte[] l0(long j10) {
        u0(j10);
        return this.f63237b.l0(j10);
    }

    public int m1() {
        u0(4);
        return this.f63237b.m1();
    }

    public long n(C5407h hVar, long j10) {
        C6496s.h(hVar, "targetBytes");
        if (!this.f63238c) {
            while (true) {
                long U10 = this.f63237b.U(hVar, j10);
                if (U10 != -1) {
                    return U10;
                }
                long B02 = this.f63237b.B0();
                if (this.f63236a.y1(this.f63237b, 8192) == -1) {
                    return -1;
                }
                j10 = Math.max(j10, B02);
            }
        } else {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
    }

    public boolean o(long j10, C5407h hVar, int i10, int i11) {
        C6496s.h(hVar, "bytes");
        if (this.f63238c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        } else if (j10 < 0 || i10 < 0 || i11 < 0 || hVar.O() - i10 < i11) {
            return false;
        } else {
            for (int i12 = 0; i12 < i11; i12++) {
                long j11 = ((long) i12) + j10;
                if (!e0(1 + j11) || this.f63237b.I(j11) != hVar.j(i10 + i12)) {
                    return false;
                }
            }
            return true;
        }
    }

    public short p0() {
        u0(2);
        return this.f63237b.p0();
    }

    public String p1() {
        this.f63237b.K(this.f63236a);
        return this.f63237b.p1();
    }

    public C5406g peek() {
        return H.d(new N(this));
    }

    public long r0() {
        u0(8);
        return this.f63237b.r0();
    }

    public int r1(K k10) {
        C6496s.h(k10, "options");
        if (!this.f63238c) {
            while (true) {
                int e10 = Hh.a.e(this.f63237b, k10, true);
                if (e10 == -2) {
                    if (this.f63236a.y1(this.f63237b, 8192) == -1) {
                        break;
                    }
                } else if (e10 != -1) {
                    this.f63237b.skip((long) k10.k()[e10].O());
                    return e10;
                }
            }
            return -1;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    public int read(ByteBuffer byteBuffer) {
        C6496s.h(byteBuffer, "sink");
        if (this.f63237b.B0() == 0 && this.f63236a.y1(this.f63237b, 8192) == -1) {
            return -1;
        }
        return this.f63237b.read(byteBuffer);
    }

    public byte readByte() {
        u0(1);
        return this.f63237b.readByte();
    }

    public void readFully(byte[] bArr) {
        C6496s.h(bArr, "sink");
        try {
            u0((long) bArr.length);
            this.f63237b.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.f63237b.B0() > 0) {
                C5404e eVar = this.f63237b;
                int read = eVar.read(bArr, i10, (int) eVar.B0());
                if (read != -1) {
                    i10 += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e10;
        }
    }

    public int readInt() {
        u0(4);
        return this.f63237b.readInt();
    }

    public long readLong() {
        u0(8);
        return this.f63237b.readLong();
    }

    public short readShort() {
        u0(2);
        return this.f63237b.readShort();
    }

    public void skip(long j10) {
        if (!this.f63238c) {
            while (j10 > 0) {
                if (this.f63237b.B0() == 0 && this.f63236a.y1(this.f63237b, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, this.f63237b.B0());
                this.f63237b.skip(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    public X timeout() {
        return this.f63236a.timeout();
    }

    public String toString() {
        return "buffer(" + this.f63236a + ')';
    }

    public void u0(long j10) {
        if (!e0(j10)) {
            throw new EOFException();
        }
    }

    public long v1() {
        u0(1);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!e0((long) i11)) {
                break;
            }
            byte I10 = this.f63237b.I((long) i10);
            if ((I10 >= 48 && I10 <= 57) || ((I10 >= 97 && I10 <= 102) || (I10 >= 65 && I10 <= 70))) {
                i10 = i11;
            } else if (i10 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
                String num = Integer.toString(I10, C5538a.a(16));
                C6496s.g(num, "toString(...)");
                sb2.append(num);
                throw new NumberFormatException(sb2.toString());
            }
        }
        return this.f63237b.v1();
    }

    public C5404e x() {
        return this.f63237b;
    }

    public InputStream x1() {
        return new a(this);
    }

    public long y1(C5404e eVar, long j10) {
        C6496s.h(eVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (this.f63238c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        } else if (this.f63237b.B0() == 0 && this.f63236a.y1(this.f63237b, 8192) == -1) {
            return -1;
        } else {
            return this.f63237b.y1(eVar, Math.min(j10, this.f63237b.B0()));
        }
    }

    public String z0(long j10) {
        u0(j10);
        return this.f63237b.z0(j10);
    }

    public static final class a extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ P f63239a;

        a(P p10) {
            this.f63239a = p10;
        }

        public int available() {
            P p10 = this.f63239a;
            if (!p10.f63238c) {
                return (int) Math.min(p10.f63237b.B0(), (long) a.e.API_PRIORITY_OTHER);
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }

        public void close() {
            this.f63239a.close();
        }

        public int read() {
            P p10 = this.f63239a;
            if (!p10.f63238c) {
                if (p10.f63237b.B0() == 0) {
                    P p11 = this.f63239a;
                    if (p11.f63236a.y1(p11.f63237b, 8192) == -1) {
                        return -1;
                    }
                }
                return this.f63239a.f63237b.readByte() & 255;
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }

        public String toString() {
            return this.f63239a + ".inputStream()";
        }

        public int read(byte[] bArr, int i10, int i11) {
            C6496s.h(bArr, "data");
            if (!this.f63239a.f63238c) {
                C5401b.b((long) bArr.length, (long) i10, (long) i11);
                if (this.f63239a.f63237b.B0() == 0) {
                    P p10 = this.f63239a;
                    if (p10.f63236a.y1(p10.f63237b, 8192) == -1) {
                        return -1;
                    }
                }
                return this.f63239a.f63237b.read(bArr, i10, i11);
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }
}

package Gh;

import Sg.p;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.C6496s;

/* renamed from: Gh.q  reason: case insensitive filesystem */
public final class C5416q implements W {

    /* renamed from: a  reason: collision with root package name */
    private byte f63326a;

    /* renamed from: b  reason: collision with root package name */
    private final P f63327b;

    /* renamed from: c  reason: collision with root package name */
    private final Inflater f63328c;

    /* renamed from: d  reason: collision with root package name */
    private final r f63329d;

    /* renamed from: e  reason: collision with root package name */
    private final CRC32 f63330e = new CRC32();

    public C5416q(W w10) {
        C6496s.h(w10, "source");
        P p10 = new P(w10);
        this.f63327b = p10;
        Inflater inflater = new Inflater(true);
        this.f63328c = inflater;
        this.f63329d = new r((C5406g) p10, inflater);
    }

    private final void a(String str, int i10, int i11) {
        if (i11 != i10) {
            throw new IOException(str + ": actual 0x" + p.p0(C5401b.l(i11), 8, '0') + " != expected 0x" + p.p0(C5401b.l(i10), 8, '0'));
        }
    }

    private final void b() {
        boolean z10;
        this.f63327b.u0(10);
        byte I10 = this.f63327b.f63237b.I(3);
        if (((I10 >> 1) & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            n(this.f63327b.f63237b, 0, 10);
        }
        a("ID1ID2", 8075, this.f63327b.readShort());
        this.f63327b.skip(8);
        if (((I10 >> 2) & 1) == 1) {
            this.f63327b.u0(2);
            if (z10) {
                n(this.f63327b.f63237b, 0, 2);
            }
            long p02 = (long) (this.f63327b.f63237b.p0() & 65535);
            this.f63327b.u0(p02);
            if (z10) {
                n(this.f63327b.f63237b, 0, p02);
            }
            this.f63327b.skip(p02);
        }
        if (((I10 >> 3) & 1) == 1) {
            long a10 = this.f63327b.a((byte) 0);
            if (a10 != -1) {
                if (z10) {
                    n(this.f63327b.f63237b, 0, a10 + 1);
                }
                this.f63327b.skip(a10 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((I10 >> 4) & 1) == 1) {
            long a11 = this.f63327b.a((byte) 0);
            if (a11 != -1) {
                if (z10) {
                    n(this.f63327b.f63237b, 0, a11 + 1);
                }
                this.f63327b.skip(a11 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z10) {
            a("FHCRC", this.f63327b.p0(), (short) ((int) this.f63330e.getValue()));
            this.f63330e.reset();
        }
    }

    private final void f() {
        a("CRC", this.f63327b.m1(), (int) this.f63330e.getValue());
        a("ISIZE", this.f63327b.m1(), (int) this.f63328c.getBytesWritten());
    }

    private final void n(C5404e eVar, long j10, long j11) {
        Q q10 = eVar.f63284a;
        C6496s.e(q10);
        while (true) {
            int i10 = q10.f63243c;
            int i11 = q10.f63242b;
            if (j10 < ((long) (i10 - i11))) {
                break;
            }
            j10 -= (long) (i10 - i11);
            q10 = q10.f63246f;
            C6496s.e(q10);
        }
        while (j11 > 0) {
            int i12 = (int) (((long) q10.f63242b) + j10);
            int min = (int) Math.min((long) (q10.f63243c - i12), j11);
            this.f63330e.update(q10.f63241a, i12, min);
            j11 -= (long) min;
            q10 = q10.f63246f;
            C6496s.e(q10);
            j10 = 0;
        }
    }

    public void close() {
        this.f63329d.close();
    }

    public X timeout() {
        return this.f63327b.timeout();
    }

    public long y1(C5404e eVar, long j10) {
        C6496s.h(eVar, "sink");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (i10 == 0) {
            return 0;
        } else {
            if (this.f63326a == 0) {
                b();
                this.f63326a = 1;
            }
            if (this.f63326a == 1) {
                long B02 = eVar.B0();
                long y12 = this.f63329d.y1(eVar, j10);
                if (y12 != -1) {
                    n(eVar, B02, y12);
                    return y12;
                }
                this.f63326a = 2;
            }
            if (this.f63326a == 2) {
                f();
                this.f63326a = 3;
                if (!this.f63327b.J0()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }
}

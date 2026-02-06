package xc;

import Ac.l;
import java.io.IOException;
import java.io.InputStream;
import vc.h;

/* renamed from: xc.a  reason: case insensitive filesystem */
public final class C5277a extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f62219a;

    /* renamed from: b  reason: collision with root package name */
    private final h f62220b;

    /* renamed from: c  reason: collision with root package name */
    private final l f62221c;

    /* renamed from: d  reason: collision with root package name */
    private long f62222d = -1;

    /* renamed from: e  reason: collision with root package name */
    private long f62223e;

    /* renamed from: f  reason: collision with root package name */
    private long f62224f = -1;

    public C5277a(InputStream inputStream, h hVar, l lVar) {
        this.f62221c = lVar;
        this.f62219a = inputStream;
        this.f62220b = hVar;
        this.f62223e = hVar.e();
    }

    public int available() {
        try {
            return this.f62219a.available();
        } catch (IOException e10) {
            this.f62220b.y(this.f62221c.c());
            d.d(this.f62220b);
            throw e10;
        }
    }

    public void close() {
        long c10 = this.f62221c.c();
        if (this.f62224f == -1) {
            this.f62224f = c10;
        }
        try {
            this.f62219a.close();
            long j10 = this.f62222d;
            if (j10 != -1) {
                this.f62220b.v(j10);
            }
            long j11 = this.f62223e;
            if (j11 != -1) {
                this.f62220b.B(j11);
            }
            this.f62220b.y(this.f62224f);
            this.f62220b.b();
        } catch (IOException e10) {
            this.f62220b.y(this.f62221c.c());
            d.d(this.f62220b);
            throw e10;
        }
    }

    public void mark(int i10) {
        this.f62219a.mark(i10);
    }

    public boolean markSupported() {
        return this.f62219a.markSupported();
    }

    public int read() {
        try {
            int read = this.f62219a.read();
            long c10 = this.f62221c.c();
            if (this.f62223e == -1) {
                this.f62223e = c10;
            }
            if (read == -1 && this.f62224f == -1) {
                this.f62224f = c10;
                this.f62220b.y(c10);
                this.f62220b.b();
            } else {
                long j10 = this.f62222d + 1;
                this.f62222d = j10;
                this.f62220b.v(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f62220b.y(this.f62221c.c());
            d.d(this.f62220b);
            throw e10;
        }
    }

    public void reset() {
        try {
            this.f62219a.reset();
        } catch (IOException e10) {
            this.f62220b.y(this.f62221c.c());
            d.d(this.f62220b);
            throw e10;
        }
    }

    public long skip(long j10) {
        try {
            long skip = this.f62219a.skip(j10);
            long c10 = this.f62221c.c();
            if (this.f62223e == -1) {
                this.f62223e = c10;
            }
            if (skip == -1 && this.f62224f == -1) {
                this.f62224f = c10;
                this.f62220b.y(c10);
            } else {
                long j11 = this.f62222d + skip;
                this.f62222d = j11;
                this.f62220b.v(j11);
            }
            return skip;
        } catch (IOException e10) {
            this.f62220b.y(this.f62221c.c());
            d.d(this.f62220b);
            throw e10;
        }
    }

    public int read(byte[] bArr, int i10, int i11) {
        try {
            int read = this.f62219a.read(bArr, i10, i11);
            long c10 = this.f62221c.c();
            if (this.f62223e == -1) {
                this.f62223e = c10;
            }
            if (read == -1 && this.f62224f == -1) {
                this.f62224f = c10;
                this.f62220b.y(c10);
                this.f62220b.b();
            } else {
                long j10 = this.f62222d + ((long) read);
                this.f62222d = j10;
                this.f62220b.v(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f62220b.y(this.f62221c.c());
            d.d(this.f62220b);
            throw e10;
        }
    }

    public int read(byte[] bArr) {
        try {
            int read = this.f62219a.read(bArr);
            long c10 = this.f62221c.c();
            if (this.f62223e == -1) {
                this.f62223e = c10;
            }
            if (read == -1 && this.f62224f == -1) {
                this.f62224f = c10;
                this.f62220b.y(c10);
                this.f62220b.b();
            } else {
                long j10 = this.f62222d + ((long) read);
                this.f62222d = j10;
                this.f62220b.v(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f62220b.y(this.f62221c.c());
            d.d(this.f62220b);
            throw e10;
        }
    }
}

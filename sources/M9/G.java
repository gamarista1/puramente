package m9;

import ja.C3645a;
import ja.M;
import java.nio.ByteBuffer;
import m9.C3849g;

public final class G extends w {

    /* renamed from: i  reason: collision with root package name */
    private final long f46552i;

    /* renamed from: j  reason: collision with root package name */
    private final long f46553j;

    /* renamed from: k  reason: collision with root package name */
    private final short f46554k;

    /* renamed from: l  reason: collision with root package name */
    private int f46555l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f46556m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f46557n;

    /* renamed from: o  reason: collision with root package name */
    private byte[] f46558o;

    /* renamed from: p  reason: collision with root package name */
    private int f46559p;

    /* renamed from: q  reason: collision with root package name */
    private int f46560q;

    /* renamed from: r  reason: collision with root package name */
    private int f46561r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f46562s;

    /* renamed from: t  reason: collision with root package name */
    private long f46563t;

    public G() {
        this(150000, 20000, 1024);
    }

    private int m(long j10) {
        return (int) ((j10 * ((long) this.f46738b.f46653a)) / 1000000);
    }

    private int n(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
            if (Math.abs(byteBuffer.getShort(limit)) > this.f46554k) {
                int i10 = this.f46555l;
                return ((limit / i10) * i10) + i10;
            }
        }
    }

    private int o(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > this.f46554k) {
                int i10 = this.f46555l;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    private void q(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        l(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f46562s = true;
        }
    }

    private void r(byte[] bArr, int i10) {
        l(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f46562s = true;
        }
    }

    private void s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o10 = o(byteBuffer);
        int position = o10 - byteBuffer.position();
        byte[] bArr = this.f46557n;
        int length = bArr.length;
        int i10 = this.f46560q;
        int i11 = length - i10;
        if (o10 >= limit || position >= i11) {
            int min = Math.min(position, i11);
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer.get(this.f46557n, this.f46560q, min);
            int i12 = this.f46560q + min;
            this.f46560q = i12;
            byte[] bArr2 = this.f46557n;
            if (i12 == bArr2.length) {
                if (this.f46562s) {
                    r(bArr2, this.f46561r);
                    this.f46563t += (long) ((this.f46560q - (this.f46561r * 2)) / this.f46555l);
                } else {
                    this.f46563t += (long) ((i12 - this.f46561r) / this.f46555l);
                }
                w(byteBuffer, this.f46557n, this.f46560q);
                this.f46560q = 0;
                this.f46559p = 2;
            }
            byteBuffer.limit(limit);
            return;
        }
        r(bArr, i10);
        this.f46560q = 0;
        this.f46559p = 0;
    }

    private void t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f46557n.length));
        int n10 = n(byteBuffer);
        if (n10 == byteBuffer.position()) {
            this.f46559p = 1;
        } else {
            byteBuffer.limit(n10);
            q(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o10 = o(byteBuffer);
        byteBuffer.limit(o10);
        this.f46563t += (long) (byteBuffer.remaining() / this.f46555l);
        w(byteBuffer, this.f46558o, this.f46561r);
        if (o10 < limit) {
            r(this.f46558o, this.f46561r);
            this.f46559p = 0;
            byteBuffer.limit(limit);
        }
    }

    private void w(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f46561r);
        int i11 = this.f46561r - min;
        System.arraycopy(bArr, i10 - i11, this.f46558o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f46558o, i11, min);
    }

    public boolean a() {
        return this.f46556m;
    }

    public void d(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !g()) {
            int i10 = this.f46559p;
            if (i10 == 0) {
                t(byteBuffer);
            } else if (i10 == 1) {
                s(byteBuffer);
            } else if (i10 == 2) {
                u(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public C3849g.a h(C3849g.a aVar) {
        if (aVar.f46655c != 2) {
            throw new C3849g.b(aVar);
        } else if (this.f46556m) {
            return aVar;
        } else {
            return C3849g.a.f46652e;
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
        if (this.f46556m) {
            this.f46555l = this.f46738b.f46656d;
            int m10 = m(this.f46552i) * this.f46555l;
            if (this.f46557n.length != m10) {
                this.f46557n = new byte[m10];
            }
            int m11 = m(this.f46553j) * this.f46555l;
            this.f46561r = m11;
            if (this.f46558o.length != m11) {
                this.f46558o = new byte[m11];
            }
        }
        this.f46559p = 0;
        this.f46563t = 0;
        this.f46560q = 0;
        this.f46562s = false;
    }

    /* access modifiers changed from: protected */
    public void j() {
        int i10 = this.f46560q;
        if (i10 > 0) {
            r(this.f46557n, i10);
        }
        if (!this.f46562s) {
            this.f46563t += (long) (this.f46561r / this.f46555l);
        }
    }

    /* access modifiers changed from: protected */
    public void k() {
        this.f46556m = false;
        this.f46561r = 0;
        byte[] bArr = M.f44986f;
        this.f46557n = bArr;
        this.f46558o = bArr;
    }

    public long p() {
        return this.f46563t;
    }

    public void v(boolean z10) {
        this.f46556m = z10;
    }

    public G(long j10, long j11, short s10) {
        C3645a.a(j11 <= j10);
        this.f46552i = j10;
        this.f46553j = j11;
        this.f46554k = s10;
        byte[] bArr = M.f44986f;
        this.f46557n = bArr;
        this.f46558o = bArr;
    }
}

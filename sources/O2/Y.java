package o2;

import g2.b;
import g2.d;
import i2.C2076a;
import i2.L;
import java.nio.ByteBuffer;

public final class Y extends d {

    /* renamed from: i  reason: collision with root package name */
    private final float f24965i;

    /* renamed from: j  reason: collision with root package name */
    private final short f24966j;

    /* renamed from: k  reason: collision with root package name */
    private final int f24967k;

    /* renamed from: l  reason: collision with root package name */
    private final long f24968l;

    /* renamed from: m  reason: collision with root package name */
    private final long f24969m;

    /* renamed from: n  reason: collision with root package name */
    private int f24970n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f24971o;

    /* renamed from: p  reason: collision with root package name */
    private int f24972p;

    /* renamed from: q  reason: collision with root package name */
    private long f24973q;

    /* renamed from: r  reason: collision with root package name */
    private int f24974r;

    /* renamed from: s  reason: collision with root package name */
    private byte[] f24975s;

    /* renamed from: t  reason: collision with root package name */
    private int f24976t;

    /* renamed from: u  reason: collision with root package name */
    private int f24977u;

    /* renamed from: v  reason: collision with root package name */
    private byte[] f24978v;

    public Y() {
        this(100000, 0.2f, 2000000, 10, 1024);
    }

    private void A(int i10, int i11) {
        boolean z10;
        boolean z11;
        if (i10 != 0) {
            boolean z12 = true;
            if (this.f24977u >= i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.a(z10);
            if (i11 == 2) {
                int i12 = this.f24976t;
                int i13 = this.f24977u;
                int i14 = i12 + i13;
                byte[] bArr = this.f24975s;
                if (i14 <= bArr.length) {
                    System.arraycopy(bArr, (i12 + i13) - i10, this.f24978v, 0, i10);
                } else {
                    int length = i13 - (bArr.length - i12);
                    if (length >= i10) {
                        System.arraycopy(bArr, length - i10, this.f24978v, 0, i10);
                    } else {
                        int i15 = i10 - length;
                        System.arraycopy(bArr, bArr.length - i15, this.f24978v, 0, i15);
                        System.arraycopy(this.f24975s, 0, this.f24978v, i15, length);
                    }
                }
            } else {
                int i16 = this.f24976t;
                int i17 = i16 + i10;
                byte[] bArr2 = this.f24975s;
                if (i17 <= bArr2.length) {
                    System.arraycopy(bArr2, i16, this.f24978v, 0, i10);
                } else {
                    int length2 = bArr2.length - i16;
                    System.arraycopy(bArr2, i16, this.f24978v, 0, length2);
                    System.arraycopy(this.f24975s, 0, this.f24978v, length2, i10 - length2);
                }
            }
            if (i10 % this.f24970n == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            C2076a.b(z11, "sizeToOutput is not aligned to frame size: " + i10);
            if (this.f24976t >= this.f24975s.length) {
                z12 = false;
            }
            C2076a.g(z12);
            y(this.f24978v, i10, i11);
        }
    }

    private void B(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f24975s.length));
        int s10 = s(byteBuffer);
        if (s10 == byteBuffer.position()) {
            this.f24972p = 1;
        } else {
            byteBuffer.limit(Math.min(s10, byteBuffer.capacity()));
            x(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private static void C(byte[] bArr, int i10, int i11) {
        if (i11 >= 32767) {
            bArr[i10] = -1;
            bArr[i10 + 1] = Byte.MAX_VALUE;
        } else if (i11 <= -32768) {
            bArr[i10] = 0;
            bArr[i10 + 1] = Byte.MIN_VALUE;
        } else {
            bArr[i10] = (byte) (i11 & 255);
            bArr[i10 + 1] = (byte) (i11 >> 8);
        }
    }

    private void E(ByteBuffer byteBuffer) {
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13 = true;
        if (this.f24976t < this.f24975s.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        int limit = byteBuffer.limit();
        int t10 = t(byteBuffer);
        int position = t10 - byteBuffer.position();
        int i12 = this.f24976t;
        int i13 = this.f24977u;
        int i14 = i12 + i13;
        byte[] bArr = this.f24975s;
        if (i14 < bArr.length) {
            i10 = bArr.length - (i13 + i12);
            i11 = i12 + i13;
        } else {
            int length = i13 - (bArr.length - i12);
            i10 = i12 - length;
            i11 = length;
        }
        if (t10 < limit) {
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(position, i10);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f24975s, i11, min);
        int i15 = this.f24977u + min;
        this.f24977u = i15;
        if (i15 <= this.f24975s.length) {
            z12 = true;
        } else {
            z12 = false;
        }
        C2076a.g(z12);
        if (!z11 || position >= i10) {
            z13 = false;
        }
        z(z13);
        if (z13) {
            this.f24972p = 0;
            this.f24974r = 0;
        }
        byteBuffer.limit(limit);
    }

    private static int F(byte b10, byte b11) {
        return (b10 << 8) | (b11 & 255);
    }

    private int m(float f10) {
        return n((int) f10);
    }

    private int n(int i10) {
        int i11 = this.f24970n;
        return (i10 / i11) * i11;
    }

    private int o(int i10, int i11) {
        int i12 = this.f24967k;
        return i12 + ((((100 - i12) * (i10 * 1000)) / i11) / 1000);
    }

    private int p(int i10, int i11) {
        return (((this.f24967k - 100) * ((i10 * 1000) / i11)) / 1000) + 100;
    }

    private int q(int i10) {
        boolean z10;
        int r10 = ((r(this.f24969m) - this.f24974r) * this.f24970n) - (this.f24975s.length / 2);
        if (r10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        return m(Math.min((((float) i10) * this.f24965i) + 0.5f, (float) r10));
    }

    private int r(long j10) {
        return (int) ((j10 * ((long) this.f21004b.f20999a)) / 1000000);
    }

    private int s(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (v(byteBuffer.get(limit), byteBuffer.get(limit - 1))) {
                int i10 = this.f24970n;
                return ((limit / i10) * i10) + i10;
            }
        }
        return byteBuffer.position();
    }

    private int t(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (v(byteBuffer.get(position), byteBuffer.get(position - 1))) {
                int i10 = this.f24970n;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    private boolean v(byte b10, byte b11) {
        if (Math.abs(F(b10, b11)) > this.f24966j) {
            return true;
        }
        return false;
    }

    private void w(byte[] bArr, int i10, int i11) {
        int i12;
        if (i11 != 3) {
            for (int i13 = 0; i13 < i10; i13 += 2) {
                int F10 = F(bArr[i13 + 1], bArr[i13]);
                if (i11 == 0) {
                    i12 = p(i13, i10 - 1);
                } else if (i11 == 2) {
                    i12 = o(i13, i10 - 1);
                } else {
                    i12 = this.f24967k;
                }
                C(bArr, i13, (F10 * i12) / 100);
            }
        }
    }

    private void x(ByteBuffer byteBuffer) {
        l(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void y(byte[] bArr, int i10, int i11) {
        boolean z10;
        if (i10 % this.f24970n == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.b(z10, "byteOutput size is not aligned to frame size " + i10);
        w(bArr, i10, i11);
        l(i10).put(bArr, 0, i10).flip();
    }

    private void z(boolean z10) {
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        int i12 = this.f24977u;
        byte[] bArr = this.f24975s;
        if (i12 == bArr.length || z10) {
            boolean z13 = false;
            if (this.f24974r == 0) {
                if (z10) {
                    A(i12, 3);
                    i10 = i12;
                } else {
                    if (i12 >= bArr.length / 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    C2076a.g(z12);
                    i10 = this.f24975s.length / 2;
                    A(i10, 0);
                }
                i11 = i10;
            } else if (z10) {
                int length = i12 - (bArr.length / 2);
                int length2 = (bArr.length / 2) + length;
                int q10 = q(length) + (this.f24975s.length / 2);
                A(q10, 2);
                int i13 = length2;
                i11 = q10;
                i10 = i13;
            } else {
                i10 = i12 - (bArr.length / 2);
                i11 = q(i10);
                A(i11, 1);
            }
            if (i10 % this.f24970n == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            C2076a.h(z11, "bytesConsumed is not aligned to frame size: %s" + i10);
            if (i12 >= i11) {
                z13 = true;
            }
            C2076a.g(z13);
            this.f24977u -= i10;
            int i14 = this.f24976t + i10;
            this.f24976t = i14;
            this.f24976t = i14 % this.f24975s.length;
            int i15 = this.f24974r;
            int i16 = this.f24970n;
            this.f24974r = i15 + (i11 / i16);
            this.f24973q += (long) ((i10 - i11) / i16);
        }
    }

    public void D(boolean z10) {
        this.f24971o = z10;
    }

    public boolean a() {
        if (!super.a() || !this.f24971o) {
            return false;
        }
        return true;
    }

    public void d(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !g()) {
            int i10 = this.f24972p;
            if (i10 == 0) {
                B(byteBuffer);
            } else if (i10 == 1) {
                E(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    public b.a h(b.a aVar) {
        if (aVar.f21001c != 2) {
            throw new b.C0349b(aVar);
        } else if (aVar.f20999a == -1) {
            return b.a.f20998e;
        } else {
            return aVar;
        }
    }

    public void i() {
        if (a()) {
            this.f24970n = this.f21004b.f21000b * 2;
            int n10 = n(r(this.f24968l) / 2) * 2;
            if (this.f24975s.length != n10) {
                this.f24975s = new byte[n10];
                this.f24978v = new byte[n10];
            }
        }
        this.f24972p = 0;
        this.f24973q = 0;
        this.f24974r = 0;
        this.f24976t = 0;
        this.f24977u = 0;
    }

    public void j() {
        if (this.f24977u > 0) {
            z(true);
            this.f24974r = 0;
        }
    }

    public void k() {
        this.f24971o = false;
        byte[] bArr = L.f22077f;
        this.f24975s = bArr;
        this.f24978v = bArr;
    }

    public long u() {
        return this.f24973q;
    }

    public Y(long j10, float f10, long j11, int i10, short s10) {
        boolean z10 = false;
        this.f24974r = 0;
        this.f24976t = 0;
        this.f24977u = 0;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        C2076a.a(z10);
        this.f24968l = j10;
        this.f24965i = f10;
        this.f24969m = j11;
        this.f24967k = i10;
        this.f24966j = s10;
        byte[] bArr = L.f22077f;
        this.f24975s = bArr;
        this.f24978v = bArr;
    }
}

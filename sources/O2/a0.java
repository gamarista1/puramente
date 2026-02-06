package o2;

import g2.b;
import g2.d;
import i2.L;
import java.nio.ByteBuffer;

final class a0 extends d {

    /* renamed from: i  reason: collision with root package name */
    private int f24980i;

    /* renamed from: j  reason: collision with root package name */
    private int f24981j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f24982k;

    /* renamed from: l  reason: collision with root package name */
    private int f24983l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f24984m = L.f22077f;

    /* renamed from: n  reason: collision with root package name */
    private int f24985n;

    /* renamed from: o  reason: collision with root package name */
    private long f24986o;

    public boolean b() {
        if (!super.b() || this.f24985n != 0) {
            return false;
        }
        return true;
    }

    public ByteBuffer c() {
        int i10;
        if (super.b() && (i10 = this.f24985n) > 0) {
            l(i10).put(this.f24984m, 0, this.f24985n).flip();
            this.f24985n = 0;
        }
        return super.c();
    }

    public void d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            int min = Math.min(i10, this.f24983l);
            this.f24986o += (long) (min / this.f21004b.f21002d);
            this.f24983l -= min;
            byteBuffer.position(position + min);
            if (this.f24983l <= 0) {
                int i11 = i10 - min;
                int length = (this.f24985n + i11) - this.f24984m.length;
                ByteBuffer l10 = l(length);
                int o10 = L.o(length, 0, this.f24985n);
                l10.put(this.f24984m, 0, o10);
                int o11 = L.o(length - o10, 0, i11);
                byteBuffer.limit(byteBuffer.position() + o11);
                l10.put(byteBuffer);
                byteBuffer.limit(limit);
                int i12 = i11 - o11;
                int i13 = this.f24985n - o10;
                this.f24985n = i13;
                byte[] bArr = this.f24984m;
                System.arraycopy(bArr, o10, bArr, 0, i13);
                byteBuffer.get(this.f24984m, this.f24985n, i12);
                this.f24985n += i12;
                l10.flip();
            }
        }
    }

    public b.a h(b.a aVar) {
        if (aVar.f21001c == 2) {
            this.f24982k = true;
            if (this.f24980i == 0 && this.f24981j == 0) {
                return b.a.f20998e;
            }
            return aVar;
        }
        throw new b.C0349b(aVar);
    }

    /* access modifiers changed from: protected */
    public void i() {
        if (this.f24982k) {
            this.f24982k = false;
            int i10 = this.f24981j;
            int i11 = this.f21004b.f21002d;
            this.f24984m = new byte[(i10 * i11)];
            this.f24983l = this.f24980i * i11;
        }
        this.f24985n = 0;
    }

    /* access modifiers changed from: protected */
    public void j() {
        if (this.f24982k) {
            int i10 = this.f24985n;
            if (i10 > 0) {
                this.f24986o += (long) (i10 / this.f21004b.f21002d);
            }
            this.f24985n = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void k() {
        this.f24984m = L.f22077f;
    }

    public long m() {
        return this.f24986o;
    }

    public void n() {
        this.f24986o = 0;
    }

    public void o(int i10, int i11) {
        this.f24980i = i10;
        this.f24981j = i11;
    }
}

package m9;

import ja.M;
import java.nio.ByteBuffer;
import m9.C3849g;

final class J extends w {

    /* renamed from: i  reason: collision with root package name */
    private int f46601i;

    /* renamed from: j  reason: collision with root package name */
    private int f46602j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f46603k;

    /* renamed from: l  reason: collision with root package name */
    private int f46604l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f46605m = M.f44986f;

    /* renamed from: n  reason: collision with root package name */
    private int f46606n;

    /* renamed from: o  reason: collision with root package name */
    private long f46607o;

    public boolean b() {
        if (!super.b() || this.f46606n != 0) {
            return false;
        }
        return true;
    }

    public ByteBuffer c() {
        int i10;
        if (super.b() && (i10 = this.f46606n) > 0) {
            l(i10).put(this.f46605m, 0, this.f46606n).flip();
            this.f46606n = 0;
        }
        return super.c();
    }

    public void d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            int min = Math.min(i10, this.f46604l);
            this.f46607o += (long) (min / this.f46738b.f46656d);
            this.f46604l -= min;
            byteBuffer.position(position + min);
            if (this.f46604l <= 0) {
                int i11 = i10 - min;
                int length = (this.f46606n + i11) - this.f46605m.length;
                ByteBuffer l10 = l(length);
                int q10 = M.q(length, 0, this.f46606n);
                l10.put(this.f46605m, 0, q10);
                int q11 = M.q(length - q10, 0, i11);
                byteBuffer.limit(byteBuffer.position() + q11);
                l10.put(byteBuffer);
                byteBuffer.limit(limit);
                int i12 = i11 - q11;
                int i13 = this.f46606n - q10;
                this.f46606n = i13;
                byte[] bArr = this.f46605m;
                System.arraycopy(bArr, q10, bArr, 0, i13);
                byteBuffer.get(this.f46605m, this.f46606n, i12);
                this.f46606n += i12;
                l10.flip();
            }
        }
    }

    public C3849g.a h(C3849g.a aVar) {
        if (aVar.f46655c == 2) {
            this.f46603k = true;
            if (this.f46601i == 0 && this.f46602j == 0) {
                return C3849g.a.f46652e;
            }
            return aVar;
        }
        throw new C3849g.b(aVar);
    }

    /* access modifiers changed from: protected */
    public void i() {
        if (this.f46603k) {
            this.f46603k = false;
            int i10 = this.f46602j;
            int i11 = this.f46738b.f46656d;
            this.f46605m = new byte[(i10 * i11)];
            this.f46604l = this.f46601i * i11;
        }
        this.f46606n = 0;
    }

    /* access modifiers changed from: protected */
    public void j() {
        if (this.f46603k) {
            int i10 = this.f46606n;
            if (i10 > 0) {
                this.f46607o += (long) (i10 / this.f46738b.f46656d);
            }
            this.f46606n = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void k() {
        this.f46605m = M.f44986f;
    }

    public long m() {
        return this.f46607o;
    }

    public void n() {
        this.f46607o = 0;
    }

    public void o(int i10, int i11) {
        this.f46601i = i10;
        this.f46602j = i11;
    }
}

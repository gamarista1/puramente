package Vh;

import java.nio.ByteBuffer;

public class c {

    /* renamed from: a  reason: collision with root package name */
    int f65508a;

    /* renamed from: b  reason: collision with root package name */
    int f65509b;

    /* renamed from: c  reason: collision with root package name */
    private ByteBuffer f65510c;

    public c(ByteBuffer byteBuffer) {
        this.f65510c = byteBuffer;
        this.f65508a = byteBuffer.position();
    }

    public int a(int i10) {
        int i11;
        int i12 = this.f65510c.get(this.f65508a + (this.f65509b / 8));
        if (i12 < 0) {
            i12 += 256;
        }
        int i13 = this.f65509b;
        int i14 = 8 - (i13 % 8);
        if (i10 <= i14) {
            i11 = ((i12 << (i13 % 8)) & 255) >> ((i13 % 8) + (i14 - i10));
            this.f65509b = i13 + i10;
        } else {
            int i15 = i10 - i14;
            i11 = (a(i14) << i15) + a(i15);
        }
        this.f65510c.position(this.f65508a + ((int) Math.ceil(((double) this.f65509b) / 8.0d)));
        return i11;
    }

    public boolean b() {
        if (a(1) == 1) {
            return true;
        }
        return false;
    }

    public int c() {
        return (this.f65510c.limit() * 8) - this.f65509b;
    }
}

package C9;

import ja.C3645a;
import java.nio.ByteBuffer;
import n9.C3871g;

final class h extends C3871g {

    /* renamed from: i  reason: collision with root package name */
    private long f30145i;

    /* renamed from: j  reason: collision with root package name */
    private int f30146j;

    /* renamed from: k  reason: collision with root package name */
    private int f30147k = 32;

    public h() {
        super(2);
    }

    private boolean E(C3871g gVar) {
        ByteBuffer byteBuffer;
        if (!I()) {
            return true;
        }
        if (this.f30146j >= this.f30147k || gVar.o() != o()) {
            return false;
        }
        ByteBuffer byteBuffer2 = gVar.f46950c;
        if (byteBuffer2 == null || (byteBuffer = this.f46950c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000) {
            return true;
        }
        return false;
    }

    public boolean D(C3871g gVar) {
        C3645a.a(!gVar.z());
        C3645a.a(!gVar.m());
        C3645a.a(!gVar.p());
        if (!E(gVar)) {
            return false;
        }
        int i10 = this.f30146j;
        this.f30146j = i10 + 1;
        if (i10 == 0) {
            this.f46952e = gVar.f46952e;
            if (gVar.s()) {
                t(1);
            }
        }
        if (gVar.o()) {
            t(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = gVar.f46950c;
        if (byteBuffer != null) {
            x(byteBuffer.remaining());
            this.f46950c.put(byteBuffer);
        }
        this.f30145i = gVar.f46952e;
        return true;
    }

    public long F() {
        return this.f46952e;
    }

    public long G() {
        return this.f30145i;
    }

    public int H() {
        return this.f30146j;
    }

    public boolean I() {
        if (this.f30146j > 0) {
            return true;
        }
        return false;
    }

    public void J(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        this.f30147k = i10;
    }

    public void i() {
        super.i();
        this.f30146j = 0;
    }
}

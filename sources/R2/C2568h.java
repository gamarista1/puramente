package r2;

import i2.C2076a;
import java.nio.ByteBuffer;
import l2.f;

/* renamed from: r2.h  reason: case insensitive filesystem */
final class C2568h extends f {

    /* renamed from: j  reason: collision with root package name */
    private long f25639j;

    /* renamed from: k  reason: collision with root package name */
    private int f25640k;

    /* renamed from: l  reason: collision with root package name */
    private int f25641l = 32;

    public C2568h() {
        super(2);
    }

    private boolean D(f fVar) {
        ByteBuffer byteBuffer;
        if (!H()) {
            return true;
        }
        if (this.f25640k >= this.f25641l) {
            return false;
        }
        ByteBuffer byteBuffer2 = fVar.f23520d;
        if (byteBuffer2 == null || (byteBuffer = this.f23520d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000) {
            return true;
        }
        return false;
    }

    public boolean C(f fVar) {
        C2076a.a(!fVar.y());
        C2076a.a(!fVar.l());
        C2076a.a(!fVar.m());
        if (!D(fVar)) {
            return false;
        }
        int i10 = this.f25640k;
        this.f25640k = i10 + 1;
        if (i10 == 0) {
            this.f23522f = fVar.f23522f;
            if (fVar.p()) {
                s(1);
            }
        }
        ByteBuffer byteBuffer = fVar.f23520d;
        if (byteBuffer != null) {
            u(byteBuffer.remaining());
            this.f23520d.put(byteBuffer);
        }
        this.f25639j = fVar.f23522f;
        return true;
    }

    public long E() {
        return this.f23522f;
    }

    public long F() {
        return this.f25639j;
    }

    public int G() {
        return this.f25640k;
    }

    public boolean H() {
        if (this.f25640k > 0) {
            return true;
        }
        return false;
    }

    public void I(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        this.f25641l = i10;
    }

    public void i() {
        super.i();
        this.f25640k = 0;
    }
}

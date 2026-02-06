package o2;

import com.google.common.primitives.i;
import g2.b;
import i2.C2076a;
import i2.L;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import l2.f;
import z2.H;

public final class X {

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f24960d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f24961e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f24962a = b.f20997a;

    /* renamed from: b  reason: collision with root package name */
    private int f24963b = 2;

    /* renamed from: c  reason: collision with root package name */
    private int f24964c = 0;

    private ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i10;
        int i11;
        ByteBuffer byteBuffer2 = byteBuffer;
        byte[] bArr2 = bArr;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i12 = limit - position;
        int i13 = (i12 + 255) / 255;
        int i14 = i13 + 27 + i12;
        if (this.f24963b == 2) {
            if (bArr2 != null) {
                i11 = bArr2.length + 28;
            } else {
                i11 = f24960d.length;
            }
            i14 += f24961e.length + i11;
            i10 = i11;
        } else {
            i10 = 0;
        }
        ByteBuffer c10 = c(i14);
        if (this.f24963b == 2) {
            if (bArr2 != null) {
                e(c10, bArr2);
            } else {
                c10.put(f24960d);
            }
            c10.put(f24961e);
        }
        int j10 = this.f24964c + H.j(byteBuffer);
        this.f24964c = j10;
        ByteBuffer byteBuffer3 = c10;
        f(c10, (long) j10, this.f24963b, i13, false);
        for (int i15 = 0; i15 < i13; i15++) {
            if (i12 >= 255) {
                byteBuffer3.put((byte) -1);
                i12 -= 255;
            } else {
                byteBuffer3.put((byte) i12);
                i12 = 0;
            }
        }
        while (position < limit) {
            byteBuffer3.put(byteBuffer2.get(position));
            position++;
        }
        byteBuffer2.position(byteBuffer.limit());
        byteBuffer3.flip();
        if (this.f24963b == 2) {
            byte[] array = byteBuffer3.array();
            byte[] bArr3 = f24961e;
            byteBuffer3.putInt(i10 + bArr3.length + 22, L.w(array, byteBuffer3.arrayOffset() + i10 + bArr3.length, byteBuffer3.limit() - byteBuffer3.position(), 0));
        } else {
            byteBuffer3.putInt(22, L.w(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        }
        this.f24963b++;
        return byteBuffer3;
    }

    private ByteBuffer c(int i10) {
        if (this.f24962a.capacity() < i10) {
            this.f24962a = ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f24962a.clear();
        }
        return this.f24962a;
    }

    private void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0, 0, 1, true);
        byteBuffer.put(i.a((long) bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, L.w(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private void f(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z10) {
        byte b10;
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        if (z10) {
            b10 = 2;
        } else {
            b10 = 0;
        }
        byteBuffer.put(b10);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(i.a((long) i11));
    }

    public void a(f fVar, List list) {
        byte[] bArr;
        C2076a.e(fVar.f23520d);
        if (fVar.f23520d.limit() - fVar.f23520d.position() != 0) {
            if (this.f24963b == 2 && (list.size() == 1 || list.size() == 3)) {
                bArr = (byte[]) list.get(0);
            } else {
                bArr = null;
            }
            this.f24962a = b(fVar.f23520d, bArr);
            fVar.i();
            fVar.u(this.f24962a.remaining());
            fVar.f23520d.put(this.f24962a);
            fVar.x();
        }
    }

    public void d() {
        this.f24962a = b.f20997a;
        this.f24964c = 0;
        this.f24963b = 2;
    }
}

package o2;

import g2.b;
import g2.d;
import i2.C2076a;
import java.nio.ByteBuffer;

/* renamed from: o2.B  reason: case insensitive filesystem */
final class C2352B extends d {

    /* renamed from: i  reason: collision with root package name */
    private int[] f24806i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f24807j;

    C2352B() {
    }

    public void d(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C2076a.e(this.f24807j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l10 = l(((limit - position) / this.f21004b.f21002d) * this.f21005c.f21002d);
        while (position < limit) {
            for (int i10 : iArr) {
                l10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f21004b.f21002d;
        }
        byteBuffer.position(limit);
        l10.flip();
    }

    public b.a h(b.a aVar) {
        boolean z10;
        boolean z11;
        int[] iArr = this.f24806i;
        if (iArr == null) {
            return b.a.f20998e;
        }
        if (aVar.f21001c == 2) {
            if (aVar.f21000b != iArr.length) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = 0;
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 < aVar.f21000b) {
                    if (i11 != i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 |= z11;
                    i10++;
                } else {
                    throw new b.C0349b(aVar);
                }
            }
            if (z10) {
                return new b.a(aVar.f20999a, iArr.length, 2);
            }
            return b.a.f20998e;
        }
        throw new b.C0349b(aVar);
    }

    /* access modifiers changed from: protected */
    public void i() {
        this.f24807j = this.f24806i;
    }

    /* access modifiers changed from: protected */
    public void k() {
        this.f24807j = null;
        this.f24806i = null;
    }

    public void m(int[] iArr) {
        this.f24806i = iArr;
    }
}

package m9;

import ja.C3645a;
import java.nio.ByteBuffer;
import m9.C3849g;

final class x extends w {

    /* renamed from: i  reason: collision with root package name */
    private int[] f46745i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f46746j;

    x() {
    }

    public void d(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C3645a.e(this.f46746j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l10 = l(((limit - position) / this.f46738b.f46656d) * this.f46739c.f46656d);
        while (position < limit) {
            for (int i10 : iArr) {
                l10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f46738b.f46656d;
        }
        byteBuffer.position(limit);
        l10.flip();
    }

    public C3849g.a h(C3849g.a aVar) {
        boolean z10;
        boolean z11;
        int[] iArr = this.f46745i;
        if (iArr == null) {
            return C3849g.a.f46652e;
        }
        if (aVar.f46655c == 2) {
            if (aVar.f46654b != iArr.length) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = 0;
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 < aVar.f46654b) {
                    if (i11 != i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 |= z11;
                    i10++;
                } else {
                    throw new C3849g.b(aVar);
                }
            }
            if (z10) {
                return new C3849g.a(aVar.f46653a, iArr.length, 2);
            }
            return C3849g.a.f46652e;
        }
        throw new C3849g.b(aVar);
    }

    /* access modifiers changed from: protected */
    public void i() {
        this.f46746j = this.f46745i;
    }

    /* access modifiers changed from: protected */
    public void k() {
        this.f46746j = null;
        this.f46745i = null;
    }

    public void m(int[] iArr) {
        this.f46745i = iArr;
    }
}

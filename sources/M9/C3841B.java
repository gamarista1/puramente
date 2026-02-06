package m9;

import ja.M;
import java.nio.ByteBuffer;
import m9.C3849g;

/* renamed from: m9.B  reason: case insensitive filesystem */
final class C3841B extends w {

    /* renamed from: i  reason: collision with root package name */
    private static final int f46524i = Float.floatToIntBits(Float.NaN);

    C3841B() {
    }

    private static void m(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (floatToIntBits == f46524i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    public void d(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f46738b.f46655c;
        if (i11 == 536870912) {
            byteBuffer2 = l((i10 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i11 == 805306368) {
            byteBuffer2 = l(i10);
            while (position < limit) {
                m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    public C3849g.a h(C3849g.a aVar) {
        int i10 = aVar.f46655c;
        if (!M.u0(i10)) {
            throw new C3849g.b(aVar);
        } else if (i10 != 4) {
            return new C3849g.a(aVar.f46653a, aVar.f46654b, 4);
        } else {
            return C3849g.a.f46652e;
        }
    }
}

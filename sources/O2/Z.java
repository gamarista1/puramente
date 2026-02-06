package o2;

import g2.b;
import g2.d;
import i2.L;
import java.nio.ByteBuffer;

final class Z extends d {

    /* renamed from: i  reason: collision with root package name */
    private static final int f24979i = Float.floatToIntBits(Float.NaN);

    Z() {
    }

    private static void m(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (floatToIntBits == f24979i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    public void d(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f21004b.f21001c;
        if (i11 == 21) {
            byteBuffer2 = l((i10 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i11 == 22) {
            byteBuffer2 = l(i10);
            while (position < limit) {
                m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else if (i11 == 1342177280) {
            byteBuffer2 = l((i10 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i11 == 1610612736) {
            byteBuffer2 = l(i10);
            while (position < limit) {
                m((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    public b.a h(b.a aVar) {
        int i10 = aVar.f21001c;
        if (!L.B0(i10)) {
            throw new b.C0349b(aVar);
        } else if (i10 != 4) {
            return new b.a(aVar.f20999a, aVar.f21000b, 4);
        } else {
            return b.a.f20998e;
        }
    }
}

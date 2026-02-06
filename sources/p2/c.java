package P2;

import I2.b;
import f2.z;
import i2.C2073A;
import i2.G;
import i2.z;
import java.nio.ByteBuffer;

public final class c extends I2.c {

    /* renamed from: a  reason: collision with root package name */
    private final C2073A f5007a = new C2073A();

    /* renamed from: b  reason: collision with root package name */
    private final z f5008b = new z();

    /* renamed from: c  reason: collision with root package name */
    private G f5009c;

    /* access modifiers changed from: protected */
    public f2.z b(b bVar, ByteBuffer byteBuffer) {
        z.b bVar2;
        G g10 = this.f5009c;
        if (g10 == null || bVar.f2813j != g10.f()) {
            G g11 = new G(bVar.f23522f);
            this.f5009c = g11;
            g11.a(bVar.f23522f - bVar.f2813j);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f5007a.S(array, limit);
        this.f5008b.o(array, limit);
        this.f5008b.r(39);
        long h10 = (((long) this.f5008b.h(1)) << 32) | ((long) this.f5008b.h(32));
        this.f5008b.r(20);
        int h11 = this.f5008b.h(12);
        int h12 = this.f5008b.h(8);
        this.f5007a.V(14);
        if (h12 == 0) {
            bVar2 = new e();
        } else if (h12 == 255) {
            bVar2 = a.a(this.f5007a, h11, h10);
        } else if (h12 == 4) {
            bVar2 = f.a(this.f5007a);
        } else if (h12 == 5) {
            bVar2 = d.a(this.f5007a, h10, this.f5009c);
        } else if (h12 != 6) {
            bVar2 = null;
        } else {
            bVar2 = g.a(this.f5007a, h10, this.f5009c);
        }
        if (bVar2 == null) {
            return new f2.z(new z.b[0]);
        }
        return new f2.z(bVar2);
    }
}

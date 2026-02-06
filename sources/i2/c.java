package I2;

import f2.z;
import i2.C2076a;
import java.nio.ByteBuffer;

public abstract class c implements a {
    public final z a(b bVar) {
        boolean z10;
        ByteBuffer byteBuffer = (ByteBuffer) C2076a.e(bVar.f23520d);
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        return b(bVar, byteBuffer);
    }

    /* access modifiers changed from: protected */
    public abstract z b(b bVar, ByteBuffer byteBuffer);
}

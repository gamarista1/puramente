package D9;

import ja.C3645a;
import java.nio.ByteBuffer;

public abstract class g implements b {
    public final a a(d dVar) {
        boolean z10;
        ByteBuffer byteBuffer = (ByteBuffer) C3645a.e(dVar.f46950c);
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        if (dVar.o()) {
            return null;
        }
        return b(dVar, byteBuffer);
    }

    /* access modifiers changed from: protected */
    public abstract a b(d dVar, ByteBuffer byteBuffer);
}

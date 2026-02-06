package F9;

import D9.a;
import D9.d;
import D9.g;
import ja.B;
import ja.C3645a;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class b extends g {
    /* access modifiers changed from: protected */
    public a b(d dVar, ByteBuffer byteBuffer) {
        return new a(c(new B(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(B b10) {
        return new a((String) C3645a.e(b10.x()), (String) C3645a.e(b10.x()), b10.w(), b10.w(), Arrays.copyOfRange(b10.d(), b10.e(), b10.f()));
    }
}

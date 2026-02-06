package K2;

import I2.c;
import f2.z;
import i2.C2073A;
import i2.C2076a;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class b extends c {
    /* access modifiers changed from: protected */
    public z b(I2.b bVar, ByteBuffer byteBuffer) {
        return new z(c(new C2073A(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(C2073A a10) {
        return new a((String) C2076a.e(a10.B()), (String) C2076a.e(a10.B()), a10.A(), a10.A(), Arrays.copyOfRange(a10.e(), a10.f(), a10.g()));
    }
}

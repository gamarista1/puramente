package wf;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.C6496s;

final class e extends ByteArrayOutputStream {
    public e(int i10) {
        super(i10);
    }

    public final byte[] a() {
        byte[] bArr = this.buf;
        C6496s.g(bArr, "buf");
        return bArr;
    }
}

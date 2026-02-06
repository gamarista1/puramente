package W5;

import T5.k;
import java.io.InputStream;
import java.io.OutputStream;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private final int f34865a;

    /* renamed from: b  reason: collision with root package name */
    private final a f34866b;

    public l(a aVar) {
        this(aVar, 16384);
    }

    public long a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = (byte[]) this.f34866b.get(this.f34865a);
        long j10 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.f34865a);
                if (read == -1) {
                    return j10;
                }
                outputStream.write(bArr, 0, read);
                j10 += (long) read;
            } finally {
                this.f34866b.a(bArr);
            }
        }
    }

    public l(a aVar, int i10) {
        k.b(Boolean.valueOf(i10 > 0));
        this.f34865a = i10;
        this.f34866b = aVar;
    }
}

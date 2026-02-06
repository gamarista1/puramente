package m7;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.C6496s;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f46514a = new g();

    private g() {
    }

    public static final int a(InputStream inputStream, int i10, boolean z10) {
        int i11;
        C6496s.h(inputStream, "stream");
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int read = inputStream.read();
            if (read != -1) {
                if (z10) {
                    i11 = (read & 255) << (i12 * 8);
                } else {
                    i13 <<= 8;
                    i11 = read & 255;
                }
                i13 |= i11;
                i12++;
            } else {
                throw new IOException("no more bytes");
            }
        }
        return i13;
    }
}

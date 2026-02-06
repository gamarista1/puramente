package wf;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.C6496s;

/* renamed from: wf.b  reason: case insensitive filesystem */
public abstract class C6762b {
    public static final long a(InputStream inputStream, OutputStream outputStream, int i10) {
        C6496s.h(inputStream, "<this>");
        C6496s.h(outputStream, "out");
        byte[] bArr = new byte[i10];
        int read = inputStream.read(bArr);
        long j10 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j10 += (long) read;
            read = inputStream.read(bArr);
        }
        return j10;
    }

    public static /* synthetic */ long b(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(inputStream, outputStream, i10);
    }
}

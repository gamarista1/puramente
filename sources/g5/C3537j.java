package g5;

import T4.i;
import T4.k;
import V4.v;
import W4.b;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: g5.j  reason: case insensitive filesystem */
public class C3537j implements k {

    /* renamed from: a  reason: collision with root package name */
    private final List f43652a;

    /* renamed from: b  reason: collision with root package name */
    private final k f43653b;

    /* renamed from: c  reason: collision with root package name */
    private final b f43654c;

    public C3537j(List list, k kVar, b bVar) {
        this.f43652a = list;
        this.f43653b = kVar;
        this.f43654c = bVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e10) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            return null;
        }
    }

    /* renamed from: c */
    public v b(InputStream inputStream, int i10, int i11, i iVar) {
        byte[] e10 = e(inputStream);
        if (e10 == null) {
            return null;
        }
        return this.f43653b.b(ByteBuffer.wrap(e10), i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean a(InputStream inputStream, i iVar) {
        if (((Boolean) iVar.c(C3536i.f43651b)).booleanValue() || a.f(this.f43652a, inputStream, this.f43654c) != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }
}

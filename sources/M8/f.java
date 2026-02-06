package M8;

import G8.c;
import K8.h;
import P8.m;
import T4.i;
import T4.k;
import V4.v;
import com.github.penfeizhou.animation.io.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class f implements k {

    /* renamed from: a  reason: collision with root package name */
    private final k f32700a;

    public f(k kVar) {
        this.f32700a = kVar;
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
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public v b(InputStream inputStream, int i10, int i11, i iVar) {
        byte[] e10 = e(inputStream);
        if (e10 == null) {
            return null;
        }
        return this.f32700a.b(ByteBuffer.wrap(e10), i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean a(InputStream inputStream, i iVar) {
        if ((((Boolean) iVar.c(a.f32683b)).booleanValue() || !m.a(new d(inputStream))) && ((((Boolean) iVar.c(a.f32684c)).booleanValue() || !D8.d.a(new d(inputStream))) && ((((Boolean) iVar.c(a.f32682a)).booleanValue() || !h.b(new d(inputStream))) && (((Boolean) iVar.c(a.f32686e)).booleanValue() || !c.a(new d(inputStream)))))) {
            return false;
        }
        return true;
    }
}

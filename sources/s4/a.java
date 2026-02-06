package S4;

import T4.h;
import T4.i;
import V4.v;
import W4.b;
import W4.d;
import c5.C3176g;
import com.bumptech.glide.integration.webp.WebpImage;
import com.bumptech.glide.integration.webp.c;
import g5.C3529b;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class a {

    /* renamed from: d  reason: collision with root package name */
    public static final h f33845d = h.f("com.bumptech.glide.integration.webp.decoder.AnimatedWebpBitmapDecoder.DisableBitmap", Boolean.FALSE);

    /* renamed from: a  reason: collision with root package name */
    private final b f33846a;

    /* renamed from: b  reason: collision with root package name */
    private final d f33847b;

    /* renamed from: c  reason: collision with root package name */
    private final C3529b f33848c;

    public a(b bVar, d dVar) {
        this.f33846a = bVar;
        this.f33847b = dVar;
        this.f33848c = new C3529b(dVar, bVar);
    }

    public v a(InputStream inputStream, int i10, int i11, i iVar) {
        byte[] b10 = h.b(inputStream);
        if (b10 == null) {
            return null;
        }
        return b(ByteBuffer.wrap(b10), i10, i11, iVar);
    }

    public v b(ByteBuffer byteBuffer, int i10, int i11, i iVar) {
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr, 0, remaining);
        WebpImage create = WebpImage.create(bArr);
        i iVar2 = new i(this.f33848c, create, byteBuffer, h.a(create.getWidth(), create.getHeight(), i10, i11));
        try {
            iVar2.c();
            return C3176g.c(iVar2.b(), this.f33847b);
        } finally {
            iVar2.clear();
        }
    }

    public boolean c(InputStream inputStream, i iVar) {
        if (((Boolean) iVar.c(f33845d)).booleanValue()) {
            return false;
        }
        return c.e(c.b(inputStream, this.f33846a));
    }

    public boolean d(ByteBuffer byteBuffer, i iVar) {
        if (((Boolean) iVar.c(f33845d)).booleanValue()) {
            return false;
        }
        return c.e(c.c(byteBuffer));
    }
}

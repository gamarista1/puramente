package S4;

import T4.h;
import T4.i;
import T4.k;
import V4.v;
import W4.b;
import com.bumptech.glide.integration.webp.c;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class g implements k {

    /* renamed from: c  reason: collision with root package name */
    public static final h f33858c = h.f("com.bumptech.glide.integration.webp.decoder.StreamWebpDecoder.DisableAnimation", Boolean.FALSE);

    /* renamed from: a  reason: collision with root package name */
    private final k f33859a;

    /* renamed from: b  reason: collision with root package name */
    private final b f33860b;

    public g(k kVar, b bVar) {
        this.f33859a = kVar;
        this.f33860b = bVar;
    }

    /* renamed from: c */
    public v b(InputStream inputStream, int i10, int i11, i iVar) {
        byte[] b10 = h.b(inputStream);
        if (b10 == null) {
            return null;
        }
        return this.f33859a.b(ByteBuffer.wrap(b10), i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean a(InputStream inputStream, i iVar) {
        if (((Boolean) iVar.c(f33858c)).booleanValue()) {
            return false;
        }
        return c.e(c.b(inputStream, this.f33860b));
    }
}

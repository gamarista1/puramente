package S4;

import T4.h;
import T4.i;
import T4.k;
import V4.v;
import W4.b;
import android.content.Context;
import android.graphics.Bitmap;
import b5.C3155f;
import com.bumptech.glide.integration.webp.WebpImage;
import com.bumptech.glide.integration.webp.c;
import g5.C3529b;
import java.nio.ByteBuffer;

public class d implements k {

    /* renamed from: d  reason: collision with root package name */
    public static final h f33851d = h.f("com.bumptech.glide.integration.webp.decoder.ByteBufferWebpDecoder.DisableAnimation", Boolean.FALSE);

    /* renamed from: a  reason: collision with root package name */
    private final Context f33852a;

    /* renamed from: b  reason: collision with root package name */
    private final W4.d f33853b;

    /* renamed from: c  reason: collision with root package name */
    private final C3529b f33854c;

    public d(Context context, b bVar, W4.d dVar) {
        this.f33852a = context.getApplicationContext();
        this.f33853b = dVar;
        this.f33854c = new C3529b(dVar, bVar);
    }

    /* renamed from: c */
    public v b(ByteBuffer byteBuffer, int i10, int i11, i iVar) {
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        ByteBuffer byteBuffer2 = byteBuffer;
        byteBuffer2.get(bArr, 0, remaining);
        WebpImage create = WebpImage.create(bArr);
        C3529b bVar = this.f33854c;
        i iVar2 = new i(bVar, create, byteBuffer2, h.a(create.getWidth(), create.getHeight(), i10, i11), (n) iVar.c(o.f33908s));
        iVar2.c();
        Bitmap b10 = iVar2.b();
        if (b10 == null) {
            return null;
        }
        return new m(new k(this.f33852a, iVar2, this.f33853b, C3155f.c(), i10, i11, b10));
    }

    /* renamed from: d */
    public boolean a(ByteBuffer byteBuffer, i iVar) {
        if (((Boolean) iVar.c(f33851d)).booleanValue()) {
            return false;
        }
        return c.e(c.c(byteBuffer));
    }
}

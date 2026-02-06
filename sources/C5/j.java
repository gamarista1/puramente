package c5;

import T4.i;
import T4.k;
import V4.v;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

public final class j implements k {

    /* renamed from: a  reason: collision with root package name */
    private final C3175f f36462a = new C3175f();

    /* renamed from: c */
    public v b(ByteBuffer byteBuffer, int i10, int i11, i iVar) {
        return this.f36462a.c(ImageDecoder.createSource(byteBuffer), i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean a(ByteBuffer byteBuffer, i iVar) {
        return true;
    }
}

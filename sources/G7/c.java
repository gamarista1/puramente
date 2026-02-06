package g7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import f7.i;
import kotlin.jvm.internal.C6496s;
import m7.C3783c;
import x1.e;

public final class c extends b {

    /* renamed from: h  reason: collision with root package name */
    private final f f43673h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(i iVar, e eVar, f fVar) {
        super(iVar, eVar, fVar);
        C6496s.h(iVar, "bitmapPool");
        C6496s.h(eVar, "decodeBuffers");
        C6496s.h(fVar, "platformDecoderOptions");
        this.f43673h = fVar;
    }

    public int d(int i10, int i11, BitmapFactory.Options options) {
        C6496s.h(options, "options");
        Bitmap.Config a10 = options.outConfig;
        if (a10 == null) {
            a10 = Bitmap.Config.ARGB_8888;
        }
        return C3783c.i(i10, i11, a10);
    }
}

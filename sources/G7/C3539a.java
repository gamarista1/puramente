package g7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import f7.i;
import kotlin.jvm.internal.C6496s;
import m7.C3783c;
import x1.e;

/* renamed from: g7.a  reason: case insensitive filesystem */
public final class C3539a extends b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3539a(i iVar, e eVar, f fVar) {
        super(iVar, eVar, fVar);
        C6496s.h(iVar, "bitmapPool");
        C6496s.h(eVar, "decodeBuffers");
        C6496s.h(fVar, "platformDecoderOptions");
    }

    public int d(int i10, int i11, BitmapFactory.Options options) {
        C6496s.h(options, "options");
        Bitmap.Config config = options.inPreferredConfig;
        if (config != null) {
            return C3783c.i(i10, i11, config);
        }
        throw new IllegalStateException("Required value was null.");
    }
}

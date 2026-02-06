package i2;

import android.media.MediaFormat;
import f2.C1974i;
import java.nio.ByteBuffer;
import java.util.List;

public abstract class s {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void b(MediaFormat mediaFormat, C1974i iVar) {
        if (iVar != null) {
            d(mediaFormat, "color-transfer", iVar.f19987c);
            d(mediaFormat, "color-standard", iVar.f19985a);
            d(mediaFormat, "color-range", iVar.f19986b);
            a(mediaFormat, "hdr-static-info", iVar.f19988d);
        }
    }

    public static void c(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    public static void d(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void e(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer("csd-" + i10, ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }
}

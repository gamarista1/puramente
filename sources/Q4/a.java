package Q4;

import T4.b;
import T4.i;
import T4.k;
import V4.v;
import W4.d;
import android.graphics.Bitmap;
import android.util.Log;
import c5.C3176g;
import c5.s;
import java.nio.ByteBuffer;
import org.aomedia.avif.android.AvifDecoder;

public final class a implements k {

    /* renamed from: a  reason: collision with root package name */
    private final d f33657a;

    public a(d dVar) {
        this.f33657a = (d) o5.k.d(dVar);
    }

    private ByteBuffer e(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            return byteBuffer;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
        allocateDirect.put(byteBuffer);
        allocateDirect.flip();
        return allocateDirect;
    }

    /* renamed from: c */
    public v b(ByteBuffer byteBuffer, int i10, int i11, i iVar) {
        Bitmap.Config config;
        ByteBuffer e10 = e(byteBuffer);
        AvifDecoder.Info info = new AvifDecoder.Info();
        if (!AvifDecoder.getInfo(e10, e10.remaining(), info)) {
            if (Log.isLoggable("AvifBitmapDecoder", 6)) {
                Log.e("AvifBitmapDecoder", "Requested to decode byte buffer which cannot be handled by AvifDecoder");
            }
            return null;
        }
        if (iVar.c(s.f36483f) == b.PREFER_RGB_565) {
            config = Bitmap.Config.RGB_565;
        } else if (info.depth == 8) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGBA_F16;
        }
        Bitmap d10 = this.f33657a.d(info.width, info.height, config);
        if (AvifDecoder.decode(e10, e10.remaining(), d10)) {
            return C3176g.c(d10, this.f33657a);
        }
        if (Log.isLoggable("AvifBitmapDecoder", 6)) {
            Log.e("AvifBitmapDecoder", "Failed to decode ByteBuffer as Avif.");
        }
        this.f33657a.c(d10);
        return null;
    }

    /* renamed from: d */
    public boolean a(ByteBuffer byteBuffer, i iVar) {
        return AvifDecoder.isAvifImage(e(byteBuffer));
    }
}

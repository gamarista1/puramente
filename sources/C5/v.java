package c5;

import R1.a;
import W4.b;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o5.C3882a;

public final class v implements ImageHeaderParser {
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public int b(InputStream inputStream, b bVar) {
        int i10 = new a(inputStream).i("Orientation", 1);
        if (i10 == 0) {
            return -1;
        }
        return i10;
    }

    public int c(ByteBuffer byteBuffer, b bVar) {
        return b(C3882a.g(byteBuffer), bVar);
    }

    public ImageHeaderParser.ImageType d(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}

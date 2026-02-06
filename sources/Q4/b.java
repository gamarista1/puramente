package Q4;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.c;
import com.bumptech.glide.j;
import j5.C3639c;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class b extends C3639c {
    public void registerComponents(Context context, c cVar, j jVar) {
        a aVar = new a(cVar.h());
        Class<Bitmap> cls = Bitmap.class;
        jVar.p(ByteBuffer.class, cls, aVar);
        jVar.p(InputStream.class, cls, new c(jVar.g(), aVar, cVar.g()));
    }
}

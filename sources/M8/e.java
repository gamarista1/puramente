package M8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.c;
import com.bumptech.glide.j;
import com.github.penfeizhou.animation.decode.b;
import j5.C3639c;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class e extends C3639c {
    public void registerComponents(Context context, c cVar, j jVar) {
        super.registerComponents(context, cVar, jVar);
        b bVar = new b();
        Class<b> cls = b.class;
        jVar.p(InputStream.class, cls, new f(bVar));
        jVar.p(ByteBuffer.class, cls, bVar);
        jVar.t(cls, Drawable.class, new d());
        jVar.t(cls, Bitmap.class, new c(cVar.h()));
    }
}

package com.bumptech.glide.integration.webp;

import S4.a;
import S4.e;
import S4.f;
import S4.g;
import S4.k;
import S4.l;
import W4.d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import c5.C3170a;
import com.bumptech.glide.c;
import com.bumptech.glide.j;
import j5.C3639c;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class b extends C3639c {
    public void registerComponents(Context context, c cVar, j jVar) {
        Resources resources = context.getResources();
        d h10 = cVar.h();
        W4.b g10 = cVar.g();
        S4.j jVar2 = new S4.j(jVar.g(), resources.getDisplayMetrics(), h10, g10);
        a aVar = new a(g10, h10);
        S4.c cVar2 = new S4.c(jVar2);
        f fVar = new f(jVar2, g10);
        S4.d dVar = new S4.d(context, g10, h10);
        Class<ByteBuffer> cls = ByteBuffer.class;
        Class<Bitmap> cls2 = Bitmap.class;
        Class<InputStream> cls3 = InputStream.class;
        Class<BitmapDrawable> cls4 = BitmapDrawable.class;
        j q10 = jVar.q("Bitmap", cls, cls2, cVar2).q("Bitmap", cls3, cls2, fVar).q("BitmapDrawable", cls, cls4, new C3170a(resources, cVar2)).q("BitmapDrawable", cls3, cls4, new C3170a(resources, fVar)).q("Bitmap", cls, cls2, new S4.b(aVar)).q("Bitmap", cls3, cls2, new e(aVar));
        Class<k> cls5 = k.class;
        q10.p(cls, cls5, dVar).p(cls3, cls5, new g(dVar, g10)).o(cls5, new l());
    }
}

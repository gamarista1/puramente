package f7;

import android.graphics.Bitmap;
import kotlin.jvm.internal.C6496s;

public final class r implements i {
    /* renamed from: h */
    public Bitmap get(int i10) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i10) / 2.0d), Bitmap.Config.RGB_565);
        C6496s.g(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    /* renamed from: i */
    public void a(Bitmap bitmap) {
        C6496s.h(bitmap, "value");
        bitmap.recycle();
    }
}

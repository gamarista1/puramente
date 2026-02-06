package U6;

import X5.h;
import android.graphics.Bitmap;

public class f implements h {

    /* renamed from: a  reason: collision with root package name */
    private static f f34419a;

    private f() {
    }

    public static f b() {
        if (f34419a == null) {
            f34419a = new f();
        }
        return f34419a;
    }

    /* renamed from: c */
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }
}

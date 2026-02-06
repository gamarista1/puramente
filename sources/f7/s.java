package f7;

import T5.m;
import android.graphics.Bitmap;
import java.util.Set;
import kotlin.jvm.internal.C6496s;

public final class s implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Set f43460a;

    public s() {
        Set b10 = m.b();
        C6496s.g(b10, "newIdentityHashSet(...)");
        this.f43460a = b10;
    }

    /* renamed from: h */
    public Bitmap get(int i10) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i10) / 2.0d), Bitmap.Config.RGB_565);
        C6496s.g(createBitmap, "createBitmap(...)");
        this.f43460a.add(createBitmap);
        return createBitmap;
    }

    /* renamed from: i */
    public void a(Bitmap bitmap) {
        C6496s.h(bitmap, "value");
        this.f43460a.remove(bitmap);
        bitmap.recycle();
    }
}

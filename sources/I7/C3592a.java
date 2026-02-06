package i7;

import M5.d;
import X5.a;
import X6.y;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: i7.a  reason: case insensitive filesystem */
public abstract class C3592a implements C3595d {

    /* renamed from: a  reason: collision with root package name */
    public static final Bitmap.Config f44240a = Bitmap.Config.ARGB_8888;

    /* renamed from: b  reason: collision with root package name */
    private static Method f44241b;

    private static void c(Bitmap bitmap, Bitmap bitmap2) {
        Class<Bitmap> cls = Bitmap.class;
        if (!y.a() || bitmap.getConfig() != bitmap2.getConfig()) {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
            return;
        }
        try {
            if (f44241b == null) {
                int i10 = Bitmaps.f39763a;
                f44241b = Bitmaps.class.getDeclaredMethod("copyBitmap", new Class[]{cls, cls});
            }
            f44241b.invoke((Object) null, new Object[]{bitmap, bitmap2});
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e13);
        }
    }

    public d a() {
        return null;
    }

    public a b(Bitmap bitmap, U6.d dVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f44240a;
        }
        a d10 = dVar.d(width, height, config);
        try {
            e((Bitmap) d10.I(), bitmap);
            return d10.o();
        } finally {
            a.E(d10);
        }
    }

    public void e(Bitmap bitmap, Bitmap bitmap2) {
        c(bitmap, bitmap2);
        d(bitmap);
    }

    public String getName() {
        return "Unknown postprocessor";
    }

    public void d(Bitmap bitmap) {
    }
}

package E3;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

abstract class L {

    /* renamed from: a  reason: collision with root package name */
    private static Field f1769a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f1770b;

    L() {
    }

    public abstract void a(View view);

    public abstract float b(View view);

    public abstract void c(View view);

    public abstract void d(View view, int i10, int i11, int i12, int i13);

    public abstract void e(View view, float f10);

    public void f(View view, int i10) {
        if (!f1770b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f1769a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f1770b = true;
        }
        Field field = f1769a;
        if (field != null) {
            try {
                f1769a.setInt(view, i10 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);
}

package E3;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.C1680b0;

abstract class A {

    /* renamed from: a  reason: collision with root package name */
    private static final L f1761a;

    /* renamed from: b  reason: collision with root package name */
    static final Property f1762b = new a(Float.class, "translationAlpha");

    /* renamed from: c  reason: collision with root package name */
    static final Property f1763c = new b(Rect.class, "clipBounds");

    static class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(A.c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            A.g(view, f10.floatValue());
        }
    }

    static class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C1680b0.t(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            C1680b0.v0(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f1761a = new K();
        } else {
            f1761a = new J();
        }
    }

    static void a(View view) {
        f1761a.a(view);
    }

    static z b(View view) {
        return new y(view);
    }

    static float c(View view) {
        return f1761a.b(view);
    }

    static O d(View view) {
        return new N(view);
    }

    static void e(View view) {
        f1761a.c(view);
    }

    static void f(View view, int i10, int i11, int i12, int i13) {
        f1761a.d(view, i10, i11, i12, i13);
    }

    static void g(View view, float f10) {
        f1761a.e(view, f10);
    }

    static void h(View view, int i10) {
        f1761a.f(view, i10);
    }

    static void i(View view, Matrix matrix) {
        f1761a.g(view, matrix);
    }

    static void j(View view, Matrix matrix) {
        f1761a.h(view, matrix);
    }
}

package ib;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.n;

/* renamed from: ib.h  reason: case insensitive filesystem */
public abstract class C5021h {
    static C5017d a(int i10) {
        if (i10 == 0) {
            return new C5023j();
        }
        if (i10 != 1) {
            return b();
        }
        return new C5018e();
    }

    static C5017d b() {
        return new C5023j();
    }

    static C5019f c() {
        return new C5019f();
    }

    public static void d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof C5020g) {
            ((C5020g) background).V(f10);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C5020g) {
            f(view, (C5020g) background);
        }
    }

    public static void f(View view, C5020g gVar) {
        if (gVar.O()) {
            gVar.Z(n.d(view));
        }
    }
}

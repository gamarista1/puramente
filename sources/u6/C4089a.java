package u6;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: u6.a  reason: case insensitive filesystem */
public abstract class C4089a {

    /* renamed from: u6.a$a  reason: collision with other inner class name */
    public static class C0733a {

        /* renamed from: a  reason: collision with root package name */
        public int f48600a;

        /* renamed from: b  reason: collision with root package name */
        public int f48601b;
    }

    private static boolean a(int i10) {
        if (i10 == 0 || i10 == -2) {
            return true;
        }
        return false;
    }

    public static void b(C0733a aVar, float f10, ViewGroup.LayoutParams layoutParams, int i10, int i11) {
        if (f10 > 0.0f && layoutParams != null) {
            if (a(layoutParams.height)) {
                aVar.f48601b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(aVar.f48600a) - i10)) / f10) + ((float) i11)), aVar.f48601b), 1073741824);
            } else if (a(layoutParams.width)) {
                aVar.f48600a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(aVar.f48601b) - i11)) * f10) + ((float) i10)), aVar.f48600a), 1073741824);
            }
        }
    }
}

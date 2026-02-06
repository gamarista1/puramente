package androidx.compose.ui.focus;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.platform.r;
import c1.t;
import q0.C2423i;

public abstract class h {
    public static final C2423i a(View view) {
        int[] a10 = g.f13326a.a();
        view.getLocationInWindow(a10);
        int i10 = a10[0];
        return new C2423i((float) i10, (float) a10[1], ((float) i10) + ((float) view.getWidth()), ((float) a10[1]) + ((float) view.getHeight()));
    }

    public static final boolean b(View view, Integer num, Rect rect) {
        View view2;
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof r) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            if (findNextFocusFromRect != null) {
                return findNextFocusFromRect.requestFocus(num.intValue(), rect);
            }
            return view.requestFocus(num.intValue(), rect);
        }
        if (view.hasFocus()) {
            view2 = view.findFocus();
        } else {
            view2 = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view2, num.intValue());
        if (findNextFocus != null) {
            return findNextFocus.requestFocus(num.intValue());
        }
        return view.requestFocus(num.intValue());
    }

    public static final Integer c(int i10) {
        d.a aVar = d.f13315b;
        if (d.l(i10, aVar.h())) {
            return 33;
        }
        if (d.l(i10, aVar.a())) {
            return 130;
        }
        if (d.l(i10, aVar.d())) {
            return 17;
        }
        if (d.l(i10, aVar.g())) {
            return 66;
        }
        if (d.l(i10, aVar.e())) {
            return 2;
        }
        if (d.l(i10, aVar.f())) {
            return 1;
        }
        return null;
    }

    public static final d d(int i10) {
        if (i10 == 1) {
            return d.i(d.f13315b.f());
        }
        if (i10 == 2) {
            return d.i(d.f13315b.e());
        }
        if (i10 == 17) {
            return d.i(d.f13315b.d());
        }
        if (i10 == 33) {
            return d.i(d.f13315b.h());
        }
        if (i10 == 66) {
            return d.i(d.f13315b.g());
        }
        if (i10 != 130) {
            return null;
        }
        return d.i(d.f13315b.a());
    }

    public static final t e(int i10) {
        if (i10 == 0) {
            return t.Ltr;
        }
        if (i10 != 1) {
            return null;
        }
        return t.Rtl;
    }
}

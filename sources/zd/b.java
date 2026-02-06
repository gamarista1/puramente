package zd;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.C6496s;

public abstract class b {
    public static final ViewGroup a(View view) {
        C6496s.h(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    public static final View b(View view) {
        C6496s.h(view, "<this>");
        ViewGroup a10 = a(view);
        if (a10 != null) {
            a10.endViewTransition(view);
            a10.removeView(view);
        }
        view.setVisibility(0);
        return view;
    }
}

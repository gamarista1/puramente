package E1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C1692h0;
import androidx.core.view.C1694i0;
import kotlin.jvm.internal.C6496s;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int f1737a = d.f1741b;

    /* renamed from: b  reason: collision with root package name */
    private static final int f1738b = d.f1740a;

    public static final void a(View view, b bVar) {
        C6496s.h(view, "<this>");
        C6496s.h(bVar, "listener");
        d(view).a(bVar);
    }

    public static final void b(View view) {
        C6496s.h(view, "<this>");
        for (View d10 : C1694i0.a(view)) {
            d(d10).b();
        }
    }

    public static final void c(ViewGroup viewGroup) {
        C6496s.h(viewGroup, "<this>");
        for (View d10 : C1692h0.a(viewGroup)) {
            d(d10).b();
        }
    }

    private static final c d(View view) {
        int i10 = f1737a;
        c cVar = (c) view.getTag(i10);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(i10, cVar2);
        return cVar2;
    }

    public static final boolean e(View view) {
        Boolean bool;
        C6496s.h(view, "<this>");
        Object tag = view.getTag(f1738b);
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean f(View view) {
        C6496s.h(view, "<this>");
        for (ViewParent viewParent : C1694i0.b(view)) {
            if ((viewParent instanceof View) && e((View) viewParent)) {
                return true;
            }
        }
        return false;
    }

    public static final void g(View view, b bVar) {
        C6496s.h(view, "<this>");
        C6496s.h(bVar, "listener");
        d(view).c(bVar);
    }

    public static final void h(View view, boolean z10) {
        C6496s.h(view, "<this>");
        view.setTag(f1738b, Boolean.valueOf(z10));
    }
}

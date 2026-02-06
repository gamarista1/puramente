package x3;

import Rg.k;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;

/* renamed from: x3.g  reason: case insensitive filesystem */
public abstract class C2915g {

    /* renamed from: x3.g$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f28429a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final View invoke(View view) {
            C6496s.h(view, "view");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* renamed from: x3.g$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f28430a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final C2914f invoke(View view) {
            C6496s.h(view, "view");
            Object tag = view.getTag(C2909a.f28413a);
            if (tag instanceof C2914f) {
                return (C2914f) tag;
            }
            return null;
        }
    }

    public static final C2914f a(View view) {
        C6496s.h(view, "<this>");
        return (C2914f) k.r(k.y(k.h(view, a.f28429a), b.f28430a));
    }

    public static final void b(View view, C2914f fVar) {
        C6496s.h(view, "<this>");
        view.setTag(C2909a.f28413a, fVar);
    }
}

package androidx.lifecycle;

import Rg.k;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;

public abstract class f0 {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17218a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final View invoke(View view) {
            C6496s.h(view, "currentView");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f17219a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final C1798v invoke(View view) {
            C6496s.h(view, "viewParent");
            Object tag = view.getTag(Y1.a.f10260a);
            if (tag instanceof C1798v) {
                return (C1798v) tag;
            }
            return null;
        }
    }

    public static final C1798v a(View view) {
        C6496s.h(view, "<this>");
        return (C1798v) k.r(k.y(k.h(view, a.f17218a), b.f17219a));
    }

    public static final void b(View view, C1798v vVar) {
        C6496s.h(view, "<this>");
        view.setTag(Y1.a.f10260a, vVar);
    }
}

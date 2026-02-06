package androidx.lifecycle;

import Rg.k;
import Z1.c;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;

public abstract class g0 {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17224a = new a();

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

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f17225a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final e0 invoke(View view) {
            C6496s.h(view, "view");
            Object tag = view.getTag(c.f10388a);
            if (tag instanceof e0) {
                return (e0) tag;
            }
            return null;
        }
    }

    public static final e0 a(View view) {
        C6496s.h(view, "<this>");
        return (e0) k.r(k.y(k.h(view, a.f17224a), b.f17225a));
    }

    public static final void b(View view, e0 e0Var) {
        C6496s.h(view, "<this>");
        view.setTag(c.f10388a, e0Var);
    }
}

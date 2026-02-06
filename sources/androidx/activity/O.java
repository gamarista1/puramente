package androidx.activity;

import Rg.k;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;

public abstract class O {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f10783a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final View invoke(View view) {
            C6496s.h(view, "it");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f10784a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final K invoke(View view) {
            C6496s.h(view, "it");
            Object tag = view.getTag(L.f10776b);
            if (tag instanceof K) {
                return (K) tag;
            }
            return null;
        }
    }

    public static final K a(View view) {
        C6496s.h(view, "<this>");
        return (K) k.r(k.y(k.h(view, a.f10783a), b.f10784a));
    }

    public static final void b(View view, K k10) {
        C6496s.h(view, "<this>");
        C6496s.h(k10, "onBackPressedDispatcherOwner");
        view.setTag(L.f10776b, k10);
    }
}

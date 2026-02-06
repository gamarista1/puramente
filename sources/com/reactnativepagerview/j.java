package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.C6496s;

public final class j extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f59452d = new ArrayList();

    public final View A(int i10) {
        Object obj = this.f59452d.get(i10);
        C6496s.g(obj, "get(...)");
        return (View) obj;
    }

    /* renamed from: B */
    public void o(k kVar, int i10) {
        C6496s.h(kVar, "holder");
        FrameLayout N10 = kVar.N();
        View A10 = A(i10);
        if (N10.getChildCount() > 0) {
            N10.removeAllViews();
        }
        if (A10.getParent() != null) {
            ViewParent parent = A10.getParent();
            C6496s.f(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) parent).removeView(A10);
        }
        N10.addView(A10);
    }

    /* renamed from: C */
    public k q(ViewGroup viewGroup, int i10) {
        C6496s.h(viewGroup, "parent");
        return k.f59453u.a(viewGroup);
    }

    public final void D() {
        ViewParent viewParent;
        int size = this.f59452d.size();
        int i10 = 1;
        if (1 <= size) {
            while (true) {
                Object obj = this.f59452d.get(i10 - 1);
                C6496s.g(obj, "get(...)");
                View view = (View) obj;
                ViewParent parent = view.getParent();
                if (parent != null) {
                    viewParent = parent.getParent();
                } else {
                    viewParent = null;
                }
                if (viewParent != null) {
                    ViewParent parent2 = view.getParent().getParent();
                    C6496s.f(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewParent parent3 = view.getParent();
                    C6496s.f(parent3, "null cannot be cast to non-null type android.view.View");
                    ((ViewGroup) parent2).removeView((View) parent3);
                }
                if (i10 == size) {
                    break;
                }
                i10++;
            }
        }
        int size2 = this.f59452d.size();
        this.f59452d.clear();
        l(0, size2);
    }

    public final void E(View view) {
        C6496s.h(view, "child");
        int indexOf = this.f59452d.indexOf(view);
        if (indexOf > -1) {
            F(indexOf);
        }
    }

    public final void F(int i10) {
        if (i10 >= 0 && i10 < this.f59452d.size()) {
            this.f59452d.remove(i10);
            m(i10);
        }
    }

    public int e() {
        return this.f59452d.size();
    }

    public final void z(View view, int i10) {
        C6496s.h(view, "child");
        this.f59452d.add(i10, view);
        k(i10);
    }
}

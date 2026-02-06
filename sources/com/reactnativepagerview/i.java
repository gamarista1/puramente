package com.reactnativepagerview;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.f;
import com.facebook.react.uimanager.G;
import kotlin.jvm.internal.C6496s;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f59451a = new i();

    private i() {
    }

    private final void j(View view) {
        view.post(new f(view));
    }

    /* access modifiers changed from: private */
    public static final void k(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* access modifiers changed from: private */
    public static final void o(f fVar) {
        fVar.invalidate();
        fVar.requestLayout();
    }

    /* access modifiers changed from: private */
    public static final void r(b bVar) {
        bVar.setDidSetInitialIndex(true);
    }

    /* access modifiers changed from: private */
    public static final void x(int i10, f fVar, View view, float f10) {
        C6496s.h(view, "page");
        float f11 = ((float) i10) * f10;
        if (fVar.getOrientation() == 0) {
            if (fVar.getLayoutDirection() == 1) {
                f11 = -f11;
            }
            view.setTranslationX(f11);
            return;
        }
        view.setTranslationY(f11);
    }

    public final void e(b bVar, View view, int i10) {
        Integer initialIndex;
        C6496s.h(bVar, "host");
        if (view != null) {
            f h10 = h(bVar);
            j jVar = (j) h10.getAdapter();
            if (jVar != null) {
                jVar.z(view, i10);
            }
            if (h10.getCurrentItem() == i10) {
                j(h10);
            }
            if (!bVar.getDidSetInitialIndex() && (initialIndex = bVar.getInitialIndex()) != null && initialIndex.intValue() == i10) {
                bVar.setDidSetInitialIndex(true);
                p(h10, i10, false);
            }
        }
    }

    public final View f(b bVar, int i10) {
        C6496s.h(bVar, "parent");
        j jVar = (j) h(bVar).getAdapter();
        C6496s.e(jVar);
        return jVar.A(i10);
    }

    public final int g(b bVar) {
        C6496s.h(bVar, "parent");
        RecyclerView.h adapter = h(bVar).getAdapter();
        if (adapter != null) {
            return adapter.e();
        }
        return 0;
    }

    public final f h(b bVar) {
        C6496s.h(bVar, "view");
        if (bVar.getChildAt(0) instanceof f) {
            View childAt = bVar.getChildAt(0);
            C6496s.f(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
            return (f) childAt;
        }
        throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
    }

    public final boolean i() {
        return true;
    }

    public final void l(b bVar) {
        C6496s.h(bVar, "parent");
        f h10 = h(bVar);
        h10.setUserInputEnabled(false);
        j jVar = (j) h10.getAdapter();
        if (jVar != null) {
            jVar.D();
        }
    }

    public final void m(b bVar, View view) {
        C6496s.h(bVar, "parent");
        C6496s.h(view, "view");
        f h10 = h(bVar);
        j jVar = (j) h10.getAdapter();
        if (jVar != null) {
            jVar.E(view);
        }
        j(h10);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(com.reactnativepagerview.b r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C6496s.h(r6, r0)
            androidx.viewpager2.widget.f r6 = r5.h(r6)
            androidx.recyclerview.widget.RecyclerView$h r0 = r6.getAdapter()
            com.reactnativepagerview.j r0 = (com.reactnativepagerview.j) r0
            r1 = 0
            if (r0 == 0) goto L_0x0017
            android.view.View r2 = r0.A(r7)
            goto L_0x0018
        L_0x0017:
            r2 = r1
        L_0x0018:
            if (r2 == 0) goto L_0x0030
            android.view.ViewParent r3 = r2.getParent()
            if (r3 == 0) goto L_0x0030
            android.view.ViewParent r3 = r2.getParent()
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x002b
            r1 = r3
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.removeView(r2)
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.F(r7)
        L_0x0035:
            com.reactnativepagerview.g r7 = new com.reactnativepagerview.g
            r7.<init>(r6)
            r6.post(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativepagerview.i.n(com.reactnativepagerview.b, int):void");
    }

    public final void p(f fVar, int i10, boolean z10) {
        C6496s.h(fVar, "view");
        j(fVar);
        fVar.j(i10, z10);
    }

    public final void q(b bVar, int i10) {
        C6496s.h(bVar, "host");
        f h10 = h(bVar);
        if (bVar.getInitialIndex() == null) {
            bVar.setInitialIndex(Integer.valueOf(i10));
            h10.post(new h(bVar));
        }
    }

    public final void s(b bVar, String str) {
        C6496s.h(bVar, "host");
        C6496s.h(str, "value");
        f h10 = h(bVar);
        if (C6496s.c(str, "rtl")) {
            h10.setLayoutDirection(1);
        } else {
            h10.setLayoutDirection(0);
        }
    }

    public final void t(b bVar, int i10) {
        C6496s.h(bVar, "host");
        h(bVar).setOffscreenPageLimit(i10);
    }

    public final void u(b bVar, String str) {
        C6496s.h(bVar, "host");
        C6496s.h(str, "value");
        h(bVar).setOrientation(C6496s.c(str, "vertical") ? 1 : 0);
    }

    public final void v(b bVar, String str) {
        C6496s.h(bVar, "host");
        C6496s.h(str, "value");
        View childAt = h(bVar).getChildAt(0);
        if (C6496s.c(str, "never")) {
            childAt.setOverScrollMode(2);
        } else if (C6496s.c(str, "always")) {
            childAt.setOverScrollMode(0);
        } else {
            childAt.setOverScrollMode(1);
        }
    }

    public final void w(b bVar, int i10) {
        C6496s.h(bVar, "host");
        f h10 = h(bVar);
        h10.setPageTransformer(new e((int) G.g((double) i10), h10));
    }

    public final void y(b bVar, boolean z10) {
        C6496s.h(bVar, "host");
        h(bVar).setUserInputEnabled(z10);
    }
}

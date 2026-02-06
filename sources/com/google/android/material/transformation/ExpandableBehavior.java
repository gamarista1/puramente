package com.google.android.material.transformation;

import android.content.Context;
import android.support.v4.media.session.c;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1680b0;
import cb.C4476a;
import java.util.List;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c {

    /* renamed from: a  reason: collision with root package name */
    private int f56448a = 0;

    public ExpandableBehavior() {
    }

    /* access modifiers changed from: protected */
    public C4476a E(CoordinatorLayout coordinatorLayout, View view) {
        List s10 = coordinatorLayout.s(view);
        int size = s10.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) s10.get(i10);
            if (e(coordinatorLayout, view, view2)) {
                c.a(view2);
                return null;
            }
        }
        return null;
    }

    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        c.a(view2);
        throw null;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (C1680b0.S(view)) {
            return false;
        }
        E(coordinatorLayout, view);
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

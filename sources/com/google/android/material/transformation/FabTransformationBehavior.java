package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: b  reason: collision with root package name */
    private final Rect f56449b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private final RectF f56450c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    private final RectF f56451d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    private final int[] f56452e = new int[2];

    public FabTransformationBehavior() {
    }

    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f15720h == 0) {
            fVar.f15720h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

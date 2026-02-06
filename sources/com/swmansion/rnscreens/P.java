package com.swmansion.rnscreens;

import android.animation.ValueAnimator;
import android.view.Window;
import com.swmansion.rnscreens.O;

public final /* synthetic */ class P implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Window f59738a;

    public /* synthetic */ P(Window window) {
        this.f59738a = window;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        O.b.b(this.f59738a, valueAnimator);
    }
}

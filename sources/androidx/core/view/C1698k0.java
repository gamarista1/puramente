package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: androidx.core.view.k0  reason: case insensitive filesystem */
public final /* synthetic */ class C1698k0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1706o0 f16098a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f16099b;

    public /* synthetic */ C1698k0(C1706o0 o0Var, View view) {
        this.f16098a = o0Var;
        this.f16099b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f16098a.a(this.f16099b);
    }
}

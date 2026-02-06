package i8;

import android.graphics.Paint;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

class l extends Animation {

    /* renamed from: a  reason: collision with root package name */
    private final View f44334a;

    /* renamed from: b  reason: collision with root package name */
    private final float f44335b;

    /* renamed from: c  reason: collision with root package name */
    private final float f44336c;

    public l(View view, float f10, float f11) {
        this.f44334a = view;
        this.f44335b = f10;
        this.f44336c = f11 - f10;
        setAnimationListener(new a(view));
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f10, Transformation transformation) {
        this.f44334a.setAlpha(this.f44335b + (this.f44336c * f10));
    }

    public boolean willChangeBounds() {
        return false;
    }

    static class a implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        private final View f44337a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f44338b = false;

        public a(View view) {
            this.f44337a = view;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.f44338b) {
                this.f44337a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animation animation) {
            if (this.f44337a.hasOverlappingRendering() && this.f44337a.getLayerType() == 0) {
                this.f44338b = true;
                this.f44337a.setLayerType(2, (Paint) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }
    }
}

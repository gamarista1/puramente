package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.C1680b0;

class a extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private Animation.AnimationListener f18387a;

    /* renamed from: b  reason: collision with root package name */
    private int f18388b;

    /* renamed from: c  reason: collision with root package name */
    private int f18389c;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a  reason: collision with other inner class name */
    private static class C0316a extends OvalShape {

        /* renamed from: a  reason: collision with root package name */
        private Paint f18390a = new Paint();

        /* renamed from: b  reason: collision with root package name */
        private int f18391b;

        /* renamed from: c  reason: collision with root package name */
        private a f18392c;

        C0316a(a aVar, int i10) {
            this.f18392c = aVar;
            this.f18391b = i10;
            a((int) rect().width());
        }

        private void a(int i10) {
            float f10 = (float) (i10 / 2);
            this.f18390a.setShader(new RadialGradient(f10, f10, (float) this.f18391b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = this.f18392c.getWidth() / 2;
            float f10 = (float) width;
            float height = (float) (this.f18392c.getHeight() / 2);
            canvas.drawCircle(f10, height, f10, this.f18390a);
            canvas.drawCircle(f10, height, (float) (width - this.f18391b), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            a((int) f10);
        }
    }

    a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i10 = (int) (1.75f * f10);
        int i11 = (int) (0.0f * f10);
        this.f18388b = (int) (3.5f * f10);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(C3.a.f1148f);
        this.f18389c = obtainStyledAttributes.getColor(C3.a.f1149g, -328966);
        obtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C1680b0.w0(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0316a(this, this.f18388b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f18388b, (float) i11, (float) i10, 503316480);
            int i12 = this.f18388b;
            setPadding(i12, i12, i12, i12);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f18389c);
        C1680b0.s0(this, shapeDrawable);
    }

    private boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f18387a = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f18387a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f18387a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f18388b * 2), getMeasuredHeight() + (this.f18388b * 2));
        }
    }

    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
            this.f18389c = i10;
        }
    }
}

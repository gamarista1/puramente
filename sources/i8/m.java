package i8;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

class m extends Animation implements j {

    /* renamed from: a  reason: collision with root package name */
    private final View f44339a;

    /* renamed from: b  reason: collision with root package name */
    private float f44340b;

    /* renamed from: c  reason: collision with root package name */
    private float f44341c;

    /* renamed from: d  reason: collision with root package name */
    private float f44342d;

    /* renamed from: e  reason: collision with root package name */
    private float f44343e;

    /* renamed from: f  reason: collision with root package name */
    private int f44344f;

    /* renamed from: g  reason: collision with root package name */
    private int f44345g;

    /* renamed from: h  reason: collision with root package name */
    private int f44346h;

    /* renamed from: i  reason: collision with root package name */
    private int f44347i;

    public m(View view, int i10, int i11, int i12, int i13) {
        this.f44339a = view;
        c(i10, i11, i12, i13);
    }

    private void c(int i10, int i11, int i12, int i13) {
        this.f44340b = this.f44339a.getX() - this.f44339a.getTranslationX();
        this.f44341c = this.f44339a.getY() - this.f44339a.getTranslationY();
        this.f44344f = this.f44339a.getWidth();
        int height = this.f44339a.getHeight();
        this.f44345g = height;
        this.f44342d = ((float) i10) - this.f44340b;
        this.f44343e = ((float) i11) - this.f44341c;
        this.f44346h = i12 - this.f44344f;
        this.f44347i = i13 - height;
    }

    public void a(int i10, int i11, int i12, int i13) {
        c(i10, i11, i12, i13);
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f10, Transformation transformation) {
        float f11 = this.f44340b + (this.f44342d * f10);
        float f12 = this.f44341c + (this.f44343e * f10);
        this.f44339a.layout(Math.round(f11), Math.round(f12), Math.round(f11 + ((float) this.f44344f) + (((float) this.f44346h) * f10)), Math.round(f12 + ((float) this.f44345g) + (((float) this.f44347i) * f10)));
    }

    public boolean willChangeBounds() {
        return true;
    }
}

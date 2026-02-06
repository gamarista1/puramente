package r6;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import q6.C3951E;
import q6.F;
import q6.g;

/* renamed from: r6.c  reason: case insensitive filesystem */
public class C3978c extends g implements C3951E {

    /* renamed from: e  reason: collision with root package name */
    Drawable f47969e = null;

    /* renamed from: f  reason: collision with root package name */
    private F f47970f;

    public C3978c(Drawable drawable) {
        super(drawable);
    }

    public void draw(Canvas canvas) {
        if (isVisible()) {
            F f10 = this.f47970f;
            if (f10 != null) {
                f10.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f47969e;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f47969e.draw(canvas);
            }
        }
    }

    public void g(F f10) {
        this.f47970f = f10;
    }

    public int getIntrinsicHeight() {
        return -1;
    }

    public int getIntrinsicWidth() {
        return -1;
    }

    public boolean setVisible(boolean z10, boolean z11) {
        F f10 = this.f47970f;
        if (f10 != null) {
            f10.q(z10);
        }
        return super.setVisible(z10, z11);
    }

    public void x(Drawable drawable) {
        this.f47969e = drawable;
        invalidateSelf();
    }
}

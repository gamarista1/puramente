package q6;

import T5.k;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: q6.b  reason: case insensitive filesystem */
public class C3953b extends g implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private int f47619e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f47620f;

    /* renamed from: g  reason: collision with root package name */
    float f47621g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f47622h;

    public C3953b(Drawable drawable, int i10) {
        this(drawable, i10, true);
    }

    private int x() {
        return (int) ((20.0f / ((float) this.f47619e)) * 360.0f);
    }

    private void y() {
        if (!this.f47622h) {
            this.f47622h = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i10 = bounds.right;
        int i11 = bounds.left;
        int i12 = i10 - i11;
        int i13 = bounds.bottom;
        int i14 = bounds.top;
        int i15 = i13 - i14;
        float f10 = this.f47621g;
        if (!this.f47620f) {
            f10 = 360.0f - f10;
        }
        canvas.rotate(f10, (float) (i11 + (i12 / 2)), (float) (i14 + (i15 / 2)));
        super.draw(canvas);
        canvas.restoreToCount(save);
        y();
    }

    public void run() {
        this.f47622h = false;
        this.f47621g += (float) x();
        invalidateSelf();
    }

    public C3953b(Drawable drawable, int i10, boolean z10) {
        super((Drawable) k.g(drawable));
        this.f47621g = 0.0f;
        this.f47622h = false;
        this.f47619e = i10;
        this.f47620f = z10;
    }
}

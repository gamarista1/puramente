package q6;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import j7.b;

public class n extends m {
    public n(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    public void draw(Canvas canvas) {
        if (b.d()) {
            b.a("RoundedNinePatchDrawable#draw");
        }
        if (!f()) {
            super.draw(canvas);
            if (b.d()) {
                b.b();
                return;
            }
            return;
        }
        h();
        g();
        canvas.clipPath(this.f47704e);
        super.draw(canvas);
        if (b.d()) {
            b.b();
        }
    }
}

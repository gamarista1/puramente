package e5;

import V4.v;
import android.graphics.drawable.Drawable;

/* renamed from: e5.h  reason: case insensitive filesystem */
final class C3497h extends C3496g {
    private C3497h(Drawable drawable) {
        super(drawable);
    }

    static v c(Drawable drawable) {
        if (drawable != null) {
            return new C3497h(drawable);
        }
        return null;
    }

    public Class a() {
        return this.f43343a.getClass();
    }

    public int getSize() {
        return Math.max(1, this.f43343a.getIntrinsicWidth() * this.f43343a.getIntrinsicHeight() * 4);
    }

    public void recycle() {
    }
}

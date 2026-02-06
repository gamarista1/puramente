package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b  reason: case insensitive filesystem */
class C1563b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    final ActionBarContainer f11789a;

    /* renamed from: androidx.appcompat.widget.b$a */
    private static class a {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C1563b(ActionBarContainer actionBarContainer) {
        this.f11789a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f11789a;
        if (actionBarContainer.f11421h) {
            Drawable drawable = actionBarContainer.f11420g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f11418e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f11789a;
        Drawable drawable3 = actionBarContainer2.f11419f;
        if (drawable3 != null && actionBarContainer2.f11422i) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f11789a;
        if (!actionBarContainer.f11421h) {
            Drawable drawable = actionBarContainer.f11418e;
            if (drawable != null) {
                a.a(drawable, outline);
            }
        } else if (actionBarContainer.f11420g != null) {
            a.a(actionBarContainer.f11418e, outline);
        }
    }

    public void setAlpha(int i10) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}

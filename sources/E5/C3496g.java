package e5;

import V4.r;
import V4.v;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import g5.C3530c;
import o5.k;

/* renamed from: e5.g  reason: case insensitive filesystem */
public abstract class C3496g implements v, r {

    /* renamed from: a  reason: collision with root package name */
    protected final Drawable f43343a;

    public C3496g(Drawable drawable) {
        this.f43343a = (Drawable) k.d(drawable);
    }

    /* renamed from: b */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f43343a.getConstantState();
        if (constantState == null) {
            return this.f43343a;
        }
        return constantState.newDrawable();
    }

    public void initialize() {
        Drawable drawable = this.f43343a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof C3530c) {
            ((C3530c) drawable).e().prepareToDraw();
        }
    }
}

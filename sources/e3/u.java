package E3;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

class u implements v {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f1916a;

    u(ViewGroup viewGroup) {
        this.f1916a = viewGroup.getOverlay();
    }

    public void a(Drawable drawable) {
        this.f1916a.add(drawable);
    }

    public void b(Drawable drawable) {
        this.f1916a.remove(drawable);
    }

    public void c(View view) {
        this.f1916a.add(view);
    }

    public void d(View view) {
        this.f1916a.remove(view);
    }
}

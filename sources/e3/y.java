package E3;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

class y implements z {

    /* renamed from: a  reason: collision with root package name */
    private final ViewOverlay f1918a;

    y(View view) {
        this.f1918a = view.getOverlay();
    }

    public void a(Drawable drawable) {
        this.f1918a.add(drawable);
    }

    public void b(Drawable drawable) {
        this.f1918a.remove(drawable);
    }
}

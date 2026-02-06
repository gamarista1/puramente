package l5;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import m5.C3775b;

public abstract class f extends k implements C3775b.a {

    /* renamed from: h  reason: collision with root package name */
    private Animatable f46118h;

    public f(ImageView imageView) {
        super(imageView);
    }

    private void n(Object obj) {
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f46118h = animatable;
            animatable.start();
            return;
        }
        this.f46118h = null;
    }

    private void q(Object obj) {
        p(obj);
        n(obj);
    }

    public void c(Drawable drawable) {
        super.c(drawable);
        q((Object) null);
        o(drawable);
    }

    public void d(Drawable drawable) {
        super.d(drawable);
        Animatable animatable = this.f46118h;
        if (animatable != null) {
            animatable.stop();
        }
        q((Object) null);
        o(drawable);
    }

    public void g(Drawable drawable) {
        super.g(drawable);
        q((Object) null);
        o(drawable);
    }

    public void h(Object obj, C3775b bVar) {
        if (bVar == null || !bVar.a(obj, this)) {
            q(obj);
        } else {
            n(obj);
        }
    }

    public void o(Drawable drawable) {
        ((ImageView) this.f46123a).setImageDrawable(drawable);
    }

    public void onStart() {
        Animatable animatable = this.f46118h;
        if (animatable != null) {
            animatable.start();
        }
    }

    public void onStop() {
        Animatable animatable = this.f46118h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void p(Object obj);
}

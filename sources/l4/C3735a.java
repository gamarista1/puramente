package l4;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.DefaultLifecycleObserver;
import n4.C3857d;

/* renamed from: l4.a  reason: case insensitive filesystem */
public abstract class C3735a implements C3738d, C3857d, DefaultLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    private boolean f46101a;

    public abstract Drawable b();

    public abstract void c(Drawable drawable);

    /* access modifiers changed from: protected */
    public final void d() {
        Animatable animatable;
        Drawable b10 = b();
        if (b10 instanceof Animatable) {
            animatable = (Animatable) b10;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            if (this.f46101a) {
                animatable.start();
            } else {
                animatable.stop();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void e(Drawable drawable) {
        Animatable animatable;
        Drawable b10 = b();
        if (b10 instanceof Animatable) {
            animatable = (Animatable) b10;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        c(drawable);
        d();
    }

    public void onError(Drawable drawable) {
        e(drawable);
    }

    public void onStart(Drawable drawable) {
        e(drawable);
    }

    public void onStop(C1798v vVar) {
        this.f46101a = false;
        d();
    }

    public void onSuccess(Drawable drawable) {
        e(drawable);
    }

    public void onStart(C1798v vVar) {
        this.f46101a = true;
        d();
    }
}

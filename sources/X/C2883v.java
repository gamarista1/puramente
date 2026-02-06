package x;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: x.v  reason: case insensitive filesystem */
public final class C2883v {

    /* renamed from: a  reason: collision with root package name */
    public static final C2883v f27978a = new C2883v();

    private C2883v() {
    }

    public final EdgeEffect a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2864c.f27931a.a(context, (AttributeSet) null);
        }
        return new C2841E(context);
    }

    public final float b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2864c.f27931a.b(edgeEffect);
        }
        return 0.0f;
    }

    public final void c(EdgeEffect edgeEffect, int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i10);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i10);
        }
    }

    public final float d(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2864c.f27931a.c(edgeEffect, f10, f11);
        }
        edgeEffect.onPull(f10, f11);
        return f10;
    }

    public final void e(EdgeEffect edgeEffect, float f10) {
        if (edgeEffect instanceof C2841E) {
            ((C2841E) edgeEffect).a(f10);
        } else {
            edgeEffect.onRelease();
        }
    }
}

package x;

import android.content.Context;
import android.widget.EdgeEffect;
import c1.C1892a;
import c1.h;

/* renamed from: x.E  reason: case insensitive filesystem */
final class C2841E extends EdgeEffect {

    /* renamed from: a  reason: collision with root package name */
    private final float f27830a;

    /* renamed from: b  reason: collision with root package name */
    private float f27831b;

    public C2841E(Context context) {
        super(context);
        this.f27830a = C1892a.a(context).t1(h.j((float) 1));
    }

    public final void a(float f10) {
        float f11 = this.f27831b + f10;
        this.f27831b = f11;
        if (Math.abs(f11) > this.f27830a) {
            onRelease();
        }
    }

    public void onAbsorb(int i10) {
        this.f27831b = 0.0f;
        super.onAbsorb(i10);
    }

    public void onPull(float f10, float f11) {
        this.f27831b = 0.0f;
        super.onPull(f10, f11);
    }

    public void onRelease() {
        this.f27831b = 0.0f;
        super.onRelease();
    }

    public void onPull(float f10) {
        this.f27831b = 0.0f;
        super.onPull(f10);
    }
}

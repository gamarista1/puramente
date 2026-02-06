package r0;

import android.graphics.Bitmap;

/* renamed from: r0.N  reason: case insensitive filesystem */
public final class C2460N implements H1 {

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap f25446b;

    public C2460N(Bitmap bitmap) {
        this.f25446b = bitmap;
    }

    public void a() {
        this.f25446b.prepareToDraw();
    }

    public int b() {
        return C2465Q.e(this.f25446b.getConfig());
    }

    public final Bitmap c() {
        return this.f25446b;
    }

    public int d() {
        return this.f25446b.getHeight();
    }

    public int e() {
        return this.f25446b.getWidth();
    }
}

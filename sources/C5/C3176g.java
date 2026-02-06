package c5;

import V4.r;
import V4.v;
import W4.d;
import android.graphics.Bitmap;
import o5.k;
import o5.l;

/* renamed from: c5.g  reason: case insensitive filesystem */
public class C3176g implements v, r {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f36459a;

    /* renamed from: b  reason: collision with root package name */
    private final d f36460b;

    public C3176g(Bitmap bitmap, d dVar) {
        this.f36459a = (Bitmap) k.e(bitmap, "Bitmap must not be null");
        this.f36460b = (d) k.e(dVar, "BitmapPool must not be null");
    }

    public static C3176g c(Bitmap bitmap, d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new C3176g(bitmap, dVar);
    }

    public Class a() {
        return Bitmap.class;
    }

    /* renamed from: b */
    public Bitmap get() {
        return this.f36459a;
    }

    public int getSize() {
        return l.i(this.f36459a);
    }

    public void initialize() {
        this.f36459a.prepareToDraw();
    }

    public void recycle() {
        this.f36460b.c(this.f36459a);
    }
}

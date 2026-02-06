package c5;

import V4.r;
import V4.v;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import o5.k;

/* renamed from: c5.A  reason: case insensitive filesystem */
public final class C3169A implements v, r {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f36419a;

    /* renamed from: b  reason: collision with root package name */
    private final v f36420b;

    private C3169A(Resources resources, v vVar) {
        this.f36419a = (Resources) k.d(resources);
        this.f36420b = (v) k.d(vVar);
    }

    public static v c(Resources resources, v vVar) {
        if (vVar == null) {
            return null;
        }
        return new C3169A(resources, vVar);
    }

    public Class a() {
        return BitmapDrawable.class;
    }

    /* renamed from: b */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f36419a, (Bitmap) this.f36420b.get());
    }

    public int getSize() {
        return this.f36420b.getSize();
    }

    public void initialize() {
        v vVar = this.f36420b;
        if (vVar instanceof r) {
            ((r) vVar).initialize();
        }
    }

    public void recycle() {
        this.f36420b.recycle();
    }
}

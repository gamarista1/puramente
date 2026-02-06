package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class f0 extends X {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f11897b;

    public f0(Context context, Resources resources) {
        super(resources);
        this.f11897b = new WeakReference(context);
    }

    public Drawable getDrawable(int i10) {
        Drawable a10 = a(i10);
        Context context = (Context) this.f11897b.get();
        if (!(a10 == null || context == null)) {
            W.g().w(context, i10, a10);
        }
        return a10;
    }
}

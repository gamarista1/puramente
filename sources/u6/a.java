package U6;

import X6.C3078a;
import android.graphics.Bitmap;
import f7.i;
import kotlin.jvm.internal.C6496s;
import m7.C3783c;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final i f34410a;

    /* renamed from: b  reason: collision with root package name */
    private final C3078a f34411b;

    public a(i iVar, C3078a aVar) {
        C6496s.h(iVar, "bitmapPool");
        C6496s.h(aVar, "closeableReferenceFactory");
        this.f34410a = iVar;
        this.f34411b = aVar;
    }

    public X5.a d(int i10, int i11, Bitmap.Config config) {
        C6496s.h(config, "bitmapConfig");
        Bitmap bitmap = (Bitmap) this.f34410a.get(C3783c.i(i10, i11, config));
        if (bitmap.getAllocationByteCount() >= i10 * i11 * C3783c.h(config)) {
            bitmap.reconfigure(i10, i11, config);
            X5.a c10 = this.f34411b.c(bitmap, this.f34410a);
            C6496s.g(c10, "create(...)");
            return c10;
        }
        throw new IllegalStateException("Check failed.");
    }
}

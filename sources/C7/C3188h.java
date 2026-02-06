package c7;

import X5.a;
import X5.h;
import android.graphics.Bitmap;

/* renamed from: c7.h  reason: case insensitive filesystem */
class C3188h extends C3182b {
    protected C3188h(a aVar, n nVar, int i10, int i11) {
        super(aVar, nVar, i10, i11);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (!isClosed()) {
            U5.a.K("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    protected C3188h(Bitmap bitmap, h hVar, n nVar, int i10, int i11) {
        super(bitmap, hVar, nVar, i10, i11);
    }
}

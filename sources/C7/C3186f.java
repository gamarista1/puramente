package c7;

import X5.a;
import X5.h;
import android.graphics.Bitmap;

/* renamed from: c7.f  reason: case insensitive filesystem */
public interface C3186f extends C3184d {
    static C3186f V0(Bitmap bitmap, h hVar, n nVar, int i10, int i11) {
        if (C3182b.g0()) {
            return new C3182b(bitmap, hVar, nVar, i10, i11);
        }
        return new C3188h(bitmap, hVar, nVar, i10, i11);
    }

    static C3186f k1(Bitmap bitmap, h hVar, n nVar, int i10) {
        return V0(bitmap, hVar, nVar, i10, 0);
    }

    static C3186f l1(a aVar, n nVar, int i10, int i11) {
        if (C3182b.g0()) {
            return new C3182b(aVar, nVar, i10, i11);
        }
        return new C3188h(aVar, nVar, i10, i11);
    }

    static C3186f q0(a aVar, n nVar, int i10) {
        return l1(aVar, nVar, i10, 0);
    }

    a B();

    int M0();

    int y0();
}

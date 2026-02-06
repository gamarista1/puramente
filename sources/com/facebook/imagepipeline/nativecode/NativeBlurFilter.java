package com.facebook.imagepipeline.nativecode;

import T5.d;
import T5.k;
import android.graphics.Bitmap;

@d
public class NativeBlurFilter {
    static {
        b.a();
    }

    public static void a(Bitmap bitmap, int i10, int i11) {
        boolean z10;
        k.g(bitmap);
        boolean z11 = false;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        if (i11 > 0) {
            z11 = true;
        }
        k.b(Boolean.valueOf(z11));
        nativeIterativeBoxBlur(bitmap, i10, i11);
    }

    @d
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i10, int i11);
}

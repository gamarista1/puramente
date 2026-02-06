package com.facebook.imagepipeline.nativecode;

import T5.d;
import T5.k;
import android.graphics.Bitmap;

@d
public class NativeRoundingFilter {
    static {
        b.a();
    }

    @d
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i10, int i11, int i12, int i13);

    @d
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z10);

    @d
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z10);

    @d
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i10, int i11, boolean z10);

    @d
    public static void toCircle(Bitmap bitmap, boolean z10) {
        k.g(bitmap);
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFilter(bitmap, z10);
        }
    }

    @d
    public static void toCircleFast(Bitmap bitmap, boolean z10) {
        k.g(bitmap);
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFastFilter(bitmap, z10);
        }
    }
}

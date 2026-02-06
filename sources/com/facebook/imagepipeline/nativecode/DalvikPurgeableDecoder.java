package com.facebook.imagepipeline.nativecode;

import T5.d;
import T5.k;
import T5.p;
import W6.i;
import X5.a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import c7.C3189i;
import com.facebook.soloader.C3456g;
import f7.g;
import f7.h;
import java.util.Locale;
import m7.C3783c;

@d
public abstract class DalvikPurgeableDecoder implements g7.d {

    /* renamed from: b  reason: collision with root package name */
    protected static final byte[] f39764b = {-1, -39};

    /* renamed from: a  reason: collision with root package name */
    private final g f39765a = h.a();

    @C3456g
    private static class OreoUtils {
        private OreoUtils() {
        }

        static void a(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        a.a();
    }

    protected DalvikPurgeableDecoder() {
    }

    public static boolean e(a aVar, int i10) {
        W5.h hVar = (W5.h) aVar.I();
        if (i10 >= 2 && hVar.r(i10 - 2) == -1 && hVar.r(i10 - 1) == -39) {
            return true;
        }
        return false;
    }

    public static BitmapFactory.Options f(int i10, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i10;
        options.inMutable = true;
        return options;
    }

    @d
    private static native void nativePinBitmap(Bitmap bitmap);

    public a a(C3189i iVar, Bitmap.Config config, Rect rect, int i10, ColorSpace colorSpace) {
        BitmapFactory.Options f10 = f(iVar.I(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(f10, colorSpace);
        }
        a o10 = iVar.o();
        k.g(o10);
        try {
            return g(d(o10, i10, f10));
        } finally {
            a.E(o10);
        }
    }

    public a b(C3189i iVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options f10 = f(iVar.I(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(f10, colorSpace);
        }
        a o10 = iVar.o();
        k.g(o10);
        try {
            return g(c(o10, f10));
        } finally {
            a.E(o10);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Bitmap c(a aVar, BitmapFactory.Options options);

    /* access modifiers changed from: protected */
    public abstract Bitmap d(a aVar, int i10, BitmapFactory.Options options);

    public a g(Bitmap bitmap) {
        k.g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f39765a.g(bitmap)) {
                return a.g0(bitmap, this.f39765a.e());
            }
            int j10 = C3783c.j(bitmap);
            bitmap.recycle();
            throw new i(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", new Object[]{Integer.valueOf(j10), Integer.valueOf(this.f39765a.b()), Long.valueOf(this.f39765a.f()), Integer.valueOf(this.f39765a.c()), Integer.valueOf(this.f39765a.d())}));
        } catch (Exception e10) {
            bitmap.recycle();
            throw p.a(e10);
        }
    }
}

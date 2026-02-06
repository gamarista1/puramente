package com.bumptech.glide.request;

import T4.b;
import T4.f;
import T4.m;
import V4.j;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import c5.o;

public class h extends a {
    private static h centerCropOptions;
    private static h centerInsideOptions;
    private static h circleCropOptions;
    private static h fitCenterOptions;
    private static h noAnimationOptions;
    private static h noTransformOptions;
    private static h skipMemoryCacheFalseOptions;
    private static h skipMemoryCacheTrueOptions;

    public static h bitmapTransform(m mVar) {
        return (h) new h().transform(mVar);
    }

    public static h centerCropTransform() {
        if (centerCropOptions == null) {
            centerCropOptions = (h) ((h) new h().centerCrop()).autoClone();
        }
        return centerCropOptions;
    }

    public static h centerInsideTransform() {
        if (centerInsideOptions == null) {
            centerInsideOptions = (h) ((h) new h().centerInside()).autoClone();
        }
        return centerInsideOptions;
    }

    public static h circleCropTransform() {
        if (circleCropOptions == null) {
            circleCropOptions = (h) ((h) new h().circleCrop()).autoClone();
        }
        return circleCropOptions;
    }

    public static h decodeTypeOf(Class<?> cls) {
        return (h) new h().decode(cls);
    }

    public static h diskCacheStrategyOf(j jVar) {
        return (h) new h().diskCacheStrategy(jVar);
    }

    public static h downsampleOf(o oVar) {
        return (h) new h().downsample(oVar);
    }

    public static h encodeFormatOf(Bitmap.CompressFormat compressFormat) {
        return (h) new h().encodeFormat(compressFormat);
    }

    public static h encodeQualityOf(int i10) {
        return (h) new h().encodeQuality(i10);
    }

    public static h errorOf(Drawable drawable) {
        return (h) new h().error(drawable);
    }

    public static h fitCenterTransform() {
        if (fitCenterOptions == null) {
            fitCenterOptions = (h) ((h) new h().fitCenter()).autoClone();
        }
        return fitCenterOptions;
    }

    public static h formatOf(b bVar) {
        return (h) new h().format(bVar);
    }

    public static h frameOf(long j10) {
        return (h) new h().frame(j10);
    }

    public static h noAnimation() {
        if (noAnimationOptions == null) {
            noAnimationOptions = (h) ((h) new h().dontAnimate()).autoClone();
        }
        return noAnimationOptions;
    }

    public static h noTransformation() {
        if (noTransformOptions == null) {
            noTransformOptions = (h) ((h) new h().dontTransform()).autoClone();
        }
        return noTransformOptions;
    }

    public static <T> h option(T4.h hVar, T t10) {
        return (h) new h().set(hVar, t10);
    }

    public static h overrideOf(int i10, int i11) {
        return (h) new h().override(i10, i11);
    }

    public static h placeholderOf(Drawable drawable) {
        return (h) new h().placeholder(drawable);
    }

    public static h priorityOf(com.bumptech.glide.h hVar) {
        return (h) new h().priority(hVar);
    }

    public static h signatureOf(f fVar) {
        return (h) new h().signature(fVar);
    }

    public static h sizeMultiplierOf(float f10) {
        return (h) new h().sizeMultiplier(f10);
    }

    public static h skipMemoryCacheOf(boolean z10) {
        if (z10) {
            if (skipMemoryCacheTrueOptions == null) {
                skipMemoryCacheTrueOptions = (h) ((h) new h().skipMemoryCache(true)).autoClone();
            }
            return skipMemoryCacheTrueOptions;
        }
        if (skipMemoryCacheFalseOptions == null) {
            skipMemoryCacheFalseOptions = (h) ((h) new h().skipMemoryCache(false)).autoClone();
        }
        return skipMemoryCacheFalseOptions;
    }

    public static h timeoutOf(int i10) {
        return (h) new h().timeout(i10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h) || !super.equals(obj)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public static h errorOf(int i10) {
        return (h) new h().error(i10);
    }

    public static h overrideOf(int i10) {
        return overrideOf(i10, i10);
    }

    public static h placeholderOf(int i10) {
        return (h) new h().placeholder(i10);
    }
}

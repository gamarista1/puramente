package com.dylanvann.fastimage;

import T4.b;
import T4.f;
import T4.m;
import V4.j;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import c5.o;
import com.bumptech.glide.request.a;
import com.bumptech.glide.request.h;

public final class GlideOptions extends h implements Cloneable {
    private static GlideOptions centerCropTransform2;
    private static GlideOptions centerInsideTransform1;
    private static GlideOptions circleCropTransform3;
    private static GlideOptions fitCenterTransform0;
    private static GlideOptions noAnimation5;
    private static GlideOptions noTransformation4;

    public static GlideOptions bitmapTransform(m mVar) {
        return new GlideOptions().transform(mVar);
    }

    public static GlideOptions centerCropTransform() {
        if (centerCropTransform2 == null) {
            centerCropTransform2 = new GlideOptions().centerCrop().autoClone();
        }
        return centerCropTransform2;
    }

    public static GlideOptions centerInsideTransform() {
        if (centerInsideTransform1 == null) {
            centerInsideTransform1 = new GlideOptions().centerInside().autoClone();
        }
        return centerInsideTransform1;
    }

    public static GlideOptions circleCropTransform() {
        if (circleCropTransform3 == null) {
            circleCropTransform3 = new GlideOptions().circleCrop().autoClone();
        }
        return circleCropTransform3;
    }

    public static GlideOptions decodeTypeOf(Class<?> cls) {
        return new GlideOptions().decode((Class) cls);
    }

    public static GlideOptions diskCacheStrategyOf(j jVar) {
        return new GlideOptions().diskCacheStrategy(jVar);
    }

    public static GlideOptions downsampleOf(o oVar) {
        return new GlideOptions().downsample(oVar);
    }

    public static GlideOptions encodeFormatOf(Bitmap.CompressFormat compressFormat) {
        return new GlideOptions().encodeFormat(compressFormat);
    }

    public static GlideOptions encodeQualityOf(int i10) {
        return new GlideOptions().encodeQuality(i10);
    }

    public static GlideOptions errorOf(Drawable drawable) {
        return new GlideOptions().error(drawable);
    }

    public static GlideOptions fitCenterTransform() {
        if (fitCenterTransform0 == null) {
            fitCenterTransform0 = new GlideOptions().fitCenter().autoClone();
        }
        return fitCenterTransform0;
    }

    public static GlideOptions formatOf(b bVar) {
        return new GlideOptions().format(bVar);
    }

    public static GlideOptions frameOf(long j10) {
        return new GlideOptions().frame(j10);
    }

    public static GlideOptions noAnimation() {
        if (noAnimation5 == null) {
            noAnimation5 = new GlideOptions().dontAnimate().autoClone();
        }
        return noAnimation5;
    }

    public static GlideOptions noTransformation() {
        if (noTransformation4 == null) {
            noTransformation4 = new GlideOptions().dontTransform().autoClone();
        }
        return noTransformation4;
    }

    public static <T> GlideOptions option(T4.h hVar, T t10) {
        return new GlideOptions().set(hVar, (Object) t10);
    }

    public static GlideOptions overrideOf(int i10, int i11) {
        return new GlideOptions().override(i10, i11);
    }

    public static GlideOptions placeholderOf(Drawable drawable) {
        return new GlideOptions().placeholder(drawable);
    }

    public static GlideOptions priorityOf(com.bumptech.glide.h hVar) {
        return new GlideOptions().priority(hVar);
    }

    public static GlideOptions signatureOf(f fVar) {
        return new GlideOptions().signature(fVar);
    }

    public static GlideOptions sizeMultiplierOf(float f10) {
        return new GlideOptions().sizeMultiplier(f10);
    }

    public static GlideOptions skipMemoryCacheOf(boolean z10) {
        return new GlideOptions().skipMemoryCache(z10);
    }

    public static GlideOptions timeoutOf(int i10) {
        return new GlideOptions().timeout(i10);
    }

    public static GlideOptions errorOf(int i10) {
        return new GlideOptions().error(i10);
    }

    public static GlideOptions overrideOf(int i10) {
        return new GlideOptions().override(i10);
    }

    public static GlideOptions placeholderOf(int i10) {
        return new GlideOptions().placeholder(i10);
    }

    public GlideOptions apply(a aVar) {
        return (GlideOptions) super.apply(aVar);
    }

    public GlideOptions autoClone() {
        return (GlideOptions) super.autoClone();
    }

    public GlideOptions centerCrop() {
        return (GlideOptions) super.centerCrop();
    }

    public GlideOptions centerInside() {
        return (GlideOptions) super.centerInside();
    }

    public GlideOptions circleCrop() {
        return (GlideOptions) super.circleCrop();
    }

    public GlideOptions decode(Class<?> cls) {
        return (GlideOptions) super.decode(cls);
    }

    public GlideOptions disallowHardwareConfig() {
        return (GlideOptions) super.disallowHardwareConfig();
    }

    public GlideOptions diskCacheStrategy(j jVar) {
        return (GlideOptions) super.diskCacheStrategy(jVar);
    }

    public GlideOptions dontAnimate() {
        return (GlideOptions) super.dontAnimate();
    }

    public GlideOptions dontTransform() {
        return (GlideOptions) super.dontTransform();
    }

    public GlideOptions downsample(o oVar) {
        return (GlideOptions) super.downsample(oVar);
    }

    public GlideOptions encodeFormat(Bitmap.CompressFormat compressFormat) {
        return (GlideOptions) super.encodeFormat(compressFormat);
    }

    public GlideOptions encodeQuality(int i10) {
        return (GlideOptions) super.encodeQuality(i10);
    }

    public GlideOptions fitCenter() {
        return (GlideOptions) super.fitCenter();
    }

    public GlideOptions format(b bVar) {
        return (GlideOptions) super.format(bVar);
    }

    public GlideOptions frame(long j10) {
        return (GlideOptions) super.frame(j10);
    }

    public GlideOptions lock() {
        return (GlideOptions) super.lock();
    }

    public GlideOptions onlyRetrieveFromCache(boolean z10) {
        return (GlideOptions) super.onlyRetrieveFromCache(z10);
    }

    public GlideOptions optionalCenterCrop() {
        return (GlideOptions) super.optionalCenterCrop();
    }

    public GlideOptions optionalCenterInside() {
        return (GlideOptions) super.optionalCenterInside();
    }

    public GlideOptions optionalCircleCrop() {
        return (GlideOptions) super.optionalCircleCrop();
    }

    public GlideOptions optionalFitCenter() {
        return (GlideOptions) super.optionalFitCenter();
    }

    public GlideOptions priority(com.bumptech.glide.h hVar) {
        return (GlideOptions) super.priority(hVar);
    }

    public <Y> GlideOptions set(T4.h hVar, Y y10) {
        return (GlideOptions) super.set(hVar, y10);
    }

    public GlideOptions signature(f fVar) {
        return (GlideOptions) super.signature(fVar);
    }

    public GlideOptions sizeMultiplier(float f10) {
        return (GlideOptions) super.sizeMultiplier(f10);
    }

    public GlideOptions skipMemoryCache(boolean z10) {
        return (GlideOptions) super.skipMemoryCache(z10);
    }

    public GlideOptions theme(Resources.Theme theme) {
        return (GlideOptions) super.theme(theme);
    }

    public GlideOptions timeout(int i10) {
        return (GlideOptions) super.timeout(i10);
    }

    @Deprecated
    @SafeVarargs
    public final GlideOptions transforms(m... mVarArr) {
        return (GlideOptions) super.transforms(mVarArr);
    }

    public GlideOptions useAnimationPool(boolean z10) {
        return (GlideOptions) super.useAnimationPool(z10);
    }

    public GlideOptions useUnlimitedSourceGeneratorsPool(boolean z10) {
        return (GlideOptions) super.useUnlimitedSourceGeneratorsPool(z10);
    }

    public GlideOptions clone() {
        return (GlideOptions) super.clone();
    }

    public GlideOptions error(Drawable drawable) {
        return (GlideOptions) super.error(drawable);
    }

    public GlideOptions fallback(Drawable drawable) {
        return (GlideOptions) super.fallback(drawable);
    }

    public GlideOptions optionalTransform(m mVar) {
        return (GlideOptions) super.optionalTransform(mVar);
    }

    public GlideOptions override(int i10, int i11) {
        return (GlideOptions) super.override(i10, i11);
    }

    public GlideOptions placeholder(Drawable drawable) {
        return (GlideOptions) super.placeholder(drawable);
    }

    public GlideOptions error(int i10) {
        return (GlideOptions) super.error(i10);
    }

    public GlideOptions fallback(int i10) {
        return (GlideOptions) super.fallback(i10);
    }

    public <Y> GlideOptions optionalTransform(Class<Y> cls, m mVar) {
        return (GlideOptions) super.optionalTransform((Class) cls, mVar);
    }

    public GlideOptions override(int i10) {
        return (GlideOptions) super.override(i10);
    }

    public GlideOptions placeholder(int i10) {
        return (GlideOptions) super.placeholder(i10);
    }

    public GlideOptions transform(m mVar) {
        return (GlideOptions) super.transform(mVar);
    }

    @SafeVarargs
    public final GlideOptions transform(m... mVarArr) {
        return (GlideOptions) super.transform(mVarArr);
    }

    public <Y> GlideOptions transform(Class<Y> cls, m mVar) {
        return (GlideOptions) super.transform((Class) cls, mVar);
    }
}

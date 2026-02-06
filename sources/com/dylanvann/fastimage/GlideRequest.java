package com.dylanvann.fastimage;

import T4.b;
import T4.f;
import V4.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import c5.o;
import com.bumptech.glide.c;
import com.bumptech.glide.h;
import com.bumptech.glide.l;
import com.bumptech.glide.m;
import com.bumptech.glide.n;
import com.bumptech.glide.request.a;
import com.bumptech.glide.request.g;
import java.io.File;
import java.net.URL;
import java.util.List;

public class GlideRequest<TranscodeType> extends l implements Cloneable {
    GlideRequest(Class<TranscodeType> cls, l lVar) {
        super(cls, lVar);
    }

    GlideRequest(c cVar, m mVar, Class<TranscodeType> cls, Context context) {
        super(cVar, mVar, cls, context);
    }

    public GlideRequest<TranscodeType> addListener(g gVar) {
        return (GlideRequest) super.addListener(gVar);
    }

    public GlideRequest<TranscodeType> autoClone() {
        return (GlideRequest) super.autoClone();
    }

    public GlideRequest<TranscodeType> centerCrop() {
        return (GlideRequest) super.centerCrop();
    }

    public GlideRequest<TranscodeType> centerInside() {
        return (GlideRequest) super.centerInside();
    }

    public GlideRequest<TranscodeType> circleCrop() {
        return (GlideRequest) super.circleCrop();
    }

    public GlideRequest<TranscodeType> decode(Class<?> cls) {
        return (GlideRequest) super.decode(cls);
    }

    public GlideRequest<TranscodeType> disallowHardwareConfig() {
        return (GlideRequest) super.disallowHardwareConfig();
    }

    public GlideRequest<TranscodeType> diskCacheStrategy(j jVar) {
        return (GlideRequest) super.diskCacheStrategy(jVar);
    }

    public GlideRequest<TranscodeType> dontAnimate() {
        return (GlideRequest) super.dontAnimate();
    }

    public GlideRequest<TranscodeType> dontTransform() {
        return (GlideRequest) super.dontTransform();
    }

    public GlideRequest<TranscodeType> downsample(o oVar) {
        return (GlideRequest) super.downsample(oVar);
    }

    public GlideRequest<TranscodeType> encodeFormat(Bitmap.CompressFormat compressFormat) {
        return (GlideRequest) super.encodeFormat(compressFormat);
    }

    public GlideRequest<TranscodeType> encodeQuality(int i10) {
        return (GlideRequest) super.encodeQuality(i10);
    }

    public GlideRequest<TranscodeType> fitCenter() {
        return (GlideRequest) super.fitCenter();
    }

    public GlideRequest<TranscodeType> format(b bVar) {
        return (GlideRequest) super.format(bVar);
    }

    public GlideRequest<TranscodeType> frame(long j10) {
        return (GlideRequest) super.frame(j10);
    }

    /* access modifiers changed from: protected */
    public GlideRequest<File> getDownloadOnlyRequest() {
        return new GlideRequest(File.class, this).apply((a) l.DOWNLOAD_ONLY_OPTIONS);
    }

    public GlideRequest<TranscodeType> listener(g gVar) {
        return (GlideRequest) super.listener(gVar);
    }

    public GlideRequest<TranscodeType> lock() {
        return (GlideRequest) super.lock();
    }

    public GlideRequest<TranscodeType> onlyRetrieveFromCache(boolean z10) {
        return (GlideRequest) super.onlyRetrieveFromCache(z10);
    }

    public GlideRequest<TranscodeType> optionalCenterCrop() {
        return (GlideRequest) super.optionalCenterCrop();
    }

    public GlideRequest<TranscodeType> optionalCenterInside() {
        return (GlideRequest) super.optionalCenterInside();
    }

    public GlideRequest<TranscodeType> optionalCircleCrop() {
        return (GlideRequest) super.optionalCircleCrop();
    }

    public GlideRequest<TranscodeType> optionalFitCenter() {
        return (GlideRequest) super.optionalFitCenter();
    }

    public GlideRequest<TranscodeType> priority(h hVar) {
        return (GlideRequest) super.priority(hVar);
    }

    public <Y> GlideRequest<TranscodeType> set(T4.h hVar, Y y10) {
        return (GlideRequest) super.set(hVar, y10);
    }

    public GlideRequest<TranscodeType> signature(f fVar) {
        return (GlideRequest) super.signature(fVar);
    }

    public GlideRequest<TranscodeType> sizeMultiplier(float f10) {
        return (GlideRequest) super.sizeMultiplier(f10);
    }

    public GlideRequest<TranscodeType> skipMemoryCache(boolean z10) {
        return (GlideRequest) super.skipMemoryCache(z10);
    }

    public GlideRequest<TranscodeType> theme(Resources.Theme theme) {
        return (GlideRequest) super.theme(theme);
    }

    public GlideRequest<TranscodeType> timeout(int i10) {
        return (GlideRequest) super.timeout(i10);
    }

    @Deprecated
    public GlideRequest<TranscodeType> transforms(T4.m... mVarArr) {
        return (GlideRequest) super.transforms(mVarArr);
    }

    public GlideRequest<TranscodeType> transition(n nVar) {
        return (GlideRequest) super.transition(nVar);
    }

    public GlideRequest<TranscodeType> useAnimationPool(boolean z10) {
        return (GlideRequest) super.useAnimationPool(z10);
    }

    public GlideRequest<TranscodeType> useUnlimitedSourceGeneratorsPool(boolean z10) {
        return (GlideRequest) super.useUnlimitedSourceGeneratorsPool(z10);
    }

    public GlideRequest<TranscodeType> apply(a aVar) {
        return (GlideRequest) super.apply(aVar);
    }

    public GlideRequest<TranscodeType> fallback(Drawable drawable) {
        return (GlideRequest) super.fallback(drawable);
    }

    public GlideRequest<TranscodeType> optionalTransform(T4.m mVar) {
        return (GlideRequest) super.optionalTransform(mVar);
    }

    public GlideRequest<TranscodeType> override(int i10, int i11) {
        return (GlideRequest) super.override(i10, i11);
    }

    public GlideRequest<TranscodeType> placeholder(Drawable drawable) {
        return (GlideRequest) super.placeholder(drawable);
    }

    public GlideRequest<TranscodeType> clone() {
        return (GlideRequest) super.clone();
    }

    public GlideRequest<TranscodeType> fallback(int i10) {
        return (GlideRequest) super.fallback(i10);
    }

    public <Y> GlideRequest<TranscodeType> optionalTransform(Class<Y> cls, T4.m mVar) {
        return (GlideRequest) super.optionalTransform((Class) cls, mVar);
    }

    public GlideRequest<TranscodeType> override(int i10) {
        return (GlideRequest) super.override(i10);
    }

    public GlideRequest<TranscodeType> placeholder(int i10) {
        return (GlideRequest) super.placeholder(i10);
    }

    public GlideRequest<TranscodeType> transform(T4.m mVar) {
        return (GlideRequest) super.transform(mVar);
    }

    public GlideRequest<TranscodeType> error(Drawable drawable) {
        return (GlideRequest) super.error(drawable);
    }

    public GlideRequest<TranscodeType> thumbnail(l lVar) {
        return (GlideRequest) super.thumbnail(lVar);
    }

    public GlideRequest<TranscodeType> transform(T4.m... mVarArr) {
        return (GlideRequest) super.transform(mVarArr);
    }

    public GlideRequest<TranscodeType> error(int i10) {
        return (GlideRequest) super.error(i10);
    }

    @SafeVarargs
    public final GlideRequest<TranscodeType> thumbnail(l... lVarArr) {
        return (GlideRequest) super.thumbnail(lVarArr);
    }

    public <Y> GlideRequest<TranscodeType> transform(Class<Y> cls, T4.m mVar) {
        return (GlideRequest) super.transform((Class) cls, mVar);
    }

    public GlideRequest<TranscodeType> error(l lVar) {
        return (GlideRequest) super.error(lVar);
    }

    public GlideRequest<TranscodeType> thumbnail(List<l> list) {
        return (GlideRequest) super.thumbnail((List) list);
    }

    public GlideRequest<TranscodeType> error(Object obj) {
        return (GlideRequest) super.error(obj);
    }

    @Deprecated
    public GlideRequest<TranscodeType> thumbnail(float f10) {
        return (GlideRequest) super.thumbnail(f10);
    }

    public GlideRequest<TranscodeType> load(Object obj) {
        return (GlideRequest) super.load(obj);
    }

    public GlideRequest<TranscodeType> load(Bitmap bitmap) {
        return (GlideRequest) super.load(bitmap);
    }

    public GlideRequest<TranscodeType> load(Drawable drawable) {
        return (GlideRequest) super.load(drawable);
    }

    public GlideRequest<TranscodeType> load(String str) {
        return (GlideRequest) super.load(str);
    }

    public GlideRequest<TranscodeType> load(Uri uri) {
        return (GlideRequest) super.load(uri);
    }

    public GlideRequest<TranscodeType> load(File file) {
        return (GlideRequest) super.load(file);
    }

    public GlideRequest<TranscodeType> load(Integer num) {
        return (GlideRequest) super.load(num);
    }

    @Deprecated
    public GlideRequest<TranscodeType> load(URL url) {
        return (GlideRequest) super.load(url);
    }

    public GlideRequest<TranscodeType> load(byte[] bArr) {
        return (GlideRequest) super.load(bArr);
    }
}

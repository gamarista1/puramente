package com.bumptech.glide.request;

import T4.f;
import T4.g;
import T4.i;
import T4.m;
import V4.j;
import a5.C3132a;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c5.C3172c;
import c5.H;
import c5.k;
import c5.l;
import c5.o;
import c5.s;
import c5.u;
import c5.w;
import com.bumptech.glide.h;
import g5.C3530c;
import g5.C3533f;
import g5.C3536i;
import java.util.Map;
import n5.C3860c;
import o5.b;

public abstract class a implements Cloneable {
    private static final int DISK_CACHE_STRATEGY = 4;
    private static final int ERROR_ID = 32;
    private static final int ERROR_PLACEHOLDER = 16;
    private static final int FALLBACK = 8192;
    private static final int FALLBACK_ID = 16384;
    private static final int IS_CACHEABLE = 256;
    private static final int ONLY_RETRIEVE_FROM_CACHE = 524288;
    private static final int OVERRIDE = 512;
    private static final int PLACEHOLDER = 64;
    private static final int PLACEHOLDER_ID = 128;
    private static final int PRIORITY = 8;
    private static final int RESOURCE_CLASS = 4096;
    private static final int SIGNATURE = 1024;
    private static final int SIZE_MULTIPLIER = 2;
    private static final int THEME = 32768;
    private static final int TRANSFORMATION = 2048;
    private static final int TRANSFORMATION_ALLOWED = 65536;
    private static final int TRANSFORMATION_REQUIRED = 131072;
    private static final int UNSET = -1;
    private static final int USE_ANIMATION_POOL = 1048576;
    private static final int USE_UNLIMITED_SOURCE_GENERATORS_POOL = 262144;
    private j diskCacheStrategy = j.f34542e;
    private int errorId;
    private Drawable errorPlaceholder;
    private Drawable fallbackDrawable;
    private int fallbackId;
    private int fields;
    private boolean isAutoCloneEnabled;
    private boolean isCacheable = true;
    private boolean isLocked;
    private boolean isScaleOnlyOrNoTransform = true;
    private boolean isTransformationAllowed = true;
    private boolean isTransformationRequired;
    private boolean onlyRetrieveFromCache;
    private i options = new i();
    private int overrideHeight = -1;
    private int overrideWidth = -1;
    private Drawable placeholderDrawable;
    private int placeholderId;
    private h priority = h.NORMAL;
    private Class<?> resourceClass = Object.class;
    private f signature = C3860c.c();
    private float sizeMultiplier = 1.0f;
    private Resources.Theme theme;
    private Map<Class<?>, m> transformations = new b();
    private boolean useAnimationPool;
    private boolean useUnlimitedSourceGeneratorsPool;

    private boolean a(int i10) {
        return c(this.fields, i10);
    }

    private static boolean c(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    private a d(o oVar, m mVar) {
        return g(oVar, mVar, false);
    }

    private a e(o oVar, m mVar) {
        return g(oVar, mVar, true);
    }

    private a g(o oVar, m mVar, boolean z10) {
        a aVar;
        if (z10) {
            aVar = transform(oVar, mVar);
        } else {
            aVar = optionalTransform(oVar, mVar);
        }
        aVar.isScaleOnlyOrNoTransform = true;
        return aVar;
    }

    private a h() {
        return this;
    }

    public a apply(a aVar) {
        if (this.isAutoCloneEnabled) {
            return clone().apply(aVar);
        }
        if (c(aVar.fields, 2)) {
            this.sizeMultiplier = aVar.sizeMultiplier;
        }
        if (c(aVar.fields, USE_UNLIMITED_SOURCE_GENERATORS_POOL)) {
            this.useUnlimitedSourceGeneratorsPool = aVar.useUnlimitedSourceGeneratorsPool;
        }
        if (c(aVar.fields, USE_ANIMATION_POOL)) {
            this.useAnimationPool = aVar.useAnimationPool;
        }
        if (c(aVar.fields, 4)) {
            this.diskCacheStrategy = aVar.diskCacheStrategy;
        }
        if (c(aVar.fields, 8)) {
            this.priority = aVar.priority;
        }
        if (c(aVar.fields, 16)) {
            this.errorPlaceholder = aVar.errorPlaceholder;
            this.errorId = 0;
            this.fields &= -33;
        }
        if (c(aVar.fields, 32)) {
            this.errorId = aVar.errorId;
            this.errorPlaceholder = null;
            this.fields &= -17;
        }
        if (c(aVar.fields, 64)) {
            this.placeholderDrawable = aVar.placeholderDrawable;
            this.placeholderId = 0;
            this.fields &= -129;
        }
        if (c(aVar.fields, PLACEHOLDER_ID)) {
            this.placeholderId = aVar.placeholderId;
            this.placeholderDrawable = null;
            this.fields &= -65;
        }
        if (c(aVar.fields, IS_CACHEABLE)) {
            this.isCacheable = aVar.isCacheable;
        }
        if (c(aVar.fields, OVERRIDE)) {
            this.overrideWidth = aVar.overrideWidth;
            this.overrideHeight = aVar.overrideHeight;
        }
        if (c(aVar.fields, SIGNATURE)) {
            this.signature = aVar.signature;
        }
        if (c(aVar.fields, RESOURCE_CLASS)) {
            this.resourceClass = aVar.resourceClass;
        }
        if (c(aVar.fields, FALLBACK)) {
            this.fallbackDrawable = aVar.fallbackDrawable;
            this.fallbackId = 0;
            this.fields &= -16385;
        }
        if (c(aVar.fields, FALLBACK_ID)) {
            this.fallbackId = aVar.fallbackId;
            this.fallbackDrawable = null;
            this.fields &= -8193;
        }
        if (c(aVar.fields, THEME)) {
            this.theme = aVar.theme;
        }
        if (c(aVar.fields, TRANSFORMATION_ALLOWED)) {
            this.isTransformationAllowed = aVar.isTransformationAllowed;
        }
        if (c(aVar.fields, TRANSFORMATION_REQUIRED)) {
            this.isTransformationRequired = aVar.isTransformationRequired;
        }
        if (c(aVar.fields, TRANSFORMATION)) {
            this.transformations.putAll(aVar.transformations);
            this.isScaleOnlyOrNoTransform = aVar.isScaleOnlyOrNoTransform;
        }
        if (c(aVar.fields, ONLY_RETRIEVE_FROM_CACHE)) {
            this.onlyRetrieveFromCache = aVar.onlyRetrieveFromCache;
        }
        if (!this.isTransformationAllowed) {
            this.transformations.clear();
            int i10 = this.fields;
            this.isTransformationRequired = false;
            this.fields = i10 & -133121;
            this.isScaleOnlyOrNoTransform = true;
        }
        this.fields |= aVar.fields;
        this.options.d(aVar.options);
        return selfOrThrowIfLocked();
    }

    public a autoClone() {
        if (!this.isLocked || this.isAutoCloneEnabled) {
            this.isAutoCloneEnabled = true;
            return lock();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    public a centerCrop() {
        return transform(o.f36475e, (m) new k());
    }

    public a centerInside() {
        return e(o.f36474d, new l());
    }

    public a circleCrop() {
        return transform(o.f36474d, (m) new c5.m());
    }

    public a decode(Class cls) {
        if (this.isAutoCloneEnabled) {
            return clone().decode(cls);
        }
        this.resourceClass = (Class) o5.k.d(cls);
        this.fields |= RESOURCE_CLASS;
        return selfOrThrowIfLocked();
    }

    public a disallowHardwareConfig() {
        return set(s.f36487j, Boolean.FALSE);
    }

    public a diskCacheStrategy(j jVar) {
        if (this.isAutoCloneEnabled) {
            return clone().diskCacheStrategy(jVar);
        }
        this.diskCacheStrategy = (j) o5.k.d(jVar);
        this.fields |= 4;
        return selfOrThrowIfLocked();
    }

    public a dontAnimate() {
        return set(C3536i.f43651b, Boolean.TRUE);
    }

    public a dontTransform() {
        if (this.isAutoCloneEnabled) {
            return clone().dontTransform();
        }
        this.transformations.clear();
        int i10 = this.fields;
        this.isTransformationRequired = false;
        this.isTransformationAllowed = false;
        this.fields = (i10 & -133121) | TRANSFORMATION_ALLOWED;
        this.isScaleOnlyOrNoTransform = true;
        return selfOrThrowIfLocked();
    }

    public a downsample(o oVar) {
        return set(o.f36478h, o5.k.d(oVar));
    }

    public a encodeFormat(Bitmap.CompressFormat compressFormat) {
        return set(C3172c.f36456c, o5.k.d(compressFormat));
    }

    public a encodeQuality(int i10) {
        return set(C3172c.f36455b, Integer.valueOf(i10));
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return isEquivalentTo((a) obj);
        }
        return false;
    }

    public a error(Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return clone().error(drawable);
        }
        this.errorPlaceholder = drawable;
        this.errorId = 0;
        this.fields = (this.fields | 16) & -33;
        return selfOrThrowIfLocked();
    }

    public a fallback(Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return clone().fallback(drawable);
        }
        this.fallbackDrawable = drawable;
        int i10 = this.fields | FALLBACK;
        this.fallbackId = 0;
        this.fields = i10 & -16385;
        return selfOrThrowIfLocked();
    }

    public a fitCenter() {
        return e(o.f36473c, new w());
    }

    public a format(T4.b bVar) {
        o5.k.d(bVar);
        return set(s.f36483f, bVar).set(C3536i.f43650a, bVar);
    }

    public a frame(long j10) {
        return set(H.f36440d, Long.valueOf(j10));
    }

    public final j getDiskCacheStrategy() {
        return this.diskCacheStrategy;
    }

    public final int getErrorId() {
        return this.errorId;
    }

    public final Drawable getErrorPlaceholder() {
        return this.errorPlaceholder;
    }

    public final Drawable getFallbackDrawable() {
        return this.fallbackDrawable;
    }

    public final int getFallbackId() {
        return this.fallbackId;
    }

    public final boolean getOnlyRetrieveFromCache() {
        return this.onlyRetrieveFromCache;
    }

    public final i getOptions() {
        return this.options;
    }

    public final int getOverrideHeight() {
        return this.overrideHeight;
    }

    public final int getOverrideWidth() {
        return this.overrideWidth;
    }

    public final Drawable getPlaceholderDrawable() {
        return this.placeholderDrawable;
    }

    public final int getPlaceholderId() {
        return this.placeholderId;
    }

    public final h getPriority() {
        return this.priority;
    }

    public final Class<?> getResourceClass() {
        return this.resourceClass;
    }

    public final f getSignature() {
        return this.signature;
    }

    public final float getSizeMultiplier() {
        return this.sizeMultiplier;
    }

    public final Resources.Theme getTheme() {
        return this.theme;
    }

    public final Map<Class<?>, m> getTransformations() {
        return this.transformations;
    }

    public final boolean getUseAnimationPool() {
        return this.useAnimationPool;
    }

    public final boolean getUseUnlimitedSourceGeneratorsPool() {
        return this.useUnlimitedSourceGeneratorsPool;
    }

    public int hashCode() {
        return o5.l.p(this.theme, o5.l.p(this.signature, o5.l.p(this.resourceClass, o5.l.p(this.transformations, o5.l.p(this.options, o5.l.p(this.priority, o5.l.p(this.diskCacheStrategy, o5.l.q(this.onlyRetrieveFromCache, o5.l.q(this.useUnlimitedSourceGeneratorsPool, o5.l.q(this.isTransformationAllowed, o5.l.q(this.isTransformationRequired, o5.l.o(this.overrideWidth, o5.l.o(this.overrideHeight, o5.l.q(this.isCacheable, o5.l.p(this.fallbackDrawable, o5.l.o(this.fallbackId, o5.l.p(this.placeholderDrawable, o5.l.o(this.placeholderId, o5.l.p(this.errorPlaceholder, o5.l.o(this.errorId, o5.l.m(this.sizeMultiplier)))))))))))))))))))));
    }

    /* access modifiers changed from: protected */
    public final boolean isAutoCloneEnabled() {
        return this.isAutoCloneEnabled;
    }

    public final boolean isDiskCacheStrategySet() {
        return a(4);
    }

    public final boolean isEquivalentTo(a aVar) {
        if (Float.compare(aVar.sizeMultiplier, this.sizeMultiplier) == 0 && this.errorId == aVar.errorId && o5.l.e(this.errorPlaceholder, aVar.errorPlaceholder) && this.placeholderId == aVar.placeholderId && o5.l.e(this.placeholderDrawable, aVar.placeholderDrawable) && this.fallbackId == aVar.fallbackId && o5.l.e(this.fallbackDrawable, aVar.fallbackDrawable) && this.isCacheable == aVar.isCacheable && this.overrideHeight == aVar.overrideHeight && this.overrideWidth == aVar.overrideWidth && this.isTransformationRequired == aVar.isTransformationRequired && this.isTransformationAllowed == aVar.isTransformationAllowed && this.useUnlimitedSourceGeneratorsPool == aVar.useUnlimitedSourceGeneratorsPool && this.onlyRetrieveFromCache == aVar.onlyRetrieveFromCache && this.diskCacheStrategy.equals(aVar.diskCacheStrategy) && this.priority == aVar.priority && this.options.equals(aVar.options) && this.transformations.equals(aVar.transformations) && this.resourceClass.equals(aVar.resourceClass) && o5.l.e(this.signature, aVar.signature) && o5.l.e(this.theme, aVar.theme)) {
            return true;
        }
        return false;
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final boolean isMemoryCacheable() {
        return this.isCacheable;
    }

    public final boolean isPrioritySet() {
        return a(8);
    }

    /* access modifiers changed from: package-private */
    public boolean isScaleOnlyOrNoTransform() {
        return this.isScaleOnlyOrNoTransform;
    }

    public final boolean isSkipMemoryCacheSet() {
        return a(IS_CACHEABLE);
    }

    public final boolean isTransformationAllowed() {
        return this.isTransformationAllowed;
    }

    public final boolean isTransformationRequired() {
        return this.isTransformationRequired;
    }

    public final boolean isTransformationSet() {
        return a(TRANSFORMATION);
    }

    public final boolean isValidOverride() {
        return o5.l.u(this.overrideWidth, this.overrideHeight);
    }

    public a lock() {
        this.isLocked = true;
        return h();
    }

    public a onlyRetrieveFromCache(boolean z10) {
        if (this.isAutoCloneEnabled) {
            return clone().onlyRetrieveFromCache(z10);
        }
        this.onlyRetrieveFromCache = z10;
        this.fields |= ONLY_RETRIEVE_FROM_CACHE;
        return selfOrThrowIfLocked();
    }

    public a optionalCenterCrop() {
        return optionalTransform(o.f36475e, (m) new k());
    }

    public a optionalCenterInside() {
        return d(o.f36474d, new l());
    }

    public a optionalCircleCrop() {
        return optionalTransform(o.f36475e, (m) new c5.m());
    }

    public a optionalFitCenter() {
        return d(o.f36473c, new w());
    }

    /* access modifiers changed from: package-private */
    public final a optionalTransform(o oVar, m mVar) {
        if (this.isAutoCloneEnabled) {
            return clone().optionalTransform(oVar, mVar);
        }
        downsample(oVar);
        return transform(mVar, false);
    }

    public a override(int i10, int i11) {
        if (this.isAutoCloneEnabled) {
            return clone().override(i10, i11);
        }
        this.overrideWidth = i10;
        this.overrideHeight = i11;
        this.fields |= OVERRIDE;
        return selfOrThrowIfLocked();
    }

    public a placeholder(Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return clone().placeholder(drawable);
        }
        this.placeholderDrawable = drawable;
        this.placeholderId = 0;
        this.fields = (this.fields | 64) & -129;
        return selfOrThrowIfLocked();
    }

    public a priority(h hVar) {
        if (this.isAutoCloneEnabled) {
            return clone().priority(hVar);
        }
        this.priority = (h) o5.k.d(hVar);
        this.fields |= 8;
        return selfOrThrowIfLocked();
    }

    /* access modifiers changed from: package-private */
    public a removeOption(T4.h hVar) {
        if (this.isAutoCloneEnabled) {
            return clone().removeOption(hVar);
        }
        this.options.e(hVar);
        return selfOrThrowIfLocked();
    }

    /* access modifiers changed from: protected */
    public final a selfOrThrowIfLocked() {
        if (!this.isLocked) {
            return h();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public a set(T4.h hVar, Object obj) {
        if (this.isAutoCloneEnabled) {
            return clone().set(hVar, obj);
        }
        o5.k.d(hVar);
        o5.k.d(obj);
        this.options.f(hVar, obj);
        return selfOrThrowIfLocked();
    }

    public a signature(f fVar) {
        if (this.isAutoCloneEnabled) {
            return clone().signature(fVar);
        }
        this.signature = (f) o5.k.d(fVar);
        this.fields |= SIGNATURE;
        return selfOrThrowIfLocked();
    }

    public a sizeMultiplier(float f10) {
        if (this.isAutoCloneEnabled) {
            return clone().sizeMultiplier(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.sizeMultiplier = f10;
        this.fields |= 2;
        return selfOrThrowIfLocked();
    }

    public a skipMemoryCache(boolean z10) {
        if (this.isAutoCloneEnabled) {
            return clone().skipMemoryCache(true);
        }
        this.isCacheable = !z10;
        this.fields |= IS_CACHEABLE;
        return selfOrThrowIfLocked();
    }

    public a theme(Resources.Theme theme2) {
        if (this.isAutoCloneEnabled) {
            return clone().theme(theme2);
        }
        this.theme = theme2;
        if (theme2 != null) {
            this.fields |= THEME;
            return set(e5.i.f43344b, theme2);
        }
        this.fields &= -32769;
        return removeOption(e5.i.f43344b);
    }

    public a timeout(int i10) {
        return set(C3132a.f36097b, Integer.valueOf(i10));
    }

    /* access modifiers changed from: package-private */
    public final a transform(o oVar, m mVar) {
        if (this.isAutoCloneEnabled) {
            return clone().transform(oVar, mVar);
        }
        downsample(oVar);
        return transform(mVar);
    }

    public a transforms(m... mVarArr) {
        return transform((m) new g(mVarArr), true);
    }

    public a useAnimationPool(boolean z10) {
        if (this.isAutoCloneEnabled) {
            return clone().useAnimationPool(z10);
        }
        this.useAnimationPool = z10;
        this.fields |= USE_ANIMATION_POOL;
        return selfOrThrowIfLocked();
    }

    public a useUnlimitedSourceGeneratorsPool(boolean z10) {
        if (this.isAutoCloneEnabled) {
            return clone().useUnlimitedSourceGeneratorsPool(z10);
        }
        this.useUnlimitedSourceGeneratorsPool = z10;
        this.fields |= USE_UNLIMITED_SOURCE_GENERATORS_POOL;
        return selfOrThrowIfLocked();
    }

    public a clone() {
        try {
            a aVar = (a) super.clone();
            i iVar = new i();
            aVar.options = iVar;
            iVar.d(this.options);
            b bVar = new b();
            aVar.transformations = bVar;
            bVar.putAll(this.transformations);
            aVar.isLocked = false;
            aVar.isAutoCloneEnabled = false;
            return aVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public a optionalTransform(m mVar) {
        return transform(mVar, false);
    }

    public a transform(m mVar) {
        return transform(mVar, true);
    }

    public a optionalTransform(Class cls, m mVar) {
        return transform(cls, mVar, false);
    }

    public a transform(m... mVarArr) {
        if (mVarArr.length > 1) {
            return transform((m) new g(mVarArr), true);
        }
        if (mVarArr.length == 1) {
            return transform(mVarArr[0]);
        }
        return selfOrThrowIfLocked();
    }

    public a override(int i10) {
        return override(i10, i10);
    }

    public a error(int i10) {
        if (this.isAutoCloneEnabled) {
            return clone().error(i10);
        }
        this.errorId = i10;
        this.errorPlaceholder = null;
        this.fields = (this.fields | 32) & -17;
        return selfOrThrowIfLocked();
    }

    public a fallback(int i10) {
        if (this.isAutoCloneEnabled) {
            return clone().fallback(i10);
        }
        this.fallbackId = i10;
        int i11 = this.fields | FALLBACK_ID;
        this.fallbackDrawable = null;
        this.fields = i11 & -8193;
        return selfOrThrowIfLocked();
    }

    public a placeholder(int i10) {
        if (this.isAutoCloneEnabled) {
            return clone().placeholder(i10);
        }
        this.placeholderId = i10;
        int i11 = this.fields | PLACEHOLDER_ID;
        this.placeholderDrawable = null;
        this.fields = i11 & -65;
        return selfOrThrowIfLocked();
    }

    /* access modifiers changed from: package-private */
    public a transform(m mVar, boolean z10) {
        if (this.isAutoCloneEnabled) {
            return clone().transform(mVar, z10);
        }
        u uVar = new u(mVar, z10);
        transform(Bitmap.class, mVar, z10);
        transform(Drawable.class, uVar, z10);
        transform(BitmapDrawable.class, uVar.c(), z10);
        transform(C3530c.class, new C3533f(mVar), z10);
        return selfOrThrowIfLocked();
    }

    /* access modifiers changed from: package-private */
    public <Y> a transform(Class<Y> cls, m mVar, boolean z10) {
        if (this.isAutoCloneEnabled) {
            return clone().transform(cls, mVar, z10);
        }
        o5.k.d(cls);
        o5.k.d(mVar);
        this.transformations.put(cls, mVar);
        int i10 = this.fields;
        this.isTransformationAllowed = true;
        this.fields = 67584 | i10;
        this.isScaleOnlyOrNoTransform = false;
        if (z10) {
            this.fields = i10 | 198656;
            this.isTransformationRequired = true;
        }
        return selfOrThrowIfLocked();
    }

    public a transform(Class cls, m mVar) {
        return transform(cls, mVar, true);
    }
}

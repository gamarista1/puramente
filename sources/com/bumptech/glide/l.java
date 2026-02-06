package com.bumptech.glide;

import V4.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.request.b;
import com.bumptech.glide.request.c;
import com.bumptech.glide.request.d;
import com.bumptech.glide.request.e;
import com.bumptech.glide.request.f;
import com.bumptech.glide.request.g;
import com.bumptech.glide.request.h;
import com.bumptech.glide.request.k;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import n5.C3858a;

public class l extends com.bumptech.glide.request.a implements Cloneable {
    protected static final h DOWNLOAD_ONLY_OPTIONS = ((h) ((h) ((h) new h().diskCacheStrategy(j.f34540c)).priority(h.LOW)).skipMemoryCache(true));
    private final Context context;
    private l errorBuilder;
    private final c glide;
    private final e glideContext;
    private boolean isDefaultTransitionOptionsSet;
    private boolean isModelSet;
    private boolean isThumbnailBuilt;
    private Object model;
    private List<g> requestListeners;
    private final m requestManager;
    private Float thumbSizeMultiplier;
    private l thumbnailBuilder;
    private final Class<Object> transcodeClass;
    private n transitionOptions;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f39106a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f39107b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.h[] r0 = com.bumptech.glide.h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39107b = r0
                r1 = 1
                com.bumptech.glide.h r2 = com.bumptech.glide.h.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f39107b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.h r3 = com.bumptech.glide.h.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f39107b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.h r4 = com.bumptech.glide.h.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f39107b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.h r5 = com.bumptech.glide.h.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f39106a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f39106a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f39106a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f39106a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f39106a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f39106a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f39106a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f39106a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.l.a.<clinit>():void");
        }
    }

    protected l(c cVar, m mVar, Class cls, Context context2) {
        this.isDefaultTransitionOptionsSet = true;
        this.glide = cVar;
        this.requestManager = mVar;
        this.transcodeClass = cls;
        this.context = context2;
        this.transitionOptions = mVar.getDefaultTransitionOptions(cls);
        this.glideContext = cVar.k();
        p(mVar.getDefaultRequestListeners());
        apply((com.bumptech.glide.request.a) mVar.getDefaultRequestOptions());
    }

    private l i(l lVar) {
        return (l) ((l) lVar.theme(this.context.getTheme())).signature(C3858a.c(this.context));
    }

    private d j(l5.j jVar, g gVar, com.bumptech.glide.request.a aVar, Executor executor) {
        return k(new Object(), jVar, gVar, (e) null, this.transitionOptions, aVar.getPriority(), aVar.getOverrideWidth(), aVar.getOverrideHeight(), aVar, executor);
    }

    private d k(Object obj, l5.j jVar, g gVar, e eVar, n nVar, h hVar, int i10, int i11, com.bumptech.glide.request.a aVar, Executor executor) {
        b bVar;
        b bVar2;
        if (this.errorBuilder != null) {
            bVar2 = new b(obj, eVar);
            bVar = bVar2;
        } else {
            Object obj2 = obj;
            bVar = null;
            bVar2 = eVar;
        }
        d l10 = l(obj, jVar, gVar, bVar2, nVar, hVar, i10, i11, aVar, executor);
        if (bVar == null) {
            return l10;
        }
        int overrideWidth = this.errorBuilder.getOverrideWidth();
        int overrideHeight = this.errorBuilder.getOverrideHeight();
        if (o5.l.u(i10, i11) && !this.errorBuilder.isValidOverride()) {
            overrideWidth = aVar.getOverrideWidth();
            overrideHeight = aVar.getOverrideHeight();
        }
        l lVar = this.errorBuilder;
        b bVar3 = bVar;
        bVar3.o(l10, lVar.k(obj, jVar, gVar, bVar3, lVar.transitionOptions, lVar.getPriority(), overrideWidth, overrideHeight, this.errorBuilder, executor));
        return bVar3;
    }

    private d l(Object obj, l5.j jVar, g gVar, e eVar, n nVar, h hVar, int i10, int i11, com.bumptech.glide.request.a aVar, Executor executor) {
        n nVar2;
        h o10;
        Object obj2 = obj;
        e eVar2 = eVar;
        h hVar2 = hVar;
        l lVar = this.thumbnailBuilder;
        if (lVar != null) {
            if (!this.isThumbnailBuilt) {
                n nVar3 = lVar.transitionOptions;
                if (lVar.isDefaultTransitionOptionsSet) {
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar3;
                }
                if (lVar.isPrioritySet()) {
                    o10 = this.thumbnailBuilder.getPriority();
                } else {
                    o10 = o(hVar2);
                }
                h hVar3 = o10;
                int overrideWidth = this.thumbnailBuilder.getOverrideWidth();
                int overrideHeight = this.thumbnailBuilder.getOverrideHeight();
                if (o5.l.u(i10, i11) && !this.thumbnailBuilder.isValidOverride()) {
                    overrideWidth = aVar.getOverrideWidth();
                    overrideHeight = aVar.getOverrideHeight();
                }
                int i12 = overrideHeight;
                k kVar = new k(obj2, eVar2);
                Object obj3 = obj;
                l5.j jVar2 = jVar;
                g gVar2 = gVar;
                k kVar2 = kVar;
                d u10 = u(obj3, jVar2, gVar2, aVar, kVar, nVar, hVar, i10, i11, executor);
                this.isThumbnailBuilt = true;
                l lVar2 = this.thumbnailBuilder;
                d k10 = lVar2.k(obj3, jVar2, gVar2, kVar2, nVar2, hVar3, overrideWidth, i12, lVar2, executor);
                this.isThumbnailBuilt = false;
                kVar2.n(u10, k10);
                return kVar2;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.thumbSizeMultiplier == null) {
            return u(obj, jVar, gVar, aVar, eVar, nVar, hVar, i10, i11, executor);
        } else {
            k kVar3 = new k(obj2, eVar2);
            l5.j jVar3 = jVar;
            g gVar3 = gVar;
            k kVar4 = kVar3;
            n nVar4 = nVar;
            int i13 = i10;
            int i14 = i11;
            Executor executor2 = executor;
            kVar3.n(u(obj, jVar3, gVar3, aVar, kVar4, nVar4, hVar, i13, i14, executor2), u(obj, jVar3, gVar3, aVar.clone().sizeMultiplier(this.thumbSizeMultiplier.floatValue()), kVar4, nVar4, o(hVar2), i13, i14, executor2));
            return kVar3;
        }
    }

    private l m() {
        return clone().error((l) null).thumbnail((l) null);
    }

    private h o(h hVar) {
        int i10 = a.f39107b[hVar.ordinal()];
        if (i10 == 1) {
            return h.NORMAL;
        }
        if (i10 == 2) {
            return h.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return h.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + getPriority());
    }

    private void p(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            addListener((g) it.next());
        }
    }

    private l5.j q(l5.j jVar, g gVar, com.bumptech.glide.request.a aVar, Executor executor) {
        o5.k.d(jVar);
        if (this.isModelSet) {
            d j10 = j(jVar, gVar, aVar, executor);
            d a10 = jVar.a();
            if (!j10.h(a10) || r(aVar, a10)) {
                this.requestManager.clear(jVar);
                jVar.f(j10);
                this.requestManager.track(jVar, j10);
                return jVar;
            }
            if (!((d) o5.k.d(a10)).isRunning()) {
                a10.i();
            }
            return jVar;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    private boolean r(com.bumptech.glide.request.a aVar, d dVar) {
        if (aVar.isMemoryCacheable() || !dVar.g()) {
            return false;
        }
        return true;
    }

    private l s(Object obj) {
        if (isAutoCloneEnabled()) {
            return clone().s(obj);
        }
        this.model = obj;
        this.isModelSet = true;
        return (l) selfOrThrowIfLocked();
    }

    private l t(Uri uri, l lVar) {
        if (uri == null || !"android.resource".equals(uri.getScheme())) {
            return lVar;
        }
        return i(lVar);
    }

    private d u(Object obj, l5.j jVar, g gVar, com.bumptech.glide.request.a aVar, e eVar, n nVar, h hVar, int i10, int i11, Executor executor) {
        Context context2 = this.context;
        e eVar2 = this.glideContext;
        return com.bumptech.glide.request.j.y(context2, eVar2, obj, this.model, this.transcodeClass, aVar, i10, i11, hVar, jVar, gVar, this.requestListeners, eVar, eVar2.f(), nVar.c(), executor);
    }

    public l addListener(g gVar) {
        if (isAutoCloneEnabled()) {
            return clone().addListener(gVar);
        }
        if (gVar != null) {
            if (this.requestListeners == null) {
                this.requestListeners = new ArrayList();
            }
            this.requestListeners.add(gVar);
        }
        return (l) selfOrThrowIfLocked();
    }

    @Deprecated
    public <Y extends l5.j> Y downloadOnly(Y y10) {
        return getDownloadOnlyRequest().into(y10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!super.equals(lVar) || !Objects.equals(this.transcodeClass, lVar.transcodeClass) || !this.transitionOptions.equals(lVar.transitionOptions) || !Objects.equals(this.model, lVar.model) || !Objects.equals(this.requestListeners, lVar.requestListeners) || !Objects.equals(this.thumbnailBuilder, lVar.thumbnailBuilder) || !Objects.equals(this.errorBuilder, lVar.errorBuilder) || !Objects.equals(this.thumbSizeMultiplier, lVar.thumbSizeMultiplier) || this.isDefaultTransitionOptionsSet != lVar.isDefaultTransitionOptionsSet || this.isModelSet != lVar.isModelSet) {
            return false;
        }
        return true;
    }

    public l error(l lVar) {
        if (isAutoCloneEnabled()) {
            return clone().error(lVar);
        }
        this.errorBuilder = lVar;
        return (l) selfOrThrowIfLocked();
    }

    /* access modifiers changed from: protected */
    public l getDownloadOnlyRequest() {
        return new l(File.class, this).apply((com.bumptech.glide.request.a) DOWNLOAD_ONLY_OPTIONS);
    }

    /* access modifiers changed from: package-private */
    public Object getModel() {
        return this.model;
    }

    /* access modifiers changed from: package-private */
    public m getRequestManager() {
        return this.requestManager;
    }

    public int hashCode() {
        return o5.l.q(this.isModelSet, o5.l.q(this.isDefaultTransitionOptionsSet, o5.l.p(this.thumbSizeMultiplier, o5.l.p(this.errorBuilder, o5.l.p(this.thumbnailBuilder, o5.l.p(this.requestListeners, o5.l.p(this.model, o5.l.p(this.transitionOptions, o5.l.p(this.transcodeClass, super.hashCode())))))))));
    }

    public <Y extends l5.j> Y into(Y y10) {
        return into(y10, (g) null, o5.e.b());
    }

    public l listener(g gVar) {
        if (isAutoCloneEnabled()) {
            return clone().listener(gVar);
        }
        this.requestListeners = null;
        return addListener(gVar);
    }

    public l load(Object obj) {
        return s(obj);
    }

    public l5.j preload(int i10, int i11) {
        return into(l5.h.j(this.requestManager, i10, i11));
    }

    public c submit() {
        return submit(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public l thumbnail(l lVar) {
        if (isAutoCloneEnabled()) {
            return clone().thumbnail(lVar);
        }
        this.thumbnailBuilder = lVar;
        return (l) selfOrThrowIfLocked();
    }

    public l transition(n nVar) {
        if (isAutoCloneEnabled()) {
            return clone().transition(nVar);
        }
        this.transitionOptions = (n) o5.k.d(nVar);
        this.isDefaultTransitionOptionsSet = false;
        return (l) selfOrThrowIfLocked();
    }

    public l apply(com.bumptech.glide.request.a aVar) {
        o5.k.d(aVar);
        return (l) super.apply(aVar);
    }

    @Deprecated
    public c downloadOnly(int i10, int i11) {
        return getDownloadOnlyRequest().submit(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public <Y extends l5.j> Y into(Y y10, g gVar, Executor executor) {
        return q(y10, gVar, this, executor);
    }

    public l load(Bitmap bitmap) {
        return s(bitmap).apply((com.bumptech.glide.request.a) h.diskCacheStrategyOf(j.f34539b));
    }

    public c submit(int i10, int i11) {
        f fVar = new f(i10, i11);
        return (c) into(fVar, fVar, o5.e.a());
    }

    public l clone() {
        l lVar = (l) super.clone();
        lVar.transitionOptions = lVar.transitionOptions.clone();
        if (lVar.requestListeners != null) {
            lVar.requestListeners = new ArrayList(lVar.requestListeners);
        }
        l lVar2 = lVar.thumbnailBuilder;
        if (lVar2 != null) {
            lVar.thumbnailBuilder = lVar2.clone();
        }
        l lVar3 = lVar.errorBuilder;
        if (lVar3 != null) {
            lVar.errorBuilder = lVar3.clone();
        }
        return lVar;
    }

    public l5.k into(ImageView imageView) {
        com.bumptech.glide.request.a aVar;
        o5.l.b();
        o5.k.d(imageView);
        if (!isTransformationSet() && isTransformationAllowed() && imageView.getScaleType() != null) {
            switch (a.f39106a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().optionalCenterCrop();
                    break;
                case 2:
                    aVar = clone().optionalCenterInside();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().optionalFitCenter();
                    break;
                case 6:
                    aVar = clone().optionalCenterInside();
                    break;
            }
        }
        aVar = this;
        return (l5.k) q(this.glideContext.a(imageView, this.transcodeClass), (g) null, aVar, o5.e.b());
    }

    public l load(Drawable drawable) {
        return s(drawable).apply((com.bumptech.glide.request.a) h.diskCacheStrategyOf(j.f34539b));
    }

    public l5.j preload() {
        return preload(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public l load(String str) {
        return s(str);
    }

    public l error(Object obj) {
        if (obj == null) {
            return error((l) null);
        }
        return error(m().load(obj));
    }

    public l load(Uri uri) {
        return t(uri, s(uri));
    }

    public l thumbnail(l... lVarArr) {
        if (lVarArr == null || lVarArr.length == 0) {
            return thumbnail((l) null);
        }
        return thumbnail(Arrays.asList(lVarArr));
    }

    public l load(File file) {
        return s(file);
    }

    public l load(Integer num) {
        return i(s(num));
    }

    public l load(URL url) {
        return s(url);
    }

    public l thumbnail(List list) {
        l lVar = null;
        if (list == null || list.isEmpty()) {
            return thumbnail((l) null);
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            l lVar2 = (l) list.get(size);
            if (lVar2 != null) {
                if (lVar == null) {
                    lVar = lVar2;
                } else {
                    lVar = lVar2.thumbnail(lVar);
                }
            }
        }
        return thumbnail(lVar);
    }

    public l load(byte[] bArr) {
        l s10 = s(bArr);
        if (!s10.isDiskCacheStrategySet()) {
            s10 = s10.apply((com.bumptech.glide.request.a) h.diskCacheStrategyOf(j.f34539b));
        }
        return !s10.isSkipMemoryCacheSet() ? s10.apply((com.bumptech.glide.request.a) h.skipMemoryCacheOf(true)) : s10;
    }

    protected l(Class cls, l lVar) {
        this(lVar.glide, lVar.requestManager, cls, lVar.context);
        this.model = lVar.model;
        this.isModelSet = lVar.isModelSet;
        apply((com.bumptech.glide.request.a) lVar);
    }

    public l thumbnail(float f10) {
        if (isAutoCloneEnabled()) {
            return clone().thumbnail(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.thumbSizeMultiplier = Float.valueOf(f10);
        return (l) selfOrThrowIfLocked();
    }

    @Deprecated
    public c into(int i10, int i11) {
        return submit(i10, i11);
    }
}

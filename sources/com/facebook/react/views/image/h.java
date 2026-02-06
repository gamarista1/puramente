package com.facebook.react.views.image;

import W6.g;
import X6.C3091n;
import X7.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import c7.C3191k;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3400a;
import com.facebook.react.uimanager.C3430x;
import com.facebook.react.uimanager.C3431y;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import com.facebook.react.views.image.b;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import h7.C3581a;
import i7.C3592a;
import i7.C3593b;
import i7.C3594c;
import i7.C3595d;
import j8.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n6.f;
import q6.C3953b;
import q6.q;
import q8.C3959a;
import q8.C3960b;
import r6.C3976a;
import r6.C3977b;
import r6.C3979d;
import u6.C4092d;

public final class h extends C4092d {

    /* renamed from: B  reason: collision with root package name */
    public static final a f41881B = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public static final Matrix f41882C = new Matrix();

    /* renamed from: A  reason: collision with root package name */
    private c f41883A = c.AUTO;

    /* renamed from: h  reason: collision with root package name */
    private final n6.b f41884h;

    /* renamed from: i  reason: collision with root package name */
    private Object f41885i;

    /* renamed from: j  reason: collision with root package name */
    private final List f41886j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private C3959a f41887k;

    /* renamed from: l  reason: collision with root package name */
    private C3959a f41888l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f41889m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f41890n;

    /* renamed from: o  reason: collision with root package name */
    private int f41891o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public q f41892p = d.b();
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public Shader.TileMode f41893q = d.a();

    /* renamed from: r  reason: collision with root package name */
    private boolean f41894r;

    /* renamed from: s  reason: collision with root package name */
    private b f41895s;

    /* renamed from: t  reason: collision with root package name */
    private C3581a f41896t;

    /* renamed from: u  reason: collision with root package name */
    private g f41897u;

    /* renamed from: v  reason: collision with root package name */
    private n6.d f41898v;

    /* renamed from: w  reason: collision with root package name */
    private int f41899w = -1;

    /* renamed from: x  reason: collision with root package name */
    private boolean f41900x;

    /* renamed from: y  reason: collision with root package name */
    private ReadableMap f41901y;

    /* renamed from: z  reason: collision with root package name */
    private float f41902z = 1.0f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final C3976a b(Context context) {
            C3977b bVar = new C3977b(context.getResources());
            C3979d a10 = C3979d.a(0.0f);
            a10.o(true);
            C3976a a11 = bVar.u(a10).a();
            C6496s.g(a11, "build(...)");
            return a11;
        }

        private a() {
        }
    }

    private final class b extends C3592a {
        public b() {
        }

        public X5.a b(Bitmap bitmap, U6.d dVar) {
            C6496s.h(bitmap, "source");
            C6496s.h(dVar, "bitmapFactory");
            Rect rect = new Rect(0, 0, h.this.getWidth(), h.this.getHeight());
            h.this.f41892p.a(h.f41882C, rect, bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(bitmap, h.this.f41893q, h.this.f41893q);
            bitmapShader.setLocalMatrix(h.f41882C);
            paint.setShader(bitmapShader);
            X5.a a10 = dVar.a(h.this.getWidth(), h.this.getHeight());
            C6496s.g(a10, "createBitmap(...)");
            try {
                new Canvas((Bitmap) a10.I()).drawRect(rect, paint);
                X5.a o10 = a10.o();
                C6496s.g(o10, "clone(...)");
                return o10;
            } finally {
                X5.a.E(a10);
            }
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f41904a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f41905b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0021 */
        static {
            /*
                X7.a[] r0 = X7.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                X7.a r2 = X7.a.ONLY_IF_CACHED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                f41904a = r0
                com.facebook.react.views.image.c[] r0 = com.facebook.react.views.image.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.react.views.image.c r2 = com.facebook.react.views.image.c.AUTO     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                com.facebook.react.views.image.c r1 = com.facebook.react.views.image.c.RESIZE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                f41905b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.h.c.<clinit>():void");
        }
    }

    public static final class d extends g {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ EventDispatcher f41906f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f41907g;

        d(EventDispatcher eventDispatcher, h hVar) {
            this.f41906f = eventDispatcher;
            this.f41907g = hVar;
        }

        public void f(String str, Throwable th2) {
            C6496s.h(str, "id");
            C6496s.h(th2, "throwable");
            EventDispatcher eventDispatcher = this.f41906f;
            if (eventDispatcher != null) {
                eventDispatcher.h(b.f41863h.a(n0.f(this.f41907g), this.f41907g.getId(), th2));
            }
        }

        public void r(String str, Object obj) {
            C6496s.h(str, "id");
            EventDispatcher eventDispatcher = this.f41906f;
            if (eventDispatcher != null) {
                eventDispatcher.h(b.f41863h.d(n0.f(this.f41907g), this.f41907g.getId()));
            }
        }

        public void x(int i10, int i11) {
            String str;
            if (this.f41906f != null && this.f41907g.getImageSource$ReactAndroid_release() != null) {
                EventDispatcher eventDispatcher = this.f41906f;
                b.a aVar = b.f41863h;
                int f10 = n0.f(this.f41907g);
                int id2 = this.f41907g.getId();
                C3959a imageSource$ReactAndroid_release = this.f41907g.getImageSource$ReactAndroid_release();
                if (imageSource$ReactAndroid_release != null) {
                    str = imageSource$ReactAndroid_release.e();
                } else {
                    str = null;
                }
                eventDispatcher.h(aVar.e(f10, id2, str, i10, i11));
            }
        }

        /* renamed from: y */
        public void n(String str, C3191k kVar, Animatable animatable) {
            EventDispatcher eventDispatcher;
            String str2;
            C6496s.h(str, "id");
            if (kVar != null && this.f41907g.getImageSource$ReactAndroid_release() != null && (eventDispatcher = this.f41906f) != null) {
                b.a aVar = b.f41863h;
                int f10 = n0.f(this.f41907g);
                int id2 = this.f41907g.getId();
                C3959a imageSource$ReactAndroid_release = this.f41907g.getImageSource$ReactAndroid_release();
                if (imageSource$ReactAndroid_release != null) {
                    str2 = imageSource$ReactAndroid_release.e();
                } else {
                    str2 = null;
                }
                String str3 = str2;
                eventDispatcher.h(aVar.c(f10, id2, str3, kVar.e(), kVar.d()));
                this.f41906f.h(aVar.b(n0.f(this.f41907g), this.f41907g.getId()));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Context context, n6.b bVar, a aVar, Object obj) {
        super(context, f41881B.b(context));
        C6496s.h(context, "context");
        C6496s.h(bVar, "draweeControllerBuilder");
        this.f41884h = bVar;
        this.f41885i = obj;
        setLegacyVisibilityHandlingEnabled(true);
    }

    private final g getResizeOptions() {
        int round = Math.round(((float) getWidth()) * this.f41902z);
        int round2 = Math.round(((float) getHeight()) * this.f41902z);
        if (round <= 0 || round2 <= 0) {
            return null;
        }
        return new g(round, round2, 0.0f, 0.0f, 12, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return X7.a.DEFAULT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (r2.equals("default") == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X7.a j(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0039
            int r0 = r2.hashCode()
            switch(r0) {
                case -1564134880: goto L_0x002b;
                case -934641255: goto L_0x001f;
                case 706834161: goto L_0x0013;
                case 1544803905: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0033
        L_0x000a:
            java.lang.String r0 = "default"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0039
            goto L_0x0033
        L_0x0013:
            java.lang.String r0 = "only-if-cached"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x001c
            goto L_0x0033
        L_0x001c:
            X7.a r2 = X7.a.ONLY_IF_CACHED
            goto L_0x003b
        L_0x001f:
            java.lang.String r0 = "reload"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0028
            goto L_0x0033
        L_0x0028:
            X7.a r2 = X7.a.RELOAD
            goto L_0x003b
        L_0x002b:
            java.lang.String r0 = "force-cache"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0036
        L_0x0033:
            X7.a r2 = X7.a.DEFAULT
            goto L_0x003b
        L_0x0036:
            X7.a r2 = X7.a.FORCE_CACHE
            goto L_0x003b
        L_0x0039:
            X7.a r2 = X7.a.DEFAULT
        L_0x003b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.h.j(java.lang.String):X7.a");
    }

    private final C3593b.c k(X7.a aVar) {
        if (c.f41904a[aVar.ordinal()] == 1) {
            return C3593b.c.DISK_CACHE;
        }
        return C3593b.c.FULL_FETCH;
    }

    private final boolean l() {
        if (this.f41886j.size() > 1) {
            return true;
        }
        return false;
    }

    private final boolean m() {
        if (this.f41893q != Shader.TileMode.CLAMP) {
            return true;
        }
        return false;
    }

    private final void o(boolean z10) {
        g gVar;
        C3959a aVar = this.f41887k;
        if (aVar != null) {
            Uri f10 = aVar.f();
            X7.a c10 = aVar.c();
            C3593b.c k10 = k(c10);
            ArrayList arrayList = new ArrayList();
            C3581a aVar2 = this.f41896t;
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
            b bVar = this.f41895s;
            if (bVar != null) {
                arrayList.add(bVar);
            }
            C3595d a10 = e.f41878b.a(arrayList);
            if (z10) {
                gVar = getResizeOptions();
            } else {
                gVar = null;
            }
            if (c10 == X7.a.RELOAD) {
                j6.d.a().g(f10);
            }
            C3594c I10 = C3594c.x(f10).J(a10).N(gVar).y(true).K(this.f41900x).I(k10);
            c cVar = this.f41883A;
            c cVar2 = c.NONE;
            if (cVar == cVar2) {
                I10.E(C3091n.NEVER);
            }
            b.a aVar3 = X7.b.f35372D;
            C6496s.e(I10);
            X7.b b10 = aVar3.b(I10, this.f41901y, c10);
            n6.b bVar2 = this.f41884h;
            C6496s.f(bVar2, "null cannot be cast to non-null type com.facebook.drawee.controller.AbstractDraweeControllerBuilder<*, com.facebook.imagepipeline.request.ImageRequest, com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>, com.facebook.imagepipeline.image.ImageInfo>");
            bVar2.x();
            bVar2.B(b10).y(true).D(getController());
            Object obj = this.f41885i;
            if (obj != null) {
                C6496s.g(bVar2.z(obj), "setCallerContext(...)");
            }
            C3959a aVar4 = this.f41888l;
            if (aVar4 != null) {
                C3594c K10 = C3594c.x(aVar4.f()).J(a10).N(gVar).y(true).K(this.f41900x);
                if (this.f41883A == cVar2) {
                    K10.E(C3091n.NEVER);
                }
                C6496s.g(bVar2.C(K10.a()), "setLowResImageRequest(...)");
            }
            g gVar2 = this.f41897u;
            if (gVar2 == null || this.f41898v == null) {
                n6.d dVar = this.f41898v;
                if (dVar != null) {
                    bVar2.A(dVar);
                } else if (gVar2 != null) {
                    bVar2.A(gVar2);
                }
            } else {
                f fVar = new f();
                fVar.b(this.f41897u);
                fVar.b(this.f41898v);
                bVar2.A(fVar);
            }
            if (this.f41897u != null) {
                ((C3976a) getHierarchy()).y(this.f41897u);
            }
            setController(bVar2.a());
            bVar2.x();
        }
    }

    private final void p() {
        this.f41887k = null;
        if (this.f41886j.isEmpty()) {
            List list = this.f41886j;
            C3959a.C0719a aVar = C3959a.f47776f;
            Context context = getContext();
            C6496s.g(context, "getContext(...)");
            list.add(aVar.a(context));
        } else if (l()) {
            C3960b.a a10 = C3960b.a(getWidth(), getHeight(), this.f41886j);
            this.f41887k = a10.f47783a;
            this.f41888l = a10.f47784b;
            return;
        }
        this.f41887k = (C3959a) this.f41886j.get(0);
    }

    private final boolean q(C3959a aVar) {
        int i10 = c.f41905b[this.f41883A.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
        } else if (!b6.f.k(aVar.f()) && !b6.f.l(aVar.f())) {
            return false;
        }
        return true;
    }

    private final void r(String str) {
        if (E7.a.f30669b && !M7.b.e()) {
            Context context = getContext();
            C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            l8.c.d((ReactContext) context, "ReactImageView: Image source \"" + str + "\" doesn't exist");
        }
    }

    public final C3959a getImageSource$ReactAndroid_release() {
        return this.f41887k;
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public final void n() {
        if (this.f41894r) {
            if (!l() || (getWidth() > 0 && getHeight() > 0)) {
                p();
                C3959a aVar = this.f41887k;
                if (aVar != null) {
                    boolean q10 = q(aVar);
                    if (q10 && (getWidth() <= 0 || getHeight() <= 0)) {
                        return;
                    }
                    if (!m() || (getWidth() > 0 && getHeight() > 0)) {
                        C3976a aVar2 = (C3976a) getHierarchy();
                        aVar2.t(this.f41892p);
                        Drawable drawable = this.f41889m;
                        if (drawable != null) {
                            aVar2.w(drawable, this.f41892p);
                        }
                        Drawable drawable2 = this.f41890n;
                        if (drawable2 != null) {
                            aVar2.w(drawable2, q.f47739g);
                        }
                        C3979d o10 = aVar2.o();
                        if (o10 != null) {
                            int i10 = this.f41891o;
                            if (i10 != 0) {
                                o10.n(i10);
                            } else {
                                o10.p(C3979d.a.BITMAP_ONLY);
                            }
                            aVar2.z(o10);
                        }
                        int i11 = this.f41899w;
                        if (i11 < 0) {
                            if (aVar.g()) {
                                i11 = 0;
                            } else {
                                i11 = 300;
                            }
                        }
                        aVar2.v(i11);
                        o(q10);
                        this.f41894r = false;
                    }
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        C6496s.h(canvas, "canvas");
        C3400a.a(this, canvas);
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e10) {
            if (this.f41897u != null) {
                Context context = getContext();
                C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher c10 = n0.c((ReactContext) context, getId());
                if (c10 != null) {
                    c10.h(b.f41863h.a(n0.f(this), getId(), e10));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        boolean z10;
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 > 0 && i11 > 0) {
            if (this.f41894r || l() || m()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f41894r = z10;
            n();
        }
    }

    public void setBackgroundColor(int i10) {
        C3400a.o(this, Integer.valueOf(i10));
    }

    public final void setBlurRadius(float f10) {
        C3581a aVar;
        int b10 = ((int) G.f41415a.b(f10)) / 2;
        if (b10 == 0) {
            aVar = null;
        } else {
            aVar = new C3581a(2, b10);
        }
        this.f41896t = aVar;
        this.f41894r = true;
    }

    public final void setBorderColor(int i10) {
        C3400a.q(this, m.f44918b, Integer.valueOf(i10));
    }

    public final void setBorderRadius(float f10) {
        C3430x xVar;
        if (Float.isNaN(f10)) {
            xVar = null;
        } else {
            xVar = new C3430x(G.f41415a.d(f10), C3431y.POINT);
        }
        C3400a.r(this, j8.d.BORDER_RADIUS, xVar);
    }

    public final void setBorderWidth(float f10) {
        C3400a.t(this, m.f44918b, Float.valueOf(f10));
    }

    public final void setControllerListener(n6.d dVar) {
        this.f41898v = dVar;
        this.f41894r = true;
        n();
    }

    public final void setDefaultSource(String str) {
        q8.c a10 = q8.c.f47785b.a();
        Context context = getContext();
        C6496s.g(context, "getContext(...)");
        Drawable e10 = a10.e(context, str);
        if (!C6496s.c(this.f41889m, e10)) {
            this.f41889m = e10;
            this.f41894r = true;
        }
    }

    public final void setFadeDuration(int i10) {
        this.f41899w = i10;
    }

    public final void setHeaders(ReadableMap readableMap) {
        this.f41901y = readableMap;
    }

    public final void setImageSource$ReactAndroid_release(C3959a aVar) {
        this.f41887k = aVar;
    }

    public final void setLoadingIndicatorSource(String str) {
        C3953b bVar;
        q8.c a10 = q8.c.f47785b.a();
        Context context = getContext();
        C6496s.g(context, "getContext(...)");
        Drawable e10 = a10.e(context, str);
        if (e10 != null) {
            bVar = new C3953b(e10, 1000);
        } else {
            bVar = null;
        }
        if (!C6496s.c(this.f41890n, bVar)) {
            this.f41890n = bVar;
            this.f41894r = true;
        }
    }

    public final void setOverlayColor(int i10) {
        if (this.f41891o != i10) {
            this.f41891o = i10;
            this.f41894r = true;
        }
    }

    public final void setProgressiveRenderingEnabled(boolean z10) {
        this.f41900x = z10;
    }

    public final void setResizeMethod(c cVar) {
        C6496s.h(cVar, "resizeMethod");
        if (this.f41883A != cVar) {
            this.f41883A = cVar;
            this.f41894r = true;
        }
    }

    public final void setResizeMultiplier(float f10) {
        if (Math.abs((double) (this.f41902z - f10)) > 9.999999747378752E-5d) {
            this.f41902z = f10;
            this.f41894r = true;
        }
    }

    public final void setScaleType(q qVar) {
        C6496s.h(qVar, "scaleType");
        if (this.f41892p != qVar) {
            this.f41892p = qVar;
            this.f41894r = true;
        }
    }

    public final void setShouldNotifyLoadEvents(boolean z10) {
        boolean z11;
        if (this.f41897u != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            if (!z10) {
                this.f41897u = null;
            } else {
                Context context = getContext();
                C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                this.f41897u = new d(n0.c((ReactContext) context, getId()), this);
            }
            this.f41894r = true;
        }
    }

    public final void setSource(ReadableArray readableArray) {
        ReadableArray readableArray2 = readableArray;
        ArrayList arrayList = new ArrayList();
        if (readableArray2 == null || readableArray.size() == 0) {
            C3959a.C0719a aVar = C3959a.f47776f;
            Context context = getContext();
            C6496s.g(context, "getContext(...)");
            arrayList.add(aVar.a(context));
        } else {
            if (readableArray.size() == 1) {
                ReadableMap map = readableArray2.getMap(0);
                if (map != null) {
                    X7.a j10 = j(map.getString("cache"));
                    Context context2 = getContext();
                    C6496s.g(context2, "getContext(...)");
                    C3959a aVar2 = new C3959a(context2, map.getString("uri"), 0.0d, 0.0d, j10, 12, (DefaultConstructorMarker) null);
                    if (C6496s.c(Uri.EMPTY, aVar2.f())) {
                        r(map.getString("uri"));
                        C3959a.C0719a aVar3 = C3959a.f47776f;
                        Context context3 = getContext();
                        C6496s.g(context3, "getContext(...)");
                        aVar2 = aVar3.a(context3);
                    }
                    arrayList.add(aVar2);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                int size = readableArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ReadableMap map2 = readableArray2.getMap(i10);
                    if (map2 != null) {
                        X7.a j11 = j(map2.getString("cache"));
                        Context context4 = getContext();
                        C6496s.g(context4, "getContext(...)");
                        C3959a aVar4 = new C3959a(context4, map2.getString("uri"), map2.getDouble(Snapshot.WIDTH), map2.getDouble(Snapshot.HEIGHT), j11);
                        if (C6496s.c(Uri.EMPTY, aVar4.f())) {
                            r(map2.getString("uri"));
                            C3959a.C0719a aVar5 = C3959a.f47776f;
                            Context context5 = getContext();
                            C6496s.g(context5, "getContext(...)");
                            aVar4 = aVar5.a(context5);
                        }
                        arrayList.add(aVar4);
                    }
                }
            }
        }
        if (!C6496s.c(this.f41886j, arrayList)) {
            this.f41886j.clear();
            this.f41886j.addAll(arrayList);
            this.f41894r = true;
        }
    }

    public final void setTileMode(Shader.TileMode tileMode) {
        b bVar;
        C6496s.h(tileMode, "tileMode");
        if (this.f41893q != tileMode) {
            this.f41893q = tileMode;
            if (m()) {
                bVar = new b();
            } else {
                bVar = null;
            }
            this.f41895s = bVar;
            this.f41894r = true;
        }
    }
}

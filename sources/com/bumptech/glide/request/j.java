package com.bumptech.glide.request;

import V4.k;
import V4.q;
import V4.v;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import com.bumptech.glide.h;
import e5.C3495f;
import java.util.List;
import java.util.concurrent.Executor;
import l5.i;
import m5.C3776c;
import o5.g;
import o5.l;
import p5.C3932b;
import p5.C3933c;

public final class j implements d, i, i {

    /* renamed from: E  reason: collision with root package name */
    private static final boolean f39178E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A  reason: collision with root package name */
    private int f39179A;

    /* renamed from: B  reason: collision with root package name */
    private int f39180B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f39181C;

    /* renamed from: D  reason: collision with root package name */
    private RuntimeException f39182D;

    /* renamed from: a  reason: collision with root package name */
    private int f39183a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39184b;

    /* renamed from: c  reason: collision with root package name */
    private final C3933c f39185c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f39186d;

    /* renamed from: e  reason: collision with root package name */
    private final g f39187e;

    /* renamed from: f  reason: collision with root package name */
    private final e f39188f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f39189g;

    /* renamed from: h  reason: collision with root package name */
    private final e f39190h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f39191i;

    /* renamed from: j  reason: collision with root package name */
    private final Class f39192j;

    /* renamed from: k  reason: collision with root package name */
    private final a f39193k;

    /* renamed from: l  reason: collision with root package name */
    private final int f39194l;

    /* renamed from: m  reason: collision with root package name */
    private final int f39195m;

    /* renamed from: n  reason: collision with root package name */
    private final h f39196n;

    /* renamed from: o  reason: collision with root package name */
    private final l5.j f39197o;

    /* renamed from: p  reason: collision with root package name */
    private final List f39198p;

    /* renamed from: q  reason: collision with root package name */
    private final C3776c f39199q;

    /* renamed from: r  reason: collision with root package name */
    private final Executor f39200r;

    /* renamed from: s  reason: collision with root package name */
    private v f39201s;

    /* renamed from: t  reason: collision with root package name */
    private k.d f39202t;

    /* renamed from: u  reason: collision with root package name */
    private long f39203u;

    /* renamed from: v  reason: collision with root package name */
    private volatile k f39204v;

    /* renamed from: w  reason: collision with root package name */
    private a f39205w;

    /* renamed from: x  reason: collision with root package name */
    private Drawable f39206x;

    /* renamed from: y  reason: collision with root package name */
    private Drawable f39207y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable f39208z;

    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private j(Context context, e eVar, Object obj, Object obj2, Class cls, a aVar, int i10, int i11, h hVar, l5.j jVar, g gVar, List list, e eVar2, k kVar, C3776c cVar, Executor executor) {
        String str;
        if (f39178E) {
            str = String.valueOf(super.hashCode());
        } else {
            str = null;
        }
        this.f39184b = str;
        this.f39185c = C3933c.a();
        this.f39186d = obj;
        this.f39189g = context;
        this.f39190h = eVar;
        this.f39191i = obj2;
        this.f39192j = cls;
        this.f39193k = aVar;
        this.f39194l = i10;
        this.f39195m = i11;
        this.f39196n = hVar;
        this.f39197o = jVar;
        this.f39187e = gVar;
        this.f39198p = list;
        this.f39188f = eVar2;
        this.f39204v = kVar;
        this.f39199q = cVar;
        this.f39200r = executor;
        this.f39205w = a.PENDING;
        if (this.f39182D == null && eVar.g().a(d.c.class)) {
            this.f39182D = new RuntimeException("Glide request origin trace");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ac A[Catch:{ all -> 0x0093 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A(V4.v r10, java.lang.Object r11, T4.a r12, boolean r13) {
        /*
            r9 = this;
            boolean r13 = r9.s()
            com.bumptech.glide.request.j$a r0 = com.bumptech.glide.request.j.a.COMPLETE
            r9.f39205w = r0
            r9.f39201s = r10
            com.bumptech.glide.e r10 = r9.f39190h
            int r10 = r10.h()
            r0 = 3
            if (r10 > r0) goto L_0x006a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Finished loading "
            r10.append(r0)
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r10.append(r0)
            java.lang.String r0 = " from "
            r10.append(r0)
            r10.append(r12)
            java.lang.String r0 = " for "
            r10.append(r0)
            java.lang.Object r0 = r9.f39191i
            r10.append(r0)
            java.lang.String r0 = " with size ["
            r10.append(r0)
            int r0 = r9.f39179A
            r10.append(r0)
            java.lang.String r0 = "x"
            r10.append(r0)
            int r0 = r9.f39180B
            r10.append(r0)
            java.lang.String r0 = "] in "
            r10.append(r0)
            long r0 = r9.f39203u
            double r0 = o5.g.a(r0)
            r10.append(r0)
            java.lang.String r0 = " ms"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "Glide"
            android.util.Log.d(r0, r10)
        L_0x006a:
            r9.x()
            r10 = 1
            r9.f39181C = r10
            r6 = 0
            java.util.List r0 = r9.f39198p     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0095
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0093 }
            r8 = r6
        L_0x007a:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0093 }
            com.bumptech.glide.request.g r0 = (com.bumptech.glide.request.g) r0     // Catch:{ all -> 0x0093 }
            java.lang.Object r2 = r9.f39191i     // Catch:{ all -> 0x0093 }
            l5.j r3 = r9.f39197o     // Catch:{ all -> 0x0093 }
            r1 = r11
            r4 = r12
            r5 = r13
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0093 }
            r8 = r8 | r0
            goto L_0x007a
        L_0x0093:
            r10 = move-exception
            goto L_0x00c1
        L_0x0095:
            r8 = r6
        L_0x0096:
            com.bumptech.glide.request.g r0 = r9.f39187e     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r2 = r9.f39191i     // Catch:{ all -> 0x0093 }
            l5.j r3 = r9.f39197o     // Catch:{ all -> 0x0093 }
            r1 = r11
            r4 = r12
            r5 = r13
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r10 = r6
        L_0x00a9:
            r10 = r10 | r8
            if (r10 != 0) goto L_0x00b7
            m5.c r10 = r9.f39199q     // Catch:{ all -> 0x0093 }
            m5.b r10 = r10.a(r12, r13)     // Catch:{ all -> 0x0093 }
            l5.j r12 = r9.f39197o     // Catch:{ all -> 0x0093 }
            r12.h(r11, r10)     // Catch:{ all -> 0x0093 }
        L_0x00b7:
            r9.f39181C = r6
            java.lang.String r10 = "GlideRequest"
            int r11 = r9.f39183a
            p5.C3932b.f(r10, r11)
            return
        L_0x00c1:
            r9.f39181C = r6
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.j.A(V4.v, java.lang.Object, T4.a, boolean):void");
    }

    private void B() {
        Drawable drawable;
        if (l()) {
            if (this.f39191i == null) {
                drawable = q();
            } else {
                drawable = null;
            }
            if (drawable == null) {
                drawable = p();
            }
            if (drawable == null) {
                drawable = r();
            }
            this.f39197o.g(drawable);
        }
    }

    private void j() {
        if (this.f39181C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean k() {
        e eVar = this.f39188f;
        if (eVar == null || eVar.j(this)) {
            return true;
        }
        return false;
    }

    private boolean l() {
        e eVar = this.f39188f;
        if (eVar == null || eVar.a(this)) {
            return true;
        }
        return false;
    }

    private boolean m() {
        e eVar = this.f39188f;
        if (eVar == null || eVar.c(this)) {
            return true;
        }
        return false;
    }

    private void n() {
        j();
        this.f39185c.c();
        this.f39197o.b(this);
        k.d dVar = this.f39202t;
        if (dVar != null) {
            dVar.a();
            this.f39202t = null;
        }
    }

    private void o(Object obj) {
        List<g> list = this.f39198p;
        if (list != null) {
            for (g gVar : list) {
            }
        }
    }

    private Drawable p() {
        if (this.f39206x == null) {
            Drawable errorPlaceholder = this.f39193k.getErrorPlaceholder();
            this.f39206x = errorPlaceholder;
            if (errorPlaceholder == null && this.f39193k.getErrorId() > 0) {
                this.f39206x = t(this.f39193k.getErrorId());
            }
        }
        return this.f39206x;
    }

    private Drawable q() {
        if (this.f39208z == null) {
            Drawable fallbackDrawable = this.f39193k.getFallbackDrawable();
            this.f39208z = fallbackDrawable;
            if (fallbackDrawable == null && this.f39193k.getFallbackId() > 0) {
                this.f39208z = t(this.f39193k.getFallbackId());
            }
        }
        return this.f39208z;
    }

    private Drawable r() {
        if (this.f39207y == null) {
            Drawable placeholderDrawable = this.f39193k.getPlaceholderDrawable();
            this.f39207y = placeholderDrawable;
            if (placeholderDrawable == null && this.f39193k.getPlaceholderId() > 0) {
                this.f39207y = t(this.f39193k.getPlaceholderId());
            }
        }
        return this.f39207y;
    }

    private boolean s() {
        e eVar = this.f39188f;
        if (eVar == null || !eVar.getRoot().b()) {
            return true;
        }
        return false;
    }

    private Drawable t(int i10) {
        Resources.Theme theme;
        if (this.f39193k.getTheme() != null) {
            theme = this.f39193k.getTheme();
        } else {
            theme = this.f39189g.getTheme();
        }
        return C3495f.a(this.f39189g, i10, theme);
    }

    private void u(String str) {
        Log.v("GlideRequest", str + " this: " + this.f39184b);
    }

    private static int v(int i10, float f10) {
        if (i10 == Integer.MIN_VALUE) {
            return i10;
        }
        return Math.round(f10 * ((float) i10));
    }

    private void w() {
        e eVar = this.f39188f;
        if (eVar != null) {
            eVar.d(this);
        }
    }

    private void x() {
        e eVar = this.f39188f;
        if (eVar != null) {
            eVar.f(this);
        }
    }

    public static j y(Context context, e eVar, Object obj, Object obj2, Class cls, a aVar, int i10, int i11, h hVar, l5.j jVar, g gVar, List list, e eVar2, k kVar, C3776c cVar, Executor executor) {
        return new j(context, eVar, obj, obj2, cls, aVar, i10, i11, hVar, jVar, gVar, list, eVar2, kVar, cVar, executor);
    }

    private void z(q qVar, int i10) {
        boolean z10;
        this.f39185c.c();
        synchronized (this.f39186d) {
            try {
                qVar.k(this.f39182D);
                int h10 = this.f39190h.h();
                if (h10 <= i10) {
                    Log.w("Glide", "Load failed for [" + this.f39191i + "] with dimensions [" + this.f39179A + "x" + this.f39180B + "]", qVar);
                    if (h10 <= 4) {
                        qVar.g("Glide");
                    }
                }
                this.f39202t = null;
                this.f39205w = a.FAILED;
                w();
                boolean z11 = true;
                this.f39181C = true;
                List<g> list = this.f39198p;
                if (list != null) {
                    z10 = false;
                    for (g onLoadFailed : list) {
                        z10 |= onLoadFailed.onLoadFailed(qVar, this.f39191i, this.f39197o, s());
                    }
                } else {
                    z10 = false;
                }
                g gVar = this.f39187e;
                if (gVar == null || !gVar.onLoadFailed(qVar, this.f39191i, this.f39197o, s())) {
                    z11 = false;
                }
                if (!z10 && !z11) {
                    B();
                }
                this.f39181C = false;
                C3932b.f("GlideRequest", this.f39183a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(v vVar, T4.a aVar, boolean z10) {
        Object obj;
        String str;
        this.f39185c.c();
        v vVar2 = null;
        try {
            synchronized (this.f39186d) {
                try {
                    this.f39202t = null;
                    if (vVar == null) {
                        c(new q("Expected to receive a Resource<R> with an object of " + this.f39192j + " inside, but instead got null."));
                        return;
                    }
                    Object obj2 = vVar.get();
                    if (obj2 != null) {
                        if (this.f39192j.isAssignableFrom(obj2.getClass())) {
                            if (!m()) {
                                try {
                                    this.f39201s = null;
                                    this.f39205w = a.COMPLETE;
                                    C3932b.f("GlideRequest", this.f39183a);
                                    this.f39204v.l(vVar);
                                    return;
                                } catch (Throwable th2) {
                                    vVar2 = vVar;
                                    th = th2;
                                    throw th;
                                }
                            } else {
                                A(vVar, obj2, aVar, z10);
                                return;
                            }
                        }
                    }
                    this.f39201s = null;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Expected to receive an object of ");
                    sb2.append(this.f39192j);
                    sb2.append(" but instead got ");
                    if (obj2 != null) {
                        obj = obj2.getClass();
                    } else {
                        obj = "";
                    }
                    sb2.append(obj);
                    sb2.append("{");
                    sb2.append(obj2);
                    sb2.append("} inside Resource{");
                    sb2.append(vVar);
                    sb2.append("}.");
                    if (obj2 != null) {
                        str = "";
                    } else {
                        str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                    }
                    sb2.append(str);
                    c(new q(sb2.toString()));
                    this.f39204v.l(vVar);
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        } catch (Throwable th4) {
            if (vVar2 != null) {
                this.f39204v.l(vVar2);
            }
            throw th4;
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f39186d) {
            if (this.f39205w == a.COMPLETE) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public void c(q qVar) {
        z(qVar, 5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        r5.f39204v.l(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f39186d
            monitor-enter(r0)
            r5.j()     // Catch:{ all -> 0x0013 }
            p5.c r1 = r5.f39185c     // Catch:{ all -> 0x0013 }
            r1.c()     // Catch:{ all -> 0x0013 }
            com.bumptech.glide.request.j$a r1 = r5.f39205w     // Catch:{ all -> 0x0013 }
            com.bumptech.glide.request.j$a r2 = com.bumptech.glide.request.j.a.CLEARED     // Catch:{ all -> 0x0013 }
            if (r1 != r2) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return
        L_0x0013:
            r1 = move-exception
            goto L_0x0042
        L_0x0015:
            r5.n()     // Catch:{ all -> 0x0013 }
            V4.v r1 = r5.f39201s     // Catch:{ all -> 0x0013 }
            r3 = 0
            if (r1 == 0) goto L_0x0020
            r5.f39201s = r3     // Catch:{ all -> 0x0013 }
            goto L_0x0021
        L_0x0020:
            r1 = r3
        L_0x0021:
            boolean r3 = r5.k()     // Catch:{ all -> 0x0013 }
            if (r3 == 0) goto L_0x0030
            l5.j r3 = r5.f39197o     // Catch:{ all -> 0x0013 }
            android.graphics.drawable.Drawable r4 = r5.r()     // Catch:{ all -> 0x0013 }
            r3.d(r4)     // Catch:{ all -> 0x0013 }
        L_0x0030:
            java.lang.String r3 = "GlideRequest"
            int r4 = r5.f39183a     // Catch:{ all -> 0x0013 }
            p5.C3932b.f(r3, r4)     // Catch:{ all -> 0x0013 }
            r5.f39205w = r2     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            if (r1 == 0) goto L_0x0041
            V4.k r0 = r5.f39204v
            r0.l(r1)
        L_0x0041:
            return
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.j.clear():void");
    }

    public void d(int i10, int i11) {
        Object obj;
        this.f39185c.c();
        Object obj2 = this.f39186d;
        synchronized (obj2) {
            try {
                boolean z10 = f39178E;
                if (z10) {
                    u("Got onSizeReady in " + g.a(this.f39203u));
                }
                if (this.f39205w == a.WAITING_FOR_SIZE) {
                    a aVar = a.RUNNING;
                    this.f39205w = aVar;
                    float sizeMultiplier = this.f39193k.getSizeMultiplier();
                    this.f39179A = v(i10, sizeMultiplier);
                    this.f39180B = v(i11, sizeMultiplier);
                    if (z10) {
                        u("finished setup for calling load in " + g.a(this.f39203u));
                    }
                    a aVar2 = aVar;
                    boolean z11 = z10;
                    a aVar3 = aVar2;
                    obj = obj2;
                    try {
                        this.f39202t = this.f39204v.g(this.f39190h, this.f39191i, this.f39193k.getSignature(), this.f39179A, this.f39180B, this.f39193k.getResourceClass(), this.f39192j, this.f39196n, this.f39193k.getDiskCacheStrategy(), this.f39193k.getTransformations(), this.f39193k.isTransformationRequired(), this.f39193k.isScaleOnlyOrNoTransform(), this.f39193k.getOptions(), this.f39193k.isMemoryCacheable(), this.f39193k.getUseUnlimitedSourceGeneratorsPool(), this.f39193k.getUseAnimationPool(), this.f39193k.getOnlyRetrieveFromCache(), this, this.f39200r);
                        if (this.f39205w != aVar3) {
                            this.f39202t = null;
                        }
                        if (z11) {
                            u("finished onSizeReady in " + g.a(this.f39203u));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
                throw th;
            }
        }
    }

    public boolean e() {
        boolean z10;
        synchronized (this.f39186d) {
            if (this.f39205w == a.CLEARED) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public Object f() {
        this.f39185c.c();
        return this.f39186d;
    }

    public boolean g() {
        boolean z10;
        synchronized (this.f39186d) {
            if (this.f39205w == a.COMPLETE) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean h(d dVar) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        a aVar;
        h hVar;
        int i12;
        int i13;
        int i14;
        Object obj2;
        Class cls2;
        a aVar2;
        h hVar2;
        int i15;
        d dVar2 = dVar;
        if (!(dVar2 instanceof j)) {
            return false;
        }
        synchronized (this.f39186d) {
            try {
                i10 = this.f39194l;
                i11 = this.f39195m;
                obj = this.f39191i;
                cls = this.f39192j;
                aVar = this.f39193k;
                hVar = this.f39196n;
                List list = this.f39198p;
                if (list != null) {
                    i12 = list.size();
                } else {
                    i12 = 0;
                }
            } finally {
                while (true) {
                }
            }
        }
        j jVar = (j) dVar2;
        synchronized (jVar.f39186d) {
            try {
                i13 = jVar.f39194l;
                i14 = jVar.f39195m;
                obj2 = jVar.f39191i;
                cls2 = jVar.f39192j;
                aVar2 = jVar.f39193k;
                hVar2 = jVar.f39196n;
                List list2 = jVar.f39198p;
                if (list2 != null) {
                    i15 = list2.size();
                } else {
                    i15 = 0;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (i10 == i13 && i11 == i14 && l.d(obj, obj2) && cls.equals(cls2) && l.c(aVar, aVar2) && hVar == hVar2 && i12 == i15) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ae, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f39186d
            monitor-enter(r0)
            r5.j()     // Catch:{ all -> 0x0028 }
            p5.c r1 = r5.f39185c     // Catch:{ all -> 0x0028 }
            r1.c()     // Catch:{ all -> 0x0028 }
            long r1 = o5.g.b()     // Catch:{ all -> 0x0028 }
            r5.f39203u = r1     // Catch:{ all -> 0x0028 }
            java.lang.Object r1 = r5.f39191i     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0040
            int r1 = r5.f39194l     // Catch:{ all -> 0x0028 }
            int r2 = r5.f39195m     // Catch:{ all -> 0x0028 }
            boolean r1 = o5.l.u(r1, r2)     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x002b
            int r1 = r5.f39194l     // Catch:{ all -> 0x0028 }
            r5.f39179A = r1     // Catch:{ all -> 0x0028 }
            int r1 = r5.f39195m     // Catch:{ all -> 0x0028 }
            r5.f39180B = r1     // Catch:{ all -> 0x0028 }
            goto L_0x002b
        L_0x0028:
            r1 = move-exception
            goto L_0x00b7
        L_0x002b:
            android.graphics.drawable.Drawable r1 = r5.q()     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0033
            r1 = 5
            goto L_0x0034
        L_0x0033:
            r1 = 3
        L_0x0034:
            V4.q r2 = new V4.q     // Catch:{ all -> 0x0028 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x0028 }
            r5.z(r2, r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0040:
            com.bumptech.glide.request.j$a r2 = r5.f39205w     // Catch:{ all -> 0x0028 }
            com.bumptech.glide.request.j$a r3 = com.bumptech.glide.request.j.a.RUNNING     // Catch:{ all -> 0x0028 }
            if (r2 == r3) goto L_0x00af
            com.bumptech.glide.request.j$a r4 = com.bumptech.glide.request.j.a.COMPLETE     // Catch:{ all -> 0x0028 }
            if (r2 != r4) goto L_0x0054
            V4.v r1 = r5.f39201s     // Catch:{ all -> 0x0028 }
            T4.a r2 = T4.a.MEMORY_CACHE     // Catch:{ all -> 0x0028 }
            r3 = 0
            r5.a(r1, r2, r3)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0054:
            r5.o(r1)     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "GlideRequest"
            int r1 = p5.C3932b.b(r1)     // Catch:{ all -> 0x0028 }
            r5.f39183a = r1     // Catch:{ all -> 0x0028 }
            com.bumptech.glide.request.j$a r1 = com.bumptech.glide.request.j.a.WAITING_FOR_SIZE     // Catch:{ all -> 0x0028 }
            r5.f39205w = r1     // Catch:{ all -> 0x0028 }
            int r2 = r5.f39194l     // Catch:{ all -> 0x0028 }
            int r4 = r5.f39195m     // Catch:{ all -> 0x0028 }
            boolean r2 = o5.l.u(r2, r4)     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0075
            int r2 = r5.f39194l     // Catch:{ all -> 0x0028 }
            int r4 = r5.f39195m     // Catch:{ all -> 0x0028 }
            r5.d(r2, r4)     // Catch:{ all -> 0x0028 }
            goto L_0x007a
        L_0x0075:
            l5.j r2 = r5.f39197o     // Catch:{ all -> 0x0028 }
            r2.i(r5)     // Catch:{ all -> 0x0028 }
        L_0x007a:
            com.bumptech.glide.request.j$a r2 = r5.f39205w     // Catch:{ all -> 0x0028 }
            if (r2 == r3) goto L_0x0080
            if (r2 != r1) goto L_0x008f
        L_0x0080:
            boolean r1 = r5.l()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x008f
            l5.j r1 = r5.f39197o     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable r2 = r5.r()     // Catch:{ all -> 0x0028 }
            r1.c(r2)     // Catch:{ all -> 0x0028 }
        L_0x008f:
            boolean r1 = f39178E     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x00ad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r1.<init>()     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x0028 }
            long r2 = r5.f39203u     // Catch:{ all -> 0x0028 }
            double r2 = o5.g.a(r2)     // Catch:{ all -> 0x0028 }
            r1.append(r2)     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0028 }
            r5.u(r1)     // Catch:{ all -> 0x0028 }
        L_0x00ad:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x00af:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x0028 }
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x00b7:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.j.i():void");
    }

    public boolean isRunning() {
        boolean z10;
        synchronized (this.f39186d) {
            try {
                a aVar = this.f39205w;
                if (aVar != a.RUNNING) {
                    if (aVar != a.WAITING_FOR_SIZE) {
                        z10 = false;
                    }
                }
                z10 = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void pause() {
        synchronized (this.f39186d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f39186d) {
            obj = this.f39191i;
            cls = this.f39192j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}

package X6;

import T5.l;
import T5.n;
import V6.j;
import V6.k;
import V6.x;
import android.net.Uri;
import android.os.StrictMode;
import b6.f;
import com.facebook.imagepipeline.producers.F;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.l0;
import com.facebook.imagepipeline.producers.p0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import d6.C3477c;
import d6.C3478d;
import e7.c;
import e7.d;
import e7.e;
import i7.C3593b;
import i7.C3594c;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;

/* renamed from: X6.t  reason: case insensitive filesystem */
public final class C3096t {

    /* renamed from: n  reason: collision with root package name */
    public static final a f35168n = new a((DefaultConstructorMarker) null);

    /* renamed from: o  reason: collision with root package name */
    private static final CancellationException f35169o = new CancellationException("Prefetching is not enabled");

    /* renamed from: p  reason: collision with root package name */
    private static final CancellationException f35170p = new CancellationException("ImageRequest is null");

    /* renamed from: q  reason: collision with root package name */
    private static final CancellationException f35171q = new CancellationException("Modified URL is null");

    /* renamed from: a  reason: collision with root package name */
    private final V f35172a;

    /* renamed from: b  reason: collision with root package name */
    private final n f35173b;

    /* renamed from: c  reason: collision with root package name */
    private final n f35174c;

    /* renamed from: d  reason: collision with root package name */
    private final e f35175d;

    /* renamed from: e  reason: collision with root package name */
    private final d f35176e;

    /* renamed from: f  reason: collision with root package name */
    private final x f35177f;

    /* renamed from: g  reason: collision with root package name */
    private final x f35178g;

    /* renamed from: h  reason: collision with root package name */
    private final k f35179h;

    /* renamed from: i  reason: collision with root package name */
    private final p0 f35180i;

    /* renamed from: j  reason: collision with root package name */
    private final n f35181j;

    /* renamed from: k  reason: collision with root package name */
    private final AtomicLong f35182k = new AtomicLong();

    /* renamed from: l  reason: collision with root package name */
    private final n f35183l;

    /* renamed from: m  reason: collision with root package name */
    private final C3098v f35184m;

    /* renamed from: X6.t$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: X6.t$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f35185a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                i7.b$b[] r0 = i7.C3593b.C0681b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                i7.b$b r1 = i7.C3593b.C0681b.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                i7.b$b r1 = i7.C3593b.C0681b.SMALL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                i7.b$b r1 = i7.C3593b.C0681b.DYNAMIC     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f35185a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X6.C3096t.b.<clinit>():void");
        }
    }

    public C3096t(V v10, Set set, Set set2, n nVar, x xVar, x xVar2, n nVar2, k kVar, p0 p0Var, n nVar3, n nVar4, O5.a aVar, C3098v vVar) {
        C6496s.h(v10, "producerSequenceFactory");
        C6496s.h(set, "requestListeners");
        C6496s.h(set2, "requestListener2s");
        C6496s.h(nVar, "isPrefetchEnabledSupplier");
        C6496s.h(xVar, "bitmapMemoryCache");
        C6496s.h(xVar2, "encodedMemoryCache");
        C6496s.h(nVar2, "diskCachesStoreSupplier");
        C6496s.h(kVar, "cacheKeyFactory");
        C6496s.h(p0Var, "threadHandoffProducerQueue");
        C6496s.h(nVar3, "suppressBitmapPrefetchingSupplier");
        C6496s.h(nVar4, "lazyDataSource");
        C6496s.h(vVar, "config");
        this.f35172a = v10;
        this.f35173b = nVar;
        this.f35174c = nVar2;
        this.f35175d = new c(set);
        this.f35176e = new e7.b(set2);
        this.f35177f = xVar;
        this.f35178g = xVar2;
        this.f35179h = kVar;
        this.f35180i = p0Var;
        this.f35181j = nVar3;
        this.f35183l = nVar4;
        this.f35184m = vVar;
    }

    /* access modifiers changed from: private */
    public static final boolean A(Uri uri, M5.d dVar) {
        C6496s.h(uri, "$uri");
        C6496s.h(dVar, SubscriberAttributeKt.JSON_NAME_KEY);
        return dVar.b(uri);
    }

    private final C3477c D(d0 d0Var, C3593b bVar, C3593b.c cVar, Object obj, e eVar, String str) {
        return E(d0Var, bVar, cVar, obj, eVar, str, (Map) null);
    }

    private final C3477c E(d0 d0Var, C3593b bVar, C3593b.c cVar, Object obj, e eVar, String str, Map map) {
        C3477c cVar2;
        boolean z10;
        boolean z11;
        d0 d0Var2 = d0Var;
        C3593b bVar2 = bVar;
        C3593b.c cVar3 = cVar;
        e eVar2 = eVar;
        Map map2 = map;
        if (!j7.b.d()) {
            F f10 = new F(s(bVar2, eVar2), this.f35176e);
            try {
                C3593b.c a10 = C3593b.c.a(bVar.k(), cVar3);
                C6496s.g(a10, "getMax(...)");
                String p10 = p();
                if (!bVar.p()) {
                    if (f.n(bVar.v())) {
                        z11 = false;
                        l0 l0Var = new l0(bVar, p10, str, f10, obj, a10, false, z11, bVar.o(), this.f35184m);
                        l0Var.I(map2);
                        return Y6.c.H(d0Var2, l0Var, f10);
                    }
                }
                z11 = true;
                l0 l0Var2 = new l0(bVar, p10, str, f10, obj, a10, false, z11, bVar.o(), this.f35184m);
                l0Var2.I(map2);
                return Y6.c.H(d0Var2, l0Var2, f10);
            } catch (Exception e10) {
                return C3478d.b(e10);
            }
        } else {
            j7.b.a("ImagePipeline#submitFetchRequest");
            try {
                F f11 = new F(s(bVar2, eVar2), this.f35176e);
                C3593b.c a11 = C3593b.c.a(bVar.k(), cVar3);
                C6496s.g(a11, "getMax(...)");
                String p11 = p();
                if (!bVar.p()) {
                    if (f.n(bVar.v())) {
                        z10 = false;
                        l0 l0Var3 = new l0(bVar, p11, str, f11, obj, a11, false, z10, bVar.o(), this.f35184m);
                        l0Var3.I(map2);
                        cVar2 = Y6.c.H(d0Var2, l0Var3, f11);
                        j7.b.b();
                        return cVar2;
                    }
                }
                z10 = true;
                l0 l0Var32 = new l0(bVar, p11, str, f11, obj, a11, false, z10, bVar.o(), this.f35184m);
                l0Var32.I(map2);
                cVar2 = Y6.c.H(d0Var2, l0Var32, f11);
            } catch (Exception e11) {
                cVar2 = C3478d.b(e11);
            } catch (Throwable th2) {
                j7.b.b();
                throw th2;
            }
            j7.b.b();
            return cVar2;
        }
    }

    private final C3477c F(d0 d0Var, C3593b bVar, C3593b.c cVar, Object obj, W6.f fVar, e eVar) {
        boolean z10;
        C3593b bVar2 = bVar;
        F f10 = new F(s(bVar, eVar), this.f35176e);
        Uri v10 = bVar.v();
        C6496s.g(v10, "getSourceUri(...)");
        Uri a10 = H6.b.f31711b.a(v10, obj);
        if (a10 == null) {
            C3477c b10 = C3478d.b(f35171q);
            C6496s.g(b10, "immediateFailedDataSource(...)");
            return b10;
        }
        if (!C6496s.c(v10, a10)) {
            bVar2 = C3594c.b(bVar).R(a10).a();
        }
        C3593b bVar3 = bVar2;
        try {
            C3593b.c a11 = C3593b.c.a(bVar3.k(), cVar);
            C6496s.g(a11, "getMax(...)");
            String p10 = p();
            w G10 = this.f35184m.G();
            if (G10 == null || !G10.b() || !bVar3.p()) {
                z10 = false;
            } else {
                z10 = true;
            }
            l0 l0Var = new l0(bVar3, p10, f10, obj, a11, true, z10, fVar, this.f35184m);
            d0 d0Var2 = d0Var;
            return Y6.d.f35682j.a(d0Var, l0Var, f10);
        } catch (Exception e10) {
            return C3478d.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public static final boolean f(M5.d dVar) {
        C6496s.h(dVar, "it");
        return true;
    }

    public static /* synthetic */ C3477c n(C3096t tVar, C3593b bVar, Object obj, C3593b.c cVar, e eVar, String str, int i10, Object obj2) {
        C3593b.c cVar2;
        e eVar2;
        String str2;
        if ((i10 & 4) != 0) {
            cVar2 = null;
        } else {
            cVar2 = cVar;
        }
        if ((i10 & 8) != 0) {
            eVar2 = null;
        } else {
            eVar2 = eVar;
        }
        if ((i10 & 16) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        return tVar.m(bVar, obj, cVar2, eVar2, str2);
    }

    private final boolean y(C3593b bVar) {
        Object obj = this.f35174c.get();
        C6496s.g(obj, "get(...)");
        C3080c cVar = (C3080c) obj;
        M5.d d10 = this.f35179h.d(bVar, (Object) null);
        String f10 = bVar.f();
        if (f10 != null) {
            j jVar = (j) cVar.c().get(f10);
            if (jVar == null) {
                return false;
            }
            C6496s.e(d10);
            return jVar.k(d10);
        }
        for (Map.Entry value : cVar.c().entrySet()) {
            C6496s.e(d10);
            if (((j) value.getValue()).k(d10)) {
                return true;
            }
        }
        return false;
    }

    private final l z(Uri uri) {
        return new r(uri);
    }

    public final C3477c B(C3593b bVar, Object obj) {
        return C(bVar, obj, W6.f.MEDIUM, (e) null);
    }

    public final C3477c C(C3593b bVar, Object obj, W6.f fVar, e eVar) {
        C6496s.h(fVar, "priority");
        if (!((Boolean) this.f35173b.get()).booleanValue()) {
            C3477c b10 = C3478d.b(f35169o);
            C6496s.g(b10, "immediateFailedDataSource(...)");
            return b10;
        } else if (bVar == null) {
            C3477c b11 = C3478d.b(new NullPointerException("imageRequest is null"));
            C6496s.e(b11);
            return b11;
        } else {
            try {
                return F(this.f35172a.G(bVar), bVar, C3593b.c.FULL_FETCH, obj, fVar, eVar);
            } catch (Exception e10) {
                return C3478d.b(e10);
            }
        }
    }

    public final void c() {
        e();
        d();
    }

    public final void d() {
        Object obj = this.f35174c.get();
        C6496s.g(obj, "get(...)");
        C3080c cVar = (C3080c) obj;
        cVar.b().h();
        cVar.a().h();
        for (Map.Entry value : cVar.c().entrySet()) {
            ((j) value.getValue()).h();
        }
    }

    public final void e() {
        C3095s sVar = new C3095s();
        this.f35177f.g(sVar);
        this.f35178g.g(sVar);
    }

    public final void g(Uri uri) {
        C6496s.h(uri, "uri");
        j(uri);
        h(uri);
    }

    public final void h(Uri uri) {
        C3593b a10 = C3593b.a(uri);
        if (a10 != null) {
            i(a10);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void i(C3593b bVar) {
        if (bVar != null) {
            M5.d d10 = this.f35179h.d(bVar, (Object) null);
            Object obj = this.f35174c.get();
            C6496s.g(obj, "get(...)");
            C3080c cVar = (C3080c) obj;
            j b10 = cVar.b();
            C6496s.e(d10);
            b10.s(d10);
            cVar.a().s(d10);
            for (Map.Entry value : cVar.c().entrySet()) {
                ((j) value.getValue()).s(d10);
            }
        }
    }

    public final void j(Uri uri) {
        C6496s.h(uri, "uri");
        l z10 = z(uri);
        this.f35177f.g(z10);
        this.f35178g.g(z10);
    }

    public final C3477c k(C3593b bVar, Object obj) {
        return n(this, bVar, obj, (C3593b.c) null, (e) null, (String) null, 24, (Object) null);
    }

    public final C3477c l(C3593b bVar, Object obj, C3593b.c cVar) {
        C6496s.h(cVar, "lowestPermittedRequestLevelOnSubmit");
        return n(this, bVar, obj, cVar, (e) null, (String) null, 16, (Object) null);
    }

    public final C3477c m(C3593b bVar, Object obj, C3593b.c cVar, e eVar, String str) {
        if (bVar == null) {
            C3477c b10 = C3478d.b(new NullPointerException());
            C6496s.g(b10, "immediateFailedDataSource(...)");
            return b10;
        }
        try {
            d0 E10 = this.f35172a.E(bVar);
            if (cVar == null) {
                cVar = C3593b.c.FULL_FETCH;
            }
            return D(E10, bVar, cVar, obj, eVar, str);
        } catch (Exception e10) {
            return C3478d.b(e10);
        }
    }

    public final C3477c o(C3593b bVar, Object obj) {
        C6496s.h(bVar, "imageRequest");
        return l(bVar, obj, C3593b.c.BITMAP_MEMORY_CACHE);
    }

    public final String p() {
        return String.valueOf(this.f35182k.getAndIncrement());
    }

    public final x q() {
        return this.f35177f;
    }

    public final k r() {
        return this.f35179h;
    }

    public final e s(C3593b bVar, e eVar) {
        if (bVar == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (eVar == null) {
            if (bVar.q() == null) {
                return this.f35175d;
            }
            return new c(this.f35175d, bVar.q());
        } else if (bVar.q() == null) {
            return new c(this.f35175d, eVar);
        } else {
            return new c(this.f35175d, eVar, bVar.q());
        }
    }

    public final boolean t(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f35177f.d(z(uri));
    }

    public final boolean u(C3593b bVar) {
        if (bVar == null) {
            return false;
        }
        M5.d a10 = this.f35179h.a(bVar, (Object) null);
        x xVar = this.f35177f;
        C6496s.e(a10);
        X5.a aVar = xVar.get(a10);
        try {
            return X5.a.T(aVar);
        } finally {
            X5.a.E(aVar);
        }
    }

    public final boolean v(Uri uri) {
        if (w(uri, C3593b.C0681b.SMALL) || w(uri, C3593b.C0681b.DEFAULT) || w(uri, C3593b.C0681b.DYNAMIC)) {
            return true;
        }
        return false;
    }

    public final boolean w(Uri uri, C3593b.C0681b bVar) {
        C3593b a10 = C3594c.x(uri).A(bVar).a();
        C6496s.e(a10);
        return x(a10);
    }

    public final boolean x(C3593b bVar) {
        boolean z10;
        C6496s.h(bVar, "imageRequest");
        Object obj = this.f35174c.get();
        C6496s.g(obj, "get(...)");
        C3080c cVar = (C3080c) obj;
        M5.d d10 = this.f35179h.d(bVar, (Object) null);
        C3593b.C0681b c10 = bVar.c();
        C6496s.g(c10, "getCacheChoice(...)");
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            int i10 = b.f35185a[c10.ordinal()];
            if (i10 == 1) {
                j b10 = cVar.b();
                C6496s.e(d10);
                z10 = b10.k(d10);
            } else if (i10 == 2) {
                j a10 = cVar.a();
                C6496s.e(d10);
                z10 = a10.k(d10);
            } else if (i10 == 3) {
                z10 = y(bVar);
            } else {
                throw new C6535s();
            }
            return z10;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}

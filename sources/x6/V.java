package X6;

import T5.k;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.c;
import com.facebook.imagepipeline.producers.A;
import com.facebook.imagepipeline.producers.C3295a;
import com.facebook.imagepipeline.producers.C3301g;
import com.facebook.imagepipeline.producers.C3302h;
import com.facebook.imagepipeline.producers.C3303i;
import com.facebook.imagepipeline.producers.C3305k;
import com.facebook.imagepipeline.producers.C3306l;
import com.facebook.imagepipeline.producers.C3309o;
import com.facebook.imagepipeline.producers.C3310p;
import com.facebook.imagepipeline.producers.C3312s;
import com.facebook.imagepipeline.producers.C3315v;
import com.facebook.imagepipeline.producers.C3316w;
import com.facebook.imagepipeline.producers.C3318y;
import com.facebook.imagepipeline.producers.H;
import com.facebook.imagepipeline.producers.I;
import com.facebook.imagepipeline.producers.M;
import com.facebook.imagepipeline.producers.N;
import com.facebook.imagepipeline.producers.S;
import com.facebook.imagepipeline.producers.T;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.Y;
import com.facebook.imagepipeline.producers.b0;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.j0;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.n0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.r0;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.imagepipeline.producers.u0;
import i7.C3593b;
import j7.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import k7.d;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;

public final class V {

    /* renamed from: K  reason: collision with root package name */
    public static final a f35089K = new a((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    private final Lazy f35090A = C6531o.b(new J(this));

    /* renamed from: B  reason: collision with root package name */
    private final Lazy f35091B = C6531o.b(new K(this));

    /* renamed from: C  reason: collision with root package name */
    private final Lazy f35092C = C6531o.b(new L(this));

    /* renamed from: D  reason: collision with root package name */
    private final Lazy f35093D = C6531o.b(new M(this));

    /* renamed from: E  reason: collision with root package name */
    private final Lazy f35094E = C6531o.b(new N(this));

    /* renamed from: F  reason: collision with root package name */
    private final Lazy f35095F = C6531o.b(new O(this));

    /* renamed from: G  reason: collision with root package name */
    private final Lazy f35096G = C6531o.b(new P(this));

    /* renamed from: H  reason: collision with root package name */
    private final Lazy f35097H = C6531o.b(new Q(this));

    /* renamed from: I  reason: collision with root package name */
    private final Lazy f35098I = C6531o.b(new S(this));

    /* renamed from: J  reason: collision with root package name */
    private final Lazy f35099J = C6531o.b(new T(this));

    /* renamed from: a  reason: collision with root package name */
    private final ContentResolver f35100a;

    /* renamed from: b  reason: collision with root package name */
    private final B f35101b;

    /* renamed from: c  reason: collision with root package name */
    private final X f35102c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f35103d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f35104e;

    /* renamed from: f  reason: collision with root package name */
    private final p0 f35105f;

    /* renamed from: g  reason: collision with root package name */
    private final C3091n f35106g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f35107h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f35108i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f35109j;

    /* renamed from: k  reason: collision with root package name */
    private final d f35110k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f35111l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f35112m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f35113n;

    /* renamed from: o  reason: collision with root package name */
    private final Set f35114o;

    /* renamed from: p  reason: collision with root package name */
    private Map f35115p = new LinkedHashMap();

    /* renamed from: q  reason: collision with root package name */
    private Map f35116q = new LinkedHashMap();

    /* renamed from: r  reason: collision with root package name */
    private Map f35117r = new LinkedHashMap();

    /* renamed from: s  reason: collision with root package name */
    private final Lazy f35118s = C6531o.b(new C(this));

    /* renamed from: t  reason: collision with root package name */
    private final Lazy f35119t = C6531o.b(new U(this));

    /* renamed from: u  reason: collision with root package name */
    private final Lazy f35120u = C6531o.b(new D(this));

    /* renamed from: v  reason: collision with root package name */
    private final Lazy f35121v = C6531o.b(new E(this));

    /* renamed from: w  reason: collision with root package name */
    private final Lazy f35122w = C6531o.b(new F(this));

    /* renamed from: x  reason: collision with root package name */
    private final Lazy f35123x = C6531o.b(new G(this));

    /* renamed from: y  reason: collision with root package name */
    private final Lazy f35124y = C6531o.b(new H(this));

    /* renamed from: z  reason: collision with root package name */
    private final Lazy f35125z = C6531o.b(new I(this));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String c(Uri uri) {
            String uri2 = uri.toString();
            C6496s.g(uri2, "toString(...)");
            if (uri2.length() <= 30) {
                return uri2;
            }
            String substring = uri2.substring(0, 30);
            C6496s.g(substring, "substring(...)");
            return substring + "...";
        }

        /* access modifiers changed from: private */
        public final void d(C3593b bVar) {
            boolean z10;
            if (bVar.k().b() <= C3593b.c.ENCODED_MEMORY_CACHE.b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            k.b(Boolean.valueOf(z10));
        }

        private a() {
        }
    }

    public V(ContentResolver contentResolver, B b10, X x10, boolean z10, boolean z11, p0 p0Var, C3091n nVar, boolean z12, boolean z13, boolean z14, d dVar, boolean z15, boolean z16, boolean z17, Set set) {
        d dVar2 = dVar;
        C6496s.h(contentResolver, "contentResolver");
        C6496s.h(b10, "producerFactory");
        C6496s.h(x10, "networkFetcher");
        C6496s.h(p0Var, "threadHandoffProducerQueue");
        C6496s.h(nVar, "downsampleMode");
        C6496s.h(dVar2, "imageTranscoderFactory");
        this.f35100a = contentResolver;
        this.f35101b = b10;
        this.f35102c = x10;
        this.f35103d = z10;
        this.f35104e = z11;
        this.f35105f = p0Var;
        this.f35106g = nVar;
        this.f35107h = z12;
        this.f35108i = z13;
        this.f35109j = z14;
        this.f35110k = dVar2;
        this.f35111l = z15;
        this.f35112m = z16;
        this.f35113n = z17;
        this.f35114o = set;
    }

    private final d0 A(C3593b bVar) {
        d0 d0Var;
        if (!b.d()) {
            Uri v10 = bVar.v();
            C6496s.g(v10, "getSourceUri(...)");
            if (v10 != null) {
                int w10 = bVar.w();
                if (w10 == 0) {
                    return O();
                }
                switch (w10) {
                    case 2:
                        if (bVar.i()) {
                            return M();
                        }
                        return N();
                    case 3:
                        if (bVar.i()) {
                            return M();
                        }
                        return K();
                    case 4:
                        if (bVar.i()) {
                            return M();
                        }
                        if (V5.a.c(this.f35100a.getType(v10))) {
                            return N();
                        }
                        return I();
                    case 5:
                        return H();
                    case 6:
                        return L();
                    case 7:
                        return D();
                    case 8:
                        return R();
                    default:
                        Set set = this.f35114o;
                        if (set != null) {
                            Iterator it = set.iterator();
                            if (it.hasNext()) {
                                c.a(it.next());
                                throw null;
                            }
                        }
                        String a10 = f35089K.c(v10);
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + a10);
                }
            } else {
                throw new IllegalStateException("Uri is null.");
            }
        } else {
            b.a("ProducerSequenceFactory#getBasicDecodedImageSequence");
            try {
                Uri v11 = bVar.v();
                C6496s.g(v11, "getSourceUri(...)");
                if (v11 != null) {
                    int w11 = bVar.w();
                    if (w11 != 0) {
                        switch (w11) {
                            case 2:
                                if (!bVar.i()) {
                                    d0Var = N();
                                    break;
                                } else {
                                    d0 M10 = M();
                                    b.b();
                                    return M10;
                                }
                            case 3:
                                if (!bVar.i()) {
                                    d0Var = K();
                                    break;
                                } else {
                                    d0 M11 = M();
                                    b.b();
                                    return M11;
                                }
                            case 4:
                                if (!bVar.i()) {
                                    if (!V5.a.c(this.f35100a.getType(v11))) {
                                        d0Var = I();
                                        break;
                                    } else {
                                        d0 N10 = N();
                                        b.b();
                                        return N10;
                                    }
                                } else {
                                    d0 M12 = M();
                                    b.b();
                                    return M12;
                                }
                            case 5:
                                d0Var = H();
                                break;
                            case 6:
                                d0Var = L();
                                break;
                            case 7:
                                d0Var = D();
                                break;
                            case 8:
                                d0Var = R();
                                break;
                            default:
                                Set set2 = this.f35114o;
                                if (set2 != null) {
                                    Iterator it2 = set2.iterator();
                                    if (it2.hasNext()) {
                                        c.a(it2.next());
                                        throw null;
                                    }
                                }
                                String a11 = f35089K.c(v11);
                                throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + a11);
                        }
                    } else {
                        d0Var = O();
                    }
                    return d0Var;
                }
                throw new IllegalStateException("Uri is null.");
            } finally {
                b.b();
            }
        }
    }

    private final synchronized d0 B(d0 d0Var) {
        d0 d0Var2;
        d0Var2 = (d0) this.f35117r.get(d0Var);
        if (d0Var2 == null) {
            d0Var2 = this.f35101b.f(d0Var);
            this.f35117r.put(d0Var, d0Var2);
        }
        return d0Var2;
    }

    private final synchronized d0 F(d0 d0Var) {
        C3312s k10;
        k10 = this.f35101b.k(d0Var);
        C6496s.g(k10, "newDelayProducer(...)");
        return k10;
    }

    private final synchronized d0 Q(d0 d0Var) {
        d0 d0Var2;
        d0Var2 = (d0) this.f35115p.get(d0Var);
        if (d0Var2 == null) {
            b0 B10 = this.f35101b.B(d0Var);
            C6496s.g(B10, "newPostprocessorProducer(...)");
            d0Var2 = this.f35101b.A(B10);
            this.f35115p.put(d0Var, d0Var2);
        }
        return d0Var2;
    }

    /* access modifiers changed from: private */
    public static final d0 S(V v10) {
        C6496s.h(v10, "this$0");
        H q10 = v10.f35101b.q();
        C6496s.g(q10, "newLocalAssetFetchProducer(...)");
        return v10.g0(q10);
    }

    /* access modifiers changed from: private */
    public static final j0 T(V v10) {
        C6496s.h(v10, "this$0");
        if (!b.d()) {
            return new j0(v10.x());
        }
        b.a("ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence:init");
        try {
            return new j0(v10.x());
        } finally {
            b.b();
        }
    }

    /* access modifiers changed from: private */
    public static final d0 U(V v10) {
        C6496s.h(v10, "this$0");
        I r10 = v10.f35101b.r();
        C6496s.g(r10, "newLocalContentUriFetchProducer(...)");
        return v10.h0(r10, new u0[]{v10.f35101b.s(), v10.f35101b.t()});
    }

    /* access modifiers changed from: private */
    public static final j0 V(V v10) {
        C6496s.h(v10, "this$0");
        if (!b.d()) {
            return new j0(v10.y());
        }
        b.a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
        try {
            return new j0(v10.y());
        } finally {
            b.b();
        }
    }

    /* access modifiers changed from: private */
    public static final n0 W(V v10) {
        C6496s.h(v10, "this$0");
        if (!b.d()) {
            return v10.f35101b.E(v10.y());
        }
        b.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
        try {
            return v10.f35101b.E(v10.y());
        } finally {
            b.b();
        }
    }

    /* access modifiers changed from: private */
    public static final d0 X(V v10) {
        C6496s.h(v10, "this$0");
        M u10 = v10.f35101b.u();
        C6496s.g(u10, "newLocalFileFetchProducer(...)");
        return v10.g0(u10);
    }

    /* access modifiers changed from: private */
    public static final d0 Y(V v10) {
        C6496s.h(v10, "this$0");
        N v11 = v10.f35101b.v();
        C6496s.g(v11, "newLocalResourceFetchProducer(...)");
        return v10.g0(v11);
    }

    /* access modifiers changed from: private */
    public static final d0 Z(V v10) {
        C6496s.h(v10, "this$0");
        if (Build.VERSION.SDK_INT >= 29) {
            S w10 = v10.f35101b.w();
            C6496s.g(w10, "newLocalThumbnailBitmapSdk29Producer(...)");
            return v10.e0(w10);
        }
        throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
    }

    /* access modifiers changed from: private */
    public static final d0 a0(V v10) {
        C6496s.h(v10, "this$0");
        T x10 = v10.f35101b.x();
        C6496s.g(x10, "newLocalVideoThumbnailProducer(...)");
        return v10.e0(x10);
    }

    /* access modifiers changed from: private */
    public static final j0 b0(V v10) {
        C6496s.h(v10, "this$0");
        if (!b.d()) {
            return new j0(v10.z());
        }
        b.a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
        try {
            return new j0(v10.z());
        } finally {
            b.b();
        }
    }

    /* access modifiers changed from: private */
    public static final d0 c0(V v10) {
        C6496s.h(v10, "this$0");
        if (!b.d()) {
            return v10.f0(v10.C());
        }
        b.a("ProducerSequenceFactory#getNetworkFetchSequence:init");
        try {
            return v10.f0(v10.C());
        } finally {
            b.b();
        }
    }

    /* access modifiers changed from: private */
    public static final n0 d0(V v10) {
        C6496s.h(v10, "this$0");
        if (!b.d()) {
            return v10.f35101b.E(v10.z());
        }
        b.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        try {
            return v10.f35101b.E(v10.z());
        } finally {
            b.b();
        }
    }

    private final d0 e0(d0 d0Var) {
        C3303i e10 = this.f35101b.e(d0Var);
        C6496s.g(e10, "newBitmapMemoryCacheProducer(...)");
        C3302h d10 = this.f35101b.d(e10);
        C6496s.g(d10, "newBitmapMemoryCacheKeyMultiplexProducer(...)");
        d0 b10 = this.f35101b.b(d10, this.f35105f);
        C6496s.g(b10, "newBackgroundThreadHandoffProducer(...)");
        if (this.f35111l || this.f35112m) {
            C3301g c10 = this.f35101b.c(b10);
            C6496s.g(c10, "newBitmapMemoryCacheGetProducer(...)");
            C3305k g10 = this.f35101b.g(c10);
            C6496s.g(g10, "newBitmapProbeProducer(...)");
            return g10;
        }
        C3301g c11 = this.f35101b.c(b10);
        C6496s.g(c11, "newBitmapMemoryCacheGetProducer(...)");
        return c11;
    }

    private final d0 g0(d0 d0Var) {
        return h0(d0Var, new u0[]{this.f35101b.t()});
    }

    private final d0 h0(d0 d0Var, u0[] u0VarArr) {
        return f0(m0(k0(d0Var), u0VarArr));
    }

    private final d0 j0(d0 d0Var) {
        C3316w wVar;
        C3316w wVar2;
        if (!b.d()) {
            if (this.f35108i) {
                Y z10 = this.f35101b.z(d0Var);
                C6496s.g(z10, "newPartialDiskCacheProducer(...)");
                wVar2 = this.f35101b.m(z10);
            } else {
                wVar2 = this.f35101b.m(d0Var);
            }
            C6496s.e(wVar2);
            C3315v l10 = this.f35101b.l(wVar2);
            C6496s.g(l10, "newDiskCacheReadProducer(...)");
            return l10;
        }
        b.a("ProducerSequenceFactory#newDiskCacheSequence");
        try {
            if (this.f35108i) {
                Y z11 = this.f35101b.z(d0Var);
                C6496s.g(z11, "newPartialDiskCacheProducer(...)");
                wVar = this.f35101b.m(z11);
            } else {
                wVar = this.f35101b.m(d0Var);
            }
            C6496s.e(wVar);
            C3315v l11 = this.f35101b.l(wVar);
            C6496s.g(l11, "newDiskCacheReadProducer(...)");
            b.b();
            return l11;
        } catch (Throwable th2) {
            b.b();
            throw th2;
        }
    }

    private final d0 k0(d0 d0Var) {
        if (this.f35109j) {
            d0Var = j0(d0Var);
        }
        d0 o10 = this.f35101b.o(d0Var);
        C6496s.g(o10, "newEncodedMemoryCacheProducer(...)");
        if (this.f35112m) {
            A p10 = this.f35101b.p(o10);
            C6496s.g(p10, "newEncodedProbeProducer(...)");
            C3318y n10 = this.f35101b.n(p10);
            C6496s.g(n10, "newEncodedCacheKeyMultiplexProducer(...)");
            return n10;
        }
        C3318y n11 = this.f35101b.n(o10);
        C6496s.g(n11, "newEncodedCacheKeyMultiplexProducer(...)");
        return n11;
    }

    private final d0 l0(u0[] u0VarArr) {
        t0 G10 = this.f35101b.G(u0VarArr);
        C6496s.g(G10, "newThumbnailBranchProducer(...)");
        k0 D10 = this.f35101b.D(G10, true, this.f35110k);
        C6496s.g(D10, "newResizeAndRotateProducer(...)");
        return D10;
    }

    private final d0 m0(d0 d0Var, u0[] u0VarArr) {
        C3295a a10 = B.a(d0Var);
        C6496s.g(a10, "newAddImageTransformMetaDataProducer(...)");
        r0 F10 = this.f35101b.F(this.f35101b.D(a10, true, this.f35110k));
        C6496s.g(F10, "newThrottlingProducer(...)");
        C3306l h10 = B.h(l0(u0VarArr), F10);
        C6496s.g(h10, "newBranchOnSeparateImagesProducer(...)");
        return h10;
    }

    /* access modifiers changed from: private */
    public static final d0 n0(V v10) {
        C6496s.h(v10, "this$0");
        i0 C10 = v10.f35101b.C();
        C6496s.g(C10, "newQualifiedResourceFetchProducer(...)");
        return v10.g0(C10);
    }

    /* access modifiers changed from: private */
    public static final d0 s(V v10) {
        C6496s.h(v10, "this$0");
        if (!b.d()) {
            I r10 = v10.f35101b.r();
            C6496s.g(r10, "newLocalContentUriFetchProducer(...)");
            return v10.f35101b.b(v10.k0(r10), v10.f35105f);
        }
        b.a("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init");
        try {
            I r11 = v10.f35101b.r();
            C6496s.g(r11, "newLocalContentUriFetchProducer(...)");
            return v10.f35101b.b(v10.k0(r11), v10.f35105f);
        } finally {
            b.b();
        }
    }

    /* access modifiers changed from: private */
    public static final d0 t(V v10) {
        C6496s.h(v10, "this$0");
        if (!b.d()) {
            M u10 = v10.f35101b.u();
            C6496s.g(u10, "newLocalFileFetchProducer(...)");
            return v10.f35101b.b(v10.k0(u10), v10.f35105f);
        }
        b.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        try {
            M u11 = v10.f35101b.u();
            C6496s.g(u11, "newLocalFileFetchProducer(...)");
            return v10.f35101b.b(v10.k0(u11), v10.f35105f);
        } finally {
            b.b();
        }
    }

    /* access modifiers changed from: private */
    public static final d0 u(V v10) {
        C6496s.h(v10, "this$0");
        if (!b.d()) {
            return v10.f35101b.b(v10.C(), v10.f35105f);
        }
        b.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
        try {
            return v10.f35101b.b(v10.C(), v10.f35105f);
        } finally {
            b.b();
        }
    }

    /* access modifiers changed from: private */
    public static final d0 v(V v10) {
        C6496s.h(v10, "this$0");
        if (!b.d()) {
            return v10.i0(v10.f35102c);
        }
        b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        try {
            return v10.i0(v10.f35102c);
        } finally {
            b.b();
        }
    }

    /* access modifiers changed from: private */
    public static final d0 w(V v10) {
        C6496s.h(v10, "this$0");
        C3309o i10 = v10.f35101b.i();
        C6496s.g(i10, "newDataFetchProducer(...)");
        return v10.f0(v10.f35101b.D(B.a(i10), true, v10.f35110k));
    }

    public final d0 C() {
        return (d0) this.f35124y.getValue();
    }

    public final d0 D() {
        return (d0) this.f35099J.getValue();
    }

    public final d0 E(C3593b bVar) {
        C6496s.h(bVar, "imageRequest");
        if (!b.d()) {
            d0 A10 = A(bVar);
            if (bVar.l() != null) {
                A10 = Q(A10);
            }
            if (this.f35107h) {
                A10 = B(A10);
            }
            if (!this.f35113n || bVar.e() <= 0) {
                return A10;
            }
            return F(A10);
        }
        b.a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        try {
            d0 A11 = A(bVar);
            if (bVar.l() != null) {
                A11 = Q(A11);
            }
            if (this.f35107h) {
                A11 = B(A11);
            }
            if (this.f35113n && bVar.e() > 0) {
                A11 = F(A11);
            }
            b.b();
            return A11;
        } catch (Throwable th2) {
            b.b();
            throw th2;
        }
    }

    public final d0 G(C3593b bVar) {
        C6496s.h(bVar, "imageRequest");
        a aVar = f35089K;
        aVar.d(bVar);
        int w10 = bVar.w();
        if (w10 == 0) {
            return P();
        }
        if (w10 == 2 || w10 == 3) {
            return J();
        }
        Uri v10 = bVar.v();
        C6496s.g(v10, "getSourceUri(...)");
        String a10 = aVar.c(v10);
        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + a10);
    }

    public final d0 H() {
        return (d0) this.f35098I.getValue();
    }

    public final d0 I() {
        return (d0) this.f35094E.getValue();
    }

    public final d0 J() {
        Object value = this.f35125z.getValue();
        C6496s.g(value, "getValue(...)");
        return (d0) value;
    }

    public final d0 K() {
        return (d0) this.f35092C.getValue();
    }

    public final d0 L() {
        return (d0) this.f35097H.getValue();
    }

    public final d0 M() {
        return (d0) this.f35095F.getValue();
    }

    public final d0 N() {
        return (d0) this.f35093D.getValue();
    }

    public final d0 O() {
        return (d0) this.f35121v.getValue();
    }

    public final d0 P() {
        Object value = this.f35123x.getValue();
        C6496s.g(value, "getValue(...)");
        return (d0) value;
    }

    public final d0 R() {
        return (d0) this.f35096G.getValue();
    }

    public final d0 f0(d0 d0Var) {
        C6496s.h(d0Var, "inputProducer");
        if (!b.d()) {
            C3310p j10 = this.f35101b.j(d0Var);
            C6496s.g(j10, "newDecodeProducer(...)");
            return e0(j10);
        }
        b.a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            C3310p j11 = this.f35101b.j(d0Var);
            C6496s.g(j11, "newDecodeProducer(...)");
            return e0(j11);
        } finally {
            b.b();
        }
    }

    /* JADX INFO: finally extract failed */
    public final synchronized d0 i0(X x10) {
        try {
            C6496s.h(x10, "networkFetcher");
            boolean z10 = false;
            if (!b.d()) {
                d0 y10 = this.f35101b.y(x10);
                C6496s.g(y10, "newNetworkFetchProducer(...)");
                C3295a a10 = B.a(k0(y10));
                C6496s.g(a10, "newAddImageTransformMetaDataProducer(...)");
                B b10 = this.f35101b;
                if (this.f35103d && this.f35106g != C3091n.NEVER) {
                    z10 = true;
                }
                return b10.D(a10, z10, this.f35110k);
            }
            b.a("ProducerSequenceFactory#createCommonNetworkFetchToEncodedMemorySequence");
            d0 y11 = this.f35101b.y(x10);
            C6496s.g(y11, "newNetworkFetchProducer(...)");
            C3295a a11 = B.a(k0(y11));
            C6496s.g(a11, "newAddImageTransformMetaDataProducer(...)");
            B b11 = this.f35101b;
            if (this.f35103d && this.f35106g != C3091n.NEVER) {
                z10 = true;
            }
            k0 D10 = b11.D(a11, z10, this.f35110k);
            b.b();
            return D10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final d0 x() {
        Object value = this.f35091B.getValue();
        C6496s.g(value, "getValue(...)");
        return (d0) value;
    }

    public final d0 y() {
        Object value = this.f35090A.getValue();
        C6496s.g(value, "getValue(...)");
        return (d0) value;
    }

    public final d0 z() {
        Object value = this.f35122w.getValue();
        C6496s.g(value, "getValue(...)");
        return (d0) value;
    }
}

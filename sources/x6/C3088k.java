package X6;

import N5.d;
import N5.k;
import T5.g;
import T5.n;
import V6.j;
import V6.t;
import W5.i;
import W5.l;
import f7.D;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import lf.C6534r;
import mf.O;

/* renamed from: X6.k  reason: case insensitive filesystem */
public final class C3088k implements n {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C3094q f35146a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final D f35147b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C3093p f35148c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final t f35149d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final int f35150e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final d f35151f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final d f35152g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Map f35153h;

    /* renamed from: i  reason: collision with root package name */
    private final Lazy f35154i;

    /* renamed from: X6.k$a */
    public static final class a implements C3080c {

        /* renamed from: a  reason: collision with root package name */
        private final Lazy f35155a;

        /* renamed from: b  reason: collision with root package name */
        private final Lazy f35156b;

        /* renamed from: c  reason: collision with root package name */
        private final Lazy f35157c;

        /* renamed from: d  reason: collision with root package name */
        private final Lazy f35158d;

        /* renamed from: e  reason: collision with root package name */
        private final Lazy f35159e;

        /* renamed from: f  reason: collision with root package name */
        private final Lazy f35160f;

        a(C3088k kVar) {
            C6534r rVar = C6534r.SYNCHRONIZED;
            this.f35155a = C6531o.a(rVar, new C3082e(kVar));
            this.f35156b = C6531o.a(rVar, new C3083f(this, kVar));
            this.f35157c = C6531o.a(rVar, new C3084g(kVar));
            this.f35158d = C6531o.a(rVar, new C3085h(this, kVar));
            this.f35159e = C6531o.a(rVar, new C3086i(kVar, this));
            this.f35160f = C6531o.a(rVar, new C3087j(this, kVar));
        }

        /* access modifiers changed from: private */
        public static final g j(a aVar, C3088k kVar) {
            C6496s.h(aVar, "this$0");
            C6496s.h(kVar, "this$1");
            Map l10 = aVar.l();
            LinkedHashMap linkedHashMap = new LinkedHashMap(O.e(l10.size()));
            for (Map.Entry entry : l10.entrySet()) {
                Object key = entry.getKey();
                i i10 = kVar.f35147b.i(kVar.f35150e);
                C6496s.g(i10, "getPooledByteBufferFactory(...)");
                l j10 = kVar.f35147b.j();
                C6496s.g(j10, "getPooledByteStreams(...)");
                Executor f10 = kVar.f35148c.f();
                C6496s.g(f10, "forLocalStorageRead(...)");
                Executor b10 = kVar.f35148c.b();
                C6496s.g(b10, "forLocalStorageWrite(...)");
                linkedHashMap.put(key, new j((k) entry.getValue(), i10, j10, f10, b10, kVar.f35149d));
            }
            return g.a(linkedHashMap);
        }

        /* access modifiers changed from: private */
        public static final Map k(C3088k kVar, a aVar) {
            C6496s.h(kVar, "this$0");
            C6496s.h(aVar, "this$1");
            Map b10 = kVar.f35153h;
            if (b10 == null) {
                return O.i();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(O.e(b10.size()));
            for (Map.Entry entry : b10.entrySet()) {
                linkedHashMap.put(entry.getKey(), kVar.f35146a.a((d) entry.getValue()));
            }
            return linkedHashMap;
        }

        /* access modifiers changed from: private */
        public static final j o(a aVar, C3088k kVar) {
            C6496s.h(aVar, "this$0");
            C6496s.h(kVar, "this$1");
            k m10 = aVar.m();
            i i10 = kVar.f35147b.i(kVar.f35150e);
            C6496s.g(i10, "getPooledByteBufferFactory(...)");
            l j10 = kVar.f35147b.j();
            C6496s.g(j10, "getPooledByteStreams(...)");
            Executor f10 = kVar.f35148c.f();
            C6496s.g(f10, "forLocalStorageRead(...)");
            Executor b10 = kVar.f35148c.b();
            C6496s.g(b10, "forLocalStorageWrite(...)");
            return new j(m10, i10, j10, f10, b10, kVar.f35149d);
        }

        /* access modifiers changed from: private */
        public static final k p(C3088k kVar) {
            C6496s.h(kVar, "this$0");
            return kVar.f35146a.a(kVar.f35151f);
        }

        /* access modifiers changed from: private */
        public static final j q(a aVar, C3088k kVar) {
            C6496s.h(aVar, "this$0");
            C6496s.h(kVar, "this$1");
            k n10 = aVar.n();
            i i10 = kVar.f35147b.i(kVar.f35150e);
            C6496s.g(i10, "getPooledByteBufferFactory(...)");
            l j10 = kVar.f35147b.j();
            C6496s.g(j10, "getPooledByteStreams(...)");
            Executor f10 = kVar.f35148c.f();
            C6496s.g(f10, "forLocalStorageRead(...)");
            Executor b10 = kVar.f35148c.b();
            C6496s.g(b10, "forLocalStorageWrite(...)");
            return new j(n10, i10, j10, f10, b10, kVar.f35149d);
        }

        /* access modifiers changed from: private */
        public static final k r(C3088k kVar) {
            C6496s.h(kVar, "this$0");
            return kVar.f35146a.a(kVar.f35152g);
        }

        public j a() {
            return (j) this.f35158d.getValue();
        }

        public j b() {
            return (j) this.f35156b.getValue();
        }

        public g c() {
            Object value = this.f35160f.getValue();
            C6496s.g(value, "getValue(...)");
            return (g) value;
        }

        public Map l() {
            return (Map) this.f35159e.getValue();
        }

        public k m() {
            return (k) this.f35155a.getValue();
        }

        public k n() {
            return (k) this.f35157c.getValue();
        }
    }

    public C3088k(C3094q qVar, D d10, C3093p pVar, t tVar, int i10, d dVar, d dVar2, Map map) {
        C6496s.h(qVar, "fileCacheFactory");
        C6496s.h(d10, "poolFactory");
        C6496s.h(pVar, "executorSupplier");
        C6496s.h(tVar, "imageCacheStatsTracker");
        C6496s.h(dVar, "mainDiskCacheConfig");
        C6496s.h(dVar2, "smallImageDiskCacheConfig");
        this.f35146a = qVar;
        this.f35147b = d10;
        this.f35148c = pVar;
        this.f35149d = tVar;
        this.f35150e = i10;
        this.f35151f = dVar;
        this.f35152g = dVar2;
        this.f35153h = map;
        this.f35154i = C6531o.a(C6534r.SYNCHRONIZED, new C3081d(this));
    }

    /* access modifiers changed from: private */
    public static final a j(C3088k kVar) {
        C6496s.h(kVar, "this$0");
        return new a(kVar);
    }

    private final C3080c l() {
        return (C3080c) this.f35154i.getValue();
    }

    /* renamed from: k */
    public C3080c get() {
        return l();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3088k(C3094q qVar, C3098v vVar) {
        this(qVar, vVar.t(), vVar.H(), vVar.B(), vVar.u(), vVar.d(), vVar.j(), vVar.i());
        C6496s.h(qVar, "fileCacheFactory");
        C6496s.h(vVar, "config");
    }
}

package j6;

import G6.g;
import G6.l;
import M5.d;
import T5.f;
import T5.i;
import T5.k;
import T5.n;
import V6.x;
import X5.a;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import b7.C3158a;
import c7.C3185e;
import c7.C3191k;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import d6.C3477c;
import e7.c;
import i6.C3591a;
import i7.C3593b;
import j7.b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import k6.C3673a;
import m6.C3777a;
import n6.C3862a;
import o6.C3883a;
import p6.C3934a;
import q6.C3952a;
import q6.C3954c;
import q6.o;
import q6.q;
import t6.C4047b;

public class e extends C3862a {

    /* renamed from: M  reason: collision with root package name */
    private static final Class f44811M = e.class;

    /* renamed from: A  reason: collision with root package name */
    private final C3158a f44812A;

    /* renamed from: B  reason: collision with root package name */
    private final f f44813B;

    /* renamed from: C  reason: collision with root package name */
    private final x f44814C;

    /* renamed from: D  reason: collision with root package name */
    private d f44815D;

    /* renamed from: E  reason: collision with root package name */
    private n f44816E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f44817F;

    /* renamed from: G  reason: collision with root package name */
    private f f44818G;

    /* renamed from: H  reason: collision with root package name */
    private C3673a f44819H;

    /* renamed from: I  reason: collision with root package name */
    private Set f44820I;

    /* renamed from: J  reason: collision with root package name */
    private C3593b f44821J;

    /* renamed from: K  reason: collision with root package name */
    private C3593b[] f44822K;

    /* renamed from: L  reason: collision with root package name */
    private C3593b f44823L;

    /* renamed from: z  reason: collision with root package name */
    private final Resources f44824z;

    public e(Resources resources, C3777a aVar, C3158a aVar2, Executor executor, x xVar, f fVar) {
        super(aVar, executor, (String) null, (Object) null);
        this.f44824z = resources;
        this.f44812A = new C3641a(resources, aVar2);
        this.f44813B = fVar;
        this.f44814C = xVar;
    }

    public static o k0(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof o) {
            return (o) drawable;
        }
        if (drawable instanceof C3954c) {
            return k0(((C3954c) drawable).b());
        }
        if (drawable instanceof C3952a) {
            C3952a aVar = (C3952a) drawable;
            int d10 = aVar.d();
            for (int i10 = 0; i10 < d10; i10++) {
                o k02 = k0(aVar.b(i10));
                if (k02 != null) {
                    return k02;
                }
            }
        }
        return null;
    }

    private void q0(n nVar) {
        this.f44816E = nVar;
        u0((C3185e) null);
    }

    private Drawable t0(f fVar, C3185e eVar) {
        Drawable a10;
        if (fVar == null) {
            return null;
        }
        Iterator it = fVar.iterator();
        while (it.hasNext()) {
            C3158a aVar = (C3158a) it.next();
            if (aVar.b(eVar) && (a10 = aVar.a(eVar)) != null) {
                return a10;
            }
        }
        return null;
    }

    private void u0(C3185e eVar) {
        if (this.f44817F) {
            if (r() == null) {
                C3883a aVar = new C3883a();
                j(new C3934a(aVar));
                a0(aVar);
            }
            if (r() instanceof C3883a) {
                B0(eVar, (C3883a) r());
            }
        }
    }

    public void A0(boolean z10) {
        this.f44817F = z10;
    }

    /* access modifiers changed from: protected */
    public void B0(C3185e eVar, C3883a aVar) {
        o k02;
        aVar.j(v());
        C4047b d10 = d();
        q qVar = null;
        if (!(d10 == null || (k02 = k0(d10.d())) == null)) {
            qVar = k02.A();
        }
        aVar.m(qVar);
        String m02 = m0();
        if (m02 != null) {
            aVar.b("cc", m02);
        }
        if (eVar != null) {
            aVar.k(eVar.e(), eVar.d());
            aVar.l(eVar.p());
            return;
        }
        aVar.i();
    }

    /* access modifiers changed from: protected */
    public void P(Drawable drawable) {
        if (drawable instanceof C3591a) {
            ((C3591a) drawable).a();
        }
    }

    public void f(C4047b bVar) {
        super.f(bVar);
        u0((C3185e) null);
    }

    public synchronized void i0(e7.e eVar) {
        try {
            if (this.f44820I == null) {
                this.f44820I = new HashSet();
            }
            this.f44820I.add(eVar);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public Drawable l(a aVar) {
        try {
            if (b.d()) {
                b.a("PipelineDraweeController#createDrawable");
            }
            k.i(a.T(aVar));
            C3185e eVar = (C3185e) aVar.I();
            u0(eVar);
            Drawable t02 = t0(this.f44818G, eVar);
            if (t02 != null) {
                if (b.d()) {
                    b.b();
                }
                return t02;
            }
            Drawable t03 = t0(this.f44813B, eVar);
            if (t03 != null) {
                if (b.d()) {
                    b.b();
                }
                return t03;
            }
            Drawable a10 = this.f44812A.a(eVar);
            if (a10 != null) {
                if (b.d()) {
                    b.b();
                }
                return a10;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + eVar);
        } catch (Throwable th2) {
            if (b.d()) {
                b.b();
            }
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public a n() {
        if (b.d()) {
            b.a("PipelineDraweeController#getCachedImage");
        }
        try {
            x xVar = this.f44814C;
            if (xVar != null) {
                d dVar = this.f44815D;
                if (dVar != null) {
                    a aVar = xVar.get(dVar);
                    if (aVar == null || ((C3185e) aVar.I()).d1().a()) {
                        if (b.d()) {
                            b.b();
                        }
                        return aVar;
                    }
                    aVar.close();
                    if (b.d()) {
                        b.b();
                    }
                    return null;
                }
            }
            return null;
        } finally {
            if (b.d()) {
                b.b();
            }
        }
    }

    /* access modifiers changed from: protected */
    public String m0() {
        Object o10 = o();
        if (o10 == null) {
            return null;
        }
        return o10.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public int x(a aVar) {
        if (aVar != null) {
            return aVar.M();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public C3191k y(a aVar) {
        k.i(a.T(aVar));
        return ((C3185e) aVar.I()).f1();
    }

    public synchronized e7.e p0() {
        Set set = this.f44820I;
        if (set == null) {
            return null;
        }
        return new c(set);
    }

    public void r0(n nVar, String str, d dVar, Object obj, f fVar) {
        if (b.d()) {
            b.a("PipelineDraweeController#initialize");
        }
        super.D(str, obj);
        q0(nVar);
        this.f44815D = dVar;
        z0(fVar);
        u0((C3185e) null);
        if (b.d()) {
            b.b();
        }
    }

    /* access modifiers changed from: protected */
    public C3477c s() {
        if (b.d()) {
            b.a("PipelineDraweeController#getDataSource");
        }
        if (U5.a.w(2)) {
            U5.a.y(f44811M, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        C3477c cVar = (C3477c) this.f44816E.get();
        if (b.d()) {
            b.b();
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    public synchronized void s0(g gVar, n6.b bVar) {
        try {
            C3673a aVar = this.f44819H;
            if (aVar != null) {
                aVar.f();
            }
            if (gVar != null) {
                if (this.f44819H == null) {
                    this.f44819H = new C3673a(AwakeTimeSinceBootClock.get(), this);
                }
                this.f44819H.c(gVar);
                this.f44819H.g(true);
            }
            this.f44821J = (C3593b) bVar.l();
            this.f44822K = (C3593b[]) bVar.k();
            this.f44823L = (C3593b) bVar.m();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public String toString() {
        return i.b(this).b("super", super.toString()).b("dataSourceSupplier", this.f44816E).toString();
    }

    /* renamed from: v0 */
    public Map K(C3191k kVar) {
        if (kVar == null) {
            return null;
        }
        return kVar.getExtras();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public void M(String str, a aVar) {
        super.M(str, aVar);
        synchronized (this) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public void R(a aVar) {
        a.E(aVar);
    }

    public synchronized void y0(e7.e eVar) {
        Set set = this.f44820I;
        if (set != null) {
            set.remove(eVar);
        }
    }

    /* access modifiers changed from: protected */
    public Uri z() {
        return l.a(this.f44821J, this.f44823L, this.f44822K, C3593b.f44242A);
    }

    public void z0(f fVar) {
        this.f44818G = fVar;
    }
}

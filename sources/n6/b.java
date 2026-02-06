package n6;

import T5.i;
import T5.k;
import T5.n;
import android.content.Context;
import android.graphics.drawable.Animatable;
import d6.C3477c;
import d6.C3478d;
import d6.f;
import d6.h;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import s6.C3990a;
import t6.C4046a;

public abstract class b {

    /* renamed from: q  reason: collision with root package name */
    private static final d f46892q = new a();

    /* renamed from: r  reason: collision with root package name */
    private static final NullPointerException f46893r = new NullPointerException("No image request was specified!");

    /* renamed from: s  reason: collision with root package name */
    private static final AtomicLong f46894s = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    private final Context f46895a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f46896b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f46897c;

    /* renamed from: d  reason: collision with root package name */
    private Object f46898d;

    /* renamed from: e  reason: collision with root package name */
    private Object f46899e;

    /* renamed from: f  reason: collision with root package name */
    private Object f46900f;

    /* renamed from: g  reason: collision with root package name */
    private Object[] f46901g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f46902h;

    /* renamed from: i  reason: collision with root package name */
    private n f46903i;

    /* renamed from: j  reason: collision with root package name */
    private d f46904j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f46905k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f46906l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f46907m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f46908n = false;

    /* renamed from: o  reason: collision with root package name */
    private String f46909o;

    /* renamed from: p  reason: collision with root package name */
    private C4046a f46910p;

    class a extends c {
        a() {
        }

        public void n(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* renamed from: n6.b$b  reason: collision with other inner class name */
    class C0705b implements n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4046a f46911a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f46912b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f46913c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f46914d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f46915e;

        C0705b(C4046a aVar, String str, Object obj, Object obj2, c cVar) {
            this.f46911a = aVar;
            this.f46912b = str;
            this.f46913c = obj;
            this.f46914d = obj2;
            this.f46915e = cVar;
        }

        /* renamed from: a */
        public C3477c get() {
            return b.this.g(this.f46911a, this.f46912b, this.f46913c, this.f46914d, this.f46915e);
        }

        public String toString() {
            return i.b(this).b("request", this.f46913c.toString()).toString();
        }
    }

    public enum c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    protected b(Context context, Set set, Set set2) {
        this.f46895a = context;
        this.f46896b = set;
        this.f46897c = set2;
        q();
    }

    protected static String c() {
        return String.valueOf(f46894s.getAndIncrement());
    }

    private void q() {
        this.f46898d = null;
        this.f46899e = null;
        this.f46900f = null;
        this.f46901g = null;
        this.f46902h = true;
        this.f46904j = null;
        this.f46905k = false;
        this.f46906l = false;
        this.f46908n = false;
        this.f46910p = null;
        this.f46909o = null;
    }

    public b A(d dVar) {
        this.f46904j = dVar;
        return p();
    }

    public b B(Object obj) {
        this.f46899e = obj;
        return p();
    }

    public b C(Object obj) {
        this.f46900f = obj;
        return p();
    }

    public b D(C4046a aVar) {
        this.f46910p = aVar;
        return p();
    }

    /* access modifiers changed from: protected */
    public void E() {
        boolean z10;
        boolean z11 = true;
        if (this.f46901g == null || this.f46899e == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.j(z10, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (!(this.f46903i == null || (this.f46901g == null && this.f46899e == null && this.f46900f == null))) {
            z11 = false;
        }
        k.j(z11, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    public C3862a a() {
        Object obj;
        E();
        if (this.f46899e == null && this.f46901g == null && (obj = this.f46900f) != null) {
            this.f46899e = obj;
            this.f46900f = null;
        }
        return b();
    }

    /* access modifiers changed from: protected */
    public C3862a b() {
        if (j7.b.d()) {
            j7.b.a("AbstractDraweeControllerBuilder#buildController");
        }
        C3862a v10 = v();
        v10.d0(r());
        v10.e0(o());
        v10.Z(e());
        f();
        v10.b0((e) null);
        u(v10);
        s(v10);
        if (j7.b.d()) {
            j7.b.b();
        }
        return v10;
    }

    public Object d() {
        return this.f46898d;
    }

    public String e() {
        return this.f46909o;
    }

    public e f() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract C3477c g(C4046a aVar, String str, Object obj, Object obj2, c cVar);

    /* access modifiers changed from: protected */
    public n h(C4046a aVar, String str, Object obj) {
        return i(aVar, str, obj, c.FULL_FETCH);
    }

    /* access modifiers changed from: protected */
    public n i(C4046a aVar, String str, Object obj, c cVar) {
        return new C0705b(aVar, str, obj, d(), cVar);
    }

    /* access modifiers changed from: protected */
    public n j(C4046a aVar, String str, Object[] objArr, boolean z10) {
        ArrayList arrayList = new ArrayList(objArr.length * 2);
        if (z10) {
            for (Object i10 : objArr) {
                arrayList.add(i(aVar, str, i10, c.BITMAP_MEMORY_CACHE));
            }
        }
        for (Object h10 : objArr) {
            arrayList.add(h(aVar, str, h10));
        }
        return f.b(arrayList);
    }

    public Object[] k() {
        return this.f46901g;
    }

    public Object l() {
        return this.f46899e;
    }

    public Object m() {
        return this.f46900f;
    }

    public C4046a n() {
        return this.f46910p;
    }

    public boolean o() {
        return this.f46907m;
    }

    public boolean r() {
        return this.f46908n;
    }

    /* access modifiers changed from: protected */
    public void s(C3862a aVar) {
        Set<d> set = this.f46896b;
        if (set != null) {
            for (d j10 : set) {
                aVar.j(j10);
            }
        }
        Set<G6.b> set2 = this.f46897c;
        if (set2 != null) {
            for (G6.b k10 : set2) {
                aVar.k(k10);
            }
        }
        d dVar = this.f46904j;
        if (dVar != null) {
            aVar.j(dVar);
        }
        if (this.f46906l) {
            aVar.j(f46892q);
        }
    }

    /* access modifiers changed from: protected */
    public void t(C3862a aVar) {
        if (aVar.u() == null) {
            aVar.c0(C3990a.c(this.f46895a));
        }
    }

    /* access modifiers changed from: protected */
    public void u(C3862a aVar) {
        if (this.f46905k) {
            aVar.A().d(this.f46905k);
            t(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public abstract C3862a v();

    /* access modifiers changed from: protected */
    public n w(C4046a aVar, String str) {
        n nVar;
        n nVar2 = this.f46903i;
        if (nVar2 != null) {
            return nVar2;
        }
        Object obj = this.f46899e;
        if (obj != null) {
            nVar = h(aVar, str, obj);
        } else {
            Object[] objArr = this.f46901g;
            if (objArr != null) {
                nVar = j(aVar, str, objArr, this.f46902h);
            } else {
                nVar = null;
            }
        }
        if (!(nVar == null || this.f46900f == null)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(nVar);
            arrayList.add(h(aVar, str, this.f46900f));
            nVar = h.c(arrayList, false);
        }
        if (nVar == null) {
            return C3478d.a(f46893r);
        }
        return nVar;
    }

    public b x() {
        q();
        return p();
    }

    public b y(boolean z10) {
        this.f46906l = z10;
        return p();
    }

    public b z(Object obj) {
        this.f46898d = obj;
        return p();
    }

    /* access modifiers changed from: protected */
    public final b p() {
        return this;
    }
}

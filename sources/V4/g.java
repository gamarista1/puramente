package V4;

import T4.d;
import T4.f;
import T4.i;
import T4.l;
import T4.m;
import V4.h;
import W4.b;
import X4.a;
import Z4.n;
import b5.C3155f;
import com.bumptech.glide.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class g {

    /* renamed from: a  reason: collision with root package name */
    private final List f34461a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List f34462b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private e f34463c;

    /* renamed from: d  reason: collision with root package name */
    private Object f34464d;

    /* renamed from: e  reason: collision with root package name */
    private int f34465e;

    /* renamed from: f  reason: collision with root package name */
    private int f34466f;

    /* renamed from: g  reason: collision with root package name */
    private Class f34467g;

    /* renamed from: h  reason: collision with root package name */
    private h.e f34468h;

    /* renamed from: i  reason: collision with root package name */
    private i f34469i;

    /* renamed from: j  reason: collision with root package name */
    private Map f34470j;

    /* renamed from: k  reason: collision with root package name */
    private Class f34471k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f34472l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f34473m;

    /* renamed from: n  reason: collision with root package name */
    private f f34474n;

    /* renamed from: o  reason: collision with root package name */
    private com.bumptech.glide.h f34475o;

    /* renamed from: p  reason: collision with root package name */
    private j f34476p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f34477q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f34478r;

    g() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f34463c = null;
        this.f34464d = null;
        this.f34474n = null;
        this.f34467g = null;
        this.f34471k = null;
        this.f34469i = null;
        this.f34475o = null;
        this.f34470j = null;
        this.f34476p = null;
        this.f34461a.clear();
        this.f34472l = false;
        this.f34462b.clear();
        this.f34473m = false;
    }

    /* access modifiers changed from: package-private */
    public b b() {
        return this.f34463c.b();
    }

    /* access modifiers changed from: package-private */
    public List c() {
        if (!this.f34473m) {
            this.f34473m = true;
            this.f34462b.clear();
            List g10 = g();
            int size = g10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVar = (n.a) g10.get(i10);
                if (!this.f34462b.contains(aVar.f35902a)) {
                    this.f34462b.add(aVar.f35902a);
                }
                for (int i11 = 0; i11 < aVar.f35903b.size(); i11++) {
                    if (!this.f34462b.contains(aVar.f35903b.get(i11))) {
                        this.f34462b.add(aVar.f35903b.get(i11));
                    }
                }
            }
        }
        return this.f34462b;
    }

    /* access modifiers changed from: package-private */
    public a d() {
        return this.f34468h.a();
    }

    /* access modifiers changed from: package-private */
    public j e() {
        return this.f34476p;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f34466f;
    }

    /* access modifiers changed from: package-private */
    public List g() {
        if (!this.f34472l) {
            this.f34472l = true;
            this.f34461a.clear();
            List i10 = this.f34463c.i().i(this.f34464d);
            int size = i10.size();
            for (int i11 = 0; i11 < size; i11++) {
                n.a a10 = ((n) i10.get(i11)).a(this.f34464d, this.f34465e, this.f34466f, this.f34469i);
                if (a10 != null) {
                    this.f34461a.add(a10);
                }
            }
        }
        return this.f34461a;
    }

    /* access modifiers changed from: package-private */
    public t h(Class cls) {
        return this.f34463c.i().h(cls, this.f34467g, this.f34471k);
    }

    /* access modifiers changed from: package-private */
    public Class i() {
        return this.f34464d.getClass();
    }

    /* access modifiers changed from: package-private */
    public List j(File file) {
        return this.f34463c.i().i(file);
    }

    /* access modifiers changed from: package-private */
    public i k() {
        return this.f34469i;
    }

    /* access modifiers changed from: package-private */
    public com.bumptech.glide.h l() {
        return this.f34475o;
    }

    /* access modifiers changed from: package-private */
    public List m() {
        return this.f34463c.i().j(this.f34464d.getClass(), this.f34467g, this.f34471k);
    }

    /* access modifiers changed from: package-private */
    public l n(v vVar) {
        return this.f34463c.i().k(vVar);
    }

    /* access modifiers changed from: package-private */
    public com.bumptech.glide.load.data.e o(Object obj) {
        return this.f34463c.i().l(obj);
    }

    /* access modifiers changed from: package-private */
    public f p() {
        return this.f34474n;
    }

    /* access modifiers changed from: package-private */
    public d q(Object obj) {
        return this.f34463c.i().m(obj);
    }

    /* access modifiers changed from: package-private */
    public Class r() {
        return this.f34471k;
    }

    /* access modifiers changed from: package-private */
    public m s(Class cls) {
        m mVar = (m) this.f34470j.get(cls);
        if (mVar == null) {
            Iterator it = this.f34470j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    mVar = (m) entry.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.f34470j.isEmpty() || !this.f34477q) {
            return C3155f.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* access modifiers changed from: package-private */
    public int t() {
        return this.f34465e;
    }

    /* access modifiers changed from: package-private */
    public boolean u(Class cls) {
        if (h(cls) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void v(e eVar, Object obj, f fVar, int i10, int i11, j jVar, Class cls, Class cls2, com.bumptech.glide.h hVar, i iVar, Map map, boolean z10, boolean z11, h.e eVar2) {
        this.f34463c = eVar;
        this.f34464d = obj;
        this.f34474n = fVar;
        this.f34465e = i10;
        this.f34466f = i11;
        this.f34476p = jVar;
        this.f34467g = cls;
        this.f34468h = eVar2;
        this.f34471k = cls2;
        this.f34475o = hVar;
        this.f34469i = iVar;
        this.f34470j = map;
        this.f34477q = z10;
        this.f34478r = z11;
    }

    /* access modifiers changed from: package-private */
    public boolean w(v vVar) {
        return this.f34463c.i().n(vVar);
    }

    /* access modifiers changed from: package-private */
    public boolean x() {
        return this.f34478r;
    }

    /* access modifiers changed from: package-private */
    public boolean y(f fVar) {
        List g10 = g();
        int size = g10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n.a) g10.get(i10)).f35902a.equals(fVar)) {
                return true;
            }
        }
        return false;
    }
}

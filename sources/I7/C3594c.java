package i7;

import T5.k;
import W6.b;
import W6.d;
import W6.f;
import W6.g;
import W6.h;
import X6.C3091n;
import X6.C3097u;
import android.net.Uri;
import e7.e;
import i7.C3593b;
import java.util.HashSet;
import java.util.Set;

/* renamed from: i7.c  reason: case insensitive filesystem */
public class C3594c {

    /* renamed from: t  reason: collision with root package name */
    private static final Set f44279t = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private Uri f44280a = null;

    /* renamed from: b  reason: collision with root package name */
    private C3593b.c f44281b = C3593b.c.FULL_FETCH;

    /* renamed from: c  reason: collision with root package name */
    private int f44282c = 0;

    /* renamed from: d  reason: collision with root package name */
    private g f44283d = null;

    /* renamed from: e  reason: collision with root package name */
    private h f44284e = null;

    /* renamed from: f  reason: collision with root package name */
    private d f44285f = d.a();

    /* renamed from: g  reason: collision with root package name */
    private C3593b.C0681b f44286g = C3593b.C0681b.DEFAULT;

    /* renamed from: h  reason: collision with root package name */
    private boolean f44287h = C3097u.J().a();

    /* renamed from: i  reason: collision with root package name */
    private boolean f44288i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f44289j = false;

    /* renamed from: k  reason: collision with root package name */
    private f f44290k = f.HIGH;

    /* renamed from: l  reason: collision with root package name */
    private C3595d f44291l = null;

    /* renamed from: m  reason: collision with root package name */
    private Boolean f44292m = null;

    /* renamed from: n  reason: collision with root package name */
    private e f44293n;

    /* renamed from: o  reason: collision with root package name */
    private b f44294o = null;

    /* renamed from: p  reason: collision with root package name */
    private Boolean f44295p = null;

    /* renamed from: q  reason: collision with root package name */
    private C3091n f44296q = null;

    /* renamed from: r  reason: collision with root package name */
    private int f44297r;

    /* renamed from: s  reason: collision with root package name */
    private String f44298s = null;

    /* renamed from: i7.c$a */
    public static class a extends RuntimeException {
        public a(String str) {
            super("Invalid request builder: " + str);
        }
    }

    private C3594c() {
    }

    private C3594c B(int i10) {
        this.f44282c = i10;
        if (this.f44286g != C3593b.C0681b.DYNAMIC) {
            this.f44298s = null;
        }
        return this;
    }

    public static C3594c b(C3593b bVar) {
        return x(bVar.v()).F(bVar.h()).z(bVar.b()).A(bVar.c()).H(bVar.j()).G(bVar.i()).I(bVar.k()).B(bVar.d()).J(bVar.l()).K(bVar.p()).M(bVar.o()).N(bVar.r()).L(bVar.q()).P(bVar.t()).Q(bVar.z()).C(bVar.e()).D(bVar.f()).E(bVar.g()).O(bVar.s());
    }

    public static boolean s(Uri uri) {
        Set<String> set = f44279t;
        if (!(set == null || uri == null)) {
            for (String equals : set) {
                if (equals.equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static C3594c x(Uri uri) {
        return new C3594c().R(uri);
    }

    public C3594c A(C3593b.C0681b bVar) {
        this.f44286g = bVar;
        return this;
    }

    public C3594c C(int i10) {
        this.f44297r = i10;
        return this;
    }

    public C3594c D(String str) {
        this.f44298s = str;
        return this;
    }

    public C3594c E(C3091n nVar) {
        this.f44296q = nVar;
        return this;
    }

    public C3594c F(d dVar) {
        this.f44285f = dVar;
        return this;
    }

    public C3594c G(boolean z10) {
        this.f44289j = z10;
        return this;
    }

    public C3594c H(boolean z10) {
        this.f44288i = z10;
        return this;
    }

    public C3594c I(C3593b.c cVar) {
        this.f44281b = cVar;
        return this;
    }

    public C3594c J(C3595d dVar) {
        this.f44291l = dVar;
        return this;
    }

    public C3594c K(boolean z10) {
        this.f44287h = z10;
        return this;
    }

    public C3594c L(e eVar) {
        this.f44293n = eVar;
        return this;
    }

    public C3594c M(f fVar) {
        this.f44290k = fVar;
        return this;
    }

    public C3594c N(g gVar) {
        this.f44283d = gVar;
        return this;
    }

    public C3594c O(Boolean bool) {
        this.f44295p = bool;
        return this;
    }

    public C3594c P(h hVar) {
        this.f44284e = hVar;
        return this;
    }

    public C3594c Q(Boolean bool) {
        this.f44292m = bool;
        return this;
    }

    public C3594c R(Uri uri) {
        k.g(uri);
        this.f44280a = uri;
        return this;
    }

    public Boolean S() {
        return this.f44292m;
    }

    /* access modifiers changed from: protected */
    public void T() {
        Uri uri = this.f44280a;
        if (uri != null) {
            if (b6.f.m(uri)) {
                if (!this.f44280a.isAbsolute()) {
                    throw new a("Resource URI path must be absolute.");
                } else if (!this.f44280a.getPath().isEmpty()) {
                    try {
                        Integer.parseInt(this.f44280a.getPath().substring(1));
                    } catch (NumberFormatException unused) {
                        throw new a("Resource URI path must be a resource id.");
                    }
                } else {
                    throw new a("Resource URI must not be empty");
                }
            }
            if (b6.f.h(this.f44280a) && !this.f44280a.isAbsolute()) {
                throw new a("Asset URI path must be absolute.");
            }
            return;
        }
        throw new a("Source must be set!");
    }

    public C3593b a() {
        T();
        return new C3593b(this);
    }

    public b c() {
        return this.f44294o;
    }

    public C3593b.C0681b d() {
        return this.f44286g;
    }

    public int e() {
        return this.f44282c;
    }

    public int f() {
        return this.f44297r;
    }

    public String g() {
        return this.f44298s;
    }

    public C3091n h() {
        return this.f44296q;
    }

    public d i() {
        return this.f44285f;
    }

    public boolean j() {
        return this.f44289j;
    }

    public C3593b.c k() {
        return this.f44281b;
    }

    public C3595d l() {
        return this.f44291l;
    }

    public e m() {
        return this.f44293n;
    }

    public f n() {
        return this.f44290k;
    }

    public g o() {
        return this.f44283d;
    }

    public Boolean p() {
        return this.f44295p;
    }

    public h q() {
        return this.f44284e;
    }

    public Uri r() {
        return this.f44280a;
    }

    public boolean t() {
        if ((this.f44282c & 48) != 0 || (!b6.f.n(this.f44280a) && !s(this.f44280a))) {
            return false;
        }
        return true;
    }

    public boolean u() {
        return this.f44288i;
    }

    public boolean v() {
        if ((this.f44282c & 15) == 0) {
            return true;
        }
        return false;
    }

    public boolean w() {
        return this.f44287h;
    }

    public C3594c y(boolean z10) {
        if (z10) {
            return P(h.c());
        }
        return P(h.e());
    }

    public C3594c z(b bVar) {
        this.f44294o = bVar;
        return this;
    }
}

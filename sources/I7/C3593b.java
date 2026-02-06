package i7;

import T5.e;
import T5.i;
import T5.k;
import W6.b;
import W6.d;
import W6.f;
import W6.g;
import W6.h;
import X6.C3091n;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import z7.C4235a;

/* renamed from: i7.b  reason: case insensitive filesystem */
public class C3593b {

    /* renamed from: A  reason: collision with root package name */
    public static final e f44242A = new a();

    /* renamed from: y  reason: collision with root package name */
    private static boolean f44243y;

    /* renamed from: z  reason: collision with root package name */
    private static boolean f44244z;

    /* renamed from: a  reason: collision with root package name */
    private int f44245a;

    /* renamed from: b  reason: collision with root package name */
    private final C0681b f44246b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f44247c;

    /* renamed from: d  reason: collision with root package name */
    private final int f44248d;

    /* renamed from: e  reason: collision with root package name */
    private File f44249e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f44250f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f44251g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f44252h;

    /* renamed from: i  reason: collision with root package name */
    private final d f44253i;

    /* renamed from: j  reason: collision with root package name */
    private final g f44254j;

    /* renamed from: k  reason: collision with root package name */
    private final h f44255k;

    /* renamed from: l  reason: collision with root package name */
    private final b f44256l;

    /* renamed from: m  reason: collision with root package name */
    private final f f44257m;

    /* renamed from: n  reason: collision with root package name */
    private final c f44258n;

    /* renamed from: o  reason: collision with root package name */
    protected int f44259o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f44260p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f44261q;

    /* renamed from: r  reason: collision with root package name */
    private final Boolean f44262r;

    /* renamed from: s  reason: collision with root package name */
    private final C3595d f44263s;

    /* renamed from: t  reason: collision with root package name */
    private final e7.e f44264t;

    /* renamed from: u  reason: collision with root package name */
    private final Boolean f44265u;

    /* renamed from: v  reason: collision with root package name */
    private final C3091n f44266v;

    /* renamed from: w  reason: collision with root package name */
    private final String f44267w;

    /* renamed from: x  reason: collision with root package name */
    private final int f44268x;

    /* renamed from: i7.b$a */
    class a implements e {
        a() {
        }

        /* renamed from: a */
        public Uri apply(C3593b bVar) {
            if (bVar != null) {
                return bVar.v();
            }
            return null;
        }
    }

    /* renamed from: i7.b$b  reason: collision with other inner class name */
    public enum C0681b {
        SMALL,
        DEFAULT,
        DYNAMIC
    }

    /* renamed from: i7.b$c */
    public enum c {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        

        /* renamed from: a  reason: collision with root package name */
        private int f44278a;

        private c(int i10) {
            this.f44278a = i10;
        }

        public static c a(c cVar, c cVar2) {
            if (cVar.b() > cVar2.b()) {
                return cVar;
            }
            return cVar2;
        }

        public int b() {
            return this.f44278a;
        }
    }

    protected C3593b(C3594c cVar) {
        h hVar;
        this.f44246b = cVar.d();
        Uri r10 = cVar.r();
        this.f44247c = r10;
        this.f44248d = x(r10);
        this.f44250f = cVar.w();
        this.f44251g = cVar.u();
        this.f44252h = cVar.j();
        this.f44253i = cVar.i();
        this.f44254j = cVar.o();
        if (cVar.q() == null) {
            hVar = h.c();
        } else {
            hVar = cVar.q();
        }
        this.f44255k = hVar;
        this.f44256l = cVar.c();
        this.f44257m = cVar.n();
        this.f44258n = cVar.k();
        boolean t10 = cVar.t();
        this.f44260p = t10;
        int e10 = cVar.e();
        this.f44259o = !t10 ? e10 | 48 : e10;
        this.f44261q = cVar.v();
        this.f44262r = cVar.S();
        this.f44263s = cVar.l();
        this.f44264t = cVar.m();
        this.f44265u = cVar.p();
        this.f44266v = cVar.h();
        this.f44268x = cVar.f();
        this.f44267w = cVar.g();
    }

    public static C3593b a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return C3594c.x(uri).a();
    }

    private static int x(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (b6.f.n(uri)) {
            return 0;
        }
        if (uri.getPath() == null || !b6.f.l(uri)) {
            if (b6.f.k(uri)) {
                return 4;
            }
            if (b6.f.h(uri)) {
                return 5;
            }
            if (b6.f.m(uri)) {
                return 6;
            }
            if (b6.f.g(uri)) {
                return 7;
            }
            if (b6.f.o(uri)) {
                return 8;
            }
            return -1;
        } else if (V5.a.c(V5.a.b(uri.getPath()))) {
            return 2;
        } else {
            return 3;
        }
    }

    public b b() {
        return this.f44256l;
    }

    public C0681b c() {
        return this.f44246b;
    }

    public int d() {
        return this.f44259o;
    }

    public int e() {
        return this.f44268x;
    }

    public boolean equals(Object obj) {
        M5.d dVar;
        if (!(obj instanceof C3593b)) {
            return false;
        }
        C3593b bVar = (C3593b) obj;
        if (f44243y) {
            int i10 = this.f44245a;
            int i11 = bVar.f44245a;
            if (!(i10 == 0 || i11 == 0 || i10 == i11)) {
                return false;
            }
        }
        if (this.f44251g != bVar.f44251g || this.f44260p != bVar.f44260p || this.f44261q != bVar.f44261q || !i.a(this.f44247c, bVar.f44247c) || !i.a(this.f44246b, bVar.f44246b) || !i.a(this.f44267w, bVar.f44267w) || !i.a(this.f44249e, bVar.f44249e) || !i.a(this.f44256l, bVar.f44256l) || !i.a(this.f44253i, bVar.f44253i) || !i.a(this.f44254j, bVar.f44254j) || !i.a(this.f44257m, bVar.f44257m) || !i.a(this.f44258n, bVar.f44258n) || !i.a(Integer.valueOf(this.f44259o), Integer.valueOf(bVar.f44259o)) || !i.a(this.f44262r, bVar.f44262r) || !i.a(this.f44265u, bVar.f44265u) || !i.a(this.f44266v, bVar.f44266v) || !i.a(this.f44255k, bVar.f44255k) || this.f44252h != bVar.f44252h) {
            return false;
        }
        C3595d dVar2 = this.f44263s;
        M5.d dVar3 = null;
        if (dVar2 != null) {
            dVar = dVar2.a();
        } else {
            dVar = null;
        }
        C3595d dVar4 = bVar.f44263s;
        if (dVar4 != null) {
            dVar3 = dVar4.a();
        }
        if (i.a(dVar, dVar3) && this.f44268x == bVar.f44268x) {
            return true;
        }
        return false;
    }

    public String f() {
        return this.f44267w;
    }

    public C3091n g() {
        return this.f44266v;
    }

    public d h() {
        return this.f44253i;
    }

    public int hashCode() {
        int i10;
        M5.d dVar;
        boolean z10 = f44244z;
        if (z10) {
            i10 = this.f44245a;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            C3595d dVar2 = this.f44263s;
            if (dVar2 != null) {
                dVar = dVar2.a();
            } else {
                dVar = null;
            }
            i10 = C4235a.a(C4235a.a(C4235a.a(C4235a.a(C4235a.a(C4235a.a(C4235a.a(C4235a.a(C4235a.a(C4235a.a(C4235a.a(C4235a.a(C4235a.a(C4235a.a(C4235a.a(C4235a.a(C4235a.a(C4235a.a(0, this.f44246b), this.f44247c), Boolean.valueOf(this.f44251g)), this.f44256l), this.f44257m), this.f44258n), Integer.valueOf(this.f44259o)), Boolean.valueOf(this.f44260p)), Boolean.valueOf(this.f44261q)), this.f44253i), this.f44262r), this.f44254j), this.f44255k), dVar), this.f44265u), this.f44266v), Integer.valueOf(this.f44268x)), Boolean.valueOf(this.f44252h));
            if (z10) {
                this.f44245a = i10;
            }
        }
        return i10;
    }

    public boolean i() {
        if (Build.VERSION.SDK_INT < 29 || !this.f44252h) {
            return false;
        }
        return true;
    }

    public boolean j() {
        return this.f44251g;
    }

    public c k() {
        return this.f44258n;
    }

    public C3595d l() {
        return this.f44263s;
    }

    public int m() {
        g gVar = this.f44254j;
        if (gVar != null) {
            return gVar.f34904b;
        }
        return 2048;
    }

    public int n() {
        g gVar = this.f44254j;
        if (gVar != null) {
            return gVar.f34903a;
        }
        return 2048;
    }

    public f o() {
        return this.f44257m;
    }

    public boolean p() {
        return this.f44250f;
    }

    public e7.e q() {
        return this.f44264t;
    }

    public g r() {
        return this.f44254j;
    }

    public Boolean s() {
        return this.f44265u;
    }

    public h t() {
        return this.f44255k;
    }

    public String toString() {
        return i.b(this).b("uri", this.f44247c).b("cacheChoice", this.f44246b).b("decodeOptions", this.f44253i).b("postprocessor", this.f44263s).b("priority", this.f44257m).b("resizeOptions", this.f44254j).b("rotationOptions", this.f44255k).b("bytesRange", this.f44256l).b("resizingAllowedOverride", this.f44265u).b("downsampleOverride", this.f44266v).c("progressiveRenderingEnabled", this.f44250f).c("localThumbnailPreviewsEnabled", this.f44251g).c("loadThumbnailOnly", this.f44252h).b("lowestPermittedRequestLevel", this.f44258n).a("cachesDisabled", this.f44259o).c("isDiskCacheEnabled", this.f44260p).c("isMemoryCacheEnabled", this.f44261q).b("decodePrefetches", this.f44262r).a("delayMs", this.f44268x).toString();
    }

    public synchronized File u() {
        try {
            if (this.f44249e == null) {
                k.g(this.f44247c.getPath());
                this.f44249e = new File(this.f44247c.getPath());
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f44249e;
    }

    public Uri v() {
        return this.f44247c;
    }

    public int w() {
        return this.f44248d;
    }

    public boolean y(int i10) {
        if ((i10 & d()) == 0) {
            return true;
        }
        return false;
    }

    public Boolean z() {
        return this.f44262r;
    }
}

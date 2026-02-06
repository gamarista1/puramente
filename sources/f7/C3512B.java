package f7;

import W5.d;
import W5.e;
import j7.b;

/* renamed from: f7.B  reason: case insensitive filesystem */
public class C3512B {

    /* renamed from: a  reason: collision with root package name */
    private final E f43388a;

    /* renamed from: b  reason: collision with root package name */
    private final F f43389b;

    /* renamed from: c  reason: collision with root package name */
    private final E f43390c;

    /* renamed from: d  reason: collision with root package name */
    private final d f43391d;

    /* renamed from: e  reason: collision with root package name */
    private final E f43392e;

    /* renamed from: f  reason: collision with root package name */
    private final F f43393f;

    /* renamed from: g  reason: collision with root package name */
    private final E f43394g;

    /* renamed from: h  reason: collision with root package name */
    private final F f43395h;

    /* renamed from: i  reason: collision with root package name */
    private final String f43396i;

    /* renamed from: j  reason: collision with root package name */
    private final int f43397j;

    /* renamed from: k  reason: collision with root package name */
    private final int f43398k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f43399l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f43400m;

    /* renamed from: f7.B$a */
    public static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public E f43401a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public F f43402b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public E f43403c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public d f43404d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public E f43405e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public F f43406f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public E f43407g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public F f43408h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public String f43409i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public int f43410j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public int f43411k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public boolean f43412l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f43413m;

        public C3512B m() {
            return new C3512B(this);
        }

        private a() {
        }
    }

    public static a n() {
        return new a();
    }

    public int a() {
        return this.f43398k;
    }

    public int b() {
        return this.f43397j;
    }

    public E c() {
        return this.f43388a;
    }

    public F d() {
        return this.f43389b;
    }

    public String e() {
        return this.f43396i;
    }

    public E f() {
        return this.f43390c;
    }

    public E g() {
        return this.f43392e;
    }

    public F h() {
        return this.f43393f;
    }

    public d i() {
        return this.f43391d;
    }

    public E j() {
        return this.f43394g;
    }

    public F k() {
        return this.f43395h;
    }

    public boolean l() {
        return this.f43400m;
    }

    public boolean m() {
        return this.f43399l;
    }

    private C3512B(a aVar) {
        E e10;
        F f10;
        E e11;
        d dVar;
        E e12;
        F f11;
        E e13;
        F f12;
        if (b.d()) {
            b.a("PoolConfig()");
        }
        if (aVar.f43401a == null) {
            e10 = n.a();
        } else {
            e10 = aVar.f43401a;
        }
        this.f43388a = e10;
        if (aVar.f43402b == null) {
            f10 = z.h();
        } else {
            f10 = aVar.f43402b;
        }
        this.f43389b = f10;
        if (aVar.f43403c == null) {
            e11 = p.b();
        } else {
            e11 = aVar.f43403c;
        }
        this.f43390c = e11;
        if (aVar.f43404d == null) {
            dVar = e.b();
        } else {
            dVar = aVar.f43404d;
        }
        this.f43391d = dVar;
        if (aVar.f43405e == null) {
            e12 = q.a();
        } else {
            e12 = aVar.f43405e;
        }
        this.f43392e = e12;
        if (aVar.f43406f == null) {
            f11 = z.h();
        } else {
            f11 = aVar.f43406f;
        }
        this.f43393f = f11;
        if (aVar.f43407g == null) {
            e13 = o.a();
        } else {
            e13 = aVar.f43407g;
        }
        this.f43394g = e13;
        if (aVar.f43408h == null) {
            f12 = z.h();
        } else {
            f12 = aVar.f43408h;
        }
        this.f43395h = f12;
        this.f43396i = aVar.f43409i == null ? "legacy" : aVar.f43409i;
        this.f43397j = aVar.f43410j;
        this.f43398k = aVar.f43411k > 0 ? aVar.f43411k : 4194304;
        this.f43399l = aVar.f43412l;
        if (b.d()) {
            b.b();
        }
        this.f43400m = aVar.f43413m;
    }
}

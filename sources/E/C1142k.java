package E;

import E.C1141j;
import H0.C1184e;
import H0.C1185f;
import I0.j;
import I0.l;
import c1.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import lf.C6527k;
import lf.C6535s;
import yf.C6798l;
import z.q;

/* renamed from: E.k  reason: case insensitive filesystem */
public final class C1142k implements j, C1184e {

    /* renamed from: g  reason: collision with root package name */
    public static final b f1655g = new b((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    private static final a f1656h = new a();

    /* renamed from: b  reason: collision with root package name */
    private final C1144m f1657b;

    /* renamed from: c  reason: collision with root package name */
    private final C1141j f1658c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f1659d;

    /* renamed from: e  reason: collision with root package name */
    private final t f1660e;

    /* renamed from: f  reason: collision with root package name */
    private final q f1661f;

    /* renamed from: E.k$a */
    public static final class a implements C1184e.a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f1662a;

        a() {
        }

        public boolean a() {
            return this.f1662a;
        }
    }

    /* renamed from: E.k$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: E.k$c */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1663a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                c1.t[] r0 = c1.t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c1.t r1 = c1.t.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                c1.t r1 = c1.t.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f1663a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: E.C1142k.c.<clinit>():void");
        }
    }

    /* renamed from: E.k$d */
    public static final class d implements C1184e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1142k f1664a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ N f1665b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f1666c;

        d(C1142k kVar, N n10, int i10) {
            this.f1664a = kVar;
            this.f1665b = n10;
            this.f1666c = i10;
        }

        public boolean a() {
            return this.f1664a.i((C1141j.a) this.f1665b.f71759a, this.f1666c);
        }
    }

    public C1142k(C1144m mVar, C1141j jVar, boolean z10, t tVar, q qVar) {
        this.f1657b = mVar;
        this.f1658c = jVar;
        this.f1659d = z10;
        this.f1660e = tVar;
        this.f1661f = qVar;
    }

    private final C1141j.a d(C1141j.a aVar, int i10) {
        int b10 = aVar.b();
        int a10 = aVar.a();
        if (j(i10)) {
            a10++;
        } else {
            b10--;
        }
        return this.f1658c.a(b10, a10);
    }

    /* access modifiers changed from: private */
    public final boolean i(C1141j.a aVar, int i10) {
        if (k(i10)) {
            return false;
        }
        if (j(i10)) {
            if (aVar.a() >= this.f1657b.a() - 1) {
                return false;
            }
        } else if (aVar.b() <= 0) {
            return false;
        }
        return true;
    }

    private final boolean j(int i10) {
        C1184e.b.a aVar = C1184e.b.f2587a;
        if (C1184e.b.h(i10, aVar.c())) {
            return false;
        }
        if (!C1184e.b.h(i10, aVar.b())) {
            if (C1184e.b.h(i10, aVar.a())) {
                return this.f1659d;
            }
            if (C1184e.b.h(i10, aVar.d())) {
                if (this.f1659d) {
                    return false;
                }
            } else if (C1184e.b.h(i10, aVar.e())) {
                int i11 = c.f1663a[this.f1660e.ordinal()];
                if (i11 == 1) {
                    return this.f1659d;
                }
                if (i11 != 2) {
                    throw new C6535s();
                } else if (this.f1659d) {
                    return false;
                }
            } else if (C1184e.b.h(i10, aVar.f())) {
                int i12 = c.f1663a[this.f1660e.ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        return this.f1659d;
                    }
                    throw new C6535s();
                } else if (this.f1659d) {
                    return false;
                }
            } else {
                Void unused = C1143l.c();
                throw new C6527k();
            }
        }
        return true;
    }

    private final boolean k(int i10) {
        boolean z10;
        boolean z11;
        C1184e.b.a aVar = C1184e.b.f2587a;
        boolean z12 = true;
        if (C1184e.b.h(i10, aVar.a())) {
            z10 = true;
        } else {
            z10 = C1184e.b.h(i10, aVar.d());
        }
        if (!z10) {
            if (C1184e.b.h(i10, aVar.e())) {
                z11 = true;
            } else {
                z11 = C1184e.b.h(i10, aVar.f());
            }
            if (!z11) {
                if (!C1184e.b.h(i10, aVar.c())) {
                    z12 = C1184e.b.h(i10, aVar.b());
                }
                if (!z12) {
                    Void unused = C1143l.c();
                    throw new C6527k();
                }
            } else if (this.f1661f == q.Vertical) {
                return true;
            }
        } else if (this.f1661f == q.Horizontal) {
            return true;
        }
        return false;
    }

    public Object a(int i10, C6798l lVar) {
        int i11;
        if (this.f1657b.a() <= 0 || !this.f1657b.c()) {
            return lVar.invoke(f1656h);
        }
        if (j(i10)) {
            i11 = this.f1657b.e();
        } else {
            i11 = this.f1657b.d();
        }
        N n10 = new N();
        n10.f71759a = this.f1658c.a(i11, i11);
        Object obj = null;
        while (obj == null && i((C1141j.a) n10.f71759a, i10)) {
            C1141j.a d10 = d((C1141j.a) n10.f71759a, i10);
            this.f1658c.e((C1141j.a) n10.f71759a);
            n10.f71759a = d10;
            this.f1657b.b();
            obj = lVar.invoke(new d(this, n10, i10));
        }
        this.f1658c.e((C1141j.a) n10.f71759a);
        this.f1657b.b();
        return obj;
    }

    public l getKey() {
        return C1185f.a();
    }

    /* renamed from: e */
    public C1184e getValue() {
        return this;
    }
}

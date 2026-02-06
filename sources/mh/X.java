package mh;

import gh.C5987k;
import ih.f;
import jh.b;
import jh.d;
import kotlin.jvm.internal.C6496s;
import lh.C6538b;
import lh.g;
import lh.m;
import nh.C6624e;

public final class X extends b implements m {

    /* renamed from: a  reason: collision with root package name */
    private final C6596m f72171a;

    /* renamed from: b  reason: collision with root package name */
    private final C6538b f72172b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f72173c;

    /* renamed from: d  reason: collision with root package name */
    private final m[] f72174d;

    /* renamed from: e  reason: collision with root package name */
    private final C6624e f72175e;

    /* renamed from: f  reason: collision with root package name */
    private final g f72176f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f72177g;

    /* renamed from: h  reason: collision with root package name */
    private String f72178h;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f72179a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                mh.d0[] r0 = mh.d0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                mh.d0 r1 = mh.d0.LIST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                mh.d0 r1 = mh.d0.MAP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                mh.d0 r1 = mh.d0.POLY_OBJ     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f72179a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mh.X.a.<clinit>():void");
        }
    }

    public X(C6596m mVar, C6538b bVar, d0 d0Var, m[] mVarArr) {
        C6496s.h(mVar, "composer");
        C6496s.h(bVar, "json");
        C6496s.h(d0Var, "mode");
        this.f72171a = mVar;
        this.f72172b = bVar;
        this.f72173c = d0Var;
        this.f72174d = mVarArr;
        this.f72175e = d().a();
        this.f72176f = d().f();
        int ordinal = d0Var.ordinal();
        if (mVarArr != null) {
            m mVar2 = mVarArr[ordinal];
            if (mVar2 != null || mVar2 != this) {
                mVarArr[ordinal] = this;
            }
        }
    }

    private final void J(f fVar) {
        this.f72171a.c();
        String str = this.f72178h;
        C6496s.e(str);
        F(str);
        this.f72171a.f(':');
        this.f72171a.p();
        F(fVar.i());
    }

    public void D(int i10) {
        if (this.f72177g) {
            F(String.valueOf(i10));
        } else {
            this.f72171a.i(i10);
        }
    }

    public void F(String str) {
        C6496s.h(str, "value");
        this.f72171a.n(str);
    }

    public boolean G(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        int i11 = a.f72179a[this.f72173c.ordinal()];
        if (i11 != 1) {
            boolean z10 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (!this.f72171a.a()) {
                        this.f72171a.f(',');
                    }
                    this.f72171a.c();
                    F(G.g(fVar, d(), i10));
                    this.f72171a.f(':');
                    this.f72171a.p();
                } else {
                    if (i10 == 0) {
                        this.f72177g = true;
                    }
                    if (i10 == 1) {
                        this.f72171a.f(',');
                        this.f72171a.p();
                        this.f72177g = false;
                    }
                }
            } else if (!this.f72171a.a()) {
                if (i10 % 2 == 0) {
                    this.f72171a.f(',');
                    this.f72171a.c();
                    z10 = true;
                } else {
                    this.f72171a.f(':');
                    this.f72171a.p();
                }
                this.f72177g = z10;
            } else {
                this.f72177g = true;
                this.f72171a.c();
            }
        } else {
            if (!this.f72171a.a()) {
                this.f72171a.f(',');
            }
            this.f72171a.c();
        }
        return true;
    }

    public C6624e a() {
        return this.f72175e;
    }

    public d b(f fVar) {
        m mVar;
        C6496s.h(fVar, "descriptor");
        d0 b10 = e0.b(d(), fVar);
        char c10 = b10.f72209a;
        if (c10 != 0) {
            this.f72171a.f(c10);
            this.f72171a.b();
        }
        if (this.f72178h != null) {
            J(fVar);
            this.f72178h = null;
        }
        if (this.f72173c == b10) {
            return this;
        }
        m[] mVarArr = this.f72174d;
        if (mVarArr == null || (mVar = mVarArr[b10.ordinal()]) == null) {
            return new X(this.f72171a, d(), b10, this.f72174d);
        }
        return mVar;
    }

    public void c(f fVar) {
        C6496s.h(fVar, "descriptor");
        if (this.f72173c.f72210b != 0) {
            this.f72171a.q();
            this.f72171a.d();
            this.f72171a.f(this.f72173c.f72210b);
        }
    }

    public C6538b d() {
        return this.f72172b;
    }

    public void f(double d10) {
        if (this.f72177g) {
            F(String.valueOf(d10));
        } else {
            this.f72171a.g(d10);
        }
        if (this.f72176f.a()) {
            return;
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw F.b(Double.valueOf(d10), this.f72171a.f72218a.toString());
        }
    }

    public void h(byte b10) {
        if (this.f72177g) {
            F(String.valueOf(b10));
        } else {
            this.f72171a.e(b10);
        }
    }

    public jh.f j(f fVar) {
        C6496s.h(fVar, "descriptor");
        if (Y.b(fVar)) {
            C6596m mVar = this.f72171a;
            if (!(mVar instanceof C6603u)) {
                mVar = new C6603u(mVar.f72218a, this.f72177g);
            }
            return new X(mVar, d(), this.f72173c, (m[]) null);
        } else if (!Y.a(fVar)) {
            return super.j(fVar);
        } else {
            C6596m mVar2 = this.f72171a;
            if (!(mVar2 instanceof C6597n)) {
                mVar2 = new C6597n(mVar2.f72218a, this.f72177g);
            }
            return new X(mVar2, d(), this.f72173c, (m[]) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (kotlin.jvm.internal.C6496s.c(r1, ih.k.d.f68509a) == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (d().f().e() != lh.C6537a.NONE) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(gh.C5987k r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            lh.b r0 = r3.d()
            lh.g r0 = r0.f()
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x0018
            r4.serialize(r3, r5)
            goto L_0x00c3
        L_0x0018:
            boolean r0 = r4 instanceof kh.C6441b
            if (r0 == 0) goto L_0x002d
            lh.b r1 = r3.d()
            lh.g r1 = r1.f()
            lh.a r1 = r1.e()
            lh.a r2 = lh.C6537a.NONE
            if (r1 == r2) goto L_0x0075
            goto L_0x0062
        L_0x002d:
            lh.b r1 = r3.d()
            lh.g r1 = r1.f()
            lh.a r1 = r1.e()
            int[] r2 = mh.U.a.f72158a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L_0x0075
            r2 = 2
            if (r1 == r2) goto L_0x0075
            r2 = 3
            if (r1 != r2) goto L_0x006f
            ih.f r1 = r4.getDescriptor()
            ih.j r1 = r1.h()
            ih.k$a r2 = ih.k.a.f68506a
            boolean r2 = kotlin.jvm.internal.C6496s.c(r1, r2)
            if (r2 != 0) goto L_0x0062
            ih.k$d r2 = ih.k.d.f68509a
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r2)
            if (r1 == 0) goto L_0x0075
        L_0x0062:
            ih.f r1 = r4.getDescriptor()
            lh.b r2 = r3.d()
            java.lang.String r1 = mh.U.c(r1, r2)
            goto L_0x0076
        L_0x006f:
            lf.s r4 = new lf.s
            r4.<init>()
            throw r4
        L_0x0075:
            r1 = 0
        L_0x0076:
            if (r0 == 0) goto L_0x00bc
            r0 = r4
            kh.b r0 = (kh.C6441b) r0
            if (r5 == 0) goto L_0x0098
            gh.k r0 = gh.C5982f.b(r0, r3, r5)
            if (r1 == 0) goto L_0x0086
            mh.U.e(r4, r0, r1)
        L_0x0086:
            ih.f r4 = r0.getDescriptor()
            ih.j r4 = r4.h()
            mh.U.b(r4)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>"
            kotlin.jvm.internal.C6496s.f(r0, r4)
            r4 = r0
            goto L_0x00bc
        L_0x0098:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Value for serializer "
            r5.append(r0)
            ih.f r4 = r4.getDescriptor()
            r5.append(r4)
            java.lang.String r4 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L_0x00bc:
            if (r1 == 0) goto L_0x00c0
            r3.f72178h = r1
        L_0x00c0:
            r4.serialize(r3, r5)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.X.m(gh.k, java.lang.Object):void");
    }

    public void n(long j10) {
        if (this.f72177g) {
            F(String.valueOf(j10));
        } else {
            this.f72171a.j(j10);
        }
    }

    public void p(f fVar, int i10, C5987k kVar, Object obj) {
        C6496s.h(fVar, "descriptor");
        C6496s.h(kVar, "serializer");
        if (obj != null || this.f72176f.i()) {
            super.p(fVar, i10, kVar, obj);
        }
    }

    public boolean q(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return this.f72176f.h();
    }

    public void r() {
        this.f72171a.k("null");
    }

    public void s(short s10) {
        if (this.f72177g) {
            F(String.valueOf(s10));
        } else {
            this.f72171a.l(s10);
        }
    }

    public void u(boolean z10) {
        if (this.f72177g) {
            F(String.valueOf(z10));
        } else {
            this.f72171a.m(z10);
        }
    }

    public void w(f fVar, int i10) {
        C6496s.h(fVar, "enumDescriptor");
        F(fVar.e(i10));
    }

    public void x(float f10) {
        if (this.f72177g) {
            F(String.valueOf(f10));
        } else {
            this.f72171a.h(f10);
        }
        if (this.f72176f.a()) {
            return;
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw F.b(Float.valueOf(f10), this.f72171a.f72218a.toString());
        }
    }

    public void y(char c10) {
        F(String.valueOf(c10));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public X(C6608z zVar, C6538b bVar, d0 d0Var, m[] mVarArr) {
        this(C6605w.a(zVar, bVar), bVar, d0Var, mVarArr);
        C6496s.h(zVar, "output");
        C6496s.h(bVar, "json");
        C6496s.h(d0Var, "mode");
        C6496s.h(mVarArr, "modeReuseCache");
    }
}

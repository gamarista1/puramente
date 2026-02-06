package mh;

import ih.e;
import ih.f;
import ih.j;
import ih.k;
import jh.d;
import kh.Z;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6504C;
import lf.C6506E;
import lf.C6508G;
import lf.C6511J;
import lf.C6514M;
import lh.C6538b;
import lh.g;
import lh.i;
import lh.m;
import lh.p;
import lh.t;
import nh.C6624e;
import yf.C6798l;

/* renamed from: mh.d  reason: case insensitive filesystem */
abstract class C6587d extends Z implements m {

    /* renamed from: b  reason: collision with root package name */
    private final C6538b f72192b;

    /* renamed from: c  reason: collision with root package name */
    private final C6798l f72193c;

    /* renamed from: d  reason: collision with root package name */
    protected final g f72194d;

    /* renamed from: e  reason: collision with root package name */
    private String f72195e;

    /* renamed from: mh.d$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6587d f72196a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6587d dVar) {
            super(1);
            this.f72196a = dVar;
        }

        public final void a(i iVar) {
            C6496s.h(iVar, "node");
            C6587d dVar = this.f72196a;
            dVar.u0(C6587d.d0(dVar), iVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((i) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: mh.d$b */
    public static final class b extends jh.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6587d f72197a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f72198b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f72199c;

        b(C6587d dVar, String str, f fVar) {
            this.f72197a = dVar;
            this.f72198b = str;
            this.f72199c = fVar;
        }

        public void F(String str) {
            C6496s.h(str, "value");
            this.f72197a.u0(this.f72198b, new p(str, false, this.f72199c));
        }

        public C6624e a() {
            return this.f72197a.d().a();
        }
    }

    /* renamed from: mh.d$c */
    public static final class c extends jh.b {

        /* renamed from: a  reason: collision with root package name */
        private final C6624e f72200a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6587d f72201b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f72202c;

        c(C6587d dVar, String str) {
            this.f72201b = dVar;
            this.f72202c = str;
            this.f72200a = dVar.d().a();
        }

        public void D(int i10) {
            J(C6590g.a(C6506E.b(i10), 10));
        }

        public final void J(String str) {
            C6496s.h(str, "s");
            this.f72201b.u0(this.f72202c, new p(str, false, (f) null, 4, (DefaultConstructorMarker) null));
        }

        public C6624e a() {
            return this.f72200a;
        }

        public void h(byte b10) {
            J(C6504C.f(C6504C.b(b10)));
        }

        public void n(long j10) {
            J(C6591h.a(C6508G.b(j10), 10));
        }

        public void s(short s10) {
            J(C6511J.f(C6511J.b(s10)));
        }
    }

    public /* synthetic */ C6587d(C6538b bVar, C6798l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, lVar);
    }

    public static final /* synthetic */ String d0(C6587d dVar) {
        return (String) dVar.U();
    }

    private final b s0(String str, f fVar) {
        return new b(this, str, fVar);
    }

    private final c t0(String str) {
        return new c(this, str);
    }

    /* access modifiers changed from: protected */
    public void T(f fVar) {
        C6496s.h(fVar, "descriptor");
        this.f72193c.invoke(q0());
    }

    /* access modifiers changed from: protected */
    public String Z(String str, String str2) {
        C6496s.h(str, "parentName");
        C6496s.h(str2, "childName");
        return str2;
    }

    public final C6624e a() {
        return this.f72192b.a();
    }

    /* access modifiers changed from: protected */
    public String a0(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return G.g(fVar, this.f72192b, i10);
    }

    public d b(f fVar) {
        C6798l lVar;
        boolean z10;
        C6587d dVar;
        C6496s.h(fVar, "descriptor");
        if (V() == null) {
            lVar = this.f72193c;
        } else {
            lVar = new a(this);
        }
        j h10 = fVar.h();
        if (C6496s.c(h10, k.b.f68507a)) {
            z10 = true;
        } else {
            z10 = h10 instanceof ih.d;
        }
        if (z10) {
            dVar = new P(this.f72192b, lVar);
        } else if (C6496s.c(h10, k.c.f68508a)) {
            C6538b bVar = this.f72192b;
            f a10 = e0.a(fVar.g(0), bVar.a());
            j h11 = a10.h();
            if ((h11 instanceof e) || C6496s.c(h11, j.b.f68505a)) {
                dVar = new S(this.f72192b, lVar);
            } else if (bVar.f().b()) {
                dVar = new P(this.f72192b, lVar);
            } else {
                throw F.d(a10);
            }
        } else {
            dVar = new N(this.f72192b, lVar);
        }
        String str = this.f72195e;
        if (str != null) {
            C6496s.e(str);
            dVar.u0(str, lh.j.c(fVar.i()));
            this.f72195e = null;
        }
        return dVar;
    }

    public final C6538b d() {
        return this.f72192b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public void I(String str, boolean z10) {
        C6496s.h(str, "tag");
        u0(str, lh.j.a(Boolean.valueOf(z10)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void J(String str, byte b10) {
        C6496s.h(str, "tag");
        u0(str, lh.j.b(Byte.valueOf(b10)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public void K(String str, char c10) {
        C6496s.h(str, "tag");
        u0(str, lh.j.c(String.valueOf(c10)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public void L(String str, double d10) {
        C6496s.h(str, "tag");
        u0(str, lh.j.b(Double.valueOf(d10)));
        if (this.f72194d.a()) {
            return;
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw F.c(Double.valueOf(d10), str, q0().toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public void M(String str, f fVar, int i10) {
        C6496s.h(str, "tag");
        C6496s.h(fVar, "enumDescriptor");
        u0(str, lh.j.c(fVar.e(i10)));
    }

    public jh.f j(f fVar) {
        C6496s.h(fVar, "descriptor");
        if (V() != null) {
            return super.j(fVar);
        }
        return new J(this.f72192b, this.f72193c).j(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public void N(String str, float f10) {
        C6496s.h(str, "tag");
        u0(str, lh.j.b(Float.valueOf(f10)));
        if (this.f72194d.a()) {
            return;
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw F.c(Float.valueOf(f10), str, q0().toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public jh.f O(String str, f fVar) {
        C6496s.h(str, "tag");
        C6496s.h(fVar, "inlineDescriptor");
        if (Y.b(fVar)) {
            return t0(str);
        }
        if (Y.a(fVar)) {
            return s0(str, fVar);
        }
        return super.O(str, fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public void P(String str, int i10) {
        C6496s.h(str, "tag");
        u0(str, lh.j.b(Integer.valueOf(i10)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (d().f().e() != lh.C6537a.NONE) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        if (kotlin.jvm.internal.C6496s.c(r1, ih.k.d.f68509a) == false) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(gh.C5987k r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.Object r0 = r3.V()
            if (r0 != 0) goto L_0x002c
            ih.f r0 = r4.getDescriptor()
            nh.e r1 = r3.a()
            ih.f r0 = mh.e0.a(r0, r1)
            boolean r0 = mh.c0.b(r0)
            if (r0 != 0) goto L_0x001e
            goto L_0x002c
        L_0x001e:
            mh.J r0 = new mh.J
            lh.b r1 = r3.f72192b
            yf.l r2 = r3.f72193c
            r0.<init>(r1, r2)
            r0.m(r4, r5)
            goto L_0x00ea
        L_0x002c:
            lh.b r0 = r3.d()
            lh.g r0 = r0.f()
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x003f
            r4.serialize(r3, r5)
            goto L_0x00ea
        L_0x003f:
            boolean r0 = r4 instanceof kh.C6441b
            if (r0 == 0) goto L_0x0054
            lh.b r1 = r3.d()
            lh.g r1 = r1.f()
            lh.a r1 = r1.e()
            lh.a r2 = lh.C6537a.NONE
            if (r1 == r2) goto L_0x009c
            goto L_0x0089
        L_0x0054:
            lh.b r1 = r3.d()
            lh.g r1 = r1.f()
            lh.a r1 = r1.e()
            int[] r2 = mh.U.a.f72158a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L_0x009c
            r2 = 2
            if (r1 == r2) goto L_0x009c
            r2 = 3
            if (r1 != r2) goto L_0x0096
            ih.f r1 = r4.getDescriptor()
            ih.j r1 = r1.h()
            ih.k$a r2 = ih.k.a.f68506a
            boolean r2 = kotlin.jvm.internal.C6496s.c(r1, r2)
            if (r2 != 0) goto L_0x0089
            ih.k$d r2 = ih.k.d.f68509a
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r2)
            if (r1 == 0) goto L_0x009c
        L_0x0089:
            ih.f r1 = r4.getDescriptor()
            lh.b r2 = r3.d()
            java.lang.String r1 = mh.U.c(r1, r2)
            goto L_0x009d
        L_0x0096:
            lf.s r4 = new lf.s
            r4.<init>()
            throw r4
        L_0x009c:
            r1 = 0
        L_0x009d:
            if (r0 == 0) goto L_0x00e3
            r0 = r4
            kh.b r0 = (kh.C6441b) r0
            if (r5 == 0) goto L_0x00bf
            gh.k r0 = gh.C5982f.b(r0, r3, r5)
            if (r1 == 0) goto L_0x00ad
            mh.U.e(r4, r0, r1)
        L_0x00ad:
            ih.f r4 = r0.getDescriptor()
            ih.j r4 = r4.h()
            mh.U.b(r4)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>"
            kotlin.jvm.internal.C6496s.f(r0, r4)
            r4 = r0
            goto L_0x00e3
        L_0x00bf:
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
        L_0x00e3:
            if (r1 == 0) goto L_0x00e7
            r3.f72195e = r1
        L_0x00e7:
            r4.serialize(r3, r5)
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.C6587d.m(gh.k, java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public void Q(String str, long j10) {
        C6496s.h(str, "tag");
        u0(str, lh.j.b(Long.valueOf(j10)));
    }

    /* access modifiers changed from: protected */
    public void n0(String str) {
        C6496s.h(str, "tag");
        u0(str, t.INSTANCE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public void R(String str, short s10) {
        C6496s.h(str, "tag");
        u0(str, lh.j.b(Short.valueOf(s10)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void S(String str, String str2) {
        C6496s.h(str, "tag");
        C6496s.h(str2, "value");
        u0(str, lh.j.c(str2));
    }

    public boolean q(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return this.f72194d.h();
    }

    public abstract i q0();

    public void r() {
        String str = (String) V();
        if (str == null) {
            this.f72193c.invoke(t.INSTANCE);
        } else {
            n0(str);
        }
    }

    /* access modifiers changed from: protected */
    public final C6798l r0() {
        return this.f72193c;
    }

    public abstract void u0(String str, i iVar);

    private C6587d(C6538b bVar, C6798l lVar) {
        this.f72192b = bVar;
        this.f72193c = lVar;
        this.f72194d = bVar.f();
    }

    public void z() {
    }
}

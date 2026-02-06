package Dg;

import Eg.n;
import Fg.C5366d0;
import Fg.F0;
import Fg.G0;
import Fg.N0;
import Fg.S;
import Fg.W;
import Of.C5487e;
import Of.C5490h;
import Of.C5495m;
import Of.l0;
import Of.q0;
import Rf.C5518g;
import ig.r;
import java.util.List;
import kg.C6436c;
import kg.g;
import kg.h;
import kotlin.jvm.internal.C6496s;
import ng.f;

public final class P extends C5518g implements C5358t {

    /* renamed from: k  reason: collision with root package name */
    private final r f62695k;

    /* renamed from: l  reason: collision with root package name */
    private final C6436c f62696l;

    /* renamed from: m  reason: collision with root package name */
    private final g f62697m;

    /* renamed from: n  reason: collision with root package name */
    private final h f62698n;

    /* renamed from: o  reason: collision with root package name */
    private final C5357s f62699o;

    /* renamed from: p  reason: collision with root package name */
    private C5366d0 f62700p;

    /* renamed from: q  reason: collision with root package name */
    private C5366d0 f62701q;

    /* renamed from: r  reason: collision with root package name */
    private List f62702r;

    /* renamed from: s  reason: collision with root package name */
    private C5366d0 f62703s;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public P(Eg.n r13, Of.C5495m r14, Pf.h r15, ng.f r16, Of.C5502u r17, ig.r r18, kg.C6436c r19, kg.g r20, kg.h r21, Dg.C5357s r22) {
        /*
            r12 = this;
            r7 = r12
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            java.lang.String r0 = "storageManager"
            r1 = r13
            kotlin.jvm.internal.C6496s.h(r13, r0)
            java.lang.String r0 = "containingDeclaration"
            r2 = r14
            kotlin.jvm.internal.C6496s.h(r14, r0)
            java.lang.String r0 = "annotations"
            r3 = r15
            kotlin.jvm.internal.C6496s.h(r15, r0)
            java.lang.String r0 = "name"
            r4 = r16
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "visibility"
            r6 = r17
            kotlin.jvm.internal.C6496s.h(r6, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.C6496s.h(r9, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.C6496s.h(r10, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.C6496s.h(r11, r0)
            Of.h0 r5 = Of.h0.f64497a
            java.lang.String r0 = "NO_SOURCE"
            kotlin.jvm.internal.C6496s.g(r5, r0)
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f62695k = r8
            r7.f62696l = r9
            r7.f62697m = r10
            r7.f62698n = r11
            r0 = r22
            r7.f62699o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dg.P.<init>(Eg.n, Of.m, Pf.h, ng.f, Of.u, ig.r, kg.c, kg.g, kg.h, Dg.s):void");
    }

    public g F() {
        return this.f62697m;
    }

    public C5366d0 H() {
        C5366d0 d0Var = this.f62701q;
        if (d0Var != null) {
            return d0Var;
        }
        C6496s.v("expandedType");
        return null;
    }

    public C6436c K() {
        return this.f62696l;
    }

    public C5357s L() {
        return this.f62699o;
    }

    /* access modifiers changed from: protected */
    public List R0() {
        List list = this.f62702r;
        if (list != null) {
            return list;
        }
        C6496s.v("typeConstructorParameters");
        return null;
    }

    /* renamed from: U0 */
    public r g0() {
        return this.f62695k;
    }

    public h V0() {
        return this.f62698n;
    }

    public final void W0(List list, C5366d0 d0Var, C5366d0 d0Var2) {
        C6496s.h(list, "declaredTypeParameters");
        C6496s.h(d0Var, "underlyingType");
        C6496s.h(d0Var2, "expandedType");
        S0(list);
        this.f62700p = d0Var;
        this.f62701q = d0Var2;
        this.f62702r = q0.g(this);
        this.f62703s = M0();
    }

    /* renamed from: X0 */
    public l0 c(G0 g02) {
        C6496s.h(g02, "substitutor");
        if (g02.k()) {
            return this;
        }
        n N10 = N();
        C5495m b10 = b();
        C6496s.g(b10, "getContainingDeclaration(...)");
        Pf.h annotations = getAnnotations();
        C6496s.g(annotations, "<get-annotations>(...)");
        f name = getName();
        C6496s.g(name, "getName(...)");
        P p10 = new P(N10, b10, annotations, name, getVisibility(), g0(), K(), F(), V0(), L());
        List q10 = q();
        C5366d0 u02 = u0();
        N0 n02 = N0.INVARIANT;
        S n10 = g02.n(u02, n02);
        C6496s.g(n10, "safeSubstitute(...)");
        C5366d0 a10 = F0.a(n10);
        S n11 = g02.n(H(), n02);
        C6496s.g(n11, "safeSubstitute(...)");
        p10.W0(q10, a10, F0.a(n11));
        return p10;
    }

    public C5366d0 p() {
        C5366d0 d0Var = this.f62703s;
        if (d0Var != null) {
            return d0Var;
        }
        C6496s.v("defaultTypeImpl");
        return null;
    }

    public C5487e u() {
        if (W.a(H())) {
            return null;
        }
        C5490h o10 = H().N0().o();
        if (o10 instanceof C5487e) {
            return (C5487e) o10;
        }
        return null;
    }

    public C5366d0 u0() {
        C5366d0 d0Var = this.f62700p;
        if (d0Var != null) {
            return d0Var;
        }
        C6496s.v("underlyingType");
        return null;
    }
}

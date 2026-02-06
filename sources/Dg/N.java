package Dg;

import Of.C5484b;
import Of.C5495m;
import Of.C5502u;
import Of.E;
import Of.Z;
import Of.h0;
import Rf.K;
import ig.n;
import kg.C6435b;
import kg.C6436c;
import kg.g;
import kg.h;
import kotlin.jvm.internal.C6496s;
import ng.f;

public final class N extends K implements C5341b {

    /* renamed from: C  reason: collision with root package name */
    private final n f62685C;

    /* renamed from: D  reason: collision with root package name */
    private final C6436c f62686D;

    /* renamed from: E  reason: collision with root package name */
    private final g f62687E;

    /* renamed from: F  reason: collision with root package name */
    private final h f62688F;

    /* renamed from: G  reason: collision with root package name */
    private final C5357s f62689G;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public N(Of.C5495m r18, Of.Z r19, Pf.h r20, Of.E r21, Of.C5502u r22, boolean r23, ng.f r24, Of.C5484b.a r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, ig.n r31, kg.C6436c r32, kg.g r33, kg.h r34, Dg.C5357s r35) {
        /*
            r17 = this;
            r15 = r17
            r14 = r31
            r13 = r32
            r12 = r33
            r11 = r34
            java.lang.String r0 = "containingDeclaration"
            r1 = r18
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "annotations"
            r3 = r20
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "modality"
            r4 = r21
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "visibility"
            r5 = r22
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.String r0 = "name"
            r7 = r24
            kotlin.jvm.internal.C6496s.h(r7, r0)
            java.lang.String r0 = "kind"
            r8 = r25
            kotlin.jvm.internal.C6496s.h(r8, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.C6496s.h(r14, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.C6496s.h(r13, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.C6496s.h(r12, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.C6496s.h(r11, r0)
            Of.h0 r9 = Of.h0.f64497a
            r16 = 0
            r0 = r17
            r2 = r19
            r6 = r23
            r10 = r26
            r11 = r27
            r12 = r30
            r13 = r16
            r14 = r28
            r15 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r31
            r0.f62685C = r1
            r1 = r32
            r0.f62686D = r1
            r1 = r33
            r0.f62687E = r1
            r1 = r34
            r0.f62688F = r1
            r1 = r35
            r0.f62689G = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dg.N.<init>(Of.m, Of.Z, Pf.h, Of.E, Of.u, boolean, ng.f, Of.b$a, boolean, boolean, boolean, boolean, boolean, ig.n, kg.c, kg.g, kg.h, Dg.s):void");
    }

    public g F() {
        return this.f62687E;
    }

    public C6436c K() {
        return this.f62686D;
    }

    public C5357s L() {
        return this.f62689G;
    }

    /* access modifiers changed from: protected */
    public K P0(C5495m mVar, E e10, C5502u uVar, Z z10, C5484b.a aVar, f fVar, h0 h0Var) {
        Z z11 = z10;
        f fVar2 = fVar;
        C6496s.h(mVar, "newOwner");
        C6496s.h(e10, "newModality");
        C6496s.h(uVar, "newVisibility");
        C6496s.h(aVar, "kind");
        C6496s.h(fVar, "newName");
        C6496s.h(h0Var, "source");
        return new N(mVar, z11, getAnnotations(), e10, uVar, O(), fVar2, aVar, y0(), c0(), isExternal(), C(), k0(), g0(), K(), F(), g1(), L());
    }

    /* renamed from: f1 */
    public n g0() {
        return this.f62685C;
    }

    public h g1() {
        return this.f62688F;
    }

    public boolean isExternal() {
        Boolean f10 = C6435b.f71530E.d(g0().a0());
        C6496s.g(f10, "get(...)");
        return f10.booleanValue();
    }
}

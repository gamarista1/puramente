package Dg;

import Of.C5490h;
import Of.N;
import Qf.b;
import Vf.a;
import Wf.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.Y;
import ng.c;
import ng.f;
import yf.C6798l;
import yg.C6805d;

public class M extends w {

    /* renamed from: g  reason: collision with root package name */
    private final N f62682g;

    /* renamed from: h  reason: collision with root package name */
    private final String f62683h;

    /* renamed from: i  reason: collision with root package name */
    private final c f62684i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public M(Of.N r17, ig.l r18, kg.C6436c r19, kg.C6434a r20, Dg.C5357s r21, Bg.C5328n r22, java.lang.String r23, yf.C6787a r24) {
        /*
            r16 = this;
            r6 = r16
            r14 = r17
            r15 = r23
            java.lang.String r0 = "packageDescriptor"
            kotlin.jvm.internal.C6496s.h(r14, r0)
            java.lang.String r0 = "proto"
            r1 = r18
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "nameResolver"
            r2 = r19
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "metadataVersion"
            r3 = r20
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "components"
            r4 = r22
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "debugName"
            kotlin.jvm.internal.C6496s.h(r15, r0)
            java.lang.String r0 = "classNames"
            r5 = r24
            kotlin.jvm.internal.C6496s.h(r5, r0)
            kg.g r10 = new kg.g
            ig.t r0 = r18.V()
            java.lang.String r7 = "getTypeTable(...)"
            kotlin.jvm.internal.C6496s.g(r0, r7)
            r10.<init>(r0)
            kg.h$a r0 = kg.h.f71575b
            ig.w r7 = r18.W()
            java.lang.String r8 = "getVersionRequirementTable(...)"
            kotlin.jvm.internal.C6496s.g(r7, r8)
            kg.h r11 = r0.a(r7)
            r7 = r22
            r8 = r17
            r9 = r19
            r12 = r20
            r13 = r21
            Bg.p r2 = r7.a(r8, r9, r10, r11, r12, r13)
            java.util.List r3 = r18.O()
            java.lang.String r0 = "getFunctionList(...)"
            kotlin.jvm.internal.C6496s.g(r3, r0)
            java.util.List r4 = r18.R()
            java.lang.String r0 = "getPropertyList(...)"
            kotlin.jvm.internal.C6496s.g(r4, r0)
            java.util.List r7 = r18.U()
            java.lang.String r0 = "getTypeAliasList(...)"
            kotlin.jvm.internal.C6496s.g(r7, r0)
            r0 = r16
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f62682g = r14
            r6.f62683h = r15
            ng.c r0 = r17.f()
            r6.f62684i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dg.M.<init>(Of.N, ig.l, kg.c, kg.a, Dg.s, Bg.n, java.lang.String, yf.a):void");
    }

    /* renamed from: B */
    public List f(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        C6496s.h(lVar, "nameFilter");
        Collection m10 = m(dVar, lVar, d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<b> l10 = s().c().l();
        ArrayList arrayList = new ArrayList();
        for (b b10 : l10) {
            C6565s.D(arrayList, b10.b(this.f62684i));
        }
        return C6565s.K0(m10, arrayList);
    }

    public void C(f fVar, Wf.b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        a.b(s().c().p(), bVar, this.f62682g, fVar);
    }

    public C5490h e(f fVar, Wf.b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        C(fVar, bVar);
        return super.e(fVar, bVar);
    }

    /* access modifiers changed from: protected */
    public void j(Collection collection, C6798l lVar) {
        C6496s.h(collection, "result");
        C6496s.h(lVar, "nameFilter");
    }

    /* access modifiers changed from: protected */
    public ng.b p(f fVar) {
        C6496s.h(fVar, "name");
        return new ng.b(this.f62684i, fVar);
    }

    public String toString() {
        return this.f62683h;
    }

    /* access modifiers changed from: protected */
    public Set v() {
        return Y.e();
    }

    /* access modifiers changed from: protected */
    public Set w() {
        return Y.e();
    }

    /* access modifiers changed from: protected */
    public Set x() {
        return Y.e();
    }

    /* access modifiers changed from: protected */
    public boolean z(f fVar) {
        C6496s.h(fVar, "name");
        if (!super.z(fVar)) {
            Iterable<b> l10 = s().c().l();
            if (!(l10 instanceof Collection) || !((Collection) l10).isEmpty()) {
                for (b c10 : l10) {
                    if (c10.c(this.f62684i, fVar)) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}

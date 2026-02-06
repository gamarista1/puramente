package Dg;

import Bg.C5330p;
import Bg.X;
import Rf.C5513b;
import ig.q;
import ig.s;
import java.util.ArrayList;
import java.util.List;
import kg.f;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import vg.C6755e;

public final class S extends C5513b {

    /* renamed from: k  reason: collision with root package name */
    private final C5330p f62705k;

    /* renamed from: l  reason: collision with root package name */
    private final s f62706l;

    /* renamed from: m  reason: collision with root package name */
    private final C5340a f62707m;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public S(Bg.C5330p r12, ig.s r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.C6496s.h(r12, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.C6496s.h(r13, r0)
            Eg.n r2 = r12.h()
            Of.m r3 = r12.e()
            Pf.h$a r0 = Pf.h.f64602L
            Pf.h r4 = r0.b()
            kg.c r0 = r12.g()
            int r1 = r13.N()
            ng.f r5 = Bg.L.b(r0, r1)
            Bg.O r0 = Bg.O.f62485a
            ig.s$c r1 = r13.T()
            java.lang.String r6 = "getVariance(...)"
            kotlin.jvm.internal.C6496s.g(r1, r6)
            Fg.N0 r6 = r0.d(r1)
            boolean r7 = r13.O()
            Of.h0 r9 = Of.h0.f64497a
            Of.k0$a r10 = Of.k0.a.f64500a
            r1 = r11
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f62705k = r12
            r11.f62706l = r13
            Dg.a r13 = new Dg.a
            Eg.n r12 = r12.h()
            Dg.Q r14 = new Dg.Q
            r14.<init>(r11)
            r13.<init>(r12, r14)
            r11.f62707m = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dg.S.<init>(Bg.p, ig.s, int):void");
    }

    /* access modifiers changed from: private */
    public static final List N0(S s10) {
        return C6565s.e1(s10.f62705k.c().d().a(s10.f62706l, s10.f62705k.g()));
    }

    /* access modifiers changed from: protected */
    public List L0() {
        List s10 = f.s(this.f62706l, this.f62705k.j());
        if (s10.isEmpty()) {
            return C6565s.e(C6755e.m(this).y());
        }
        Iterable<q> iterable = s10;
        X i10 = this.f62705k.i();
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (q u10 : iterable) {
            arrayList.add(i10.u(u10));
        }
        return arrayList;
    }

    /* renamed from: O0 */
    public C5340a getAnnotations() {
        return this.f62707m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public Void K0(Fg.S s10) {
        C6496s.h(s10, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}

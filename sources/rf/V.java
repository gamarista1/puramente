package Rf;

import Fg.G0;
import Fg.S;
import Of.C5483a;
import Of.C5484b;
import Of.C5495m;
import Of.C5497o;
import Of.C5501t;
import Of.C5502u;
import Of.h0;
import Of.t0;
import Pf.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import mf.C6565s;
import ng.f;
import tg.g;
import yf.C6787a;

public class V extends X implements t0 {

    /* renamed from: l  reason: collision with root package name */
    public static final a f64815l = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private final int f64816f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f64817g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f64818h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f64819i;

    /* renamed from: j  reason: collision with root package name */
    private final S f64820j;

    /* renamed from: k  reason: collision with root package name */
    private final t0 f64821k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final V a(C5483a aVar, t0 t0Var, int i10, h hVar, f fVar, S s10, boolean z10, boolean z11, boolean z12, S s11, h0 h0Var, C6787a aVar2) {
            C5483a aVar3 = aVar;
            C6496s.h(aVar, "containingDeclaration");
            C6496s.h(hVar, "annotations");
            C6496s.h(fVar, "name");
            C6496s.h(s10, "outType");
            C6496s.h(h0Var, "source");
            if (aVar2 == null) {
                return new V(aVar, t0Var, i10, hVar, fVar, s10, z10, z11, z12, s11, h0Var);
            }
            return new b(aVar, t0Var, i10, hVar, fVar, s10, z10, z11, z12, s11, h0Var, aVar2);
        }

        private a() {
        }
    }

    public static final class b extends V {

        /* renamed from: m  reason: collision with root package name */
        private final Lazy f64822m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5483a aVar, t0 t0Var, int i10, h hVar, f fVar, S s10, boolean z10, boolean z11, boolean z12, S s11, h0 h0Var, C6787a aVar2) {
            super(aVar, t0Var, i10, hVar, fVar, s10, z10, z11, z12, s11, h0Var);
            C6496s.h(aVar, "containingDeclaration");
            C6496s.h(hVar, "annotations");
            C6496s.h(fVar, "name");
            C6496s.h(s10, "outType");
            C6496s.h(h0Var, "source");
            C6496s.h(aVar2, "destructuringVariables");
            this.f64822m = C6531o.b(aVar2);
        }

        /* access modifiers changed from: private */
        public static final List O0(b bVar) {
            return bVar.P0();
        }

        public final List P0() {
            return (List) this.f64822m.getValue();
        }

        public t0 T(C5483a aVar, f fVar, int i10) {
            C5483a aVar2 = aVar;
            C6496s.h(aVar2, "newOwner");
            f fVar2 = fVar;
            C6496s.h(fVar2, "newName");
            h annotations = getAnnotations();
            C6496s.g(annotations, "<get-annotations>(...)");
            S type = getType();
            C6496s.g(type, "getType(...)");
            boolean A02 = A0();
            boolean s02 = s0();
            boolean r02 = r0();
            S v02 = v0();
            h0 h0Var = h0.f64497a;
            C6496s.g(h0Var, "NO_SOURCE");
            return new b(aVar2, (t0) null, i10, annotations, fVar2, type, A02, s02, r02, v02, h0Var, new W(this));
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [Of.t0] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V(Of.C5483a r8, Of.t0 r9, int r10, Pf.h r11, ng.f r12, Fg.S r13, boolean r14, boolean r15, boolean r16, Fg.S r17, Of.h0 r18) {
        /*
            r7 = this;
            r6 = r7
            java.lang.String r0 = "containingDeclaration"
            r1 = r8
            kotlin.jvm.internal.C6496s.h(r8, r0)
            java.lang.String r0 = "annotations"
            r2 = r11
            kotlin.jvm.internal.C6496s.h(r11, r0)
            java.lang.String r0 = "name"
            r3 = r12
            kotlin.jvm.internal.C6496s.h(r12, r0)
            java.lang.String r0 = "outType"
            r4 = r13
            kotlin.jvm.internal.C6496s.h(r13, r0)
            java.lang.String r0 = "source"
            r5 = r18
            kotlin.jvm.internal.C6496s.h(r5, r0)
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r10
            r6.f64816f = r0
            r0 = r14
            r6.f64817g = r0
            r0 = r15
            r6.f64818h = r0
            r0 = r16
            r6.f64819i = r0
            r0 = r17
            r6.f64820j = r0
            if (r9 != 0) goto L_0x0039
            r0 = r6
            goto L_0x003a
        L_0x0039:
            r0 = r9
        L_0x003a:
            r6.f64821k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Rf.V.<init>(Of.a, Of.t0, int, Pf.h, ng.f, Fg.S, boolean, boolean, boolean, Fg.S, Of.h0):void");
    }

    public static final V K0(C5483a aVar, t0 t0Var, int i10, h hVar, f fVar, S s10, boolean z10, boolean z11, boolean z12, S s11, h0 h0Var, C6787a aVar2) {
        return f64815l.a(aVar, t0Var, i10, hVar, fVar, s10, z10, z11, z12, s11, h0Var, aVar2);
    }

    public boolean A0() {
        if (this.f64817g) {
            C5483a b10 = b();
            C6496s.f(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            if (((C5484b) b10).h().a()) {
                return true;
            }
        }
        return false;
    }

    public Void L0() {
        return null;
    }

    /* renamed from: M0 */
    public t0 c(G0 g02) {
        C6496s.h(g02, "substitutor");
        if (g02.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    public boolean O() {
        return false;
    }

    public t0 T(C5483a aVar, f fVar, int i10) {
        C6496s.h(aVar, "newOwner");
        C6496s.h(fVar, "newName");
        h annotations = getAnnotations();
        C6496s.g(annotations, "<get-annotations>(...)");
        S type = getType();
        C6496s.g(type, "getType(...)");
        boolean A02 = A0();
        boolean s02 = s0();
        boolean r02 = r0();
        S v02 = v0();
        h0 h0Var = h0.f64497a;
        C6496s.g(h0Var, "NO_SOURCE");
        return new V(aVar, (t0) null, i10, annotations, fVar, type, A02, s02, r02, v02, h0Var);
    }

    public Object U(C5497o oVar, Object obj) {
        C6496s.h(oVar, "visitor");
        return oVar.b(this, obj);
    }

    public Collection e() {
        Collection e10 = b().e();
        C6496s.g(e10, "getOverriddenDescriptors(...)");
        Iterable<C5483a> iterable = e10;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (C5483a k10 : iterable) {
            arrayList.add((t0) k10.k().get(getIndex()));
        }
        return arrayList;
    }

    public int getIndex() {
        return this.f64816f;
    }

    public C5502u getVisibility() {
        C5502u uVar = C5501t.f64510f;
        C6496s.g(uVar, "LOCAL");
        return uVar;
    }

    public /* bridge */ /* synthetic */ g q0() {
        return (g) L0();
    }

    public boolean r0() {
        return this.f64819i;
    }

    public boolean s0() {
        return this.f64818h;
    }

    public S v0() {
        return this.f64820j;
    }

    public C5483a b() {
        C5495m b10 = super.b();
        C6496s.f(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (C5483a) b10;
    }

    public t0 a() {
        t0 t0Var = this.f64821k;
        return t0Var == this ? this : t0Var.a();
    }
}

package cg;

import Fg.A0;
import Fg.B0;
import Fg.C5366d0;
import Fg.D0;
import Fg.E0;
import Fg.F;
import Fg.I0;
import Fg.L;
import Fg.N0;
import Fg.S;
import Fg.V;
import Fg.W;
import Fg.r0;
import Fg.v0;
import Fg.x0;
import Gg.g;
import Hg.k;
import Hg.l;
import Of.C5487e;
import Of.C5490h;
import Of.m0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.C6565s;
import ng.b;
import vg.C6755e;
import yg.C6812k;

public final class i extends E0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f67352e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final C5798a f67353f;

    /* renamed from: g  reason: collision with root package name */
    private static final C5798a f67354g;

    /* renamed from: c  reason: collision with root package name */
    private final g f67355c;

    /* renamed from: d  reason: collision with root package name */
    private final A0 f67356d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        I0 i02 = I0.COMMON;
        f67353f = C5799b.b(i02, false, true, (m0) null, 5, (Object) null).l(C5800c.FLEXIBLE_LOWER_BOUND);
        f67354g = C5799b.b(i02, false, true, (m0) null, 5, (Object) null).l(C5800c.FLEXIBLE_UPPER_BOUND);
    }

    public i(A0 a02) {
        g gVar = new g();
        this.f67355c = gVar;
        this.f67356d = a02 == null ? new A0(gVar, (x0) null, 2, (DefaultConstructorMarker) null) : a02;
    }

    private final Pair j(C5366d0 d0Var, C5487e eVar, C5798a aVar) {
        C5366d0 d0Var2 = d0Var;
        C5487e eVar2 = eVar;
        C5798a aVar2 = aVar;
        if (d0Var.N0().getParameters().isEmpty()) {
            return C6502A.a(d0Var2, Boolean.FALSE);
        }
        if (Lf.i.c0(d0Var)) {
            B0 b02 = (B0) d0Var.L0().get(0);
            N0 b10 = b02.b();
            S type = b02.getType();
            C6496s.g(type, "getType(...)");
            return C6502A.a(V.k(d0Var.M0(), d0Var.N0(), C6565s.e(new D0(b10, l(type, aVar2))), d0Var.O0(), (g) null, 16, (Object) null), Boolean.FALSE);
        } else if (W.a(d0Var)) {
            return C6502A.a(l.d(k.ERROR_RAW_TYPE, d0Var.N0().toString()), Boolean.FALSE);
        } else {
            C6812k I10 = eVar2.I(this);
            C6496s.g(I10, "getMemberScope(...)");
            r0 M02 = d0Var.M0();
            v0 l10 = eVar.l();
            C6496s.g(l10, "getTypeConstructor(...)");
            List parameters = eVar.l().getParameters();
            C6496s.g(parameters, "getParameters(...)");
            Iterable<m0> iterable = parameters;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (m0 m0Var : iterable) {
                g gVar = this.f67355c;
                C6496s.e(m0Var);
                arrayList.add(F.b(gVar, m0Var, aVar, this.f67356d, (S) null, 8, (Object) null));
            }
            return C6502A.a(V.n(M02, l10, arrayList, d0Var.O0(), I10, new h(eVar2, this, d0Var2, aVar2)), Boolean.TRUE);
        }
    }

    /* access modifiers changed from: private */
    public static final C5366d0 k(C5487e eVar, i iVar, C5366d0 d0Var, C5798a aVar, g gVar) {
        C5487e b10;
        C6496s.h(gVar, "kotlinTypeRefiner");
        b n10 = C6755e.n(eVar);
        if (n10 == null || (b10 = gVar.b(n10)) == null || C6496s.c(b10, eVar)) {
            return null;
        }
        return (C5366d0) iVar.j(d0Var, b10, aVar).c();
    }

    private final S l(S s10, C5798a aVar) {
        C5490h o10 = s10.N0().o();
        if (o10 instanceof m0) {
            return l(this.f67356d.e((m0) o10, aVar.j(true)), aVar);
        }
        if (o10 instanceof C5487e) {
            C5490h o11 = L.d(s10).N0().o();
            if (o11 instanceof C5487e) {
                Pair j10 = j(L.c(s10), (C5487e) o10, f67353f);
                C5366d0 d0Var = (C5366d0) j10.a();
                boolean booleanValue = ((Boolean) j10.b()).booleanValue();
                Pair j11 = j(L.d(s10), (C5487e) o11, f67354g);
                C5366d0 d0Var2 = (C5366d0) j11.a();
                boolean booleanValue2 = ((Boolean) j11.b()).booleanValue();
                if (booleanValue || booleanValue2) {
                    return new k(d0Var, d0Var2);
                }
                return V.e(d0Var, d0Var2);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + o11 + "\" while for lower it's \"" + o10 + '\"').toString());
        }
        throw new IllegalStateException(("Unexpected declaration kind: " + o10).toString());
    }

    static /* synthetic */ S m(i iVar, S s10, C5798a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = new C5798a(I0.COMMON, (C5800c) null, false, false, (Set) null, (C5366d0) null, 62, (DefaultConstructorMarker) null);
        }
        return iVar.l(s10, aVar);
    }

    public boolean f() {
        return false;
    }

    /* renamed from: n */
    public D0 e(S s10) {
        C6496s.h(s10, SubscriberAttributeKt.JSON_NAME_KEY);
        return new D0(m(this, s10, (C5798a) null, 2, (Object) null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(A0 a02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : a02);
    }
}

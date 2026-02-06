package Nf;

import Eg.n;
import Of.C5484b;
import Of.C5487e;
import Of.C5501t;
import Of.E;
import Of.c0;
import Of.h0;
import Pf.h;
import Rf.O;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import ng.f;
import vg.C6755e;
import yg.C6807f;

public final class a extends C6807f {

    /* renamed from: e  reason: collision with root package name */
    public static final C0944a f64251e = new C0944a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final f f64252f;

    /* renamed from: Nf.a$a  reason: collision with other inner class name */
    public static final class C0944a {
        public /* synthetic */ C0944a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            return a.f64252f;
        }

        private C0944a() {
        }
    }

    static {
        f i10 = f.i("clone");
        C6496s.g(i10, "identifier(...)");
        f64252f = i10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(n nVar, C5487e eVar) {
        super(nVar, eVar);
        C6496s.h(nVar, "storageManager");
        C6496s.h(eVar, "containingClass");
    }

    /* access modifiers changed from: protected */
    public List j() {
        O l12 = O.l1(m(), h.f64602L.b(), f64252f, C5484b.a.DECLARATION, h0.f64497a);
        l12.R0((c0) null, m().J0(), C6565s.n(), C6565s.n(), C6565s.n(), C6755e.m(m()).i(), E.OPEN, C5501t.f64507c);
        return C6565s.e(l12);
    }
}

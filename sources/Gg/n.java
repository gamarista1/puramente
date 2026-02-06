package Gg;

import Fg.B0;
import Fg.M0;
import Fg.S;
import Kg.d;
import Lf.i;
import Of.C5490h;
import Of.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import lf.C6534r;
import mf.C6565s;
import sg.C6718b;
import yf.C6787a;

public final class n implements C6718b {

    /* renamed from: a  reason: collision with root package name */
    private final B0 f63193a;

    /* renamed from: b  reason: collision with root package name */
    private C6787a f63194b;

    /* renamed from: c  reason: collision with root package name */
    private final n f63195c;

    /* renamed from: d  reason: collision with root package name */
    private final m0 f63196d;

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f63197e;

    public n(B0 b02, C6787a aVar, n nVar, m0 m0Var) {
        C6496s.h(b02, "projection");
        this.f63193a = b02;
        this.f63194b = aVar;
        this.f63195c = nVar;
        this.f63196d = m0Var;
        this.f63197e = C6531o.a(C6534r.PUBLICATION, new j(this));
    }

    /* access modifiers changed from: private */
    public static final List c(n nVar) {
        C6787a aVar = nVar.f63194b;
        if (aVar != null) {
            return (List) aVar.invoke();
        }
        return null;
    }

    private final List i() {
        return (List) this.f63197e.getValue();
    }

    /* access modifiers changed from: private */
    public static final List r(n nVar, g gVar) {
        Iterable<M0> h10 = nVar.l();
        ArrayList arrayList = new ArrayList(C6565s.y(h10, 10));
        for (M0 S02 : h10) {
            arrayList.add(S02.S0(gVar));
        }
        return arrayList;
    }

    public B0 a() {
        return this.f63193a;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C6496s.c(n.class, cls)) {
            return false;
        }
        C6496s.f(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        n nVar = (n) obj;
        n nVar2 = this.f63195c;
        if (nVar2 == null) {
            nVar2 = this;
        }
        n nVar3 = nVar.f63195c;
        if (nVar3 != null) {
            obj = nVar3;
        }
        if (nVar2 == obj) {
            return true;
        }
        return false;
    }

    public List getParameters() {
        return C6565s.n();
    }

    /* renamed from: h */
    public List l() {
        List i10 = i();
        if (i10 == null) {
            return C6565s.n();
        }
        return i10;
    }

    public int hashCode() {
        n nVar = this.f63195c;
        if (nVar != null) {
            return nVar.hashCode();
        }
        return super.hashCode();
    }

    public final void j(List list) {
        C6496s.h(list, "supertypes");
        this.f63194b = new l(list);
    }

    public i m() {
        S type = a().getType();
        C6496s.g(type, "getType(...)");
        return d.n(type);
    }

    public C5490h o() {
        return null;
    }

    public boolean p() {
        return false;
    }

    /* renamed from: q */
    public n n(g gVar) {
        m mVar;
        C6496s.h(gVar, "kotlinTypeRefiner");
        B0 n10 = a().n(gVar);
        C6496s.g(n10, "refine(...)");
        if (this.f63194b != null) {
            mVar = new m(this, gVar);
        } else {
            mVar = null;
        }
        n nVar = this.f63195c;
        if (nVar == null) {
            nVar = this;
        }
        return new n(n10, mVar, nVar, this.f63196d);
    }

    public String toString() {
        return "CapturedType(" + a() + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(B0 b02, C6787a aVar, n nVar, m0 m0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b02, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : nVar, (i10 & 8) != 0 ? null : m0Var);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(B0 b02, List list, n nVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b02, list, (i10 & 4) != 0 ? null : nVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public n(B0 b02, List list, n nVar) {
        this(b02, new k(list), nVar, (m0) null, 8, (DefaultConstructorMarker) null);
        C6496s.h(b02, "projection");
        C6496s.h(list, "supertypes");
    }

    /* access modifiers changed from: private */
    public static final List b(List list) {
        return list;
    }

    /* access modifiers changed from: private */
    public static final List k(List list) {
        return list;
    }
}

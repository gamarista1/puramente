package bg;

import Fg.S;
import Of.c0;
import ag.k;
import bg.C5754U;
import eg.r;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import ng.f;

public abstract class b0 extends C5754U {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(k kVar) {
        super(kVar, (C5754U) null, 2, (DefaultConstructorMarker) null);
        C6496s.h(kVar, "c");
    }

    /* access modifiers changed from: protected */
    public void C(f fVar, Collection collection) {
        C6496s.h(fVar, "name");
        C6496s.h(collection, "result");
    }

    /* access modifiers changed from: protected */
    public c0 O() {
        return null;
    }

    /* access modifiers changed from: protected */
    public C5754U.a Y(r rVar, List list, S s10, List list2) {
        C6496s.h(rVar, "method");
        C6496s.h(list, "methodTypeParameters");
        C6496s.h(s10, "returnType");
        C6496s.h(list2, "valueParameters");
        return new C5754U.a(s10, (S) null, list2, list, false, C6565s.n());
    }
}

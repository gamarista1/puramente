package Pf;

import Fg.C5366d0;
import Fg.S;
import Lf.i;
import Of.h0;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import lf.C6534r;
import ng.c;

public final class l implements c {

    /* renamed from: a  reason: collision with root package name */
    private final i f64607a;

    /* renamed from: b  reason: collision with root package name */
    private final c f64608b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f64609c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f64610d;

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f64611e;

    public l(i iVar, c cVar, Map map, boolean z10) {
        C6496s.h(iVar, "builtIns");
        C6496s.h(cVar, "fqName");
        C6496s.h(map, "allValueArguments");
        this.f64607a = iVar;
        this.f64608b = cVar;
        this.f64609c = map;
        this.f64610d = z10;
        this.f64611e = C6531o.a(C6534r.PUBLICATION, new k(this));
    }

    /* access modifiers changed from: private */
    public static final C5366d0 c(l lVar) {
        return lVar.f64607a.o(lVar.f()).p();
    }

    public Map a() {
        return this.f64609c;
    }

    public c f() {
        return this.f64608b;
    }

    public S getType() {
        Object value = this.f64611e.getValue();
        C6496s.g(value, "getValue(...)");
        return (S) value;
    }

    public h0 i() {
        h0 h0Var = h0.f64497a;
        C6496s.g(h0Var, "NO_SOURCE");
        return h0Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(i iVar, c cVar, Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, cVar, map, (i10 & 8) != 0 ? false : z10);
    }
}

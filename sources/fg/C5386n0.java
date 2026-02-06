package Fg;

import Of.C5490h;
import Of.l0;
import Of.m0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.O;

/* renamed from: Fg.n0  reason: case insensitive filesystem */
public final class C5386n0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f63031e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C5386n0 f63032a;

    /* renamed from: b  reason: collision with root package name */
    private final l0 f63033b;

    /* renamed from: c  reason: collision with root package name */
    private final List f63034c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f63035d;

    /* renamed from: Fg.n0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5386n0 a(C5386n0 n0Var, l0 l0Var, List list) {
            C6496s.h(l0Var, "typeAliasDescriptor");
            C6496s.h(list, "arguments");
            List parameters = l0Var.l().getParameters();
            C6496s.g(parameters, "getParameters(...)");
            Iterable<m0> iterable = parameters;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (m0 a10 : iterable) {
                arrayList.add(a10.a());
            }
            return new C5386n0(n0Var, l0Var, list, O.w(C6565s.n1(arrayList, list)), (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ C5386n0(C5386n0 n0Var, l0 l0Var, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(n0Var, l0Var, list, map);
    }

    public final List a() {
        return this.f63034c;
    }

    public final l0 b() {
        return this.f63033b;
    }

    public final B0 c(v0 v0Var) {
        C6496s.h(v0Var, "constructor");
        C5490h o10 = v0Var.o();
        if (o10 instanceof m0) {
            return (B0) this.f63035d.get(o10);
        }
        return null;
    }

    public final boolean d(l0 l0Var) {
        boolean z10;
        C6496s.h(l0Var, "descriptor");
        if (!C6496s.c(this.f63033b, l0Var)) {
            C5386n0 n0Var = this.f63032a;
            if (n0Var != null) {
                z10 = n0Var.d(l0Var);
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
            return false;
        }
        return true;
    }

    private C5386n0(C5386n0 n0Var, l0 l0Var, List list, Map map) {
        this.f63032a = n0Var;
        this.f63033b = l0Var;
        this.f63034c = list;
        this.f63035d = map;
    }
}

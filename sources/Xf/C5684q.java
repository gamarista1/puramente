package Xf;

import Fg.A0;
import Fg.S;
import Of.C5483a;
import Of.C5487e;
import Of.c0;
import Of.g0;
import Of.t0;
import Rg.h;
import Rg.k;
import Zf.e;
import cg.i;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import rg.C6692j;
import rg.C6697o;

/* renamed from: Xf.q  reason: case insensitive filesystem */
public final class C5684q implements C6692j {

    /* renamed from: Xf.q$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f66389a;

        static {
            int[] iArr = new int[C6697o.i.a.values().length];
            try {
                iArr[C6697o.i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f66389a = iArr;
        }
    }

    /* access modifiers changed from: private */
    public static final S d(t0 t0Var) {
        return t0Var.getType();
    }

    public C6692j.b a(C5483a aVar, C5483a aVar2, C5487e eVar) {
        C6697o.i.a aVar3;
        S s10;
        C6496s.h(aVar, "superDescriptor");
        C6496s.h(aVar2, "subDescriptor");
        if (aVar2 instanceof e) {
            e eVar2 = (e) aVar2;
            List typeParameters = eVar2.getTypeParameters();
            C6496s.g(typeParameters, "getTypeParameters(...)");
            if (typeParameters.isEmpty()) {
                C6697o.i w10 = C6697o.w(aVar, aVar2);
                if (w10 != null) {
                    aVar3 = w10.c();
                } else {
                    aVar3 = null;
                }
                if (aVar3 != null) {
                    return C6692j.b.UNKNOWN;
                }
                List k10 = eVar2.k();
                C6496s.g(k10, "getValueParameters(...)");
                h x10 = k.x(C6565s.b0(k10), C5683p.f66388a);
                S returnType = eVar2.getReturnType();
                C6496s.e(returnType);
                h C10 = k.C(x10, returnType);
                c0 P10 = eVar2.P();
                if (P10 != null) {
                    s10 = P10.getType();
                } else {
                    s10 = null;
                }
                for (S s11 : k.B(C10, C6565s.r(s10))) {
                    if (!s11.L0().isEmpty() && !(s11.Q0() instanceof cg.k)) {
                        return C6692j.b.UNKNOWN;
                    }
                }
                C5483a aVar4 = (C5483a) aVar.c(new i((A0) null, 1, (DefaultConstructorMarker) null).c());
                if (aVar4 == null) {
                    return C6692j.b.UNKNOWN;
                }
                if (aVar4 instanceof g0) {
                    g0 g0Var = (g0) aVar4;
                    List typeParameters2 = g0Var.getTypeParameters();
                    C6496s.g(typeParameters2, "getTypeParameters(...)");
                    if (!typeParameters2.isEmpty()) {
                        aVar4 = g0Var.v().x(C6565s.n()).f();
                        C6496s.e(aVar4);
                    }
                }
                C6697o.i.a c10 = C6697o.f73033f.F(aVar4, aVar2, false).c();
                C6496s.g(c10, "getResult(...)");
                if (a.f66389a[c10.ordinal()] == 1) {
                    return C6692j.b.OVERRIDABLE;
                }
                return C6692j.b.UNKNOWN;
            }
        }
        return C6692j.b.UNKNOWN;
    }

    public C6692j.a b() {
        return C6692j.a.SUCCESS_ONLY;
    }
}

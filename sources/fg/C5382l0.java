package Fg;

import Lf.i;
import Of.C5490h;
import Of.C5491i;
import Of.C5495m;
import Of.C5507z;
import Of.m0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import vg.C6755e;

/* renamed from: Fg.l0  reason: case insensitive filesystem */
public abstract class C5382l0 {

    /* renamed from: Fg.l0$a */
    public static final class a extends w0 {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f63024d;

        a(List list) {
            this.f63024d = list;
        }

        public B0 k(v0 v0Var) {
            C6496s.h(v0Var, SubscriberAttributeKt.JSON_NAME_KEY);
            if (!this.f63024d.contains(v0Var)) {
                return null;
            }
            C5490h o10 = v0Var.o();
            C6496s.f(o10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return J0.s((m0) o10);
        }
    }

    private static final S a(List list, List list2, i iVar) {
        S p10 = G0.g(new a(list)).p((S) C6565s.o0(list2), N0.OUT_VARIANCE);
        if (p10 != null) {
            return p10;
        }
        C5366d0 y10 = iVar.y();
        C6496s.g(y10, "getDefaultBound(...)");
        return y10;
    }

    public static final S b(m0 m0Var) {
        C6496s.h(m0Var, "<this>");
        C5495m b10 = m0Var.b();
        C6496s.g(b10, "getContainingDeclaration(...)");
        if (b10 instanceof C5491i) {
            List parameters = ((C5491i) b10).l().getParameters();
            C6496s.g(parameters, "getParameters(...)");
            Iterable<m0> iterable = parameters;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (m0 l10 : iterable) {
                v0 l11 = l10.l();
                C6496s.g(l11, "getTypeConstructor(...)");
                arrayList.add(l11);
            }
            List upperBounds = m0Var.getUpperBounds();
            C6496s.g(upperBounds, "getUpperBounds(...)");
            return a(arrayList, upperBounds, C6755e.m(m0Var));
        } else if (b10 instanceof C5507z) {
            List typeParameters = ((C5507z) b10).getTypeParameters();
            C6496s.g(typeParameters, "getTypeParameters(...)");
            Iterable<m0> iterable2 = typeParameters;
            ArrayList arrayList2 = new ArrayList(C6565s.y(iterable2, 10));
            for (m0 l12 : iterable2) {
                v0 l13 = l12.l();
                C6496s.g(l13, "getTypeConstructor(...)");
                arrayList2.add(l13);
            }
            List upperBounds2 = m0Var.getUpperBounds();
            C6496s.g(upperBounds2, "getUpperBounds(...)");
            return a(arrayList2, upperBounds2, C6755e.m(m0Var));
        } else {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
    }
}

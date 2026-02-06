package Bg;

import Jg.j;
import Of.A;
import Of.I;
import Of.r0;
import ig.c;
import ig.q;
import java.util.ArrayList;
import java.util.List;
import kg.C6436c;
import kg.g;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;
import ng.f;
import yf.C6798l;

public abstract class Z {
    public static final r0 a(c cVar, C6436c cVar2, g gVar, C6798l lVar, C6798l lVar2) {
        j jVar;
        List list;
        C6496s.h(cVar, "<this>");
        C6496s.h(cVar2, "nameResolver");
        C6496s.h(gVar, "typeTable");
        C6496s.h(lVar, "typeDeserializer");
        C6496s.h(lVar2, "typeOfPublicProperty");
        if (cVar.M0() > 0) {
            Iterable N02 = cVar.N0();
            C6496s.g(N02, "getMultiFieldValueClassUnderlyingNameList(...)");
            Iterable<Integer> iterable = N02;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (Integer num : iterable) {
                C6496s.e(num);
                arrayList.add(L.b(cVar2, num.intValue()));
            }
            Pair a10 = C6502A.a(Integer.valueOf(cVar.Q0()), Integer.valueOf(cVar.P0()));
            if (C6496s.c(a10, C6502A.a(Integer.valueOf(arrayList.size()), 0))) {
                Iterable R02 = cVar.R0();
                C6496s.g(R02, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
                Iterable<Integer> iterable2 = R02;
                list = new ArrayList(C6565s.y(iterable2, 10));
                for (Integer num2 : iterable2) {
                    C6496s.e(num2);
                    list.add(gVar.a(num2.intValue()));
                }
            } else if (C6496s.c(a10, C6502A.a(0, Integer.valueOf(arrayList.size())))) {
                list = cVar.S0();
            } else {
                throw new IllegalStateException(("class " + L.b(cVar2, cVar.F0()) + " has illegal multi-field value class representation").toString());
            }
            C6496s.e(list);
            Iterable<Object> iterable3 = list;
            ArrayList arrayList2 = new ArrayList(C6565s.y(iterable3, 10));
            for (Object invoke : iterable3) {
                arrayList2.add(lVar.invoke(invoke));
            }
            return new I(C6565s.n1(arrayList, arrayList2));
        } else if (!cVar.o1()) {
            return null;
        } else {
            f b10 = L.b(cVar2, cVar.J0());
            q i10 = kg.f.i(cVar, gVar);
            if ((i10 != null && (jVar = (j) lVar.invoke(i10)) != null) || (jVar = (j) lVar2.invoke(b10)) != null) {
                return new A(b10, jVar);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + L.b(cVar2, cVar.F0()) + " with property " + b10).toString());
        }
    }
}

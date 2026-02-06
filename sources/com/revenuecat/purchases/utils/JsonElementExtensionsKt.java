package com.revenuecat.purchases.utils;

import Ef.m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lh.C6539c;
import lh.i;
import lh.j;
import lh.v;
import lh.x;
import mf.C6565s;
import mf.O;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Llh/i;", "", "", "", "asMap", "(Llh/i;)Ljava/util/Map;", "getExtractedContent", "(Llh/i;)Ljava/lang/Object;", "extractedContent", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class JsonElementExtensionsKt {
    public static final Map<String, Object> asMap(i iVar) {
        C6496s.h(iVar, "<this>");
        if (!(iVar instanceof v)) {
            return null;
        }
        Iterable<Map.Entry> entrySet = j.n(iVar).entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            Pair a10 = C6502A.a(entry.getKey(), getExtractedContent((i) entry.getValue()));
            linkedHashMap.put(a10.c(), a10.d());
        }
        return linkedHashMap;
    }

    private static final Object getExtractedContent(i iVar) {
        Double d10;
        if (iVar instanceof x) {
            x o10 = j.o(iVar);
            if (o10.b()) {
                return o10.a();
            }
            Boolean e10 = j.e(o10);
            d10 = e10;
            if (e10 == null) {
                Integer l10 = j.l(o10);
                d10 = l10;
                if (l10 == null) {
                    Long r10 = j.r(o10);
                    d10 = r10;
                    if (r10 == null) {
                        Float j10 = j.j(o10);
                        d10 = j10;
                        if (j10 == null) {
                            Double h10 = j.h(o10);
                            d10 = h10;
                            if (h10 == null) {
                                return j.f(o10);
                            }
                        }
                    }
                }
            }
        } else if (iVar instanceof C6539c) {
            C6539c<i> m10 = j.m(iVar);
            ArrayList arrayList = new ArrayList(C6565s.y(m10, 10));
            for (i extractedContent : m10) {
                arrayList.add(getExtractedContent(extractedContent));
            }
            d10 = arrayList;
        } else if (!(iVar instanceof v)) {
            return null;
        } else {
            Iterable<Map.Entry> entrySet = j.n(iVar).entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(entrySet, 10)), 16));
            for (Map.Entry entry : entrySet) {
                Pair a10 = C6502A.a(entry.getKey(), getExtractedContent((i) entry.getValue()));
                linkedHashMap.put(a10.c(), a10.d());
            }
            return linkedHashMap;
        }
        return d10;
    }
}

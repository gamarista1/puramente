package com.revenuecat.purchases.hybridcommon.mappers;

import Ef.m;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.EntitlementInfos;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;
import mf.O;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"map", "", "", "", "Lcom/revenuecat/purchases/EntitlementInfos;", "hybridcommon_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class EntitlementInfosMapperKt {
    public static final Map<String, Object> map(EntitlementInfos entitlementInfos) {
        C6496s.h(entitlementInfos, "<this>");
        Iterable<Map.Entry> entrySet = entitlementInfos.getAll().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            Pair a10 = C6502A.a(entry.getKey(), EntitlementInfoMapperKt.map((EntitlementInfo) entry.getValue()));
            linkedHashMap.put(a10.c(), a10.d());
        }
        Pair a11 = C6502A.a("all", linkedHashMap);
        Iterable<Map.Entry> entrySet2 = entitlementInfos.getActive().entrySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m.d(O.e(C6565s.y(entrySet2, 10)), 16));
        for (Map.Entry entry2 : entrySet2) {
            Pair a12 = C6502A.a(entry2.getKey(), EntitlementInfoMapperKt.map((EntitlementInfo) entry2.getValue()));
            linkedHashMap2.put(a12.c(), a12.d());
        }
        return O.l(a11, C6502A.a(AppStateModule.APP_STATE_ACTIVE, linkedHashMap2), C6502A.a("verification", entitlementInfos.getVerification().name()));
    }
}

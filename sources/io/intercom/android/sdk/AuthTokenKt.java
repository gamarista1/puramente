package io.intercom.android.sdk;

import Ef.m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;
import mf.O;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¨\u0006\u0005"}, d2 = {"toMap", "", "", "", "Lio/intercom/android/sdk/AuthToken;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AuthTokenKt {
    public static final Map<String, String> toMap(List<AuthToken> list) {
        C6496s.h(list, "<this>");
        Iterable<AuthToken> iterable = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(iterable, 10)), 16));
        for (AuthToken authToken : iterable) {
            Pair a10 = C6502A.a(authToken.getName(), authToken.getToken());
            linkedHashMap.put(a10.c(), a10.d());
        }
        return linkedHashMap;
    }
}

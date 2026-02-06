package com.bugsnag.android;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class F1 {
    public void a(Map map, B1 b12) {
        map.put("id", b12.b());
        map.put("name", b12.c());
        String lowerCase = b12.f().toString().toLowerCase(Locale.ROOT);
        C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        map.put("type", lowerCase);
        map.put("errorReportingThread", Boolean.valueOf(b12.a()));
        map.put("state", b12.e().c());
        Iterable<s1> d10 = b12.d();
        ArrayList arrayList = new ArrayList(C6565s.y(d10, 10));
        for (s1 s1Var : d10) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("method", s1Var.f());
            linkedHashMap.put("lineNumber", s1Var.d());
            linkedHashMap.put("file", s1Var.a());
            linkedHashMap.put("inProject", s1Var.c());
            arrayList.add(linkedHashMap);
        }
        map.put("stacktrace", arrayList);
    }
}

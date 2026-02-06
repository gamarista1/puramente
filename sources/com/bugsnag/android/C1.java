package com.bugsnag.android;

import com.bugsnag.android.B1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

class C1 {

    /* renamed from: a  reason: collision with root package name */
    private final t1 f38423a;

    /* renamed from: b  reason: collision with root package name */
    private final S0 f38424b;

    C1(t1 t1Var, S0 s02) {
        this.f38423a = t1Var;
        this.f38424b = s02;
    }

    public B1 a(Map map) {
        boolean booleanValue;
        String str = (String) U0.d(map, "type");
        List<Map> list = (List) U0.d(map, "stacktrace");
        ArrayList arrayList = new ArrayList(list.size());
        for (Map a10 : list) {
            arrayList.add(this.f38423a.a(a10));
        }
        Boolean bool = (Boolean) U0.c(map, "errorReportingThread");
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        return new B1(U0.d(map, "id").toString(), (String) U0.d(map, "name"), ErrorType.valueOf(str.toUpperCase(Locale.US)), booleanValue, B1.b.a((String) U0.d(map, "state")), new u1(arrayList), this.f38424b);
    }
}

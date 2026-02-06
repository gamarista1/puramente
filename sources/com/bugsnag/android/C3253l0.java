package com.bugsnag.android;

import com.amazon.a.a.o.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.bugsnag.android.l0  reason: case insensitive filesystem */
class C3253l0 {

    /* renamed from: a  reason: collision with root package name */
    private final t1 f38757a;

    /* renamed from: b  reason: collision with root package name */
    private final S0 f38758b;

    C3253l0(t1 t1Var, S0 s02) {
        this.f38757a = t1Var;
        this.f38758b = s02;
    }

    public C3250k0 a(Map map) {
        String str = (String) U0.d(map, "type");
        List<Map> list = (List) U0.d(map, "stacktrace");
        ArrayList arrayList = new ArrayList(list.size());
        for (Map a10 : list) {
            arrayList.add(this.f38757a.a(a10));
        }
        return new C3250k0(new C3256m0((String) U0.d(map, "errorClass"), (String) U0.c(map, b.f37483f), new u1(arrayList), ErrorType.valueOf(str.toUpperCase(Locale.US))), this.f38758b);
    }
}

package com.bugsnag.android;

import K4.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.bugsnag.android.a1  reason: case insensitive filesystem */
class C3221a1 {

    /* renamed from: a  reason: collision with root package name */
    private final Collection f38647a;

    /* renamed from: b  reason: collision with root package name */
    private final k f38648b;

    C3221a1(Collection collection, k kVar) {
        this.f38647a = collection;
        this.f38648b = kVar;
    }

    private s1 b(Map map, Collection collection) {
        String str = (String) U0.c(map, "methodName");
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = (String) U0.c(map, "class");
        String str4 = str3 + "." + str;
        if (str3 != null) {
            str2 = str3;
            str = str4;
        }
        s1 s1Var = new s1(str, (String) U0.c(map, "file"), (Number) U0.c(map, "lineNumber"), u1.f38899b.a(str2, collection));
        s1Var.i(ErrorType.ANDROID);
        return s1Var;
    }

    public List a(Map map) {
        List<Map> list = (List) U0.d(map, "nativeStack");
        ArrayList arrayList = new ArrayList(list.size());
        for (Map b10 : list) {
            arrayList.add(b(b10, this.f38647a));
        }
        return new u1(arrayList).a();
    }
}

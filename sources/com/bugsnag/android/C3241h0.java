package com.bugsnag.android;

import K4.g;
import com.amazon.a.a.h.a;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;

/* renamed from: com.bugsnag.android.h0  reason: case insensitive filesystem */
public final class C3241h0 {
    public void a(Map map, C3244i0 i0Var) {
        List list;
        String[] a10 = i0Var.a();
        if (a10 == null) {
            list = null;
        } else {
            list = C6559l.n1(a10);
        }
        map.put("cpuAbi", list);
        map.put("jailbroken", i0Var.c());
        map.put("id", i0Var.b());
        map.put("locale", i0Var.d());
        map.put("manufacturer", i0Var.e());
        map.put("model", i0Var.f());
        map.put("osName", i0Var.g());
        map.put("osVersion", i0Var.h());
        map.put("totalMemory", i0Var.j());
        map.put("freeDisk", i0Var.m());
        map.put("freeMemory", i0Var.n());
        map.put("orientation", i0Var.o());
        if (i0Var.p() != null) {
            Date p10 = i0Var.p();
            C6496s.e(p10);
            map.put(a.f37179b, g.c(p10));
        }
        map.put("runtimeVersions", i0Var.i());
    }
}

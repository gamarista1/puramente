package com.bugsnag.android;

import K4.g;
import com.amazon.a.a.h.a;
import java.util.Date;
import java.util.Map;

/* renamed from: com.bugsnag.android.c0  reason: case insensitive filesystem */
class C3226c0 {
    C3226c0() {
    }

    public C3244i0 a(Map map) {
        Date date;
        X x10 = new X((String) U0.c(map, "manufacturer"), (String) U0.c(map, "model"), (String) U0.c(map, "osVersion"), U0.a(map, "apiLevel"), (String) U0.c(map, "osBuild"), (String) U0.c(map, "fingerprint"), (String) U0.c(map, "tags"), (String) U0.c(map, "brand"), (String[]) U0.c(map, "cpuAbis"));
        String str = (String) U0.c(map, a.f37179b);
        if (str != null) {
            date = g.a(str);
        } else {
            date = null;
        }
        return new C3244i0(x10, (Boolean) U0.c(map, "jailbroken"), (String) U0.c(map, "id"), (String) U0.c(map, "locale"), U0.b(map, "totalMemory"), (Map) U0.c(map, "runtimeVersions"), U0.b(map, "freeDisk"), U0.b(map, "freeMemory"), (String) U0.c(map, "orientation"), date);
    }
}

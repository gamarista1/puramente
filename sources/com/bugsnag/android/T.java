package com.bugsnag.android;

import K4.g;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import lf.C6502A;
import mf.C6565s;
import mf.O;

public abstract class T {
    public static final Map a(C3271s0 s0Var) {
        Pair a10 = C6502A.a("Bugsnag-Payload-Version", "4.0");
        String c10 = s0Var.c();
        if (c10 == null) {
            c10 = "";
        }
        Map n10 = O.n(a10, C6502A.a("Bugsnag-Api-Key", c10), C6502A.a("Bugsnag-Sent-At", g.c(new Date())), C6502A.a("Content-Type", "application/json"));
        Set d10 = s0Var.d();
        if (!d10.isEmpty()) {
            n10.put("Bugsnag-Stacktrace-Types", b(d10));
        }
        return O.y(n10);
    }

    public static final String b(Set set) {
        if (set.isEmpty()) {
            return "";
        }
        Iterable<ErrorType> iterable = set;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (ErrorType desc$bugsnag_android_core_release : iterable) {
            arrayList.add(desc$bugsnag_android_core_release.getDesc$bugsnag_android_core_release());
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            String str = it.next();
            while (it.hasNext()) {
                str = ((String) str) + ',' + ((String) it.next());
            }
            return (String) str;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public static final Map c(String str) {
        return O.l(C6502A.a("Bugsnag-Payload-Version", "1.0"), C6502A.a("Bugsnag-Api-Key", str), C6502A.a("Content-Type", "application/json"), C6502A.a("Bugsnag-Sent-At", g.c(new Date())));
    }
}

package com.bugsnag.android;

import java.util.LinkedHashSet;
import java.util.List;
import mf.C6565s;

public abstract class H1 {
    public static final List a(Throwable th2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (th2 != null && linkedHashSet.add(th2)) {
            th2 = th2.getCause();
        }
        return C6565s.e1(linkedHashSet);
    }
}

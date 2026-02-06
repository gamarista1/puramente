package com.horcrux.svg;

import com.adjust.sdk.Constants;
import java.util.HashMap;
import java.util.Map;

enum e0 {
    f58915b(Constants.NORMAL),
    Bold("bold"),
    w100("100"),
    w200("200"),
    w300("300"),
    w400("400"),
    w500("500"),
    w600("600"),
    w700("700"),
    w800("800"),
    w900("900"),
    Bolder("bolder"),
    Lighter("lighter");
    

    /* renamed from: o  reason: collision with root package name */
    private static final Map f58928o = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f58930a;

    static {
        int i10;
        f58928o = new HashMap();
        for (e0 e0Var : values()) {
            f58928o.put(e0Var.f58930a, e0Var);
        }
    }

    private e0(String str) {
        this.f58930a = str;
    }

    static e0 b(String str) {
        return (e0) f58928o.get(str);
    }

    static boolean c(String str) {
        return f58928o.containsKey(str);
    }

    public String toString() {
        return this.f58930a;
    }
}

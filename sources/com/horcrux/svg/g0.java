package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

enum g0 {
    None("none"),
    Underline("underline"),
    Overline("overline"),
    LineThrough("line-through"),
    Blink("blink");
    

    /* renamed from: g  reason: collision with root package name */
    private static final Map f58946g = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f58948a;

    static {
        int i10;
        f58946g = new HashMap();
        for (g0 g0Var : values()) {
            f58946g.put(g0Var.f58948a, g0Var);
        }
    }

    private g0(String str) {
        this.f58948a = str;
    }

    static g0 b(String str) {
        Map map = f58946g;
        if (map.containsKey(str)) {
            return (g0) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    public String toString() {
        return this.f58948a;
    }
}

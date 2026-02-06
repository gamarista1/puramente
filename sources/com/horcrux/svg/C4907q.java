package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.q  reason: case insensitive filesystem */
enum C4907q {
    UNKNOWN("unknown"),
    DUPLICATE("duplicate"),
    WRAP("wrap"),
    NONE("none");
    

    /* renamed from: f  reason: collision with root package name */
    private static final Map f59009f = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f59011a;

    static {
        int i10;
        f59009f = new HashMap();
        for (C4907q qVar : values()) {
            f59009f.put(qVar.f59011a, qVar);
        }
    }

    private C4907q(String str) {
        this.f59011a = str;
    }

    static C4907q b(String str) {
        Map map = f59009f;
        if (map.containsKey(str)) {
            return (C4907q) map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'edgeMode' Value: " + str);
    }

    public String toString() {
        return this.f59011a;
    }
}

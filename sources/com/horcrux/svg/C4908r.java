package com.horcrux.svg;

import com.adjust.sdk.Constants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.r  reason: case insensitive filesystem */
enum C4908r {
    UNKNOWN("unknown"),
    NORMAL(Constants.NORMAL),
    MULTIPLY("multiply"),
    SCREEN("screen"),
    DARKEN("darken"),
    LIGHTEN("lighten");
    

    /* renamed from: h  reason: collision with root package name */
    private static final Map f59018h = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f59020a;

    static {
        int i10;
        f59018h = new HashMap();
        for (C4908r rVar : values()) {
            f59018h.put(rVar.f59020a, rVar);
        }
    }

    private C4908r(String str) {
        this.f59020a = str;
    }

    static C4908r b(String str) {
        Map map = f59018h;
        if (map.containsKey(str)) {
            return (C4908r) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    public String toString() {
        return this.f59020a;
    }
}

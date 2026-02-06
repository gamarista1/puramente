package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.t  reason: case insensitive filesystem */
enum C4910t {
    OBJECT_BOUNDING_BOX("objectBoundingBox"),
    USER_SPACE_ON_USE("userSpaceOnUse");
    

    /* renamed from: d  reason: collision with root package name */
    private static final Map f59030d = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f59032a;

    static {
        int i10;
        f59030d = new HashMap();
        for (C4910t tVar : values()) {
            f59030d.put(tVar.f59032a, tVar);
        }
    }

    private C4910t(String str) {
        this.f59032a = str;
    }

    static C4910t b(String str) {
        Map map = f59030d;
        if (map.containsKey(str)) {
            return (C4910t) map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'Unit' Value: " + str);
    }

    public String toString() {
        return this.f59032a;
    }
}

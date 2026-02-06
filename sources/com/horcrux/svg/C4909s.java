package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.s  reason: case insensitive filesystem */
enum C4909s {
    MATRIX("matrix"),
    SATURATE("saturate"),
    HUE_ROTATE("hueRotate"),
    LUMINANCE_TO_ALPHA("luminanceToAlpha");
    

    /* renamed from: f  reason: collision with root package name */
    private static final Map f59025f = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f59027a;

    static {
        int i10;
        f59025f = new HashMap();
        for (C4909s sVar : values()) {
            f59025f.put(sVar.f59027a, sVar);
        }
    }

    private C4909s(String str) {
        this.f59027a = str;
    }

    static C4909s b(String str) {
        Map map = f59025f;
        if (map.containsKey(str)) {
            return (C4909s) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    public String toString() {
        return this.f59027a;
    }
}

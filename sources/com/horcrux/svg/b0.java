package com.horcrux.svg;

import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.util.HashMap;
import java.util.Map;

enum b0 {
    baseline("baseline"),
    textBottom("text-bottom"),
    alphabetic("alphabetic"),
    ideographic("ideographic"),
    middle("middle"),
    central("central"),
    mathematical("mathematical"),
    textTop("text-top"),
    bottom(VerticalAlignment.BOTTOM),
    center("center"),
    top(VerticalAlignment.TOP),
    textBeforeEdge("text-before-edge"),
    textAfterEdge("text-after-edge"),
    beforeEdge("before-edge"),
    afterEdge("after-edge"),
    hanging("hanging");
    

    /* renamed from: r  reason: collision with root package name */
    private static final Map f58905r = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f58907a;

    static {
        int i10;
        f58905r = new HashMap();
        for (b0 b0Var : values()) {
            f58905r.put(b0Var.f58907a, b0Var);
        }
    }

    private b0(String str) {
        this.f58907a = str;
    }

    static b0 b(String str) {
        Map map = f58905r;
        if (map.containsKey(str)) {
            return (b0) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    public String toString() {
        return this.f58907a;
    }
}

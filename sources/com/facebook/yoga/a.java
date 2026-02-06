package com.facebook.yoga;

public enum a {
    AUTO(0),
    FLEX_START(1),
    CENTER(2),
    FLEX_END(3),
    STRETCH(4),
    BASELINE(5),
    SPACE_BETWEEN(6),
    SPACE_AROUND(7),
    SPACE_EVENLY(8);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f42624a;

    private a(int i10) {
        this.f42624a = i10;
    }

    public int b() {
        return this.f42624a;
    }
}

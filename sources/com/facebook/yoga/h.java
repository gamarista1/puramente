package com.facebook.yoga;

public enum h {
    INHERIT(0),
    LTR(1),
    RTL(2);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f42630a;

    private h(int i10) {
        this.f42630a = i10;
    }

    public static h b(int i10) {
        if (i10 == 0) {
            return INHERIT;
        }
        if (i10 == 1) {
            return LTR;
        }
        if (i10 == 2) {
            return RTL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i10);
    }

    public int c() {
        return this.f42630a;
    }
}

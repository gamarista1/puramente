package com.facebook.yoga;

import A8.a;

@a
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f42598a;

    private YogaLogLevel(int i10) {
        this.f42598a = i10;
    }

    @a
    public static YogaLogLevel fromInt(int i10) {
        if (i10 == 0) {
            return ERROR;
        }
        if (i10 == 1) {
            return WARN;
        }
        if (i10 == 2) {
            return INFO;
        }
        if (i10 == 3) {
            return DEBUG;
        }
        if (i10 == 4) {
            return VERBOSE;
        }
        if (i10 == 5) {
            return FATAL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i10);
    }
}

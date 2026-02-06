package com.facebook.yoga;

import com.google.android.gms.common.api.a;

public enum k {
    NONE(0),
    STRETCH_FLEX_BASIS(1),
    ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING(2),
    ABSOLUTE_PERCENT_AGAINST_INNER_SIZE(4),
    ALL(a.e.API_PRIORITY_OTHER),
    CLASSIC(2147483646);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f42654a;

    private k(int i10) {
        this.f42654a = i10;
    }

    public int b() {
        return this.f42654a;
    }
}

package com.google.common.collect;

import java.util.Comparator;

/* renamed from: com.google.common.collect.p  reason: case insensitive filesystem */
class C4765p extends C4774z {

    /* renamed from: i  reason: collision with root package name */
    static final C4765p f56739i = new C4765p();
    private static final long serialVersionUID = 0;

    private C4765p() {
        super(C4771w.n(), 0, (Comparator) null);
    }

    private Object readResolve() {
        return f56739i;
    }

    /* renamed from: k */
    public C4771w asMap() {
        return super.asMap();
    }
}

package com.google.common.collect;

import java.io.Serializable;

/* renamed from: com.google.common.collect.u  reason: case insensitive filesystem */
class C4769u extends C4754e implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a  reason: collision with root package name */
    final Object f56744a;

    /* renamed from: b  reason: collision with root package name */
    final Object f56745b;

    C4769u(Object obj, Object obj2) {
        this.f56744a = obj;
        this.f56745b = obj2;
    }

    public final Object getKey() {
        return this.f56744a;
    }

    public final Object getValue() {
        return this.f56745b;
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}

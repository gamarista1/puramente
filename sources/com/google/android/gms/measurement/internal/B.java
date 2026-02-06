package com.google.android.gms.measurement.internal;

import java.util.Iterator;

final class B implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    private Iterator f54453a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C f54454b;

    B(C c10) {
        this.f54454b = c10;
        this.f54453a = c10.f54472a.keySet().iterator();
    }

    public final boolean hasNext() {
        return this.f54453a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f54453a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}

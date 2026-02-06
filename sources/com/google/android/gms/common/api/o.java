package com.google.android.gms.common.api;

import ya.C5286c;

public final class o extends UnsupportedOperationException {

    /* renamed from: a  reason: collision with root package name */
    private final C5286c f54098a;

    public o(C5286c cVar) {
        this.f54098a = cVar;
    }

    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f54098a));
    }
}

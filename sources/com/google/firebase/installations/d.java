package com.google.firebase.installations;

import ub.m;

public class d extends m {

    /* renamed from: a  reason: collision with root package name */
    private final a f57372a;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public d(a aVar) {
        this.f57372a = aVar;
    }

    public d(String str, a aVar) {
        super(str);
        this.f57372a = aVar;
    }
}

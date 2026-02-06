package com.facebook.react.runtime;

import java.util.concurrent.Callable;

/* renamed from: com.facebook.react.runtime.g  reason: case insensitive filesystem */
public final /* synthetic */ class C3378g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f41306a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f41307b;

    public /* synthetic */ C3378g(ReactHostImpl reactHostImpl, String str) {
        this.f41306a = reactHostImpl;
        this.f41307b = str;
    }

    public final Object call() {
        return this.f41306a.u1(this.f41307b);
    }
}

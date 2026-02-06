package com.facebook.react.runtime;

import java.util.concurrent.Callable;

public final /* synthetic */ class N implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f41199a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f41200b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Exception f41201c;

    public /* synthetic */ N(ReactHostImpl reactHostImpl, String str, Exception exc) {
        this.f41199a = reactHostImpl;
        this.f41200b = str;
        this.f41201c = exc;
    }

    public final Object call() {
        return this.f41199a.T0(this.f41200b, this.f41201c);
    }
}

package com.facebook.react.runtime;

import b8.C3159a;
import b8.d;

public final /* synthetic */ class V implements C3159a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f41269a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f41270b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Exception f41271c;

    public /* synthetic */ V(ReactHostImpl reactHostImpl, String str, Exception exc) {
        this.f41269a = reactHostImpl;
        this.f41270b = str;
        this.f41271c = exc;
    }

    public final Object a(d dVar) {
        return this.f41269a.S0(this.f41270b, this.f41271c, dVar);
    }
}

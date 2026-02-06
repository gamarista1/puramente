package com.margelo.nitro.core;

import com.margelo.nitro.core.Promise;
import yf.C6798l;

public final /* synthetic */ class c implements Promise.OnResolvedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6798l f59150a;

    public /* synthetic */ c(C6798l lVar) {
        this.f59150a = lVar;
    }

    public final void onResolved(Object obj) {
        Promise.then$lambda$0(this.f59150a, obj);
    }
}
